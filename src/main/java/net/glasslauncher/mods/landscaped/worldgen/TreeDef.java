package net.glasslauncher.mods.landscaped.worldgen;

import com.google.common.collect.ImmutableList;
import net.glasslauncher.mods.landscaped.blocks.LandscapedBlocks;
import net.glasslauncher.mods.landscaped.blocks.LandscapedLeavesBlock;
import net.glasslauncher.mods.landscaped.blocks.LandscapedLogBlock;
import net.glasslauncher.mods.landscaped.util.RandomIntProvider;
import net.minecraft.block.Block;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.feature.Feature;

import java.util.List;

public enum TreeDef {

    LARCH(LandscapedBlocks.Wood.larch, LandscapedBlocks.Leaves.larch, (t, l) -> new ConifersGen(t, l, r -> 6 + r.nextInt(2), r -> 2, r -> r.nextInt(2) + 1, r -> r.nextInt(3), r -> 0, r -> 0, r -> 1, r -> 1), List.of(Biome.TAIGA)),
    LIME(LandscapedBlocks.Wood.lime, LandscapedBlocks.Leaves.lime, ((t, l) -> new AlternateOakGen(t, l, r -> r.nextInt(3) + 5, (random, layer) -> layer == 0 ? 1 : -(int) Math.floor(layer / 2D), r -> 4)), List.of(Biome.FOREST)),
    ACACIA(LandscapedBlocks.Wood.acacia, LandscapedBlocks.Leaves.acacia, ((t, l) -> new AlternateOakGen(t, l, r -> r.nextInt(3) + 5, (random, layer) -> layer == 0 ? 1 : -layer * 2 + random.nextInt(1), r -> 2)), List.of(Biome.FOREST)),
    BALSA(LandscapedBlocks.Wood.balsa, LandscapedBlocks.Leaves.balsa, ((t, l) -> new AlternateOakGen(t, l, r -> r.nextInt(2) + 7, (random, layer) -> layer == 0 ? 1 : -(int) Math.floor(layer * 1.5D) + random.nextInt(1), r -> 2)), List.of(Biome.FOREST)),
    BAOBAB(LandscapedBlocks.Wood.baobab, LandscapedBlocks.Leaves.baobab, ((t, l) -> new ThickOakGen(t, l, r -> r.nextInt(2) + 8, (random, layer) -> layer == 0 ? 1 : -layer + 1 + random.nextInt(1), r -> 2, r -> 8 + r.nextInt(1))), List.of(Biome.FOREST)),

    ;

    public final LandscapedLogBlock trunk;
    public final LandscapedLeavesBlock leaves;
    public final ImmutableList<Biome> biomes;
    public final Feature feature;

    TreeDef(LandscapedLogBlock trunk, LandscapedLeavesBlock leaves, TreeFeatureProvider treeFeatureProvider, List<Biome> biomes) {
        this.trunk = trunk;
        this.leaves = leaves;
        this.biomes = new ImmutableList.Builder<Biome>().addAll(biomes).build();
        feature = treeFeatureProvider.provide(trunk, leaves);
    }

    public interface TreeFeatureProvider {
        Feature provide(LandscapedLogBlock t, LandscapedLeavesBlock l);
    }
}
