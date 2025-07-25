package net.glasslauncher.mods.landscaped.util;


import net.minecraft.world.World;
import net.minecraft.world.gen.feature.Feature;

import java.util.Random;

public class BlankFeature extends Feature {
    @Override
    public boolean generate(World world, Random random, int x, int y, int z) {
        return false;
    }
}
