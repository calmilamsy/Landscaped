package net.glasslauncher.mods.landscaped.blocks;

import net.glasslauncher.mods.landscaped.Landscaped;
import net.minecraft.block.material.Material;
import net.modificationstation.stationapi.api.template.block.TemplateLogBlock;
import net.modificationstation.stationapi.api.util.Identifier;

import java.util.Random;

public class LandscapedLogBlock extends TemplateLogBlock {
    protected int heartTexture;

    public LandscapedLogBlock(Identifier identifier) {
        super(identifier);
        setTranslationKey(identifier);
        setSoundGroup(WOOD_SOUND_GROUP);
        setHardness(2.0F);
        ignoreMetaUpdates();
    }

    public void setTextures(int heartTexture, int barkTexture) {
        textureId = barkTexture;
        this.heartTexture = heartTexture;
    }

    public int getTexture(int side, int meta) {
        if (side == 1 || side == 0) {
            return heartTexture;
        } else {
            return textureId;
        }
    }

    @Override
    public int getDroppedItemId(int blockMeta, Random random) {
        return id;
    }
}
