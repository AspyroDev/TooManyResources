package dev.aspyro.toomanyresources.datagen;

import dev.aspyro.toomanyresources.block.ModBlocks;
import dev.aspyro.toomanyresources.item.ModItems;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
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
}
