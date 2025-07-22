package net.glasslauncher.mods.landscaped.eventlisteners.init;

import net.glasslauncher.mods.landscaped.blocks.LandscapedBlocks;
import net.mine_diver.unsafeevents.listener.EventListener;
import net.modificationstation.stationapi.api.client.event.texture.TextureRegisterEvent;
import net.modificationstation.stationapi.api.client.texture.atlas.Atlases;
import net.modificationstation.stationapi.api.client.texture.atlas.ExpandableAtlas;
import net.modificationstation.stationapi.api.mod.entrypoint.EntrypointManager;

import java.lang.invoke.MethodHandles;

import static net.glasslauncher.mods.landscaped.Landscaped.NAMESPACE;

public class WoodTextureListener {
    static {
        EntrypointManager.registerLookup(MethodHandles.lookup());
    }

    @EventListener
    private static void init(TextureRegisterEvent event) {
        ExpandableAtlas terrain = Atlases.getStationTerrain();

        LandscapedBlocks.Wood.acacia.setTextures(terrain.addTexture(NAMESPACE.id("block/wood/heart/acacia")).index, terrain.addTexture(NAMESPACE.id("block/wood/bark/acacia")).index);
        LandscapedBlocks.Wood.balsa.setTextures(terrain.addTexture(NAMESPACE.id("block/wood/heart/balsa")).index, terrain.addTexture(NAMESPACE.id("block/wood/bark/balsa")).index);
        LandscapedBlocks.Wood.baobab.setTextures(terrain.addTexture(NAMESPACE.id("block/wood/heart/baobab")).index, terrain.addTexture(NAMESPACE.id("block/wood/bark/baobab")).index);
        LandscapedBlocks.Wood.cherry.setTextures(terrain.addTexture(NAMESPACE.id("block/wood/heart/cherry")).index, terrain.addTexture(NAMESPACE.id("block/wood/bark/cherry")).index);
        LandscapedBlocks.Wood.chestnut.setTextures(terrain.addTexture(NAMESPACE.id("block/wood/heart/chestnut")).index, terrain.addTexture(NAMESPACE.id("block/wood/bark/chestnut")).index);
        LandscapedBlocks.Wood.citrus.setTextures(terrain.addTexture(NAMESPACE.id("block/wood/heart/citrus")).index, terrain.addTexture(NAMESPACE.id("block/wood/bark/citrus")).index);
        LandscapedBlocks.Wood.cocobolo.setTextures(terrain.addTexture(NAMESPACE.id("block/wood/heart/cocobolo")).index, terrain.addTexture(NAMESPACE.id("block/wood/bark/cocobolo")).index);
        LandscapedBlocks.Wood.ebony.setTextures(terrain.addTexture(NAMESPACE.id("block/wood/heart/ebony")).index, terrain.addTexture(NAMESPACE.id("block/wood/bark/ebony")).index);
        LandscapedBlocks.Wood.giganteum.setTextures(terrain.addTexture(NAMESPACE.id("block/wood/heart/giganteum")).index, terrain.addTexture(NAMESPACE.id("block/wood/bark/giganteum")).index);
        LandscapedBlocks.Wood.greenheart.setTextures(terrain.addTexture(NAMESPACE.id("block/wood/heart/greenheart")).index, terrain.addTexture(NAMESPACE.id("block/wood/bark/greenheart")).index);
        LandscapedBlocks.Wood.ipe.setTextures(terrain.addTexture(NAMESPACE.id("block/wood/heart/ipe")).index, terrain.addTexture(NAMESPACE.id("block/wood/bark/ipe")).index);
        LandscapedBlocks.Wood.ironwood.setTextures(terrain.addTexture(NAMESPACE.id("block/wood/heart/ironwood")).index, terrain.addTexture(NAMESPACE.id("block/wood/bark/ironwood")).index);
        LandscapedBlocks.Wood.kapok.setTextures(terrain.addTexture(NAMESPACE.id("block/wood/heart/kapok")).index, terrain.addTexture(NAMESPACE.id("block/wood/bark/kapok")).index);
        LandscapedBlocks.Wood.larch.setTextures(terrain.addTexture(NAMESPACE.id("block/wood/heart/larch")).index, terrain.addTexture(NAMESPACE.id("block/wood/bark/larch")).index);
        LandscapedBlocks.Wood.lime.setTextures(terrain.addTexture(NAMESPACE.id("block/wood/heart/lime")).index, terrain.addTexture(NAMESPACE.id("block/wood/bark/lime")).index);
        LandscapedBlocks.Wood.mahoe.setTextures(terrain.addTexture(NAMESPACE.id("block/wood/heart/mahoe")).index, terrain.addTexture(NAMESPACE.id("block/wood/bark/mahoe")).index);
        LandscapedBlocks.Wood.mahogany.setTextures(terrain.addTexture(NAMESPACE.id("block/wood/heart/mahogany")).index, terrain.addTexture(NAMESPACE.id("block/wood/bark/mahogany")).index);
        LandscapedBlocks.Wood.maple.setTextures(terrain.addTexture(NAMESPACE.id("block/wood/heart/maple")).index, terrain.addTexture(NAMESPACE.id("block/wood/bark/maple")).index);
        LandscapedBlocks.Wood.padauk.setTextures(terrain.addTexture(NAMESPACE.id("block/wood/heart/padauk")).index, terrain.addTexture(NAMESPACE.id("block/wood/bark/padauk")).index);
        LandscapedBlocks.Wood.palm.setTextures(terrain.addTexture(NAMESPACE.id("block/wood/heart/palm")).index, terrain.addTexture(NAMESPACE.id("block/wood/bark/palm")).index);
        LandscapedBlocks.Wood.papaya.setTextures(terrain.addTexture(NAMESPACE.id("block/wood/heart/papaya")).index, terrain.addTexture(NAMESPACE.id("block/wood/bark/papaya")).index);
        LandscapedBlocks.Wood.pine.setTextures(terrain.addTexture(NAMESPACE.id("block/wood/heart/pine")).index, terrain.addTexture(NAMESPACE.id("block/wood/bark/pine")).index);
        LandscapedBlocks.Wood.plum.setTextures(terrain.addTexture(NAMESPACE.id("block/wood/heart/plum")).index, terrain.addTexture(NAMESPACE.id("block/wood/bark/plum")).index);
        LandscapedBlocks.Wood.poplar.setTextures(terrain.addTexture(NAMESPACE.id("block/wood/heart/poplar")).index, terrain.addTexture(NAMESPACE.id("block/wood/bark/poplar")).index);
        LandscapedBlocks.Wood.sequoia.setTextures(terrain.addTexture(NAMESPACE.id("block/wood/heart/sequoia")).index, terrain.addTexture(NAMESPACE.id("block/wood/bark/sequoia")).index);
        LandscapedBlocks.Wood.teak.setTextures(terrain.addTexture(NAMESPACE.id("block/wood/heart/teak")).index, terrain.addTexture(NAMESPACE.id("block/wood/bark/teak")).index);
        LandscapedBlocks.Wood.walnut.setTextures(terrain.addTexture(NAMESPACE.id("block/wood/heart/walnut")).index, terrain.addTexture(NAMESPACE.id("block/wood/bark/walnut")).index);
        LandscapedBlocks.Wood.wenge.setTextures(terrain.addTexture(NAMESPACE.id("block/wood/heart/wenge")).index, terrain.addTexture(NAMESPACE.id("block/wood/bark/wenge")).index);
        LandscapedBlocks.Wood.willow.setTextures(terrain.addTexture(NAMESPACE.id("block/wood/heart/willow")).index, terrain.addTexture(NAMESPACE.id("block/wood/bark/willow")).index);
        LandscapedBlocks.Wood.zebrawood.setTextures(terrain.addTexture(NAMESPACE.id("block/wood/heart/zebrawood")).index, terrain.addTexture(NAMESPACE.id("block/wood/bark/zebrawood")).index);

        LandscapedBlocks.Planks.acacia.textureId = terrain.addTexture(NAMESPACE.id("block/wood/planks/acacia")).index;
        LandscapedBlocks.Planks.balsa.textureId = terrain.addTexture(NAMESPACE.id("block/wood/planks/balsa")).index;
        LandscapedBlocks.Planks.baobab.textureId = terrain.addTexture(NAMESPACE.id("block/wood/planks/baobab")).index;
        LandscapedBlocks.Planks.cherry.textureId = terrain.addTexture(NAMESPACE.id("block/wood/planks/cherry")).index;
        LandscapedBlocks.Planks.chestnut.textureId = terrain.addTexture(NAMESPACE.id("block/wood/planks/chestnut")).index;
        LandscapedBlocks.Planks.citrus.textureId = terrain.addTexture(NAMESPACE.id("block/wood/planks/citrus")).index;
        LandscapedBlocks.Planks.cocobolo.textureId = terrain.addTexture(NAMESPACE.id("block/wood/planks/cocobolo")).index;
        LandscapedBlocks.Planks.ebony.textureId = terrain.addTexture(NAMESPACE.id("block/wood/planks/ebony")).index;
        LandscapedBlocks.Planks.giganteum.textureId = terrain.addTexture(NAMESPACE.id("block/wood/planks/giganteum")).index;
        LandscapedBlocks.Planks.greenheart.textureId = terrain.addTexture(NAMESPACE.id("block/wood/planks/greenheart")).index;
        LandscapedBlocks.Planks.ipe.textureId = terrain.addTexture(NAMESPACE.id("block/wood/planks/ipe")).index;
        LandscapedBlocks.Planks.ironwood.textureId = terrain.addTexture(NAMESPACE.id("block/wood/planks/ironwood")).index;
        LandscapedBlocks.Planks.kapok.textureId = terrain.addTexture(NAMESPACE.id("block/wood/planks/kapok")).index;
        LandscapedBlocks.Planks.larch.textureId = terrain.addTexture(NAMESPACE.id("block/wood/planks/larch")).index;
        LandscapedBlocks.Planks.lime.textureId = terrain.addTexture(NAMESPACE.id("block/wood/planks/lime")).index;
        LandscapedBlocks.Planks.mahoe.textureId = terrain.addTexture(NAMESPACE.id("block/wood/planks/mahoe")).index;
        LandscapedBlocks.Planks.mahogany.textureId = terrain.addTexture(NAMESPACE.id("block/wood/planks/mahogany")).index;
        LandscapedBlocks.Planks.maple.textureId = terrain.addTexture(NAMESPACE.id("block/wood/planks/maple")).index;
        LandscapedBlocks.Planks.padauk.textureId = terrain.addTexture(NAMESPACE.id("block/wood/planks/padauk")).index;
        LandscapedBlocks.Planks.palm.textureId = terrain.addTexture(NAMESPACE.id("block/wood/planks/palm")).index;
        LandscapedBlocks.Planks.papaya.textureId = terrain.addTexture(NAMESPACE.id("block/wood/planks/papaya")).index;
        LandscapedBlocks.Planks.pine.textureId = terrain.addTexture(NAMESPACE.id("block/wood/planks/pine")).index;
        LandscapedBlocks.Planks.plum.textureId = terrain.addTexture(NAMESPACE.id("block/wood/planks/plum")).index;
        LandscapedBlocks.Planks.poplar.textureId = terrain.addTexture(NAMESPACE.id("block/wood/planks/poplar")).index;
        LandscapedBlocks.Planks.sequoia.textureId = terrain.addTexture(NAMESPACE.id("block/wood/planks/sequoia")).index;
        LandscapedBlocks.Planks.teak.textureId = terrain.addTexture(NAMESPACE.id("block/wood/planks/teak")).index;
        LandscapedBlocks.Planks.walnut.textureId = terrain.addTexture(NAMESPACE.id("block/wood/planks/walnut")).index;
        LandscapedBlocks.Planks.wenge.textureId = terrain.addTexture(NAMESPACE.id("block/wood/planks/wenge")).index;
        LandscapedBlocks.Planks.willow.textureId = terrain.addTexture(NAMESPACE.id("block/wood/planks/willow")).index;
        LandscapedBlocks.Planks.zebrawood.textureId = terrain.addTexture(NAMESPACE.id("block/wood/planks/zebrawood")).index;
    }
}
