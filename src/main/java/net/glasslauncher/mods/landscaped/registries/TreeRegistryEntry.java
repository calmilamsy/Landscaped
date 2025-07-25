package net.glasslauncher.mods.landscaped.registries;

import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.feature.Feature;

import java.util.List;
import java.util.Map;

@Getter
@RequiredArgsConstructor
public class TreeRegistryEntry {
    private final Feature feature;
    private final Object2IntMap<Biome> validBiomes;

    public TreeRegistryEntry(Feature feature, List<Biome> validBiomes) {
        this.feature = feature;
        this.validBiomes = new Object2IntOpenHashMap<>();
        validBiomes.forEach(e -> this.validBiomes.put(e, 100));
    }

    public TreeRegistryEntry(Feature feature, Map<Biome, Integer> validBiomes) {
        this.feature = feature;
        this.validBiomes = new Object2IntOpenHashMap<>();
        this.validBiomes.putAll(validBiomes);
    }

    @AllArgsConstructor
    private static class BasicEntry<k, v> implements Map.Entry<k, v> {
        @Getter
        private final k key;
        @Getter
        private v value;

        @Override
        public v setValue(v value) {
            v oldValue = this.value;
            this.value = value;
            return this.value;
        }
    }
}
