package net.glasslauncher.mods.landscaped.worldgen;

import net.minecraft.world.World;

import java.util.Random;

@FunctionalInterface
public interface CustomSoilPlacer {
    void placeSoil(World world, Random random, int x, int y, int z);
}
