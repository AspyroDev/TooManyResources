package dev.aspyro.toomanyresources.datagen;

import dev.aspyro.toomanyresources.block.ModBlocks;
import dev.aspyro.toomanyresources.item.ModItems;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.data.recipes.ShapelessRecipeBuilder;
import net.minecraft.world.item.Items;
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
        compressBlock(consumer, ModBlocks.BAMIRITE_BLOCK.get(), ModBlocks.COMPRESSED_BAMIRITE_BLOCK_1.get(),
                ModItems.BAMIRITE_INGOT.get(), "compressed_bamirite_block_1x_from_bamirite_blocks");
        compressBlock(consumer, ModBlocks.COMPRESSED_BAMIRITE_BLOCK_1.get(), ModBlocks.COMPRESSED_BAMIRITE_BLOCK_2.get(),
                ModItems.BAMIRITE_INGOT.get(), "compressed_bamirite_block_2x_from_compressed_bamirite_blocks_1x");
        compressBlock(consumer, ModBlocks.COMPRESSED_BAMIRITE_BLOCK_2.get(), ModBlocks.COMPRESSED_BAMIRITE_BLOCK_3.get(),
                ModItems.BAMIRITE_INGOT.get(), "compressed_bamirite_block_3x_from_compressed_bamirite_blocks_2x");
        compressBlock(consumer, ModBlocks.COMPRESSED_BAMIRITE_BLOCK_3.get(), ModBlocks.COMPRESSED_BAMIRITE_BLOCK_4.get(),
                ModItems.BAMIRITE_INGOT.get(), "compressed_bamirite_block_4x_from_compressed_bamirite_blocks_3x");
        compressBlock(consumer, ModBlocks.COMPRESSED_BAMIRITE_BLOCK_4.get(), ModBlocks.COMPRESSED_BAMIRITE_BLOCK_5.get(),
                ModItems.BAMIRITE_INGOT.get(), "compressed_bamirite_block_5x_from_compressed_bamirite_blocks_4x");
        compressBlock(consumer, ModBlocks.COMPRESSED_BAMIRITE_BLOCK_5.get(), ModBlocks.COMPRESSED_BAMIRITE_BLOCK_6.get(),
                ModItems.BAMIRITE_INGOT.get(), "compressed_bamirite_block_6x_from_compressed_bamirite_blocks_5x");
        compressBlock(consumer, ModBlocks.COMPRESSED_BAMIRITE_BLOCK_6.get(), ModBlocks.COMPRESSED_BAMIRITE_BLOCK_7.get(),
                ModItems.BAMIRITE_INGOT.get(), "compressed_bamirite_block_7x_from_compressed_bamirite_blocks_6x");
        compressBlock(consumer, ModBlocks.COMPRESSED_BAMIRITE_BLOCK_7.get(), ModBlocks.COMPRESSED_BAMIRITE_BLOCK_8.get(),
                ModItems.BAMIRITE_INGOT.get(), "compressed_bamirite_block_8x_from_compressed_bamirite_blocks_7x");
        compressBlock(consumer, ModBlocks.COMPRESSED_BAMIRITE_BLOCK_8.get(), ModBlocks.COMPRESSED_BAMIRITE_BLOCK_9.get(),
                ModItems.BAMIRITE_INGOT.get(), "compressed_bamirite_block_9x_from_compressed_bamirite_blocks_8x");
        decompressBlock(consumer, ModBlocks.COMPRESSED_BAMIRITE_BLOCK_1.get(), ModBlocks.BAMIRITE_BLOCK.get(),
                ModItems.BAMIRITE_INGOT.get(), "bamirite_blocks_from_compressed_bamirite_block_1x");
        decompressBlock(consumer, ModBlocks.COMPRESSED_BAMIRITE_BLOCK_2.get(), ModBlocks.COMPRESSED_BAMIRITE_BLOCK_1.get(),
                ModItems.BAMIRITE_INGOT.get(), "compressed_bamirite_blocks_1x_from_compressed_bamirite_block_2x");
        decompressBlock(consumer, ModBlocks.COMPRESSED_BAMIRITE_BLOCK_3.get(), ModBlocks.COMPRESSED_BAMIRITE_BLOCK_2.get(),
                ModItems.BAMIRITE_INGOT.get(), "compressed_bamirite_blocks_2x_from_compressed_bamirite_block_3x");
        decompressBlock(consumer, ModBlocks.COMPRESSED_BAMIRITE_BLOCK_4.get(), ModBlocks.COMPRESSED_BAMIRITE_BLOCK_3.get(),
                ModItems.BAMIRITE_INGOT.get(), "compressed_bamirite_blocks_3x_from_compressed_bamirite_block_4x");
        decompressBlock(consumer, ModBlocks.COMPRESSED_BAMIRITE_BLOCK_5.get(), ModBlocks.COMPRESSED_BAMIRITE_BLOCK_4.get(),
                ModItems.BAMIRITE_INGOT.get(), "compressed_bamirite_blocks_4x_from_compressed_bamirite_block_5x");
        decompressBlock(consumer, ModBlocks.COMPRESSED_BAMIRITE_BLOCK_6.get(), ModBlocks.COMPRESSED_BAMIRITE_BLOCK_5.get(),
                ModItems.BAMIRITE_INGOT.get(), "compressed_bamirite_blocks_5x_from_compressed_bamirite_block_6x");
        decompressBlock(consumer, ModBlocks.COMPRESSED_BAMIRITE_BLOCK_7.get(), ModBlocks.COMPRESSED_BAMIRITE_BLOCK_6.get(),
                ModItems.BAMIRITE_INGOT.get(), "compressed_bamirite_blocks_6x_from_compressed_bamirite_block_7x");
        decompressBlock(consumer, ModBlocks.COMPRESSED_BAMIRITE_BLOCK_8.get(), ModBlocks.COMPRESSED_BAMIRITE_BLOCK_7.get(),
                ModItems.BAMIRITE_INGOT.get(), "compressed_bamirite_blocks_7x_from_compressed_bamirite_block_8x");
        decompressBlock(consumer, ModBlocks.COMPRESSED_BAMIRITE_BLOCK_9.get(), ModBlocks.COMPRESSED_BAMIRITE_BLOCK_8.get(),
                ModItems.BAMIRITE_INGOT.get(), "compressed_bamirite_blocks_8x_from_compressed_bamirite_block_9x");
        axeRecipe(consumer, ModItems.BAMIRITE_AXE.get(), ModItems.BAMIRITE_INGOT.get());
        hoeRecipe(consumer, ModItems.BAMIRITE_HOE.get(), ModItems.BAMIRITE_INGOT.get());
        pickaxeRecipe(consumer, ModItems.BAMIRITE_PICKAXE.get(), ModItems.BAMIRITE_INGOT.get());
        shovelRecipe(consumer, ModItems.BAMIRITE_SHOVEL.get(), ModItems.BAMIRITE_INGOT.get());
        swordRecipe(consumer, ModItems.BAMIRITE_SWORD.get(), ModItems.BAMIRITE_INGOT.get());
        helmetRecipe(consumer, ModItems.BAMIRITE_HELMET.get(), ModItems.BAMIRITE_INGOT.get());
        chestplateRecipe(consumer, ModItems.BAMIRITE_CHESTPLATE.get(), ModItems.BAMIRITE_INGOT.get());
        leggingsRecipe(consumer, ModItems.BAMIRITE_LEGGINGS.get(), ModItems.BAMIRITE_INGOT.get());
        bootsRecipe(consumer, ModItems.BAMIRITE_BOOTS.get(), ModItems.BAMIRITE_INGOT.get());

        ingotFromNuggetsPacking(consumer, ModItems.BLUE_DRAGCITE_INGOT.get(), ModItems.BLUE_DRAGCITE_NUGGET.get(), ModItems.BLUE_DRAGCITE_INGOT.get());
        nuggetsFromIngotUnpacking(consumer, ModItems.BLUE_DRAGCITE_NUGGET.get(), ModItems.BLUE_DRAGCITE_INGOT.get(), ModItems.BLUE_DRAGCITE_INGOT.get());
        blockFromIngotsPacking(consumer, ModBlocks.BLUE_DRAGCITE_BLOCK.get(), ModItems.BLUE_DRAGCITE_INGOT.get(), ModItems.BLUE_DRAGCITE_INGOT.get());
        ingotsFromBlockUnpacking(consumer, ModItems.BLUE_DRAGCITE_INGOT.get(), ModBlocks.BLUE_DRAGCITE_BLOCK.get(), ModItems.BLUE_DRAGCITE_INGOT.get());
        compressBlock(consumer, ModBlocks.BLUE_DRAGCITE_BLOCK.get(), ModBlocks.COMPRESSED_BLUE_DRAGCITE_BLOCK_1.get(),
                ModItems.BLUE_DRAGCITE_INGOT.get(), "compressed_blue_dragcite_block_1x_from_blue_dragcite_blocks");
        compressBlock(consumer, ModBlocks.COMPRESSED_BLUE_DRAGCITE_BLOCK_1.get(), ModBlocks.COMPRESSED_BLUE_DRAGCITE_BLOCK_2.get(),
                ModItems.BLUE_DRAGCITE_INGOT.get(), "compressed_blue_dragcite_block_2x_from_compressed_blue_dragcite_blocks_1x");
        compressBlock(consumer, ModBlocks.COMPRESSED_BLUE_DRAGCITE_BLOCK_2.get(), ModBlocks.COMPRESSED_BLUE_DRAGCITE_BLOCK_3.get(),
                ModItems.BLUE_DRAGCITE_INGOT.get(), "compressed_blue_dragcite_block_3x_from_compressed_blue_dragcite_blocks_2x");
        compressBlock(consumer, ModBlocks.COMPRESSED_BLUE_DRAGCITE_BLOCK_3.get(), ModBlocks.COMPRESSED_BLUE_DRAGCITE_BLOCK_4.get(),
                ModItems.BLUE_DRAGCITE_INGOT.get(), "compressed_blue_dragcite_block_4x_from_compressed_blue_dragcite_blocks_3x");
        compressBlock(consumer, ModBlocks.COMPRESSED_BLUE_DRAGCITE_BLOCK_4.get(), ModBlocks.COMPRESSED_BLUE_DRAGCITE_BLOCK_5.get(),
                ModItems.BLUE_DRAGCITE_INGOT.get(), "compressed_blue_dragcite_block_5x_from_compressed_blue_dragcite_blocks_4x");
        compressBlock(consumer, ModBlocks.COMPRESSED_BLUE_DRAGCITE_BLOCK_5.get(), ModBlocks.COMPRESSED_BLUE_DRAGCITE_BLOCK_6.get(),
                ModItems.BLUE_DRAGCITE_INGOT.get(), "compressed_blue_dragcite_block_6x_from_compressed_blue_dragcite_blocks_5x");
        compressBlock(consumer, ModBlocks.COMPRESSED_BLUE_DRAGCITE_BLOCK_6.get(), ModBlocks.COMPRESSED_BLUE_DRAGCITE_BLOCK_7.get(),
                ModItems.BLUE_DRAGCITE_INGOT.get(), "compressed_blue_dragcite_block_7x_from_compressed_blue_dragcite_blocks_6x");
        compressBlock(consumer, ModBlocks.COMPRESSED_BLUE_DRAGCITE_BLOCK_7.get(), ModBlocks.COMPRESSED_BLUE_DRAGCITE_BLOCK_8.get(),
                ModItems.BLUE_DRAGCITE_INGOT.get(), "compressed_blue_dragcite_block_8x_from_compressed_blue_dragcite_blocks_7x");
        compressBlock(consumer, ModBlocks.COMPRESSED_BLUE_DRAGCITE_BLOCK_8.get(), ModBlocks.COMPRESSED_BLUE_DRAGCITE_BLOCK_9.get(),
                ModItems.BLUE_DRAGCITE_INGOT.get(), "compressed_blue_dragcite_block_9x_from_compressed_blue_dragcite_blocks_8x");
        decompressBlock(consumer, ModBlocks.COMPRESSED_BLUE_DRAGCITE_BLOCK_1.get(), ModBlocks.BLUE_DRAGCITE_BLOCK.get(),
                ModItems.BLUE_DRAGCITE_INGOT.get(), "blue_dragcite_blocks_from_compressed_blue_dragcite_block_1x");
        decompressBlock(consumer, ModBlocks.COMPRESSED_BLUE_DRAGCITE_BLOCK_2.get(), ModBlocks.COMPRESSED_BLUE_DRAGCITE_BLOCK_1.get(),
                ModItems.BLUE_DRAGCITE_INGOT.get(), "compressed_blue_dragcite_blocks_1x_from_compressed_blue_dragcite_block_2x");
        decompressBlock(consumer, ModBlocks.COMPRESSED_BLUE_DRAGCITE_BLOCK_3.get(), ModBlocks.COMPRESSED_BLUE_DRAGCITE_BLOCK_2.get(),
                ModItems.BLUE_DRAGCITE_INGOT.get(), "compressed_blue_dragcite_blocks_2x_from_compressed_blue_dragcite_block_3x");
        decompressBlock(consumer, ModBlocks.COMPRESSED_BLUE_DRAGCITE_BLOCK_4.get(), ModBlocks.COMPRESSED_BLUE_DRAGCITE_BLOCK_3.get(),
                ModItems.BLUE_DRAGCITE_INGOT.get(), "compressed_blue_dragcite_blocks_3x_from_compressed_blue_dragcite_block_4x");
        decompressBlock(consumer, ModBlocks.COMPRESSED_BLUE_DRAGCITE_BLOCK_5.get(), ModBlocks.COMPRESSED_BLUE_DRAGCITE_BLOCK_4.get(),
                ModItems.BLUE_DRAGCITE_INGOT.get(), "compressed_blue_dragcite_blocks_4x_from_compressed_blue_dragcite_block_5x");
        decompressBlock(consumer, ModBlocks.COMPRESSED_BLUE_DRAGCITE_BLOCK_6.get(), ModBlocks.COMPRESSED_BLUE_DRAGCITE_BLOCK_5.get(),
                ModItems.BLUE_DRAGCITE_INGOT.get(), "compressed_blue_dragcite_blocks_5x_from_compressed_blue_dragcite_block_6x");
        decompressBlock(consumer, ModBlocks.COMPRESSED_BLUE_DRAGCITE_BLOCK_7.get(), ModBlocks.COMPRESSED_BLUE_DRAGCITE_BLOCK_6.get(),
                ModItems.BLUE_DRAGCITE_INGOT.get(), "compressed_blue_dragcite_blocks_6x_from_compressed_blue_dragcite_block_7x");
        decompressBlock(consumer, ModBlocks.COMPRESSED_BLUE_DRAGCITE_BLOCK_8.get(), ModBlocks.COMPRESSED_BLUE_DRAGCITE_BLOCK_7.get(),
                ModItems.BLUE_DRAGCITE_INGOT.get(), "compressed_blue_dragcite_blocks_7x_from_compressed_blue_dragcite_block_8x");
        decompressBlock(consumer, ModBlocks.COMPRESSED_BLUE_DRAGCITE_BLOCK_9.get(), ModBlocks.COMPRESSED_BLUE_DRAGCITE_BLOCK_8.get(),
                ModItems.BLUE_DRAGCITE_INGOT.get(), "compressed_blue_dragcite_blocks_8x_from_compressed_blue_dragcite_block_9x");
        axeRecipe(consumer, ModItems.BLUE_DRAGCITE_AXE.get(), ModItems.BLUE_DRAGCITE_INGOT.get());
        hoeRecipe(consumer, ModItems.BLUE_DRAGCITE_HOE.get(), ModItems.BLUE_DRAGCITE_INGOT.get());
        pickaxeRecipe(consumer, ModItems.BLUE_DRAGCITE_PICKAXE.get(), ModItems.BLUE_DRAGCITE_INGOT.get());
        shovelRecipe(consumer, ModItems.BLUE_DRAGCITE_SHOVEL.get(), ModItems.BLUE_DRAGCITE_INGOT.get());
        swordRecipe(consumer, ModItems.BLUE_DRAGCITE_SWORD.get(), ModItems.BLUE_DRAGCITE_INGOT.get());
        helmetRecipe(consumer, ModItems.BLUE_DRAGCITE_HELMET.get(), ModItems.BLUE_DRAGCITE_INGOT.get());
        chestplateRecipe(consumer, ModItems.BLUE_DRAGCITE_CHESTPLATE.get(), ModItems.BLUE_DRAGCITE_INGOT.get());
        leggingsRecipe(consumer, ModItems.BLUE_DRAGCITE_LEGGINGS.get(), ModItems.BLUE_DRAGCITE_INGOT.get());
        bootsRecipe(consumer, ModItems.BLUE_DRAGCITE_BOOTS.get(), ModItems.BLUE_DRAGCITE_INGOT.get());

        ingotFromNuggetsPacking(consumer, ModItems.EISSELTE_INGOT.get(), ModItems.EISSELTE_NUGGET.get(), ModItems.EISSELTE_INGOT.get());
        nuggetsFromIngotUnpacking(consumer, ModItems.EISSELTE_NUGGET.get(), ModItems.EISSELTE_INGOT.get(), ModItems.EISSELTE_INGOT.get());
        blockFromIngotsPacking(consumer, ModBlocks.EISSELTE_BLOCK.get(), ModItems.EISSELTE_INGOT.get(), ModItems.EISSELTE_INGOT.get());
        ingotsFromBlockUnpacking(consumer, ModItems.EISSELTE_INGOT.get(), ModBlocks.EISSELTE_BLOCK.get(), ModItems.EISSELTE_INGOT.get());
        compressBlock(consumer, ModBlocks.EISSELTE_BLOCK.get(), ModBlocks.COMPRESSED_EISSELTE_BLOCK_1.get(),
                ModItems.EISSELTE_INGOT.get(), "compressed_eisselte_block_1x_from_eisselte_blocks");
        compressBlock(consumer, ModBlocks.COMPRESSED_EISSELTE_BLOCK_1.get(), ModBlocks.COMPRESSED_EISSELTE_BLOCK_2.get(),
                ModItems.EISSELTE_INGOT.get(), "compressed_eisselte_block_2x_from_compressed_eisselte_blocks_1x");
        compressBlock(consumer, ModBlocks.COMPRESSED_EISSELTE_BLOCK_2.get(), ModBlocks.COMPRESSED_EISSELTE_BLOCK_3.get(),
                ModItems.EISSELTE_INGOT.get(), "compressed_eisselte_block_3x_from_compressed_eisselte_blocks_2x");
        compressBlock(consumer, ModBlocks.COMPRESSED_EISSELTE_BLOCK_3.get(), ModBlocks.COMPRESSED_EISSELTE_BLOCK_4.get(),
                ModItems.EISSELTE_INGOT.get(), "compressed_eisselte_block_4x_from_compressed_eisselte_blocks_3x");
        compressBlock(consumer, ModBlocks.COMPRESSED_EISSELTE_BLOCK_4.get(), ModBlocks.COMPRESSED_EISSELTE_BLOCK_5.get(),
                ModItems.EISSELTE_INGOT.get(), "compressed_eisselte_block_5x_from_compressed_eisselte_blocks_4x");
        compressBlock(consumer, ModBlocks.COMPRESSED_EISSELTE_BLOCK_5.get(), ModBlocks.COMPRESSED_EISSELTE_BLOCK_6.get(),
                ModItems.EISSELTE_INGOT.get(), "compressed_eisselte_block_6x_from_compressed_eisselte_blocks_5x");
        compressBlock(consumer, ModBlocks.COMPRESSED_EISSELTE_BLOCK_6.get(), ModBlocks.COMPRESSED_EISSELTE_BLOCK_7.get(),
                ModItems.EISSELTE_INGOT.get(), "compressed_eisselte_block_7x_from_compressed_eisselte_blocks_6x");
        compressBlock(consumer, ModBlocks.COMPRESSED_EISSELTE_BLOCK_7.get(), ModBlocks.COMPRESSED_EISSELTE_BLOCK_8.get(),
                ModItems.EISSELTE_INGOT.get(), "compressed_eisselte_block_8x_from_compressed_eisselte_blocks_7x");
        compressBlock(consumer, ModBlocks.COMPRESSED_EISSELTE_BLOCK_8.get(), ModBlocks.COMPRESSED_EISSELTE_BLOCK_9.get(),
                ModItems.EISSELTE_INGOT.get(), "compressed_eisselte_block_9x_from_compressed_eisselte_blocks_8x");
        decompressBlock(consumer, ModBlocks.COMPRESSED_EISSELTE_BLOCK_1.get(), ModBlocks.EISSELTE_BLOCK.get(),
                ModItems.EISSELTE_INGOT.get(), "eisselte_blocks_from_compressed_eisselte_block_1x");
        decompressBlock(consumer, ModBlocks.COMPRESSED_EISSELTE_BLOCK_2.get(), ModBlocks.COMPRESSED_EISSELTE_BLOCK_1.get(),
                ModItems.EISSELTE_INGOT.get(), "compressed_eisselte_blocks_1x_from_compressed_eisselte_block_2x");
        decompressBlock(consumer, ModBlocks.COMPRESSED_EISSELTE_BLOCK_3.get(), ModBlocks.COMPRESSED_EISSELTE_BLOCK_2.get(),
                ModItems.EISSELTE_INGOT.get(), "compressed_eisselte_blocks_2x_from_compressed_eisselte_block_3x");
        decompressBlock(consumer, ModBlocks.COMPRESSED_EISSELTE_BLOCK_4.get(), ModBlocks.COMPRESSED_EISSELTE_BLOCK_3.get(),
                ModItems.EISSELTE_INGOT.get(), "compressed_eisselte_blocks_3x_from_compressed_eisselte_block_4x");
        decompressBlock(consumer, ModBlocks.COMPRESSED_EISSELTE_BLOCK_5.get(), ModBlocks.COMPRESSED_EISSELTE_BLOCK_4.get(),
                ModItems.EISSELTE_INGOT.get(), "compressed_eisselte_blocks_4x_from_compressed_eisselte_block_5x");
        decompressBlock(consumer, ModBlocks.COMPRESSED_EISSELTE_BLOCK_6.get(), ModBlocks.COMPRESSED_EISSELTE_BLOCK_5.get(),
                ModItems.EISSELTE_INGOT.get(), "compressed_eisselte_blocks_5x_from_compressed_eisselte_block_6x");
        decompressBlock(consumer, ModBlocks.COMPRESSED_EISSELTE_BLOCK_7.get(), ModBlocks.COMPRESSED_EISSELTE_BLOCK_6.get(),
                ModItems.EISSELTE_INGOT.get(), "compressed_eisselte_blocks_6x_from_compressed_eisselte_block_7x");
        decompressBlock(consumer, ModBlocks.COMPRESSED_EISSELTE_BLOCK_8.get(), ModBlocks.COMPRESSED_EISSELTE_BLOCK_7.get(),
                ModItems.EISSELTE_INGOT.get(), "compressed_eisselte_blocks_7x_from_compressed_eisselte_block_8x");
        decompressBlock(consumer, ModBlocks.COMPRESSED_EISSELTE_BLOCK_9.get(), ModBlocks.COMPRESSED_EISSELTE_BLOCK_8.get(),
                ModItems.EISSELTE_INGOT.get(), "compressed_eisselte_blocks_8x_from_compressed_eisselte_block_9x");
        axeRecipe(consumer, ModItems.EISSELTE_AXE.get(), ModItems.EISSELTE_INGOT.get());
        hoeRecipe(consumer, ModItems.EISSELTE_HOE.get(), ModItems.EISSELTE_INGOT.get());
        pickaxeRecipe(consumer, ModItems.EISSELTE_PICKAXE.get(), ModItems.EISSELTE_INGOT.get());
        shovelRecipe(consumer, ModItems.EISSELTE_SHOVEL.get(), ModItems.EISSELTE_INGOT.get());
        swordRecipe(consumer, ModItems.EISSELTE_SWORD.get(), ModItems.EISSELTE_INGOT.get());
        helmetRecipe(consumer, ModItems.EISSELTE_HELMET.get(), ModItems.EISSELTE_INGOT.get());
        chestplateRecipe(consumer, ModItems.EISSELTE_CHESTPLATE.get(), ModItems.EISSELTE_INGOT.get());
        leggingsRecipe(consumer, ModItems.EISSELTE_LEGGINGS.get(), ModItems.EISSELTE_INGOT.get());
        bootsRecipe(consumer, ModItems.EISSELTE_BOOTS.get(), ModItems.EISSELTE_INGOT.get());

        ingotFromNuggetsPacking(consumer, ModItems.HELMINIUM_INGOT.get(), ModItems.HELMINIUM_NUGGET.get(), ModItems.HELMINIUM_INGOT.get());
        nuggetsFromIngotUnpacking(consumer, ModItems.HELMINIUM_NUGGET.get(), ModItems.HELMINIUM_INGOT.get(), ModItems.HELMINIUM_INGOT.get());
        blockFromIngotsPacking(consumer, ModBlocks.HELMINIUM_BLOCK.get(), ModItems.HELMINIUM_INGOT.get(), ModItems.HELMINIUM_INGOT.get());
        ingotsFromBlockUnpacking(consumer, ModItems.HELMINIUM_INGOT.get(), ModBlocks.HELMINIUM_BLOCK.get(), ModItems.HELMINIUM_INGOT.get());
        compressBlock(consumer, ModBlocks.HELMINIUM_BLOCK.get(), ModBlocks.COMPRESSED_HELMINIUM_BLOCK_1.get(),
                ModItems.HELMINIUM_INGOT.get(), "compressed_helminium_block_1x_from_helminium_blocks");
        compressBlock(consumer, ModBlocks.COMPRESSED_HELMINIUM_BLOCK_1.get(), ModBlocks.COMPRESSED_HELMINIUM_BLOCK_2.get(),
                ModItems.HELMINIUM_INGOT.get(), "compressed_helminium_block_2x_from_compressed_helminium_blocks_1x");
        compressBlock(consumer, ModBlocks.COMPRESSED_HELMINIUM_BLOCK_2.get(), ModBlocks.COMPRESSED_HELMINIUM_BLOCK_3.get(),
                ModItems.HELMINIUM_INGOT.get(), "compressed_helminium_block_3x_from_compressed_helminium_blocks_2x");
        compressBlock(consumer, ModBlocks.COMPRESSED_HELMINIUM_BLOCK_3.get(), ModBlocks.COMPRESSED_HELMINIUM_BLOCK_4.get(),
                ModItems.HELMINIUM_INGOT.get(), "compressed_helminium_block_4x_from_compressed_helminium_blocks_3x");
        compressBlock(consumer, ModBlocks.COMPRESSED_HELMINIUM_BLOCK_4.get(), ModBlocks.COMPRESSED_HELMINIUM_BLOCK_5.get(),
                ModItems.HELMINIUM_INGOT.get(), "compressed_helminium_block_5x_from_compressed_helminium_blocks_4x");
        compressBlock(consumer, ModBlocks.COMPRESSED_HELMINIUM_BLOCK_5.get(), ModBlocks.COMPRESSED_HELMINIUM_BLOCK_6.get(),
                ModItems.HELMINIUM_INGOT.get(), "compressed_helminium_block_6x_from_compressed_helminium_blocks_5x");
        compressBlock(consumer, ModBlocks.COMPRESSED_HELMINIUM_BLOCK_6.get(), ModBlocks.COMPRESSED_HELMINIUM_BLOCK_7.get(),
                ModItems.HELMINIUM_INGOT.get(), "compressed_helminium_block_7x_from_compressed_helminium_blocks_6x");
        compressBlock(consumer, ModBlocks.COMPRESSED_HELMINIUM_BLOCK_7.get(), ModBlocks.COMPRESSED_HELMINIUM_BLOCK_8.get(),
                ModItems.HELMINIUM_INGOT.get(), "compressed_helminium_block_8x_from_compressed_helminium_blocks_7x");
        compressBlock(consumer, ModBlocks.COMPRESSED_HELMINIUM_BLOCK_8.get(), ModBlocks.COMPRESSED_HELMINIUM_BLOCK_9.get(),
                ModItems.HELMINIUM_INGOT.get(), "compressed_helminium_block_9x_from_compressed_helminium_blocks_8x");
        decompressBlock(consumer, ModBlocks.COMPRESSED_HELMINIUM_BLOCK_1.get(), ModBlocks.HELMINIUM_BLOCK.get(),
                ModItems.HELMINIUM_INGOT.get(), "helminium_blocks_from_compressed_helminium_block_1x");
        decompressBlock(consumer, ModBlocks.COMPRESSED_HELMINIUM_BLOCK_2.get(), ModBlocks.COMPRESSED_HELMINIUM_BLOCK_1.get(),
                ModItems.HELMINIUM_INGOT.get(), "compressed_helminium_blocks_1x_from_compressed_helminium_block_2x");
        decompressBlock(consumer, ModBlocks.COMPRESSED_HELMINIUM_BLOCK_3.get(), ModBlocks.COMPRESSED_HELMINIUM_BLOCK_2.get(),
                ModItems.HELMINIUM_INGOT.get(), "compressed_helminium_blocks_2x_from_compressed_helminium_block_3x");
        decompressBlock(consumer, ModBlocks.COMPRESSED_HELMINIUM_BLOCK_4.get(), ModBlocks.COMPRESSED_HELMINIUM_BLOCK_3.get(),
                ModItems.HELMINIUM_INGOT.get(), "compressed_helminium_blocks_3x_from_compressed_helminium_block_4x");
        decompressBlock(consumer, ModBlocks.COMPRESSED_HELMINIUM_BLOCK_5.get(), ModBlocks.COMPRESSED_HELMINIUM_BLOCK_4.get(),
                ModItems.HELMINIUM_INGOT.get(), "compressed_helminium_blocks_4x_from_compressed_helminium_block_5x");
        decompressBlock(consumer, ModBlocks.COMPRESSED_HELMINIUM_BLOCK_6.get(), ModBlocks.COMPRESSED_HELMINIUM_BLOCK_5.get(),
                ModItems.HELMINIUM_INGOT.get(), "compressed_helminium_blocks_5x_from_compressed_helminium_block_6x");
        decompressBlock(consumer, ModBlocks.COMPRESSED_HELMINIUM_BLOCK_7.get(), ModBlocks.COMPRESSED_HELMINIUM_BLOCK_6.get(),
                ModItems.HELMINIUM_INGOT.get(), "compressed_helminium_blocks_6x_from_compressed_helminium_block_7x");
        decompressBlock(consumer, ModBlocks.COMPRESSED_HELMINIUM_BLOCK_8.get(), ModBlocks.COMPRESSED_HELMINIUM_BLOCK_7.get(),
                ModItems.HELMINIUM_INGOT.get(), "compressed_helminium_blocks_7x_from_compressed_helminium_block_8x");
        decompressBlock(consumer, ModBlocks.COMPRESSED_HELMINIUM_BLOCK_9.get(), ModBlocks.COMPRESSED_HELMINIUM_BLOCK_8.get(),
                ModItems.HELMINIUM_INGOT.get(), "compressed_helminium_blocks_8x_from_compressed_helminium_block_9x");
        axeRecipe(consumer, ModItems.HELMINIUM_AXE.get(), ModItems.HELMINIUM_INGOT.get());
        hoeRecipe(consumer, ModItems.HELMINIUM_HOE.get(), ModItems.HELMINIUM_INGOT.get());
        pickaxeRecipe(consumer, ModItems.HELMINIUM_PICKAXE.get(), ModItems.HELMINIUM_INGOT.get());
        shovelRecipe(consumer, ModItems.HELMINIUM_SHOVEL.get(), ModItems.HELMINIUM_INGOT.get());
        swordRecipe(consumer, ModItems.HELMINIUM_SWORD.get(), ModItems.HELMINIUM_INGOT.get());
        helmetRecipe(consumer, ModItems.HELMINIUM_HELMET.get(), ModItems.HELMINIUM_INGOT.get());
        chestplateRecipe(consumer, ModItems.HELMINIUM_CHESTPLATE.get(), ModItems.HELMINIUM_INGOT.get());
        leggingsRecipe(consumer, ModItems.HELMINIUM_LEGGINGS.get(), ModItems.HELMINIUM_INGOT.get());
        bootsRecipe(consumer, ModItems.HELMINIUM_BOOTS.get(), ModItems.HELMINIUM_INGOT.get());

        ingotFromNuggetsPacking(consumer, ModItems.JEPERCKSTONE_INGOT.get(), ModItems.JEPERCKSTONE_NUGGET.get(), ModItems.JEPERCKSTONE_INGOT.get());
        nuggetsFromIngotUnpacking(consumer, ModItems.JEPERCKSTONE_NUGGET.get(), ModItems.JEPERCKSTONE_INGOT.get(), ModItems.JEPERCKSTONE_INGOT.get());
        blockFromIngotsPacking(consumer, ModBlocks.JEPERCKSTONE_BLOCK.get(), ModItems.JEPERCKSTONE_INGOT.get(), ModItems.JEPERCKSTONE_INGOT.get());
        ingotsFromBlockUnpacking(consumer, ModItems.JEPERCKSTONE_INGOT.get(), ModBlocks.JEPERCKSTONE_BLOCK.get(), ModItems.JEPERCKSTONE_INGOT.get());
        compressBlock(consumer, ModBlocks.JEPERCKSTONE_BLOCK.get(), ModBlocks.COMPRESSED_JEPERCKSTONE_BLOCK_1.get(),
                ModItems.JEPERCKSTONE_INGOT.get(), "compressed_jeperckstone_block_1x_from_jeperckstone_blocks");
        compressBlock(consumer, ModBlocks.COMPRESSED_JEPERCKSTONE_BLOCK_1.get(), ModBlocks.COMPRESSED_JEPERCKSTONE_BLOCK_2.get(),
                ModItems.JEPERCKSTONE_INGOT.get(), "compressed_jeperckstone_block_2x_from_compressed_jeperckstone_blocks_1x");
        compressBlock(consumer, ModBlocks.COMPRESSED_JEPERCKSTONE_BLOCK_2.get(), ModBlocks.COMPRESSED_JEPERCKSTONE_BLOCK_3.get(),
                ModItems.JEPERCKSTONE_INGOT.get(), "compressed_jeperckstone_block_3x_from_compressed_jeperckstoneblocks_2x");
        compressBlock(consumer, ModBlocks.COMPRESSED_JEPERCKSTONE_BLOCK_3.get(), ModBlocks.COMPRESSED_JEPERCKSTONE_BLOCK_4.get(),
                ModItems.JEPERCKSTONE_INGOT.get(), "compressed_jeperckstone_block_4x_from_compressed_jeperckstone_blocks_3x");
        compressBlock(consumer, ModBlocks.COMPRESSED_JEPERCKSTONE_BLOCK_4.get(), ModBlocks.COMPRESSED_JEPERCKSTONE_BLOCK_5.get(),
                ModItems.JEPERCKSTONE_INGOT.get(), "compressed_jeperckstone_block_5x_from_compressed_jeperckstone_blocks_4x");
        compressBlock(consumer, ModBlocks.COMPRESSED_JEPERCKSTONE_BLOCK_5.get(), ModBlocks.COMPRESSED_JEPERCKSTONE_BLOCK_6.get(),
                ModItems.JEPERCKSTONE_INGOT.get(), "compressed_jeperckstone_block_6x_from_compressed_jeperckstone_blocks_5x");
        compressBlock(consumer, ModBlocks.COMPRESSED_JEPERCKSTONE_BLOCK_6.get(), ModBlocks.COMPRESSED_JEPERCKSTONE_BLOCK_7.get(),
                ModItems.JEPERCKSTONE_INGOT.get(), "compressed_jeperckstone_block_7x_from_compressed_jeperckstone_blocks_6x");
        compressBlock(consumer, ModBlocks.COMPRESSED_JEPERCKSTONE_BLOCK_7.get(), ModBlocks.COMPRESSED_JEPERCKSTONE_BLOCK_8.get(),
                ModItems.JEPERCKSTONE_INGOT.get(), "compressed_jeperckstone_block_8x_from_compressed_jeperckstone_blocks_7x");
        compressBlock(consumer, ModBlocks.COMPRESSED_JEPERCKSTONE_BLOCK_8.get(), ModBlocks.COMPRESSED_JEPERCKSTONE_BLOCK_9.get(),
                ModItems.JEPERCKSTONE_INGOT.get(), "compressed_jeperckstone_block_9x_from_compressed_jeperckstone_blocks_8x");
        decompressBlock(consumer, ModBlocks.COMPRESSED_JEPERCKSTONE_BLOCK_1.get(), ModBlocks.JEPERCKSTONE_BLOCK.get(),
                ModItems.JEPERCKSTONE_INGOT.get(), "jeperckstone_blocks_from_compressed_jeperckstone_block_1x");
        decompressBlock(consumer, ModBlocks.COMPRESSED_JEPERCKSTONE_BLOCK_2.get(), ModBlocks.COMPRESSED_JEPERCKSTONE_BLOCK_1.get(),
                ModItems.JEPERCKSTONE_INGOT.get(), "compressed_jeperckstone_blocks_1x_from_compressed_jeperckstone_block_2x");
        decompressBlock(consumer, ModBlocks.COMPRESSED_JEPERCKSTONE_BLOCK_3.get(), ModBlocks.COMPRESSED_JEPERCKSTONE_BLOCK_2.get(),
                ModItems.JEPERCKSTONE_INGOT.get(), "compressed_jeperckstone_blocks_2x_from_compressed_jeperckstone_block_3x");
        decompressBlock(consumer, ModBlocks.COMPRESSED_JEPERCKSTONE_BLOCK_4.get(), ModBlocks.COMPRESSED_JEPERCKSTONE_BLOCK_3.get(),
                ModItems.JEPERCKSTONE_INGOT.get(), "compressed_jeperckstone_blocks_3x_from_compressed_jeperckstone_block_4x");
        decompressBlock(consumer, ModBlocks.COMPRESSED_JEPERCKSTONE_BLOCK_5.get(), ModBlocks.COMPRESSED_JEPERCKSTONE_BLOCK_4.get(),
                ModItems.JEPERCKSTONE_INGOT.get(), "compressed_jeperckstone_blocks_4x_from_compressed_jeperckstone_block_5x");
        decompressBlock(consumer, ModBlocks.COMPRESSED_JEPERCKSTONE_BLOCK_6.get(), ModBlocks.COMPRESSED_JEPERCKSTONE_BLOCK_5.get(),
                ModItems.JEPERCKSTONE_INGOT.get(), "compressed_jeperckstone_blocks_5x_from_compressed_jeperckstone_block_6x");
        decompressBlock(consumer, ModBlocks.COMPRESSED_JEPERCKSTONE_BLOCK_7.get(), ModBlocks.COMPRESSED_JEPERCKSTONE_BLOCK_6.get(),
                ModItems.JEPERCKSTONE_INGOT.get(), "compressed_jeperckstone_blocks_6x_from_compressed_jeperckstone_block_7x");
        decompressBlock(consumer, ModBlocks.COMPRESSED_JEPERCKSTONE_BLOCK_8.get(), ModBlocks.COMPRESSED_JEPERCKSTONE_BLOCK_7.get(),
                ModItems.JEPERCKSTONE_INGOT.get(), "compressed_jeperckstone_blocks_7x_from_compressed_jeperckstone_block_8x");
        decompressBlock(consumer, ModBlocks.COMPRESSED_JEPERCKSTONE_BLOCK_9.get(), ModBlocks.COMPRESSED_JEPERCKSTONE_BLOCK_8.get(),
                ModItems.JEPERCKSTONE_INGOT.get(), "compressed_jeperckstone_blocks_8x_from_compressed_jeperckstone_block_9x");
        axeRecipe(consumer, ModItems.JEPERCKSTONE_AXE.get(), ModItems.JEPERCKSTONE_INGOT.get());
        hoeRecipe(consumer, ModItems.JEPERCKSTONE_HOE.get(), ModItems.JEPERCKSTONE_INGOT.get());
        pickaxeRecipe(consumer, ModItems.JEPERCKSTONE_PICKAXE.get(), ModItems.JEPERCKSTONE_INGOT.get());
        shovelRecipe(consumer, ModItems.JEPERCKSTONE_SHOVEL.get(), ModItems.JEPERCKSTONE_INGOT.get());
        swordRecipe(consumer, ModItems.JEPERCKSTONE_SWORD.get(), ModItems.JEPERCKSTONE_INGOT.get());
        helmetRecipe(consumer, ModItems.JEPERCKSTONE_HELMET.get(), ModItems.JEPERCKSTONE_INGOT.get());
        chestplateRecipe(consumer, ModItems.JEPERCKSTONE_CHESTPLATE.get(), ModItems.JEPERCKSTONE_INGOT.get());
        leggingsRecipe(consumer, ModItems.JEPERCKSTONE_LEGGINGS.get(), ModItems.JEPERCKSTONE_INGOT.get());
        bootsRecipe(consumer, ModItems.JEPERCKSTONE_BOOTS.get(), ModItems.JEPERCKSTONE_INGOT.get());

        ingotFromNuggetsPacking(consumer, ModItems.KHELSTONE_INGOT.get(), ModItems.KHELSTONE_NUGGET.get(), ModItems.KHELSTONE_INGOT.get());
        nuggetsFromIngotUnpacking(consumer, ModItems.KHELSTONE_NUGGET.get(), ModItems.KHELSTONE_INGOT.get(), ModItems.KHELSTONE_INGOT.get());
        blockFromIngotsPacking(consumer, ModBlocks.KHELSTONE_BLOCK.get(), ModItems.KHELSTONE_INGOT.get(), ModItems.KHELSTONE_INGOT.get());
        ingotsFromBlockUnpacking(consumer, ModItems.KHELSTONE_INGOT.get(), ModBlocks.KHELSTONE_BLOCK.get(), ModItems.KHELSTONE_INGOT.get());
        compressBlock(consumer, ModBlocks.KHELSTONE_BLOCK.get(), ModBlocks.COMPRESSED_KHELSTONE_BLOCK_1.get(),
                ModItems.KHELSTONE_INGOT.get(), "compressed_khelstone_block_1x_from_khelstone_blocks");
        compressBlock(consumer, ModBlocks.COMPRESSED_KHELSTONE_BLOCK_1.get(), ModBlocks.COMPRESSED_KHELSTONE_BLOCK_2.get(),
                ModItems.KHELSTONE_INGOT.get(), "compressed_khelstone_block_2x_from_compressed_khelstone_blocks_1x");
        compressBlock(consumer, ModBlocks.COMPRESSED_KHELSTONE_BLOCK_2.get(), ModBlocks.COMPRESSED_KHELSTONE_BLOCK_3.get(),
                ModItems.KHELSTONE_INGOT.get(), "compressed_khelstone_block_3x_from_compressed_khelstone_blocks_2x");
        compressBlock(consumer, ModBlocks.COMPRESSED_KHELSTONE_BLOCK_3.get(), ModBlocks.COMPRESSED_KHELSTONE_BLOCK_4.get(),
                ModItems.KHELSTONE_INGOT.get(), "compressed_khelstone_block_4x_from_compressed_khelstone_blocks_3x");
        compressBlock(consumer, ModBlocks.COMPRESSED_KHELSTONE_BLOCK_4.get(), ModBlocks.COMPRESSED_KHELSTONE_BLOCK_5.get(),
                ModItems.KHELSTONE_INGOT.get(), "compressed_khelstone_block_5x_from_compressed_khelstone_blocks_4x");
        compressBlock(consumer, ModBlocks.COMPRESSED_KHELSTONE_BLOCK_5.get(), ModBlocks.COMPRESSED_KHELSTONE_BLOCK_6.get(),
                ModItems.KHELSTONE_INGOT.get(), "compressed_khelstone_block_6x_from_compressed_khelstone_blocks_5x");
        compressBlock(consumer, ModBlocks.COMPRESSED_KHELSTONE_BLOCK_6.get(), ModBlocks.COMPRESSED_KHELSTONE_BLOCK_7.get(),
                ModItems.KHELSTONE_INGOT.get(), "compressed_khelstone_block_7x_from_compressed_khelstone_blocks_6x");
        compressBlock(consumer, ModBlocks.COMPRESSED_KHELSTONE_BLOCK_7.get(), ModBlocks.COMPRESSED_KHELSTONE_BLOCK_8.get(),
                ModItems.KHELSTONE_INGOT.get(), "compressed_khelstone_block_8x_from_compressed_khelstone_blocks_7x");
        compressBlock(consumer, ModBlocks.COMPRESSED_KHELSTONE_BLOCK_8.get(), ModBlocks.COMPRESSED_KHELSTONE_BLOCK_9.get(),
                ModItems.KHELSTONE_INGOT.get(), "compressed_khelstone_block_9x_from_compressed_khelstone_blocks_8x");
        decompressBlock(consumer, ModBlocks.COMPRESSED_KHELSTONE_BLOCK_1.get(), ModBlocks.KHELSTONE_BLOCK.get(),
                ModItems.KHELSTONE_INGOT.get(), "khelstone_blocks_from_compressed_khelstone_block_1x");
        decompressBlock(consumer, ModBlocks.COMPRESSED_KHELSTONE_BLOCK_2.get(), ModBlocks.COMPRESSED_KHELSTONE_BLOCK_1.get(),
                ModItems.KHELSTONE_INGOT.get(), "compressed_khelstone_blocks_1x_from_compressed_khelstone_block_2x");
        decompressBlock(consumer, ModBlocks.COMPRESSED_KHELSTONE_BLOCK_3.get(), ModBlocks.COMPRESSED_KHELSTONE_BLOCK_2.get(),
                ModItems.KHELSTONE_INGOT.get(), "compressed_khelstone_blocks_2x_from_compressed_khelstone_block_3x");
        decompressBlock(consumer, ModBlocks.COMPRESSED_KHELSTONE_BLOCK_4.get(), ModBlocks.COMPRESSED_KHELSTONE_BLOCK_3.get(),
                ModItems.KHELSTONE_INGOT.get(), "compressed_khelstone_blocks_3x_from_compressed_khelstone_block_4x");
        decompressBlock(consumer, ModBlocks.COMPRESSED_KHELSTONE_BLOCK_5.get(), ModBlocks.COMPRESSED_KHELSTONE_BLOCK_4.get(),
                ModItems.KHELSTONE_INGOT.get(), "compressed_khelstone_blocks_4x_from_compressed_khelstone_block_5x");
        decompressBlock(consumer, ModBlocks.COMPRESSED_KHELSTONE_BLOCK_6.get(), ModBlocks.COMPRESSED_KHELSTONE_BLOCK_5.get(),
                ModItems.KHELSTONE_INGOT.get(), "compressed_khelstone_blocks_5x_from_compressed_khelstone_block_6x");
        decompressBlock(consumer, ModBlocks.COMPRESSED_KHELSTONE_BLOCK_7.get(), ModBlocks.COMPRESSED_KHELSTONE_BLOCK_6.get(),
                ModItems.KHELSTONE_INGOT.get(), "compressed_khelstone_blocks_6x_from_compressed_khelstone_block_7x");
        decompressBlock(consumer, ModBlocks.COMPRESSED_KHELSTONE_BLOCK_8.get(), ModBlocks.COMPRESSED_KHELSTONE_BLOCK_7.get(),
                ModItems.KHELSTONE_INGOT.get(), "compressed_khelstone_blocks_7x_from_compressed_khelstone_block_8x");
        decompressBlock(consumer, ModBlocks.COMPRESSED_KHELSTONE_BLOCK_9.get(), ModBlocks.COMPRESSED_KHELSTONE_BLOCK_8.get(),
                ModItems.KHELSTONE_INGOT.get(), "compressed_khelstone_blocks_8x_from_compressed_khelstone_block_9x");
        axeRecipe(consumer, ModItems.KHELSTONE_AXE.get(), ModItems.KHELSTONE_INGOT.get());
        hoeRecipe(consumer, ModItems.KHELSTONE_HOE.get(), ModItems.KHELSTONE_INGOT.get());
        pickaxeRecipe(consumer, ModItems.KHELSTONE_PICKAXE.get(), ModItems.KHELSTONE_INGOT.get());
        shovelRecipe(consumer, ModItems.KHELSTONE_SHOVEL.get(), ModItems.KHELSTONE_INGOT.get());
        swordRecipe(consumer, ModItems.KHELSTONE_SWORD.get(), ModItems.KHELSTONE_INGOT.get());
        helmetRecipe(consumer, ModItems.KHELSTONE_HELMET.get(), ModItems.KHELSTONE_INGOT.get());
        chestplateRecipe(consumer, ModItems.KHELSTONE_CHESTPLATE.get(), ModItems.KHELSTONE_INGOT.get());
        leggingsRecipe(consumer, ModItems.KHELSTONE_LEGGINGS.get(), ModItems.KHELSTONE_INGOT.get());
        bootsRecipe(consumer, ModItems.KHELSTONE_BOOTS.get(), ModItems.KHELSTONE_INGOT.get());

        ingotFromNuggetsPacking(consumer, ModItems.KIRIONITE_INGOT.get(), ModItems.KIRIONITE_NUGGET.get(), ModItems.KIRIONITE_INGOT.get());
        nuggetsFromIngotUnpacking(consumer, ModItems.KIRIONITE_NUGGET.get(), ModItems.KIRIONITE_INGOT.get(), ModItems.KIRIONITE_INGOT.get());
        blockFromIngotsPacking(consumer, ModBlocks.KIRIONITE_BLOCK.get(), ModItems.KIRIONITE_INGOT.get(), ModItems.KIRIONITE_INGOT.get());
        ingotsFromBlockUnpacking(consumer, ModItems.KIRIONITE_INGOT.get(), ModBlocks.KIRIONITE_BLOCK.get(), ModItems.KIRIONITE_INGOT.get());
        compressBlock(consumer, ModBlocks.KIRIONITE_BLOCK.get(), ModBlocks.COMPRESSED_KIRIONITE_BLOCK_1.get(),
                ModItems.KIRIONITE_INGOT.get(), "compressed_kirionite_block_1x_from_kirionite_blocks");
        compressBlock(consumer, ModBlocks.COMPRESSED_KIRIONITE_BLOCK_1.get(), ModBlocks.COMPRESSED_KIRIONITE_BLOCK_2.get(),
                ModItems.KIRIONITE_INGOT.get(), "compressed_kirionite_block_2x_from_compressed_kirionite_blocks_1x");
        compressBlock(consumer, ModBlocks.COMPRESSED_KIRIONITE_BLOCK_2.get(), ModBlocks.COMPRESSED_KIRIONITE_BLOCK_3.get(),
                ModItems.KIRIONITE_INGOT.get(), "compressed_kirionite_block_3x_from_compressed_kirionite_blocks_2x");
        compressBlock(consumer, ModBlocks.COMPRESSED_KIRIONITE_BLOCK_3.get(), ModBlocks.COMPRESSED_KIRIONITE_BLOCK_4.get(),
                ModItems.KIRIONITE_INGOT.get(), "compressed_kirionite_block_4x_from_compressed_kirionite_blocks_3x");
        compressBlock(consumer, ModBlocks.COMPRESSED_KIRIONITE_BLOCK_4.get(), ModBlocks.COMPRESSED_KIRIONITE_BLOCK_5.get(),
                ModItems.KIRIONITE_INGOT.get(), "compressed_kirionite_block_5x_from_compressed_kirionite_blocks_4x");
        compressBlock(consumer, ModBlocks.COMPRESSED_KIRIONITE_BLOCK_5.get(), ModBlocks.COMPRESSED_KIRIONITE_BLOCK_6.get(),
                ModItems.KIRIONITE_INGOT.get(), "compressed_kirionite_block_6x_from_compressed_kirionite_blocks_5x");
        compressBlock(consumer, ModBlocks.COMPRESSED_KIRIONITE_BLOCK_6.get(), ModBlocks.COMPRESSED_KIRIONITE_BLOCK_7.get(),
                ModItems.KIRIONITE_INGOT.get(), "compressed_kirionite_block_7x_from_compressed_kirionite_blocks_6x");
        compressBlock(consumer, ModBlocks.COMPRESSED_KIRIONITE_BLOCK_7.get(), ModBlocks.COMPRESSED_KIRIONITE_BLOCK_8.get(),
                ModItems.KIRIONITE_INGOT.get(), "compressed_kirionite_block_8x_from_compressed_kirionite_blocks_7x");
        compressBlock(consumer, ModBlocks.COMPRESSED_KIRIONITE_BLOCK_8.get(), ModBlocks.COMPRESSED_KIRIONITE_BLOCK_9.get(),
                ModItems.KIRIONITE_INGOT.get(), "compressed_kirionite_block_9x_from_compressed_kirionite_blocks_8x");
        decompressBlock(consumer, ModBlocks.COMPRESSED_KIRIONITE_BLOCK_1.get(), ModBlocks.KIRIONITE_BLOCK.get(),
                ModItems.KIRIONITE_INGOT.get(), "kirionite_blocks_from_compressed_kirionite_block_1x");
        decompressBlock(consumer, ModBlocks.COMPRESSED_KIRIONITE_BLOCK_2.get(), ModBlocks.COMPRESSED_KIRIONITE_BLOCK_1.get(),
                ModItems.KIRIONITE_INGOT.get(), "compressed_kirionite_blocks_1x_from_compressed_kirionite_block_2x");
        decompressBlock(consumer, ModBlocks.COMPRESSED_KIRIONITE_BLOCK_3.get(), ModBlocks.COMPRESSED_KIRIONITE_BLOCK_2.get(),
                ModItems.KIRIONITE_INGOT.get(), "compressed_kirionite_blocks_2x_from_compressed_kirionite_block_3x");
        decompressBlock(consumer, ModBlocks.COMPRESSED_KIRIONITE_BLOCK_4.get(), ModBlocks.COMPRESSED_KIRIONITE_BLOCK_3.get(),
                ModItems.KIRIONITE_INGOT.get(), "compressed_kirionite_blocks_3x_from_compressed_kirionite_block_4x");
        decompressBlock(consumer, ModBlocks.COMPRESSED_KIRIONITE_BLOCK_5.get(), ModBlocks.COMPRESSED_KIRIONITE_BLOCK_4.get(),
                ModItems.KIRIONITE_INGOT.get(), "compressed_kirionite_blocks_4x_from_compressed_kirionite_block_5x");
        decompressBlock(consumer, ModBlocks.COMPRESSED_KIRIONITE_BLOCK_6.get(), ModBlocks.COMPRESSED_KIRIONITE_BLOCK_5.get(),
                ModItems.KIRIONITE_INGOT.get(), "compressed_kirionite_blocks_5x_from_compressed_kirionite_block_6x");
        decompressBlock(consumer, ModBlocks.COMPRESSED_KIRIONITE_BLOCK_7.get(), ModBlocks.COMPRESSED_KIRIONITE_BLOCK_6.get(),
                ModItems.KIRIONITE_INGOT.get(), "compressed_kirionite_blocks_6x_from_compressed_kirionite_block_7x");
        decompressBlock(consumer, ModBlocks.COMPRESSED_KIRIONITE_BLOCK_8.get(), ModBlocks.COMPRESSED_KIRIONITE_BLOCK_7.get(),
                ModItems.KIRIONITE_INGOT.get(), "compressed_kirionite_blocks_7x_from_compressed_kirionite_block_8x");
        decompressBlock(consumer, ModBlocks.COMPRESSED_KIRIONITE_BLOCK_9.get(), ModBlocks.COMPRESSED_KIRIONITE_BLOCK_8.get(),
                ModItems.KIRIONITE_INGOT.get(), "compressed_kirionite_blocks_8x_from_compressed_kirionite_block_9x");
        axeRecipe(consumer, ModItems.KIRIONITE_AXE.get(), ModItems.KIRIONITE_INGOT.get());
        hoeRecipe(consumer, ModItems.KIRIONITE_HOE.get(), ModItems.KIRIONITE_INGOT.get());
        pickaxeRecipe(consumer, ModItems.KIRIONITE_PICKAXE.get(), ModItems.KIRIONITE_INGOT.get());
        shovelRecipe(consumer, ModItems.KIRIONITE_SHOVEL.get(), ModItems.KIRIONITE_INGOT.get());
        swordRecipe(consumer, ModItems.KIRIONITE_SWORD.get(), ModItems.KIRIONITE_INGOT.get());
        helmetRecipe(consumer, ModItems.KIRIONITE_HELMET.get(), ModItems.KIRIONITE_INGOT.get());
        chestplateRecipe(consumer, ModItems.KIRIONITE_CHESTPLATE.get(), ModItems.KIRIONITE_INGOT.get());
        leggingsRecipe(consumer, ModItems.KIRIONITE_LEGGINGS.get(), ModItems.KIRIONITE_INGOT.get());
        bootsRecipe(consumer, ModItems.KIRIONITE_BOOTS.get(), ModItems.KIRIONITE_INGOT.get());

        ingotFromNuggetsPacking(consumer, ModItems.MANXIUM_INGOT.get(), ModItems.MANXIUM_NUGGET.get(), ModItems.MANXIUM_INGOT.get());
        nuggetsFromIngotUnpacking(consumer, ModItems.MANXIUM_NUGGET.get(), ModItems.MANXIUM_INGOT.get(), ModItems.MANXIUM_INGOT.get());
        blockFromIngotsPacking(consumer, ModBlocks.MANXIUM_BLOCK.get(), ModItems.MANXIUM_INGOT.get(), ModItems.MANXIUM_INGOT.get());
        ingotsFromBlockUnpacking(consumer, ModItems.MANXIUM_INGOT.get(), ModBlocks.MANXIUM_BLOCK.get(), ModItems.MANXIUM_INGOT.get());
        compressBlock(consumer, ModBlocks.MANXIUM_BLOCK.get(), ModBlocks.COMPRESSED_MANXIUM_BLOCK_1.get(),
                ModItems.MANXIUM_INGOT.get(), "compressed_manxium_block_1x_from_manxium_blocks");
        compressBlock(consumer, ModBlocks.COMPRESSED_MANXIUM_BLOCK_1.get(), ModBlocks.COMPRESSED_MANXIUM_BLOCK_2.get(),
                ModItems.MANXIUM_INGOT.get(), "compressed_manxium_block_2x_from_compressed_manxium_blocks_1x");
        compressBlock(consumer, ModBlocks.COMPRESSED_MANXIUM_BLOCK_2.get(), ModBlocks.COMPRESSED_MANXIUM_BLOCK_3.get(),
                ModItems.MANXIUM_INGOT.get(), "compressed_manxium_block_3x_from_compressed_manxium_blocks_2x");
        compressBlock(consumer, ModBlocks.COMPRESSED_MANXIUM_BLOCK_3.get(), ModBlocks.COMPRESSED_MANXIUM_BLOCK_4.get(),
                ModItems.MANXIUM_INGOT.get(), "compressed_manxium_block_4x_from_compressed_manxium_blocks_3x");
        compressBlock(consumer, ModBlocks.COMPRESSED_MANXIUM_BLOCK_4.get(), ModBlocks.COMPRESSED_MANXIUM_BLOCK_5.get(),
                ModItems.MANXIUM_INGOT.get(), "compressed_manxium_block_5x_from_compressed_manxium_blocks_4x");
        compressBlock(consumer, ModBlocks.COMPRESSED_MANXIUM_BLOCK_5.get(), ModBlocks.COMPRESSED_MANXIUM_BLOCK_6.get(),
                ModItems.MANXIUM_INGOT.get(), "compressed_manxium_block_6x_from_compressed_manxium_blocks_5x");
        compressBlock(consumer, ModBlocks.COMPRESSED_MANXIUM_BLOCK_6.get(), ModBlocks.COMPRESSED_MANXIUM_BLOCK_7.get(),
                ModItems.MANXIUM_INGOT.get(), "compressed_manxium_block_7x_from_compressed_manxium_blocks_6x");
        compressBlock(consumer, ModBlocks.COMPRESSED_MANXIUM_BLOCK_7.get(), ModBlocks.COMPRESSED_MANXIUM_BLOCK_8.get(),
                ModItems.MANXIUM_INGOT.get(), "compressed_manxium_block_8x_from_compressed_manxium_blocks_7x");
        compressBlock(consumer, ModBlocks.COMPRESSED_MANXIUM_BLOCK_8.get(), ModBlocks.COMPRESSED_MANXIUM_BLOCK_9.get(),
                ModItems.MANXIUM_INGOT.get(), "compressed_manxium_block_9x_from_compressed_manxium_blocks_8x");
        decompressBlock(consumer, ModBlocks.COMPRESSED_MANXIUM_BLOCK_1.get(), ModBlocks.MANXIUM_BLOCK.get(),
                ModItems.MANXIUM_INGOT.get(), "manxium_blocks_from_compressed_manxium_block_1x");
        decompressBlock(consumer, ModBlocks.COMPRESSED_MANXIUM_BLOCK_2.get(), ModBlocks.COMPRESSED_MANXIUM_BLOCK_1.get(),
                ModItems.MANXIUM_INGOT.get(), "compressed_manxium_blocks_1x_from_compressed_manxium_block_2x");
        decompressBlock(consumer, ModBlocks.COMPRESSED_MANXIUM_BLOCK_3.get(), ModBlocks.COMPRESSED_MANXIUM_BLOCK_2.get(),
                ModItems.MANXIUM_INGOT.get(), "compressed_manxium_blocks_2x_from_compressed_manxium_block_3x");
        decompressBlock(consumer, ModBlocks.COMPRESSED_MANXIUM_BLOCK_4.get(), ModBlocks.COMPRESSED_MANXIUM_BLOCK_3.get(),
                ModItems.MANXIUM_INGOT.get(), "compressed_manxium_blocks_3x_from_compressed_manxium_block_4x");
        decompressBlock(consumer, ModBlocks.COMPRESSED_MANXIUM_BLOCK_5.get(), ModBlocks.COMPRESSED_MANXIUM_BLOCK_4.get(),
                ModItems.MANXIUM_INGOT.get(), "compressed_manxium_blocks_4x_from_compressed_manxium_block_5x");
        decompressBlock(consumer, ModBlocks.COMPRESSED_MANXIUM_BLOCK_6.get(), ModBlocks.COMPRESSED_MANXIUM_BLOCK_5.get(),
                ModItems.MANXIUM_INGOT.get(), "compressed_manxium_blocks_5x_from_compressed_manxium_block_6x");
        decompressBlock(consumer, ModBlocks.COMPRESSED_MANXIUM_BLOCK_7.get(), ModBlocks.COMPRESSED_MANXIUM_BLOCK_6.get(),
                ModItems.MANXIUM_INGOT.get(), "compressed_manxium_blocks_6x_from_compressed_manxium_block_7x");
        decompressBlock(consumer, ModBlocks.COMPRESSED_MANXIUM_BLOCK_8.get(), ModBlocks.COMPRESSED_MANXIUM_BLOCK_7.get(),
                ModItems.MANXIUM_INGOT.get(), "compressed_manxium_blocks_7x_from_compressed_manxium_block_8x");
        decompressBlock(consumer, ModBlocks.COMPRESSED_MANXIUM_BLOCK_9.get(), ModBlocks.COMPRESSED_MANXIUM_BLOCK_8.get(),
                ModItems.MANXIUM_INGOT.get(), "compressed_manxium_blocks_8x_from_compressed_manxium_block_9x");
        axeRecipe(consumer, ModItems.MANXIUM_AXE.get(), ModItems.MANXIUM_INGOT.get());
        hoeRecipe(consumer, ModItems.MANXIUM_HOE.get(), ModItems.MANXIUM_INGOT.get());
        pickaxeRecipe(consumer, ModItems.MANXIUM_PICKAXE.get(), ModItems.MANXIUM_INGOT.get());
        shovelRecipe(consumer, ModItems.MANXIUM_SHOVEL.get(), ModItems.MANXIUM_INGOT.get());
        swordRecipe(consumer, ModItems.MANXIUM_SWORD.get(), ModItems.MANXIUM_INGOT.get());
        helmetRecipe(consumer, ModItems.MANXIUM_HELMET.get(), ModItems.MANXIUM_INGOT.get());
        chestplateRecipe(consumer, ModItems.MANXIUM_CHESTPLATE.get(), ModItems.MANXIUM_INGOT.get());
        leggingsRecipe(consumer, ModItems.MANXIUM_LEGGINGS.get(), ModItems.MANXIUM_INGOT.get());
        bootsRecipe(consumer, ModItems.MANXIUM_BOOTS.get(), ModItems.MANXIUM_INGOT.get());

        ingotFromNuggetsPacking(consumer, ModItems.OHLY_INGOT.get(), ModItems.OHLY_NUGGET.get(), ModItems.OHLY_INGOT.get());
        nuggetsFromIngotUnpacking(consumer, ModItems.OHLY_NUGGET.get(), ModItems.OHLY_INGOT.get(), ModItems.OHLY_INGOT.get());
        blockFromIngotsPacking(consumer, ModBlocks.OHLY_BLOCK.get(), ModItems.OHLY_INGOT.get(), ModItems.OHLY_INGOT.get());
        ingotsFromBlockUnpacking(consumer, ModItems.OHLY_INGOT.get(), ModBlocks.OHLY_BLOCK.get(), ModItems.OHLY_INGOT.get());
        compressBlock(consumer, ModBlocks.OHLY_BLOCK.get(), ModBlocks.COMPRESSED_OHLY_BLOCK_1.get(),
                ModItems.OHLY_INGOT.get(), "compressed_ohly_block_1x_from_ohly_blocks");
        compressBlock(consumer, ModBlocks.COMPRESSED_OHLY_BLOCK_1.get(), ModBlocks.COMPRESSED_OHLY_BLOCK_2.get(),
                ModItems.OHLY_INGOT.get(), "compressed_ohly_block_2x_from_compressed_ohly_blocks_1x");
        compressBlock(consumer, ModBlocks.COMPRESSED_OHLY_BLOCK_2.get(), ModBlocks.COMPRESSED_OHLY_BLOCK_3.get(),
                ModItems.OHLY_INGOT.get(), "compressed_ohly_block_3x_from_compressed_ohly_blocks_2x");
        compressBlock(consumer, ModBlocks.COMPRESSED_OHLY_BLOCK_3.get(), ModBlocks.COMPRESSED_OHLY_BLOCK_4.get(),
                ModItems.OHLY_INGOT.get(), "compressed_ohly_block_4x_from_compressed_ohly_blocks_3x");
        compressBlock(consumer, ModBlocks.COMPRESSED_OHLY_BLOCK_4.get(), ModBlocks.COMPRESSED_OHLY_BLOCK_5.get(),
                ModItems.OHLY_INGOT.get(), "compressed_ohly_block_5x_from_compressed_ohly_blocks_4x");
        compressBlock(consumer, ModBlocks.COMPRESSED_OHLY_BLOCK_5.get(), ModBlocks.COMPRESSED_OHLY_BLOCK_6.get(),
                ModItems.OHLY_INGOT.get(), "compressed_ohly_block_6x_from_compressed_ohly_blocks_5x");
        compressBlock(consumer, ModBlocks.COMPRESSED_OHLY_BLOCK_6.get(), ModBlocks.COMPRESSED_OHLY_BLOCK_7.get(),
                ModItems.OHLY_INGOT.get(), "compressed_ohly_block_7x_from_compressed_ohly_blocks_6x");
        compressBlock(consumer, ModBlocks.COMPRESSED_OHLY_BLOCK_7.get(), ModBlocks.COMPRESSED_OHLY_BLOCK_8.get(),
                ModItems.OHLY_INGOT.get(), "compressed_ohly_block_8x_from_compressed_ohly_blocks_7x");
        compressBlock(consumer, ModBlocks.COMPRESSED_OHLY_BLOCK_8.get(), ModBlocks.COMPRESSED_OHLY_BLOCK_9.get(),
                ModItems.OHLY_INGOT.get(), "compressed_ohly_block_9x_from_compressed_ohly_blocks_8x");
        decompressBlock(consumer, ModBlocks.COMPRESSED_OHLY_BLOCK_1.get(), ModBlocks.OHLY_BLOCK.get(),
                ModItems.OHLY_INGOT.get(), "ohly_blocks_from_compressed_ohly_block_1x");
        decompressBlock(consumer, ModBlocks.COMPRESSED_OHLY_BLOCK_2.get(), ModBlocks.COMPRESSED_OHLY_BLOCK_1.get(),
                ModItems.OHLY_INGOT.get(), "compressed_ohly_blocks_1x_from_compressed_ohly_block_2x");
        decompressBlock(consumer, ModBlocks.COMPRESSED_OHLY_BLOCK_3.get(), ModBlocks.COMPRESSED_OHLY_BLOCK_2.get(),
                ModItems.OHLY_INGOT.get(), "compressed_ohly_blocks_2x_from_compressed_ohly_block_3x");
        decompressBlock(consumer, ModBlocks.COMPRESSED_OHLY_BLOCK_4.get(), ModBlocks.COMPRESSED_OHLY_BLOCK_3.get(),
                ModItems.OHLY_INGOT.get(), "compressed_ohly_blocks_3x_from_compressed_ohly_block_4x");
        decompressBlock(consumer, ModBlocks.COMPRESSED_OHLY_BLOCK_5.get(), ModBlocks.COMPRESSED_OHLY_BLOCK_4.get(),
                ModItems.OHLY_INGOT.get(), "compressed_ohly_blocks_4x_from_compressed_ohly_block_5x");
        decompressBlock(consumer, ModBlocks.COMPRESSED_OHLY_BLOCK_6.get(), ModBlocks.COMPRESSED_OHLY_BLOCK_5.get(),
                ModItems.OHLY_INGOT.get(), "compressed_ohly_blocks_5x_from_compressed_ohly_block_6x");
        decompressBlock(consumer, ModBlocks.COMPRESSED_OHLY_BLOCK_7.get(), ModBlocks.COMPRESSED_OHLY_BLOCK_6.get(),
                ModItems.OHLY_INGOT.get(), "compressed_ohly_blocks_6x_from_compressed_ohly_block_7x");
        decompressBlock(consumer, ModBlocks.COMPRESSED_OHLY_BLOCK_8.get(), ModBlocks.COMPRESSED_OHLY_BLOCK_7.get(),
                ModItems.OHLY_INGOT.get(), "compressed_ohly_blocks_7x_from_compressed_ohly_block_8x");
        decompressBlock(consumer, ModBlocks.COMPRESSED_OHLY_BLOCK_9.get(), ModBlocks.COMPRESSED_OHLY_BLOCK_8.get(),
                ModItems.OHLY_INGOT.get(), "compressed_ohly_blocks_8x_from_compressed_ohly_block_9x");
        axeRecipe(consumer, ModItems.OHLY_AXE.get(), ModItems.OHLY_INGOT.get());
        hoeRecipe(consumer, ModItems.OHLY_HOE.get(), ModItems.OHLY_INGOT.get());
        pickaxeRecipe(consumer, ModItems.OHLY_PICKAXE.get(), ModItems.OHLY_INGOT.get());
        shovelRecipe(consumer, ModItems.OHLY_SHOVEL.get(), ModItems.OHLY_INGOT.get());
        swordRecipe(consumer, ModItems.OHLY_SWORD.get(), ModItems.OHLY_INGOT.get());
        helmetRecipe(consumer, ModItems.OHLY_HELMET.get(), ModItems.OHLY_INGOT.get());
        chestplateRecipe(consumer, ModItems.OHLY_CHESTPLATE.get(), ModItems.OHLY_INGOT.get());
        leggingsRecipe(consumer, ModItems.OHLY_LEGGINGS.get(), ModItems.OHLY_INGOT.get());
        bootsRecipe(consumer, ModItems.OHLY_BOOTS.get(), ModItems.OHLY_INGOT.get());

        ingotFromNuggetsPacking(consumer, ModItems.RAGOUTON_INGOT.get(), ModItems.RAGOUTON_NUGGET.get(), ModItems.RAGOUTON_INGOT.get());
        nuggetsFromIngotUnpacking(consumer,ModItems.RAGOUTON_NUGGET.get(), ModItems.RAGOUTON_INGOT.get(), ModItems.RAGOUTON_INGOT.get());
        blockFromIngotsPacking(consumer, ModBlocks.RAGOUTON_BLOCK.get(), ModItems.RAGOUTON_INGOT.get(), ModItems.RAGOUTON_INGOT.get());
        ingotsFromBlockUnpacking(consumer, ModItems.RAGOUTON_INGOT.get(), ModBlocks.RAGOUTON_BLOCK.get(), ModItems.RAGOUTON_INGOT.get());
        compressBlock(consumer, ModBlocks.RAGOUTON_BLOCK.get(), ModBlocks.COMPRESSED_RAGOUTON_BLOCK_1.get(),
                ModItems.RAGOUTON_INGOT.get(), "compressed_ragouton_block_1x_from_ragouton_blocks");
        compressBlock(consumer, ModBlocks.COMPRESSED_RAGOUTON_BLOCK_1.get(), ModBlocks.COMPRESSED_RAGOUTON_BLOCK_2.get(),
                ModItems.RAGOUTON_INGOT.get(), "compressed_ragouton_block_2x_from_compressed_ragouton_blocks_1x");
        compressBlock(consumer, ModBlocks.COMPRESSED_RAGOUTON_BLOCK_2.get(), ModBlocks.COMPRESSED_RAGOUTON_BLOCK_3.get(),
                ModItems.RAGOUTON_INGOT.get(), "compressed_ragouton_block_3x_from_compressed_ragouton_blocks_2x");
        compressBlock(consumer, ModBlocks.COMPRESSED_RAGOUTON_BLOCK_3.get(), ModBlocks.COMPRESSED_RAGOUTON_BLOCK_4.get(),
                ModItems.RAGOUTON_INGOT.get(), "compressed_ragouton_block_4x_from_compressed_ragouton_blocks_3x");
        compressBlock(consumer, ModBlocks.COMPRESSED_RAGOUTON_BLOCK_4.get(), ModBlocks.COMPRESSED_RAGOUTON_BLOCK_5.get(),
                ModItems.RAGOUTON_INGOT.get(), "compressed_ragouton_block_5x_from_compressed_ragouton_blocks_4x");
        compressBlock(consumer, ModBlocks.COMPRESSED_RAGOUTON_BLOCK_5.get(), ModBlocks.COMPRESSED_RAGOUTON_BLOCK_6.get(),
                ModItems.RAGOUTON_INGOT.get(), "compressed_ragouton_block_6x_from_compressed_ragouton_blocks_5x");
        compressBlock(consumer, ModBlocks.COMPRESSED_RAGOUTON_BLOCK_6.get(), ModBlocks.COMPRESSED_RAGOUTON_BLOCK_7.get(),
                ModItems.RAGOUTON_INGOT.get(), "compressed_ragouton_block_7x_from_compressed_ragouton_blocks_6x");
        compressBlock(consumer, ModBlocks.COMPRESSED_RAGOUTON_BLOCK_7.get(), ModBlocks.COMPRESSED_RAGOUTON_BLOCK_8.get(),
                ModItems.RAGOUTON_INGOT.get(), "compressed_ragouton_block_8x_from_compressed_ragouton_blocks_7x");
        compressBlock(consumer, ModBlocks.COMPRESSED_RAGOUTON_BLOCK_8.get(), ModBlocks.COMPRESSED_RAGOUTON_BLOCK_9.get(),
                ModItems.RAGOUTON_INGOT.get(), "compressed_ragouton_block_9x_from_compressed_ragouton_blocks_8x");
        decompressBlock(consumer, ModBlocks.COMPRESSED_RAGOUTON_BLOCK_1.get(), ModBlocks.RAGOUTON_BLOCK.get(),
                ModItems.RAGOUTON_INGOT.get(), "ragouton_blocks_from_compressed_ragouton_block_1x");
        decompressBlock(consumer, ModBlocks.COMPRESSED_RAGOUTON_BLOCK_2.get(), ModBlocks.COMPRESSED_RAGOUTON_BLOCK_1.get(),
                ModItems.RAGOUTON_INGOT.get(), "compressed_ragouton_blocks_1x_from_compressed_ragouton_block_2x");
        decompressBlock(consumer, ModBlocks.COMPRESSED_RAGOUTON_BLOCK_3.get(), ModBlocks.COMPRESSED_RAGOUTON_BLOCK_2.get(),
                ModItems.RAGOUTON_INGOT.get(), "compressed_ragouton_blocks_2x_from_compressed_ragouton_block_3x");
        decompressBlock(consumer, ModBlocks.COMPRESSED_RAGOUTON_BLOCK_4.get(), ModBlocks.COMPRESSED_RAGOUTON_BLOCK_3.get(),
                ModItems.RAGOUTON_INGOT.get(), "compressed_ragouton_blocks_3x_from_compressed_ragouton_block_4x");
        decompressBlock(consumer, ModBlocks.COMPRESSED_RAGOUTON_BLOCK_5.get(), ModBlocks.COMPRESSED_RAGOUTON_BLOCK_4.get(),
                ModItems.RAGOUTON_INGOT.get(), "compressed_ragouton_blocks_4x_from_compressed_ragouton_block_5x");
        decompressBlock(consumer, ModBlocks.COMPRESSED_RAGOUTON_BLOCK_6.get(), ModBlocks.COMPRESSED_RAGOUTON_BLOCK_5.get(),
                ModItems.RAGOUTON_INGOT.get(), "compressed_ragouton_blocks_5x_from_compressed_ragouton_block_6x");
        decompressBlock(consumer, ModBlocks.COMPRESSED_RAGOUTON_BLOCK_7.get(), ModBlocks.COMPRESSED_RAGOUTON_BLOCK_6.get(),
                ModItems.RAGOUTON_INGOT.get(), "compressed_ragouton_blocks_6x_from_compressed_ragouton_block_7x");
        decompressBlock(consumer, ModBlocks.COMPRESSED_RAGOUTON_BLOCK_8.get(), ModBlocks.COMPRESSED_RAGOUTON_BLOCK_7.get(),
                ModItems.RAGOUTON_INGOT.get(), "compressed_ragouton_blocks_7x_from_compressed_ragouton_block_8x");
        decompressBlock(consumer, ModBlocks.COMPRESSED_RAGOUTON_BLOCK_9.get(), ModBlocks.COMPRESSED_RAGOUTON_BLOCK_8.get(),
                ModItems.RAGOUTON_INGOT.get(), "compressed_ragouton_blocks_8x_from_compressed_ragouton_block_9x");
        axeRecipe(consumer, ModItems.RAGOUTON_AXE.get(), ModItems.RAGOUTON_INGOT.get());
        hoeRecipe(consumer, ModItems.RAGOUTON_HOE.get(), ModItems.RAGOUTON_INGOT.get());
        pickaxeRecipe(consumer, ModItems.RAGOUTON_PICKAXE.get(), ModItems.RAGOUTON_INGOT.get());
        shovelRecipe(consumer, ModItems.RAGOUTON_SHOVEL.get(), ModItems.RAGOUTON_INGOT.get());
        swordRecipe(consumer, ModItems.RAGOUTON_SWORD.get(), ModItems.RAGOUTON_INGOT.get());
        helmetRecipe(consumer, ModItems.RAGOUTON_HELMET.get(), ModItems.RAGOUTON_INGOT.get());
        chestplateRecipe(consumer, ModItems.RAGOUTON_CHESTPLATE.get(), ModItems.RAGOUTON_INGOT.get());
        leggingsRecipe(consumer, ModItems.RAGOUTON_LEGGINGS.get(), ModItems.RAGOUTON_INGOT.get());
        bootsRecipe(consumer, ModItems.RAGOUTON_BOOTS.get(), ModItems.RAGOUTON_INGOT.get());

        ingotFromNuggetsPacking(consumer, ModItems.SLITHESE_INGOT.get(), ModItems.SLITHESE_NUGGET.get(), ModItems.SLITHESE_INGOT.get());
        nuggetsFromIngotUnpacking(consumer, ModItems.SLITHESE_NUGGET.get(), ModItems.SLITHESE_INGOT.get(), ModItems.SLITHESE_INGOT.get());
        blockFromIngotsPacking(consumer, ModBlocks.SLITHESE_BLOCK.get(), ModItems.SLITHESE_INGOT.get(), ModItems.SLITHESE_INGOT.get());
        ingotsFromBlockUnpacking(consumer, ModItems.SLITHESE_INGOT.get(), ModBlocks.SLITHESE_BLOCK.get(), ModItems.SLITHESE_INGOT.get());
        compressBlock(consumer, ModBlocks.SLITHESE_BLOCK.get(), ModBlocks.COMPRESSED_SLITHESE_BLOCK_1.get(),
                ModItems.SLITHESE_INGOT.get(), "compressed_slithese_block_1x_from_slithese_blocks");
        compressBlock(consumer, ModBlocks.COMPRESSED_SLITHESE_BLOCK_1.get(), ModBlocks.COMPRESSED_SLITHESE_BLOCK_2.get(),
                ModItems.SLITHESE_INGOT.get(), "compressed_slithese_block_2x_from_compressed_slithese_blocks_1x");
        compressBlock(consumer, ModBlocks.COMPRESSED_SLITHESE_BLOCK_2.get(), ModBlocks.COMPRESSED_SLITHESE_BLOCK_3.get(),
                ModItems.SLITHESE_INGOT.get(), "compressed_slithese_block_3x_from_compressed_slithese_blocks_2x");
        compressBlock(consumer, ModBlocks.COMPRESSED_SLITHESE_BLOCK_3.get(), ModBlocks.COMPRESSED_SLITHESE_BLOCK_4.get(),
                ModItems.SLITHESE_INGOT.get(), "compressed_slithese_block_4x_from_compressed_slithese_blocks_3x");
        compressBlock(consumer, ModBlocks.COMPRESSED_SLITHESE_BLOCK_4.get(), ModBlocks.COMPRESSED_SLITHESE_BLOCK_5.get(),
                ModItems.SLITHESE_INGOT.get(), "compressed_slithese_block_5x_from_compressed_slithese_blocks_4x");
        compressBlock(consumer, ModBlocks.COMPRESSED_SLITHESE_BLOCK_5.get(), ModBlocks.COMPRESSED_SLITHESE_BLOCK_6.get(),
                ModItems.SLITHESE_INGOT.get(), "compressed_slithese_block_6x_from_compressed_slithese_blocks_5x");
        compressBlock(consumer, ModBlocks.COMPRESSED_SLITHESE_BLOCK_6.get(), ModBlocks.COMPRESSED_SLITHESE_BLOCK_7.get(),
                ModItems.SLITHESE_INGOT.get(), "compressed_slithese_block_7x_from_compressed_slithese_blocks_6x");
        compressBlock(consumer, ModBlocks.COMPRESSED_SLITHESE_BLOCK_7.get(), ModBlocks.COMPRESSED_SLITHESE_BLOCK_8.get(),
                ModItems.SLITHESE_INGOT.get(), "compressed_slithese_block_8x_from_compressed_slithese_blocks_7x");
        compressBlock(consumer, ModBlocks.COMPRESSED_SLITHESE_BLOCK_8.get(), ModBlocks.COMPRESSED_SLITHESE_BLOCK_9.get(),
                ModItems.SLITHESE_INGOT.get(), "compressed_slithese_block_9x_from_compressed_slithese_blocks_8x");
        decompressBlock(consumer, ModBlocks.COMPRESSED_SLITHESE_BLOCK_1.get(), ModBlocks.SLITHESE_BLOCK.get(),
                ModItems.SLITHESE_INGOT.get(), "slithese_blocks_from_compressed_slithese_block_1x");
        decompressBlock(consumer, ModBlocks.COMPRESSED_SLITHESE_BLOCK_2.get(), ModBlocks.COMPRESSED_SLITHESE_BLOCK_1.get(),
                ModItems.SLITHESE_INGOT.get(), "compressed_slithese_blocks_1x_from_compressed_slithese_block_2x");
        decompressBlock(consumer, ModBlocks.COMPRESSED_SLITHESE_BLOCK_3.get(), ModBlocks.COMPRESSED_SLITHESE_BLOCK_2.get(),
                ModItems.SLITHESE_INGOT.get(), "compressed_slithese_blocks_2x_from_compressed_slithese_block_3x");
        decompressBlock(consumer, ModBlocks.COMPRESSED_SLITHESE_BLOCK_4.get(), ModBlocks.COMPRESSED_SLITHESE_BLOCK_3.get(),
                ModItems.SLITHESE_INGOT.get(), "compressed_slithese_blocks_3x_from_compressed_slithese_block_4x");
        decompressBlock(consumer, ModBlocks.COMPRESSED_SLITHESE_BLOCK_5.get(), ModBlocks.COMPRESSED_SLITHESE_BLOCK_4.get(),
                ModItems.SLITHESE_INGOT.get(), "compressed_slithese_blocks_4x_from_compressed_slithese_block_5x");
        decompressBlock(consumer, ModBlocks.COMPRESSED_SLITHESE_BLOCK_6.get(), ModBlocks.COMPRESSED_SLITHESE_BLOCK_5.get(),
                ModItems.SLITHESE_INGOT.get(), "compressed_slithese_blocks_5x_from_compressed_slithese_block_6x");
        decompressBlock(consumer, ModBlocks.COMPRESSED_SLITHESE_BLOCK_7.get(), ModBlocks.COMPRESSED_SLITHESE_BLOCK_6.get(),
                ModItems.SLITHESE_INGOT.get(), "compressed_slithese_blocks_6x_from_compressed_slithese_block_7x");
        decompressBlock(consumer, ModBlocks.COMPRESSED_SLITHESE_BLOCK_8.get(), ModBlocks.COMPRESSED_SLITHESE_BLOCK_7.get(),
                ModItems.SLITHESE_INGOT.get(), "compressed_slithese_blocks_7x_from_compressed_slithese_block_8x");
        decompressBlock(consumer, ModBlocks.COMPRESSED_SLITHESE_BLOCK_9.get(), ModBlocks.COMPRESSED_SLITHESE_BLOCK_8.get(),
                ModItems.SLITHESE_INGOT.get(), "compressed_slithese_blocks_8x_from_compressed_slithese_block_9x");
        axeRecipe(consumer, ModItems.SLITHESE_AXE.get(), ModItems.SLITHESE_INGOT.get());
        hoeRecipe(consumer, ModItems.SLITHESE_HOE.get(), ModItems.SLITHESE_INGOT.get());
        pickaxeRecipe(consumer, ModItems.SLITHESE_PICKAXE.get(), ModItems.SLITHESE_INGOT.get());
        shovelRecipe(consumer, ModItems.SLITHESE_SHOVEL.get(), ModItems.SLITHESE_INGOT.get());
        swordRecipe(consumer, ModItems.SLITHESE_SWORD.get(), ModItems.SLITHESE_INGOT.get());
        helmetRecipe(consumer, ModItems.SLITHESE_HELMET.get(), ModItems.SLITHESE_INGOT.get());
        chestplateRecipe(consumer, ModItems.SLITHESE_CHESTPLATE.get(), ModItems.SLITHESE_INGOT.get());
        leggingsRecipe(consumer, ModItems.SLITHESE_LEGGINGS.get(), ModItems.SLITHESE_INGOT.get());
        bootsRecipe(consumer, ModItems.SLITHESE_BOOTS.get(), ModItems.SLITHESE_INGOT.get());

        ingotFromNuggetsPacking(consumer, ModItems.TARMENIS_INGOT.get(), ModItems.TARMENIS_NUGGET.get(), ModItems.TARMENIS_INGOT.get());
        nuggetsFromIngotUnpacking(consumer, ModItems.TARMENIS_NUGGET.get(), ModItems.TARMENIS_INGOT.get(), ModItems.TARMENIS_INGOT.get());
        blockFromIngotsPacking(consumer, ModBlocks.TARMENIS_BLOCK.get(), ModItems.TARMENIS_INGOT.get(), ModItems.TARMENIS_INGOT.get());
        ingotsFromBlockUnpacking(consumer, ModItems.TARMENIS_INGOT.get(), ModBlocks.TARMENIS_BLOCK.get(), ModItems.TARMENIS_INGOT.get());
        compressBlock(consumer, ModBlocks.TARMENIS_BLOCK.get(), ModBlocks.COMPRESSED_TARMENIS_BLOCK_1.get(),
                ModItems.TARMENIS_INGOT.get(), "compressed_tarmenis_block_1x_from_tarmenis_blocks");
        compressBlock(consumer, ModBlocks.COMPRESSED_TARMENIS_BLOCK_1.get(), ModBlocks.COMPRESSED_TARMENIS_BLOCK_2.get(),
                ModItems.TARMENIS_INGOT.get(), "compressed_tarmenis_block_2x_from_compressed_tarmenis_blocks_1x");
        compressBlock(consumer, ModBlocks.COMPRESSED_TARMENIS_BLOCK_2.get(), ModBlocks.COMPRESSED_TARMENIS_BLOCK_3.get(),
                ModItems.TARMENIS_INGOT.get(), "compressed_tarmenis_block_3x_from_compressed_tarmenis_blocks_2x");
        compressBlock(consumer, ModBlocks.COMPRESSED_TARMENIS_BLOCK_3.get(), ModBlocks.COMPRESSED_TARMENIS_BLOCK_4.get(),
                ModItems.TARMENIS_INGOT.get(), "compressed_tarmenis_block_4x_from_compressed_tarmenis_blocks_3x");
        compressBlock(consumer, ModBlocks.COMPRESSED_TARMENIS_BLOCK_4.get(), ModBlocks.COMPRESSED_TARMENIS_BLOCK_5.get(),
                ModItems.TARMENIS_INGOT.get(), "compressed_tarmenis_block_5x_from_compressed_tarmenis_blocks_4x");
        compressBlock(consumer, ModBlocks.COMPRESSED_TARMENIS_BLOCK_5.get(), ModBlocks.COMPRESSED_TARMENIS_BLOCK_6.get(),
                ModItems.TARMENIS_INGOT.get(), "compressed_tarmenis_block_6x_from_compressed_tarmenis_blocks_5x");
        compressBlock(consumer, ModBlocks.COMPRESSED_TARMENIS_BLOCK_6.get(), ModBlocks.COMPRESSED_TARMENIS_BLOCK_7.get(),
                ModItems.TARMENIS_INGOT.get(), "compressed_tarmenis_block_7x_from_compressed_tarmenis_blocks_6x");
        compressBlock(consumer, ModBlocks.COMPRESSED_TARMENIS_BLOCK_7.get(), ModBlocks.COMPRESSED_TARMENIS_BLOCK_8.get(),
                ModItems.TARMENIS_INGOT.get(), "compressed_tarmenis_block_8x_from_compressed_tarmenis_blocks_7x");
        compressBlock(consumer, ModBlocks.COMPRESSED_TARMENIS_BLOCK_8.get(), ModBlocks.COMPRESSED_TARMENIS_BLOCK_9.get(),
                ModItems.TARMENIS_INGOT.get(), "compressed_tarmenis_block_9x_from_compressed_tarmenis_blocks_8x");
        decompressBlock(consumer, ModBlocks.COMPRESSED_TARMENIS_BLOCK_1.get(), ModBlocks.TARMENIS_BLOCK.get(),
                ModItems.TARMENIS_INGOT.get(), "tarmenis_blocks_from_compressed_tarmenis_block_1x");
        decompressBlock(consumer, ModBlocks.COMPRESSED_TARMENIS_BLOCK_2.get(), ModBlocks.COMPRESSED_TARMENIS_BLOCK_1.get(),
                ModItems.TARMENIS_INGOT.get(), "compressed_tarmenis_blocks_1x_from_compressed_tarmenis_block_2x");
        decompressBlock(consumer, ModBlocks.COMPRESSED_TARMENIS_BLOCK_3.get(), ModBlocks.COMPRESSED_TARMENIS_BLOCK_2.get(),
                ModItems.TARMENIS_INGOT.get(), "compressed_tarmenis_blocks_2x_from_compressed_tarmenis_block_3x");
        decompressBlock(consumer, ModBlocks.COMPRESSED_TARMENIS_BLOCK_4.get(), ModBlocks.COMPRESSED_TARMENIS_BLOCK_3.get(),
                ModItems.TARMENIS_INGOT.get(), "compressed_tarmenis_blocks_3x_from_compressed_tarmenis_block_4x");
        decompressBlock(consumer, ModBlocks.COMPRESSED_TARMENIS_BLOCK_5.get(), ModBlocks.COMPRESSED_TARMENIS_BLOCK_4.get(),
                ModItems.TARMENIS_INGOT.get(), "compressed_tarmenis_blocks_4x_from_compressed_tarmenis_block_5x");
        decompressBlock(consumer, ModBlocks.COMPRESSED_TARMENIS_BLOCK_6.get(), ModBlocks.COMPRESSED_TARMENIS_BLOCK_5.get(),
                ModItems.TARMENIS_INGOT.get(), "compressed_tarmenis_blocks_5x_from_compressed_tarmenis_block_6x");
        decompressBlock(consumer, ModBlocks.COMPRESSED_TARMENIS_BLOCK_7.get(), ModBlocks.COMPRESSED_TARMENIS_BLOCK_6.get(),
                ModItems.TARMENIS_INGOT.get(), "compressed_tarmenis_blocks_6x_from_compressed_tarmenis_block_7x");
        decompressBlock(consumer, ModBlocks.COMPRESSED_TARMENIS_BLOCK_8.get(), ModBlocks.COMPRESSED_TARMENIS_BLOCK_7.get(),
                ModItems.TARMENIS_INGOT.get(), "compressed_tarmenis_blocks_7x_from_compressed_tarmenis_block_8x");
        decompressBlock(consumer, ModBlocks.COMPRESSED_TARMENIS_BLOCK_9.get(), ModBlocks.COMPRESSED_TARMENIS_BLOCK_8.get(),
                ModItems.TARMENIS_INGOT.get(), "compressed_tarmenis_blocks_8x_from_compressed_tarmenis_block_9x");
        axeRecipe(consumer, ModItems.TARMENIS_AXE.get(), ModItems.TARMENIS_INGOT.get());
        hoeRecipe(consumer, ModItems.TARMENIS_HOE.get(), ModItems.TARMENIS_INGOT.get());
        pickaxeRecipe(consumer, ModItems.TARMENIS_PICKAXE.get(), ModItems.TARMENIS_INGOT.get());
        shovelRecipe(consumer, ModItems.TARMENIS_SHOVEL.get(), ModItems.TARMENIS_INGOT.get());
        swordRecipe(consumer, ModItems.TARMENIS_SWORD.get(), ModItems.TARMENIS_INGOT.get());
        helmetRecipe(consumer, ModItems.TARMENIS_HELMET.get(), ModItems.TARMENIS_INGOT.get());
        chestplateRecipe(consumer, ModItems.TARMENIS_CHESTPLATE.get(), ModItems.TARMENIS_INGOT.get());
        leggingsRecipe(consumer, ModItems.TARMENIS_LEGGINGS.get(), ModItems.TARMENIS_INGOT.get());
        bootsRecipe(consumer, ModItems.TARMENIS_BOOTS.get(), ModItems.TARMENIS_INGOT.get());

        ingotFromNuggetsPacking(consumer, ModItems.VIGNASS_INGOT.get(), ModItems.VIGNASS_NUGGET.get(), ModItems.VIGNASS_INGOT.get());
        nuggetsFromIngotUnpacking(consumer, ModItems.VIGNASS_NUGGET.get(), ModItems.VIGNASS_INGOT.get(), ModItems.VIGNASS_INGOT.get());
        blockFromIngotsPacking(consumer, ModBlocks.VIGNASS_BLOCK.get(), ModItems.VIGNASS_INGOT.get(), ModItems.VIGNASS_INGOT.get());
        ingotsFromBlockUnpacking(consumer, ModItems.VIGNASS_INGOT.get(), ModBlocks.VIGNASS_BLOCK.get(), ModItems.VIGNASS_INGOT.get());
        compressBlock(consumer, ModBlocks.VIGNASS_BLOCK.get(), ModBlocks.COMPRESSED_VIGNASS_BLOCK_1.get(),
                ModItems.VIGNASS_INGOT.get(), "compressed_vignass_block_1x_from_vignass_blocks");
        compressBlock(consumer, ModBlocks.COMPRESSED_VIGNASS_BLOCK_1.get(), ModBlocks.COMPRESSED_VIGNASS_BLOCK_2.get(),
                ModItems.VIGNASS_INGOT.get(), "compressed_vignass_block_2x_from_compressed_vignass_blocks_1x");
        compressBlock(consumer, ModBlocks.COMPRESSED_VIGNASS_BLOCK_2.get(), ModBlocks.COMPRESSED_VIGNASS_BLOCK_3.get(),
                ModItems.VIGNASS_INGOT.get(), "compressed_vignass_block_3x_from_compressed_vignass_blocks_2x");
        compressBlock(consumer, ModBlocks.COMPRESSED_VIGNASS_BLOCK_3.get(), ModBlocks.COMPRESSED_VIGNASS_BLOCK_4.get(),
                ModItems.VIGNASS_INGOT.get(), "compressed_vignass_block_4x_from_compressed_vignass_blocks_3x");
        compressBlock(consumer, ModBlocks.COMPRESSED_VIGNASS_BLOCK_4.get(), ModBlocks.COMPRESSED_VIGNASS_BLOCK_5.get(),
                ModItems.VIGNASS_INGOT.get(), "compressed_vignass_block_5x_from_compressed_vignass_blocks_4x");
        compressBlock(consumer, ModBlocks.COMPRESSED_VIGNASS_BLOCK_5.get(), ModBlocks.COMPRESSED_VIGNASS_BLOCK_6.get(),
                ModItems.VIGNASS_INGOT.get(), "compressed_vignass_block_6x_from_compressed_vignass_blocks_5x");
        compressBlock(consumer, ModBlocks.COMPRESSED_VIGNASS_BLOCK_6.get(), ModBlocks.COMPRESSED_VIGNASS_BLOCK_7.get(),
                ModItems.VIGNASS_INGOT.get(), "compressed_vignass_block_7x_from_compressed_vignass_blocks_6x");
        compressBlock(consumer, ModBlocks.COMPRESSED_VIGNASS_BLOCK_7.get(), ModBlocks.COMPRESSED_VIGNASS_BLOCK_8.get(),
                ModItems.VIGNASS_INGOT.get(), "compressed_vignass_block_8x_from_compressed_vignass_blocks_7x");
        compressBlock(consumer, ModBlocks.COMPRESSED_VIGNASS_BLOCK_8.get(), ModBlocks.COMPRESSED_VIGNASS_BLOCK_9.get(),
                ModItems.VIGNASS_INGOT.get(), "compressed_vignass_block_9x_from_compressed_vignass_blocks_8x");
        decompressBlock(consumer, ModBlocks.COMPRESSED_VIGNASS_BLOCK_1.get(), ModBlocks.VIGNASS_BLOCK.get(),
                ModItems.VIGNASS_INGOT.get(), "vignass_blocks_from_compressed_vignass_block_1x");
        decompressBlock(consumer, ModBlocks.COMPRESSED_VIGNASS_BLOCK_2.get(), ModBlocks.COMPRESSED_VIGNASS_BLOCK_1.get(),
                ModItems.VIGNASS_INGOT.get(), "compressed_vignass_blocks_1x_from_compressed_vignass_block_2x");
        decompressBlock(consumer, ModBlocks.COMPRESSED_VIGNASS_BLOCK_3.get(), ModBlocks.COMPRESSED_VIGNASS_BLOCK_2.get(),
                ModItems.VIGNASS_INGOT.get(), "compressed_vignass_blocks_2x_from_compressed_vignass_block_3x");
        decompressBlock(consumer, ModBlocks.COMPRESSED_VIGNASS_BLOCK_4.get(), ModBlocks.COMPRESSED_VIGNASS_BLOCK_3.get(),
                ModItems.VIGNASS_INGOT.get(), "compressed_vignass_blocks_3x_from_compressed_vignass_block_4x");
        decompressBlock(consumer, ModBlocks.COMPRESSED_VIGNASS_BLOCK_5.get(), ModBlocks.COMPRESSED_VIGNASS_BLOCK_4.get(),
                ModItems.VIGNASS_INGOT.get(), "compressed_vignass_blocks_4x_from_compressed_vignass_block_5x");
        decompressBlock(consumer, ModBlocks.COMPRESSED_VIGNASS_BLOCK_6.get(), ModBlocks.COMPRESSED_VIGNASS_BLOCK_5.get(),
                ModItems.VIGNASS_INGOT.get(), "compressed_vignass_blocks_5x_from_compressed_vignass_block_6x");
        decompressBlock(consumer, ModBlocks.COMPRESSED_VIGNASS_BLOCK_7.get(), ModBlocks.COMPRESSED_VIGNASS_BLOCK_6.get(),
                ModItems.VIGNASS_INGOT.get(), "compressed_vignass_blocks_6x_from_compressed_vignass_block_7x");
        decompressBlock(consumer, ModBlocks.COMPRESSED_VIGNASS_BLOCK_8.get(), ModBlocks.COMPRESSED_VIGNASS_BLOCK_7.get(),
                ModItems.VIGNASS_INGOT.get(), "compressed_vignass_blocks_7x_from_compressed_vignass_block_8x");
        decompressBlock(consumer, ModBlocks.COMPRESSED_VIGNASS_BLOCK_9.get(), ModBlocks.COMPRESSED_VIGNASS_BLOCK_8.get(),
                ModItems.VIGNASS_INGOT.get(), "compressed_vignass_blocks_8x_from_compressed_vignass_block_9x");
        axeRecipe(consumer, ModItems.VIGNASS_AXE.get(), ModItems.VIGNASS_INGOT.get());
        hoeRecipe(consumer, ModItems.VIGNASS_HOE.get(), ModItems.VIGNASS_INGOT.get());
        pickaxeRecipe(consumer, ModItems.VIGNASS_PICKAXE.get(), ModItems.VIGNASS_INGOT.get());
        shovelRecipe(consumer, ModItems.VIGNASS_SHOVEL.get(), ModItems.VIGNASS_INGOT.get());
        swordRecipe(consumer, ModItems.VIGNASS_SWORD.get(), ModItems.VIGNASS_INGOT.get());
        helmetRecipe(consumer, ModItems.VIGNASS_HELMET.get(), ModItems.VIGNASS_INGOT.get());
        chestplateRecipe(consumer, ModItems.VIGNASS_CHESTPLATE.get(), ModItems.VIGNASS_INGOT.get());
        leggingsRecipe(consumer, ModItems.VIGNASS_LEGGINGS.get(), ModItems.VIGNASS_INGOT.get());
        bootsRecipe(consumer, ModItems.VIGNASS_BOOTS.get(), ModItems.VIGNASS_INGOT.get());

        ingotFromNuggetsPacking(consumer, ModItems.VOLUCIERA_INGOT.get(), ModItems.VOLUCIERA_NUGGET.get(), ModItems.VOLUCIERA_INGOT.get());
        nuggetsFromIngotUnpacking(consumer, ModItems.VOLUCIERA_NUGGET.get(), ModItems.VOLUCIERA_INGOT.get(), ModItems.VOLUCIERA_INGOT.get());
        blockFromIngotsPacking(consumer, ModBlocks.VOLUCIERA_BLOCK.get(), ModItems.VOLUCIERA_INGOT.get(), ModItems.VOLUCIERA_INGOT.get());
        ingotsFromBlockUnpacking(consumer, ModItems.VOLUCIERA_INGOT.get(), ModBlocks.VOLUCIERA_BLOCK.get(), ModItems.VOLUCIERA_INGOT.get());
        compressBlock(consumer, ModBlocks.VOLUCIERA_BLOCK.get(), ModBlocks.COMPRESSED_VOLUCIERA_BLOCK_1.get(),
                ModItems.VOLUCIERA_INGOT.get(), "compressed_voluciera_block_1x_from_voluciera_blocks");
        compressBlock(consumer, ModBlocks.COMPRESSED_VOLUCIERA_BLOCK_1.get(), ModBlocks.COMPRESSED_VOLUCIERA_BLOCK_2.get(),
                ModItems.VOLUCIERA_INGOT.get(), "compressed_voluciera_block_2x_from_compressed_voluciera_blocks_1x");
        compressBlock(consumer, ModBlocks.COMPRESSED_VOLUCIERA_BLOCK_2.get(), ModBlocks.COMPRESSED_VOLUCIERA_BLOCK_3.get(),
                ModItems.VOLUCIERA_INGOT.get(), "compressed_voluciera_block_3x_from_compressed_voluciera_blocks_2x");
        compressBlock(consumer, ModBlocks.COMPRESSED_VOLUCIERA_BLOCK_3.get(), ModBlocks.COMPRESSED_VOLUCIERA_BLOCK_4.get(),
                ModItems.VOLUCIERA_INGOT.get(), "compressed_voluciera_block_4x_from_compressed_voluciera_blocks_3x");
        compressBlock(consumer, ModBlocks.COMPRESSED_VOLUCIERA_BLOCK_4.get(), ModBlocks.COMPRESSED_VOLUCIERA_BLOCK_5.get(),
                ModItems.VOLUCIERA_INGOT.get(), "compressed_voluciera_block_5x_from_compressed_voluciera_blocks_4x");
        compressBlock(consumer, ModBlocks.COMPRESSED_VOLUCIERA_BLOCK_5.get(), ModBlocks.COMPRESSED_VOLUCIERA_BLOCK_6.get(),
                ModItems.VOLUCIERA_INGOT.get(), "compressed_voluciera_block_6x_from_compressed_voluciera_blocks_5x");
        compressBlock(consumer, ModBlocks.COMPRESSED_VOLUCIERA_BLOCK_6.get(), ModBlocks.COMPRESSED_VOLUCIERA_BLOCK_7.get(),
                ModItems.VOLUCIERA_INGOT.get(), "compressed_voluciera_block_7x_from_compressed_voluciera_blocks_6x");
        compressBlock(consumer, ModBlocks.COMPRESSED_VOLUCIERA_BLOCK_7.get(), ModBlocks.COMPRESSED_VOLUCIERA_BLOCK_8.get(),
                ModItems.VOLUCIERA_INGOT.get(), "compressed_voluciera_block_8x_from_compressed_voluciera_blocks_7x");
        compressBlock(consumer, ModBlocks.COMPRESSED_VOLUCIERA_BLOCK_8.get(), ModBlocks.COMPRESSED_VOLUCIERA_BLOCK_9.get(),
                ModItems.VOLUCIERA_INGOT.get(), "compressed_voluciera_block_9x_from_compressed_voluciera_blocks_8x");
        decompressBlock(consumer, ModBlocks.COMPRESSED_VOLUCIERA_BLOCK_1.get(), ModBlocks.VOLUCIERA_BLOCK.get(),
                ModItems.VOLUCIERA_INGOT.get(), "voluciera_blocks_from_compressed_voluciera_block_1x");
        decompressBlock(consumer, ModBlocks.COMPRESSED_VOLUCIERA_BLOCK_2.get(), ModBlocks.COMPRESSED_VOLUCIERA_BLOCK_1.get(),
                ModItems.VOLUCIERA_INGOT.get(), "compressed_voluciera_blocks_1x_from_compressed_voluciera_block_2x");
        decompressBlock(consumer, ModBlocks.COMPRESSED_VOLUCIERA_BLOCK_3.get(), ModBlocks.COMPRESSED_VOLUCIERA_BLOCK_2.get(),
                ModItems.VOLUCIERA_INGOT.get(), "compressed_voluciera_blocks_2x_from_compressed_voluciera_block_3x");
        decompressBlock(consumer, ModBlocks.COMPRESSED_VOLUCIERA_BLOCK_4.get(), ModBlocks.COMPRESSED_VOLUCIERA_BLOCK_3.get(),
                ModItems.VOLUCIERA_INGOT.get(), "compressed_voluciera_blocks_3x_from_compressed_voluciera_block_4x");
        decompressBlock(consumer, ModBlocks.COMPRESSED_VOLUCIERA_BLOCK_5.get(), ModBlocks.COMPRESSED_VOLUCIERA_BLOCK_4.get(),
                ModItems.VOLUCIERA_INGOT.get(), "compressed_voluciera_blocks_4x_from_compressed_voluciera_block_5x");
        decompressBlock(consumer, ModBlocks.COMPRESSED_VOLUCIERA_BLOCK_6.get(), ModBlocks.COMPRESSED_VOLUCIERA_BLOCK_5.get(),
                ModItems.VOLUCIERA_INGOT.get(), "compressed_voluciera_blocks_5x_from_compressed_voluciera_block_6x");
        decompressBlock(consumer, ModBlocks.COMPRESSED_VOLUCIERA_BLOCK_7.get(), ModBlocks.COMPRESSED_VOLUCIERA_BLOCK_6.get(),
                ModItems.VOLUCIERA_INGOT.get(), "compressed_voluciera_blocks_6x_from_compressed_voluciera_block_7x");
        decompressBlock(consumer, ModBlocks.COMPRESSED_VOLUCIERA_BLOCK_8.get(), ModBlocks.COMPRESSED_VOLUCIERA_BLOCK_7.get(),
                ModItems.VOLUCIERA_INGOT.get(), "compressed_voluciera_blocks_7x_from_compressed_voluciera_block_8x");
        decompressBlock(consumer, ModBlocks.COMPRESSED_VOLUCIERA_BLOCK_9.get(), ModBlocks.COMPRESSED_VOLUCIERA_BLOCK_8.get(),
                ModItems.VOLUCIERA_INGOT.get(), "compressed_voluciera_blocks_8x_from_compressed_voluciera_block_9x");
        axeRecipe(consumer, ModItems.VOLUCIERA_AXE.get(), ModItems.VOLUCIERA_INGOT.get());
        hoeRecipe(consumer, ModItems.VOLUCIERA_HOE.get(), ModItems.VOLUCIERA_INGOT.get());
        pickaxeRecipe(consumer, ModItems.VOLUCIERA_PICKAXE.get(), ModItems.VOLUCIERA_INGOT.get());
        shovelRecipe(consumer, ModItems.VOLUCIERA_SHOVEL.get(), ModItems.VOLUCIERA_INGOT.get());
        swordRecipe(consumer, ModItems.VOLUCIERA_SWORD.get(), ModItems.VOLUCIERA_INGOT.get());
        helmetRecipe(consumer, ModItems.VOLUCIERA_HELMET.get(), ModItems.VOLUCIERA_INGOT.get());
        chestplateRecipe(consumer, ModItems.VOLUCIERA_CHESTPLATE.get(), ModItems.VOLUCIERA_INGOT.get());
        leggingsRecipe(consumer, ModItems.VOLUCIERA_LEGGINGS.get(), ModItems.VOLUCIERA_INGOT.get());
        bootsRecipe(consumer, ModItems.VOLUCIERA_BOOTS.get(), ModItems.VOLUCIERA_INGOT.get());

        ingotFromNuggetsPacking(consumer, ModItems.YGGS_INGOT.get(), ModItems.YGGS_NUGGET.get(), ModItems.YGGS_INGOT.get());
        nuggetsFromIngotUnpacking(consumer, ModItems.YGGS_NUGGET.get(), ModItems.YGGS_INGOT.get(), ModItems.YGGS_INGOT.get());
        blockFromIngotsPacking(consumer, ModBlocks.YGGS_BLOCK.get(), ModItems.YGGS_INGOT.get(), ModItems.YGGS_INGOT.get());
        ingotsFromBlockUnpacking(consumer, ModItems.YGGS_INGOT.get(), ModBlocks.YGGS_BLOCK.get(), ModItems.YGGS_INGOT.get());
        compressBlock(consumer, ModBlocks.YGGS_BLOCK.get(), ModBlocks.COMPRESSED_YGGS_BLOCK_1.get(),
                ModItems.YGGS_INGOT.get(), "compressed_yggs_block_1x_from_yggs_blocks");
        compressBlock(consumer, ModBlocks.COMPRESSED_YGGS_BLOCK_1.get(), ModBlocks.COMPRESSED_YGGS_BLOCK_2.get(),
                ModItems.YGGS_INGOT.get(), "compressed_yggs_block_2x_from_compressed_yggs_blocks_1x");
        compressBlock(consumer, ModBlocks.COMPRESSED_YGGS_BLOCK_2.get(), ModBlocks.COMPRESSED_YGGS_BLOCK_3.get(),
                ModItems.YGGS_INGOT.get(), "compressed_yggs_block_3x_from_compressed_yggs_blocks_2x");
        compressBlock(consumer, ModBlocks.COMPRESSED_YGGS_BLOCK_3.get(), ModBlocks.COMPRESSED_YGGS_BLOCK_4.get(),
                ModItems.YGGS_INGOT.get(), "compressed_yggs_block_4x_from_compressed_yggs_blocks_3x");
        compressBlock(consumer, ModBlocks.COMPRESSED_YGGS_BLOCK_4.get(), ModBlocks.COMPRESSED_YGGS_BLOCK_5.get(),
                ModItems.YGGS_INGOT.get(), "compressed_yggs_block_5x_from_compressed_yggs_blocks_4x");
        compressBlock(consumer, ModBlocks.COMPRESSED_YGGS_BLOCK_5.get(), ModBlocks.COMPRESSED_YGGS_BLOCK_6.get(),
                ModItems.YGGS_INGOT.get(), "compressed_yggs_block_6x_from_compressed_yggs_blocks_5x");
        compressBlock(consumer, ModBlocks.COMPRESSED_YGGS_BLOCK_6.get(), ModBlocks.COMPRESSED_YGGS_BLOCK_7.get(),
                ModItems.YGGS_INGOT.get(), "compressed_yggs_block_7x_from_compressed_yggs_blocks_6x");
        compressBlock(consumer, ModBlocks.COMPRESSED_YGGS_BLOCK_7.get(), ModBlocks.COMPRESSED_YGGS_BLOCK_8.get(),
                ModItems.YGGS_INGOT.get(), "compressed_yggs_block_8x_from_compressed_yggs_blocks_7x");
        compressBlock(consumer, ModBlocks.COMPRESSED_YGGS_BLOCK_8.get(), ModBlocks.COMPRESSED_YGGS_BLOCK_9.get(),
                ModItems.YGGS_INGOT.get(), "compressed_yggs_block_9x_from_compressed_yggs_blocks_8x");
        decompressBlock(consumer, ModBlocks.COMPRESSED_YGGS_BLOCK_1.get(), ModBlocks.YGGS_BLOCK.get(),
                ModItems.YGGS_INGOT.get(), "yggs_blocks_from_compressed_yggs_block_1x");
        decompressBlock(consumer, ModBlocks.COMPRESSED_YGGS_BLOCK_2.get(), ModBlocks.COMPRESSED_YGGS_BLOCK_1.get(),
                ModItems.YGGS_INGOT.get(), "compressed_yggs_blocks_1x_from_compressed_yggs_block_2x");
        decompressBlock(consumer, ModBlocks.COMPRESSED_YGGS_BLOCK_3.get(), ModBlocks.COMPRESSED_YGGS_BLOCK_2.get(),
                ModItems.YGGS_INGOT.get(), "compressed_yggs_blocks_2x_from_compressed_yggs_block_3x");
        decompressBlock(consumer, ModBlocks.COMPRESSED_YGGS_BLOCK_4.get(), ModBlocks.COMPRESSED_YGGS_BLOCK_3.get(),
                ModItems.YGGS_INGOT.get(), "compressed_yggs_blocks_3x_from_compressed_yggs_block_4x");
        decompressBlock(consumer, ModBlocks.COMPRESSED_YGGS_BLOCK_5.get(), ModBlocks.COMPRESSED_YGGS_BLOCK_4.get(),
                ModItems.YGGS_INGOT.get(), "compressed_yggs_blocks_4x_from_compressed_yggs_block_5x");
        decompressBlock(consumer, ModBlocks.COMPRESSED_YGGS_BLOCK_6.get(), ModBlocks.COMPRESSED_YGGS_BLOCK_5.get(),
                ModItems.YGGS_INGOT.get(), "compressed_yggs_blocks_5x_from_compressed_yggs_block_6x");
        decompressBlock(consumer, ModBlocks.COMPRESSED_YGGS_BLOCK_7.get(), ModBlocks.COMPRESSED_YGGS_BLOCK_6.get(),
                ModItems.YGGS_INGOT.get(), "compressed_yggs_blocks_6x_from_compressed_yggs_block_7x");
        decompressBlock(consumer, ModBlocks.COMPRESSED_YGGS_BLOCK_8.get(), ModBlocks.COMPRESSED_YGGS_BLOCK_7.get(),
                ModItems.YGGS_INGOT.get(), "compressed_yggs_blocks_7x_from_compressed_yggs_block_8x");
        decompressBlock(consumer, ModBlocks.COMPRESSED_YGGS_BLOCK_9.get(), ModBlocks.COMPRESSED_YGGS_BLOCK_8.get(),
                ModItems.YGGS_INGOT.get(), "compressed_yggs_blocks_8x_from_compressed_yggs_block_9x");
        axeRecipe(consumer, ModItems.YGGS_AXE.get(), ModItems.YGGS_INGOT.get());
        hoeRecipe(consumer, ModItems.YGGS_HOE.get(), ModItems.YGGS_INGOT.get());
        pickaxeRecipe(consumer, ModItems.YGGS_PICKAXE.get(), ModItems.YGGS_INGOT.get());
        shovelRecipe(consumer, ModItems.YGGS_SHOVEL.get(), ModItems.YGGS_INGOT.get());
        swordRecipe(consumer, ModItems.YGGS_SWORD.get(), ModItems.YGGS_INGOT.get());
        helmetRecipe(consumer, ModItems.YGGS_HELMET.get(), ModItems.YGGS_INGOT.get());
        chestplateRecipe(consumer, ModItems.YGGS_CHESTPLATE.get(), ModItems.YGGS_INGOT.get());
        leggingsRecipe(consumer, ModItems.YGGS_LEGGINGS.get(), ModItems.YGGS_INGOT.get());
        bootsRecipe(consumer, ModItems.YGGS_BOOTS.get(), ModItems.YGGS_INGOT.get());
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

    private void compressBlock(Consumer<FinishedRecipe> consumer, ItemLike blockItem, ItemLike compressedItem,
                ItemLike advancementItem, String recipeName) {
        ShapelessRecipeBuilder.shapeless(compressedItem, 1)
                .requires(blockItem, 9)
                .unlockedBy("has_" + getItemName(advancementItem),
                        inventoryTrigger(ItemPredicate.Builder.item().of(advancementItem).build()))
                .save(consumer, recipeName);
    }

    private void decompressBlock(Consumer<FinishedRecipe> consumer, ItemLike compressedItem, ItemLike blockItem,
                                 ItemLike advancementItem, String recipeName) {
        ShapelessRecipeBuilder.shapeless(blockItem, 9)
                .requires(compressedItem, 1)
                .unlockedBy("has_" + getItemName(advancementItem),
                        inventoryTrigger(ItemPredicate.Builder.item().of(advancementItem).build()))
                .save(consumer, recipeName);
    }

    private void pickaxeRecipe(Consumer<FinishedRecipe> consumer, ItemLike finishedPickaxe, ItemLike pickaxeMaterial) {
        ShapedRecipeBuilder.shaped(finishedPickaxe)
                .define('#', Items.STICK).define('X', pickaxeMaterial)
                .pattern("XXX").pattern(" # ").pattern(" # ")
                .unlockedBy("has_" + getItemName(pickaxeMaterial),
                        inventoryTrigger(ItemPredicate.Builder.item().of(pickaxeMaterial).build()))
                .save(consumer);
    }

    private void axeRecipe(Consumer<FinishedRecipe> consumer, ItemLike finishedAxe, ItemLike axeMaterial) {
        ShapedRecipeBuilder.shaped(finishedAxe)
                .define('#', Items.STICK).define('X', axeMaterial)
                .pattern("XX").pattern("X#").pattern(" #")
                .unlockedBy("has_" + getItemName(axeMaterial),
                        inventoryTrigger(ItemPredicate.Builder.item().of(axeMaterial).build()))
                .save(consumer);
    }

    private void hoeRecipe(Consumer<FinishedRecipe> consumer, ItemLike finishedHoe, ItemLike hoeMaterial) {
        ShapedRecipeBuilder.shaped(finishedHoe)
                .define('#', Items.STICK).define('X', hoeMaterial)
                .pattern("XX").pattern(" #").pattern(" #")
                .unlockedBy("has_" + getItemName(hoeMaterial),
                        inventoryTrigger(ItemPredicate.Builder.item().of(hoeMaterial).build()))
                .save(consumer);
    }

    private void shovelRecipe(Consumer<FinishedRecipe> consumer, ItemLike finishedShovel, ItemLike shovelMaterial) {
        ShapedRecipeBuilder.shaped(finishedShovel)
                .define('#', Items.STICK).define('X', shovelMaterial)
                .pattern("X").pattern("#").pattern("#")
                .unlockedBy("has_" + getItemName(shovelMaterial),
                        inventoryTrigger(ItemPredicate.Builder.item().of(shovelMaterial).build()))
                .save(consumer);
    }

    private void swordRecipe(Consumer<FinishedRecipe> consumer, ItemLike finishedSword, ItemLike swordMaterial) {
        ShapedRecipeBuilder.shaped(finishedSword)
                .define('#', Items.STICK).define('X', swordMaterial)
                .pattern("X").pattern("X").pattern("#")
                .unlockedBy("has_" + getItemName(swordMaterial),
                        inventoryTrigger(ItemPredicate.Builder.item().of(swordMaterial).build()))
                .save(consumer);
    }

    private void helmetRecipe(Consumer<FinishedRecipe> consumer, ItemLike finishedHelmet, ItemLike helmetMaterial) {
        ShapedRecipeBuilder.shaped(finishedHelmet)
                .define('X', helmetMaterial)
                .pattern("XXX").pattern("X X")
                .unlockedBy("has_" + getItemName(helmetMaterial),
                        inventoryTrigger(ItemPredicate.Builder.item().of(helmetMaterial).build()))
                .save(consumer);
    }

    private void chestplateRecipe(Consumer<FinishedRecipe> consumer, ItemLike finishedChestplate, ItemLike chestplateMaterial) {
        ShapedRecipeBuilder.shaped(finishedChestplate)
                .define('X', chestplateMaterial)
                .pattern("X X").pattern("XXX").pattern("XXX")
                .unlockedBy("has_" + getItemName(chestplateMaterial),
                        inventoryTrigger(ItemPredicate.Builder.item().of(chestplateMaterial).build()))
                .save(consumer);
    }

    private void leggingsRecipe(Consumer<FinishedRecipe> consumer, ItemLike finishedLeggings, ItemLike leggingsMaterial) {
        ShapedRecipeBuilder.shaped(finishedLeggings)
                .define('X', leggingsMaterial)
                .pattern("XXX").pattern("X X").pattern("X X")
                .unlockedBy("has_" + getItemName(leggingsMaterial),
                        inventoryTrigger(ItemPredicate.Builder.item().of(leggingsMaterial).build()))
                .save(consumer);
    }

    private void bootsRecipe(Consumer<FinishedRecipe> consumer, ItemLike finishedBoots, ItemLike bootsMaterial) {
        ShapedRecipeBuilder.shaped(finishedBoots)
                .define('X', bootsMaterial)
                .pattern("X X").pattern("X X")
                .unlockedBy("has_" + getItemName(bootsMaterial),
                        inventoryTrigger(ItemPredicate.Builder.item().of(bootsMaterial).build()))
                .save(consumer);
    }
}
