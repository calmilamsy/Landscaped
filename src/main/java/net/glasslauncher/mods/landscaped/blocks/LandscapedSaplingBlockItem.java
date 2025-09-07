package net.glasslauncher.mods.landscaped.blocks;

import net.modificationstation.stationapi.api.registry.BlockRegistry;
import net.modificationstation.stationapi.api.template.item.TemplateSaplingBlockItem;

public class LandscapedSaplingBlockItem extends TemplateSaplingBlockItem {
    public LandscapedSaplingBlockItem(int i) {
        super(i);
    }

    @Override
    public int getTextureId(int damage) {
        return getBlock().getTexture(0);
    }
}
