package net.glasslauncher.mods.landscaped.blocks;

import lombok.Getter;
import lombok.Setter;
import net.glasslauncher.mods.landscaped.worldgen.TreeType;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.Feature;
import net.modificationstation.stationapi.api.block.HasCustomBlockItemFactory;
import net.modificationstation.stationapi.api.template.block.TemplateSaplingBlock;
import net.modificationstation.stationapi.api.util.Identifier;

import java.util.Random;

@HasCustomBlockItemFactory(LandscapedSaplingBlockItem.class)
public class LandscapedSaplingBlock extends TemplateSaplingBlock {
    @Setter @Getter
    private TreeType treeType;

    public LandscapedSaplingBlock(Identifier identifier) {
        super(identifier, 1);
        setHardness(0.0F);
        setSoundGroup(DIRT_SOUND_GROUP);
        setTranslationKey(identifier);
        ignoreMetaUpdates();
    }

    @Override
    public int getTexture(int side, int meta) {
        return textureId;
    }

    @Override
    public void generate(World world, int x, int y, int z, Random random) {
        world.setBlockWithoutNotifyingNeighbors(x, y, z, 0);
        if (!treeType.feature.generate(world, random, x, y, z)) {
            world.setBlockWithoutNotifyingNeighbors(x, y, z, id);
        }
    }

    @Override
    protected boolean canPlantOnTop(int id) {
        return treeType.feature.getSoils().stream().anyMatch(b -> b.id == id);
    }
}
