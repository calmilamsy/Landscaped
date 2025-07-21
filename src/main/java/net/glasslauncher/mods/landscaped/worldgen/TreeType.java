package net.glasslauncher.mods.landscaped.worldgen;

import com.google.common.collect.ImmutableList;
import net.glasslauncher.mods.landscaped.blocks.LandscapedBlocks;
import net.glasslauncher.mods.landscaped.blocks.LandscapedLeavesBlock;
import net.glasslauncher.mods.landscaped.blocks.LandscapedLogBlock;
import net.glasslauncher.mods.landscaped.blocks.LandscapedSaplingBlock;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.feature.Feature;

import java.util.List;

public enum TreeType {
    ACACIA(LandscapedBlocks.Wood.acacia, LandscapedBlocks.Leaves.acacia, LandscapedBlocks.Sapling.acacia, (t, l) -> new AlternateOakGen(t, l, r -> r.nextInt(3) + 5, (random, layer) -> layer == 0 ? 1 : -layer * 2, r -> 2), () -> List.of(Biome.FOREST)),
    BALSA(LandscapedBlocks.Wood.balsa, LandscapedBlocks.Leaves.balsa, LandscapedBlocks.Sapling.balsa, (t, l) -> new AlternateOakGen(t, l, r -> r.nextInt(2) + 7, (random, layer) -> layer == 0 ? 1 : -(int) Math.floor(layer * 1.5D), r -> 2), () -> List.of(Biome.FOREST)),
    BAOBAB(LandscapedBlocks.Wood.baobab, LandscapedBlocks.Leaves.baobab, LandscapedBlocks.Sapling.baobab, (t, l) -> new ThickOakGen(t, l, r -> r.nextInt(2) + 8, (random, layer) -> layer == 0 ? 1 : -layer + 1, r -> 2, r -> 8 + r.nextInt(1)), () -> List.of(Biome.FOREST)),
    CHERRY(LandscapedBlocks.Wood.cherry, LandscapedBlocks.Leaves.cherry, LandscapedBlocks.Sapling.cherry, (t, l) -> new CherryGen(t, l, r -> r.nextInt(3) + 5, (random, layer) -> layer == 0 ? 1 : -(int) Math.floor(layer * 1.5D), r -> 2, r -> r.nextInt(3), r -> r.nextInt(3), (r, treeHeight) -> treeHeight - 2 - r.nextInt(2)), () -> List.of(Biome.FOREST)),
    CHESTNUT(LandscapedBlocks.Wood.chestnut, LandscapedBlocks.Leaves.chestnut, LandscapedBlocks.Sapling.chestnut, (t, l) -> new AlternateOakGen(t, l, r -> r.nextInt(3) + 4, (random, layer) -> 1 - layer / 2, r -> 3), () -> List.of(Biome.FOREST)),
    CITRUS(LandscapedBlocks.Wood.citrus, LandscapedBlocks.Leaves.citrus, LandscapedBlocks.Sapling.citrus, (t, l) -> new AlternateOakGen(t, l, r -> r.nextInt(3) + 5, (random, layer) -> layer == 0 ? 1 : -(int) Math.floor(layer / 2D), r -> 4), () -> List.of(Biome.FOREST)),
    COCOBOLO(LandscapedBlocks.Wood.cocobolo, LandscapedBlocks.Leaves.cocobolo, LandscapedBlocks.Sapling.cocobolo, (t, l) -> new AlternateOakGen(t, l, r -> r.nextInt(3) + 7, (random, layer) -> 1, r -> 4 + r.nextInt(3)), () -> List.of(Biome.FOREST)),
    EBONY(LandscapedBlocks.Wood.ebony, LandscapedBlocks.Leaves.ebony, LandscapedBlocks.Sapling.ebony, (t, l) -> new AlternateOakGen(t, l, r -> r.nextInt(3) + 4, (random, layer) -> 1 - layer / 2, r -> 3), () -> List.of(Biome.FOREST)),
    GIGANTEUM(LandscapedBlocks.Wood.giganteum, LandscapedBlocks.Leaves.giganteum, LandscapedBlocks.Sapling.giganteum, (t, l) -> new ThickOakGen(t, l, r -> r.nextInt(8) + 20, (random, layer) -> layer == 0 ? 2 : 2 + random.nextInt(2), r -> r.nextInt(2) + 6, r -> 19 + r.nextInt(2)), () -> List.of(Biome.FOREST)),
    GREENHEART(LandscapedBlocks.Wood.greenheart, LandscapedBlocks.Leaves.greenheart, LandscapedBlocks.Sapling.greenheart, (t, l) -> new AlternateOakGen(t, l, r -> r.nextInt(3) + 4, (random, layer) -> 1 - layer / 2, r -> 3), () -> List.of(Biome.FOREST)),
    IPE(LandscapedBlocks.Wood.ipe, LandscapedBlocks.Leaves.ipe, LandscapedBlocks.Sapling.ipe, (t, l) -> new AlternateOakGen(t, l, r -> r.nextInt(3) + 6, (random, layer) -> 2 -layer / 2, r -> 3), () -> List.of(Biome.FOREST)),
    //REDWOOD(LandscapedBlocks.Wood.redwood, LandscapedBlocks.Leaves., (LandscapedBlocksSaplingWood.redwood (t, l) -> new ConifersGen(t, l, r -> 20 + r.nextInt(8), r -> 2, r -> r.nextInt(2) + 2, r -> r.nextInt(3), r -> 2, r -> 0, r -> 1, r > () -> 1), List.of(Biome.FOREST)),
    KAPOK(LandscapedBlocks.Wood.kapok, LandscapedBlocks.Leaves.kapok, LandscapedBlocks.Sapling.kapok, (t, l) -> new AlternateOakGen(t, l, r -> r.nextInt(2) + 8, (random, layer) -> layer == 0 ? 1 : -layer + 1, r -> 2), () -> List.of(Biome.FOREST)),
    LARCH(LandscapedBlocks.Wood.larch, LandscapedBlocks.Leaves.larch, LandscapedBlocks.Sapling.larch, (t, l) -> new ConifersGen(t, l, r -> 6 + r.nextInt(2), r -> 2, r -> r.nextInt(2) + 1, r -> r.nextInt(3), r -> 0, r -> 0, r -> 1, r -> 1), () -> List.of(Biome.TAIGA)),
    LIME(LandscapedBlocks.Wood.lime, LandscapedBlocks.Leaves.lime, LandscapedBlocks.Sapling.lime, (t, l) -> new AlternateOakGen(t, l, r -> r.nextInt(3) + 5, (random, layer) -> layer == 0 ? 1 : -(int) Math.floor(layer / 2D), r -> 4), () -> List.of(Biome.FOREST)),
    MAHOE(LandscapedBlocks.Wood.mahoe, LandscapedBlocks.Leaves.mahoe, LandscapedBlocks.Sapling.mahoe, (t, l) -> new AlternateOakGen(t, l, r -> r.nextInt(3) + 5, (random, layer) -> layer == 0 ? 1 : -(int) Math.floor(layer / 2D), r -> 4), () -> List.of(Biome.FOREST)),
    MAHOGANY(LandscapedBlocks.Wood.mahogany, LandscapedBlocks.Leaves.mahogany, LandscapedBlocks.Sapling.mahogany, (t, l) -> new AlternateOakGen(t, l, r -> r.nextInt(3) + 6, (random, layer) -> 2 -layer / 2, r -> 3), () -> List.of(Biome.FOREST)),
    MAPLE(LandscapedBlocks.Wood.maple, LandscapedBlocks.Leaves.maple, LandscapedBlocks.Sapling.maple, (t, l) -> new AlternateOakGen(t, l, r -> r.nextInt(3) + 5, (random, layer) -> 2 -layer / 2, r -> 3), () -> List.of(Biome.FOREST)),
    PADAUK(LandscapedBlocks.Wood.padauk, LandscapedBlocks.Leaves.padauk, LandscapedBlocks.Sapling.padauk, (t, l) -> new AlternateOakGen(t, l, r -> r.nextInt(3) + 5, (random, layer) -> 2 -layer / 2, r -> 3), () -> List.of(Biome.FOREST)),
    PALM(LandscapedBlocks.Wood.palm, LandscapedBlocks.Leaves.palm, LandscapedBlocks.Sapling.palm, (t, l) -> new AlternateOakGen(t, l, r -> r.nextInt(3) + 5, (random, layer) -> 3 + layer, r -> 2), () -> List.of(Biome.FOREST)),
    PAPAYA(LandscapedBlocks.Wood.palm, LandscapedBlocks.Leaves.palm, LandscapedBlocks.Sapling.palm, (t, l) -> new AlternateOakGen(t, l, r -> r.nextInt(3) + 5, (random, layer) -> layer == 0 ? 1 : layer == -1 ? 2 : 1, r -> 2), () -> List.of(Biome.FOREST)),

