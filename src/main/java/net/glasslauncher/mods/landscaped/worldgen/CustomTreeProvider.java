package net.glasslauncher.mods.landscaped.worldgen;

import net.minecraft.world.gen.feature.Feature;
import org.jetbrains.annotations.Nullable;

import java.util.Random;

@FunctionalInterface
public interface CustomTreeProvider {
    @Nullable Feature getCustomTree(Random random);
}
