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

        ShapelessRecipeBuilder.shapeless(ModItems.MANXIUM_INGOT.get(), 1)
                .requires(ModItems.MANXIUM_NUGGET.get(), 9)
                .unlockedBy("has_manxium_ingot", inventoryTrigger(
                        ItemPredicate.Builder.item().of(ModItems.MANXIUM_INGOT.get()).build()))
                .save(consumer, "manxium_ingot_from_manxium_nuggets");
        ShapelessRecipeBuilder.shapeless(ModItems.MANXIUM_NUGGET.get(), 9)
                .requires(ModItems.MANXIUM_INGOT.get(), 1)
                .unlockedBy("has_manxium_ingot", inventoryTrigger(
                        ItemPredicate.Builder.item().of(ModItems.MANXIUM_INGOT.get()).build()))
                .save(consumer, "manxium_nuggets_from_manxium_ingot");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MANXIUM_BLOCK.get(), 1)
                .requires(ModItems.MANXIUM_INGOT.get(), 9)
                .unlockedBy("has_manxium_ingot", inventoryTrigger(
                        ItemPredicate.Builder.item().of(ModItems.MANXIUM_INGOT.get()).build()))
                .save(consumer, "manxium_block_from_manxium_ingots");
        ShapelessRecipeBuilder.shapeless(ModItems.MANXIUM_INGOT.get(), 9)
                .requires(ModBlocks.MANXIUM_BLOCK.get(), 1)
                .unlockedBy("has_manxium_ingot", inventoryTrigger(
                        ItemPredicate.Builder.item().of(ModItems.MANXIUM_INGOT.get()).build()))
                .save(consumer, "manxium_ingots_from_manxium_block");

        ShapelessRecipeBuilder.shapeless(ModItems.OHLY_INGOT.get(), 1)
                .requires(ModItems.OHLY_NUGGET.get(), 9)
                .unlockedBy("has_ohly_ingot", inventoryTrigger(
                        ItemPredicate.Builder.item().of(ModItems.OHLY_INGOT.get()).build()))
                .save(consumer, "ohly_ingot_from_ohly_nuggets");
        ShapelessRecipeBuilder.shapeless(ModItems.OHLY_NUGGET.get(), 9)
                .requires(ModItems.OHLY_INGOT.get(), 1)
                .unlockedBy("has_ohly_ingot", inventoryTrigger(
                        ItemPredicate.Builder.item().of(ModItems.OHLY_INGOT.get()).build()))
                .save(consumer, "ohly_nuggets_from_ohly_ingot");
        ShapelessRecipeBuilder.shapeless(ModBlocks.OHLY_BLOCK.get(), 1)
                .requires(ModItems.OHLY_INGOT.get(), 9)
                .unlockedBy("has_ohly_ingot", inventoryTrigger(
                        ItemPredicate.Builder.item().of(ModItems.OHLY_INGOT.get()).build()))
                .save(consumer, "ohly_block_from_ohly_ingots");
        ShapelessRecipeBuilder.shapeless(ModItems.OHLY_INGOT.get(), 9)
                .requires(ModBlocks.OHLY_BLOCK.get(), 1)
                .unlockedBy("has_ohly_ingot", inventoryTrigger(
                        ItemPredicate.Builder.item().of(ModItems.OHLY_INGOT.get()).build()))
                .save(consumer, "ohly_ingots_from_ohly_block");

        ShapelessRecipeBuilder.shapeless(ModItems.RAGOUTON_INGOT.get(), 1)
                .requires(ModItems.RAGOUTON_NUGGET.get(), 9)
                .unlockedBy("has_ragouton_ingot", inventoryTrigger(
                        ItemPredicate.Builder.item().of(ModItems.RAGOUTON_INGOT.get()).build()))
                .save(consumer, "ragouton_ingot_from_ragouton_nuggets");
        ShapelessRecipeBuilder.shapeless(ModItems.RAGOUTON_NUGGET.get(), 9)
                .requires(ModItems.RAGOUTON_INGOT.get(), 1)
                .unlockedBy("has_ragouton_ingot", inventoryTrigger(
                        ItemPredicate.Builder.item().of(ModItems.RAGOUTON_INGOT.get()).build()))
                .save(consumer, "ragouton_nuggets_from_ragouton_ingot");
        ShapelessRecipeBuilder.shapeless(ModBlocks.RAGOUTON_BLOCK.get(), 1)
                .requires(ModItems.RAGOUTON_INGOT.get(), 9)
                .unlockedBy("has_ragouton_ingot", inventoryTrigger(
                        ItemPredicate.Builder.item().of(ModItems.RAGOUTON_INGOT.get()).build()))
                .save(consumer, "ragouton_block_from_ragouton_ingots");
        ShapelessRecipeBuilder.shapeless(ModItems.RAGOUTON_INGOT.get(), 9)
                .requires(ModBlocks.RAGOUTON_BLOCK.get(), 1)
                .unlockedBy("has_ragouton_ingot", inventoryTrigger(
                        ItemPredicate.Builder.item().of(ModItems.RAGOUTON_INGOT.get()).build()))
                .save(consumer, "ragouton_ingots_from_ragouton_block");

        ShapelessRecipeBuilder.shapeless(ModItems.SLITHESE_INGOT.get(), 1)
                .requires(ModItems.SLITHESE_NUGGET.get(), 9)
                .unlockedBy("has_slithese_ingot", inventoryTrigger(
                        ItemPredicate.Builder.item().of(ModItems.SLITHESE_INGOT.get()).build()))
                .save(consumer, "slithese_ingot_from_slithese_nuggets");
        ShapelessRecipeBuilder.shapeless(ModItems.SLITHESE_NUGGET.get(), 9)
                .requires(ModItems.SLITHESE_INGOT.get(), 1)
                .unlockedBy("has_slithese_ingot", inventoryTrigger(
                        ItemPredicate.Builder.item().of(ModItems.SLITHESE_INGOT.get()).build()))
                .save(consumer, "slithese_nuggets_from_slithese_ingot");
        ShapelessRecipeBuilder.shapeless(ModBlocks.SLITHESE_BLOCK.get(), 1)
                .requires(ModItems.SLITHESE_INGOT.get(), 9)
                .unlockedBy("has_slithese_ingot", inventoryTrigger(
                        ItemPredicate.Builder.item().of(ModItems.SLITHESE_INGOT.get()).build()))
                .save(consumer, "slithese_block_from_slithese_ingots");
        ShapelessRecipeBuilder.shapeless(ModItems.SLITHESE_INGOT.get(), 9)
                .requires(ModBlocks.SLITHESE_BLOCK.get(), 1)
                .unlockedBy("has_slithese_ingot", inventoryTrigger(
                        ItemPredicate.Builder.item().of(ModItems.SLITHESE_INGOT.get()).build()))
                .save(consumer, "slithese_ingots_from_slithese_block");

        ShapelessRecipeBuilder.shapeless(ModItems.TARMENIS_INGOT.get(), 1)
                .requires(ModItems.TARMENIS_NUGGET.get(), 9)
                .unlockedBy("has_tarmenis_ingot", inventoryTrigger(
                        ItemPredicate.Builder.item().of(ModItems.TARMENIS_INGOT.get()).build()))
                .save(consumer, "tarmenis_ingot_from_tarmenis_nuggets");
        ShapelessRecipeBuilder.shapeless(ModItems.TARMENIS_NUGGET.get(), 9)
                .requires(ModItems.TARMENIS_INGOT.get(), 1)
                .unlockedBy("has_tarmenis_ingot", inventoryTrigger(
                        ItemPredicate.Builder.item().of(ModItems.TARMENIS_INGOT.get()).build()))
                .save(consumer, "tarmenis_nuggets_from_tarmenis_ingot");
        ShapelessRecipeBuilder.shapeless(ModBlocks.TARMENIS_BLOCK.get(), 1)
                .requires(ModItems.TARMENIS_INGOT.get(), 9)
                .unlockedBy("has_tarmenis_ingot", inventoryTrigger(
                        ItemPredicate.Builder.item().of(ModItems.TARMENIS_INGOT.get()).build()))
                .save(consumer, "tarmenis_block_from_tarmenis_ingots");
        ShapelessRecipeBuilder.shapeless(ModItems.TARMENIS_INGOT.get(), 9)
                .requires(ModBlocks.TARMENIS_BLOCK.get(), 1)
                .unlockedBy("has_tarmenis_ingot", inventoryTrigger(
                        ItemPredicate.Builder.item().of(ModItems.TARMENIS_INGOT.get()).build()))
                .save(consumer, "tarmenis_ingots_from_tarmenis_block");

        ShapelessRecipeBuilder.shapeless(ModItems.VIGNASS_INGOT.get(), 1)
                .requires(ModItems.VIGNASS_NUGGET.get(), 9)
                .unlockedBy("has_vignass_ingot", inventoryTrigger(
                        ItemPredicate.Builder.item().of(ModItems.VIGNASS_INGOT.get()).build()))
                .save(consumer, "vignass_ingot_from_vignass_nuggets");
        ShapelessRecipeBuilder.shapeless(ModItems.VIGNASS_NUGGET.get(), 9)
                .requires(ModItems.VIGNASS_INGOT.get(), 1)
                .unlockedBy("has_vignass_ingot", inventoryTrigger(
                        ItemPredicate.Builder.item().of(ModItems.VIGNASS_INGOT.get()).build()))
                .save(consumer, "vignass_nuggets_from_vignass_ingot");
        ShapelessRecipeBuilder.shapeless(ModBlocks.VIGNASS_BLOCK.get(), 1)
                .requires(ModItems.VIGNASS_INGOT.get(), 9)
                .unlockedBy("has_vignass_ingot", inventoryTrigger(
                        ItemPredicate.Builder.item().of(ModItems.VIGNASS_INGOT.get()).build()))
                .save(consumer, "vignass_block_from_vignass_ingots");
        ShapelessRecipeBuilder.shapeless(ModItems.VIGNASS_INGOT.get(), 9)
                .requires(ModBlocks.VIGNASS_BLOCK.get(), 1)
                .unlockedBy("has_vignass_ingot", inventoryTrigger(
                        ItemPredicate.Builder.item().of(ModItems.VIGNASS_INGOT.get()).build()))
                .save(consumer, "vignass_ingots_from_vignass_block");

        ShapelessRecipeBuilder.shapeless(ModItems.VOLUCIERA_INGOT.get(), 1)
                .requires(ModItems.VOLUCIERA_NUGGET.get(), 9)
                .unlockedBy("has_voluciera_ingot", inventoryTrigger(
                        ItemPredicate.Builder.item().of(ModItems.VOLUCIERA_INGOT.get()).build()))
                .save(consumer, "voluciera_ingot_from_voluciera_nuggets");
        ShapelessRecipeBuilder.shapeless(ModItems.VOLUCIERA_NUGGET.get(), 9)
                .requires(ModItems.VOLUCIERA_INGOT.get(), 1)
                .unlockedBy("has_voluciera_ingot", inventoryTrigger(
                        ItemPredicate.Builder.item().of(ModItems.VOLUCIERA_INGOT.get()).build()))
                .save(consumer, "voluciera_nuggets_from_voluciera_ingot");
        ShapelessRecipeBuilder.shapeless(ModBlocks.VOLUCIERA_BLOCK.get(), 1)
                .requires(ModItems.VOLUCIERA_INGOT.get(), 9)
                .unlockedBy("has_voluciera_ingot", inventoryTrigger(
                        ItemPredicate.Builder.item().of(ModItems.VOLUCIERA_INGOT.get()).build()))
                .save(consumer, "voluciera_block_from_voluciera_ingots");
        ShapelessRecipeBuilder.shapeless(ModItems.VOLUCIERA_INGOT.get(), 9)
                .requires(ModBlocks.VOLUCIERA_BLOCK.get(), 1)
                .unlockedBy("has_voluciera_ingot", inventoryTrigger(
                        ItemPredicate.Builder.item().of(ModItems.VOLUCIERA_INGOT.get()).build()))
                .save(consumer, "voluciera_ingots_from_voluciera_block");

        ShapelessRecipeBuilder.shapeless(ModItems.YGGS_INGOT.get(), 1)
                .requires(ModItems.YGGS_NUGGET.get(), 9)
                .unlockedBy("has_yggs_ingot", inventoryTrigger(
                        ItemPredicate.Builder.item().of(ModItems.YGGS_INGOT.get()).build()))
                .save(consumer, "yggs_ingot_from_yggs_nuggets");
        ShapelessRecipeBuilder.shapeless(ModItems.YGGS_NUGGET.get(), 9)
                .requires(ModItems.YGGS_INGOT.get(), 1)
                .unlockedBy("has_yggs_ingot", inventoryTrigger(
                        ItemPredicate.Builder.item().of(ModItems.YGGS_INGOT.get()).build()))
                .save(consumer, "yggs_nuggets_from_yggs_ingot");
        ShapelessRecipeBuilder.shapeless(ModBlocks.YGGS_BLOCK.get(), 1)
                .requires(ModItems.YGGS_INGOT.get(), 9)
                .unlockedBy("has_yggs_ingot", inventoryTrigger(
                        ItemPredicate.Builder.item().of(ModItems.YGGS_INGOT.get()).build()))
                .save(consumer, "yggs_block_fromyggs_ingots");
        ShapelessRecipeBuilder.shapeless(ModItems.YGGS_INGOT.get(), 9)
                .requires(ModBlocks.YGGS_BLOCK.get(), 1)
                .unlockedBy("has_yggs_ingot", inventoryTrigger(
                        ItemPredicate.Builder.item().of(ModItems.YGGS_INGOT.get()).build()))
                .save(consumer, "yggs_ingots_from_yggs_block");

    }
}
