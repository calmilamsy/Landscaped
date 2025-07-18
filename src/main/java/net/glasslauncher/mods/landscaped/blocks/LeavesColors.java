package net.glasslauncher.mods.landscaped.blocks;

import net.mine_diver.unsafeevents.listener.EventListener;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;
import net.modificationstation.stationapi.api.block.BlockState;
import net.modificationstation.stationapi.api.client.color.block.BlockColorProvider;
import net.modificationstation.stationapi.api.client.event.color.block.BlockColorsRegisterEvent;
import org.jetbrains.annotations.Nullable;

public class LeavesColors {

    @EventListener
    public static void init(BlockColorsRegisterEvent event) {
        event.blockColors.registerColorProvider(
                (blockState, blockView, blockPos, meta) -> blockState.getBlock().getColor(meta),
                LandscapedBlocks.Leaves.acacia,
                LandscapedBlocks.Leaves.balsa,
                LandscapedBlocks.Leaves.baobab,
                LandscapedBlocks.Leaves.cherry,
                LandscapedBlocks.Leaves.chestnut,
                LandscapedBlocks.Leaves.citrus,
                LandscapedBlocks.Leaves.cocobolo,
                LandscapedBlocks.Leaves.ebony,
                LandscapedBlocks.Leaves.giganteum,
                LandscapedBlocks.Leaves.greenheart,
                LandscapedBlocks.Leaves.ipe,
                LandscapedBlocks.Leaves.kapok,
                LandscapedBlocks.Leaves.larch,
                LandscapedBlocks.Leaves.lime,
                LandscapedBlocks.Leaves.mahoe,
                LandscapedBlocks.Leaves.mahogany,
                LandscapedBlocks.Leaves.maple,
                LandscapedBlocks.Leaves.padauk,
                LandscapedBlocks.Leaves.palm,
                LandscapedBlocks.Leaves.papaya,
                LandscapedBlocks.Leaves.pine,
                LandscapedBlocks.Leaves.plum,
                LandscapedBlocks.Leaves.poplar,
                LandscapedBlocks.Leaves.sequoia,
                LandscapedBlocks.Leaves.teak,
                LandscapedBlocks.Leaves.walnut,
                LandscapedBlocks.Leaves.wenge,
                LandscapedBlocks.Leaves.willow,
                LandscapedBlocks.Leaves.zebrawood
        );
    }
}
