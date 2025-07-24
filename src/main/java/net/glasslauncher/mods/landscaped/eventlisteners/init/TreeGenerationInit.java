package net.glasslauncher.mods.landscaped.eventlisteners.init;

import net.glasslauncher.mods.landscaped.registries.TreeRegisterEvent;
import net.glasslauncher.mods.landscaped.registries.TreeRegistry;
import net.glasslauncher.mods.landscaped.registries.TreeRegistryEntry;
import net.glasslauncher.mods.landscaped.worldgen.TreeType;
import net.mine_diver.unsafeevents.listener.EventListener;
import net.mine_diver.unsafeevents.listener.ListenerPriority;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.feature.*;
import net.modificationstation.stationapi.api.StationAPI;
import net.modificationstation.stationapi.api.event.world.biome.BiomeRegisterEvent;
import net.modificationstation.stationapi.api.registry.BlockRegistry;
import net.modificationstation.stationapi.api.registry.Registry;
import net.modificationstation.stationapi.api.util.Namespace;

import java.util.Map;

public class TreeGenerationInit {

    @EventListener(priority = ListenerPriority.LOW)
    public static void init(BiomeRegisterEvent event) {
        StationAPI.EVENT_BUS.post(new TreeRegisterEvent());
    }

    @EventListener
    public static void vanillaInit(TreeRegisterEvent event) {
        Registry.register(TreeRegistry.INSTANCE, Namespace.MINECRAFT.id("oak"), new TreeRegistryEntry(new OakTreeFeature(), Map.of(Biome.FOREST, 1000)));
        Registry.register(TreeRegistry.INSTANCE, Namespace.MINECRAFT.id("big_oak"), new TreeRegistryEntry(new LargeOakTreeFeature(), Map.of(Biome.FOREST, 100)));
        Registry.register(TreeRegistry.INSTANCE, Namespace.MINECRAFT.id("spruce"), new TreeRegistryEntry(new SpruceTreeFeature(), Map.of(Biome.TAIGA, 1000)));
        Registry.register(TreeRegistry.INSTANCE, Namespace.MINECRAFT.id("pine"), new TreeRegistryEntry(new PineTreeFeature(), Map.of(Biome.TAIGA, 1000)));
        Registry.register(TreeRegistry.INSTANCE, Namespace.MINECRAFT.id("birch"), new TreeRegistryEntry(new BirchTreeFeature(), Map.of(Biome.FOREST, 1000)));
    }

    @EventListener
    public static void init(TreeRegisterEvent event) {
        for (TreeType treeType : TreeType.values()) {
            Registry.register(TreeRegistry.INSTANCE, BlockRegistry.INSTANCE.getId(treeType.sapling), new TreeRegistryEntry((Feature) treeType.feature, treeType.biomeProvider.getBiomes()));
        }
    }
}
