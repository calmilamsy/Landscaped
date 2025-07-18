package net.glasslauncher.mods.landscaped.eventlisteners.init;

import net.glasslauncher.mods.landscaped.worldgen.TreeDef;
import net.mine_diver.unsafeevents.listener.EventListener;
import net.mine_diver.unsafeevents.listener.ListenerPriority;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.feature.Feature;
import net.modificationstation.stationapi.api.event.world.biome.BiomeRegisterEvent;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TreeGenerationInit {
    public static final HashMap<String, List<Feature>> BIOME_TO_TREES = new HashMap<>();

    @EventListener(priority = ListenerPriority.LOW)
    public static void init(BiomeRegisterEvent event) {
        for (TreeDef treeDef : TreeDef.values()) {
            treeDef.biomes.forEach(biome ->
                BIOME_TO_TREES.computeIfAbsent(biome.name, k -> new ArrayList<>()).add(treeDef.feature)
            );
        }
    }
}
