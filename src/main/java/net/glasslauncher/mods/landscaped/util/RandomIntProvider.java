package net.glasslauncher.mods.landscaped.util;

import java.util.Random;

@FunctionalInterface
public interface RandomIntProvider {
    int provide(Random random);
}
