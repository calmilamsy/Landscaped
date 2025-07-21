package net.glasslauncher.mods.landscaped.worldgen;

import net.glasslauncher.mods.landscaped.blocks.LeavesBlockTemplate;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.world.World;
import net.modificationstation.stationapi.api.block.BlockState;

import java.util.Objects;

public class TreeGenHelpers {
    public static boolean isReplaceableByLogs(BlockState state) {
        return state.isAir() || !state.isOpaque() || state.getMaterial() == Material.LEAVES;
    }

    public static void updateGeneratedLeaves(World world, int x, int y, int z) {
        Block block = world.getBlockState(x, y, z).getBlock();
        if (block instanceof LeavesBlockTemplate template) {
            template.updateDecay(world, x, y, z, false);
        }
    }
}
