package net.glasslauncher.mods.landscaped.eventlisteners.init;

import net.glasslauncher.mods.landscaped.blocks.LandscapedBlocks;
import net.mine_diver.unsafeevents.listener.EventListener;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.modificationstation.stationapi.api.event.recipe.RecipeRegisterEvent;
import net.modificationstation.stationapi.api.recipe.CraftingRegistry;
import net.modificationstation.stationapi.api.registry.ItemRegistry;
import net.modificationstation.stationapi.api.registry.tag.ItemTags;
import net.modificationstation.stationapi.api.tag.TagKey;

public class GenericRecipes {

    @EventListener
    public static void init(RecipeRegisterEvent event) {
        if (event.recipeId == RecipeRegisterEvent.Vanilla.CRAFTING_SHAPELESS.type()) {
            CraftingRegistry.addShapelessRecipe(new ItemStack(LandscapedBlocks.Planks.acacia, 4), LandscapedBlocks.Wood.acacia);
            CraftingRegistry.addShapelessRecipe(new ItemStack(LandscapedBlocks.Planks.balsa, 4), LandscapedBlocks.Wood.balsa);
            CraftingRegistry.addShapelessRecipe(new ItemStack(LandscapedBlocks.Planks.baobab, 4), LandscapedBlocks.Wood.baobab);
            CraftingRegistry.addShapelessRecipe(new ItemStack(LandscapedBlocks.Planks.cherry, 4), LandscapedBlocks.Wood.cherry);
            CraftingRegistry.addShapelessRecipe(new ItemStack(LandscapedBlocks.Planks.chestnut, 4), LandscapedBlocks.Wood.chestnut);
            CraftingRegistry.addShapelessRecipe(new ItemStack(LandscapedBlocks.Planks.citrus, 4), LandscapedBlocks.Wood.citrus);
            CraftingRegistry.addShapelessRecipe(new ItemStack(LandscapedBlocks.Planks.cocobolo, 4), LandscapedBlocks.Wood.cocobolo);
            CraftingRegistry.addShapelessRecipe(new ItemStack(LandscapedBlocks.Planks.ebony, 4), LandscapedBlocks.Wood.ebony);
            CraftingRegistry.addShapelessRecipe(new ItemStack(LandscapedBlocks.Planks.giganteum, 4), LandscapedBlocks.Wood.giganteum);
            CraftingRegistry.addShapelessRecipe(new ItemStack(LandscapedBlocks.Planks.greenheart, 4), LandscapedBlocks.Wood.greenheart);
            CraftingRegistry.addShapelessRecipe(new ItemStack(LandscapedBlocks.Planks.ipe, 4), LandscapedBlocks.Wood.ipe);
            CraftingRegistry.addShapelessRecipe(new ItemStack(LandscapedBlocks.Planks.ironwood, 4), LandscapedBlocks.Wood.ironwood);
            CraftingRegistry.addShapelessRecipe(new ItemStack(LandscapedBlocks.Planks.kapok, 4), LandscapedBlocks.Wood.kapok);
            CraftingRegistry.addShapelessRecipe(new ItemStack(LandscapedBlocks.Planks.larch, 4), LandscapedBlocks.Wood.larch);
            CraftingRegistry.addShapelessRecipe(new ItemStack(LandscapedBlocks.Planks.lime, 4), LandscapedBlocks.Wood.lime);
            CraftingRegistry.addShapelessRecipe(new ItemStack(LandscapedBlocks.Planks.mahoe, 4), LandscapedBlocks.Wood.mahoe);
            CraftingRegistry.addShapelessRecipe(new ItemStack(LandscapedBlocks.Planks.mahogany, 4), LandscapedBlocks.Wood.mahogany);
            CraftingRegistry.addShapelessRecipe(new ItemStack(LandscapedBlocks.Planks.maple, 4), LandscapedBlocks.Wood.maple);
            CraftingRegistry.addShapelessRecipe(new ItemStack(LandscapedBlocks.Planks.padauk, 4), LandscapedBlocks.Wood.padauk);
            CraftingRegistry.addShapelessRecipe(new ItemStack(LandscapedBlocks.Planks.palm, 4), LandscapedBlocks.Wood.palm);
            CraftingRegistry.addShapelessRecipe(new ItemStack(LandscapedBlocks.Planks.papaya, 4), LandscapedBlocks.Wood.papaya);
            CraftingRegistry.addShapelessRecipe(new ItemStack(LandscapedBlocks.Planks.pine, 4), LandscapedBlocks.Wood.pine);
            CraftingRegistry.addShapelessRecipe(new ItemStack(LandscapedBlocks.Planks.plum, 4), LandscapedBlocks.Wood.plum);
            CraftingRegistry.addShapelessRecipe(new ItemStack(LandscapedBlocks.Planks.poplar, 4), LandscapedBlocks.Wood.poplar);
            CraftingRegistry.addShapelessRecipe(new ItemStack(LandscapedBlocks.Planks.sequoia, 4), LandscapedBlocks.Wood.sequoia);
            CraftingRegistry.addShapelessRecipe(new ItemStack(LandscapedBlocks.Planks.teak, 4), LandscapedBlocks.Wood.teak);
            CraftingRegistry.addShapelessRecipe(new ItemStack(LandscapedBlocks.Planks.walnut, 4), LandscapedBlocks.Wood.walnut);
            CraftingRegistry.addShapelessRecipe(new ItemStack(LandscapedBlocks.Planks.wenge, 4), LandscapedBlocks.Wood.wenge);
            CraftingRegistry.addShapelessRecipe(new ItemStack(LandscapedBlocks.Planks.willow, 4), LandscapedBlocks.Wood.willow);
            CraftingRegistry.addShapelessRecipe(new ItemStack(LandscapedBlocks.Planks.zebrawood, 4), LandscapedBlocks.Wood.zebrawood);

            CraftingRegistry.addShapedRecipe(new ItemStack(Item.STICK, 4), "P", "P", 'P', ItemTags.PLANKS);
        }
    }
}
