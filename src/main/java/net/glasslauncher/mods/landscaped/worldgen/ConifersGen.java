package net.glasslauncher.mods.landscaped.worldgen;

import lombok.RequiredArgsConstructor;
import net.glasslauncher.mods.landscaped.blocks.LeavesBlockTemplate;
import net.glasslauncher.mods.landscaped.util.RandomIntProvider;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.Feature;
import net.modificationstation.stationapi.api.registry.BlockRegistry;

import java.util.Map;
import java.util.Objects;
import java.util.Random;

@RequiredArgsConstructor
public class ConifersGen extends Feature {
    protected final Block trunk;
    protected final Block leaves;
    protected final RandomIntProvider treeHeightGetter;
    protected final RandomIntProvider topLeafHeightGetter;
    protected final RandomIntProvider maxLeafRadiusGetter;
    protected final RandomIntProvider trunkReductionGetter;
    protected final RandomIntProvider topLeafRadiusGetter;
    protected final RandomIntProvider radiusAfterTopLeafGetter;
    protected final RandomIntProvider leavesConsideredAfterTopGetter;
    protected final RandomIntProvider minLeafRadiusGetter;
    protected final Map<Block, CustomSoilPlacer> soils;

    public ConifersGen(Block trunk, Block leaves, RandomIntProvider treeHeightGetter, RandomIntProvider topLeafHeightGetter, RandomIntProvider maxLeafRadiusGetter, RandomIntProvider trunkReductionGetter, RandomIntProvider topLeafRadiusGetter, RandomIntProvider radiusAfterTopLeafGetter, RandomIntProvider leavesConsideredAfterTopGetter, RandomIntProvider minLeafRadiusGetter) {
        this.trunk = trunk;
        this.leaves = leaves;
        this.treeHeightGetter = treeHeightGetter;
        this.topLeafHeightGetter = topLeafHeightGetter;
        this.maxLeafRadiusGetter = maxLeafRadiusGetter;
        this.trunkReductionGetter = trunkReductionGetter;
        this.topLeafRadiusGetter = topLeafRadiusGetter;
        this.radiusAfterTopLeafGetter = radiusAfterTopLeafGetter;
        this.leavesConsideredAfterTopGetter = leavesConsideredAfterTopGetter;
        this.minLeafRadiusGetter = minLeafRadiusGetter;
        soils = Map.of(Block.DIRT, (w, r, x, y, z) -> {}, Block.GRASS_BLOCK, (w, r, x, y, z) -> w.setBlockWithoutNotifyingNeighbors(x, y, z, Block.DIRT.id));
    }

    // Notch, you wrote some draconian bullshit here. Also it performed like crap cause you didn't do the simple checks first.
    @Override
    public boolean generate(World world, Random random, int x, int y, int z) {
        int treeHeight = treeHeightGetter.provide(random);

        if (y < 1 || y + treeHeight + 1 > world.getTopY()) {
            return false;
        }

        int supportingBlockId = world.getBlockId(x, y - 1, z);
        if (((supportingBlockId != Block.GRASS_BLOCK.id && supportingBlockId != Block.DIRT.id)) || y >= world.getTopY() - treeHeight - 1) {
            return false;
        }

        for (int checkingY = y; checkingY <= y + 1 + treeHeight; checkingY++) {

            if (checkingY >= 0 && checkingY < world.getTopY()) {
                int foundBlock = world.getBlockId(x, checkingY, z);
                if (foundBlock != 0 && Objects.requireNonNull(BlockRegistry.INSTANCE.get(foundBlock)).material == Material.LEAVES) {
                    return false;
                }
            } else {
                return false;
            }
        }

        world.setBlockWithoutNotifyingNeighbors(x, y - 1, z, Block.DIRT.id);
        // Starts at the top, so this decides the top leaf radius, which can be 1 or 0, which gives + type leaves or a spike, respectively.
        int currentLeafRadius = topLeafRadiusGetter.provide(random);
        // Leaves can't get any thinner than this unless it's just after the top and is also a spike. Logs are excluded in this.
        int minLeafRadius = minLeafRadiusGetter.provide(random);
        // If the leaves are going to be too small, minLeafRadius is set to this.
        int nextLoopedRadius = radiusAfterTopLeafGetter.provide(random);

        int topLeafHeight = topLeafHeightGetter.provide(random);
        int trunkHeight = treeHeight - topLeafHeight;
        int maxLeafRadius = maxLeafRadiusGetter.provide(random);
        int treeTrunkReduction = trunkReductionGetter.provide(random);
        int leavesConsiderdAfterTop = leavesConsideredAfterTopGetter.provide(random);
        int leavesSoFar = 0;

        for (int relativeY = 0; relativeY < treeHeight - treeTrunkReduction; relativeY++) {
            if (TreeGenHelpers.isReplaceableByLogs(world.getBlockState(x, y + relativeY, z))) {
                world.setBlockWithoutNotifyingNeighbors(x, y + relativeY, z, trunk.id, 1);
            }
        }

        for (int relativeY = 0; relativeY <= trunkHeight; relativeY++) {
            int placingY = y + treeHeight - relativeY;

            for (int relativeX = x - currentLeafRadius; relativeX <= x + currentLeafRadius; relativeX++) {
                int placingX = relativeX - x;

                for (int relativeZ = z - currentLeafRadius; relativeZ <= z + currentLeafRadius; relativeZ++) {
                    int placingZ = relativeZ - z;
                    if ((Math.abs(placingX) != currentLeafRadius || Math.abs(placingZ) != currentLeafRadius || currentLeafRadius <= 0) && !Block.BLOCKS_OPAQUE[world.getBlockId(relativeX, placingY, relativeZ)]) {
                        world.setBlockWithoutNotifyingNeighbors(relativeX, placingY, relativeZ, leaves.id);
                    }
                }
            }

            if (currentLeafRadius >= minLeafRadius) {
                // The leaves got too small, so set the next looped radius.
                currentLeafRadius = nextLoopedRadius;
                // Set next looped radius to always be 1 after this, which guarantees at least 1 layer of leaves around the trunk after the top of the tree.
                if (leavesConsiderdAfterTop <= leavesSoFar) {
                    nextLoopedRadius = 1;
                }
                // Leaves increase in size until they cap out.
                if (++minLeafRadius > maxLeafRadius) {
                    minLeafRadius = maxLeafRadius;
                }
            } else {
                currentLeafRadius++;
            }
        }

        TreeGenHelpers.updateGeneratedLeaves(world, x, y + treeHeight, z);

        return true;
    }
}
