package net.glasslauncher.mods.landscaped.mixin;

import net.glasslauncher.mods.landscaped.eventlisteners.init.TreeGenerationInit;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.chunk.OverworldChunkGenerator;
import net.minecraft.world.gen.chunk.SkyChunkGenerator;
import net.minecraft.world.gen.feature.Feature;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import java.util.List;
import java.util.Random;

@Mixin({ OverworldChunkGenerator.class, SkyChunkGenerator.class })
public class ChunkGenMixin {

    // I would do it inside biome, but it just doesn't work. This is stupid and should never have to be done.
    @Redirect(method = "decorate", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/biome/Biome;getRandomTreeFeature(Ljava/util/Random;)Lnet/minecraft/world/gen/feature/Feature;"))
    public Feature getCustomTree(Biome biome, Random random) {
        List<Feature> customTrees = TreeGenerationInit.BIOME_TO_TREES.get(biome.name);
        if (customTrees != null && random.nextInt(10) == 0) { // Uncommonly hijack a vanilla tree and replace it with a custom one if we have one. Same rarity as big oaks.
            return (customTrees.get(random.nextInt(customTrees.size())));
        }
        return biome.getRandomTreeFeature(random);
    }
}
