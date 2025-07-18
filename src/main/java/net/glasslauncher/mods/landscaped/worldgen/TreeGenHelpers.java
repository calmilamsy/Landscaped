package net.glasslauncher.mods.landscaped.worldgen;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.modificationstation.stationapi.api.registry.BlockRegistry;

import java.util.Objects;

public class TreeGenHelpers {
    public static boolean isReplaceableByLogs(int blockId) {
        return blockId == 0 || !Block.BLOCKS_OPAQUE[blockId] || Objects.requireNonNull(BlockRegistry.INSTANCE.get(blockId)).material == Material.LEAVES;
    }
}
