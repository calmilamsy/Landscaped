package net.glasslauncher.mods.landscaped.mixin;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import com.llamalad7.mixinextras.sugar.Local;
import net.glasslauncher.mods.landscaped.registries.TreeRegistry;
import net.glasslauncher.mods.landscaped.registries.TreeRegistryEntry;
import net.glasslauncher.mods.landscaped.util.BlankFeature;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.chunk.OverworldChunkGenerator;
import net.minecraft.world.gen.chunk.SkyChunkGenerator;
import net.minecraft.world.gen.feature.Feature;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;
import org.spongepowered.asm.mixin.injection.Redirect;

import java.util.Random;

@Mixin({ OverworldChunkGenerator.class, SkyChunkGenerator.class })
public class ChunkGenMixin {
    @Unique
    private static Random random;

    @Unique
    private static final Feature BLANK_FEATURE = new BlankFeature();

    @WrapOperation(method = "decorate", at = @At(value = "INVOKE", target = "Ljava/util/Random;setSeed(J)V", ordinal = 0))
    private void captureRandom(Random instance, long seed, Operation<Void> original) {
        random = instance;
        original.call(instance, seed);
    }

    @ModifyConstant(method = "decorate", constant = @Constant(intValue = 0, ordinal = 10))
    private int makeDesertsSpawnTrees(int constant, @Local Biome biome, @Local(ordinal = 4) int treeSample) {
        int extraChance = 0;

        if ((biome == Biome.DESERT || biome == Biome.PLAINS || biome == Biome.TUNDRA) && random.nextInt(100) == 0) {
            extraChance += 20 + treeSample;
        }

        return extraChance;
    }

    @Redirect(method = "decorate", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/biome/Biome;getRandomTreeFeature(Ljava/util/Random;)Lnet/minecraft/world/gen/feature/Feature;"))
    public Feature getCustomTree(Biome biome, Random random) {
        TreeRegistryEntry feature = TreeRegistry.INSTANCE.getTree(random, biome);
        return feature == null ? BLANK_FEATURE : feature.getFeature();
    }
}
