package dev.aspyro.toomanyresources.datagen;

import dev.aspyro.toomanyresources.block.ModBlocks;
import dev.aspyro.toomanyresources.item.ModItems;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.data.recipes.ShapelessRecipeBuilder;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(DataGenerator p_125973_) {
        super(p_125973_);
    }

    @Override
    protected void buildCraftingRecipes(Consumer<FinishedRecipe> consumer) {

        ShapelessRecipeBuilder.shapeless(ModItems.BAMIRITE_INGOT.get(), 1)
                .requires(ModItems.BAMIRITE_NUGGET.get(), 9)
                .unlockedBy("has_bamirite_ingot", inventoryTrigger(
                        ItemPredicate.Builder.item().of(ModItems.BAMIRITE_INGOT.get()).build()))
                .save(consumer, "bamirite_ingot_from_bamirite_nuggets");
        ShapelessRecipeBuilder.shapeless(ModItems.BAMIRITE_NUGGET.get(), 9)
                .requires(ModItems.BAMIRITE_INGOT.get(), 1)
                .unlockedBy("has_bamirite_ingot", inventoryTrigger(
                        ItemPredicate.Builder.item().of(ModItems.BAMIRITE_INGOT.get()).build()))
                .save(consumer, "bamirite_nuggets_from_bamirite_ingot");
        ShapelessRecipeBuilder.shapeless(ModBlocks.BAMIRITE_BLOCK.get(), 1)
                .requires(ModItems.BAMIRITE_INGOT.get(), 9)
                .unlockedBy("has_bamirite_ingot", inventoryTrigger(
                        ItemPredicate.Builder.item().of(ModItems.BAMIRITE_INGOT.get()).build()))
                .save(consumer, "bamirite_block_from_bamirite_ingots");
        ShapelessRecipeBuilder.shapeless(ModItems.BAMIRITE_INGOT.get(), 9)
                .requires(ModBlocks.BAMIRITE_BLOCK.get(), 1)
                .unlockedBy("has_bamirite_ingot", inventoryTrigger(
                        ItemPredicate.Builder.item().of(ModItems.BAMIRITE_INGOT.get()).build()))
                .save(consumer, "bamirite_ingots_from_bamirite_block");

        ShapelessRecipeBuilder.shapeless(ModItems.BLUE_DRAGCITE_INGOT.get(), 1)
                .requires(ModItems.BLUE_DRAGCITE_NUGGET.get(), 9)
                .unlockedBy("has_blue_dragcite_ingot", inventoryTrigger(
                        ItemPredicate.Builder.item().of(ModItems.BLUE_DRAGCITE_INGOT.get()).build()))
                .save(consumer, "blue_dragcite_ingot_from_blue_dragcite_nuggets");
        ShapelessRecipeBuilder.shapeless(ModItems.BLUE_DRAGCITE_NUGGET.get(), 9)
                .requires(ModItems.BLUE_DRAGCITE_INGOT.get(), 1)
                .unlockedBy("has_blue_dragcite_ingot", inventoryTrigger(
                        ItemPredicate.Builder.item().of(ModItems.BLUE_DRAGCITE_INGOT.get()).build()))
                .save(consumer, "blue_dragcite_nuggets_from_blue_dragcite_ingot");
        ShapelessRecipeBuilder.shapeless(ModBlocks.BLUE_DRAGCITE_BLOCK.get(), 1)
                .requires(ModItems.BLUE_DRAGCITE_INGOT.get(), 9)
                .unlockedBy("has_blue_dragcite_ingot", inventoryTrigger(
                        ItemPredicate.Builder.item().of(ModItems.BLUE_DRAGCITE_INGOT.get()).build()))
                .save(consumer, "blue_dragcite_block_from_blue_dragcite_ingots");
        ShapelessRecipeBuilder.shapeless(ModItems.BLUE_DRAGCITE_INGOT.get(), 9)
                .requires(ModBlocks.BLUE_DRAGCITE_BLOCK.get(), 1)
                .unlockedBy("has_blue_dragcite_ingot", inventoryTrigger(
                        ItemPredicate.Builder.item().of(ModItems.BLUE_DRAGCITE_INGOT.get()).build()))
                .save(consumer, "blue_dragcite_ingots_from_blue_dragcite_block");

        ShapelessRecipeBuilder.shapeless(ModItems.EISSELTE_INGOT.get(), 1)
                .requires(ModItems.EISSELTE_NUGGET.get(), 9)
                .unlockedBy("has_eisselte_ingot", inventoryTrigger(
                        ItemPredicate.Builder.item().of(ModItems.EISSELTE_INGOT.get()).build()))
                .save(consumer, "eisselte_ingot_from_eisselte_nuggets");
        ShapelessRecipeBuilder.shapeless(ModItems.EISSELTE_NUGGET.get(), 9)
                .requires(ModItems.EISSELTE_INGOT.get(), 1)
                .unlockedBy("has_eisselte_ingot", inventoryTrigger(
                        ItemPredicate.Builder.item().of(ModItems.EISSELTE_INGOT.get()).build()))
                .save(consumer, "eisselte_nuggets_from_eisselte_ingot");
        ShapelessRecipeBuilder.shapeless(ModBlocks.EISSELTE_BLOCK.get(), 1)
                .requires(ModItems.EISSELTE_INGOT.get(), 9)
                .unlockedBy("has_eisselte_ingot", inventoryTrigger(
                        ItemPredicate.Builder.item().of(ModItems.EISSELTE_INGOT.get()).build()))
                .save(consumer, "eisselte_block_from_eisselte_ingots");
        ShapelessRecipeBuilder.shapeless(ModItems.EISSELTE_INGOT.get(), 9)
                .requires(ModBlocks.EISSELTE_BLOCK.get(), 1)
                .unlockedBy("has_eisselte_ingot", inventoryTrigger(
                        ItemPredicate.Builder.item().of(ModItems.EISSELTE_INGOT.get()).build()))
                .save(consumer, "eisselte_ingots_from_eisselte_block");

        ShapelessRecipeBuilder.shapeless(ModItems.HELMINIUM_INGOT.get(), 1)
                .requires(ModItems.HELMINIUM_NUGGET.get(), 9)
                .unlockedBy("has_helminium_ingot", inventoryTrigger(
                        ItemPredicate.Builder.item().of(ModItems.HELMINIUM_INGOT.get()).build()))
                .save(consumer, "helminium_ingot_from_helminium_nuggets");
        ShapelessRecipeBuilder.shapeless(ModItems.HELMINIUM_NUGGET.get(), 9)
                .requires(ModItems.HELMINIUM_INGOT.get(), 1)
                .unlockedBy("has_helminium_ingot", inventoryTrigger(
                        ItemPredicate.Builder.item().of(ModItems.HELMINIUM_INGOT.get()).build()))
                .save(consumer, "helminium_nuggets_from_helminium_ingot");
        ShapelessRecipeBuilder.shapeless(ModBlocks.HELMINIUM_BLOCK.get(), 1)
                .requires(ModItems.HELMINIUM_INGOT.get(), 9)
                .unlockedBy("has_helminium_ingot", inventoryTrigger(
                        ItemPredicate.Builder.item().of(ModItems.HELMINIUM_INGOT.get()).build()))
                .save(consumer, "helminium_block_from_helminium_ingots");
        ShapelessRecipeBuilder.shapeless(ModItems.HELMINIUM_INGOT.get(), 9)
                .requires(ModBlocks.HELMINIUM_BLOCK.get(), 1)
                .unlockedBy("has_helminium_ingot", inventoryTrigger(
                        ItemPredicate.Builder.item().of(ModItems.HELMINIUM_INGOT.get()).build()))
                .save(consumer, "helminium_ingots_from_helminium_block");

        ShapelessRecipeBuilder.shapeless(ModItems.JEPERCKSTONE_INGOT.get(), 1)
                .requires(ModItems.JEPERCKSTONE_NUGGET.get(), 9)
                .unlockedBy("has_jeperckstone_ingot", inventoryTrigger(
                        ItemPredicate.Builder.item().of(ModItems.JEPERCKSTONE_INGOT.get()).build()))
                .save(consumer, "jeperckstone_ingot_from_jeperckstone_nuggets");
        ShapelessRecipeBuilder.shapeless(ModItems.JEPERCKSTONE_NUGGET.get(), 9)
                .requires(ModItems.JEPERCKSTONE_INGOT.get(), 1)
                .unlockedBy("has_jeperckstone_ingot", inventoryTrigger(
                        ItemPredicate.Builder.item().of(ModItems.JEPERCKSTONE_INGOT.get()).build()))
                .save(consumer, "jeperckstone_nuggets_from_jeperckstone_ingot");
        ShapelessRecipeBuilder.shapeless(ModBlocks.JEPERCKSTONE_BLOCK.get(), 1)
                .requires(ModItems.JEPERCKSTONE_INGOT.get(), 9)
                .unlockedBy("has_jeperckstone_ingot", inventoryTrigger(
                        ItemPredicate.Builder.item().of(ModItems.JEPERCKSTONE_INGOT.get()).build()))
                .save(consumer, "jeperckstone_block_from_jeperckstone_ingots");
        ShapelessRecipeBuilder.shapeless(ModItems.JEPERCKSTONE_INGOT.get(), 9)
                .requires(ModBlocks.JEPERCKSTONE_BLOCK.get(), 1)
                .unlockedBy("has_jeperckstone_ingot", inventoryTrigger(
                        ItemPredicate.Builder.item().of(ModItems.JEPERCKSTONE_INGOT.get()).build()))
                .save(consumer, "jeperckstone_ingots_from_jeperckstone_block");

        ShapelessRecipeBuilder.shapeless(ModItems.KHELSTONE_INGOT.get(), 1)
                .requires(ModItems.KHELSTONE_NUGGET.get(), 9)
                .unlockedBy("has_khelstone_ingot", inventoryTrigger(
                        ItemPredicate.Builder.item().of(ModItems.KHELSTONE_INGOT.get()).build()))
                .save(consumer, "khelstone_ingot_from_khelstone_nuggets");
        ShapelessRecipeBuilder.shapeless(ModItems.KHELSTONE_NUGGET.get(), 9)
                .requires(ModItems.KHELSTONE_INGOT.get(), 1)
                .unlockedBy("has_khelstone_ingot", inventoryTrigger(
                        ItemPredicate.Builder.item().of(ModItems.KHELSTONE_INGOT.get()).build()))
                .save(consumer, "khelstone_nuggets_from_khelstone_ingot");
        ShapelessRecipeBuilder.shapeless(ModBlocks.KHELSTONE_BLOCK.get(), 1)
                .requires(ModItems.KHELSTONE_INGOT.get(), 9)
                .unlockedBy("has_khelstone_ingot", inventoryTrigger(
                        ItemPredicate.Builder.item().of(ModItems.KHELSTONE_INGOT.get()).build()))
                .save(consumer, "khelstone_block_from_khelstone_ingots");
        ShapelessRecipeBuilder.shapeless(ModItems.KHELSTONE_INGOT.get(), 9)
                .requires(ModBlocks.KHELSTONE_BLOCK.get(), 1)
                .unlockedBy("has_khelstone_ingot", inventoryTrigger(
                        ItemPredicate.Builder.item().of(ModItems.KHELSTONE_INGOT.get()).build()))
                .save(consumer, "khelstone_ingots_from_khelstone_block");

        ShapelessRecipeBuilder.shapeless(ModItems.KIRIONITE_INGOT.get(), 1)
                .requires(ModItems.KIRIONITE_NUGGET.get(), 9)
                .unlockedBy("has_kirionite_ingot", inventoryTrigger(
                        ItemPredicate.Builder.item().of(ModItems.KIRIONITE_INGOT.get()).build()))
                .save(consumer, "kirionite_ingot_from_kirionite_nuggets");
        ShapelessRecipeBuilder.shapeless(ModItems.KIRIONITE_NUGGET.get(), 9)
                .requires(ModItems.KIRIONITE_INGOT.get(), 1)
                .unlockedBy("has_kirionite_ingot", inventoryTrigger(
                        ItemPredicate.Builder.item().of(ModItems.KIRIONITE_INGOT.get()).build()))
                .save(consumer, "kirionite_nuggets_from_kirionite_ingot");
        ShapelessRecipeBuilder.shapeless(ModBlocks.KIRIONITE_BLOCK.get(), 1)
                .requires(ModItems.KIRIONITE_INGOT.get(), 9)
                .unlockedBy("has_kirionite_ingot", inventoryTrigger(
                        ItemPredicate.Builder.item().of(ModItems.KIRIONITE_INGOT.get()).build()))
                .save(consumer, "kirionite_block_from_kirionite_ingots");
        ShapelessRecipeBuilder.shapeless(ModItems.KIRIONITE_INGOT.get(), 9)
                .requires(ModBlocks.KIRIONITE_BLOCK.get(), 1)
                .unlockedBy("has_kirionite_ingot", inventoryTrigger(
                        ItemPredicate.Builder.item().of(ModItems.KIRIONITE_INGOT.get()).build()))
                .save(consumer, "kirionite_ingots_from_kirionite_block");



        /*nineBlockStorageRecipes(consumer, ModItems.MANXIUM_INGOT.get(), ModBlocks.MANXIUM_BLOCK.get());
        nineBlockStorageRecipes(consumer, ModItems.SLITHESE_INGOT.get(), ModBlocks.SLITHESE_BLOCK.get());
        nineBlockStorageRecipes(consumer, ModItems.VOLUCIERA_INGOT.get(), ModBlocks.VOLUCIERA_BLOCK.get());
        nineBlockStorageRecipes(consumer, ModItems.YGGS_INGOT.get(), ModBlocks.YGGS_BLOCK.get());
        nineBlockStorageRecipes(consumer, ModItems.OHLY_INGOT.get(), ModBlocks.OHLY_BLOCK.get());
        nineBlockStorageRecipes(consumer, ModItems.TARMENIS_INGOT.get(), ModBlocks.TARMENIS_BLOCK.get());
        nineBlockStorageRecipes(consumer, ModItems.VIGNASS_INGOT.get(), ModBlocks.VIGNASS_BLOCK.get());
        nineBlockStorageRecipes(consumer, ModItems.RAGOUTON_INGOT.get(), ModBlocks.RAGOUTON_BLOCK.get());*/
    }
}
