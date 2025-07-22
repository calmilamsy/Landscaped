package net.glasslauncher.mods.landscaped.eventlisteners.init;

import net.glasslauncher.mods.landscaped.blocks.LandscapedBlocks;
import net.glasslauncher.mods.landscaped.worldgen.TreeType;
import net.mine_diver.unsafeevents.listener.EventListener;
import net.modificationstation.stationapi.api.event.init.InitFinishedEvent;

public class SaplingInit {

    @EventListener
    public static void init(InitFinishedEvent event) {
        LandscapedBlocks.Sapling.acacia.setTreeType(TreeType.ACACIA);
        LandscapedBlocks.Sapling.balsa.setTreeType(TreeType.BALSA);
        LandscapedBlocks.Sapling.baobab.setTreeType(TreeType.BAOBAB);
        LandscapedBlocks.Sapling.cherry.setTreeType(TreeType.CHERRY);
        LandscapedBlocks.Sapling.chestnut.setTreeType(TreeType.CHESTNUT);
        LandscapedBlocks.Sapling.citrus.setTreeType(TreeType.CITRUS);
        LandscapedBlocks.Sapling.cocobolo.setTreeType(TreeType.COCOBOLO);
        LandscapedBlocks.Sapling.ebony.setTreeType(TreeType.EBONY);
        LandscapedBlocks.Sapling.giganteum.setTreeType(TreeType.GIGANTEUM);
        LandscapedBlocks.Sapling.greenheart.setTreeType(TreeType.GREENHEART);
        LandscapedBlocks.Sapling.ipe.setTreeType(TreeType.IPE);
        LandscapedBlocks.Sapling.ironwood.setTreeType(TreeType.IRONWOOD);
        LandscapedBlocks.Sapling.kapok.setTreeType(TreeType.KAPOK);
        LandscapedBlocks.Sapling.larch.setTreeType(TreeType.LARCH);
        LandscapedBlocks.Sapling.lime.setTreeType(TreeType.LIME);
        LandscapedBlocks.Sapling.mahoe.setTreeType(TreeType.MAHOE);
        LandscapedBlocks.Sapling.mahogany.setTreeType(TreeType.MAHOGANY);
        LandscapedBlocks.Sapling.maple.setTreeType(TreeType.MAPLE);
        LandscapedBlocks.Sapling.padauk.setTreeType(TreeType.PADAUK);
        LandscapedBlocks.Sapling.palm.setTreeType(TreeType.PALM);
        LandscapedBlocks.Sapling.papaya.setTreeType(TreeType.PAPAYA);
        LandscapedBlocks.Sapling.pine.setTreeType(TreeType.PINE);
        LandscapedBlocks.Sapling.plum.setTreeType(TreeType.PLUM);
        LandscapedBlocks.Sapling.poplar.setTreeType(TreeType.POPLAR);
        LandscapedBlocks.Sapling.sequoia.setTreeType(TreeType.SEQUOIA);
        LandscapedBlocks.Sapling.teak.setTreeType(TreeType.TEAK);
        LandscapedBlocks.Sapling.walnut.setTreeType(TreeType.WALNUT);
        LandscapedBlocks.Sapling.wenge.setTreeType(TreeType.WENGE);
        LandscapedBlocks.Sapling.willow.setTreeType(TreeType.WILLOW);
        LandscapedBlocks.Sapling.zebrawood.setTreeType(TreeType.ZEBRAWOOD);
    }
}
