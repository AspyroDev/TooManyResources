package dev.aspyro.toomanyresources.block;

import dev.aspyro.toomanyresources.TooManyResources;
import dev.aspyro.toomanyresources.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, TooManyResources.MOD_ID);

    // MANXIUM BLOCKS
    public static final RegistryObject<Block> MANXIUM_BLOCK = registerBlock("manxium_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_MANXIUM_BLOCK_1 = registerBlock("compressed_manxium_block_1", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_MANXIUM_BLOCK_2 = registerBlock("compressed_manxium_block_2", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_MANXIUM_BLOCK_3 = registerBlock("compressed_manxium_block_3", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_MANXIUM_BLOCK_4 = registerBlock("compressed_manxium_block_4", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_MANXIUM_BLOCK_5 = registerBlock("compressed_manxium_block_5", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_MANXIUM_BLOCK_6 = registerBlock("compressed_manxium_block_6", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_MANXIUM_BLOCK_7 = registerBlock("compressed_manxium_block_7", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_MANXIUM_BLOCK_8 = registerBlock("compressed_manxium_block_8", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_MANXIUM_BLOCK_9 = registerBlock("compressed_manxium_block_9", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);

    // KIRIONITE BLOCKS
    public static final RegistryObject<Block> KIRIONITE_BLOCK = registerBlock("kirionite_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_KIRIONITE_BLOCK_1 = registerBlock("compressed_kirionite_block_1", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_KIRIONITE_BLOCK_2 = registerBlock("compressed_kirionite_block_2", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_KIRIONITE_BLOCK_3 = registerBlock("compressed_kirionite_block_3", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_KIRIONITE_BLOCK_4 = registerBlock("compressed_kirionite_block_4", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_KIRIONITE_BLOCK_5 = registerBlock("compressed_kirionite_block_5", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_KIRIONITE_BLOCK_6 = registerBlock("compressed_kirionite_block_6", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_KIRIONITE_BLOCK_7 = registerBlock("compressed_kirionite_block_7", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_KIRIONITE_BLOCK_8 = registerBlock("compressed_kirionite_block_8", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_KIRIONITE_BLOCK_9 = registerBlock("compressed_kirionite_block_9", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);

    // SLITHESE BLOCKS
    public static final RegistryObject<Block> SLITHESE_BLOCK = registerBlock("slithese_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_SLITHESE_BLOCK_1 = registerBlock("compressed_slithese_block_1", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_SLITHESE_BLOCK_2 = registerBlock("compressed_slithese_block_2", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_SLITHESE_BLOCK_3 = registerBlock("compressed_slithese_block_3", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_SLITHESE_BLOCK_4 = registerBlock("compressed_slithese_block_4", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_SLITHESE_BLOCK_5 = registerBlock("compressed_slithese_block_5", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_SLITHESE_BLOCK_6 = registerBlock("compressed_slithese_block_6", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_SLITHESE_BLOCK_7 = registerBlock("compressed_slithese_block_7", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_SLITHESE_BLOCK_8 = registerBlock("compressed_slithese_block_8", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_SLITHESE_BLOCK_9 = registerBlock("compressed_slithese_block_9", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);

    // VOLUCIERA BLOCKS
    public static final RegistryObject<Block> VOLUCIERA_BLOCK = registerBlock("voluciera_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_VOLUCIERA_BLOCK_1 = registerBlock("compressed_voluciera_block_1", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_VOLUCIERA_BLOCK_2 = registerBlock("compressed_voluciera_block_2", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_VOLUCIERA_BLOCK_3 = registerBlock("compressed_voluciera_block_3", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_VOLUCIERA_BLOCK_4 = registerBlock("compressed_voluciera_block_4", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_VOLUCIERA_BLOCK_5 = registerBlock("compressed_voluciera_block_5", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_VOLUCIERA_BLOCK_6 = registerBlock("compressed_voluciera_block_6", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_VOLUCIERA_BLOCK_7 = registerBlock("compressed_voluciera_block_7", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_VOLUCIERA_BLOCK_8 = registerBlock("compressed_voluciera_block_8", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_VOLUCIERA_BLOCK_9 = registerBlock("compressed_voluciera_block_9", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);

    // YGGS BLOCKS
    public static final RegistryObject<Block> YGGS_BLOCK = registerBlock("yggs_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_YGGS_BLOCK_1 = registerBlock("compressed_yggs_block_1", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_YGGS_BLOCK_2 = registerBlock("compressed_yggs_block_2", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_YGGS_BLOCK_3 = registerBlock("compressed_yggs_block_3", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_YGGS_BLOCK_4 = registerBlock("compressed_yggs_block_4", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_YGGS_BLOCK_5 = registerBlock("compressed_yggs_block_5", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_YGGS_BLOCK_6 = registerBlock("compressed_yggs_block_6", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_YGGS_BLOCK_7 = registerBlock("compressed_yggs_block_7", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_YGGS_BLOCK_8 = registerBlock("compressed_yggs_block_8", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_YGGS_BLOCK_9 = registerBlock("compressed_yggs_block_9", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);

    // OHLY BLOCKS
    public static final RegistryObject<Block> OHLY_BLOCK = registerBlock("ohly_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_OHLY_BLOCK_1 = registerBlock("compressed_ohly_block_1", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_OHLY_BLOCK_2 = registerBlock("compressed_ohly_block_2", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_OHLY_BLOCK_3 = registerBlock("compressed_ohly_block_3", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_OHLY_BLOCK_4 = registerBlock("compressed_ohly_block_4", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_OHLY_BLOCK_5 = registerBlock("compressed_ohly_block_5", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_OHLY_BLOCK_6 = registerBlock("compressed_ohly_block_6", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_OHLY_BLOCK_7 = registerBlock("compressed_ohly_block_7", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_OHLY_BLOCK_8 = registerBlock("compressed_ohly_block_8", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_OHLY_BLOCK_9 = registerBlock("compressed_ohly_block_9", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);

    // RAW MANXIUM BLOCKS
    public static final RegistryObject<Block> RAW_MANXIUM_BLOCK = registerBlock("raw_manxium_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(7f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_RAW_MANXIUM_BLOCK_1 = registerBlock("compressed_raw_manxium_block_1", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_RAW_MANXIUM_BLOCK_2 = registerBlock("compressed_raw_manxium_block_2", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_RAW_MANXIUM_BLOCK_3 = registerBlock("compressed_raw_manxium_block_3", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_RAW_MANXIUM_BLOCK_4 = registerBlock("compressed_raw_manxium_block_4", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_RAW_MANXIUM_BLOCK_5 = registerBlock("compressed_raw_manxium_block_5", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_RAW_MANXIUM_BLOCK_6 = registerBlock("compressed_raw_manxium_block_6", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_RAW_MANXIUM_BLOCK_7 = registerBlock("compressed_raw_manxium_block_7", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_RAW_MANXIUM_BLOCK_8 = registerBlock("compressed_raw_manxium_block_8", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_RAW_MANXIUM_BLOCK_9 = registerBlock("compressed_raw_manxium_block_9", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);

    // RAW KIRIONITE BLOCKS
    public static final RegistryObject<Block> RAW_KIRIONITE_BLOCK = registerBlock("raw_kirionite_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(7f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_RAW_KIRIONITE_BLOCK_1 = registerBlock("compressed_raw_kirionite_block_1", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_RAW_KIRIONITE_BLOCK_2 = registerBlock("compressed_raw_kirionite_block_2", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_RAW_KIRIONITE_BLOCK_3 = registerBlock("compressed_raw_kirionite_block_3", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_RAW_KIRIONITE_BLOCK_4 = registerBlock("compressed_raw_kirionite_block_4", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_RAW_KIRIONITE_BLOCK_5 = registerBlock("compressed_raw_kirionite_block_5", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_RAW_KIRIONITE_BLOCK_6 = registerBlock("compressed_raw_kirionite_block_6", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_RAW_KIRIONITE_BLOCK_7 = registerBlock("compressed_raw_kirionite_block_7", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_RAW_KIRIONITE_BLOCK_8 = registerBlock("compressed_raw_kirionite_block_8", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_RAW_KIRIONITE_BLOCK_9 = registerBlock("compressed_raw_kirionite_block_9", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);

    // RAW SLITHESE BLOCKS
    public static final RegistryObject<Block> RAW_SLITHESE_BLOCK = registerBlock("raw_slithese_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(7f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_RAW_SLITHESE_BLOCK_1 = registerBlock("compressed_raw_slithese_block_1", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_RAW_SLITHESE_BLOCK_2 = registerBlock("compressed_raw_slithese_block_2", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_RAW_SLITHESE_BLOCK_3 = registerBlock("compressed_raw_slithese_block_3", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_RAW_SLITHESE_BLOCK_4 = registerBlock("compressed_raw_slithese_block_4", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_RAW_SLITHESE_BLOCK_5 = registerBlock("compressed_raw_slithese_block_5", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_RAW_SLITHESE_BLOCK_6 = registerBlock("compressed_raw_slithese_block_6", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_RAW_SLITHESE_BLOCK_7 = registerBlock("compressed_raw_slithese_block_7", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_RAW_SLITHESE_BLOCK_8 = registerBlock("compressed_raw_slithese_block_8", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_RAW_SLITHESE_BLOCK_9 = registerBlock("compressed_raw_slithese_block_9", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);

    // RAW VOLUCIERA BLOCKS
    public static final RegistryObject<Block> RAW_VOLUCIERA_BLOCK = registerBlock("raw_voluciera_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(7f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_RAW_VOLUCIERA_BLOCK_1 = registerBlock("compressed_raw_voluciera_block_1", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_RAW_VOLUCIERA_BLOCK_2 = registerBlock("compressed_raw_voluciera_block_2", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_RAW_VOLUCIERA_BLOCK_3 = registerBlock("compressed_raw_voluciera_block_3", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_RAW_VOLUCIERA_BLOCK_4 = registerBlock("compressed_raw_voluciera_block_4", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_RAW_VOLUCIERA_BLOCK_5 = registerBlock("compressed_raw_voluciera_block_5", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_RAW_VOLUCIERA_BLOCK_6 = registerBlock("compressed_raw_voluciera_block_6", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_RAW_VOLUCIERA_BLOCK_7 = registerBlock("compressed_raw_voluciera_block_7", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_RAW_VOLUCIERA_BLOCK_8 = registerBlock("compressed_raw_voluciera_block_8", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_RAW_VOLUCIERA_BLOCK_9 = registerBlock("compressed_raw_voluciera_block_9", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);

    // RAW YGGS BLOCKS
    public static final RegistryObject<Block> RAW_YGGS_BLOCK = registerBlock("raw_yggs_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(7f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_RAW_YGGS_BLOCK_1 = registerBlock("compressed_raw_yggs_block_1", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_RAW_YGGS_BLOCK_2 = registerBlock("compressed_raw_yggs_block_2", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_RAW_YGGS_BLOCK_3 = registerBlock("compressed_raw_yggs_block_3", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_RAW_YGGS_BLOCK_4 = registerBlock("compressed_raw_yggs_block_4", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_RAW_YGGS_BLOCK_5 = registerBlock("compressed_raw_yggs_block_5", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_RAW_YGGS_BLOCK_6 = registerBlock("compressed_raw_yggs_block_6", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_RAW_YGGS_BLOCK_7 = registerBlock("compressed_raw_yggs_block_7", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_RAW_YGGS_BLOCK_8 = registerBlock("compressed_raw_yggs_block_8", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_RAW_YGGS_BLOCK_9 = registerBlock("compressed_raw_yggs_block_9", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);

    // RAW OHLY BLOCKS
    public static final RegistryObject<Block> RAW_OHLY_BLOCK = registerBlock("raw_ohly_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(7f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_RAW_OHLY_BLOCK_1 = registerBlock("compressed_raw_ohly_block_1", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_RAW_OHLY_BLOCK_2 = registerBlock("compressed_raw_ohly_block_2", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_RAW_OHLY_BLOCK_3 = registerBlock("compressed_raw_ohly_block_3", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_RAW_OHLY_BLOCK_4 = registerBlock("compressed_raw_ohly_block_4", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_RAW_OHLY_BLOCK_5 = registerBlock("compressed_raw_ohly_block_5", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_RAW_OHLY_BLOCK_6 = registerBlock("compressed_raw_ohly_block_6", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_RAW_OHLY_BLOCK_7 = registerBlock("compressed_raw_ohly_block_7", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_RAW_OHLY_BLOCK_8 = registerBlock("compressed_raw_ohly_block_8", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_RAW_OHLY_BLOCK_9 = registerBlock("compressed_raw_ohly_block_9", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);

    // MANXIUM ORES
    public static final RegistryObject<Block> POOR_MANXIUM_ORE = registerBlock("poor_manxium_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(5f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> MANXIUM_ORE = registerBlock("manxium_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(5f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> RICH_MANXIUM_ORE = registerBlock("rich_manxium_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(5f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);

    public static final RegistryObject<Block> POOR_DEEPSLATE_MANXIUM_ORE = registerBlock("poor_deepslate_manxium_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(7f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> DEEPSLATE_MANXIUM_ORE = registerBlock("deepslate_manxium_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(7f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> RICH_DEEPSLATE_MANXIUM_ORE = registerBlock("rich_deepslate_manxium_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(7f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);

    public static final RegistryObject<Block> POOR_NETHERRACK_MANXIUM_ORE = registerBlock("poor_netherrack_manxium_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(5f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> NETHERRACK_MANXIUM_ORE = registerBlock("netherrack_manxium_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(5f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> RICH_NETHERRACK_MANXIUM_ORE = registerBlock("rich_netherrack_manxium_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(5f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);

    public static final RegistryObject<Block> POOR_ENDSTONE_MANXIUM_ORE = registerBlock("poor_endstone_manxium_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(5f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> ENDSTONE_MANXIUM_ORE = registerBlock("endstone_manxium_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(5f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> RICH_ENDSTONE_MANXIUM_ORE = registerBlock("rich_endstone_manxium_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(5f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);

    // KIRIONITE ORES
    public static final RegistryObject<Block> POOR_KIRIONITE_ORE = registerBlock("poor_kirionite_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(5f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> KIRIONITE_ORE = registerBlock("kirionite_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(5f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> RICH_KIRIONITE_ORE = registerBlock("rich_kirionite_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(5f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);

    public static final RegistryObject<Block> POOR_DEEPSLATE_KIRIONITE_ORE = registerBlock("poor_deepslate_kirionite_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(7f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> DEEPSLATE_KIRIONITE_ORE = registerBlock("deepslate_kirionite_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(7f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> RICH_DEEPSLATE_KIRIONITE_ORE = registerBlock("rich_deepslate_kirionite_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(7f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);

    public static final RegistryObject<Block> POOR_NETHERRACK_KIRIONITE_ORE = registerBlock("poor_netherrack_kirionite_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(5f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> NETHERRACK_KIRIONITE_ORE = registerBlock("netherrack_kirionite_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(5f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> RICH_NETHERRACK_KIRIONITE_ORE = registerBlock("rich_netherrack_kirionite_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(5f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);

    public static final RegistryObject<Block> POOR_ENDSTONE_KIRIONITE_ORE = registerBlock("poor_endstone_kirionite_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(5f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> ENDSTONE_KIRIONITE_ORE = registerBlock("endstone_kirionite_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(5f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> RICH_ENDSTONE_KIRIONITE_ORE = registerBlock("rich_endstone_kirionite_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(5f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);

    // SLITHESE ORES
    public static final RegistryObject<Block> POOR_SLITHESE_ORE = registerBlock("poor_slithese_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(5f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> SLITHESE_ORE = registerBlock("slithese_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(5f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> RICH_SLITHESE_ORE = registerBlock("rich_slithese_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(5f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);

    public static final RegistryObject<Block> POOR_DEEPSLATE_SLITHESE_ORE = registerBlock("poor_deepslate_slithese_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(7f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> DEEPSLATE_SLITHESE_ORE = registerBlock("deepslate_slithese_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(7f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> RICH_DEEPSLATE_SLITHESE_ORE = registerBlock("rich_deepslate_slithese_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(7f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);

    public static final RegistryObject<Block> POOR_NETHERRACK_SLITHESE_ORE = registerBlock("poor_netherrack_slithese_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(5f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> NETHERRACK_SLITHESE_ORE = registerBlock("netherrack_slithese_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(5f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> RICH_NETHERRACK_SLITHESE_ORE = registerBlock("rich_netherrack_slithese_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(5f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);

    public static final RegistryObject<Block> POOR_ENDSTONE_SLITHESE_ORE = registerBlock("poor_endstone_slithese_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(5f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> ENDSTONE_SLITHESE_ORE = registerBlock("endstone_slithese_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(5f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> RICH_ENDSTONE_SLITHESE_ORE = registerBlock("rich_endstone_slithese_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(5f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);

    // VOLUCIERA ORES
    public static final RegistryObject<Block> POOR_VOLUCIERA_ORE = registerBlock("poor_voluciera_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(5f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> VOLUCIERA_ORE = registerBlock("voluciera_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(5f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> RICH_VOLUCIERA_ORE = registerBlock("rich_voluciera_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(5f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);

    public static final RegistryObject<Block> POOR_DEEPSLATE_VOLUCIERA_ORE = registerBlock("poor_deepslate_voluciera_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(7f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> DEEPSLATE_VOLUCIERA_ORE = registerBlock("deepslate_voluciera_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(7f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> RICH_DEEPSLATE_VOLUCIERA_ORE = registerBlock("rich_deepslate_voluciera_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(7f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);

    public static final RegistryObject<Block> POOR_NETHERRACK_VOLUCIERA_ORE = registerBlock("poor_netherrack_voluciera_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(5f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> NETHERRACK_VOLUCIERA_ORE = registerBlock("netherrack_voluciera_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(5f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> RICH_NETHERRACK_VOLUCIERA_ORE = registerBlock("rich_netherrack_voluciera_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(5f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);

    public static final RegistryObject<Block> POOR_ENDSTONE_VOLUCIERA_ORE = registerBlock("poor_endstone_voluciera_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(5f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> ENDSTONE_VOLUCIERA_ORE = registerBlock("endstone_voluciera_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(5f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> RICH_ENDSTONE_VOLUCIERA_ORE = registerBlock("rich_endstone_voluciera_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(5f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);

    // YGGS ORES
    public static final RegistryObject<Block> POOR_YGGS_ORE = registerBlock("poor_yggs_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(5f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> YGGS_ORE = registerBlock("yggs_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(5f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> RICH_YGGS_ORE = registerBlock("rich_yggs_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(5f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);

    public static final RegistryObject<Block> POOR_DEEPSLATE_YGGS_ORE = registerBlock("poor_deepslate_yggs_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(7f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> DEEPSLATE_YGGS_ORE = registerBlock("deepslate_yggs_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(7f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> RICH_DEEPSLATE_YGGS_ORE = registerBlock("rich_deepslate_yggs_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(7f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);

    public static final RegistryObject<Block> POOR_NETHERRACK_YGGS_ORE = registerBlock("poor_netherrack_yggs_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(5f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> NETHERRACK_YGGS_ORE = registerBlock("netherrack_yggs_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(5f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> RICH_NETHERRACK_YGGS_ORE = registerBlock("rich_netherrack_yggs_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(5f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);

    public static final RegistryObject<Block> POOR_ENDSTONE_YGGS_ORE = registerBlock("poor_endstone_yggs_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(5f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> ENDSTONE_YGGS_ORE = registerBlock("endstone_yggs_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(5f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> RICH_ENDSTONE_YGGS_ORE = registerBlock("rich_endstone_yggs_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(5f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);

    // OHLY ORES
    public static final RegistryObject<Block> POOR_OHLY_ORE = registerBlock("poor_ohly_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(5f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> OHLY_ORE = registerBlock("ohly_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(5f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> RICH_OHLY_ORE = registerBlock("rich_ohly_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(5f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);

    public static final RegistryObject<Block> POOR_DEEPSLATE_OHLY_ORE = registerBlock("poor_deepslate_ohly_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(7f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> DEEPSLATE_OHLY_ORE = registerBlock("deepslate_ohly_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(7f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> RICH_DEEPSLATE_OHLY_ORE = registerBlock("rich_deepslate_ohly_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(7f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);

    public static final RegistryObject<Block> POOR_NETHERRACK_OHLY_ORE = registerBlock("poor_netherrack_ohly_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(5f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> NETHERRACK_OHLY_ORE = registerBlock("netherrack_ohly_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(5f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> RICH_NETHERRACK_OHLY_ORE = registerBlock("rich_netherrack_ohly_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(5f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);

    public static final RegistryObject<Block> POOR_ENDSTONE_OHLY_ORE = registerBlock("poor_endstone_ohly_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(5f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> ENDSTONE_OHLY_ORE = registerBlock("endstone_ohly_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(5f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> RICH_ENDSTONE_OHLY_ORE = registerBlock("rich_endstone_ohly_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(5f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);

    private static <T extends Block> RegistryObject<T> registerBlock(
            String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(
            String name, RegistryObject<T> block, CreativeModeTab tab) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
