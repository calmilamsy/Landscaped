package net.glasslauncher.mods.landscaped.eventlisteners.init;

import net.glasslauncher.mods.landscaped.blocks.LandscapedBlocks;
import net.glasslauncher.mods.landscaped.blocks.LandscapedLeavesBlock;
import net.glasslauncher.mods.landscaped.blocks.LandscapedLogBlock;
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

        LandscapedBlocks.Leaves.acacia = new LandscapedLeavesBlock(NAMESPACE.id("acacia_leaves"), new Color(0x748C1C));
        LandscapedBlocks.Leaves.balsa = new LandscapedLeavesBlock(NAMESPACE.id("balsa_leaves"), new Color(0x59ac00));
        LandscapedBlocks.Leaves.baobab = new LandscapedLeavesBlock(NAMESPACE.id("baobab_leaves"), new Color(0xfeff8f));
        LandscapedBlocks.Leaves.cherry = new LandscapedLeavesBlock(NAMESPACE.id("cherry_leaves"), new Color(0xe691da));
        LandscapedBlocks.Leaves.chestnut = new LandscapedLeavesBlock(NAMESPACE.id("chestnut_leaves"), new Color(0x5ea107));
        LandscapedBlocks.Leaves.citrus = new LandscapedLeavesBlock(NAMESPACE.id("citrus_leaves"), new Color(0x88af54));
        LandscapedBlocks.Leaves.cocobolo = new LandscapedLeavesBlock(NAMESPACE.id("cocobolo_leaves"), new Color(0x6aa17a));
        LandscapedBlocks.Leaves.ebony = new LandscapedLeavesBlock(NAMESPACE.id("ebony_leaves"), new Color(0xa2d24a));
        LandscapedBlocks.Leaves.giganteum = new LandscapedLeavesBlock(NAMESPACE.id("giganteum_leaves"), new Color(0x738434));
        LandscapedBlocks.Leaves.greenheart = new LandscapedLeavesBlock(NAMESPACE.id("greenheart_leaves"), new Color(0x678911));
        LandscapedBlocks.Leaves.ipe = new LandscapedLeavesBlock(NAMESPACE.id("ipe_leaves"), new Color(0xfdd207));
        LandscapedBlocks.Leaves.kapok = new LandscapedLeavesBlock(NAMESPACE.id("kapok_leaves"), new Color(0x89987b));
        LandscapedBlocks.Leaves.larch = new LandscapedLeavesBlock(NAMESPACE.id("larch_leaves"), new Color(0x698f90));
        LandscapedBlocks.Leaves.lime = new LandscapedLeavesBlock(NAMESPACE.id("lime_leaves"), new Color(0x5ea107));
        LandscapedBlocks.Leaves.mahoe = new LandscapedLeavesBlock(NAMESPACE.id("mahoe_leaves"), new Color(0xa0ba1b));
        LandscapedBlocks.Leaves.mahogany = new LandscapedLeavesBlock(NAMESPACE.id("mahogany_leaves"), new Color(0x8ab154));
        LandscapedBlocks.Leaves.maple = new LandscapedLeavesBlock(NAMESPACE.id("maple_leaves"), new Color(0xd4f425));
        LandscapedBlocks.Leaves.padauk = new LandscapedLeavesBlock(NAMESPACE.id("padauk_leaves"), new Color(0xd0df8c));
        LandscapedBlocks.Leaves.palm = new LandscapedLeavesBlock(NAMESPACE.id("palm_leaves"), new Color(0xcbcd79));
        LandscapedBlocks.Leaves.papaya = new LandscapedLeavesBlock(NAMESPACE.id("papaya_leaves"), new Color(0x6d9f58));
        LandscapedBlocks.Leaves.pine = new LandscapedLeavesBlock(NAMESPACE.id("pine_leaves"), new Color(0xfeff8f));
        LandscapedBlocks.Leaves.plum = new LandscapedLeavesBlock(NAMESPACE.id("plum_leaves"), new Color(0x589246));
        LandscapedBlocks.Leaves.poplar = new LandscapedLeavesBlock(NAMESPACE.id("poplar_leaves"), new Color(0xa3b8a5));
        LandscapedBlocks.Leaves.sequoia = new LandscapedLeavesBlock(NAMESPACE.id("sequoia_leaves"), new Color(0x418e71));
        LandscapedBlocks.Leaves.teak = new LandscapedLeavesBlock(NAMESPACE.id("teak_leaves"), new Color(0xfeff8f));
        LandscapedBlocks.Leaves.walnut = new LandscapedLeavesBlock(NAMESPACE.id("walnut_leaves"), new Color(0x798c55));
        LandscapedBlocks.Leaves.wenge = new LandscapedLeavesBlock(NAMESPACE.id("wenge_leaves"), new Color(0xada157));
        LandscapedBlocks.Leaves.willow = new LandscapedLeavesBlock(NAMESPACE.id("willow_leaves"), new Color(0xa3b8a5));
        LandscapedBlocks.Leaves.zebrawood = new LandscapedLeavesBlock(NAMESPACE.id("zebrawood_leaves"), new Color(0xa2d24a));
    }
}