    PINE(LandscapedBlocks.Wood.larch, LandscapedBlocks.Leaves.larch, LandscapedBlocks.Sapling.larch, (t, l) -> new ConifersGen(t, l, r -> 6 + r.nextInt(2), r -> 2, r -> r.nextInt(2) + 1, r -> r.nextInt(3), r -> 0, r -> 0, r -> 1, r -> 1), () -> List.of(Biome.TAIGA)),
    PLUM(LandscapedBlocks.Wood.plum, LandscapedBlocks.Leaves.plum, LandscapedBlocks.Sapling.plum, (t, l) -> new AlternateOakGen(t, l, r -> r.nextInt(3) + 4, (random, layer) -> 1 - layer / 2, r -> 3), () -> List.of(Biome.FOREST)),
    POPLAR(LandscapedBlocks.Wood.poplar, LandscapedBlocks.Leaves.poplar, LandscapedBlocks.Sapling.poplar, (t, l) -> new AlternateOakGen(t, l, r -> r.nextInt(4) + 9, (random, layer) -> 1, r -> 4 + r.nextInt(3)), () -> List.of(Biome.FOREST)),
    SEQUOIA(LandscapedBlocks.Wood.sequoia, LandscapedBlocks.Leaves.sequoia, LandscapedBlocks.Sapling.sequoia, (t, l) -> new ThickOakGen(t, l, r -> r.nextInt(5) + 12, (random, layer) -> layer == 0 ? 2 : 2 + random.nextInt(2), r -> r.nextInt(2) + 6, r -> 11 + r.nextInt(2)), () -> List.of(Biome.FOREST)),
    TEAK(LandscapedBlocks.Wood.teak, LandscapedBlocks.Leaves.teak, LandscapedBlocks.Sapling.teak, (t, l) -> new AlternateOakGen(t, l, r -> r.nextInt(3) + 7, (random, layer) -> layer == 0 ? 1 : -(int) Math.floor(layer / 2D), r -> 4), () -> List.of(Biome.FOREST)),
    WALNUT(LandscapedBlocks.Wood.walnut, LandscapedBlocks.Leaves.walnut, LandscapedBlocks.Sapling.walnut, (t, l) -> new AlternateOakGen(t, l, r -> r.nextInt(3) + 4, (random, layer) -> 2 -layer / 2, r -> 3), () -> List.of(Biome.FOREST)),
    WENGE(LandscapedBlocks.Wood.wenge, LandscapedBlocks.Leaves.wenge, LandscapedBlocks.Sapling.wenge, (t, l) -> new AlternateOakGen(t, l, r -> r.nextInt(3) + 4, (random, layer) -> 1 - layer / 2, r -> 3), () -> List.of(Biome.FOREST)),
    WILLOW(LandscapedBlocks.Wood.willow, LandscapedBlocks.Leaves.willow, LandscapedBlocks.Sapling.willow, (t, l) -> new WillowGen(t, l, r -> r.nextInt(3) + 5, (random, layer) -> 2 -layer / 2, r -> 3, r -> r.nextInt(3)), () -> List.of(Biome.FOREST)),
    ZEBRAWOOD(LandscapedBlocks.Wood.zebrawood, LandscapedBlocks.Leaves.zebrawood, LandscapedBlocks.Sapling.zebrawood, (t, l) -> new CherryGen(t, l, r -> r.nextInt(6) + 8, (random, layer) -> 2 -layer / 2, r -> 3, r -> r.nextInt(4) + 2, r -> r.nextInt(2) + 2, (r, treeHeight) -> treeHeight - 2 - r.nextInt(4)), () -> List.of(Biome.FOREST)),
    ;

    public final LandscapedLogBlock trunk;
    public final LandscapedLeavesBlock leaves;
    public final LandscapedSaplingBlock sapling;
    public final BiomeProvider biomeProvider;
    public final Feature feature;

    @FunctionalInterface
    public interface BiomeProvider {
        List<Biome> getBiomes();
    }

    TreeType(LandscapedLogBlock trunk, LandscapedLeavesBlock leaves, LandscapedSaplingBlock sapling, TreeFeatureProvider treeFeatureProvider, BiomeProvider biomes) {
        this.trunk = trunk;
        this.leaves = leaves;
        this.sapling = sapling;
        this.biomeProvider = biomes;
        feature = treeFeatureProvider.provide(trunk, leaves);
    }

    public interface TreeFeatureProvider {
        Feature provide(LandscapedLogBlock t, LandscapedLeavesBlock l);
    }
}
