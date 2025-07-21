package net.glasslauncher.mods.landscaped.worldgen;

import lombok.RequiredArgsConstructor;
import net.glasslauncher.mods.gcapi3.impl.SeptFunction;
import net.glasslauncher.mods.landscaped.util.RandomIntProvider;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.Feature;
import net.modificationstation.stationapi.api.registry.BlockRegistry;

import java.util.*;
import java.util.function.BiFunction;
import java.util.function.Function;

@RequiredArgsConstructor
public class AlternateOakGen extends Feature {
    protected final Block trunk;
    protected final Block leaves;
    protected final RandomIntProvider treeHeightGetter; // random.nextInt(3) + 4
    protected final BiFunction<Random, Integer, Integer> leafRadiusShrinkGetter; // 1 - leafLayer / 2
    protected final RandomIntProvider leafLayerCountGetter; // 3
    protected final Map<Block, CustomSoilPlacer> soils;

    public AlternateOakGen(Block trunk, Block leaves, RandomIntProvider treeHeightGetter, BiFunction<Random, Integer, Integer> leafRadiusShrinkGetter, RandomIntProvider leafLayerCountGetter) {
        this.trunk = trunk;
        this.leaves = leaves;
        this.treeHeightGetter = treeHeightGetter;
        this.leafRadiusShrinkGetter = leafRadiusShrinkGetter;
        this.leafLayerCountGetter = leafLayerCountGetter;
        soils = Map.of(Block.DIRT, (w, r, x, y, z) -> {}, Block.GRASS_BLOCK, (w, r, x, y, z) -> w.setBlockWithoutNotifyingNeighbors(x, y, z, Block.DIRT.id));
    }

    @Override
    public boolean generate(World world, Random random, int x, int y, int z) {
        int treeHeight = treeHeightGetter.provide(random);
        if (y + treeHeight + 1 > world.getTopY()) {
            return false;
        }

        int supportingBlockId = world.getBlockId(x, y - 1, z);
        if (!(supportingBlockId == Block.GRASS_BLOCK.id || supportingBlockId == Block.DIRT.id) || y >= world.getTopY() - treeHeight - 1) {
            return false;
        }

        for(int checkingY = y; checkingY <= y + 1 + treeHeight; ++checkingY) {
            if (checkingY < world.getTopY()) {
                int foundBlockId = world.getBlockId(x, checkingY, z);
                if (foundBlockId != 0 && Objects.requireNonNull(BlockRegistry.INSTANCE.get(foundBlockId)).material == Material.LEAVES) {
                    return false;
                }
            } else {
                return false;
            }
        }

        world.setBlockWithoutNotifyingNeighbors(x, y - 1, z, Block.DIRT.id);

        for(int relativeY = 0; relativeY < treeHeight; ++relativeY) {
            if (TreeGenHelpers.isReplaceableByLogs(world.getBlockState(x, y + relativeY, z))) {
                world.setBlockWithoutNotifyingNeighbors(x, y + relativeY, z, trunk.id);
            }
        }

        for(int placingY = y - leafLayerCountGetter.provide(random) + treeHeight; placingY <= y + treeHeight; ++placingY) {
            int leafLayer = placingY - (y + treeHeight);
            int leafRadiusShrink = leafRadiusShrinkGetter.apply(random, leafLayer);

            for(int placingX = x - leafRadiusShrink; placingX <= x + leafRadiusShrink; ++placingX) {
                int mirroredX = placingX - x;

                for(int placingZ = z - leafRadiusShrink; placingZ <= z + leafRadiusShrink; ++placingZ) {
                    int mirroredZ = placingZ - z;
                    if ((Math.abs(mirroredX) != leafRadiusShrink || Math.abs(mirroredZ) != leafRadiusShrink || random.nextInt(2) != 0 && leafLayer != 0) && !Block.BLOCKS_OPAQUE[world.getBlockId(placingX, placingY, placingZ)]) {
                        world.setBlockWithoutNotifyingNeighbors(placingX, placingY, placingZ, leaves.id);
                    }
                }
            }
        }

        TreeGenHelpers.updateGeneratedLeaves(world, x, y + treeHeight, z);

        return true;
    }
}
