package net.glasslauncher.mods.landscaped.worldgen;

import net.minecraft.block.Block;
import net.minecraft.world.World;

import java.util.List;
import java.util.Random;
import java.util.Set;

public interface LandscapedTreeFeature {
    Set<Block> getSoils();
    boolean generate(World world, Random random, int x, int y, int z);
}
