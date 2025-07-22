package net.glasslauncher.mods.landscaped.eventlisteners.init;

import net.glasslauncher.mods.landscaped.blocks.*;
import net.glasslauncher.mods.landscaped.worldgen.TreeType;
import net.mine_diver.unsafeevents.listener.EventListener;
import net.modificationstation.stationapi.api.event.registry.BlockRegistryEvent;
import net.modificationstation.stationapi.api.mod.entrypoint.EntrypointManager;

import java.awt.*;
import java.lang.invoke.MethodHandles;

import static net.glasslauncher.mods.landscaped.Landscaped.NAMESPACE;

public class BlockInit {
    static {
        EntrypointManager.registerLookup(MethodHandles.lookup());
    }

    @EventListener
    private static void init(BlockRegistryEvent event) {
        LandscapedBlocks.Wood.acacia = new LandscapedLogBlock(NAMESPACE.id("acacia_log"));
        LandscapedBlocks.Wood.balsa = new LandscapedLogBlock(NAMESPACE.id("balsa_log"));
        LandscapedBlocks.Wood.baobab = new LandscapedLogBlock(NAMESPACE.id("baobab_log"));
        LandscapedBlocks.Wood.cherry = new LandscapedLogBlock(NAMESPACE.id("cherry_log"));
        LandscapedBlocks.Wood.chestnut = new LandscapedLogBlock(NAMESPACE.id("chestnut_log"));
        LandscapedBlocks.Wood.citrus = new LandscapedLogBlock(NAMESPACE.id("citrus_log"));
        LandscapedBlocks.Wood.cocobolo = new LandscapedLogBlock(NAMESPACE.id("cocobolo_log"));
        LandscapedBlocks.Wood.ebony = new LandscapedLogBlock(NAMESPACE.id("ebony_log"));
        LandscapedBlocks.Wood.giganteum = new LandscapedLogBlock(NAMESPACE.id("giganteum_log"));
        LandscapedBlocks.Wood.greenheart = new LandscapedLogBlock(NAMESPACE.id("greenheart_log"));
        LandscapedBlocks.Wood.ipe = new LandscapedLogBlock(NAMESPACE.id("ipe_log"));
        LandscapedBlocks.Wood.ironwood = new LandscapedLogBlock(NAMESPACE.id("ironwood_log"));
        LandscapedBlocks.Wood.kapok = new LandscapedLogBlock(NAMESPACE.id("kapok_log"));
        LandscapedBlocks.Wood.larch = new LandscapedLogBlock(NAMESPACE.id("larch_log"));
        LandscapedBlocks.Wood.lime = new LandscapedLogBlock(NAMESPACE.id("lime_log"));
        LandscapedBlocks.Wood.mahoe = new LandscapedLogBlock(NAMESPACE.id("mahoe_log"));
        LandscapedBlocks.Wood.mahogany = new LandscapedLogBlock(NAMESPACE.id("mahogany_log"));
        LandscapedBlocks.Wood.maple = new LandscapedLogBlock(NAMESPACE.id("maple_log"));
        LandscapedBlocks.Wood.padauk = new LandscapedLogBlock(NAMESPACE.id("padauk_log"));
        LandscapedBlocks.Wood.palm = new LandscapedLogBlock(NAMESPACE.id("palm_log"));
        LandscapedBlocks.Wood.papaya = new LandscapedLogBlock(NAMESPACE.id("papaya_log"));
        LandscapedBlocks.Wood.pine = new LandscapedLogBlock(NAMESPACE.id("pine_log"));
        LandscapedBlocks.Wood.plum = new LandscapedLogBlock(NAMESPACE.id("plum_log"));
        LandscapedBlocks.Wood.poplar = new LandscapedLogBlock(NAMESPACE.id("poplar_log"));
        LandscapedBlocks.Wood.sequoia = new LandscapedLogBlock(NAMESPACE.id("sequoia_log"));
        LandscapedBlocks.Wood.teak = new LandscapedLogBlock(NAMESPACE.id("teak_log"));
        LandscapedBlocks.Wood.walnut = new LandscapedLogBlock(NAMESPACE.id("walnut_log"));
        LandscapedBlocks.Wood.wenge = new LandscapedLogBlock(NAMESPACE.id("wenge_log"));
        LandscapedBlocks.Wood.willow = new LandscapedLogBlock(NAMESPACE.id("willow_log"));
        LandscapedBlocks.Wood.zebrawood = new LandscapedLogBlock(NAMESPACE.id("zebrawood_log"));

        LandscapedBlocks.Leaves.acacia = new LandscapedLeavesBlock(NAMESPACE.id("acacia_leaves"), new Color(0x748C1C), () -> TreeType.ACACIA);
        LandscapedBlocks.Leaves.balsa = new LandscapedLeavesBlock(NAMESPACE.id("balsa_leaves"), new Color(0x59ac00), () -> TreeType.BALSA);
        LandscapedBlocks.Leaves.baobab = new LandscapedLeavesBlock(NAMESPACE.id("baobab_leaves"), new Color(0xfeff8f), () -> TreeType.BAOBAB);
        LandscapedBlocks.Leaves.cherry = new LandscapedLeavesBlock(NAMESPACE.id("cherry_leaves"), new Color(0xFF8EE8), () -> TreeType.CHERRY);
        LandscapedBlocks.Leaves.chestnut = new LandscapedLeavesBlock(NAMESPACE.id("chestnut_leaves"), new Color(0x5ea107), () -> TreeType.CHESTNUT);
        LandscapedBlocks.Leaves.citrus = new LandscapedLeavesBlock(NAMESPACE.id("citrus_leaves"), new Color(0x88af54), () -> TreeType.CITRUS);
        LandscapedBlocks.Leaves.cocobolo = new LandscapedLeavesBlock(NAMESPACE.id("cocobolo_leaves"), new Color(0x6aa17a), () -> TreeType.COCOBOLO);
        LandscapedBlocks.Leaves.ebony = new LandscapedLeavesBlock(NAMESPACE.id("ebony_leaves"), new Color(0xa2d24a), () -> TreeType.EBONY);
        LandscapedBlocks.Leaves.giganteum = new LandscapedLeavesBlock(NAMESPACE.id("giganteum_leaves"), new Color(0x738434), () -> TreeType.GIGANTEUM);
        LandscapedBlocks.Leaves.greenheart = new LandscapedLeavesBlock(NAMESPACE.id("greenheart_leaves"), new Color(0x678911), () -> TreeType.GREENHEART);
        LandscapedBlocks.Leaves.ipe = new LandscapedLeavesBlock(NAMESPACE.id("ipe_leaves"), new Color(0xfdd207), () -> TreeType.IPE);
        LandscapedBlocks.Leaves.ironwood = new LandscapedLeavesBlock(NAMESPACE.id("ironwood_leaves"), new Color(0xe691da), () -> TreeType.IRONWOOD);
        LandscapedBlocks.Leaves.kapok = new LandscapedLeavesBlock(NAMESPACE.id("kapok_leaves"), new Color(0x89987b), () -> TreeType.KAPOK);
        LandscapedBlocks.Leaves.larch = new LandscapedLeavesBlock(NAMESPACE.id("larch_leaves"), new Color(0x698f90), () -> TreeType.LARCH);
        LandscapedBlocks.Leaves.lime = new LandscapedLeavesBlock(NAMESPACE.id("lime_leaves"), new Color(0x5ea107), () -> TreeType.LIME);
        LandscapedBlocks.Leaves.mahoe = new LandscapedLeavesBlock(NAMESPACE.id("mahoe_leaves"), new Color(0xa0ba1b), () -> TreeType.MAHOE);
        LandscapedBlocks.Leaves.mahogany = new LandscapedLeavesBlock(NAMESPACE.id("mahogany_leaves"), new Color(0x8ab154), () -> TreeType.MAHOGANY);
        LandscapedBlocks.Leaves.maple = new LandscapedLeavesBlock(NAMESPACE.id("maple_leaves"), new Color(0xd4f425), () -> TreeType.MAPLE);
        LandscapedBlocks.Leaves.padauk = new LandscapedLeavesBlock(NAMESPACE.id("padauk_leaves"), new Color(0xd0df8c), () -> TreeType.PADAUK);
        LandscapedBlocks.Leaves.palm = new LandscapedLeavesBlock(NAMESPACE.id("palm_leaves"), new Color(0xcbcd79), () -> TreeType.PALM);
        LandscapedBlocks.Leaves.papaya = new LandscapedLeavesBlock(NAMESPACE.id("papaya_leaves"), new Color(0x6d9f58), () -> TreeType.PAPAYA);
        LandscapedBlocks.Leaves.pine = new LandscapedLeavesBlock(NAMESPACE.id("pine_leaves"), new Color(0xfeff8f), () -> TreeType.PINE);
        LandscapedBlocks.Leaves.plum = new LandscapedLeavesBlock(NAMESPACE.id("plum_leaves"), new Color(0x589246), () -> TreeType.PLUM);
        LandscapedBlocks.Leaves.poplar = new LandscapedLeavesBlock(NAMESPACE.id("poplar_leaves"), new Color(0xa3b8a5), () -> TreeType.POPLAR);
        LandscapedBlocks.Leaves.sequoia = new LandscapedLeavesBlock(NAMESPACE.id("sequoia_leaves"), new Color(0x418e71), () -> TreeType.SEQUOIA);
        LandscapedBlocks.Leaves.teak = new LandscapedLeavesBlock(NAMESPACE.id("teak_leaves"), new Color(0xfeff8f), () -> TreeType.TEAK);
        LandscapedBlocks.Leaves.walnut = new LandscapedLeavesBlock(NAMESPACE.id("walnut_leaves"), new Color(0x798c55), () -> TreeType.WALNUT);
        LandscapedBlocks.Leaves.wenge = new LandscapedLeavesBlock(NAMESPACE.id("wenge_leaves"), new Color(0xada157), () -> TreeType.WENGE);
        LandscapedBlocks.Leaves.willow = new LandscapedLeavesBlock(NAMESPACE.id("willow_leaves"), new Color(0xa3b8a5), () -> TreeType.WILLOW);
        LandscapedBlocks.Leaves.zebrawood = new LandscapedLeavesBlock(NAMESPACE.id("zebrawood_leaves"), new Color(0xa2d24a), () -> TreeType.ZEBRAWOOD);

        LandscapedBlocks.Planks.acacia = new LandscapedPlanksBlock(NAMESPACE.id("acacia_planks"));
        LandscapedBlocks.Planks.balsa = new LandscapedPlanksBlock(NAMESPACE.id("balsa_planks"));
        LandscapedBlocks.Planks.baobab = new LandscapedPlanksBlock(NAMESPACE.id("baobab_planks"));
        LandscapedBlocks.Planks.cherry = new LandscapedPlanksBlock(NAMESPACE.id("cherry_planks"));
        LandscapedBlocks.Planks.chestnut = new LandscapedPlanksBlock(NAMESPACE.id("chestnut_planks"));
        LandscapedBlocks.Planks.citrus = new LandscapedPlanksBlock(NAMESPACE.id("citrus_planks"));
        LandscapedBlocks.Planks.cocobolo = new LandscapedPlanksBlock(NAMESPACE.id("cocobolo_planks"));
        LandscapedBlocks.Planks.ebony = new LandscapedPlanksBlock(NAMESPACE.id("ebony_planks"));
        LandscapedBlocks.Planks.giganteum = new LandscapedPlanksBlock(NAMESPACE.id("giganteum_planks"));
        LandscapedBlocks.Planks.greenheart = new LandscapedPlanksBlock(NAMESPACE.id("greenheart_planks"));
        LandscapedBlocks.Planks.ipe = new LandscapedPlanksBlock(NAMESPACE.id("ipe_planks"));
        LandscapedBlocks.Planks.ironwood = new LandscapedPlanksBlock(NAMESPACE.id("ironwood_planks"));
        LandscapedBlocks.Planks.kapok = new LandscapedPlanksBlock(NAMESPACE.id("kapok_planks"));
        LandscapedBlocks.Planks.larch = new LandscapedPlanksBlock(NAMESPACE.id("larch_planks"));
        LandscapedBlocks.Planks.lime = new LandscapedPlanksBlock(NAMESPACE.id("lime_planks"));
        LandscapedBlocks.Planks.mahoe = new LandscapedPlanksBlock(NAMESPACE.id("mahoe_planks"));
        LandscapedBlocks.Planks.mahogany = new LandscapedPlanksBlock(NAMESPACE.id("mahogany_planks"));
        LandscapedBlocks.Planks.maple = new LandscapedPlanksBlock(NAMESPACE.id("maple_planks"));
        LandscapedBlocks.Planks.padauk = new LandscapedPlanksBlock(NAMESPACE.id("padauk_planks"));
        LandscapedBlocks.Planks.palm = new LandscapedPlanksBlock(NAMESPACE.id("palm_planks"));
        LandscapedBlocks.Planks.papaya = new LandscapedPlanksBlock(NAMESPACE.id("papaya_planks"));
        LandscapedBlocks.Planks.pine = new LandscapedPlanksBlock(NAMESPACE.id("pine_planks"));
        LandscapedBlocks.Planks.plum = new LandscapedPlanksBlock(NAMESPACE.id("plum_planks"));
        LandscapedBlocks.Planks.poplar = new LandscapedPlanksBlock(NAMESPACE.id("poplar_planks"));
        LandscapedBlocks.Planks.sequoia = new LandscapedPlanksBlock(NAMESPACE.id("sequoia_planks"));
        LandscapedBlocks.Planks.teak = new LandscapedPlanksBlock(NAMESPACE.id("teak_planks"));
        LandscapedBlocks.Planks.walnut = new LandscapedPlanksBlock(NAMESPACE.id("walnut_planks"));
        LandscapedBlocks.Planks.wenge = new LandscapedPlanksBlock(NAMESPACE.id("wenge_planks"));
        LandscapedBlocks.Planks.willow = new LandscapedPlanksBlock(NAMESPACE.id("willow_planks"));
        LandscapedBlocks.Planks.zebrawood = new LandscapedPlanksBlock(NAMESPACE.id("zebrawood_planks"));

        LandscapedBlocks.Sapling.acacia = new LandscapedSaplingBlock(NAMESPACE.id("acacia_sapling"));
        LandscapedBlocks.Sapling.balsa = new LandscapedSaplingBlock(NAMESPACE.id("balsa_sapling"));
        LandscapedBlocks.Sapling.baobab = new LandscapedSaplingBlock(NAMESPACE.id("baobab_sapling"));
        LandscapedBlocks.Sapling.cherry = new LandscapedSaplingBlock(NAMESPACE.id("cherry_sapling"));
        LandscapedBlocks.Sapling.chestnut = new LandscapedSaplingBlock(NAMESPACE.id("chestnut_sapling"));
        LandscapedBlocks.Sapling.citrus = new LandscapedSaplingBlock(NAMESPACE.id("citrus_sapling"));
        LandscapedBlocks.Sapling.cocobolo = new LandscapedSaplingBlock(NAMESPACE.id("cocobolo_sapling"));
        LandscapedBlocks.Sapling.ebony = new LandscapedSaplingBlock(NAMESPACE.id("ebony_sapling"));
        LandscapedBlocks.Sapling.giganteum = new LandscapedSaplingBlock(NAMESPACE.id("giganteum_sapling"));
        LandscapedBlocks.Sapling.greenheart = new LandscapedSaplingBlock(NAMESPACE.id("greenheart_sapling"));
        LandscapedBlocks.Sapling.ipe = new LandscapedSaplingBlock(NAMESPACE.id("ipe_sapling"));
        LandscapedBlocks.Sapling.ironwood = new LandscapedSaplingBlock(NAMESPACE.id("ironwood_sapling"));
        LandscapedBlocks.Sapling.kapok = new LandscapedSaplingBlock(NAMESPACE.id("kapok_sapling"));
        LandscapedBlocks.Sapling.larch = new LandscapedSaplingBlock(NAMESPACE.id("larch_sapling"));
        LandscapedBlocks.Sapling.lime = new LandscapedSaplingBlock(NAMESPACE.id("lime_sapling"));
        LandscapedBlocks.Sapling.mahoe = new LandscapedSaplingBlock(NAMESPACE.id("mahoe_sapling"));
        LandscapedBlocks.Sapling.mahogany = new LandscapedSaplingBlock(NAMESPACE.id("mahogany_sapling"));
        LandscapedBlocks.Sapling.maple = new LandscapedSaplingBlock(NAMESPACE.id("maple_sapling"));
        LandscapedBlocks.Sapling.padauk = new LandscapedSaplingBlock(NAMESPACE.id("padauk_sapling"));
        LandscapedBlocks.Sapling.palm = new LandscapedSaplingBlock(NAMESPACE.id("palm_sapling"));
        LandscapedBlocks.Sapling.papaya = new LandscapedSaplingBlock(NAMESPACE.id("papaya_sapling"));
        LandscapedBlocks.Sapling.pine = new LandscapedSaplingBlock(NAMESPACE.id("pine_sapling"));
        LandscapedBlocks.Sapling.plum = new LandscapedSaplingBlock(NAMESPACE.id("plum_sapling"));
        LandscapedBlocks.Sapling.poplar = new LandscapedSaplingBlock(NAMESPACE.id("poplar_sapling"));
        LandscapedBlocks.Sapling.sequoia = new LandscapedSaplingBlock(NAMESPACE.id("sequoia_sapling"));
        LandscapedBlocks.Sapling.teak = new LandscapedSaplingBlock(NAMESPACE.id("teak_sapling"));
        LandscapedBlocks.Sapling.walnut = new LandscapedSaplingBlock(NAMESPACE.id("walnut_sapling"));
        LandscapedBlocks.Sapling.wenge = new LandscapedSaplingBlock(NAMESPACE.id("wenge_sapling"));
        LandscapedBlocks.Sapling.willow = new LandscapedSaplingBlock(NAMESPACE.id("willow_sapling"));
        LandscapedBlocks.Sapling.zebrawood = new LandscapedSaplingBlock(NAMESPACE.id("zebrawood_sapling"));
    }
}
