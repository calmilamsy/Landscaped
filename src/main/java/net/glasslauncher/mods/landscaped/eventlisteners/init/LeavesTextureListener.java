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
        ExpandableAtlas terrain = Atlases.getTerrain();

        int conifers = terrain.addTexture(NAMESPACE.id("block/leaves/conifers.fancy")).index;
        int deciduous = terrain.addTexture(NAMESPACE.id("block/leaves/deciduous.fancy")).index;
        int jungle = terrain.addTexture(NAMESPACE.id("block/leaves/jungle.fancy")).index;
        int maple = terrain.addTexture(NAMESPACE.id("block/leaves/maple.fancy")).index;
        int palm = terrain.addTexture(NAMESPACE.id("block/leaves/palm.fancy")).index;
        int willow = terrain.addTexture(NAMESPACE.id("block/leaves/willow.fancy")).index;

        int fastConifers = terrain.addTexture(NAMESPACE.id("block/leaves/conifers.plain")).index;
        int fastDeciduous = terrain.addTexture(NAMESPACE.id("block/leaves/deciduous.plain")).index;
        int fastJungle = terrain.addTexture(NAMESPACE.id("block/leaves/jungle.plain")).index;
        int fastMaple = terrain.addTexture(NAMESPACE.id("block/leaves/maple.plain")).index;
        int fastPalm = terrain.addTexture(NAMESPACE.id("block/leaves/palm.plain")).index;
        int fastWillow = terrain.addTexture(NAMESPACE.id("block/leaves/willow.plain")).index;

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
        LandscapedBlocks.Leaves.ironwood.textureId = conifers;
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

        LandscapedBlocks.Leaves.acacia.fastTextureId = fastDeciduous;
        LandscapedBlocks.Leaves.balsa.fastTextureId = fastDeciduous;
        LandscapedBlocks.Leaves.baobab.fastTextureId = fastDeciduous;
        LandscapedBlocks.Leaves.cherry.fastTextureId = fastDeciduous;
        LandscapedBlocks.Leaves.chestnut.fastTextureId = fastDeciduous;
        LandscapedBlocks.Leaves.citrus.fastTextureId = fastDeciduous;
        LandscapedBlocks.Leaves.cocobolo.fastTextureId = fastDeciduous;
        LandscapedBlocks.Leaves.ebony.fastTextureId = fastJungle;
        LandscapedBlocks.Leaves.giganteum.fastTextureId = fastConifers;
        LandscapedBlocks.Leaves.greenheart.fastTextureId = fastDeciduous;
        LandscapedBlocks.Leaves.ipe.fastTextureId = fastJungle;
        LandscapedBlocks.Leaves.ironwood.fastTextureId = fastConifers;
        LandscapedBlocks.Leaves.kapok.fastTextureId = fastJungle;
        LandscapedBlocks.Leaves.larch.fastTextureId = fastConifers;
        LandscapedBlocks.Leaves.lime.fastTextureId = fastDeciduous;
        LandscapedBlocks.Leaves.mahoe.fastTextureId = fastDeciduous;
        LandscapedBlocks.Leaves.mahogany.fastTextureId = fastJungle;
        LandscapedBlocks.Leaves.maple.fastTextureId = fastMaple;
        LandscapedBlocks.Leaves.padauk.fastTextureId = fastDeciduous;
        LandscapedBlocks.Leaves.palm.fastTextureId = fastPalm;
        LandscapedBlocks.Leaves.papaya.fastTextureId = fastPalm;
        LandscapedBlocks.Leaves.pine.fastTextureId = fastConifers;
        LandscapedBlocks.Leaves.plum.fastTextureId = fastDeciduous;
        LandscapedBlocks.Leaves.poplar.fastTextureId = fastDeciduous;
        LandscapedBlocks.Leaves.sequoia.fastTextureId = fastConifers;
        LandscapedBlocks.Leaves.teak.fastTextureId = fastJungle;
        LandscapedBlocks.Leaves.walnut.fastTextureId = fastDeciduous;
        LandscapedBlocks.Leaves.wenge.fastTextureId = fastDeciduous;
        LandscapedBlocks.Leaves.willow.fastTextureId = fastWillow;
        LandscapedBlocks.Leaves.zebrawood.fastTextureId = fastJungle;

        LandscapedBlocks.Sapling.acacia.textureId = terrain.addTexture(NAMESPACE.id("block/sapling/acacia")).index;
        LandscapedBlocks.Sapling.balsa.textureId = terrain.addTexture(NAMESPACE.id("block/sapling/balsa")).index;
        LandscapedBlocks.Sapling.baobab.textureId = terrain.addTexture(NAMESPACE.id("block/sapling/baobab")).index;
        LandscapedBlocks.Sapling.cherry.textureId = terrain.addTexture(NAMESPACE.id("block/sapling/cherry")).index;
        LandscapedBlocks.Sapling.chestnut.textureId = terrain.addTexture(NAMESPACE.id("block/sapling/chestnut")).index;
        LandscapedBlocks.Sapling.citrus.textureId = terrain.addTexture(NAMESPACE.id("block/sapling/citrus")).index;
        LandscapedBlocks.Sapling.cocobolo.textureId = terrain.addTexture(NAMESPACE.id("block/sapling/cocobolo")).index;
        LandscapedBlocks.Sapling.ebony.textureId = terrain.addTexture(NAMESPACE.id("block/sapling/ebony")).index;
        LandscapedBlocks.Sapling.giganteum.textureId = terrain.addTexture(NAMESPACE.id("block/sapling/giganteum")).index;
        LandscapedBlocks.Sapling.greenheart.textureId = terrain.addTexture(NAMESPACE.id("block/sapling/greenheart")).index;
        LandscapedBlocks.Sapling.ipe.textureId = terrain.addTexture(NAMESPACE.id("block/sapling/ipe")).index;
        LandscapedBlocks.Sapling.ironwood.textureId = terrain.addTexture(NAMESPACE.id("block/sapling/ironwood")).index;
        LandscapedBlocks.Sapling.kapok.textureId = terrain.addTexture(NAMESPACE.id("block/sapling/kapok")).index;
        LandscapedBlocks.Sapling.larch.textureId = terrain.addTexture(NAMESPACE.id("block/sapling/larch")).index;
        LandscapedBlocks.Sapling.lime.textureId = terrain.addTexture(NAMESPACE.id("block/sapling/lime")).index;
        LandscapedBlocks.Sapling.mahoe.textureId = terrain.addTexture(NAMESPACE.id("block/sapling/mahoe")).index;
        LandscapedBlocks.Sapling.mahogany.textureId = terrain.addTexture(NAMESPACE.id("block/sapling/mahogany")).index;
        LandscapedBlocks.Sapling.maple.textureId = terrain.addTexture(NAMESPACE.id("block/sapling/maple")).index;
        LandscapedBlocks.Sapling.padauk.textureId = terrain.addTexture(NAMESPACE.id("block/sapling/padauk")).index;
        LandscapedBlocks.Sapling.palm.textureId = terrain.addTexture(NAMESPACE.id("block/sapling/palm")).index;
        LandscapedBlocks.Sapling.papaya.textureId = terrain.addTexture(NAMESPACE.id("block/sapling/papaya")).index;
        LandscapedBlocks.Sapling.pine.textureId = terrain.addTexture(NAMESPACE.id("block/sapling/pine")).index;
        LandscapedBlocks.Sapling.plum.textureId = terrain.addTexture(NAMESPACE.id("block/sapling/plum")).index;
        LandscapedBlocks.Sapling.poplar.textureId = terrain.addTexture(NAMESPACE.id("block/sapling/poplar")).index;
        LandscapedBlocks.Sapling.sequoia.textureId = terrain.addTexture(NAMESPACE.id("block/sapling/sequoia")).index;
        LandscapedBlocks.Sapling.teak.textureId = terrain.addTexture(NAMESPACE.id("block/sapling/teak")).index;
        LandscapedBlocks.Sapling.walnut.textureId = terrain.addTexture(NAMESPACE.id("block/sapling/walnut")).index;
        LandscapedBlocks.Sapling.wenge.textureId = terrain.addTexture(NAMESPACE.id("block/sapling/wenge")).index;
        LandscapedBlocks.Sapling.willow.textureId = terrain.addTexture(NAMESPACE.id("block/sapling/willow")).index;
        LandscapedBlocks.Sapling.zebrawood.textureId = terrain.addTexture(NAMESPACE.id("block/sapling/zebrawood")).index;
    }
}
