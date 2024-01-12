package dev.aspyro.toomanyresources.datagen;

import com.google.common.collect.ImmutableList;
import dev.aspyro.toomanyresources.TooManyResources;
import dev.aspyro.toomanyresources.block.ModBlocks;
import dev.aspyro.toomanyresources.item.ModItems;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.*;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(DataGenerator p_125973_) {
        super(p_125973_);
    }

    @Override
    protected void buildCraftingRecipes(Consumer<FinishedRecipe> consumer) {

        // BAMIRITE COOKING
        oreSmelting(consumer, ModItems.BAMIRITE_INGOT.get(), ModItems.RAW_BAMIRITE.get(), 0.7F, 200);
        oreSmelting(consumer, ModItems.BAMIRITE_NUGGET.get(), ModItems.RAW_BAMIRITE_PIECE.get(), 0.1F, 200);
        oreSmelting(consumer, ModItems.BAMIRITE_INGOT.get(), ModBlocks.BAMIRITE_ORE.get(), 0.7F, 200);
        oreSmelting(consumer, ModItems.BAMIRITE_INGOT.get(), ModBlocks.DEEPSLATE_BAMIRITE_ORE.get(), 0.7F, 200);
        oreSmelting(consumer, ModItems.BAMIRITE_INGOT.get(), ModBlocks.NETHERRACK_BAMIRITE_ORE.get(), 0.7F, 200);
        oreSmelting(consumer, ModItems.BAMIRITE_INGOT.get(), ModBlocks.ENDSTONE_BAMIRITE_ORE.get(), 0.7F, 200);
        // JSON // oreSmelting(consumer, 3, ModItems.BAMIRITE_NUGGET.get(), ModBlocks.POOR_BAMIRITE_ORE.get(), 0.4F, 200);
        // JSON // oreSmelting(consumer, 3, ModItems.BAMIRITE_NUGGET.get(), ModBlocks.POOR_DEEPSLATE_BAMIRITE_ORE.get(), 0.4F, 200);
        // JSON // oreSmelting(consumer, 3, ModItems.BAMIRITE_NUGGET.get(), ModBlocks.POOR_NETHERRACK_BAMIRITE_ORE.get(), 0.4F, 200);
        // JSON // oreSmelting(consumer, 3, ModItems.BAMIRITE_NUGGET.get(), ModBlocks.POOR_ENDSTONE_BAMIRITE_ORE.get(), 0.4F, 200);
        // JSON // oreSmelting(consumer, 3, ModItems.BAMIRITE_INGOT.get(), ModBlocks.RICH_BAMIRITE_ORE.get(), 1.1F, 200);
        // JSON // oreSmelting(consumer, 3, ModItems.BAMIRITE_INGOT.get(), ModBlocks.RICH_DEEPSLATE_BAMIRITE_ORE.get(), 1.1F, 200);
        // JSON // oreSmelting(consumer, 3, ModItems.BAMIRITE_INGOT.get(), ModBlocks.RICH_NETHERRACK_BAMIRITE_ORE.get(), 1.1F, 200);
        // JSON // oreSmelting(consumer, 3, ModItems.BAMIRITE_INGOT.get(), ModBlocks.RICH_ENDSTONE_BAMIRITE_ORE.get(), 1.1F, 200);

        // BAMIRITE RAW ORE ITEMS
        oneFromNinePacking(consumer, ModItems.RAW_BAMIRITE.get(), ModItems.RAW_BAMIRITE_PIECE.get(), ModItems.RAW_BAMIRITE.get());
        nineFromOneUnpacking(consumer, ModItems.RAW_BAMIRITE_PIECE.get(), ModItems.RAW_BAMIRITE.get(), ModItems.RAW_BAMIRITE.get());
        oneFromNinePacking(consumer, ModBlocks.RAW_BAMIRITE_BLOCK.get(), ModItems.RAW_BAMIRITE.get(), ModItems.RAW_BAMIRITE.get());
        nineFromOneUnpacking(consumer, ModItems.RAW_BAMIRITE.get(), ModBlocks.RAW_BAMIRITE_BLOCK.get(), ModItems.RAW_BAMIRITE.get());
        nineFromOneUnpacking(consumer, ModBlocks.RAW_BAMIRITE_BLOCK.get(), ModBlocks.COMPRESSED_RAW_BAMIRITE_BLOCK_1.get(), ModItems.RAW_BAMIRITE.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_RAW_BAMIRITE_BLOCK_1.get(), ModBlocks.COMPRESSED_RAW_BAMIRITE_BLOCK_2.get(), ModItems.RAW_BAMIRITE.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_RAW_BAMIRITE_BLOCK_2.get(), ModBlocks.COMPRESSED_RAW_BAMIRITE_BLOCK_3.get(), ModItems.RAW_BAMIRITE.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_RAW_BAMIRITE_BLOCK_3.get(), ModBlocks.COMPRESSED_RAW_BAMIRITE_BLOCK_4.get(), ModItems.RAW_BAMIRITE.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_RAW_BAMIRITE_BLOCK_4.get(), ModBlocks.COMPRESSED_RAW_BAMIRITE_BLOCK_5.get(), ModItems.RAW_BAMIRITE.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_RAW_BAMIRITE_BLOCK_5.get(), ModBlocks.COMPRESSED_RAW_BAMIRITE_BLOCK_6.get(), ModItems.RAW_BAMIRITE.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_RAW_BAMIRITE_BLOCK_6.get(), ModBlocks.COMPRESSED_RAW_BAMIRITE_BLOCK_7.get(), ModItems.RAW_BAMIRITE.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_RAW_BAMIRITE_BLOCK_7.get(), ModBlocks.COMPRESSED_RAW_BAMIRITE_BLOCK_8.get(), ModItems.RAW_BAMIRITE.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_RAW_BAMIRITE_BLOCK_8.get(), ModBlocks.COMPRESSED_RAW_BAMIRITE_BLOCK_9.get(), ModItems.RAW_BAMIRITE.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_RAW_BAMIRITE_BLOCK_1.get(), ModBlocks.RAW_BAMIRITE_BLOCK.get(), ModItems.RAW_BAMIRITE.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_RAW_BAMIRITE_BLOCK_2.get(), ModBlocks.COMPRESSED_RAW_BAMIRITE_BLOCK_1.get(), ModItems.RAW_BAMIRITE.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_RAW_BAMIRITE_BLOCK_3.get(), ModBlocks.COMPRESSED_RAW_BAMIRITE_BLOCK_2.get(), ModItems.RAW_BAMIRITE.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_RAW_BAMIRITE_BLOCK_4.get(), ModBlocks.COMPRESSED_RAW_BAMIRITE_BLOCK_3.get(), ModItems.RAW_BAMIRITE.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_RAW_BAMIRITE_BLOCK_5.get(), ModBlocks.COMPRESSED_RAW_BAMIRITE_BLOCK_4.get(), ModItems.RAW_BAMIRITE.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_RAW_BAMIRITE_BLOCK_6.get(), ModBlocks.COMPRESSED_RAW_BAMIRITE_BLOCK_5.get(), ModItems.RAW_BAMIRITE.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_RAW_BAMIRITE_BLOCK_7.get(), ModBlocks.COMPRESSED_RAW_BAMIRITE_BLOCK_6.get(), ModItems.RAW_BAMIRITE.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_RAW_BAMIRITE_BLOCK_8.get(), ModBlocks.COMPRESSED_RAW_BAMIRITE_BLOCK_7.get(), ModItems.RAW_BAMIRITE.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_RAW_BAMIRITE_BLOCK_9.get(), ModBlocks.COMPRESSED_RAW_BAMIRITE_BLOCK_8.get(), ModItems.RAW_BAMIRITE.get());

        // BAMIRITE ORE ITEMS
        oneFromNinePacking(consumer, ModItems.BAMIRITE_INGOT.get(), ModItems.BAMIRITE_NUGGET.get(), ModItems.BAMIRITE_INGOT.get());
        nineFromOneUnpacking(consumer, ModItems.BAMIRITE_NUGGET.get(), ModItems.BAMIRITE_INGOT.get(), ModItems.BAMIRITE_INGOT.get());
        oneFromNinePacking(consumer, ModBlocks.BAMIRITE_BLOCK.get(), ModItems.BAMIRITE_INGOT.get(), ModItems.BAMIRITE_INGOT.get());
        nineFromOneUnpacking(consumer, ModItems.BAMIRITE_INGOT.get(), ModBlocks.BAMIRITE_BLOCK.get(), ModItems.BAMIRITE_INGOT.get());
        nineFromOneUnpacking(consumer, ModBlocks.BAMIRITE_BLOCK.get(), ModBlocks.COMPRESSED_BAMIRITE_BLOCK_1.get(), ModItems.BAMIRITE_INGOT.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_BAMIRITE_BLOCK_1.get(), ModBlocks.COMPRESSED_BAMIRITE_BLOCK_2.get(), ModItems.BAMIRITE_INGOT.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_BAMIRITE_BLOCK_2.get(), ModBlocks.COMPRESSED_BAMIRITE_BLOCK_3.get(), ModItems.BAMIRITE_INGOT.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_BAMIRITE_BLOCK_3.get(), ModBlocks.COMPRESSED_BAMIRITE_BLOCK_4.get(), ModItems.BAMIRITE_INGOT.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_BAMIRITE_BLOCK_4.get(), ModBlocks.COMPRESSED_BAMIRITE_BLOCK_5.get(), ModItems.BAMIRITE_INGOT.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_BAMIRITE_BLOCK_5.get(), ModBlocks.COMPRESSED_BAMIRITE_BLOCK_6.get(), ModItems.BAMIRITE_INGOT.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_BAMIRITE_BLOCK_6.get(), ModBlocks.COMPRESSED_BAMIRITE_BLOCK_7.get(), ModItems.BAMIRITE_INGOT.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_BAMIRITE_BLOCK_7.get(), ModBlocks.COMPRESSED_BAMIRITE_BLOCK_8.get(), ModItems.BAMIRITE_INGOT.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_BAMIRITE_BLOCK_8.get(), ModBlocks.COMPRESSED_BAMIRITE_BLOCK_9.get(), ModItems.BAMIRITE_INGOT.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_BAMIRITE_BLOCK_1.get(), ModBlocks.BAMIRITE_BLOCK.get(), ModItems.BAMIRITE_INGOT.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_BAMIRITE_BLOCK_2.get(), ModBlocks.COMPRESSED_BAMIRITE_BLOCK_1.get(), ModItems.BAMIRITE_INGOT.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_BAMIRITE_BLOCK_3.get(), ModBlocks.COMPRESSED_BAMIRITE_BLOCK_2.get(), ModItems.BAMIRITE_INGOT.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_BAMIRITE_BLOCK_4.get(), ModBlocks.COMPRESSED_BAMIRITE_BLOCK_3.get(), ModItems.BAMIRITE_INGOT.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_BAMIRITE_BLOCK_5.get(), ModBlocks.COMPRESSED_BAMIRITE_BLOCK_4.get(), ModItems.BAMIRITE_INGOT.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_BAMIRITE_BLOCK_6.get(), ModBlocks.COMPRESSED_BAMIRITE_BLOCK_5.get(), ModItems.BAMIRITE_INGOT.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_BAMIRITE_BLOCK_7.get(), ModBlocks.COMPRESSED_BAMIRITE_BLOCK_6.get(), ModItems.BAMIRITE_INGOT.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_BAMIRITE_BLOCK_8.get(), ModBlocks.COMPRESSED_BAMIRITE_BLOCK_7.get(), ModItems.BAMIRITE_INGOT.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_BAMIRITE_BLOCK_9.get(), ModBlocks.COMPRESSED_BAMIRITE_BLOCK_8.get(), ModItems.BAMIRITE_INGOT.get());

        // BAMIRITE TOOLS
        toolRecipe(consumer, "Axe", ModItems.BAMIRITE_AXE.get(), ModItems.BAMIRITE_INGOT.get());
        toolRecipe(consumer, "Hoe", ModItems.BAMIRITE_HOE.get(), ModItems.BAMIRITE_INGOT.get());
        toolRecipe(consumer, "Pickaxe", ModItems.BAMIRITE_PICKAXE.get(), ModItems.BAMIRITE_INGOT.get());
        toolRecipe(consumer, "Shovel", ModItems.BAMIRITE_SHOVEL.get(), ModItems.BAMIRITE_INGOT.get());
        toolRecipe(consumer, "Sword", ModItems.BAMIRITE_SWORD.get(), ModItems.BAMIRITE_INGOT.get());
        toolRecipe(consumer, "Helmet", ModItems.BAMIRITE_HELMET.get(), ModItems.BAMIRITE_INGOT.get());
        toolRecipe(consumer, "Chestplate", ModItems.BAMIRITE_CHESTPLATE.get(), ModItems.BAMIRITE_INGOT.get());
        toolRecipe(consumer, "Leggings", ModItems.BAMIRITE_LEGGINGS.get(), ModItems.BAMIRITE_INGOT.get());
        toolRecipe(consumer, "Boots", ModItems.BAMIRITE_BOOTS.get(), ModItems.BAMIRITE_INGOT.get());

        // BLUE DRAGCITE COOKING
        oreSmelting(consumer, ModItems.BLUE_DRAGCITE_INGOT.get(), ModItems.RAW_BLUE_DRAGCITE.get(), 0.7F, 200);
        oreSmelting(consumer, ModItems.BLUE_DRAGCITE_NUGGET.get(), ModItems.RAW_BLUE_DRAGCITE_PIECE.get(), 0.1F, 200);
        oreSmelting(consumer, ModItems.BLUE_DRAGCITE_INGOT.get(), ModBlocks.BLUE_DRAGCITE_ORE.get(), 0.7F, 200);
        oreSmelting(consumer, ModItems.BLUE_DRAGCITE_INGOT.get(), ModBlocks.DEEPSLATE_BLUE_DRAGCITE_ORE.get(), 0.7F, 200);
        oreSmelting(consumer, ModItems.BLUE_DRAGCITE_INGOT.get(), ModBlocks.NETHERRACK_BLUE_DRAGCITE_ORE.get(), 0.7F, 200);
        oreSmelting(consumer, ModItems.BLUE_DRAGCITE_INGOT.get(), ModBlocks.ENDSTONE_BLUE_DRAGCITE_ORE.get(), 0.7F, 200);
        // JSON // oreSmelting(consumer, 3, ModItems.BLUE_DRAGCITE_NUGGET.get(), ModBlocks.POOR_BLUE_DRAGCITE_ORE.get(), 0.4F, 200);
        // JSON // oreSmelting(consumer, 3, ModItems.BLUE_DRAGCITE_NUGGET.get(), ModBlocks.POOR_DEEPSLATE_BLUE_DRAGCITE_ORE.get(), 0.4F, 200);
        // JSON // oreSmelting(consumer, 3, ModItems.BLUE_DRAGCITE_NUGGET.get(), ModBlocks.POOR_NETHERRACK_BLUE_DRAGCITE_ORE.get(), 0.4F, 200);
        // JSON // oreSmelting(consumer, 3, ModItems.BLUE_DRAGCITE_NUGGET.get(), ModBlocks.POOR_ENDSTONE_BLUE_DRAGCITE_ORE.get(), 0.4F, 200);
        // JSON // oreSmelting(consumer, 3, ModItems.BLUE_DRAGCITE_INGOT.get(), ModBlocks.RICH_BLUE_DRAGCITE_ORE.get(), 1.1F, 200);
        // JSON // oreSmelting(consumer, 3, ModItems.BLUE_DRAGCITE_INGOT.get(), ModBlocks.RICH_DEEPSLATE_BLUE_DRAGCITE_ORE.get(), 1.1F, 200);
        // JSON // oreSmelting(consumer, 3, ModItems.BLUE_DRAGCITE_INGOT.get(), ModBlocks.RICH_NETHERRACK_BLUE_DRAGCITE_ORE.get(), 1.1F, 200);
        // JSON // oreSmelting(consumer, 3, ModItems.BLUE_DRAGCITE_INGOT.get(), ModBlocks.RICH_ENDSTONE_BLUE_DRAGCITE_ORE.get(), 1.1F, 200);

        // BLUE DRAGCITE RAW ORE ITEMS
        oneFromNinePacking(consumer, ModItems.RAW_BLUE_DRAGCITE.get(), ModItems.RAW_BLUE_DRAGCITE_PIECE.get(), ModItems.RAW_BLUE_DRAGCITE.get());
        nineFromOneUnpacking(consumer, ModItems.RAW_BLUE_DRAGCITE_PIECE.get(), ModItems.RAW_BLUE_DRAGCITE.get(), ModItems.RAW_BLUE_DRAGCITE.get());
        oneFromNinePacking(consumer, ModBlocks.RAW_BLUE_DRAGCITE_BLOCK.get(), ModItems.RAW_BLUE_DRAGCITE.get(), ModItems.RAW_BLUE_DRAGCITE.get());
        nineFromOneUnpacking(consumer, ModItems.RAW_BLUE_DRAGCITE.get(), ModBlocks.RAW_BLUE_DRAGCITE_BLOCK.get(), ModItems.RAW_BLUE_DRAGCITE.get());
        nineFromOneUnpacking(consumer, ModBlocks.RAW_BLUE_DRAGCITE_BLOCK.get(), ModBlocks.COMPRESSED_RAW_BLUE_DRAGCITE_BLOCK_1.get(), ModItems.RAW_BLUE_DRAGCITE.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_RAW_BLUE_DRAGCITE_BLOCK_1.get(), ModBlocks.COMPRESSED_RAW_BLUE_DRAGCITE_BLOCK_2.get(), ModItems.RAW_BLUE_DRAGCITE.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_RAW_BLUE_DRAGCITE_BLOCK_2.get(), ModBlocks.COMPRESSED_RAW_BLUE_DRAGCITE_BLOCK_3.get(), ModItems.RAW_BLUE_DRAGCITE.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_RAW_BLUE_DRAGCITE_BLOCK_3.get(), ModBlocks.COMPRESSED_RAW_BLUE_DRAGCITE_BLOCK_4.get(), ModItems.RAW_BLUE_DRAGCITE.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_RAW_BLUE_DRAGCITE_BLOCK_4.get(), ModBlocks.COMPRESSED_RAW_BLUE_DRAGCITE_BLOCK_5.get(), ModItems.RAW_BLUE_DRAGCITE.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_RAW_BLUE_DRAGCITE_BLOCK_5.get(), ModBlocks.COMPRESSED_RAW_BLUE_DRAGCITE_BLOCK_6.get(), ModItems.RAW_BLUE_DRAGCITE.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_RAW_BLUE_DRAGCITE_BLOCK_6.get(), ModBlocks.COMPRESSED_RAW_BLUE_DRAGCITE_BLOCK_7.get(), ModItems.RAW_BLUE_DRAGCITE.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_RAW_BLUE_DRAGCITE_BLOCK_7.get(), ModBlocks.COMPRESSED_RAW_BLUE_DRAGCITE_BLOCK_8.get(), ModItems.RAW_BLUE_DRAGCITE.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_RAW_BLUE_DRAGCITE_BLOCK_8.get(), ModBlocks.COMPRESSED_RAW_BLUE_DRAGCITE_BLOCK_9.get(), ModItems.RAW_BLUE_DRAGCITE.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_RAW_BLUE_DRAGCITE_BLOCK_1.get(), ModBlocks.RAW_BLUE_DRAGCITE_BLOCK.get(), ModItems.RAW_BLUE_DRAGCITE.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_RAW_BLUE_DRAGCITE_BLOCK_2.get(), ModBlocks.COMPRESSED_RAW_BLUE_DRAGCITE_BLOCK_1.get(), ModItems.RAW_BLUE_DRAGCITE.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_RAW_BLUE_DRAGCITE_BLOCK_3.get(), ModBlocks.COMPRESSED_RAW_BLUE_DRAGCITE_BLOCK_2.get(), ModItems.RAW_BLUE_DRAGCITE.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_RAW_BLUE_DRAGCITE_BLOCK_4.get(), ModBlocks.COMPRESSED_RAW_BLUE_DRAGCITE_BLOCK_3.get(), ModItems.RAW_BLUE_DRAGCITE.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_RAW_BLUE_DRAGCITE_BLOCK_5.get(), ModBlocks.COMPRESSED_RAW_BLUE_DRAGCITE_BLOCK_4.get(), ModItems.RAW_BLUE_DRAGCITE.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_RAW_BLUE_DRAGCITE_BLOCK_6.get(), ModBlocks.COMPRESSED_RAW_BLUE_DRAGCITE_BLOCK_5.get(), ModItems.RAW_BLUE_DRAGCITE.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_RAW_BLUE_DRAGCITE_BLOCK_7.get(), ModBlocks.COMPRESSED_RAW_BLUE_DRAGCITE_BLOCK_6.get(), ModItems.RAW_BLUE_DRAGCITE.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_RAW_BLUE_DRAGCITE_BLOCK_8.get(), ModBlocks.COMPRESSED_RAW_BLUE_DRAGCITE_BLOCK_7.get(), ModItems.RAW_BLUE_DRAGCITE.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_RAW_BLUE_DRAGCITE_BLOCK_9.get(), ModBlocks.COMPRESSED_RAW_BLUE_DRAGCITE_BLOCK_8.get(), ModItems.RAW_BLUE_DRAGCITE.get());

        // BLUE DRAGCITE ORE ITEMS
        oneFromNinePacking(consumer, ModItems.BLUE_DRAGCITE_INGOT.get(), ModItems.BLUE_DRAGCITE_NUGGET.get(), ModItems.BLUE_DRAGCITE_INGOT.get());
        nineFromOneUnpacking(consumer, ModItems.BLUE_DRAGCITE_NUGGET.get(), ModItems.BLUE_DRAGCITE_INGOT.get(), ModItems.BLUE_DRAGCITE_INGOT.get());
        oneFromNinePacking(consumer, ModBlocks.BLUE_DRAGCITE_BLOCK.get(), ModItems.BLUE_DRAGCITE_INGOT.get(), ModItems.BLUE_DRAGCITE_INGOT.get());
        nineFromOneUnpacking(consumer, ModItems.BLUE_DRAGCITE_INGOT.get(), ModBlocks.BLUE_DRAGCITE_BLOCK.get(), ModItems.BLUE_DRAGCITE_INGOT.get());
        nineFromOneUnpacking(consumer, ModBlocks.BLUE_DRAGCITE_BLOCK.get(), ModBlocks.COMPRESSED_BLUE_DRAGCITE_BLOCK_1.get(), ModItems.BLUE_DRAGCITE_INGOT.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_BLUE_DRAGCITE_BLOCK_1.get(), ModBlocks.COMPRESSED_BLUE_DRAGCITE_BLOCK_2.get(), ModItems.BLUE_DRAGCITE_INGOT.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_BLUE_DRAGCITE_BLOCK_2.get(), ModBlocks.COMPRESSED_BLUE_DRAGCITE_BLOCK_3.get(), ModItems.BLUE_DRAGCITE_INGOT.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_BLUE_DRAGCITE_BLOCK_3.get(), ModBlocks.COMPRESSED_BLUE_DRAGCITE_BLOCK_4.get(), ModItems.BLUE_DRAGCITE_INGOT.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_BLUE_DRAGCITE_BLOCK_4.get(), ModBlocks.COMPRESSED_BLUE_DRAGCITE_BLOCK_5.get(), ModItems.BLUE_DRAGCITE_INGOT.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_BLUE_DRAGCITE_BLOCK_5.get(), ModBlocks.COMPRESSED_BLUE_DRAGCITE_BLOCK_6.get(), ModItems.BLUE_DRAGCITE_INGOT.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_BLUE_DRAGCITE_BLOCK_6.get(), ModBlocks.COMPRESSED_BLUE_DRAGCITE_BLOCK_7.get(), ModItems.BLUE_DRAGCITE_INGOT.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_BLUE_DRAGCITE_BLOCK_7.get(), ModBlocks.COMPRESSED_BLUE_DRAGCITE_BLOCK_8.get(), ModItems.BLUE_DRAGCITE_INGOT.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_BLUE_DRAGCITE_BLOCK_8.get(), ModBlocks.COMPRESSED_BLUE_DRAGCITE_BLOCK_9.get(), ModItems.BLUE_DRAGCITE_INGOT.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_BLUE_DRAGCITE_BLOCK_1.get(), ModBlocks.BLUE_DRAGCITE_BLOCK.get(), ModItems.BLUE_DRAGCITE_INGOT.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_BLUE_DRAGCITE_BLOCK_2.get(), ModBlocks.COMPRESSED_BLUE_DRAGCITE_BLOCK_1.get(), ModItems.BLUE_DRAGCITE_INGOT.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_BLUE_DRAGCITE_BLOCK_3.get(), ModBlocks.COMPRESSED_BLUE_DRAGCITE_BLOCK_2.get(), ModItems.BLUE_DRAGCITE_INGOT.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_BLUE_DRAGCITE_BLOCK_4.get(), ModBlocks.COMPRESSED_BLUE_DRAGCITE_BLOCK_3.get(), ModItems.BLUE_DRAGCITE_INGOT.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_BLUE_DRAGCITE_BLOCK_5.get(), ModBlocks.COMPRESSED_BLUE_DRAGCITE_BLOCK_4.get(), ModItems.BLUE_DRAGCITE_INGOT.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_BLUE_DRAGCITE_BLOCK_6.get(), ModBlocks.COMPRESSED_BLUE_DRAGCITE_BLOCK_5.get(), ModItems.BLUE_DRAGCITE_INGOT.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_BLUE_DRAGCITE_BLOCK_7.get(), ModBlocks.COMPRESSED_BLUE_DRAGCITE_BLOCK_6.get(), ModItems.BLUE_DRAGCITE_INGOT.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_BLUE_DRAGCITE_BLOCK_8.get(), ModBlocks.COMPRESSED_BLUE_DRAGCITE_BLOCK_7.get(), ModItems.BLUE_DRAGCITE_INGOT.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_BLUE_DRAGCITE_BLOCK_9.get(), ModBlocks.COMPRESSED_BLUE_DRAGCITE_BLOCK_8.get(), ModItems.BLUE_DRAGCITE_INGOT.get());
        toolRecipe(consumer, "Axe", ModItems.BLUE_DRAGCITE_AXE.get(), ModItems.BLUE_DRAGCITE_INGOT.get());
        toolRecipe(consumer, "Hoe", ModItems.BLUE_DRAGCITE_HOE.get(), ModItems.BLUE_DRAGCITE_INGOT.get());
        toolRecipe(consumer, "Pickaxe", ModItems.BLUE_DRAGCITE_PICKAXE.get(), ModItems.BLUE_DRAGCITE_INGOT.get());
        toolRecipe(consumer, "Shovel", ModItems.BLUE_DRAGCITE_SHOVEL.get(), ModItems.BLUE_DRAGCITE_INGOT.get());
        toolRecipe(consumer, "Sword", ModItems.BLUE_DRAGCITE_SWORD.get(), ModItems.BLUE_DRAGCITE_INGOT.get());
        toolRecipe(consumer, "Helmet", ModItems.BLUE_DRAGCITE_HELMET.get(), ModItems.BLUE_DRAGCITE_INGOT.get());
        toolRecipe(consumer, "Chestplate", ModItems.BLUE_DRAGCITE_CHESTPLATE.get(), ModItems.BLUE_DRAGCITE_INGOT.get());
        toolRecipe(consumer, "Leggings", ModItems.BLUE_DRAGCITE_LEGGINGS.get(), ModItems.BLUE_DRAGCITE_INGOT.get());
        toolRecipe(consumer, "Boots", ModItems.BLUE_DRAGCITE_BOOTS.get(), ModItems.BLUE_DRAGCITE_INGOT.get());

        // EISSELTE COOKING
        oreSmelting(consumer, ModItems.EISSELTE_INGOT.get(), ModItems.RAW_EISSELTE.get(), 0.7F, 200);
        oreSmelting(consumer, ModItems.EISSELTE_NUGGET.get(), ModItems.RAW_EISSELTE_PIECE.get(), 0.1F, 200);
        oreSmelting(consumer, ModItems.EISSELTE_INGOT.get(), ModBlocks.EISSELTE_ORE.get(), 0.7F, 200);
        oreSmelting(consumer, ModItems.EISSELTE_INGOT.get(), ModBlocks.DEEPSLATE_EISSELTE_ORE.get(), 0.7F, 200);
        oreSmelting(consumer, ModItems.EISSELTE_INGOT.get(), ModBlocks.NETHERRACK_EISSELTE_ORE.get(), 0.7F, 200);
        oreSmelting(consumer, ModItems.EISSELTE_INGOT.get(), ModBlocks.ENDSTONE_EISSELTE_ORE.get(), 0.7F, 200);
        // JSON // oreSmelting(consumer, 3, ModItems.EISSELTE_NUGGET.get(), ModBlocks.POOR_EISSELTE_ORE.get(), 0.4F, 200);
        // JSON // oreSmelting(consumer, 3, ModItems.EISSELTE_NUGGET.get(), ModBlocks.POOR_DEEPSLATE_EISSELTE_ORE.get(), 0.4F, 200);
        // JSON // oreSmelting(consumer, 3, ModItems.EISSELTE_NUGGET.get(), ModBlocks.POOR_NETHERRACK_EISSELTE_ORE.get(), 0.4F, 200);
        // JSON // oreSmelting(consumer, 3, ModItems.EISSELTE_NUGGET.get(), ModBlocks.POOR_ENDSTONE_EISSELTE_ORE.get(), 0.4F, 200);
        // JSON // oreSmelting(consumer, 3, ModItems.EISSELTE_INGOT.get(), ModBlocks.RICH_EISSELTE_ORE.get(), 1.1F, 200);
        // JSON // oreSmelting(consumer, 3, ModItems.EISSELTE_INGOT.get(), ModBlocks.RICH_DEEPSLATE_EISSELTE_ORE.get(), 1.1F, 200);
        // JSON // oreSmelting(consumer, 3, ModItems.EISSELTE_INGOT.get(), ModBlocks.RICH_NETHERRACK_EISSELTE_ORE.get(), 1.1F, 200);
        // JSON // oreSmelting(consumer, 3, ModItems.EISSELTE_INGOT.get(), ModBlocks.RICH_ENDSTONE_EISSELTE_ORE.get(), 1.1F, 200);

        // EISSELTE RAW ORE ITEMS
        oneFromNinePacking(consumer, ModItems.RAW_EISSELTE.get(), ModItems.RAW_EISSELTE_PIECE.get(), ModItems.RAW_EISSELTE.get());
        nineFromOneUnpacking(consumer, ModItems.RAW_EISSELTE_PIECE.get(), ModItems.RAW_EISSELTE.get(), ModItems.RAW_EISSELTE.get());
        oneFromNinePacking(consumer, ModBlocks.RAW_EISSELTE_BLOCK.get(), ModItems.RAW_EISSELTE.get(), ModItems.RAW_EISSELTE.get());
        nineFromOneUnpacking(consumer, ModItems.RAW_EISSELTE.get(), ModBlocks.RAW_EISSELTE_BLOCK.get(), ModItems.RAW_EISSELTE.get());
        nineFromOneUnpacking(consumer, ModBlocks.RAW_EISSELTE_BLOCK.get(), ModBlocks.COMPRESSED_RAW_EISSELTE_BLOCK_1.get(), ModItems.RAW_EISSELTE.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_RAW_EISSELTE_BLOCK_1.get(), ModBlocks.COMPRESSED_RAW_EISSELTE_BLOCK_2.get(), ModItems.RAW_EISSELTE.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_RAW_EISSELTE_BLOCK_2.get(), ModBlocks.COMPRESSED_RAW_EISSELTE_BLOCK_3.get(), ModItems.RAW_EISSELTE.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_RAW_EISSELTE_BLOCK_3.get(), ModBlocks.COMPRESSED_RAW_EISSELTE_BLOCK_4.get(), ModItems.RAW_EISSELTE.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_RAW_EISSELTE_BLOCK_4.get(), ModBlocks.COMPRESSED_RAW_EISSELTE_BLOCK_5.get(), ModItems.RAW_EISSELTE.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_RAW_EISSELTE_BLOCK_5.get(), ModBlocks.COMPRESSED_RAW_EISSELTE_BLOCK_6.get(), ModItems.RAW_EISSELTE.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_RAW_EISSELTE_BLOCK_6.get(), ModBlocks.COMPRESSED_RAW_EISSELTE_BLOCK_7.get(), ModItems.RAW_EISSELTE.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_RAW_EISSELTE_BLOCK_7.get(), ModBlocks.COMPRESSED_RAW_EISSELTE_BLOCK_8.get(), ModItems.RAW_EISSELTE.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_RAW_EISSELTE_BLOCK_8.get(), ModBlocks.COMPRESSED_RAW_EISSELTE_BLOCK_9.get(), ModItems.RAW_EISSELTE.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_RAW_EISSELTE_BLOCK_1.get(), ModBlocks.RAW_EISSELTE_BLOCK.get(), ModItems.RAW_EISSELTE.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_RAW_EISSELTE_BLOCK_2.get(), ModBlocks.COMPRESSED_RAW_EISSELTE_BLOCK_1.get(), ModItems.RAW_EISSELTE.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_RAW_EISSELTE_BLOCK_3.get(), ModBlocks.COMPRESSED_RAW_EISSELTE_BLOCK_2.get(), ModItems.RAW_EISSELTE.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_RAW_EISSELTE_BLOCK_4.get(), ModBlocks.COMPRESSED_RAW_EISSELTE_BLOCK_3.get(), ModItems.RAW_EISSELTE.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_RAW_EISSELTE_BLOCK_5.get(), ModBlocks.COMPRESSED_RAW_EISSELTE_BLOCK_4.get(), ModItems.RAW_EISSELTE.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_RAW_EISSELTE_BLOCK_6.get(), ModBlocks.COMPRESSED_RAW_EISSELTE_BLOCK_5.get(), ModItems.RAW_EISSELTE.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_RAW_EISSELTE_BLOCK_7.get(), ModBlocks.COMPRESSED_RAW_EISSELTE_BLOCK_6.get(), ModItems.RAW_EISSELTE.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_RAW_EISSELTE_BLOCK_8.get(), ModBlocks.COMPRESSED_RAW_EISSELTE_BLOCK_7.get(), ModItems.RAW_EISSELTE.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_RAW_EISSELTE_BLOCK_9.get(), ModBlocks.COMPRESSED_RAW_EISSELTE_BLOCK_8.get(), ModItems.RAW_EISSELTE.get());

        // EISSELTE ORE ITEMS
        oneFromNinePacking(consumer, ModItems.EISSELTE_INGOT.get(), ModItems.EISSELTE_NUGGET.get(), ModItems.EISSELTE_INGOT.get());
        nineFromOneUnpacking(consumer, ModItems.EISSELTE_NUGGET.get(), ModItems.EISSELTE_INGOT.get(), ModItems.EISSELTE_INGOT.get());
        oneFromNinePacking(consumer, ModBlocks.EISSELTE_BLOCK.get(), ModItems.EISSELTE_INGOT.get(), ModItems.EISSELTE_INGOT.get());
        nineFromOneUnpacking(consumer, ModItems.EISSELTE_INGOT.get(), ModBlocks.EISSELTE_BLOCK.get(), ModItems.EISSELTE_INGOT.get());
        nineFromOneUnpacking(consumer, ModBlocks.EISSELTE_BLOCK.get(), ModBlocks.COMPRESSED_EISSELTE_BLOCK_1.get(), ModItems.EISSELTE_INGOT.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_EISSELTE_BLOCK_1.get(), ModBlocks.COMPRESSED_EISSELTE_BLOCK_2.get(), ModItems.EISSELTE_INGOT.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_EISSELTE_BLOCK_2.get(), ModBlocks.COMPRESSED_EISSELTE_BLOCK_3.get(), ModItems.EISSELTE_INGOT.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_EISSELTE_BLOCK_3.get(), ModBlocks.COMPRESSED_EISSELTE_BLOCK_4.get(), ModItems.EISSELTE_INGOT.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_EISSELTE_BLOCK_4.get(), ModBlocks.COMPRESSED_EISSELTE_BLOCK_5.get(), ModItems.EISSELTE_INGOT.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_EISSELTE_BLOCK_5.get(), ModBlocks.COMPRESSED_EISSELTE_BLOCK_6.get(), ModItems.EISSELTE_INGOT.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_EISSELTE_BLOCK_6.get(), ModBlocks.COMPRESSED_EISSELTE_BLOCK_7.get(), ModItems.EISSELTE_INGOT.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_EISSELTE_BLOCK_7.get(), ModBlocks.COMPRESSED_EISSELTE_BLOCK_8.get(), ModItems.EISSELTE_INGOT.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_EISSELTE_BLOCK_8.get(), ModBlocks.COMPRESSED_EISSELTE_BLOCK_9.get(), ModItems.EISSELTE_INGOT.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_EISSELTE_BLOCK_1.get(), ModBlocks.EISSELTE_BLOCK.get(), ModItems.EISSELTE_INGOT.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_EISSELTE_BLOCK_2.get(), ModBlocks.COMPRESSED_EISSELTE_BLOCK_1.get(), ModItems.EISSELTE_INGOT.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_EISSELTE_BLOCK_3.get(), ModBlocks.COMPRESSED_EISSELTE_BLOCK_2.get(), ModItems.EISSELTE_INGOT.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_EISSELTE_BLOCK_4.get(), ModBlocks.COMPRESSED_EISSELTE_BLOCK_3.get(), ModItems.EISSELTE_INGOT.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_EISSELTE_BLOCK_5.get(), ModBlocks.COMPRESSED_EISSELTE_BLOCK_4.get(), ModItems.EISSELTE_INGOT.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_EISSELTE_BLOCK_6.get(), ModBlocks.COMPRESSED_EISSELTE_BLOCK_5.get(), ModItems.EISSELTE_INGOT.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_EISSELTE_BLOCK_7.get(), ModBlocks.COMPRESSED_EISSELTE_BLOCK_6.get(), ModItems.EISSELTE_INGOT.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_EISSELTE_BLOCK_8.get(), ModBlocks.COMPRESSED_EISSELTE_BLOCK_7.get(), ModItems.EISSELTE_INGOT.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_EISSELTE_BLOCK_9.get(), ModBlocks.COMPRESSED_EISSELTE_BLOCK_8.get(), ModItems.EISSELTE_INGOT.get());
        toolRecipe(consumer, "Axe", ModItems.EISSELTE_AXE.get(), ModItems.EISSELTE_INGOT.get());
        toolRecipe(consumer, "Hoe", ModItems.EISSELTE_HOE.get(), ModItems.EISSELTE_INGOT.get());
        toolRecipe(consumer, "Pickaxe", ModItems.EISSELTE_PICKAXE.get(), ModItems.EISSELTE_INGOT.get());
        toolRecipe(consumer, "Shovel", ModItems.EISSELTE_SHOVEL.get(), ModItems.EISSELTE_INGOT.get());
        toolRecipe(consumer, "Sword", ModItems.EISSELTE_SWORD.get(), ModItems.EISSELTE_INGOT.get());
        toolRecipe(consumer, "Helmet", ModItems.EISSELTE_HELMET.get(), ModItems.EISSELTE_INGOT.get());
        toolRecipe(consumer, "Chestplate", ModItems.EISSELTE_CHESTPLATE.get(), ModItems.EISSELTE_INGOT.get());
        toolRecipe(consumer, "Leggings", ModItems.EISSELTE_LEGGINGS.get(), ModItems.EISSELTE_INGOT.get());
        toolRecipe(consumer, "Boots", ModItems.EISSELTE_BOOTS.get(), ModItems.EISSELTE_INGOT.get());

        // HELMINIUM COOKING
        oreSmelting(consumer, ModItems.HELMINIUM_INGOT.get(), ModItems.RAW_HELMINIUM.get(), 0.7F, 200);
        oreSmelting(consumer, ModItems.HELMINIUM_NUGGET.get(), ModItems.RAW_HELMINIUM_PIECE.get(), 0.1F, 200);
        oreSmelting(consumer, ModItems.HELMINIUM_INGOT.get(), ModBlocks.HELMINIUM_ORE.get(), 0.7F, 200);
        oreSmelting(consumer, ModItems.HELMINIUM_INGOT.get(), ModBlocks.DEEPSLATE_HELMINIUM_ORE.get(), 0.7F, 200);
        oreSmelting(consumer, ModItems.HELMINIUM_INGOT.get(), ModBlocks.NETHERRACK_HELMINIUM_ORE.get(), 0.7F, 200);
        oreSmelting(consumer, ModItems.HELMINIUM_INGOT.get(), ModBlocks.ENDSTONE_HELMINIUM_ORE.get(), 0.7F, 200);
        // JSON // oreSmelting(consumer, 3, ModItems.HELMINIUM_NUGGET.get(), ModBlocks.POOR_HELMINIUM_ORE.get(), 0.4F, 200);
        // JSON // oreSmelting(consumer, 3, ModItems.HELMINIUM_NUGGET.get(), ModBlocks.POOR_DEEPSLATE_HELMINIUM_ORE.get(), 0.4F, 200);
        // JSON // oreSmelting(consumer, 3, ModItems.HELMINIUM_NUGGET.get(), ModBlocks.POOR_NETHERRACK_HELMINIUM_ORE.get(), 0.4F, 200);
        // JSON // oreSmelting(consumer, 3, ModItems.HELMINIUM_NUGGET.get(), ModBlocks.POOR_ENDSTONE_HELMINIUM_ORE.get(), 0.4F, 200);
        // JSON // oreSmelting(consumer, 3, ModItems.HELMINIUM_INGOT.get(), ModBlocks.RICH_HELMINIUM_ORE.get(), 1.1F, 200);
        // JSON // oreSmelting(consumer, 3, ModItems.HELMINIUM_INGOT.get(), ModBlocks.RICH_DEEPSLATE_HELMINIUM_ORE.get(), 1.1F, 200);
        // JSON // oreSmelting(consumer, 3, ModItems.HELMINIUM_INGOT.get(), ModBlocks.RICH_NETHERRACK_HELMINIUM_ORE.get(), 1.1F, 200);
        // JSON // oreSmelting(consumer, 3, ModItems.HELMINIUM_INGOT.get(), ModBlocks.RICH_ENDSTONE_HELMINIUM_ORE.get(), 1.1F, 200);

        // HELMINIUM RAW ORE ITEMS
        oneFromNinePacking(consumer, ModItems.RAW_HELMINIUM.get(), ModItems.RAW_HELMINIUM_PIECE.get(), ModItems.RAW_HELMINIUM.get());
        nineFromOneUnpacking(consumer, ModItems.RAW_HELMINIUM_PIECE.get(), ModItems.RAW_HELMINIUM.get(), ModItems.RAW_HELMINIUM.get());
        oneFromNinePacking(consumer, ModBlocks.RAW_HELMINIUM_BLOCK.get(), ModItems.RAW_HELMINIUM.get(), ModItems.RAW_HELMINIUM.get());
        nineFromOneUnpacking(consumer, ModItems.RAW_HELMINIUM.get(), ModBlocks.RAW_HELMINIUM_BLOCK.get(), ModItems.RAW_HELMINIUM.get());
        nineFromOneUnpacking(consumer, ModBlocks.RAW_HELMINIUM_BLOCK.get(), ModBlocks.COMPRESSED_RAW_HELMINIUM_BLOCK_1.get(), ModItems.RAW_HELMINIUM.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_RAW_HELMINIUM_BLOCK_1.get(), ModBlocks.COMPRESSED_RAW_HELMINIUM_BLOCK_2.get(), ModItems.RAW_HELMINIUM.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_RAW_HELMINIUM_BLOCK_2.get(), ModBlocks.COMPRESSED_RAW_HELMINIUM_BLOCK_3.get(), ModItems.RAW_HELMINIUM.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_RAW_HELMINIUM_BLOCK_3.get(), ModBlocks.COMPRESSED_RAW_HELMINIUM_BLOCK_4.get(), ModItems.RAW_HELMINIUM.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_RAW_HELMINIUM_BLOCK_4.get(), ModBlocks.COMPRESSED_RAW_HELMINIUM_BLOCK_5.get(), ModItems.RAW_HELMINIUM.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_RAW_HELMINIUM_BLOCK_5.get(), ModBlocks.COMPRESSED_RAW_HELMINIUM_BLOCK_6.get(), ModItems.RAW_HELMINIUM.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_RAW_HELMINIUM_BLOCK_6.get(), ModBlocks.COMPRESSED_RAW_HELMINIUM_BLOCK_7.get(), ModItems.RAW_HELMINIUM.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_RAW_HELMINIUM_BLOCK_7.get(), ModBlocks.COMPRESSED_RAW_HELMINIUM_BLOCK_8.get(), ModItems.RAW_HELMINIUM.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_RAW_HELMINIUM_BLOCK_8.get(), ModBlocks.COMPRESSED_RAW_HELMINIUM_BLOCK_9.get(), ModItems.RAW_HELMINIUM.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_RAW_HELMINIUM_BLOCK_1.get(), ModBlocks.RAW_HELMINIUM_BLOCK.get(), ModItems.RAW_HELMINIUM.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_RAW_HELMINIUM_BLOCK_2.get(), ModBlocks.COMPRESSED_RAW_HELMINIUM_BLOCK_1.get(), ModItems.RAW_HELMINIUM.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_RAW_HELMINIUM_BLOCK_3.get(), ModBlocks.COMPRESSED_RAW_HELMINIUM_BLOCK_2.get(), ModItems.RAW_HELMINIUM.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_RAW_HELMINIUM_BLOCK_4.get(), ModBlocks.COMPRESSED_RAW_HELMINIUM_BLOCK_3.get(), ModItems.RAW_HELMINIUM.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_RAW_HELMINIUM_BLOCK_5.get(), ModBlocks.COMPRESSED_RAW_HELMINIUM_BLOCK_4.get(), ModItems.RAW_HELMINIUM.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_RAW_HELMINIUM_BLOCK_6.get(), ModBlocks.COMPRESSED_RAW_HELMINIUM_BLOCK_5.get(), ModItems.RAW_HELMINIUM.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_RAW_HELMINIUM_BLOCK_7.get(), ModBlocks.COMPRESSED_RAW_HELMINIUM_BLOCK_6.get(), ModItems.RAW_HELMINIUM.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_RAW_HELMINIUM_BLOCK_8.get(), ModBlocks.COMPRESSED_RAW_HELMINIUM_BLOCK_7.get(), ModItems.RAW_HELMINIUM.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_RAW_HELMINIUM_BLOCK_9.get(), ModBlocks.COMPRESSED_RAW_HELMINIUM_BLOCK_8.get(), ModItems.RAW_HELMINIUM.get());

        // HELMINIUM ORE ITEMS
        oneFromNinePacking(consumer, ModItems.HELMINIUM_INGOT.get(), ModItems.HELMINIUM_NUGGET.get(), ModItems.HELMINIUM_INGOT.get());
        nineFromOneUnpacking(consumer, ModItems.HELMINIUM_NUGGET.get(), ModItems.HELMINIUM_INGOT.get(), ModItems.HELMINIUM_INGOT.get());
        oneFromNinePacking(consumer, ModBlocks.HELMINIUM_BLOCK.get(), ModItems.HELMINIUM_INGOT.get(), ModItems.HELMINIUM_INGOT.get());
        nineFromOneUnpacking(consumer, ModItems.HELMINIUM_INGOT.get(), ModBlocks.HELMINIUM_BLOCK.get(), ModItems.HELMINIUM_INGOT.get());
        nineFromOneUnpacking(consumer, ModBlocks.HELMINIUM_BLOCK.get(), ModBlocks.COMPRESSED_HELMINIUM_BLOCK_1.get(), ModItems.HELMINIUM_INGOT.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_HELMINIUM_BLOCK_1.get(), ModBlocks.COMPRESSED_HELMINIUM_BLOCK_2.get(), ModItems.HELMINIUM_INGOT.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_HELMINIUM_BLOCK_2.get(), ModBlocks.COMPRESSED_HELMINIUM_BLOCK_3.get(), ModItems.HELMINIUM_INGOT.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_HELMINIUM_BLOCK_3.get(), ModBlocks.COMPRESSED_HELMINIUM_BLOCK_4.get(), ModItems.HELMINIUM_INGOT.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_HELMINIUM_BLOCK_4.get(), ModBlocks.COMPRESSED_HELMINIUM_BLOCK_5.get(), ModItems.HELMINIUM_INGOT.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_HELMINIUM_BLOCK_5.get(), ModBlocks.COMPRESSED_HELMINIUM_BLOCK_6.get(), ModItems.HELMINIUM_INGOT.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_HELMINIUM_BLOCK_6.get(), ModBlocks.COMPRESSED_HELMINIUM_BLOCK_7.get(), ModItems.HELMINIUM_INGOT.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_HELMINIUM_BLOCK_7.get(), ModBlocks.COMPRESSED_HELMINIUM_BLOCK_8.get(), ModItems.HELMINIUM_INGOT.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_HELMINIUM_BLOCK_8.get(), ModBlocks.COMPRESSED_HELMINIUM_BLOCK_9.get(), ModItems.HELMINIUM_INGOT.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_HELMINIUM_BLOCK_1.get(), ModBlocks.HELMINIUM_BLOCK.get(), ModItems.HELMINIUM_INGOT.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_HELMINIUM_BLOCK_2.get(), ModBlocks.COMPRESSED_HELMINIUM_BLOCK_1.get(), ModItems.HELMINIUM_INGOT.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_HELMINIUM_BLOCK_3.get(), ModBlocks.COMPRESSED_HELMINIUM_BLOCK_2.get(), ModItems.HELMINIUM_INGOT.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_HELMINIUM_BLOCK_4.get(), ModBlocks.COMPRESSED_HELMINIUM_BLOCK_3.get(), ModItems.HELMINIUM_INGOT.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_HELMINIUM_BLOCK_5.get(), ModBlocks.COMPRESSED_HELMINIUM_BLOCK_4.get(), ModItems.HELMINIUM_INGOT.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_HELMINIUM_BLOCK_6.get(), ModBlocks.COMPRESSED_HELMINIUM_BLOCK_5.get(), ModItems.HELMINIUM_INGOT.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_HELMINIUM_BLOCK_7.get(), ModBlocks.COMPRESSED_HELMINIUM_BLOCK_6.get(), ModItems.HELMINIUM_INGOT.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_HELMINIUM_BLOCK_8.get(), ModBlocks.COMPRESSED_HELMINIUM_BLOCK_7.get(), ModItems.HELMINIUM_INGOT.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_HELMINIUM_BLOCK_9.get(), ModBlocks.COMPRESSED_HELMINIUM_BLOCK_8.get(), ModItems.HELMINIUM_INGOT.get());
        toolRecipe(consumer, "Axe", ModItems.HELMINIUM_AXE.get(), ModItems.HELMINIUM_INGOT.get());
        toolRecipe(consumer, "Hoe", ModItems.HELMINIUM_HOE.get(), ModItems.HELMINIUM_INGOT.get());
        toolRecipe(consumer, "Pickaxe", ModItems.HELMINIUM_PICKAXE.get(), ModItems.HELMINIUM_INGOT.get());
        toolRecipe(consumer, "Shovel", ModItems.HELMINIUM_SHOVEL.get(), ModItems.HELMINIUM_INGOT.get());
        toolRecipe(consumer, "Sword", ModItems.HELMINIUM_SWORD.get(), ModItems.HELMINIUM_INGOT.get());
        toolRecipe(consumer, "Helmet", ModItems.HELMINIUM_HELMET.get(), ModItems.HELMINIUM_INGOT.get());
        toolRecipe(consumer, "Chestplate", ModItems.HELMINIUM_CHESTPLATE.get(), ModItems.HELMINIUM_INGOT.get());
        toolRecipe(consumer, "Leggings", ModItems.HELMINIUM_LEGGINGS.get(), ModItems.HELMINIUM_INGOT.get());
        toolRecipe(consumer, "Boots", ModItems.HELMINIUM_BOOTS.get(), ModItems.HELMINIUM_INGOT.get());

        // JEPERCKSTONE COOKING
        oreSmelting(consumer, ModItems.JEPERCKSTONE_INGOT.get(), ModItems.RAW_JEPERCKSTONE.get(), 0.7F, 200);
        oreSmelting(consumer, ModItems.JEPERCKSTONE_NUGGET.get(), ModItems.RAW_JEPERCKSTONE_PIECE.get(), 0.1F, 200);
        oreSmelting(consumer, ModItems.JEPERCKSTONE_INGOT.get(), ModBlocks.JEPERCKSTONE_ORE.get(), 0.7F, 200);
        oreSmelting(consumer, ModItems.JEPERCKSTONE_INGOT.get(), ModBlocks.DEEPSLATE_JEPERCKSTONE_ORE.get(), 0.7F, 200);
        oreSmelting(consumer, ModItems.JEPERCKSTONE_INGOT.get(), ModBlocks.NETHERRACK_JEPERCKSTONE_ORE.get(), 0.7F, 200);
        oreSmelting(consumer, ModItems.JEPERCKSTONE_INGOT.get(), ModBlocks.ENDSTONE_JEPERCKSTONE_ORE.get(), 0.7F, 200);
        // JSON // oreSmelting(consumer, 3, ModItems.JEPERCKSTONE_NUGGET.get(), ModBlocks.POOR_JEPERCKSTONE_ORE.get(), 0.4F, 200);
        // JSON // oreSmelting(consumer, 3, ModItems.JEPERCKSTONE_NUGGET.get(), ModBlocks.POOR_DEEPSLATE_JEPERCKSTONE_ORE.get(), 0.4F, 200);
        // JSON // oreSmelting(consumer, 3, ModItems.JEPERCKSTONE_NUGGET.get(), ModBlocks.POOR_NETHERRACK_JEPERCKSTONE_ORE.get(), 0.4F, 200);
        // JSON // oreSmelting(consumer, 3, ModItems.JEPERCKSTONE_NUGGET.get(), ModBlocks.POOR_ENDSTONE_JEPERCKSTONE_ORE.get(), 0.4F, 200);
        // JSON // oreSmelting(consumer, 3, ModItems.JEPERCKSTONE_INGOT.get(), ModBlocks.RICH_JEPERCKSTONE_ORE.get(), 1.1F, 200);
        // JSON // oreSmelting(consumer, 3, ModItems.JEPERCKSTONE_INGOT.get(), ModBlocks.RICH_DEEPSLATE_JEPERCKSTONE_ORE.get(), 1.1F, 200);
        // JSON // oreSmelting(consumer, 3, ModItems.JEPERCKSTONE_INGOT.get(), ModBlocks.RICH_NETHERRACK_JEPERCKSTONE_ORE.get(), 1.1F, 200);
        // JSON // oreSmelting(consumer, 3, ModItems.JEPERCKSTONE_INGOT.get(), ModBlocks.RICH_ENDSTONE_JEPERCKSTONE_ORE.get(), 1.1F, 200);

        // JEPERCKSTONE RAW ORE ITEMS
        oneFromNinePacking(consumer, ModItems.RAW_JEPERCKSTONE.get(), ModItems.RAW_JEPERCKSTONE_PIECE.get(), ModItems.RAW_JEPERCKSTONE.get());
        nineFromOneUnpacking(consumer, ModItems.RAW_JEPERCKSTONE_PIECE.get(), ModItems.RAW_JEPERCKSTONE.get(), ModItems.RAW_JEPERCKSTONE.get());
        oneFromNinePacking(consumer, ModBlocks.RAW_JEPERCKSTONE_BLOCK.get(), ModItems.RAW_JEPERCKSTONE.get(), ModItems.RAW_JEPERCKSTONE.get());
        nineFromOneUnpacking(consumer, ModItems.RAW_JEPERCKSTONE.get(), ModBlocks.RAW_JEPERCKSTONE_BLOCK.get(), ModItems.RAW_JEPERCKSTONE.get());
        nineFromOneUnpacking(consumer, ModBlocks.RAW_JEPERCKSTONE_BLOCK.get(), ModBlocks.COMPRESSED_RAW_JEPERCKSTONE_BLOCK_1.get(), ModItems.RAW_JEPERCKSTONE.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_RAW_JEPERCKSTONE_BLOCK_1.get(), ModBlocks.COMPRESSED_RAW_JEPERCKSTONE_BLOCK_2.get(), ModItems.RAW_JEPERCKSTONE.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_RAW_JEPERCKSTONE_BLOCK_2.get(), ModBlocks.COMPRESSED_RAW_JEPERCKSTONE_BLOCK_3.get(), ModItems.RAW_JEPERCKSTONE.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_RAW_JEPERCKSTONE_BLOCK_3.get(), ModBlocks.COMPRESSED_RAW_JEPERCKSTONE_BLOCK_4.get(), ModItems.RAW_JEPERCKSTONE.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_RAW_JEPERCKSTONE_BLOCK_4.get(), ModBlocks.COMPRESSED_RAW_JEPERCKSTONE_BLOCK_5.get(), ModItems.RAW_JEPERCKSTONE.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_RAW_JEPERCKSTONE_BLOCK_5.get(), ModBlocks.COMPRESSED_RAW_JEPERCKSTONE_BLOCK_6.get(), ModItems.RAW_JEPERCKSTONE.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_RAW_JEPERCKSTONE_BLOCK_6.get(), ModBlocks.COMPRESSED_RAW_JEPERCKSTONE_BLOCK_7.get(), ModItems.RAW_JEPERCKSTONE.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_RAW_JEPERCKSTONE_BLOCK_7.get(), ModBlocks.COMPRESSED_RAW_JEPERCKSTONE_BLOCK_8.get(), ModItems.RAW_JEPERCKSTONE.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_RAW_JEPERCKSTONE_BLOCK_8.get(), ModBlocks.COMPRESSED_RAW_JEPERCKSTONE_BLOCK_9.get(), ModItems.RAW_JEPERCKSTONE.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_RAW_JEPERCKSTONE_BLOCK_1.get(), ModBlocks.RAW_JEPERCKSTONE_BLOCK.get(), ModItems.RAW_JEPERCKSTONE.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_RAW_JEPERCKSTONE_BLOCK_2.get(), ModBlocks.COMPRESSED_RAW_JEPERCKSTONE_BLOCK_1.get(), ModItems.RAW_JEPERCKSTONE.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_RAW_JEPERCKSTONE_BLOCK_3.get(), ModBlocks.COMPRESSED_RAW_JEPERCKSTONE_BLOCK_2.get(), ModItems.RAW_JEPERCKSTONE.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_RAW_JEPERCKSTONE_BLOCK_4.get(), ModBlocks.COMPRESSED_RAW_JEPERCKSTONE_BLOCK_3.get(), ModItems.RAW_JEPERCKSTONE.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_RAW_JEPERCKSTONE_BLOCK_5.get(), ModBlocks.COMPRESSED_RAW_JEPERCKSTONE_BLOCK_4.get(), ModItems.RAW_JEPERCKSTONE.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_RAW_JEPERCKSTONE_BLOCK_6.get(), ModBlocks.COMPRESSED_RAW_JEPERCKSTONE_BLOCK_5.get(), ModItems.RAW_JEPERCKSTONE.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_RAW_JEPERCKSTONE_BLOCK_7.get(), ModBlocks.COMPRESSED_RAW_JEPERCKSTONE_BLOCK_6.get(), ModItems.RAW_JEPERCKSTONE.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_RAW_JEPERCKSTONE_BLOCK_8.get(), ModBlocks.COMPRESSED_RAW_JEPERCKSTONE_BLOCK_7.get(), ModItems.RAW_JEPERCKSTONE.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_RAW_JEPERCKSTONE_BLOCK_9.get(), ModBlocks.COMPRESSED_RAW_JEPERCKSTONE_BLOCK_8.get(), ModItems.RAW_JEPERCKSTONE.get());

        // JEPERCKSTONE ORE ITEMS
        oneFromNinePacking(consumer, ModItems.JEPERCKSTONE_INGOT.get(), ModItems.JEPERCKSTONE_NUGGET.get(), ModItems.JEPERCKSTONE_INGOT.get());
        nineFromOneUnpacking(consumer, ModItems.JEPERCKSTONE_NUGGET.get(), ModItems.JEPERCKSTONE_INGOT.get(), ModItems.JEPERCKSTONE_INGOT.get());
        oneFromNinePacking(consumer, ModBlocks.JEPERCKSTONE_BLOCK.get(), ModItems.JEPERCKSTONE_INGOT.get(), ModItems.JEPERCKSTONE_INGOT.get());
        nineFromOneUnpacking(consumer, ModItems.JEPERCKSTONE_INGOT.get(), ModBlocks.JEPERCKSTONE_BLOCK.get(), ModItems.JEPERCKSTONE_INGOT.get());
        nineFromOneUnpacking(consumer, ModBlocks.JEPERCKSTONE_BLOCK.get(), ModBlocks.COMPRESSED_JEPERCKSTONE_BLOCK_1.get(), ModItems.JEPERCKSTONE_INGOT.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_JEPERCKSTONE_BLOCK_1.get(), ModBlocks.COMPRESSED_JEPERCKSTONE_BLOCK_2.get(), ModItems.JEPERCKSTONE_INGOT.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_JEPERCKSTONE_BLOCK_2.get(), ModBlocks.COMPRESSED_JEPERCKSTONE_BLOCK_3.get(), ModItems.JEPERCKSTONE_INGOT.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_JEPERCKSTONE_BLOCK_3.get(), ModBlocks.COMPRESSED_JEPERCKSTONE_BLOCK_4.get(), ModItems.JEPERCKSTONE_INGOT.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_JEPERCKSTONE_BLOCK_4.get(), ModBlocks.COMPRESSED_JEPERCKSTONE_BLOCK_5.get(), ModItems.JEPERCKSTONE_INGOT.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_JEPERCKSTONE_BLOCK_5.get(), ModBlocks.COMPRESSED_JEPERCKSTONE_BLOCK_6.get(), ModItems.JEPERCKSTONE_INGOT.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_JEPERCKSTONE_BLOCK_6.get(), ModBlocks.COMPRESSED_JEPERCKSTONE_BLOCK_7.get(), ModItems.JEPERCKSTONE_INGOT.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_JEPERCKSTONE_BLOCK_7.get(), ModBlocks.COMPRESSED_JEPERCKSTONE_BLOCK_8.get(), ModItems.JEPERCKSTONE_INGOT.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_JEPERCKSTONE_BLOCK_8.get(), ModBlocks.COMPRESSED_JEPERCKSTONE_BLOCK_9.get(), ModItems.JEPERCKSTONE_INGOT.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_JEPERCKSTONE_BLOCK_1.get(), ModBlocks.JEPERCKSTONE_BLOCK.get(), ModItems.JEPERCKSTONE_INGOT.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_JEPERCKSTONE_BLOCK_2.get(), ModBlocks.COMPRESSED_JEPERCKSTONE_BLOCK_1.get(), ModItems.JEPERCKSTONE_INGOT.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_JEPERCKSTONE_BLOCK_3.get(), ModBlocks.COMPRESSED_JEPERCKSTONE_BLOCK_2.get(), ModItems.JEPERCKSTONE_INGOT.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_JEPERCKSTONE_BLOCK_4.get(), ModBlocks.COMPRESSED_JEPERCKSTONE_BLOCK_3.get(), ModItems.JEPERCKSTONE_INGOT.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_JEPERCKSTONE_BLOCK_5.get(), ModBlocks.COMPRESSED_JEPERCKSTONE_BLOCK_4.get(), ModItems.JEPERCKSTONE_INGOT.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_JEPERCKSTONE_BLOCK_6.get(), ModBlocks.COMPRESSED_JEPERCKSTONE_BLOCK_5.get(), ModItems.JEPERCKSTONE_INGOT.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_JEPERCKSTONE_BLOCK_7.get(), ModBlocks.COMPRESSED_JEPERCKSTONE_BLOCK_6.get(), ModItems.JEPERCKSTONE_INGOT.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_JEPERCKSTONE_BLOCK_8.get(), ModBlocks.COMPRESSED_JEPERCKSTONE_BLOCK_7.get(), ModItems.JEPERCKSTONE_INGOT.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_JEPERCKSTONE_BLOCK_9.get(), ModBlocks.COMPRESSED_JEPERCKSTONE_BLOCK_8.get(), ModItems.JEPERCKSTONE_INGOT.get());
        toolRecipe(consumer, "Axe", ModItems.JEPERCKSTONE_AXE.get(), ModItems.JEPERCKSTONE_INGOT.get());
        toolRecipe(consumer, "Hoe", ModItems.JEPERCKSTONE_HOE.get(), ModItems.JEPERCKSTONE_INGOT.get());
        toolRecipe(consumer, "Pickaxe", ModItems.JEPERCKSTONE_PICKAXE.get(), ModItems.JEPERCKSTONE_INGOT.get());
        toolRecipe(consumer, "Shovel", ModItems.JEPERCKSTONE_SHOVEL.get(), ModItems.JEPERCKSTONE_INGOT.get());
        toolRecipe(consumer, "Sword", ModItems.JEPERCKSTONE_SWORD.get(), ModItems.JEPERCKSTONE_INGOT.get());
        toolRecipe(consumer, "Helmet", ModItems.JEPERCKSTONE_HELMET.get(), ModItems.JEPERCKSTONE_INGOT.get());
        toolRecipe(consumer, "Chestplate", ModItems.JEPERCKSTONE_CHESTPLATE.get(), ModItems.JEPERCKSTONE_INGOT.get());
        toolRecipe(consumer, "Leggings", ModItems.JEPERCKSTONE_LEGGINGS.get(), ModItems.JEPERCKSTONE_INGOT.get());
        toolRecipe(consumer, "Boots", ModItems.JEPERCKSTONE_BOOTS.get(), ModItems.JEPERCKSTONE_INGOT.get());

        // KHELSTONE COOKING
        oreSmelting(consumer, ModItems.KHELSTONE_INGOT.get(), ModItems.RAW_KHELSTONE.get(), 0.7F, 200);
        oreSmelting(consumer, ModItems.KHELSTONE_NUGGET.get(), ModItems.RAW_KHELSTONE_PIECE.get(), 0.1F, 200);
        oreSmelting(consumer, ModItems.KHELSTONE_INGOT.get(), ModBlocks.KHELSTONE_ORE.get(), 0.7F, 200);
        oreSmelting(consumer, ModItems.KHELSTONE_INGOT.get(), ModBlocks.DEEPSLATE_KHELSTONE_ORE.get(), 0.7F, 200);
        oreSmelting(consumer, ModItems.KHELSTONE_INGOT.get(), ModBlocks.NETHERRACK_KHELSTONE_ORE.get(), 0.7F, 200);
        oreSmelting(consumer, ModItems.KHELSTONE_INGOT.get(), ModBlocks.ENDSTONE_KHELSTONE_ORE.get(), 0.7F, 200);
        // JSON // oreSmelting(consumer, 3, ModItems.KHELSTONE_NUGGET.get(), ModBlocks.POOR_KHELSTONE_ORE.get(), 0.4F, 200);
        // JSON // oreSmelting(consumer, 3, ModItems.KHELSTONE_NUGGET.get(), ModBlocks.POOR_DEEPSLATE_KHELSTONE_ORE.get(), 0.4F, 200);
        // JSON // oreSmelting(consumer, 3, ModItems.KHELSTONE_NUGGET.get(), ModBlocks.POOR_NETHERRACK_KHELSTONE_ORE.get(), 0.4F, 200);
        // JSON // oreSmelting(consumer, 3, ModItems.KHELSTONE_NUGGET.get(), ModBlocks.POOR_ENDSTONE_KHELSTONE_ORE.get(), 0.4F, 200);
        // JSON // oreSmelting(consumer, 3, ModItems.KHELSTONE_INGOT.get(), ModBlocks.RICH_KHELSTONE_ORE.get(), 1.1F, 200);
        // JSON // oreSmelting(consumer, 3, ModItems.KHELSTONE_INGOT.get(), ModBlocks.RICH_DEEPSLATE_KHELSTONE_ORE.get(), 1.1F, 200);
        // JSON // oreSmelting(consumer, 3, ModItems.KHELSTONE_INGOT.get(), ModBlocks.RICH_NETHERRACK_KHELSTONE_ORE.get(), 1.1F, 200);
        // JSON // oreSmelting(consumer, 3, ModItems.KHELSTONE_INGOT.get(), ModBlocks.RICH_ENDSTONE_KHELSTONE_ORE.get(), 1.1F, 200);

        // KHELSTONE RAW ORE ITEMS
        oneFromNinePacking(consumer, ModItems.RAW_KHELSTONE.get(), ModItems.RAW_KHELSTONE_PIECE.get(), ModItems.RAW_KHELSTONE.get());
        nineFromOneUnpacking(consumer, ModItems.RAW_KHELSTONE_PIECE.get(), ModItems.RAW_KHELSTONE.get(), ModItems.RAW_KHELSTONE.get());
        oneFromNinePacking(consumer, ModBlocks.RAW_KHELSTONE_BLOCK.get(), ModItems.RAW_KHELSTONE.get(), ModItems.RAW_KHELSTONE.get());
        nineFromOneUnpacking(consumer, ModItems.RAW_KHELSTONE.get(), ModBlocks.RAW_KHELSTONE_BLOCK.get(), ModItems.RAW_KHELSTONE.get());
        nineFromOneUnpacking(consumer, ModBlocks.RAW_KHELSTONE_BLOCK.get(), ModBlocks.COMPRESSED_RAW_KHELSTONE_BLOCK_1.get(), ModItems.RAW_KHELSTONE.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_RAW_KHELSTONE_BLOCK_1.get(), ModBlocks.COMPRESSED_RAW_KHELSTONE_BLOCK_2.get(), ModItems.RAW_KHELSTONE.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_RAW_KHELSTONE_BLOCK_2.get(), ModBlocks.COMPRESSED_RAW_KHELSTONE_BLOCK_3.get(), ModItems.RAW_KHELSTONE.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_RAW_KHELSTONE_BLOCK_3.get(), ModBlocks.COMPRESSED_RAW_KHELSTONE_BLOCK_4.get(), ModItems.RAW_KHELSTONE.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_RAW_KHELSTONE_BLOCK_4.get(), ModBlocks.COMPRESSED_RAW_KHELSTONE_BLOCK_5.get(), ModItems.RAW_KHELSTONE.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_RAW_KHELSTONE_BLOCK_5.get(), ModBlocks.COMPRESSED_RAW_KHELSTONE_BLOCK_6.get(), ModItems.RAW_KHELSTONE.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_RAW_KHELSTONE_BLOCK_6.get(), ModBlocks.COMPRESSED_RAW_KHELSTONE_BLOCK_7.get(), ModItems.RAW_KHELSTONE.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_RAW_KHELSTONE_BLOCK_7.get(), ModBlocks.COMPRESSED_RAW_KHELSTONE_BLOCK_8.get(), ModItems.RAW_KHELSTONE.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_RAW_KHELSTONE_BLOCK_8.get(), ModBlocks.COMPRESSED_RAW_KHELSTONE_BLOCK_9.get(), ModItems.RAW_KHELSTONE.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_RAW_KHELSTONE_BLOCK_1.get(), ModBlocks.RAW_KHELSTONE_BLOCK.get(), ModItems.RAW_KHELSTONE.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_RAW_KHELSTONE_BLOCK_2.get(), ModBlocks.COMPRESSED_RAW_KHELSTONE_BLOCK_1.get(), ModItems.RAW_KHELSTONE.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_RAW_KHELSTONE_BLOCK_3.get(), ModBlocks.COMPRESSED_RAW_KHELSTONE_BLOCK_2.get(), ModItems.RAW_KHELSTONE.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_RAW_KHELSTONE_BLOCK_4.get(), ModBlocks.COMPRESSED_RAW_KHELSTONE_BLOCK_3.get(), ModItems.RAW_KHELSTONE.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_RAW_KHELSTONE_BLOCK_5.get(), ModBlocks.COMPRESSED_RAW_KHELSTONE_BLOCK_4.get(), ModItems.RAW_KHELSTONE.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_RAW_KHELSTONE_BLOCK_6.get(), ModBlocks.COMPRESSED_RAW_KHELSTONE_BLOCK_5.get(), ModItems.RAW_KHELSTONE.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_RAW_KHELSTONE_BLOCK_7.get(), ModBlocks.COMPRESSED_RAW_KHELSTONE_BLOCK_6.get(), ModItems.RAW_KHELSTONE.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_RAW_KHELSTONE_BLOCK_8.get(), ModBlocks.COMPRESSED_RAW_KHELSTONE_BLOCK_7.get(), ModItems.RAW_KHELSTONE.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_RAW_KHELSTONE_BLOCK_9.get(), ModBlocks.COMPRESSED_RAW_KHELSTONE_BLOCK_8.get(), ModItems.RAW_KHELSTONE.get());

        // KHELSTONE ORE ITEMS
        oneFromNinePacking(consumer, ModItems.KHELSTONE_INGOT.get(), ModItems.KHELSTONE_NUGGET.get(), ModItems.KHELSTONE_INGOT.get());
        nineFromOneUnpacking(consumer, ModItems.KHELSTONE_NUGGET.get(), ModItems.KHELSTONE_INGOT.get(), ModItems.KHELSTONE_INGOT.get());
        oneFromNinePacking(consumer, ModBlocks.KHELSTONE_BLOCK.get(), ModItems.KHELSTONE_INGOT.get(), ModItems.KHELSTONE_INGOT.get());
        nineFromOneUnpacking(consumer, ModItems.KHELSTONE_INGOT.get(), ModBlocks.KHELSTONE_BLOCK.get(), ModItems.KHELSTONE_INGOT.get());
        nineFromOneUnpacking(consumer, ModBlocks.KHELSTONE_BLOCK.get(), ModBlocks.COMPRESSED_KHELSTONE_BLOCK_1.get(), ModItems.KHELSTONE_INGOT.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_KHELSTONE_BLOCK_1.get(), ModBlocks.COMPRESSED_KHELSTONE_BLOCK_2.get(), ModItems.KHELSTONE_INGOT.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_KHELSTONE_BLOCK_2.get(), ModBlocks.COMPRESSED_KHELSTONE_BLOCK_3.get(), ModItems.KHELSTONE_INGOT.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_KHELSTONE_BLOCK_3.get(), ModBlocks.COMPRESSED_KHELSTONE_BLOCK_4.get(), ModItems.KHELSTONE_INGOT.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_KHELSTONE_BLOCK_4.get(), ModBlocks.COMPRESSED_KHELSTONE_BLOCK_5.get(), ModItems.KHELSTONE_INGOT.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_KHELSTONE_BLOCK_5.get(), ModBlocks.COMPRESSED_KHELSTONE_BLOCK_6.get(), ModItems.KHELSTONE_INGOT.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_KHELSTONE_BLOCK_6.get(), ModBlocks.COMPRESSED_KHELSTONE_BLOCK_7.get(), ModItems.KHELSTONE_INGOT.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_KHELSTONE_BLOCK_7.get(), ModBlocks.COMPRESSED_KHELSTONE_BLOCK_8.get(), ModItems.KHELSTONE_INGOT.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_KHELSTONE_BLOCK_8.get(), ModBlocks.COMPRESSED_KHELSTONE_BLOCK_9.get(), ModItems.KHELSTONE_INGOT.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_KHELSTONE_BLOCK_1.get(), ModBlocks.KHELSTONE_BLOCK.get(), ModItems.KHELSTONE_INGOT.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_KHELSTONE_BLOCK_2.get(), ModBlocks.COMPRESSED_KHELSTONE_BLOCK_1.get(), ModItems.KHELSTONE_INGOT.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_KHELSTONE_BLOCK_3.get(), ModBlocks.COMPRESSED_KHELSTONE_BLOCK_2.get(), ModItems.KHELSTONE_INGOT.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_KHELSTONE_BLOCK_4.get(), ModBlocks.COMPRESSED_KHELSTONE_BLOCK_3.get(), ModItems.KHELSTONE_INGOT.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_KHELSTONE_BLOCK_5.get(), ModBlocks.COMPRESSED_KHELSTONE_BLOCK_4.get(), ModItems.KHELSTONE_INGOT.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_KHELSTONE_BLOCK_6.get(), ModBlocks.COMPRESSED_KHELSTONE_BLOCK_5.get(), ModItems.KHELSTONE_INGOT.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_KHELSTONE_BLOCK_7.get(), ModBlocks.COMPRESSED_KHELSTONE_BLOCK_6.get(), ModItems.KHELSTONE_INGOT.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_KHELSTONE_BLOCK_8.get(), ModBlocks.COMPRESSED_KHELSTONE_BLOCK_7.get(), ModItems.KHELSTONE_INGOT.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_KHELSTONE_BLOCK_9.get(), ModBlocks.COMPRESSED_KHELSTONE_BLOCK_8.get(), ModItems.KHELSTONE_INGOT.get());
        toolRecipe(consumer, "Axe", ModItems.KHELSTONE_AXE.get(), ModItems.KHELSTONE_INGOT.get());
        toolRecipe(consumer, "Hoe", ModItems.KHELSTONE_HOE.get(), ModItems.KHELSTONE_INGOT.get());
        toolRecipe(consumer, "Pickaxe", ModItems.KHELSTONE_PICKAXE.get(), ModItems.KHELSTONE_INGOT.get());
        toolRecipe(consumer, "Shovel", ModItems.KHELSTONE_SHOVEL.get(), ModItems.KHELSTONE_INGOT.get());
        toolRecipe(consumer, "Sword", ModItems.KHELSTONE_SWORD.get(), ModItems.KHELSTONE_INGOT.get());
        toolRecipe(consumer, "Helmet", ModItems.KHELSTONE_HELMET.get(), ModItems.KHELSTONE_INGOT.get());
        toolRecipe(consumer, "Chestplate", ModItems.KHELSTONE_CHESTPLATE.get(), ModItems.KHELSTONE_INGOT.get());
        toolRecipe(consumer, "Leggings", ModItems.KHELSTONE_LEGGINGS.get(), ModItems.KHELSTONE_INGOT.get());
        toolRecipe(consumer, "Boots", ModItems.KHELSTONE_BOOTS.get(), ModItems.KHELSTONE_INGOT.get());

        // KIRIONITE COOKING
        oreSmelting(consumer, ModItems.KIRIONITE_INGOT.get(), ModItems.RAW_KIRIONITE.get(), 0.7F, 200);
        oreSmelting(consumer, ModItems.KIRIONITE_NUGGET.get(), ModItems.RAW_KIRIONITE_PIECE.get(), 0.1F, 200);
        oreSmelting(consumer, ModItems.KIRIONITE_INGOT.get(), ModBlocks.KIRIONITE_ORE.get(), 0.7F, 200);
        oreSmelting(consumer, ModItems.KIRIONITE_INGOT.get(), ModBlocks.DEEPSLATE_KIRIONITE_ORE.get(), 0.7F, 200);
        oreSmelting(consumer, ModItems.KIRIONITE_INGOT.get(), ModBlocks.NETHERRACK_KIRIONITE_ORE.get(), 0.7F, 200);
        oreSmelting(consumer, ModItems.KIRIONITE_INGOT.get(), ModBlocks.ENDSTONE_KIRIONITE_ORE.get(), 0.7F, 200);
        // JSON // oreSmelting(consumer, 3, ModItems.KIRIONITE_NUGGET.get(), ModBlocks.POOR_KIRIONITE_ORE.get(), 0.4F, 200);
        // JSON // oreSmelting(consumer, 3, ModItems.KIRIONITE_NUGGET.get(), ModBlocks.POOR_DEEPSLATE_KIRIONITE_ORE.get(), 0.4F, 200);
        // JSON // oreSmelting(consumer, 3, ModItems.KIRIONITE_NUGGET.get(), ModBlocks.POOR_NETHERRACK_KIRIONITE_ORE.get(), 0.4F, 200);
        // JSON // oreSmelting(consumer, 3, ModItems.KIRIONITE_NUGGET.get(), ModBlocks.POOR_ENDSTONE_KIRIONITE_ORE.get(), 0.4F, 200);
        // JSON // oreSmelting(consumer, 3, ModItems.KIRIONITE_INGOT.get(), ModBlocks.RICH_KIRIONITE_ORE.get(), 1.1F, 200);
        // JSON // oreSmelting(consumer, 3, ModItems.KIRIONITE_INGOT.get(), ModBlocks.RICH_DEEPSLATE_KIRIONITE_ORE.get(), 1.1F, 200);
        // JSON // oreSmelting(consumer, 3, ModItems.KIRIONITE_INGOT.get(), ModBlocks.RICH_NETHERRACK_KIRIONITE_ORE.get(), 1.1F, 200);
        // JSON // oreSmelting(consumer, 3, ModItems.KIRIONITE_INGOT.get(), ModBlocks.RICH_ENDSTONE_KIRIONITE_ORE.get(), 1.1F, 200);

        // KIRIONITE RAW ORE ITEMS
        oneFromNinePacking(consumer, ModItems.RAW_KIRIONITE.get(), ModItems.RAW_KIRIONITE_PIECE.get(), ModItems.RAW_KIRIONITE.get());
        nineFromOneUnpacking(consumer, ModItems.RAW_KIRIONITE_PIECE.get(), ModItems.RAW_KIRIONITE.get(), ModItems.RAW_KIRIONITE.get());
        oneFromNinePacking(consumer, ModBlocks.RAW_KIRIONITE_BLOCK.get(), ModItems.RAW_KIRIONITE.get(), ModItems.RAW_KIRIONITE.get());
        nineFromOneUnpacking(consumer, ModItems.RAW_KIRIONITE.get(), ModBlocks.RAW_KIRIONITE_BLOCK.get(), ModItems.RAW_KIRIONITE.get());
        nineFromOneUnpacking(consumer, ModBlocks.RAW_KIRIONITE_BLOCK.get(), ModBlocks.COMPRESSED_RAW_KIRIONITE_BLOCK_1.get(), ModItems.RAW_KIRIONITE.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_RAW_KIRIONITE_BLOCK_1.get(), ModBlocks.COMPRESSED_RAW_KIRIONITE_BLOCK_2.get(), ModItems.RAW_KIRIONITE.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_RAW_KIRIONITE_BLOCK_2.get(), ModBlocks.COMPRESSED_RAW_KIRIONITE_BLOCK_3.get(), ModItems.RAW_KIRIONITE.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_RAW_KIRIONITE_BLOCK_3.get(), ModBlocks.COMPRESSED_RAW_KIRIONITE_BLOCK_4.get(), ModItems.RAW_KIRIONITE.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_RAW_KIRIONITE_BLOCK_4.get(), ModBlocks.COMPRESSED_RAW_KIRIONITE_BLOCK_5.get(), ModItems.RAW_KIRIONITE.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_RAW_KIRIONITE_BLOCK_5.get(), ModBlocks.COMPRESSED_RAW_KIRIONITE_BLOCK_6.get(), ModItems.RAW_KIRIONITE.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_RAW_KIRIONITE_BLOCK_6.get(), ModBlocks.COMPRESSED_RAW_KIRIONITE_BLOCK_7.get(), ModItems.RAW_KIRIONITE.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_RAW_KIRIONITE_BLOCK_7.get(), ModBlocks.COMPRESSED_RAW_KIRIONITE_BLOCK_8.get(), ModItems.RAW_KIRIONITE.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_RAW_KIRIONITE_BLOCK_8.get(), ModBlocks.COMPRESSED_RAW_KIRIONITE_BLOCK_9.get(), ModItems.RAW_KIRIONITE.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_RAW_KIRIONITE_BLOCK_1.get(), ModBlocks.RAW_KIRIONITE_BLOCK.get(), ModItems.RAW_KIRIONITE.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_RAW_KIRIONITE_BLOCK_2.get(), ModBlocks.COMPRESSED_RAW_KIRIONITE_BLOCK_1.get(), ModItems.RAW_KIRIONITE.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_RAW_KIRIONITE_BLOCK_3.get(), ModBlocks.COMPRESSED_RAW_KIRIONITE_BLOCK_2.get(), ModItems.RAW_KIRIONITE.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_RAW_KIRIONITE_BLOCK_4.get(), ModBlocks.COMPRESSED_RAW_KIRIONITE_BLOCK_3.get(), ModItems.RAW_KIRIONITE.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_RAW_KIRIONITE_BLOCK_5.get(), ModBlocks.COMPRESSED_RAW_KIRIONITE_BLOCK_4.get(), ModItems.RAW_KIRIONITE.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_RAW_KIRIONITE_BLOCK_6.get(), ModBlocks.COMPRESSED_RAW_KIRIONITE_BLOCK_5.get(), ModItems.RAW_KIRIONITE.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_RAW_KIRIONITE_BLOCK_7.get(), ModBlocks.COMPRESSED_RAW_KIRIONITE_BLOCK_6.get(), ModItems.RAW_KIRIONITE.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_RAW_KIRIONITE_BLOCK_8.get(), ModBlocks.COMPRESSED_RAW_KIRIONITE_BLOCK_7.get(), ModItems.RAW_KIRIONITE.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_RAW_KIRIONITE_BLOCK_9.get(), ModBlocks.COMPRESSED_RAW_KIRIONITE_BLOCK_8.get(), ModItems.RAW_KIRIONITE.get());

        // KIRIONITE ORE ITEMS
        oneFromNinePacking(consumer, ModItems.KIRIONITE_INGOT.get(), ModItems.KIRIONITE_NUGGET.get(), ModItems.KIRIONITE_INGOT.get());
        nineFromOneUnpacking(consumer, ModItems.KIRIONITE_NUGGET.get(), ModItems.KIRIONITE_INGOT.get(), ModItems.KIRIONITE_INGOT.get());
        oneFromNinePacking(consumer, ModBlocks.KIRIONITE_BLOCK.get(), ModItems.KIRIONITE_INGOT.get(), ModItems.KIRIONITE_INGOT.get());
        nineFromOneUnpacking(consumer, ModItems.KIRIONITE_INGOT.get(), ModBlocks.KIRIONITE_BLOCK.get(), ModItems.KIRIONITE_INGOT.get());
        nineFromOneUnpacking(consumer, ModBlocks.KIRIONITE_BLOCK.get(), ModBlocks.COMPRESSED_KIRIONITE_BLOCK_1.get(), ModItems.KIRIONITE_INGOT.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_KIRIONITE_BLOCK_1.get(), ModBlocks.COMPRESSED_KIRIONITE_BLOCK_2.get(), ModItems.KIRIONITE_INGOT.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_KIRIONITE_BLOCK_2.get(), ModBlocks.COMPRESSED_KIRIONITE_BLOCK_3.get(), ModItems.KIRIONITE_INGOT.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_KIRIONITE_BLOCK_3.get(), ModBlocks.COMPRESSED_KIRIONITE_BLOCK_4.get(), ModItems.KIRIONITE_INGOT.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_KIRIONITE_BLOCK_4.get(), ModBlocks.COMPRESSED_KIRIONITE_BLOCK_5.get(), ModItems.KIRIONITE_INGOT.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_KIRIONITE_BLOCK_5.get(), ModBlocks.COMPRESSED_KIRIONITE_BLOCK_6.get(), ModItems.KIRIONITE_INGOT.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_KIRIONITE_BLOCK_6.get(), ModBlocks.COMPRESSED_KIRIONITE_BLOCK_7.get(), ModItems.KIRIONITE_INGOT.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_KIRIONITE_BLOCK_7.get(), ModBlocks.COMPRESSED_KIRIONITE_BLOCK_8.get(), ModItems.KIRIONITE_INGOT.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_KIRIONITE_BLOCK_8.get(), ModBlocks.COMPRESSED_KIRIONITE_BLOCK_9.get(), ModItems.KIRIONITE_INGOT.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_KIRIONITE_BLOCK_1.get(), ModBlocks.KIRIONITE_BLOCK.get(), ModItems.KIRIONITE_INGOT.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_KIRIONITE_BLOCK_2.get(), ModBlocks.COMPRESSED_KIRIONITE_BLOCK_1.get(), ModItems.KIRIONITE_INGOT.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_KIRIONITE_BLOCK_3.get(), ModBlocks.COMPRESSED_KIRIONITE_BLOCK_2.get(), ModItems.KIRIONITE_INGOT.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_KIRIONITE_BLOCK_4.get(), ModBlocks.COMPRESSED_KIRIONITE_BLOCK_3.get(), ModItems.KIRIONITE_INGOT.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_KIRIONITE_BLOCK_5.get(), ModBlocks.COMPRESSED_KIRIONITE_BLOCK_4.get(), ModItems.KIRIONITE_INGOT.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_KIRIONITE_BLOCK_6.get(), ModBlocks.COMPRESSED_KIRIONITE_BLOCK_5.get(), ModItems.KIRIONITE_INGOT.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_KIRIONITE_BLOCK_7.get(), ModBlocks.COMPRESSED_KIRIONITE_BLOCK_6.get(), ModItems.KIRIONITE_INGOT.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_KIRIONITE_BLOCK_8.get(), ModBlocks.COMPRESSED_KIRIONITE_BLOCK_7.get(), ModItems.KIRIONITE_INGOT.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_KIRIONITE_BLOCK_9.get(), ModBlocks.COMPRESSED_KIRIONITE_BLOCK_8.get(), ModItems.KIRIONITE_INGOT.get());
        toolRecipe(consumer, "Axe", ModItems.KIRIONITE_AXE.get(), ModItems.KIRIONITE_INGOT.get());
        toolRecipe(consumer, "Hoe", ModItems.KIRIONITE_HOE.get(), ModItems.KIRIONITE_INGOT.get());
        toolRecipe(consumer, "Pickaxe", ModItems.KIRIONITE_PICKAXE.get(), ModItems.KIRIONITE_INGOT.get());
        toolRecipe(consumer, "Shovel", ModItems.KIRIONITE_SHOVEL.get(), ModItems.KIRIONITE_INGOT.get());
        toolRecipe(consumer, "Sword", ModItems.KIRIONITE_SWORD.get(), ModItems.KIRIONITE_INGOT.get());
        toolRecipe(consumer, "Helmet", ModItems.KIRIONITE_HELMET.get(), ModItems.KIRIONITE_INGOT.get());
        toolRecipe(consumer, "Chestplate", ModItems.KIRIONITE_CHESTPLATE.get(), ModItems.KIRIONITE_INGOT.get());
        toolRecipe(consumer, "Leggings", ModItems.KIRIONITE_LEGGINGS.get(), ModItems.KIRIONITE_INGOT.get());
        toolRecipe(consumer, "Boots", ModItems.KIRIONITE_BOOTS.get(), ModItems.KIRIONITE_INGOT.get());

        // MANXIUM COOKING
        oreSmelting(consumer, ModItems.MANXIUM_INGOT.get(), ModItems.RAW_MANXIUM.get(), 0.7F, 200);
        oreSmelting(consumer, ModItems.MANXIUM_NUGGET.get(), ModItems.RAW_MANXIUM_PIECE.get(), 0.1F, 200);
        oreSmelting(consumer, ModItems.MANXIUM_INGOT.get(), ModBlocks.MANXIUM_ORE.get(), 0.7F, 200);
        oreSmelting(consumer, ModItems.MANXIUM_INGOT.get(), ModBlocks.DEEPSLATE_MANXIUM_ORE.get(), 0.7F, 200);
        oreSmelting(consumer, ModItems.MANXIUM_INGOT.get(), ModBlocks.NETHERRACK_MANXIUM_ORE.get(), 0.7F, 200);
        oreSmelting(consumer, ModItems.MANXIUM_INGOT.get(), ModBlocks.ENDSTONE_MANXIUM_ORE.get(), 0.7F, 200);
        // JSON // oreSmelting(consumer, 3, ModItems.MANXIUM_NUGGET.get(), ModBlocks.POOR_MANXIUM_ORE.get(), 0.4F, 200);
        // JSON // oreSmelting(consumer, 3, ModItems.MANXIUM_NUGGET.get(), ModBlocks.POOR_DEEPSLATE_MANXIUM_ORE.get(), 0.4F, 200);
        // JSON // oreSmelting(consumer, 3, ModItems.MANXIUM_NUGGET.get(), ModBlocks.POOR_NETHERRACK_MANXIUM_ORE.get(), 0.4F, 200);
        // JSON // oreSmelting(consumer, 3, ModItems.MANXIUM_NUGGET.get(), ModBlocks.POOR_ENDSTONE_MANXIUM_ORE.get(), 0.4F, 200);
        // JSON // oreSmelting(consumer, 3, ModItems.MANXIUM_INGOT.get(), ModBlocks.RICH_MANXIUM_ORE.get(), 1.1F, 200);
        // JSON // oreSmelting(consumer, 3, ModItems.MANXIUM_INGOT.get(), ModBlocks.RICH_DEEPSLATE_MANXIUM_ORE.get(), 1.1F, 200);
        // JSON // oreSmelting(consumer, 3, ModItems.MANXIUM_INGOT.get(), ModBlocks.RICH_NETHERRACK_MANXIUM_ORE.get(), 1.1F, 200);
        // JSON // oreSmelting(consumer, 3, ModItems.MANXIUM_INGOT.get(), ModBlocks.RICH_ENDSTONE_MANXIUM_ORE.get(), 1.1F, 200);

        // MANXIUM RAW ORE ITEMS
        oneFromNinePacking(consumer, ModItems.RAW_MANXIUM.get(), ModItems.RAW_MANXIUM_PIECE.get(), ModItems.RAW_MANXIUM.get());
        nineFromOneUnpacking(consumer, ModItems.RAW_MANXIUM_PIECE.get(), ModItems.RAW_MANXIUM.get(), ModItems.RAW_MANXIUM.get());
        oneFromNinePacking(consumer, ModBlocks.RAW_MANXIUM_BLOCK.get(), ModItems.RAW_MANXIUM.get(), ModItems.RAW_MANXIUM.get());
        nineFromOneUnpacking(consumer, ModItems.RAW_MANXIUM.get(), ModBlocks.RAW_MANXIUM_BLOCK.get(), ModItems.RAW_MANXIUM.get());
        nineFromOneUnpacking(consumer, ModBlocks.RAW_MANXIUM_BLOCK.get(), ModBlocks.COMPRESSED_RAW_MANXIUM_BLOCK_1.get(), ModItems.RAW_MANXIUM.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_RAW_MANXIUM_BLOCK_1.get(), ModBlocks.COMPRESSED_RAW_MANXIUM_BLOCK_2.get(), ModItems.RAW_MANXIUM.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_RAW_MANXIUM_BLOCK_2.get(), ModBlocks.COMPRESSED_RAW_MANXIUM_BLOCK_3.get(), ModItems.RAW_MANXIUM.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_RAW_MANXIUM_BLOCK_3.get(), ModBlocks.COMPRESSED_RAW_MANXIUM_BLOCK_4.get(), ModItems.RAW_MANXIUM.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_RAW_MANXIUM_BLOCK_4.get(), ModBlocks.COMPRESSED_RAW_MANXIUM_BLOCK_5.get(), ModItems.RAW_MANXIUM.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_RAW_MANXIUM_BLOCK_5.get(), ModBlocks.COMPRESSED_RAW_MANXIUM_BLOCK_6.get(), ModItems.RAW_MANXIUM.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_RAW_MANXIUM_BLOCK_6.get(), ModBlocks.COMPRESSED_RAW_MANXIUM_BLOCK_7.get(), ModItems.RAW_MANXIUM.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_RAW_MANXIUM_BLOCK_7.get(), ModBlocks.COMPRESSED_RAW_MANXIUM_BLOCK_8.get(), ModItems.RAW_MANXIUM.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_RAW_MANXIUM_BLOCK_8.get(), ModBlocks.COMPRESSED_RAW_MANXIUM_BLOCK_9.get(), ModItems.RAW_MANXIUM.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_RAW_MANXIUM_BLOCK_1.get(), ModBlocks.RAW_MANXIUM_BLOCK.get(), ModItems.RAW_MANXIUM.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_RAW_MANXIUM_BLOCK_2.get(), ModBlocks.COMPRESSED_RAW_MANXIUM_BLOCK_1.get(), ModItems.RAW_MANXIUM.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_RAW_MANXIUM_BLOCK_3.get(), ModBlocks.COMPRESSED_RAW_MANXIUM_BLOCK_2.get(), ModItems.RAW_MANXIUM.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_RAW_MANXIUM_BLOCK_4.get(), ModBlocks.COMPRESSED_RAW_MANXIUM_BLOCK_3.get(), ModItems.RAW_MANXIUM.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_RAW_MANXIUM_BLOCK_5.get(), ModBlocks.COMPRESSED_RAW_MANXIUM_BLOCK_4.get(), ModItems.RAW_MANXIUM.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_RAW_MANXIUM_BLOCK_6.get(), ModBlocks.COMPRESSED_RAW_MANXIUM_BLOCK_5.get(), ModItems.RAW_MANXIUM.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_RAW_MANXIUM_BLOCK_7.get(), ModBlocks.COMPRESSED_RAW_MANXIUM_BLOCK_6.get(), ModItems.RAW_MANXIUM.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_RAW_MANXIUM_BLOCK_8.get(), ModBlocks.COMPRESSED_RAW_MANXIUM_BLOCK_7.get(), ModItems.RAW_MANXIUM.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_RAW_MANXIUM_BLOCK_9.get(), ModBlocks.COMPRESSED_RAW_MANXIUM_BLOCK_8.get(), ModItems.RAW_MANXIUM.get());

        // MANXIUM ORE ITEMS
        oneFromNinePacking(consumer, ModItems.MANXIUM_INGOT.get(), ModItems.MANXIUM_NUGGET.get(), ModItems.MANXIUM_INGOT.get());
        nineFromOneUnpacking(consumer, ModItems.MANXIUM_NUGGET.get(), ModItems.MANXIUM_INGOT.get(), ModItems.MANXIUM_INGOT.get());
        oneFromNinePacking(consumer, ModBlocks.MANXIUM_BLOCK.get(), ModItems.MANXIUM_INGOT.get(), ModItems.MANXIUM_INGOT.get());
        nineFromOneUnpacking(consumer, ModItems.MANXIUM_INGOT.get(), ModBlocks.MANXIUM_BLOCK.get(), ModItems.MANXIUM_INGOT.get());
        nineFromOneUnpacking(consumer, ModBlocks.MANXIUM_BLOCK.get(), ModBlocks.COMPRESSED_MANXIUM_BLOCK_1.get(), ModItems.MANXIUM_INGOT.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_MANXIUM_BLOCK_1.get(), ModBlocks.COMPRESSED_MANXIUM_BLOCK_2.get(), ModItems.MANXIUM_INGOT.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_MANXIUM_BLOCK_2.get(), ModBlocks.COMPRESSED_MANXIUM_BLOCK_3.get(), ModItems.MANXIUM_INGOT.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_MANXIUM_BLOCK_3.get(), ModBlocks.COMPRESSED_MANXIUM_BLOCK_4.get(), ModItems.MANXIUM_INGOT.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_MANXIUM_BLOCK_4.get(), ModBlocks.COMPRESSED_MANXIUM_BLOCK_5.get(), ModItems.MANXIUM_INGOT.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_MANXIUM_BLOCK_5.get(), ModBlocks.COMPRESSED_MANXIUM_BLOCK_6.get(), ModItems.MANXIUM_INGOT.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_MANXIUM_BLOCK_6.get(), ModBlocks.COMPRESSED_MANXIUM_BLOCK_7.get(), ModItems.MANXIUM_INGOT.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_MANXIUM_BLOCK_7.get(), ModBlocks.COMPRESSED_MANXIUM_BLOCK_8.get(), ModItems.MANXIUM_INGOT.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_MANXIUM_BLOCK_8.get(), ModBlocks.COMPRESSED_MANXIUM_BLOCK_9.get(), ModItems.MANXIUM_INGOT.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_MANXIUM_BLOCK_1.get(), ModBlocks.MANXIUM_BLOCK.get(), ModItems.MANXIUM_INGOT.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_MANXIUM_BLOCK_2.get(), ModBlocks.COMPRESSED_MANXIUM_BLOCK_1.get(), ModItems.MANXIUM_INGOT.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_MANXIUM_BLOCK_3.get(), ModBlocks.COMPRESSED_MANXIUM_BLOCK_2.get(), ModItems.MANXIUM_INGOT.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_MANXIUM_BLOCK_4.get(), ModBlocks.COMPRESSED_MANXIUM_BLOCK_3.get(), ModItems.MANXIUM_INGOT.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_MANXIUM_BLOCK_5.get(), ModBlocks.COMPRESSED_MANXIUM_BLOCK_4.get(), ModItems.MANXIUM_INGOT.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_MANXIUM_BLOCK_6.get(), ModBlocks.COMPRESSED_MANXIUM_BLOCK_5.get(), ModItems.MANXIUM_INGOT.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_MANXIUM_BLOCK_7.get(), ModBlocks.COMPRESSED_MANXIUM_BLOCK_6.get(), ModItems.MANXIUM_INGOT.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_MANXIUM_BLOCK_8.get(), ModBlocks.COMPRESSED_MANXIUM_BLOCK_7.get(), ModItems.MANXIUM_INGOT.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_MANXIUM_BLOCK_9.get(), ModBlocks.COMPRESSED_MANXIUM_BLOCK_8.get(), ModItems.MANXIUM_INGOT.get());
        toolRecipe(consumer, "Axe", ModItems.MANXIUM_AXE.get(), ModItems.MANXIUM_INGOT.get());
        toolRecipe(consumer, "Hoe", ModItems.MANXIUM_HOE.get(), ModItems.MANXIUM_INGOT.get());
        toolRecipe(consumer, "Pickaxe", ModItems.MANXIUM_PICKAXE.get(), ModItems.MANXIUM_INGOT.get());
        toolRecipe(consumer, "Shovel", ModItems.MANXIUM_SHOVEL.get(), ModItems.MANXIUM_INGOT.get());
        toolRecipe(consumer, "Sword", ModItems.MANXIUM_SWORD.get(), ModItems.MANXIUM_INGOT.get());
        toolRecipe(consumer, "Helmet", ModItems.MANXIUM_HELMET.get(), ModItems.MANXIUM_INGOT.get());
        toolRecipe(consumer, "Chestplate", ModItems.MANXIUM_CHESTPLATE.get(), ModItems.MANXIUM_INGOT.get());
        toolRecipe(consumer, "Leggings", ModItems.MANXIUM_LEGGINGS.get(), ModItems.MANXIUM_INGOT.get());
        toolRecipe(consumer, "Boots", ModItems.MANXIUM_BOOTS.get(), ModItems.MANXIUM_INGOT.get());

        // OHLY COOKING
        oreSmelting(consumer, ModItems.OHLY_INGOT.get(), ModItems.RAW_OHLY.get(), 0.7F, 200);
        oreSmelting(consumer, ModItems.OHLY_NUGGET.get(), ModItems.RAW_OHLY_PIECE.get(), 0.1F, 200);
        oreSmelting(consumer, ModItems.OHLY_INGOT.get(), ModBlocks.OHLY_ORE.get(), 0.7F, 200);
        oreSmelting(consumer, ModItems.OHLY_INGOT.get(), ModBlocks.DEEPSLATE_OHLY_ORE.get(), 0.7F, 200);
        oreSmelting(consumer, ModItems.OHLY_INGOT.get(), ModBlocks.NETHERRACK_OHLY_ORE.get(), 0.7F, 200);
        oreSmelting(consumer, ModItems.OHLY_INGOT.get(), ModBlocks.ENDSTONE_OHLY_ORE.get(), 0.7F, 200);
        // JSON // oreSmelting(consumer, 3, ModItems.OHLY_NUGGET.get(), ModBlocks.POOR_OHLY_ORE.get(), 0.4F, 200);
        // JSON // oreSmelting(consumer, 3, ModItems.OHLY_NUGGET.get(), ModBlocks.POOR_DEEPSLATE_OHLY_ORE.get(), 0.4F, 200);
        // JSON // oreSmelting(consumer, 3, ModItems.OHLY_NUGGET.get(), ModBlocks.POOR_NETHERRACK_OHLY_ORE.get(), 0.4F, 200);
        // JSON // oreSmelting(consumer, 3, ModItems.OHLY_NUGGET.get(), ModBlocks.POOR_ENDSTONE_OHLY_ORE.get(), 0.4F, 200);
        // JSON // oreSmelting(consumer, 3, ModItems.OHLY_INGOT.get(), ModBlocks.RICH_OHLY_ORE.get(), 1.1F, 200);
        // JSON // oreSmelting(consumer, 3, ModItems.OHLY_INGOT.get(), ModBlocks.RICH_DEEPSLATE_OHLY_ORE.get(), 1.1F, 200);
        // JSON // oreSmelting(consumer, 3, ModItems.OHLY_INGOT.get(), ModBlocks.RICH_NETHERRACK_OHLY_ORE.get(), 1.1F, 200);
        // JSON // oreSmelting(consumer, 3, ModItems.OHLY_INGOT.get(), ModBlocks.RICH_ENDSTONE_OHLY_ORE.get(), 1.1F, 200);

        // OHLY RAW ORE ITEMS
        oneFromNinePacking(consumer, ModItems.RAW_OHLY.get(), ModItems.RAW_OHLY_PIECE.get(), ModItems.RAW_OHLY.get());
        nineFromOneUnpacking(consumer, ModItems.RAW_OHLY_PIECE.get(), ModItems.RAW_OHLY.get(), ModItems.RAW_OHLY.get());
        oneFromNinePacking(consumer, ModBlocks.RAW_OHLY_BLOCK.get(), ModItems.RAW_OHLY.get(), ModItems.RAW_OHLY.get());
        nineFromOneUnpacking(consumer, ModItems.RAW_OHLY.get(), ModBlocks.RAW_OHLY_BLOCK.get(), ModItems.RAW_OHLY.get());
        nineFromOneUnpacking(consumer, ModBlocks.RAW_OHLY_BLOCK.get(), ModBlocks.COMPRESSED_RAW_OHLY_BLOCK_1.get(), ModItems.RAW_OHLY.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_RAW_OHLY_BLOCK_1.get(), ModBlocks.COMPRESSED_RAW_OHLY_BLOCK_2.get(), ModItems.RAW_OHLY.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_RAW_OHLY_BLOCK_2.get(), ModBlocks.COMPRESSED_RAW_OHLY_BLOCK_3.get(), ModItems.RAW_OHLY.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_RAW_OHLY_BLOCK_3.get(), ModBlocks.COMPRESSED_RAW_OHLY_BLOCK_4.get(), ModItems.RAW_OHLY.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_RAW_OHLY_BLOCK_4.get(), ModBlocks.COMPRESSED_RAW_OHLY_BLOCK_5.get(), ModItems.RAW_OHLY.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_RAW_OHLY_BLOCK_5.get(), ModBlocks.COMPRESSED_RAW_OHLY_BLOCK_6.get(), ModItems.RAW_OHLY.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_RAW_OHLY_BLOCK_6.get(), ModBlocks.COMPRESSED_RAW_OHLY_BLOCK_7.get(), ModItems.RAW_OHLY.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_RAW_OHLY_BLOCK_7.get(), ModBlocks.COMPRESSED_RAW_OHLY_BLOCK_8.get(), ModItems.RAW_OHLY.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_RAW_OHLY_BLOCK_8.get(), ModBlocks.COMPRESSED_RAW_OHLY_BLOCK_9.get(), ModItems.RAW_OHLY.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_RAW_OHLY_BLOCK_1.get(), ModBlocks.RAW_OHLY_BLOCK.get(), ModItems.RAW_OHLY.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_RAW_OHLY_BLOCK_2.get(), ModBlocks.COMPRESSED_RAW_OHLY_BLOCK_1.get(), ModItems.RAW_OHLY.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_RAW_OHLY_BLOCK_3.get(), ModBlocks.COMPRESSED_RAW_OHLY_BLOCK_2.get(), ModItems.RAW_OHLY.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_RAW_OHLY_BLOCK_4.get(), ModBlocks.COMPRESSED_RAW_OHLY_BLOCK_3.get(), ModItems.RAW_OHLY.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_RAW_OHLY_BLOCK_5.get(), ModBlocks.COMPRESSED_RAW_OHLY_BLOCK_4.get(), ModItems.RAW_OHLY.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_RAW_OHLY_BLOCK_6.get(), ModBlocks.COMPRESSED_RAW_OHLY_BLOCK_5.get(), ModItems.RAW_OHLY.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_RAW_OHLY_BLOCK_7.get(), ModBlocks.COMPRESSED_RAW_OHLY_BLOCK_6.get(), ModItems.RAW_OHLY.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_RAW_OHLY_BLOCK_8.get(), ModBlocks.COMPRESSED_RAW_OHLY_BLOCK_7.get(), ModItems.RAW_OHLY.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_RAW_OHLY_BLOCK_9.get(), ModBlocks.COMPRESSED_RAW_OHLY_BLOCK_8.get(), ModItems.RAW_OHLY.get());

        // OHLY ORE ITEMS
        oneFromNinePacking(consumer, ModItems.OHLY_INGOT.get(), ModItems.OHLY_NUGGET.get(), ModItems.OHLY_INGOT.get());
        nineFromOneUnpacking(consumer, ModItems.OHLY_NUGGET.get(), ModItems.OHLY_INGOT.get(), ModItems.OHLY_INGOT.get());
        oneFromNinePacking(consumer, ModBlocks.OHLY_BLOCK.get(), ModItems.OHLY_INGOT.get(), ModItems.OHLY_INGOT.get());
        nineFromOneUnpacking(consumer, ModItems.OHLY_INGOT.get(), ModBlocks.OHLY_BLOCK.get(), ModItems.OHLY_INGOT.get());
        nineFromOneUnpacking(consumer, ModBlocks.OHLY_BLOCK.get(), ModBlocks.COMPRESSED_OHLY_BLOCK_1.get(), ModItems.OHLY_INGOT.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_OHLY_BLOCK_1.get(), ModBlocks.COMPRESSED_OHLY_BLOCK_2.get(), ModItems.OHLY_INGOT.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_OHLY_BLOCK_2.get(), ModBlocks.COMPRESSED_OHLY_BLOCK_3.get(), ModItems.OHLY_INGOT.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_OHLY_BLOCK_3.get(), ModBlocks.COMPRESSED_OHLY_BLOCK_4.get(), ModItems.OHLY_INGOT.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_OHLY_BLOCK_4.get(), ModBlocks.COMPRESSED_OHLY_BLOCK_5.get(), ModItems.OHLY_INGOT.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_OHLY_BLOCK_5.get(), ModBlocks.COMPRESSED_OHLY_BLOCK_6.get(), ModItems.OHLY_INGOT.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_OHLY_BLOCK_6.get(), ModBlocks.COMPRESSED_OHLY_BLOCK_7.get(), ModItems.OHLY_INGOT.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_OHLY_BLOCK_7.get(), ModBlocks.COMPRESSED_OHLY_BLOCK_8.get(), ModItems.OHLY_INGOT.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_OHLY_BLOCK_8.get(), ModBlocks.COMPRESSED_OHLY_BLOCK_9.get(), ModItems.OHLY_INGOT.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_OHLY_BLOCK_1.get(), ModBlocks.OHLY_BLOCK.get(), ModItems.OHLY_INGOT.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_OHLY_BLOCK_2.get(), ModBlocks.COMPRESSED_OHLY_BLOCK_1.get(), ModItems.OHLY_INGOT.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_OHLY_BLOCK_3.get(), ModBlocks.COMPRESSED_OHLY_BLOCK_2.get(), ModItems.OHLY_INGOT.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_OHLY_BLOCK_4.get(), ModBlocks.COMPRESSED_OHLY_BLOCK_3.get(), ModItems.OHLY_INGOT.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_OHLY_BLOCK_5.get(), ModBlocks.COMPRESSED_OHLY_BLOCK_4.get(), ModItems.OHLY_INGOT.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_OHLY_BLOCK_6.get(), ModBlocks.COMPRESSED_OHLY_BLOCK_5.get(), ModItems.OHLY_INGOT.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_OHLY_BLOCK_7.get(), ModBlocks.COMPRESSED_OHLY_BLOCK_6.get(), ModItems.OHLY_INGOT.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_OHLY_BLOCK_8.get(), ModBlocks.COMPRESSED_OHLY_BLOCK_7.get(), ModItems.OHLY_INGOT.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_OHLY_BLOCK_9.get(), ModBlocks.COMPRESSED_OHLY_BLOCK_8.get(), ModItems.OHLY_INGOT.get());
        toolRecipe(consumer, "Axe", ModItems.OHLY_AXE.get(), ModItems.OHLY_INGOT.get());
        toolRecipe(consumer, "Hoe", ModItems.OHLY_HOE.get(), ModItems.OHLY_INGOT.get());
        toolRecipe(consumer, "Pickaxe", ModItems.OHLY_PICKAXE.get(), ModItems.OHLY_INGOT.get());
        toolRecipe(consumer, "Shovel", ModItems.OHLY_SHOVEL.get(), ModItems.OHLY_INGOT.get());
        toolRecipe(consumer, "Sword", ModItems.OHLY_SWORD.get(), ModItems.OHLY_INGOT.get());
        toolRecipe(consumer, "Helmet", ModItems.OHLY_HELMET.get(), ModItems.OHLY_INGOT.get());
        toolRecipe(consumer, "Chestplate", ModItems.OHLY_CHESTPLATE.get(), ModItems.OHLY_INGOT.get());
        toolRecipe(consumer, "Leggings", ModItems.OHLY_LEGGINGS.get(), ModItems.OHLY_INGOT.get());
        toolRecipe(consumer, "Boots", ModItems.OHLY_BOOTS.get(), ModItems.OHLY_INGOT.get());

        // RAGOUTON COOKING
        oreSmelting(consumer, ModItems.RAGOUTON_INGOT.get(), ModItems.RAW_RAGOUTON.get(), 0.7F, 200);
        oreSmelting(consumer, ModItems.RAGOUTON_NUGGET.get(), ModItems.RAW_RAGOUTON_PIECE.get(), 0.1F, 200);
        oreSmelting(consumer, ModItems.RAGOUTON_INGOT.get(), ModBlocks.RAGOUTON_ORE.get(), 0.7F, 200);
        oreSmelting(consumer, ModItems.RAGOUTON_INGOT.get(), ModBlocks.DEEPSLATE_RAGOUTON_ORE.get(), 0.7F, 200);
        oreSmelting(consumer, ModItems.RAGOUTON_INGOT.get(), ModBlocks.NETHERRACK_RAGOUTON_ORE.get(), 0.7F, 200);
        oreSmelting(consumer, ModItems.RAGOUTON_INGOT.get(), ModBlocks.ENDSTONE_RAGOUTON_ORE.get(), 0.7F, 200);
        // JSON // oreSmelting(consumer, 3, ModItems.RAGOUTON_NUGGET.get(), ModBlocks.POOR_RAGOUTON_ORE.get(), 0.4F, 200);
        // JSON // oreSmelting(consumer, 3, ModItems.RAGOUTON_NUGGET.get(), ModBlocks.POOR_DEEPSLATE_RAGOUTON_ORE.get(), 0.4F, 200);
        // JSON // oreSmelting(consumer, 3, ModItems.RAGOUTON_NUGGET.get(), ModBlocks.POOR_NETHERRACK_RAGOUTON_ORE.get(), 0.4F, 200);
        // JSON // oreSmelting(consumer, 3, ModItems.RAGOUTON_NUGGET.get(), ModBlocks.POOR_ENDSTONE_RAGOUTON_ORE.get(), 0.4F, 200);
        // JSON // oreSmelting(consumer, 3, ModItems.RAGOUTON_INGOT.get(), ModBlocks.RICH_RAGOUTON_ORE.get(), 1.1F, 200);
        // JSON // oreSmelting(consumer, 3, ModItems.RAGOUTON_INGOT.get(), ModBlocks.RICH_DEEPSLATE_RAGOUTON_ORE.get(), 1.1F, 200);
        // JSON // oreSmelting(consumer, 3, ModItems.RAGOUTON_INGOT.get(), ModBlocks.RICH_NETHERRACK_RAGOUTON_ORE.get(), 1.1F, 200);
        // JSON // oreSmelting(consumer, 3, ModItems.RAGOUTON_INGOT.get(), ModBlocks.RICH_ENDSTONE_RAGOUTON_ORE.get(), 1.1F, 200);

        // RAGOUTON RAW ORE ITEMS
        oneFromNinePacking(consumer, ModItems.RAW_RAGOUTON.get(), ModItems.RAW_RAGOUTON_PIECE.get(), ModItems.RAW_RAGOUTON.get());
        nineFromOneUnpacking(consumer, ModItems.RAW_RAGOUTON_PIECE.get(), ModItems.RAW_RAGOUTON.get(), ModItems.RAW_RAGOUTON.get());
        oneFromNinePacking(consumer, ModBlocks.RAW_RAGOUTON_BLOCK.get(), ModItems.RAW_RAGOUTON.get(), ModItems.RAW_RAGOUTON.get());
        nineFromOneUnpacking(consumer, ModItems.RAW_RAGOUTON.get(), ModBlocks.RAW_RAGOUTON_BLOCK.get(), ModItems.RAW_RAGOUTON.get());
        nineFromOneUnpacking(consumer, ModBlocks.RAW_RAGOUTON_BLOCK.get(), ModBlocks.COMPRESSED_RAW_RAGOUTON_BLOCK_1.get(), ModItems.RAW_RAGOUTON.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_RAW_RAGOUTON_BLOCK_1.get(), ModBlocks.COMPRESSED_RAW_RAGOUTON_BLOCK_2.get(), ModItems.RAW_RAGOUTON.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_RAW_RAGOUTON_BLOCK_2.get(), ModBlocks.COMPRESSED_RAW_RAGOUTON_BLOCK_3.get(), ModItems.RAW_RAGOUTON.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_RAW_RAGOUTON_BLOCK_3.get(), ModBlocks.COMPRESSED_RAW_RAGOUTON_BLOCK_4.get(), ModItems.RAW_RAGOUTON.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_RAW_RAGOUTON_BLOCK_4.get(), ModBlocks.COMPRESSED_RAW_RAGOUTON_BLOCK_5.get(), ModItems.RAW_RAGOUTON.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_RAW_RAGOUTON_BLOCK_5.get(), ModBlocks.COMPRESSED_RAW_RAGOUTON_BLOCK_6.get(), ModItems.RAW_RAGOUTON.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_RAW_RAGOUTON_BLOCK_6.get(), ModBlocks.COMPRESSED_RAW_RAGOUTON_BLOCK_7.get(), ModItems.RAW_RAGOUTON.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_RAW_RAGOUTON_BLOCK_7.get(), ModBlocks.COMPRESSED_RAW_RAGOUTON_BLOCK_8.get(), ModItems.RAW_RAGOUTON.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_RAW_RAGOUTON_BLOCK_8.get(), ModBlocks.COMPRESSED_RAW_RAGOUTON_BLOCK_9.get(), ModItems.RAW_RAGOUTON.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_RAW_RAGOUTON_BLOCK_1.get(), ModBlocks.RAW_RAGOUTON_BLOCK.get(), ModItems.RAW_RAGOUTON.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_RAW_RAGOUTON_BLOCK_2.get(), ModBlocks.COMPRESSED_RAW_RAGOUTON_BLOCK_1.get(), ModItems.RAW_RAGOUTON.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_RAW_RAGOUTON_BLOCK_3.get(), ModBlocks.COMPRESSED_RAW_RAGOUTON_BLOCK_2.get(), ModItems.RAW_RAGOUTON.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_RAW_RAGOUTON_BLOCK_4.get(), ModBlocks.COMPRESSED_RAW_RAGOUTON_BLOCK_3.get(), ModItems.RAW_RAGOUTON.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_RAW_RAGOUTON_BLOCK_5.get(), ModBlocks.COMPRESSED_RAW_RAGOUTON_BLOCK_4.get(), ModItems.RAW_RAGOUTON.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_RAW_RAGOUTON_BLOCK_6.get(), ModBlocks.COMPRESSED_RAW_RAGOUTON_BLOCK_5.get(), ModItems.RAW_RAGOUTON.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_RAW_RAGOUTON_BLOCK_7.get(), ModBlocks.COMPRESSED_RAW_RAGOUTON_BLOCK_6.get(), ModItems.RAW_RAGOUTON.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_RAW_RAGOUTON_BLOCK_8.get(), ModBlocks.COMPRESSED_RAW_RAGOUTON_BLOCK_7.get(), ModItems.RAW_RAGOUTON.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_RAW_RAGOUTON_BLOCK_9.get(), ModBlocks.COMPRESSED_RAW_RAGOUTON_BLOCK_8.get(), ModItems.RAW_RAGOUTON.get());

        // RAGOUTON ORE ITEMS
        oneFromNinePacking(consumer, ModItems.RAGOUTON_INGOT.get(), ModItems.RAGOUTON_NUGGET.get(), ModItems.RAGOUTON_INGOT.get());
        nineFromOneUnpacking(consumer,ModItems.RAGOUTON_NUGGET.get(), ModItems.RAGOUTON_INGOT.get(), ModItems.RAGOUTON_INGOT.get());
        oneFromNinePacking(consumer, ModBlocks.RAGOUTON_BLOCK.get(), ModItems.RAGOUTON_INGOT.get(), ModItems.RAGOUTON_INGOT.get());
        nineFromOneUnpacking(consumer, ModItems.RAGOUTON_INGOT.get(), ModBlocks.RAGOUTON_BLOCK.get(), ModItems.RAGOUTON_INGOT.get());
        nineFromOneUnpacking(consumer, ModBlocks.RAGOUTON_BLOCK.get(), ModBlocks.COMPRESSED_RAGOUTON_BLOCK_1.get(), ModItems.RAGOUTON_INGOT.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_RAGOUTON_BLOCK_1.get(), ModBlocks.COMPRESSED_RAGOUTON_BLOCK_2.get(), ModItems.RAGOUTON_INGOT.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_RAGOUTON_BLOCK_2.get(), ModBlocks.COMPRESSED_RAGOUTON_BLOCK_3.get(), ModItems.RAGOUTON_INGOT.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_RAGOUTON_BLOCK_3.get(), ModBlocks.COMPRESSED_RAGOUTON_BLOCK_4.get(), ModItems.RAGOUTON_INGOT.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_RAGOUTON_BLOCK_4.get(), ModBlocks.COMPRESSED_RAGOUTON_BLOCK_5.get(), ModItems.RAGOUTON_INGOT.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_RAGOUTON_BLOCK_5.get(), ModBlocks.COMPRESSED_RAGOUTON_BLOCK_6.get(), ModItems.RAGOUTON_INGOT.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_RAGOUTON_BLOCK_6.get(), ModBlocks.COMPRESSED_RAGOUTON_BLOCK_7.get(), ModItems.RAGOUTON_INGOT.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_RAGOUTON_BLOCK_7.get(), ModBlocks.COMPRESSED_RAGOUTON_BLOCK_8.get(), ModItems.RAGOUTON_INGOT.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_RAGOUTON_BLOCK_8.get(), ModBlocks.COMPRESSED_RAGOUTON_BLOCK_9.get(), ModItems.RAGOUTON_INGOT.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_RAGOUTON_BLOCK_1.get(), ModBlocks.RAGOUTON_BLOCK.get(), ModItems.RAGOUTON_INGOT.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_RAGOUTON_BLOCK_2.get(), ModBlocks.COMPRESSED_RAGOUTON_BLOCK_1.get(), ModItems.RAGOUTON_INGOT.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_RAGOUTON_BLOCK_3.get(), ModBlocks.COMPRESSED_RAGOUTON_BLOCK_2.get(), ModItems.RAGOUTON_INGOT.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_RAGOUTON_BLOCK_4.get(), ModBlocks.COMPRESSED_RAGOUTON_BLOCK_3.get(), ModItems.RAGOUTON_INGOT.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_RAGOUTON_BLOCK_5.get(), ModBlocks.COMPRESSED_RAGOUTON_BLOCK_4.get(), ModItems.RAGOUTON_INGOT.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_RAGOUTON_BLOCK_6.get(), ModBlocks.COMPRESSED_RAGOUTON_BLOCK_5.get(), ModItems.RAGOUTON_INGOT.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_RAGOUTON_BLOCK_7.get(), ModBlocks.COMPRESSED_RAGOUTON_BLOCK_6.get(), ModItems.RAGOUTON_INGOT.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_RAGOUTON_BLOCK_8.get(), ModBlocks.COMPRESSED_RAGOUTON_BLOCK_7.get(), ModItems.RAGOUTON_INGOT.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_RAGOUTON_BLOCK_9.get(), ModBlocks.COMPRESSED_RAGOUTON_BLOCK_8.get(), ModItems.RAGOUTON_INGOT.get());
        toolRecipe(consumer, "Axe", ModItems.RAGOUTON_AXE.get(), ModItems.RAGOUTON_INGOT.get());
        toolRecipe(consumer, "Hoe", ModItems.RAGOUTON_HOE.get(), ModItems.RAGOUTON_INGOT.get());
        toolRecipe(consumer, "Pickaxe", ModItems.RAGOUTON_PICKAXE.get(), ModItems.RAGOUTON_INGOT.get());
        toolRecipe(consumer, "Shovel", ModItems.RAGOUTON_SHOVEL.get(), ModItems.RAGOUTON_INGOT.get());
        toolRecipe(consumer, "Sword", ModItems.RAGOUTON_SWORD.get(), ModItems.RAGOUTON_INGOT.get());
        toolRecipe(consumer, "Helmet", ModItems.RAGOUTON_HELMET.get(), ModItems.RAGOUTON_INGOT.get());
        toolRecipe(consumer, "Chestplate", ModItems.RAGOUTON_CHESTPLATE.get(), ModItems.RAGOUTON_INGOT.get());
        toolRecipe(consumer, "Leggings", ModItems.RAGOUTON_LEGGINGS.get(), ModItems.RAGOUTON_INGOT.get());
        toolRecipe(consumer, "Boots", ModItems.RAGOUTON_BOOTS.get(), ModItems.RAGOUTON_INGOT.get());

        // SLITHESE COOKING
        oreSmelting(consumer, ModItems.SLITHESE_INGOT.get(), ModItems.RAW_SLITHESE.get(), 0.7F, 200);
        oreSmelting(consumer, ModItems.SLITHESE_NUGGET.get(), ModItems.RAW_SLITHESE_PIECE.get(), 0.1F, 200);
        oreSmelting(consumer, ModItems.SLITHESE_INGOT.get(), ModBlocks.SLITHESE_ORE.get(), 0.7F, 200);
        oreSmelting(consumer, ModItems.SLITHESE_INGOT.get(), ModBlocks.DEEPSLATE_SLITHESE_ORE.get(), 0.7F, 200);
        oreSmelting(consumer, ModItems.SLITHESE_INGOT.get(), ModBlocks.NETHERRACK_SLITHESE_ORE.get(), 0.7F, 200);
        oreSmelting(consumer, ModItems.SLITHESE_INGOT.get(), ModBlocks.ENDSTONE_SLITHESE_ORE.get(), 0.7F, 200);
        // JSON // oreSmelting(consumer, 3, ModItems.SLITHESE_NUGGET.get(), ModBlocks.POOR_SLITHESE_ORE.get(), 0.4F, 200);
        // JSON // oreSmelting(consumer, 3, ModItems.SLITHESE_NUGGET.get(), ModBlocks.POOR_DEEPSLATE_SLITHESE_ORE.get(), 0.4F, 200);
        // JSON // oreSmelting(consumer, 3, ModItems.SLITHESE_NUGGET.get(), ModBlocks.POOR_NETHERRACK_SLITHESE_ORE.get(), 0.4F, 200);
        // JSON // oreSmelting(consumer, 3, ModItems.SLITHESE_NUGGET.get(), ModBlocks.POOR_ENDSTONE_SLITHESE_ORE.get(), 0.4F, 200);
        // JSON // oreSmelting(consumer, 3, ModItems.SLITHESE_INGOT.get(), ModBlocks.RICH_SLITHESE_ORE.get(), 1.1F, 200);
        // JSON // oreSmelting(consumer, 3, ModItems.SLITHESE_INGOT.get(), ModBlocks.RICH_DEEPSLATE_SLITHESE_ORE.get(), 1.1F, 200);
        // JSON // oreSmelting(consumer, 3, ModItems.SLITHESE_INGOT.get(), ModBlocks.RICH_NETHERRACK_SLITHESE_ORE.get(), 1.1F, 200);
        // JSON // oreSmelting(consumer, 3, ModItems.SLITHESE_INGOT.get(), ModBlocks.RICH_ENDSTONE_SLITHESE_ORE.get(), 1.1F, 200);

        // SLITHESE RAW ORE ITEMS
        oneFromNinePacking(consumer, ModItems.RAW_SLITHESE.get(), ModItems.RAW_SLITHESE_PIECE.get(), ModItems.RAW_SLITHESE.get());
        nineFromOneUnpacking(consumer, ModItems.RAW_SLITHESE_PIECE.get(), ModItems.RAW_SLITHESE.get(), ModItems.RAW_SLITHESE.get());
        oneFromNinePacking(consumer, ModBlocks.RAW_SLITHESE_BLOCK.get(), ModItems.RAW_SLITHESE.get(), ModItems.RAW_SLITHESE.get());
        nineFromOneUnpacking(consumer, ModItems.RAW_SLITHESE.get(), ModBlocks.RAW_SLITHESE_BLOCK.get(), ModItems.RAW_SLITHESE.get());
        nineFromOneUnpacking(consumer, ModBlocks.RAW_SLITHESE_BLOCK.get(), ModBlocks.COMPRESSED_RAW_SLITHESE_BLOCK_1.get(), ModItems.RAW_SLITHESE.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_RAW_SLITHESE_BLOCK_1.get(), ModBlocks.COMPRESSED_RAW_SLITHESE_BLOCK_2.get(), ModItems.RAW_SLITHESE.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_RAW_SLITHESE_BLOCK_2.get(), ModBlocks.COMPRESSED_RAW_SLITHESE_BLOCK_3.get(), ModItems.RAW_SLITHESE.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_RAW_SLITHESE_BLOCK_3.get(), ModBlocks.COMPRESSED_RAW_SLITHESE_BLOCK_4.get(), ModItems.RAW_SLITHESE.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_RAW_SLITHESE_BLOCK_4.get(), ModBlocks.COMPRESSED_RAW_SLITHESE_BLOCK_5.get(), ModItems.RAW_SLITHESE.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_RAW_SLITHESE_BLOCK_5.get(), ModBlocks.COMPRESSED_RAW_SLITHESE_BLOCK_6.get(), ModItems.RAW_SLITHESE.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_RAW_SLITHESE_BLOCK_6.get(), ModBlocks.COMPRESSED_RAW_SLITHESE_BLOCK_7.get(), ModItems.RAW_SLITHESE.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_RAW_SLITHESE_BLOCK_7.get(), ModBlocks.COMPRESSED_RAW_SLITHESE_BLOCK_8.get(), ModItems.RAW_SLITHESE.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_RAW_SLITHESE_BLOCK_8.get(), ModBlocks.COMPRESSED_RAW_SLITHESE_BLOCK_9.get(), ModItems.RAW_SLITHESE.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_RAW_SLITHESE_BLOCK_1.get(), ModBlocks.RAW_SLITHESE_BLOCK.get(), ModItems.RAW_SLITHESE.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_RAW_SLITHESE_BLOCK_2.get(), ModBlocks.COMPRESSED_RAW_SLITHESE_BLOCK_1.get(), ModItems.RAW_SLITHESE.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_RAW_SLITHESE_BLOCK_3.get(), ModBlocks.COMPRESSED_RAW_SLITHESE_BLOCK_2.get(), ModItems.RAW_SLITHESE.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_RAW_SLITHESE_BLOCK_4.get(), ModBlocks.COMPRESSED_RAW_SLITHESE_BLOCK_3.get(), ModItems.RAW_SLITHESE.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_RAW_SLITHESE_BLOCK_5.get(), ModBlocks.COMPRESSED_RAW_SLITHESE_BLOCK_4.get(), ModItems.RAW_SLITHESE.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_RAW_SLITHESE_BLOCK_6.get(), ModBlocks.COMPRESSED_RAW_SLITHESE_BLOCK_5.get(), ModItems.RAW_SLITHESE.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_RAW_SLITHESE_BLOCK_7.get(), ModBlocks.COMPRESSED_RAW_SLITHESE_BLOCK_6.get(), ModItems.RAW_SLITHESE.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_RAW_SLITHESE_BLOCK_8.get(), ModBlocks.COMPRESSED_RAW_SLITHESE_BLOCK_7.get(), ModItems.RAW_SLITHESE.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_RAW_SLITHESE_BLOCK_9.get(), ModBlocks.COMPRESSED_RAW_SLITHESE_BLOCK_8.get(), ModItems.RAW_SLITHESE.get());

        // SLITHESE ORE ITEMS
        oneFromNinePacking(consumer, ModItems.SLITHESE_INGOT.get(), ModItems.SLITHESE_NUGGET.get(), ModItems.SLITHESE_INGOT.get());
        nineFromOneUnpacking(consumer, ModItems.SLITHESE_NUGGET.get(), ModItems.SLITHESE_INGOT.get(), ModItems.SLITHESE_INGOT.get());
        oneFromNinePacking(consumer, ModBlocks.SLITHESE_BLOCK.get(), ModItems.SLITHESE_INGOT.get(), ModItems.SLITHESE_INGOT.get());
        nineFromOneUnpacking(consumer, ModItems.SLITHESE_INGOT.get(), ModBlocks.SLITHESE_BLOCK.get(), ModItems.SLITHESE_INGOT.get());
        nineFromOneUnpacking(consumer, ModBlocks.SLITHESE_BLOCK.get(), ModBlocks.COMPRESSED_SLITHESE_BLOCK_1.get(), ModItems.SLITHESE_INGOT.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_SLITHESE_BLOCK_1.get(), ModBlocks.COMPRESSED_SLITHESE_BLOCK_2.get(), ModItems.SLITHESE_INGOT.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_SLITHESE_BLOCK_2.get(), ModBlocks.COMPRESSED_SLITHESE_BLOCK_3.get(), ModItems.SLITHESE_INGOT.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_SLITHESE_BLOCK_3.get(), ModBlocks.COMPRESSED_SLITHESE_BLOCK_4.get(), ModItems.SLITHESE_INGOT.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_SLITHESE_BLOCK_4.get(), ModBlocks.COMPRESSED_SLITHESE_BLOCK_5.get(), ModItems.SLITHESE_INGOT.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_SLITHESE_BLOCK_5.get(), ModBlocks.COMPRESSED_SLITHESE_BLOCK_6.get(), ModItems.SLITHESE_INGOT.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_SLITHESE_BLOCK_6.get(), ModBlocks.COMPRESSED_SLITHESE_BLOCK_7.get(), ModItems.SLITHESE_INGOT.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_SLITHESE_BLOCK_7.get(), ModBlocks.COMPRESSED_SLITHESE_BLOCK_8.get(), ModItems.SLITHESE_INGOT.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_SLITHESE_BLOCK_8.get(), ModBlocks.COMPRESSED_SLITHESE_BLOCK_9.get(), ModItems.SLITHESE_INGOT.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_SLITHESE_BLOCK_1.get(), ModBlocks.SLITHESE_BLOCK.get(), ModItems.SLITHESE_INGOT.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_SLITHESE_BLOCK_2.get(), ModBlocks.COMPRESSED_SLITHESE_BLOCK_1.get(), ModItems.SLITHESE_INGOT.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_SLITHESE_BLOCK_3.get(), ModBlocks.COMPRESSED_SLITHESE_BLOCK_2.get(), ModItems.SLITHESE_INGOT.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_SLITHESE_BLOCK_4.get(), ModBlocks.COMPRESSED_SLITHESE_BLOCK_3.get(), ModItems.SLITHESE_INGOT.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_SLITHESE_BLOCK_5.get(), ModBlocks.COMPRESSED_SLITHESE_BLOCK_4.get(), ModItems.SLITHESE_INGOT.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_SLITHESE_BLOCK_6.get(), ModBlocks.COMPRESSED_SLITHESE_BLOCK_5.get(), ModItems.SLITHESE_INGOT.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_SLITHESE_BLOCK_7.get(), ModBlocks.COMPRESSED_SLITHESE_BLOCK_6.get(), ModItems.SLITHESE_INGOT.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_SLITHESE_BLOCK_8.get(), ModBlocks.COMPRESSED_SLITHESE_BLOCK_7.get(), ModItems.SLITHESE_INGOT.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_SLITHESE_BLOCK_9.get(), ModBlocks.COMPRESSED_SLITHESE_BLOCK_8.get(), ModItems.SLITHESE_INGOT.get());
        toolRecipe(consumer, "Axe", ModItems.SLITHESE_AXE.get(), ModItems.SLITHESE_INGOT.get());
        toolRecipe(consumer, "Hoe", ModItems.SLITHESE_HOE.get(), ModItems.SLITHESE_INGOT.get());
        toolRecipe(consumer, "Pickaxe", ModItems.SLITHESE_PICKAXE.get(), ModItems.SLITHESE_INGOT.get());
        toolRecipe(consumer, "Shovel", ModItems.SLITHESE_SHOVEL.get(), ModItems.SLITHESE_INGOT.get());
        toolRecipe(consumer, "Sword", ModItems.SLITHESE_SWORD.get(), ModItems.SLITHESE_INGOT.get());
        toolRecipe(consumer, "Helmet", ModItems.SLITHESE_HELMET.get(), ModItems.SLITHESE_INGOT.get());
        toolRecipe(consumer, "Chestplate", ModItems.SLITHESE_CHESTPLATE.get(), ModItems.SLITHESE_INGOT.get());
        toolRecipe(consumer, "Leggings", ModItems.SLITHESE_LEGGINGS.get(), ModItems.SLITHESE_INGOT.get());
        toolRecipe(consumer, "Boots", ModItems.SLITHESE_BOOTS.get(), ModItems.SLITHESE_INGOT.get());

        // TARMENIS COOKING
        oreSmelting(consumer, ModItems.TARMENIS_INGOT.get(), ModItems.RAW_TARMENIS.get(), 0.7F, 200);
        oreSmelting(consumer, ModItems.TARMENIS_NUGGET.get(), ModItems.RAW_TARMENIS_PIECE.get(), 0.1F, 200);
        oreSmelting(consumer, ModItems.TARMENIS_INGOT.get(), ModBlocks.TARMENIS_ORE.get(), 0.7F, 200);
        oreSmelting(consumer, ModItems.TARMENIS_INGOT.get(), ModBlocks.DEEPSLATE_TARMENIS_ORE.get(), 0.7F, 200);
        oreSmelting(consumer, ModItems.TARMENIS_INGOT.get(), ModBlocks.NETHERRACK_TARMENIS_ORE.get(), 0.7F, 200);
        oreSmelting(consumer, ModItems.TARMENIS_INGOT.get(), ModBlocks.ENDSTONE_TARMENIS_ORE.get(), 0.7F, 200);
        // JSON // oreSmelting(consumer, 3, ModItems.TARMENIS_NUGGET.get(), ModBlocks.POOR_TARMENIS_ORE.get(), 0.4F, 200);
        // JSON // oreSmelting(consumer, 3, ModItems.TARMENIS_NUGGET.get(), ModBlocks.POOR_DEEPSLATE_TARMENIS_ORE.get(), 0.4F, 200);
        // JSON // oreSmelting(consumer, 3, ModItems.TARMENIS_NUGGET.get(), ModBlocks.POOR_NETHERRACK_TARMENIS_ORE.get(), 0.4F, 200);
        // JSON // oreSmelting(consumer, 3, ModItems.TARMENIS_NUGGET.get(), ModBlocks.POOR_ENDSTONE_TARMENIS_ORE.get(), 0.4F, 200);
        // JSON // oreSmelting(consumer, 3, ModItems.TARMENIS_INGOT.get(), ModBlocks.RICH_TARMENIS_ORE.get(), 1.1F, 200);
        // JSON // oreSmelting(consumer, 3, ModItems.TARMENIS_INGOT.get(), ModBlocks.RICH_DEEPSLATE_TARMENIS_ORE.get(), 1.1F, 200);
        // JSON // oreSmelting(consumer, 3, ModItems.TARMENIS_INGOT.get(), ModBlocks.RICH_NETHERRACK_TARMENIS_ORE.get(), 1.1F, 200);
        // JSON // oreSmelting(consumer, 3, ModItems.TARMENIS_INGOT.get(), ModBlocks.RICH_ENDSTONE_TARMENIS_ORE.get(), 1.1F, 200);

        // TARMENIS RAW ORE ITEMS
        oneFromNinePacking(consumer, ModItems.RAW_TARMENIS.get(), ModItems.RAW_TARMENIS_PIECE.get(), ModItems.RAW_TARMENIS.get());
        nineFromOneUnpacking(consumer, ModItems.RAW_TARMENIS_PIECE.get(), ModItems.RAW_TARMENIS.get(), ModItems.RAW_TARMENIS.get());
        oneFromNinePacking(consumer, ModBlocks.RAW_TARMENIS_BLOCK.get(), ModItems.RAW_TARMENIS.get(), ModItems.RAW_TARMENIS.get());
        nineFromOneUnpacking(consumer, ModItems.RAW_TARMENIS.get(), ModBlocks.RAW_TARMENIS_BLOCK.get(), ModItems.RAW_TARMENIS.get());
        nineFromOneUnpacking(consumer, ModBlocks.RAW_TARMENIS_BLOCK.get(), ModBlocks.COMPRESSED_RAW_TARMENIS_BLOCK_1.get(), ModItems.RAW_TARMENIS.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_RAW_TARMENIS_BLOCK_1.get(), ModBlocks.COMPRESSED_RAW_TARMENIS_BLOCK_2.get(), ModItems.RAW_TARMENIS.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_RAW_TARMENIS_BLOCK_2.get(), ModBlocks.COMPRESSED_RAW_TARMENIS_BLOCK_3.get(), ModItems.RAW_TARMENIS.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_RAW_TARMENIS_BLOCK_3.get(), ModBlocks.COMPRESSED_RAW_TARMENIS_BLOCK_4.get(), ModItems.RAW_TARMENIS.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_RAW_TARMENIS_BLOCK_4.get(), ModBlocks.COMPRESSED_RAW_TARMENIS_BLOCK_5.get(), ModItems.RAW_TARMENIS.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_RAW_TARMENIS_BLOCK_5.get(), ModBlocks.COMPRESSED_RAW_TARMENIS_BLOCK_6.get(), ModItems.RAW_TARMENIS.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_RAW_TARMENIS_BLOCK_6.get(), ModBlocks.COMPRESSED_RAW_TARMENIS_BLOCK_7.get(), ModItems.RAW_TARMENIS.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_RAW_TARMENIS_BLOCK_7.get(), ModBlocks.COMPRESSED_RAW_TARMENIS_BLOCK_8.get(), ModItems.RAW_TARMENIS.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_RAW_TARMENIS_BLOCK_8.get(), ModBlocks.COMPRESSED_RAW_TARMENIS_BLOCK_9.get(), ModItems.RAW_TARMENIS.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_RAW_TARMENIS_BLOCK_1.get(), ModBlocks.RAW_TARMENIS_BLOCK.get(), ModItems.RAW_TARMENIS.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_RAW_TARMENIS_BLOCK_2.get(), ModBlocks.COMPRESSED_RAW_TARMENIS_BLOCK_1.get(), ModItems.RAW_TARMENIS.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_RAW_TARMENIS_BLOCK_3.get(), ModBlocks.COMPRESSED_RAW_TARMENIS_BLOCK_2.get(), ModItems.RAW_TARMENIS.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_RAW_TARMENIS_BLOCK_4.get(), ModBlocks.COMPRESSED_RAW_TARMENIS_BLOCK_3.get(), ModItems.RAW_TARMENIS.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_RAW_TARMENIS_BLOCK_5.get(), ModBlocks.COMPRESSED_RAW_TARMENIS_BLOCK_4.get(), ModItems.RAW_TARMENIS.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_RAW_TARMENIS_BLOCK_6.get(), ModBlocks.COMPRESSED_RAW_TARMENIS_BLOCK_5.get(), ModItems.RAW_TARMENIS.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_RAW_TARMENIS_BLOCK_7.get(), ModBlocks.COMPRESSED_RAW_TARMENIS_BLOCK_6.get(), ModItems.RAW_TARMENIS.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_RAW_TARMENIS_BLOCK_8.get(), ModBlocks.COMPRESSED_RAW_TARMENIS_BLOCK_7.get(), ModItems.RAW_TARMENIS.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_RAW_TARMENIS_BLOCK_9.get(), ModBlocks.COMPRESSED_RAW_TARMENIS_BLOCK_8.get(), ModItems.RAW_TARMENIS.get());


        // TARMENIS ORE ITEMS
        oneFromNinePacking(consumer, ModItems.TARMENIS_INGOT.get(), ModItems.TARMENIS_NUGGET.get(), ModItems.TARMENIS_INGOT.get());
        nineFromOneUnpacking(consumer, ModItems.TARMENIS_NUGGET.get(), ModItems.TARMENIS_INGOT.get(), ModItems.TARMENIS_INGOT.get());
        oneFromNinePacking(consumer, ModBlocks.TARMENIS_BLOCK.get(), ModItems.TARMENIS_INGOT.get(), ModItems.TARMENIS_INGOT.get());
        nineFromOneUnpacking(consumer, ModItems.TARMENIS_INGOT.get(), ModBlocks.TARMENIS_BLOCK.get(), ModItems.TARMENIS_INGOT.get());
        nineFromOneUnpacking(consumer, ModBlocks.TARMENIS_BLOCK.get(), ModBlocks.COMPRESSED_TARMENIS_BLOCK_1.get(), ModItems.TARMENIS_INGOT.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_TARMENIS_BLOCK_1.get(), ModBlocks.COMPRESSED_TARMENIS_BLOCK_2.get(), ModItems.TARMENIS_INGOT.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_TARMENIS_BLOCK_2.get(), ModBlocks.COMPRESSED_TARMENIS_BLOCK_3.get(), ModItems.TARMENIS_INGOT.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_TARMENIS_BLOCK_3.get(), ModBlocks.COMPRESSED_TARMENIS_BLOCK_4.get(), ModItems.TARMENIS_INGOT.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_TARMENIS_BLOCK_4.get(), ModBlocks.COMPRESSED_TARMENIS_BLOCK_5.get(), ModItems.TARMENIS_INGOT.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_TARMENIS_BLOCK_5.get(), ModBlocks.COMPRESSED_TARMENIS_BLOCK_6.get(), ModItems.TARMENIS_INGOT.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_TARMENIS_BLOCK_6.get(), ModBlocks.COMPRESSED_TARMENIS_BLOCK_7.get(), ModItems.TARMENIS_INGOT.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_TARMENIS_BLOCK_7.get(), ModBlocks.COMPRESSED_TARMENIS_BLOCK_8.get(), ModItems.TARMENIS_INGOT.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_TARMENIS_BLOCK_8.get(), ModBlocks.COMPRESSED_TARMENIS_BLOCK_9.get(), ModItems.TARMENIS_INGOT.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_TARMENIS_BLOCK_1.get(), ModBlocks.TARMENIS_BLOCK.get(), ModItems.TARMENIS_INGOT.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_TARMENIS_BLOCK_2.get(), ModBlocks.COMPRESSED_TARMENIS_BLOCK_1.get(), ModItems.TARMENIS_INGOT.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_TARMENIS_BLOCK_3.get(), ModBlocks.COMPRESSED_TARMENIS_BLOCK_2.get(), ModItems.TARMENIS_INGOT.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_TARMENIS_BLOCK_4.get(), ModBlocks.COMPRESSED_TARMENIS_BLOCK_3.get(), ModItems.TARMENIS_INGOT.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_TARMENIS_BLOCK_5.get(), ModBlocks.COMPRESSED_TARMENIS_BLOCK_4.get(), ModItems.TARMENIS_INGOT.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_TARMENIS_BLOCK_6.get(), ModBlocks.COMPRESSED_TARMENIS_BLOCK_5.get(), ModItems.TARMENIS_INGOT.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_TARMENIS_BLOCK_7.get(), ModBlocks.COMPRESSED_TARMENIS_BLOCK_6.get(), ModItems.TARMENIS_INGOT.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_TARMENIS_BLOCK_8.get(), ModBlocks.COMPRESSED_TARMENIS_BLOCK_7.get(), ModItems.TARMENIS_INGOT.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_TARMENIS_BLOCK_9.get(), ModBlocks.COMPRESSED_TARMENIS_BLOCK_8.get(), ModItems.TARMENIS_INGOT.get());
        toolRecipe(consumer, "Axe", ModItems.TARMENIS_AXE.get(), ModItems.TARMENIS_INGOT.get());
        toolRecipe(consumer, "Hoe", ModItems.TARMENIS_HOE.get(), ModItems.TARMENIS_INGOT.get());
        toolRecipe(consumer, "Pickaxe", ModItems.TARMENIS_PICKAXE.get(), ModItems.TARMENIS_INGOT.get());
        toolRecipe(consumer, "Shovel", ModItems.TARMENIS_SHOVEL.get(), ModItems.TARMENIS_INGOT.get());
        toolRecipe(consumer, "Sword", ModItems.TARMENIS_SWORD.get(), ModItems.TARMENIS_INGOT.get());
        toolRecipe(consumer, "Helmet", ModItems.TARMENIS_HELMET.get(), ModItems.TARMENIS_INGOT.get());
        toolRecipe(consumer, "Chestplate", ModItems.TARMENIS_CHESTPLATE.get(), ModItems.TARMENIS_INGOT.get());
        toolRecipe(consumer, "Leggings", ModItems.TARMENIS_LEGGINGS.get(), ModItems.TARMENIS_INGOT.get());
        toolRecipe(consumer, "Boots", ModItems.TARMENIS_BOOTS.get(), ModItems.TARMENIS_INGOT.get());

        // VIGNASS COOKING
        oreSmelting(consumer, ModItems.VIGNASS_INGOT.get(), ModItems.RAW_VIGNASS.get(), 0.7F, 200);
        oreSmelting(consumer, ModItems.VIGNASS_NUGGET.get(), ModItems.RAW_VIGNASS_PIECE.get(), 0.1F, 200);
        oreSmelting(consumer, ModItems.VIGNASS_INGOT.get(), ModBlocks.VIGNASS_ORE.get(), 0.7F, 200);
        oreSmelting(consumer, ModItems.VIGNASS_INGOT.get(), ModBlocks.DEEPSLATE_VIGNASS_ORE.get(), 0.7F, 200);
        oreSmelting(consumer, ModItems.VIGNASS_INGOT.get(), ModBlocks.NETHERRACK_VIGNASS_ORE.get(), 0.7F, 200);
        oreSmelting(consumer, ModItems.VIGNASS_INGOT.get(), ModBlocks.ENDSTONE_VIGNASS_ORE.get(), 0.7F, 200);
        // JSON // oreSmelting(consumer, 3, ModItems.VIGNASS_NUGGET.get(), ModBlocks.POOR_VIGNASS_ORE.get(), 0.4F, 200);
        // JSON // oreSmelting(consumer, 3, ModItems.VIGNASS_NUGGET.get(), ModBlocks.POOR_DEEPSLATE_VIGNASS_ORE.get(), 0.4F, 200);
        // JSON // oreSmelting(consumer, 3, ModItems.VIGNASS_NUGGET.get(), ModBlocks.POOR_NETHERRACK_VIGNASS_ORE.get(), 0.4F, 200);
        // JSON // oreSmelting(consumer, 3, ModItems.VIGNASS_NUGGET.get(), ModBlocks.POOR_ENDSTONE_VIGNASS_ORE.get(), 0.4F, 200);
        // JSON // oreSmelting(consumer, 3, ModItems.VIGNASS_INGOT.get(), ModBlocks.RICH_VIGNASS_ORE.get(), 1.1F, 200);
        // JSON // oreSmelting(consumer, 3, ModItems.VIGNASS_INGOT.get(), ModBlocks.RICH_DEEPSLATE_VIGNASS_ORE.get(), 1.1F, 200);
        // JSON // oreSmelting(consumer, 3, ModItems.VIGNASS_INGOT.get(), ModBlocks.RICH_NETHERRACK_VIGNASS_ORE.get(), 1.1F, 200);
        // JSON // oreSmelting(consumer, 3, ModItems.VIGNASS_INGOT.get(), ModBlocks.RICH_ENDSTONE_VIGNASS_ORE.get(), 1.1F, 200);

        // VIGNASS RAW ORE ITEMS
        oneFromNinePacking(consumer, ModItems.RAW_VIGNASS.get(), ModItems.RAW_VIGNASS_PIECE.get(), ModItems.RAW_VIGNASS.get());
        nineFromOneUnpacking(consumer, ModItems.RAW_VIGNASS_PIECE.get(), ModItems.RAW_VIGNASS.get(), ModItems.RAW_VIGNASS.get());
        oneFromNinePacking(consumer, ModBlocks.RAW_VIGNASS_BLOCK.get(), ModItems.RAW_VIGNASS.get(), ModItems.RAW_VIGNASS.get());
        nineFromOneUnpacking(consumer, ModItems.RAW_VIGNASS.get(), ModBlocks.RAW_VIGNASS_BLOCK.get(), ModItems.RAW_VIGNASS.get());
        nineFromOneUnpacking(consumer, ModBlocks.RAW_VIGNASS_BLOCK.get(), ModBlocks.COMPRESSED_RAW_VIGNASS_BLOCK_1.get(), ModItems.RAW_VIGNASS.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_RAW_VIGNASS_BLOCK_1.get(), ModBlocks.COMPRESSED_RAW_VIGNASS_BLOCK_2.get(), ModItems.RAW_VIGNASS.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_RAW_VIGNASS_BLOCK_2.get(), ModBlocks.COMPRESSED_RAW_VIGNASS_BLOCK_3.get(), ModItems.RAW_VIGNASS.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_RAW_VIGNASS_BLOCK_3.get(), ModBlocks.COMPRESSED_RAW_VIGNASS_BLOCK_4.get(), ModItems.RAW_VIGNASS.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_RAW_VIGNASS_BLOCK_4.get(), ModBlocks.COMPRESSED_RAW_VIGNASS_BLOCK_5.get(), ModItems.RAW_VIGNASS.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_RAW_VIGNASS_BLOCK_5.get(), ModBlocks.COMPRESSED_RAW_VIGNASS_BLOCK_6.get(), ModItems.RAW_VIGNASS.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_RAW_VIGNASS_BLOCK_6.get(), ModBlocks.COMPRESSED_RAW_VIGNASS_BLOCK_7.get(), ModItems.RAW_VIGNASS.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_RAW_VIGNASS_BLOCK_7.get(), ModBlocks.COMPRESSED_RAW_VIGNASS_BLOCK_8.get(), ModItems.RAW_VIGNASS.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_RAW_VIGNASS_BLOCK_8.get(), ModBlocks.COMPRESSED_RAW_VIGNASS_BLOCK_9.get(), ModItems.RAW_VIGNASS.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_RAW_VIGNASS_BLOCK_1.get(), ModBlocks.RAW_VIGNASS_BLOCK.get(), ModItems.RAW_VIGNASS.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_RAW_VIGNASS_BLOCK_2.get(), ModBlocks.COMPRESSED_RAW_VIGNASS_BLOCK_1.get(), ModItems.RAW_VIGNASS.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_RAW_VIGNASS_BLOCK_3.get(), ModBlocks.COMPRESSED_RAW_VIGNASS_BLOCK_2.get(), ModItems.RAW_VIGNASS.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_RAW_VIGNASS_BLOCK_4.get(), ModBlocks.COMPRESSED_RAW_VIGNASS_BLOCK_3.get(), ModItems.RAW_VIGNASS.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_RAW_VIGNASS_BLOCK_5.get(), ModBlocks.COMPRESSED_RAW_VIGNASS_BLOCK_4.get(), ModItems.RAW_VIGNASS.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_RAW_VIGNASS_BLOCK_6.get(), ModBlocks.COMPRESSED_RAW_VIGNASS_BLOCK_5.get(), ModItems.RAW_VIGNASS.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_RAW_VIGNASS_BLOCK_7.get(), ModBlocks.COMPRESSED_RAW_VIGNASS_BLOCK_6.get(), ModItems.RAW_VIGNASS.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_RAW_VIGNASS_BLOCK_8.get(), ModBlocks.COMPRESSED_RAW_VIGNASS_BLOCK_7.get(), ModItems.RAW_VIGNASS.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_RAW_VIGNASS_BLOCK_9.get(), ModBlocks.COMPRESSED_RAW_VIGNASS_BLOCK_8.get(), ModItems.RAW_VIGNASS.get());

        // VIGNASS ORE ITEMS
        oneFromNinePacking(consumer, ModItems.VIGNASS_INGOT.get(), ModItems.VIGNASS_NUGGET.get(), ModItems.VIGNASS_INGOT.get());
        nineFromOneUnpacking(consumer, ModItems.VIGNASS_NUGGET.get(), ModItems.VIGNASS_INGOT.get(), ModItems.VIGNASS_INGOT.get());
        oneFromNinePacking(consumer, ModBlocks.VIGNASS_BLOCK.get(), ModItems.VIGNASS_INGOT.get(), ModItems.VIGNASS_INGOT.get());
        nineFromOneUnpacking(consumer, ModItems.VIGNASS_INGOT.get(), ModBlocks.VIGNASS_BLOCK.get(), ModItems.VIGNASS_INGOT.get());
        nineFromOneUnpacking(consumer, ModBlocks.VIGNASS_BLOCK.get(), ModBlocks.COMPRESSED_VIGNASS_BLOCK_1.get(), ModItems.VIGNASS_INGOT.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_VIGNASS_BLOCK_1.get(), ModBlocks.COMPRESSED_VIGNASS_BLOCK_2.get(), ModItems.VIGNASS_INGOT.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_VIGNASS_BLOCK_2.get(), ModBlocks.COMPRESSED_VIGNASS_BLOCK_3.get(), ModItems.VIGNASS_INGOT.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_VIGNASS_BLOCK_3.get(), ModBlocks.COMPRESSED_VIGNASS_BLOCK_4.get(), ModItems.VIGNASS_INGOT.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_VIGNASS_BLOCK_4.get(), ModBlocks.COMPRESSED_VIGNASS_BLOCK_5.get(), ModItems.VIGNASS_INGOT.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_VIGNASS_BLOCK_5.get(), ModBlocks.COMPRESSED_VIGNASS_BLOCK_6.get(), ModItems.VIGNASS_INGOT.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_VIGNASS_BLOCK_6.get(), ModBlocks.COMPRESSED_VIGNASS_BLOCK_7.get(), ModItems.VIGNASS_INGOT.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_VIGNASS_BLOCK_7.get(), ModBlocks.COMPRESSED_VIGNASS_BLOCK_8.get(), ModItems.VIGNASS_INGOT.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_VIGNASS_BLOCK_8.get(), ModBlocks.COMPRESSED_VIGNASS_BLOCK_9.get(), ModItems.VIGNASS_INGOT.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_VIGNASS_BLOCK_1.get(), ModBlocks.VIGNASS_BLOCK.get(), ModItems.VIGNASS_INGOT.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_VIGNASS_BLOCK_2.get(), ModBlocks.COMPRESSED_VIGNASS_BLOCK_1.get(), ModItems.VIGNASS_INGOT.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_VIGNASS_BLOCK_3.get(), ModBlocks.COMPRESSED_VIGNASS_BLOCK_2.get(), ModItems.VIGNASS_INGOT.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_VIGNASS_BLOCK_4.get(), ModBlocks.COMPRESSED_VIGNASS_BLOCK_3.get(), ModItems.VIGNASS_INGOT.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_VIGNASS_BLOCK_5.get(), ModBlocks.COMPRESSED_VIGNASS_BLOCK_4.get(), ModItems.VIGNASS_INGOT.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_VIGNASS_BLOCK_6.get(), ModBlocks.COMPRESSED_VIGNASS_BLOCK_5.get(), ModItems.VIGNASS_INGOT.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_VIGNASS_BLOCK_7.get(), ModBlocks.COMPRESSED_VIGNASS_BLOCK_6.get(), ModItems.VIGNASS_INGOT.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_VIGNASS_BLOCK_8.get(), ModBlocks.COMPRESSED_VIGNASS_BLOCK_7.get(), ModItems.VIGNASS_INGOT.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_VIGNASS_BLOCK_9.get(), ModBlocks.COMPRESSED_VIGNASS_BLOCK_8.get(), ModItems.VIGNASS_INGOT.get());
        toolRecipe(consumer, "Axe", ModItems.VIGNASS_AXE.get(), ModItems.VIGNASS_INGOT.get());
        toolRecipe(consumer, "Hoe", ModItems.VIGNASS_HOE.get(), ModItems.VIGNASS_INGOT.get());
        toolRecipe(consumer, "Pickaxe", ModItems.VIGNASS_PICKAXE.get(), ModItems.VIGNASS_INGOT.get());
        toolRecipe(consumer, "Shovel", ModItems.VIGNASS_SHOVEL.get(), ModItems.VIGNASS_INGOT.get());
        toolRecipe(consumer, "Sword", ModItems.VIGNASS_SWORD.get(), ModItems.VIGNASS_INGOT.get());
        toolRecipe(consumer, "Helmet", ModItems.VIGNASS_HELMET.get(), ModItems.VIGNASS_INGOT.get());
        toolRecipe(consumer, "Chestplate", ModItems.VIGNASS_CHESTPLATE.get(), ModItems.VIGNASS_INGOT.get());
        toolRecipe(consumer, "Leggings", ModItems.VIGNASS_LEGGINGS.get(), ModItems.VIGNASS_INGOT.get());
        toolRecipe(consumer, "Boots", ModItems.VIGNASS_BOOTS.get(), ModItems.VIGNASS_INGOT.get());

        // VOLUCIERA COOKING
        oreSmelting(consumer, ModItems.VOLUCIERA_INGOT.get(), ModItems.RAW_VOLUCIERA.get(), 0.7F, 200);
        oreSmelting(consumer, ModItems.VOLUCIERA_NUGGET.get(), ModItems.RAW_VOLUCIERA_PIECE.get(), 0.1F, 200);
        oreSmelting(consumer, ModItems.VOLUCIERA_INGOT.get(), ModBlocks.VOLUCIERA_ORE.get(), 0.7F, 200);
        oreSmelting(consumer, ModItems.VOLUCIERA_INGOT.get(), ModBlocks.DEEPSLATE_VOLUCIERA_ORE.get(), 0.7F, 200);
        oreSmelting(consumer, ModItems.VOLUCIERA_INGOT.get(), ModBlocks.NETHERRACK_VOLUCIERA_ORE.get(), 0.7F, 200);
        oreSmelting(consumer, ModItems.VOLUCIERA_INGOT.get(), ModBlocks.ENDSTONE_VOLUCIERA_ORE.get(), 0.7F, 200);
        // JSON // oreSmelting(consumer, 3, ModItems.VOLUCIERA_NUGGET.get(), ModBlocks.POOR_VOLUCIERA_ORE.get(), 0.4F, 200);
        // JSON // oreSmelting(consumer, 3, ModItems.VOLUCIERA_NUGGET.get(), ModBlocks.POOR_DEEPSLATE_VOLUCIERA_ORE.get(), 0.4F, 200);
        // JSON // oreSmelting(consumer, 3, ModItems.VOLUCIERA_NUGGET.get(), ModBlocks.POOR_NETHERRACK_VOLUCIERA_ORE.get(), 0.4F, 200);
        // JSON // oreSmelting(consumer, 3, ModItems.VOLUCIERA_NUGGET.get(), ModBlocks.POOR_ENDSTONE_VOLUCIERA_ORE.get(), 0.4F, 200);
        // JSON // oreSmelting(consumer, 3, ModItems.VOLUCIERA_INGOT.get(), ModBlocks.RICH_VOLUCIERA_ORE.get(), 1.1F, 200);
        // JSON // oreSmelting(consumer, 3, ModItems.VOLUCIERA_INGOT.get(), ModBlocks.RICH_DEEPSLATE_VOLUCIERA_ORE.get(), 1.1F, 200);
        // JSON // oreSmelting(consumer, 3, ModItems.VOLUCIERA_INGOT.get(), ModBlocks.RICH_NETHERRACK_VOLUCIERA_ORE.get(), 1.1F, 200);
        // JSON // oreSmelting(consumer, 3, ModItems.VOLUCIERA_INGOT.get(), ModBlocks.RICH_ENDSTONE_VOLUCIERA_ORE.get(), 1.1F, 200);

        // VOLUCIERA RAW ORE ITEMS
        oneFromNinePacking(consumer, ModItems.RAW_VOLUCIERA.get(), ModItems.RAW_VOLUCIERA_PIECE.get(), ModItems.RAW_VOLUCIERA.get());
        nineFromOneUnpacking(consumer, ModItems.RAW_VOLUCIERA_PIECE.get(), ModItems.RAW_VOLUCIERA.get(), ModItems.RAW_VOLUCIERA.get());
        oneFromNinePacking(consumer, ModBlocks.RAW_VOLUCIERA_BLOCK.get(), ModItems.RAW_VOLUCIERA.get(), ModItems.RAW_VOLUCIERA.get());
        nineFromOneUnpacking(consumer, ModItems.RAW_VOLUCIERA.get(), ModBlocks.RAW_VOLUCIERA_BLOCK.get(), ModItems.RAW_VOLUCIERA.get());
        nineFromOneUnpacking(consumer, ModBlocks.RAW_VOLUCIERA_BLOCK.get(), ModBlocks.COMPRESSED_RAW_VOLUCIERA_BLOCK_1.get(), ModItems.RAW_VOLUCIERA.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_RAW_VOLUCIERA_BLOCK_1.get(), ModBlocks.COMPRESSED_RAW_VOLUCIERA_BLOCK_2.get(), ModItems.RAW_VOLUCIERA.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_RAW_VOLUCIERA_BLOCK_2.get(), ModBlocks.COMPRESSED_RAW_VOLUCIERA_BLOCK_3.get(), ModItems.RAW_VOLUCIERA.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_RAW_VOLUCIERA_BLOCK_3.get(), ModBlocks.COMPRESSED_RAW_VOLUCIERA_BLOCK_4.get(), ModItems.RAW_VOLUCIERA.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_RAW_VOLUCIERA_BLOCK_4.get(), ModBlocks.COMPRESSED_RAW_VOLUCIERA_BLOCK_5.get(), ModItems.RAW_VOLUCIERA.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_RAW_VOLUCIERA_BLOCK_5.get(), ModBlocks.COMPRESSED_RAW_VOLUCIERA_BLOCK_6.get(), ModItems.RAW_VOLUCIERA.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_RAW_VOLUCIERA_BLOCK_6.get(), ModBlocks.COMPRESSED_RAW_VOLUCIERA_BLOCK_7.get(), ModItems.RAW_VOLUCIERA.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_RAW_VOLUCIERA_BLOCK_7.get(), ModBlocks.COMPRESSED_RAW_VOLUCIERA_BLOCK_8.get(), ModItems.RAW_VOLUCIERA.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_RAW_VOLUCIERA_BLOCK_8.get(), ModBlocks.COMPRESSED_RAW_VOLUCIERA_BLOCK_9.get(), ModItems.RAW_VOLUCIERA.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_RAW_VOLUCIERA_BLOCK_1.get(), ModBlocks.RAW_VOLUCIERA_BLOCK.get(), ModItems.RAW_VOLUCIERA.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_RAW_VOLUCIERA_BLOCK_2.get(), ModBlocks.COMPRESSED_RAW_VOLUCIERA_BLOCK_1.get(), ModItems.RAW_VOLUCIERA.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_RAW_VOLUCIERA_BLOCK_3.get(), ModBlocks.COMPRESSED_RAW_VOLUCIERA_BLOCK_2.get(), ModItems.RAW_VOLUCIERA.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_RAW_VOLUCIERA_BLOCK_4.get(), ModBlocks.COMPRESSED_RAW_VOLUCIERA_BLOCK_3.get(), ModItems.RAW_VOLUCIERA.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_RAW_VOLUCIERA_BLOCK_5.get(), ModBlocks.COMPRESSED_RAW_VOLUCIERA_BLOCK_4.get(), ModItems.RAW_VOLUCIERA.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_RAW_VOLUCIERA_BLOCK_6.get(), ModBlocks.COMPRESSED_RAW_VOLUCIERA_BLOCK_5.get(), ModItems.RAW_VOLUCIERA.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_RAW_VOLUCIERA_BLOCK_7.get(), ModBlocks.COMPRESSED_RAW_VOLUCIERA_BLOCK_6.get(), ModItems.RAW_VOLUCIERA.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_RAW_VOLUCIERA_BLOCK_8.get(), ModBlocks.COMPRESSED_RAW_VOLUCIERA_BLOCK_7.get(), ModItems.RAW_VOLUCIERA.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_RAW_VOLUCIERA_BLOCK_9.get(), ModBlocks.COMPRESSED_RAW_VOLUCIERA_BLOCK_8.get(), ModItems.RAW_VOLUCIERA.get());

        // VOLUCIERA ORE ITEMS
        oneFromNinePacking(consumer, ModItems.VOLUCIERA_INGOT.get(), ModItems.VOLUCIERA_NUGGET.get(), ModItems.VOLUCIERA_INGOT.get());
        nineFromOneUnpacking(consumer, ModItems.VOLUCIERA_NUGGET.get(), ModItems.VOLUCIERA_INGOT.get(), ModItems.VOLUCIERA_INGOT.get());
        oneFromNinePacking(consumer, ModBlocks.VOLUCIERA_BLOCK.get(), ModItems.VOLUCIERA_INGOT.get(), ModItems.VOLUCIERA_INGOT.get());
        nineFromOneUnpacking(consumer, ModItems.VOLUCIERA_INGOT.get(), ModBlocks.VOLUCIERA_BLOCK.get(), ModItems.VOLUCIERA_INGOT.get());
        nineFromOneUnpacking(consumer, ModBlocks.VOLUCIERA_BLOCK.get(), ModBlocks.COMPRESSED_VOLUCIERA_BLOCK_1.get(), ModItems.VOLUCIERA_INGOT.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_VOLUCIERA_BLOCK_1.get(), ModBlocks.COMPRESSED_VOLUCIERA_BLOCK_2.get(), ModItems.VOLUCIERA_INGOT.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_VOLUCIERA_BLOCK_2.get(), ModBlocks.COMPRESSED_VOLUCIERA_BLOCK_3.get(), ModItems.VOLUCIERA_INGOT.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_VOLUCIERA_BLOCK_3.get(), ModBlocks.COMPRESSED_VOLUCIERA_BLOCK_4.get(), ModItems.VOLUCIERA_INGOT.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_VOLUCIERA_BLOCK_4.get(), ModBlocks.COMPRESSED_VOLUCIERA_BLOCK_5.get(), ModItems.VOLUCIERA_INGOT.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_VOLUCIERA_BLOCK_5.get(), ModBlocks.COMPRESSED_VOLUCIERA_BLOCK_6.get(), ModItems.VOLUCIERA_INGOT.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_VOLUCIERA_BLOCK_6.get(), ModBlocks.COMPRESSED_VOLUCIERA_BLOCK_7.get(), ModItems.VOLUCIERA_INGOT.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_VOLUCIERA_BLOCK_7.get(), ModBlocks.COMPRESSED_VOLUCIERA_BLOCK_8.get(), ModItems.VOLUCIERA_INGOT.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_VOLUCIERA_BLOCK_8.get(), ModBlocks.COMPRESSED_VOLUCIERA_BLOCK_9.get(), ModItems.VOLUCIERA_INGOT.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_VOLUCIERA_BLOCK_1.get(), ModBlocks.VOLUCIERA_BLOCK.get(), ModItems.VOLUCIERA_INGOT.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_VOLUCIERA_BLOCK_2.get(), ModBlocks.COMPRESSED_VOLUCIERA_BLOCK_1.get(), ModItems.VOLUCIERA_INGOT.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_VOLUCIERA_BLOCK_3.get(), ModBlocks.COMPRESSED_VOLUCIERA_BLOCK_2.get(), ModItems.VOLUCIERA_INGOT.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_VOLUCIERA_BLOCK_4.get(), ModBlocks.COMPRESSED_VOLUCIERA_BLOCK_3.get(), ModItems.VOLUCIERA_INGOT.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_VOLUCIERA_BLOCK_5.get(), ModBlocks.COMPRESSED_VOLUCIERA_BLOCK_4.get(), ModItems.VOLUCIERA_INGOT.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_VOLUCIERA_BLOCK_6.get(), ModBlocks.COMPRESSED_VOLUCIERA_BLOCK_5.get(), ModItems.VOLUCIERA_INGOT.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_VOLUCIERA_BLOCK_7.get(), ModBlocks.COMPRESSED_VOLUCIERA_BLOCK_6.get(), ModItems.VOLUCIERA_INGOT.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_VOLUCIERA_BLOCK_8.get(), ModBlocks.COMPRESSED_VOLUCIERA_BLOCK_7.get(), ModItems.VOLUCIERA_INGOT.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_VOLUCIERA_BLOCK_9.get(), ModBlocks.COMPRESSED_VOLUCIERA_BLOCK_8.get(), ModItems.VOLUCIERA_INGOT.get());
        toolRecipe(consumer, "Axe", ModItems.VOLUCIERA_AXE.get(), ModItems.VOLUCIERA_INGOT.get());
        toolRecipe(consumer, "Hoe", ModItems.VOLUCIERA_HOE.get(), ModItems.VOLUCIERA_INGOT.get());
        toolRecipe(consumer, "Pickaxe", ModItems.VOLUCIERA_PICKAXE.get(), ModItems.VOLUCIERA_INGOT.get());
        toolRecipe(consumer, "Shovel", ModItems.VOLUCIERA_SHOVEL.get(), ModItems.VOLUCIERA_INGOT.get());
        toolRecipe(consumer, "Sword", ModItems.VOLUCIERA_SWORD.get(), ModItems.VOLUCIERA_INGOT.get());
        toolRecipe(consumer, "Helmet", ModItems.VOLUCIERA_HELMET.get(), ModItems.VOLUCIERA_INGOT.get());
        toolRecipe(consumer, "Chestplate", ModItems.VOLUCIERA_CHESTPLATE.get(), ModItems.VOLUCIERA_INGOT.get());
        toolRecipe(consumer, "Leggings", ModItems.VOLUCIERA_LEGGINGS.get(), ModItems.VOLUCIERA_INGOT.get());
        toolRecipe(consumer, "Boots", ModItems.VOLUCIERA_BOOTS.get(), ModItems.VOLUCIERA_INGOT.get());

        // YGGS COOKING
        oreSmelting(consumer, ModItems.YGGS_INGOT.get(), ModItems.RAW_YGGS.get(), 0.7F, 200);
        oreSmelting(consumer, ModItems.YGGS_NUGGET.get(), ModItems.RAW_YGGS_PIECE.get(), 0.1F, 200);
        oreSmelting(consumer, ModItems.YGGS_INGOT.get(), ModBlocks.YGGS_ORE.get(), 0.7F, 200);
        oreSmelting(consumer, ModItems.YGGS_INGOT.get(), ModBlocks.DEEPSLATE_YGGS_ORE.get(), 0.7F, 200);
        oreSmelting(consumer, ModItems.YGGS_INGOT.get(), ModBlocks.NETHERRACK_YGGS_ORE.get(), 0.7F, 200);
        oreSmelting(consumer, ModItems.YGGS_INGOT.get(), ModBlocks.ENDSTONE_YGGS_ORE.get(), 0.7F, 200);
        // JSON // oreSmelting(consumer, 3, ModItems.YGGS_NUGGET.get(), ModBlocks.POOR_YGGS_ORE.get(), 0.4F, 200);
        // JSON // oreSmelting(consumer, 3, ModItems.YGGS_NUGGET.get(), ModBlocks.POOR_DEEPSLATE_YGGS_ORE.get(), 0.4F, 200);
        // JSON // oreSmelting(consumer, 3, ModItems.YGGS_NUGGET.get(), ModBlocks.POOR_NETHERRACK_YGGS_ORE.get(), 0.4F, 200);
        // JSON // oreSmelting(consumer, 3, ModItems.YGGS_NUGGET.get(), ModBlocks.POOR_ENDSTONE_YGGS_ORE.get(), 0.4F, 200);
        // JSON // oreSmelting(consumer, 3, ModItems.YGGS_INGOT.get(), ModBlocks.RICH_YGGS_ORE.get(), 1.1F, 200);
        // JSON // oreSmelting(consumer, 3, ModItems.YGGS_INGOT.get(), ModBlocks.RICH_DEEPSLATE_YGGS_ORE.get(), 1.1F, 200);
        // JSON // oreSmelting(consumer, 3, ModItems.YGGS_INGOT.get(), ModBlocks.RICH_NETHERRACK_YGGS_ORE.get(), 1.1F, 200);
        // JSON // oreSmelting(consumer, 3, ModItems.YGGS_INGOT.get(), ModBlocks.RICH_ENDSTONE_YGGS_ORE.get(), 1.1F, 200);

        // YGGS RAW ORE ITEMS
        oneFromNinePacking(consumer, ModItems.RAW_YGGS.get(), ModItems.RAW_YGGS_PIECE.get(), ModItems.RAW_YGGS.get());
        nineFromOneUnpacking(consumer, ModItems.RAW_YGGS_PIECE.get(), ModItems.RAW_YGGS.get(), ModItems.RAW_YGGS.get());
        oneFromNinePacking(consumer, ModBlocks.RAW_YGGS_BLOCK.get(), ModItems.RAW_YGGS.get(), ModItems.RAW_YGGS.get());
        nineFromOneUnpacking(consumer, ModItems.RAW_YGGS.get(), ModBlocks.RAW_YGGS_BLOCK.get(), ModItems.RAW_YGGS.get());
        nineFromOneUnpacking(consumer, ModBlocks.RAW_YGGS_BLOCK.get(), ModBlocks.COMPRESSED_RAW_YGGS_BLOCK_1.get(), ModItems.RAW_YGGS.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_RAW_YGGS_BLOCK_1.get(), ModBlocks.COMPRESSED_RAW_YGGS_BLOCK_2.get(), ModItems.RAW_YGGS.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_RAW_YGGS_BLOCK_2.get(), ModBlocks.COMPRESSED_RAW_YGGS_BLOCK_3.get(), ModItems.RAW_YGGS.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_RAW_YGGS_BLOCK_3.get(), ModBlocks.COMPRESSED_RAW_YGGS_BLOCK_4.get(), ModItems.RAW_YGGS.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_RAW_YGGS_BLOCK_4.get(), ModBlocks.COMPRESSED_RAW_YGGS_BLOCK_5.get(), ModItems.RAW_YGGS.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_RAW_YGGS_BLOCK_5.get(), ModBlocks.COMPRESSED_RAW_YGGS_BLOCK_6.get(), ModItems.RAW_YGGS.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_RAW_YGGS_BLOCK_6.get(), ModBlocks.COMPRESSED_RAW_YGGS_BLOCK_7.get(), ModItems.RAW_YGGS.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_RAW_YGGS_BLOCK_7.get(), ModBlocks.COMPRESSED_RAW_YGGS_BLOCK_8.get(), ModItems.RAW_YGGS.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_RAW_YGGS_BLOCK_8.get(), ModBlocks.COMPRESSED_RAW_YGGS_BLOCK_9.get(), ModItems.RAW_YGGS.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_RAW_YGGS_BLOCK_1.get(), ModBlocks.RAW_YGGS_BLOCK.get(), ModItems.RAW_YGGS.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_RAW_YGGS_BLOCK_2.get(), ModBlocks.COMPRESSED_RAW_YGGS_BLOCK_1.get(), ModItems.RAW_YGGS.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_RAW_YGGS_BLOCK_3.get(), ModBlocks.COMPRESSED_RAW_YGGS_BLOCK_2.get(), ModItems.RAW_YGGS.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_RAW_YGGS_BLOCK_4.get(), ModBlocks.COMPRESSED_RAW_YGGS_BLOCK_3.get(), ModItems.RAW_YGGS.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_RAW_YGGS_BLOCK_5.get(), ModBlocks.COMPRESSED_RAW_YGGS_BLOCK_4.get(), ModItems.RAW_YGGS.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_RAW_YGGS_BLOCK_6.get(), ModBlocks.COMPRESSED_RAW_YGGS_BLOCK_5.get(), ModItems.RAW_YGGS.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_RAW_YGGS_BLOCK_7.get(), ModBlocks.COMPRESSED_RAW_YGGS_BLOCK_6.get(), ModItems.RAW_YGGS.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_RAW_YGGS_BLOCK_8.get(), ModBlocks.COMPRESSED_RAW_YGGS_BLOCK_7.get(), ModItems.RAW_YGGS.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_RAW_YGGS_BLOCK_9.get(), ModBlocks.COMPRESSED_RAW_YGGS_BLOCK_8.get(), ModItems.RAW_YGGS.get());

        // YGGS ORE ITEMS
        oneFromNinePacking(consumer, ModItems.YGGS_INGOT.get(), ModItems.YGGS_NUGGET.get(), ModItems.YGGS_INGOT.get());
        nineFromOneUnpacking(consumer, ModItems.YGGS_NUGGET.get(), ModItems.YGGS_INGOT.get(), ModItems.YGGS_INGOT.get());
        oneFromNinePacking(consumer, ModBlocks.YGGS_BLOCK.get(), ModItems.YGGS_INGOT.get(), ModItems.YGGS_INGOT.get());
        nineFromOneUnpacking(consumer, ModItems.YGGS_INGOT.get(), ModBlocks.YGGS_BLOCK.get(), ModItems.YGGS_INGOT.get());
        nineFromOneUnpacking(consumer, ModBlocks.YGGS_BLOCK.get(), ModBlocks.COMPRESSED_YGGS_BLOCK_1.get(), ModItems.YGGS_INGOT.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_YGGS_BLOCK_1.get(), ModBlocks.COMPRESSED_YGGS_BLOCK_2.get(), ModItems.YGGS_INGOT.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_YGGS_BLOCK_2.get(), ModBlocks.COMPRESSED_YGGS_BLOCK_3.get(), ModItems.YGGS_INGOT.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_YGGS_BLOCK_3.get(), ModBlocks.COMPRESSED_YGGS_BLOCK_4.get(), ModItems.YGGS_INGOT.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_YGGS_BLOCK_4.get(), ModBlocks.COMPRESSED_YGGS_BLOCK_5.get(), ModItems.YGGS_INGOT.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_YGGS_BLOCK_5.get(), ModBlocks.COMPRESSED_YGGS_BLOCK_6.get(), ModItems.YGGS_INGOT.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_YGGS_BLOCK_6.get(), ModBlocks.COMPRESSED_YGGS_BLOCK_7.get(), ModItems.YGGS_INGOT.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_YGGS_BLOCK_7.get(), ModBlocks.COMPRESSED_YGGS_BLOCK_8.get(), ModItems.YGGS_INGOT.get());
        nineFromOneUnpacking(consumer, ModBlocks.COMPRESSED_YGGS_BLOCK_8.get(), ModBlocks.COMPRESSED_YGGS_BLOCK_9.get(), ModItems.YGGS_INGOT.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_YGGS_BLOCK_1.get(), ModBlocks.YGGS_BLOCK.get(), ModItems.YGGS_INGOT.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_YGGS_BLOCK_2.get(), ModBlocks.COMPRESSED_YGGS_BLOCK_1.get(), ModItems.YGGS_INGOT.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_YGGS_BLOCK_3.get(), ModBlocks.COMPRESSED_YGGS_BLOCK_2.get(), ModItems.YGGS_INGOT.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_YGGS_BLOCK_4.get(), ModBlocks.COMPRESSED_YGGS_BLOCK_3.get(), ModItems.YGGS_INGOT.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_YGGS_BLOCK_5.get(), ModBlocks.COMPRESSED_YGGS_BLOCK_4.get(), ModItems.YGGS_INGOT.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_YGGS_BLOCK_6.get(), ModBlocks.COMPRESSED_YGGS_BLOCK_5.get(), ModItems.YGGS_INGOT.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_YGGS_BLOCK_7.get(), ModBlocks.COMPRESSED_YGGS_BLOCK_6.get(), ModItems.YGGS_INGOT.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_YGGS_BLOCK_8.get(), ModBlocks.COMPRESSED_YGGS_BLOCK_7.get(), ModItems.YGGS_INGOT.get());
        oneFromNinePacking(consumer, ModBlocks.COMPRESSED_YGGS_BLOCK_9.get(), ModBlocks.COMPRESSED_YGGS_BLOCK_8.get(), ModItems.YGGS_INGOT.get());
        toolRecipe(consumer, "Axe", ModItems.YGGS_AXE.get(), ModItems.YGGS_INGOT.get());
        toolRecipe(consumer, "Hoe", ModItems.YGGS_HOE.get(), ModItems.YGGS_INGOT.get());
        toolRecipe(consumer, "Pickaxe", ModItems.YGGS_PICKAXE.get(), ModItems.YGGS_INGOT.get());
        toolRecipe(consumer, "Shovel", ModItems.YGGS_SHOVEL.get(), ModItems.YGGS_INGOT.get());
        toolRecipe(consumer, "Sword", ModItems.YGGS_SWORD.get(), ModItems.YGGS_INGOT.get());
        toolRecipe(consumer, "Helmet", ModItems.YGGS_HELMET.get(), ModItems.YGGS_INGOT.get());
        toolRecipe(consumer, "Chestplate", ModItems.YGGS_CHESTPLATE.get(), ModItems.YGGS_INGOT.get());
        toolRecipe(consumer, "Leggings", ModItems.YGGS_LEGGINGS.get(), ModItems.YGGS_INGOT.get());
        toolRecipe(consumer, "Boots", ModItems.YGGS_BOOTS.get(), ModItems.YGGS_INGOT.get());
    }

    private void oneFromNinePacking(Consumer<FinishedRecipe> consumer, ItemLike packedItem, ItemLike toPackItem, ItemLike advancementItem) {
        ShapelessRecipeBuilder.shapeless(packedItem, 1)
                .requires(toPackItem, 9)
                .unlockedBy(getHasName(advancementItem), inventoryTrigger(ItemPredicate.Builder.item().of(advancementItem).build()))
                .save(consumer, TooManyResources.MOD_ID + ":" + getItemName(packedItem) + "_from_" + getItemName(toPackItem));
    }

    private void nineFromOneUnpacking(Consumer<FinishedRecipe> consumer, ItemLike unpackedItem,
                ItemLike toUnpackItem, ItemLike advancementItem) {

        ShapelessRecipeBuilder.shapeless(unpackedItem, 9)
                .requires(toUnpackItem, 1)
                .unlockedBy("has_" + getItemName(advancementItem),
                        inventoryTrigger(ItemPredicate.Builder.item().of(advancementItem).build()))
                .save(consumer, TooManyResources.MOD_ID + ":" + getItemName(unpackedItem) + "_from_" + getItemName(toUnpackItem));
    }

    private void toolRecipe(Consumer<FinishedRecipe> consumer, String itemType, ItemLike finishedTool, ItemLike material) {
        ShapedRecipeBuilder recipeBuilder = ShapedRecipeBuilder.shaped(finishedTool);

        switch(itemType) {
            case "Pickaxe":
                recipeBuilder.define('#', Items.STICK).define('X', material);
                recipeBuilder.pattern("XXX").pattern(" # ").pattern(" # ");
                break;
            case "Axe":
                recipeBuilder.define('#', Items.STICK).define('X', material);
                recipeBuilder.pattern("XX").pattern("X#").pattern(" #");
                break;
            case "Hoe":
                recipeBuilder.define('#', Items.STICK).define('X', material);
                recipeBuilder.pattern("XX").pattern(" #").pattern(" #");
                break;
            case "Shovel":
                recipeBuilder.define('#', Items.STICK).define('X', material);
                recipeBuilder.pattern("X").pattern("#").pattern("#");
                break;
            case "Sword":
                recipeBuilder.define('#', Items.STICK).define('X', material);
                recipeBuilder.pattern("X").pattern("X").pattern("#");
                break;
            case "Helmet":
                recipeBuilder.define('X', material);
                recipeBuilder.pattern("XXX").pattern("X X");
                break;
            case "Chestplate":
                recipeBuilder.define('X', material);
                recipeBuilder.pattern("X X").pattern("XXX").pattern("XXX");
                break;
            case "Leggings":
                recipeBuilder.define('X', material);
                recipeBuilder.pattern("XXX").pattern("X X").pattern("X X");
                break;
            case "Boots":
                recipeBuilder.define('X', material);
                recipeBuilder.pattern("X X").pattern("X X");
                break;
        }

        recipeBuilder.unlockedBy("has_" + getItemName(material),
                        inventoryTrigger(ItemPredicate.Builder.item().of(material).build()))
                .save(consumer);
    }

    private void oreSmelting(Consumer<FinishedRecipe> consumer, ItemLike result, ItemLike ingredient, float experience, int cookingTime) {
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ingredient), result, experience, cookingTime)
                .unlockedBy(getHasName(ingredient), inventoryTrigger(ItemPredicate.Builder.item().of(ingredient).build()))
                .save(consumer, TooManyResources.MOD_ID + ":" + getSmeltingRecipeName(result) + "_" + getItemName(ingredient));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ingredient), result, experience, cookingTime / 2)
                .unlockedBy(getHasName(ingredient), inventoryTrigger(ItemPredicate.Builder.item().of(ingredient).build()))
                .save(consumer, TooManyResources.MOD_ID + ":" + getBlastingRecipeName(result) + "_" + getItemName(ingredient));
    }
}
