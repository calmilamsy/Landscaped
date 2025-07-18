package net.glasslauncher.mods.landscaped.eventlisteners.init;

import net.glasslauncher.mods.landscaped.blocks.LandscapedBlocks;
import net.mine_diver.unsafeevents.listener.EventListener;
import net.modificationstation.stationapi.api.client.event.texture.TextureRegisterEvent;
import net.modificationstation.stationapi.api.client.texture.atlas.Atlases;
import net.modificationstation.stationapi.api.client.texture.atlas.ExpandableAtlas;
import net.modificationstation.stationapi.api.mod.entrypoint.EntrypointManager;

import java.lang.invoke.MethodHandles;

import static net.glasslauncher.mods.landscaped.Landscaped.NAMESPACE;

public class LeavesTextureListener {
    static {
        EntrypointManager.registerLookup(MethodHandles.lookup());
    }

    @EventListener
    private static void init(TextureRegisterEvent event) {
        ExpandableAtlas terrain = Atlases.getStationTerrain();

        int conifers = terrain.addTexture(NAMESPACE.id("block/leaves/conifers.fancy")).index;
        int deciduous = terrain.addTexture(NAMESPACE.id("block/leaves/deciduous.fancy")).index;
        int jungle = terrain.addTexture(NAMESPACE.id("block/leaves/jungle.fancy")).index;
        int maple = terrain.addTexture(NAMESPACE.id("block/leaves/maple.fancy")).index;
        int palm = terrain.addTexture(NAMESPACE.id("block/leaves/palm.fancy")).index;
        int willow = terrain.addTexture(NAMESPACE.id("block/leaves/willow.fancy")).index;

        LandscapedBlocks.Leaves.acacia.textureId = deciduous;
        LandscapedBlocks.Leaves.balsa.textureId = deciduous;
        LandscapedBlocks.Leaves.baobab.textureId = deciduous;
        LandscapedBlocks.Leaves.cherry.textureId = deciduous;
        LandscapedBlocks.Leaves.chestnut.textureId = deciduous;
        LandscapedBlocks.Leaves.citrus.textureId = deciduous;
        LandscapedBlocks.Leaves.cocobolo.textureId = deciduous;
        LandscapedBlocks.Leaves.ebony.textureId = jungle;
        LandscapedBlocks.Leaves.giganteum.textureId = conifers;
        LandscapedBlocks.Leaves.greenheart.textureId = deciduous;
        LandscapedBlocks.Leaves.ipe.textureId = jungle;
        LandscapedBlocks.Leaves.kapok.textureId = jungle;
        LandscapedBlocks.Leaves.larch.textureId = conifers;
        LandscapedBlocks.Leaves.lime.textureId = deciduous;
        LandscapedBlocks.Leaves.mahoe.textureId = deciduous;
        LandscapedBlocks.Leaves.mahogany.textureId = jungle;
        LandscapedBlocks.Leaves.maple.textureId = maple;
        LandscapedBlocks.Leaves.padauk.textureId = deciduous;
        LandscapedBlocks.Leaves.palm.textureId = palm;
        LandscapedBlocks.Leaves.papaya.textureId = palm;
        LandscapedBlocks.Leaves.pine.textureId = conifers;
        LandscapedBlocks.Leaves.plum.textureId = deciduous;
        LandscapedBlocks.Leaves.poplar.textureId = deciduous;
        LandscapedBlocks.Leaves.sequoia.textureId = conifers;
        LandscapedBlocks.Leaves.teak.textureId = jungle;
        LandscapedBlocks.Leaves.walnut.textureId = deciduous;
        LandscapedBlocks.Leaves.wenge.textureId = deciduous;
        LandscapedBlocks.Leaves.willow.textureId = willow;
        LandscapedBlocks.Leaves.zebrawood.textureId = jungle;
    }
}
