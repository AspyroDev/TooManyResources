package dev.aspyro.toomanyresources.datagen;

import dev.aspyro.toomanyresources.block.ModBlocks;
import dev.aspyro.toomanyresources.item.ModItems;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.data.recipes.ShapelessRecipeBuilder;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(DataGenerator p_125973_) {
        super(p_125973_);
    }

    @Override
    protected void buildCraftingRecipes(Consumer<FinishedRecipe> consumer) {

        ingotFromNuggetsPacking(consumer, ModItems.BAMIRITE_INGOT.get(), ModItems.BAMIRITE_NUGGET.get(), ModItems.BAMIRITE_INGOT.get());
        nuggetsFromIngotUnpacking(consumer, ModItems.BAMIRITE_NUGGET.get(), ModItems.BAMIRITE_INGOT.get(), ModItems.BAMIRITE_INGOT.get());
        blockFromIngotsPacking(consumer, ModBlocks.BAMIRITE_BLOCK.get(), ModItems.BAMIRITE_INGOT.get(), ModItems.BAMIRITE_INGOT.get());
        ingotsFromBlockUnpacking(consumer, ModItems.BAMIRITE_INGOT.get(), ModBlocks.BAMIRITE_BLOCK.get(), ModItems.BAMIRITE_INGOT.get());

        ingotFromNuggetsPacking(consumer, ModItems.BLUE_DRAGCITE_INGOT.get(), ModItems.BLUE_DRAGCITE_NUGGET.get(), ModItems.BLUE_DRAGCITE_INGOT.get());
        nuggetsFromIngotUnpacking(consumer, ModItems.BLUE_DRAGCITE_NUGGET.get(), ModItems.BLUE_DRAGCITE_INGOT.get(), ModItems.BLUE_DRAGCITE_INGOT.get());
        blockFromIngotsPacking(consumer, ModBlocks.BLUE_DRAGCITE_BLOCK.get(), ModItems.BLUE_DRAGCITE_INGOT.get(), ModItems.BLUE_DRAGCITE_INGOT.get());
        ingotsFromBlockUnpacking(consumer, ModItems.BLUE_DRAGCITE_INGOT.get(), ModBlocks.BLUE_DRAGCITE_BLOCK.get(), ModItems.BLUE_DRAGCITE_INGOT.get());

        ingotFromNuggetsPacking(consumer, ModItems.EISSELTE_INGOT.get(), ModItems.EISSELTE_NUGGET.get(), ModItems.EISSELTE_INGOT.get());
        nuggetsFromIngotUnpacking(consumer, ModItems.EISSELTE_NUGGET.get(), ModItems.EISSELTE_INGOT.get(), ModItems.EISSELTE_INGOT.get());
        blockFromIngotsPacking(consumer, ModBlocks.EISSELTE_BLOCK.get(), ModItems.EISSELTE_INGOT.get(), ModItems.EISSELTE_INGOT.get());
        ingotsFromBlockUnpacking(consumer, ModItems.EISSELTE_INGOT.get(), ModBlocks.EISSELTE_BLOCK.get(), ModItems.EISSELTE_INGOT.get());

        ingotFromNuggetsPacking(consumer, ModItems.HELMINIUM_INGOT.get(), ModItems.HELMINIUM_NUGGET.get(), ModItems.HELMINIUM_INGOT.get());
        nuggetsFromIngotUnpacking(consumer, ModItems.HELMINIUM_NUGGET.get(), ModItems.HELMINIUM_INGOT.get(), ModItems.HELMINIUM_INGOT.get());
        blockFromIngotsPacking(consumer, ModBlocks.HELMINIUM_BLOCK.get(), ModItems.HELMINIUM_INGOT.get(), ModItems.HELMINIUM_INGOT.get());
        ingotsFromBlockUnpacking(consumer, ModItems.HELMINIUM_INGOT.get(), ModBlocks.HELMINIUM_BLOCK.get(), ModItems.HELMINIUM_INGOT.get());

        ingotFromNuggetsPacking(consumer, ModItems.JEPERCKSTONE_INGOT.get(), ModItems.JEPERCKSTONE_NUGGET.get(), ModItems.JEPERCKSTONE_INGOT.get());
        nuggetsFromIngotUnpacking(consumer, ModItems.JEPERCKSTONE_NUGGET.get(), ModItems.JEPERCKSTONE_INGOT.get(), ModItems.JEPERCKSTONE_INGOT.get());
        blockFromIngotsPacking(consumer, ModBlocks.JEPERCKSTONE_BLOCK.get(), ModItems.JEPERCKSTONE_INGOT.get(), ModItems.JEPERCKSTONE_INGOT.get());
        ingotsFromBlockUnpacking(consumer, ModItems.JEPERCKSTONE_INGOT.get(), ModBlocks.JEPERCKSTONE_BLOCK.get(), ModItems.JEPERCKSTONE_INGOT.get());

        ingotFromNuggetsPacking(consumer, ModItems.KHELSTONE_INGOT.get(), ModItems.KHELSTONE_NUGGET.get(), ModItems.KHELSTONE_INGOT.get());
        nuggetsFromIngotUnpacking(consumer, ModItems.KHELSTONE_NUGGET.get(), ModItems.KHELSTONE_INGOT.get(), ModItems.KHELSTONE_INGOT.get());
        blockFromIngotsPacking(consumer, ModBlocks.KHELSTONE_BLOCK.get(), ModItems.KHELSTONE_INGOT.get(), ModItems.KHELSTONE_INGOT.get());
        ingotsFromBlockUnpacking(consumer, ModItems.KHELSTONE_INGOT.get(), ModBlocks.KHELSTONE_BLOCK.get(), ModItems.KHELSTONE_INGOT.get());

        ingotFromNuggetsPacking(consumer, ModItems.KIRIONITE_INGOT.get(), ModItems.KIRIONITE_NUGGET.get(), ModItems.KIRIONITE_INGOT.get());
        nuggetsFromIngotUnpacking(consumer, ModItems.KIRIONITE_NUGGET.get(), ModItems.KIRIONITE_INGOT.get(), ModItems.KIRIONITE_INGOT.get());
        blockFromIngotsPacking(consumer, ModBlocks.KIRIONITE_BLOCK.get(), ModItems.KIRIONITE_INGOT.get(), ModItems.KIRIONITE_INGOT.get());
        ingotsFromBlockUnpacking(consumer, ModItems.KIRIONITE_INGOT.get(), ModBlocks.KIRIONITE_BLOCK.get(), ModItems.KIRIONITE_INGOT.get());

        ingotFromNuggetsPacking(consumer, ModItems.MANXIUM_INGOT.get(), ModItems.MANXIUM_NUGGET.get(), ModItems.MANXIUM_INGOT.get());
        nuggetsFromIngotUnpacking(consumer, ModItems.MANXIUM_NUGGET.get(), ModItems.MANXIUM_INGOT.get(), ModItems.MANXIUM_INGOT.get());
        blockFromIngotsPacking(consumer, ModBlocks.MANXIUM_BLOCK.get(), ModItems.MANXIUM_INGOT.get(), ModItems.MANXIUM_INGOT.get());
        ingotsFromBlockUnpacking(consumer, ModItems.MANXIUM_INGOT.get(), ModBlocks.MANXIUM_BLOCK.get(), ModItems.MANXIUM_INGOT.get());

        ingotFromNuggetsPacking(consumer, ModItems.OHLY_INGOT.get(), ModItems.OHLY_NUGGET.get(), ModItems.OHLY_INGOT.get());
        nuggetsFromIngotUnpacking(consumer, ModItems.OHLY_NUGGET.get(), ModItems.OHLY_INGOT.get(), ModItems.OHLY_INGOT.get());
        blockFromIngotsPacking(consumer, ModBlocks.OHLY_BLOCK.get(), ModItems.OHLY_INGOT.get(), ModItems.OHLY_INGOT.get());
        ingotsFromBlockUnpacking(consumer, ModItems.OHLY_INGOT.get(), ModBlocks.OHLY_BLOCK.get(), ModItems.OHLY_INGOT.get());

        ingotFromNuggetsPacking(consumer, ModItems.RAGOUTON_INGOT.get(), ModItems.RAGOUTON_NUGGET.get(), ModItems.RAGOUTON_INGOT.get());
        nuggetsFromIngotUnpacking(consumer,ModItems.RAGOUTON_NUGGET.get(), ModItems.RAGOUTON_INGOT.get(), ModItems.RAGOUTON_INGOT.get());
        blockFromIngotsPacking(consumer, ModBlocks.RAGOUTON_BLOCK.get(), ModItems.RAGOUTON_INGOT.get(), ModItems.RAGOUTON_INGOT.get());
        ingotsFromBlockUnpacking(consumer, ModItems.RAGOUTON_INGOT.get(), ModBlocks.RAGOUTON_BLOCK.get(), ModItems.RAGOUTON_INGOT.get());

        ingotFromNuggetsPacking(consumer, ModItems.SLITHESE_INGOT.get(), ModItems.SLITHESE_NUGGET.get(), ModItems.SLITHESE_INGOT.get());
        nuggetsFromIngotUnpacking(consumer, ModItems.SLITHESE_NUGGET.get(), ModItems.SLITHESE_INGOT.get(), ModItems.SLITHESE_INGOT.get());
        blockFromIngotsPacking(consumer, ModBlocks.SLITHESE_BLOCK.get(), ModItems.SLITHESE_INGOT.get(), ModItems.SLITHESE_INGOT.get());
        ingotsFromBlockUnpacking(consumer, ModItems.SLITHESE_INGOT.get(), ModBlocks.SLITHESE_BLOCK.get(), ModItems.SLITHESE_INGOT.get());

        ingotFromNuggetsPacking(consumer, ModItems.TARMENIS_INGOT.get(), ModItems.TARMENIS_NUGGET.get(), ModItems.TARMENIS_INGOT.get());
        nuggetsFromIngotUnpacking(consumer, ModItems.TARMENIS_NUGGET.get(), ModItems.TARMENIS_INGOT.get(), ModItems.TARMENIS_INGOT.get());
        blockFromIngotsPacking(consumer, ModBlocks.TARMENIS_BLOCK.get(), ModItems.TARMENIS_INGOT.get(), ModItems.TARMENIS_INGOT.get());
        ingotsFromBlockUnpacking(consumer, ModItems.TARMENIS_INGOT.get(), ModBlocks.TARMENIS_BLOCK.get(), ModItems.TARMENIS_INGOT.get());

        ingotFromNuggetsPacking(consumer, ModItems.VIGNASS_INGOT.get(), ModItems.VIGNASS_NUGGET.get(), ModItems.VIGNASS_INGOT.get());
        nuggetsFromIngotUnpacking(consumer, ModItems.VIGNASS_NUGGET.get(), ModItems.VIGNASS_INGOT.get(), ModItems.VIGNASS_INGOT.get());
        blockFromIngotsPacking(consumer, ModBlocks.VIGNASS_BLOCK.get(), ModItems.VIGNASS_INGOT.get(), ModItems.VIGNASS_INGOT.get());
        ingotsFromBlockUnpacking(consumer, ModItems.VIGNASS_INGOT.get(), ModBlocks.VIGNASS_BLOCK.get(), ModItems.VIGNASS_INGOT.get());

        ingotFromNuggetsPacking(consumer, ModItems.VOLUCIERA_INGOT.get(), ModItems.VOLUCIERA_NUGGET.get(), ModItems.VOLUCIERA_INGOT.get());
        nuggetsFromIngotUnpacking(consumer, ModItems.VOLUCIERA_NUGGET.get(), ModItems.VOLUCIERA_INGOT.get(), ModItems.VOLUCIERA_INGOT.get());
        blockFromIngotsPacking(consumer, ModBlocks.VOLUCIERA_BLOCK.get(), ModItems.VOLUCIERA_INGOT.get(), ModItems.VOLUCIERA_INGOT.get());
        ingotsFromBlockUnpacking(consumer, ModItems.VOLUCIERA_INGOT.get(), ModBlocks.VOLUCIERA_BLOCK.get(), ModItems.VOLUCIERA_INGOT.get());

        ingotFromNuggetsPacking(consumer, ModItems.YGGS_INGOT.get(), ModItems.YGGS_NUGGET.get(), ModItems.YGGS_INGOT.get());
        nuggetsFromIngotUnpacking(consumer, ModItems.YGGS_NUGGET.get(), ModItems.YGGS_INGOT.get(), ModItems.YGGS_INGOT.get());
        blockFromIngotsPacking(consumer, ModBlocks.YGGS_BLOCK.get(), ModItems.YGGS_INGOT.get(), ModItems.YGGS_INGOT.get());
        ingotsFromBlockUnpacking(consumer, ModItems.YGGS_INGOT.get(), ModBlocks.YGGS_BLOCK.get(), ModItems.YGGS_INGOT.get());
    }

    private void ingotFromNuggetsPacking(Consumer<FinishedRecipe> consumer,
                ItemLike ingotItem, ItemLike nuggetItem, ItemLike advancementItem) {

        ShapelessRecipeBuilder.shapeless(ingotItem, 1)
                .requires(nuggetItem, 9)
                .unlockedBy("has_" + getItemName(advancementItem),
                        inventoryTrigger(ItemPredicate.Builder.item().of(advancementItem).build()))
                .save(consumer, getItemName(ingotItem) + "_from_" + getItemName(nuggetItem) + "s");
        }

    private void nuggetsFromIngotUnpacking(Consumer<FinishedRecipe> consumer, ItemLike nuggetItem,
                ItemLike ingotItem, ItemLike advancementItem) {

        ShapelessRecipeBuilder.shapeless(nuggetItem, 9)
                .requires(ingotItem, 1)
                .unlockedBy("has_" + getItemName(advancementItem),
                        inventoryTrigger(ItemPredicate.Builder.item().of(advancementItem).build()))
                .save(consumer, getItemName(nuggetItem) + "s_from_" + getItemName(ingotItem));
    }

    private void blockFromIngotsPacking(Consumer<FinishedRecipe> consumer, ItemLike blockItem,
                ItemLike ingotItem, ItemLike advancementItem) {

        ShapelessRecipeBuilder.shapeless(blockItem, 1)
                .requires(ingotItem, 9)
                .unlockedBy("has_" + getItemName(advancementItem), inventoryTrigger(
                        ItemPredicate.Builder.item().of(advancementItem).build()))
                .save(consumer, getItemName(blockItem) + "_from_" + getItemName(ingotItem) + "s");
    }

    private void ingotsFromBlockUnpacking(Consumer<FinishedRecipe> consumer, ItemLike ingotItem,
                ItemLike blockItem, ItemLike advancementItem) {

        ShapelessRecipeBuilder.shapeless(ingotItem, 9)
                .requires(blockItem, 1)
                .unlockedBy("has_" + getItemName(advancementItem), inventoryTrigger(
                        ItemPredicate.Builder.item().of(advancementItem).build()))
                .save(consumer, getItemName(ingotItem) + "s_from_" + getItemName(blockItem));

    }
}
