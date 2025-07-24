package net.glasslauncher.mods.landscaped.registries;

import com.mojang.serialization.Lifecycle;
import net.mine_diver.unsafeevents.Event;
import net.minecraft.world.biome.Biome;
import net.modificationstation.stationapi.api.StationAPI;
import net.modificationstation.stationapi.api.registry.Registry;
import net.modificationstation.stationapi.api.registry.RegistryEntry;
import net.modificationstation.stationapi.api.registry.RegistryKey;
import net.modificationstation.stationapi.api.registry.SimpleRegistry;
import net.modificationstation.stationapi.api.util.collection.WeightedList;
import org.jetbrains.annotations.Nullable;

import java.util.HashMap;
import java.util.Random;

import static net.glasslauncher.mods.landscaped.Landscaped.NAMESPACE;

public class TreeRegistry<T extends TreeRegistryEntry> extends SimpleRegistry<T> {
    public static final TreeRegistry<TreeRegistryEntry> INSTANCE = new TreeRegistry<>(RegistryKey.ofRegistry(NAMESPACE.id("trees")));

    private final HashMap<Biome, WeightedList<T>> biomeToTrees = new HashMap<>();

    public TreeRegistry(RegistryKey<? extends Registry<T>> key) {
        super(key, Lifecycle.stable());
    }

    @Override
    public RegistryEntry.Reference<T> add(RegistryKey<T> registryKey, T value, Lifecycle lifecycle) {
        Event event = new TreeRegisteringEvent(value);
        StationAPI.EVENT_BUS.post(event);
        if (event.isCanceled()) {
            return null;
        }
        value.getValidBiomes().forEach((biome, v) -> {
                biomeToTrees.computeIfAbsent(biome, k -> new WeightedList<>()).add(value, v);
        });
        return super.add(registryKey, value, lifecycle);
    }

    @Nullable
    public T getTree(Random random, Biome biome) {
        WeightedList<T> trees = biomeToTrees.get(biome);
        if (trees == null) {
            return null;
        }
        return trees.get(random);
    }
}
