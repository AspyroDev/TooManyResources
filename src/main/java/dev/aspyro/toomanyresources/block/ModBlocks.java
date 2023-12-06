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
    public static final RegistryObject<Block> MANXIUM_BLOCK = registerBlock("blocks/manxium/manxium_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_MANXIUM_BLOCK_1 = registerBlock("blocks/manxium/compressed_manxium_block_1", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_MANXIUM_BLOCK_2 = registerBlock("blocks/manxium/compressed_manxium_block_2", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_MANXIUM_BLOCK_3 = registerBlock("blocks/manxium/compressed_manxium_block_3", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_MANXIUM_BLOCK_4 = registerBlock("blocks/manxium/compressed_manxium_block_4", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_MANXIUM_BLOCK_5 = registerBlock("blocks/manxium/compressed_manxium_block_5", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_MANXIUM_BLOCK_6 = registerBlock("blocks/manxium/compressed_manxium_block_6", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_MANXIUM_BLOCK_7 = registerBlock("blocks/manxium/compressed_manxium_block_7", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_MANXIUM_BLOCK_8 = registerBlock("blocks/manxium/compressed_manxium_block_8", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_MANXIUM_BLOCK_9 = registerBlock("blocks/manxium/compressed_manxium_block_9", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);

    // KIRIONITE BLOCKS
    public static final RegistryObject<Block> KIRIONITE_BLOCK = registerBlock("blocks/kirionite/kirionite_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_KIRIONITE_BLOCK_1 = registerBlock("blocks/kirionite/compressed_kirionite_block_1", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_KIRIONITE_BLOCK_2 = registerBlock("blocks/kirionite/compressed_kirionite_block_2", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_KIRIONITE_BLOCK_3 = registerBlock("blocks/kirionite/compressed_kirionite_block_3", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_KIRIONITE_BLOCK_4 = registerBlock("blocks/kirionite/compressed_kirionite_block_4", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_KIRIONITE_BLOCK_5 = registerBlock("blocks/kirionite/compressed_kirionite_block_5", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_KIRIONITE_BLOCK_6 = registerBlock("blocks/kirionite/compressed_kirionite_block_6", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_KIRIONITE_BLOCK_7 = registerBlock("blocks/kirionite/compressed_kirionite_block_7", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_KIRIONITE_BLOCK_8 = registerBlock("blocks/kirionite/compressed_kirionite_block_8", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_KIRIONITE_BLOCK_9 = registerBlock("blocks/kirionite/compressed_kirionite_block_9", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);

    // SLITHESE BLOCKS
    public static final RegistryObject<Block> SLITHESE_BLOCK = registerBlock("blocks/slithese/slithese_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_SLITHESE_BLOCK_1 = registerBlock("blocks/slithese/compressed_slithese_block_1", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_SLITHESE_BLOCK_2 = registerBlock("blocks/slithese/compressed_slithese_block_2", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_SLITHESE_BLOCK_3 = registerBlock("blocks/slithese/compressed_slithese_block_3", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_SLITHESE_BLOCK_4 = registerBlock("blocks/slithese/compressed_slithese_block_4", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_SLITHESE_BLOCK_5 = registerBlock("blocks/slithese/compressed_slithese_block_5", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_SLITHESE_BLOCK_6 = registerBlock("blocks/slithese/compressed_slithese_block_6", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_SLITHESE_BLOCK_7 = registerBlock("blocks/slithese/compressed_slithese_block_7", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_SLITHESE_BLOCK_8 = registerBlock("blocks/slithese/compressed_slithese_block_8", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_SLITHESE_BLOCK_9 = registerBlock("blocks/slithese/compressed_slithese_block_9", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);

    // VOLUCIERA BLOCKS
    public static final RegistryObject<Block> VOLUCIERA_BLOCK = registerBlock("blocks/voluciera/voluciera_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_VOLUCIERA_BLOCK_1 = registerBlock("blocks/voluciera/compressed_voluciera_block_1", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_VOLUCIERA_BLOCK_2 = registerBlock("blocks/voluciera/compressed_voluciera_block_2", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_VOLUCIERA_BLOCK_3 = registerBlock("blocks/voluciera/compressed_voluciera_block_3", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_VOLUCIERA_BLOCK_4 = registerBlock("blocks/voluciera/compressed_voluciera_block_4", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_VOLUCIERA_BLOCK_5 = registerBlock("blocks/voluciera/compressed_voluciera_block_5", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_VOLUCIERA_BLOCK_6 = registerBlock("blocks/voluciera/compressed_voluciera_block_6", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_VOLUCIERA_BLOCK_7 = registerBlock("blocks/voluciera/compressed_voluciera_block_7", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_VOLUCIERA_BLOCK_8 = registerBlock("blocks/voluciera/compressed_voluciera_block_8", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_VOLUCIERA_BLOCK_9 = registerBlock("blocks/voluciera/compressed_voluciera_block_9", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);

    // YGGS BLOCKS
    public static final RegistryObject<Block> YGGS_BLOCK = registerBlock("blocks/yggs/yggs_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_YGGS_BLOCK_1 = registerBlock("blocks/yggs/compressed_yggs_block_1", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_YGGS_BLOCK_2 = registerBlock("blocks/yggs/compressed_yggs_block_2", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_YGGS_BLOCK_3 = registerBlock("blocks/yggs/compressed_yggs_block_3", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_YGGS_BLOCK_4 = registerBlock("blocks/yggs/compressed_yggs_block_4", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_YGGS_BLOCK_5 = registerBlock("blocks/yggs/compressed_yggs_block_5", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_YGGS_BLOCK_6 = registerBlock("blocks/yggs/compressed_yggs_block_6", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_YGGS_BLOCK_7 = registerBlock("blocks/yggs/compressed_yggs_block_7", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_YGGS_BLOCK_8 = registerBlock("blocks/yggs/compressed_yggs_block_8", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_YGGS_BLOCK_9 = registerBlock("blocks/yggs/compressed_yggs_block_9", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);

    // OHLY BLOCKS
    public static final RegistryObject<Block> OHLY_BLOCK = registerBlock("blocks/ohly/ohly_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_OHLY_BLOCK_1 = registerBlock("blocks/ohly/compressed_ohly_block_1", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_OHLY_BLOCK_2 = registerBlock("blocks/ohly/compressed_ohly_block_2", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_OHLY_BLOCK_3 = registerBlock("blocks/ohly/compressed_ohly_block_3", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_OHLY_BLOCK_4 = registerBlock("blocks/ohly/compressed_ohly_block_4", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_OHLY_BLOCK_5 = registerBlock("blocks/ohly/compressed_ohly_block_5", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_OHLY_BLOCK_6 = registerBlock("blocks/ohly/compressed_ohly_block_6", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_OHLY_BLOCK_7 = registerBlock("blocks/ohly/compressed_ohly_block_7", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_OHLY_BLOCK_8 = registerBlock("blocks/ohly/compressed_ohly_block_8", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_OHLY_BLOCK_9 = registerBlock("blocks/ohly/compressed_ohly_block_9", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);

    // RAW MANXIUM BLOCKS
    public static final RegistryObject<Block> RAW_MANXIUM_BLOCK = registerBlock("raw_blocks/manxium/raw_manxium_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(7f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_RAW_MANXIUM_BLOCK_1 = registerBlock("raw_blocks/manxium/compressed_raw_manxium_block_1", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_RAW_MANXIUM_BLOCK_2 = registerBlock("raw_blocks/manxium/compressed_raw_manxium_block_2", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_RAW_MANXIUM_BLOCK_3 = registerBlock("raw_blocks/manxium/compressed_raw_manxium_block_3", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_RAW_MANXIUM_BLOCK_4 = registerBlock("raw_blocks/manxium/compressed_raw_manxium_block_4", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_RAW_MANXIUM_BLOCK_5 = registerBlock("raw_blocks/manxium/compressed_raw_manxium_block_5", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_RAW_MANXIUM_BLOCK_6 = registerBlock("raw_blocks/manxium/compressed_raw_manxium_block_6", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_RAW_MANXIUM_BLOCK_7 = registerBlock("raw_blocks/manxium/compressed_raw_manxium_block_7", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_RAW_MANXIUM_BLOCK_8 = registerBlock("raw_blocks/manxium/compressed_raw_manxium_block_8", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_RAW_MANXIUM_BLOCK_9 = registerBlock("raw_blocks/manxium/compressed_raw_manxium_block_9", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);

    // RAW KIRIONITE BLOCKS
    public static final RegistryObject<Block> RAW_KIRIONITE_BLOCK = registerBlock("raw_blocks/kirionite/raw_kirionite_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(7f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_RAW_KIRIONITE_BLOCK_1 = registerBlock("raw_blocks/kirionite/compressed_raw_kirionite_block_1", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_RAW_KIRIONITE_BLOCK_2 = registerBlock("raw_blocks/kirionite/compressed_raw_kirionite_block_2", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_RAW_KIRIONITE_BLOCK_3 = registerBlock("raw_blocks/kirionite/compressed_raw_kirionite_block_3", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_RAW_KIRIONITE_BLOCK_4 = registerBlock("raw_blocks/kirionite/compressed_raw_kirionite_block_4", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_RAW_KIRIONITE_BLOCK_5 = registerBlock("raw_blocks/kirionite/compressed_raw_kirionite_block_5", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_RAW_KIRIONITE_BLOCK_6 = registerBlock("raw_blocks/kirionite/compressed_raw_kirionite_block_6", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_RAW_KIRIONITE_BLOCK_7 = registerBlock("raw_blocks/kirionite/compressed_raw_kirionite_block_7", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_RAW_KIRIONITE_BLOCK_8 = registerBlock("raw_blocks/kirionite/compressed_raw_kirionite_block_8", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_RAW_KIRIONITE_BLOCK_9 = registerBlock("raw_blocks/kirionite/compressed_raw_kirionite_block_9", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);

    // RAW SLITHESE BLOCKS
    public static final RegistryObject<Block> RAW_SLITHESE_BLOCK = registerBlock("raw_blocks/slithese/raw_slithese_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(7f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_RAW_SLITHESE_BLOCK_1 = registerBlock("raw_blocks/slithese/compressed_raw_slithese_block_1", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_RAW_SLITHESE_BLOCK_2 = registerBlock("raw_blocks/slithese/compressed_raw_slithese_block_2", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_RAW_SLITHESE_BLOCK_3 = registerBlock("raw_blocks/slithese/compressed_raw_slithese_block_3", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_RAW_SLITHESE_BLOCK_4 = registerBlock("raw_blocks/slithese/compressed_raw_slithese_block_4", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_RAW_SLITHESE_BLOCK_5 = registerBlock("raw_blocks/slithese/compressed_raw_slithese_block_5", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_RAW_SLITHESE_BLOCK_6 = registerBlock("raw_blocks/slithese/compressed_raw_slithese_block_6", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_RAW_SLITHESE_BLOCK_7 = registerBlock("raw_blocks/slithese/compressed_raw_slithese_block_7", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_RAW_SLITHESE_BLOCK_8 = registerBlock("raw_blocks/slithese/compressed_raw_slithese_block_8", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_RAW_SLITHESE_BLOCK_9 = registerBlock("raw_blocks/slithese/compressed_raw_slithese_block_9", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);

    // RAW VOLUCIERA BLOCKS
    public static final RegistryObject<Block> RAW_VOLUCIERA_BLOCK = registerBlock("raw_blocks/voluciera/raw_voluciera_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(7f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_RAW_VOLUCIERA_BLOCK_1 = registerBlock("raw_blocks/voluciera/compressed_raw_voluciera_block_1", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_RAW_VOLUCIERA_BLOCK_2 = registerBlock("raw_blocks/voluciera/compressed_raw_voluciera_block_2", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_RAW_VOLUCIERA_BLOCK_3 = registerBlock("raw_blocks/voluciera/compressed_raw_voluciera_block_3", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_RAW_VOLUCIERA_BLOCK_4 = registerBlock("raw_blocks/voluciera/compressed_raw_voluciera_block_4", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_RAW_VOLUCIERA_BLOCK_5 = registerBlock("raw_blocks/voluciera/compressed_raw_voluciera_block_5", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_RAW_VOLUCIERA_BLOCK_6 = registerBlock("raw_blocks/voluciera/compressed_raw_voluciera_block_6", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_RAW_VOLUCIERA_BLOCK_7 = registerBlock("raw_blocks/voluciera/compressed_raw_voluciera_block_7", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_RAW_VOLUCIERA_BLOCK_8 = registerBlock("raw_blocks/voluciera/compressed_raw_voluciera_block_8", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_RAW_VOLUCIERA_BLOCK_9 = registerBlock("raw_blocks/voluciera/compressed_raw_voluciera_block_9", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);

    // RAW YGGS BLOCKS
    public static final RegistryObject<Block> RAW_YGGS_BLOCK = registerBlock("raw_blocks/yggs/raw_yggs_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(7f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_RAW_YGGS_BLOCK_1 = registerBlock("raw_blocks/yggs/compressed_raw_yggs_block_1", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_RAW_YGGS_BLOCK_2 = registerBlock("raw_blocks/yggs/compressed_raw_yggs_block_2", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_RAW_YGGS_BLOCK_3 = registerBlock("raw_blocks/yggs/compressed_raw_yggs_block_3", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_RAW_YGGS_BLOCK_4 = registerBlock("raw_blocks/yggs/compressed_raw_yggs_block_4", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_RAW_YGGS_BLOCK_5 = registerBlock("raw_blocks/yggs/compressed_raw_yggs_block_5", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_RAW_YGGS_BLOCK_6 = registerBlock("raw_blocks/yggs/compressed_raw_yggs_block_6", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_RAW_YGGS_BLOCK_7 = registerBlock("raw_blocks/yggs/compressed_raw_yggs_block_7", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_RAW_YGGS_BLOCK_8 = registerBlock("raw_blocks/yggs/compressed_raw_yggs_block_8", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_RAW_YGGS_BLOCK_9 = registerBlock("raw_blocks/yggs/compressed_raw_yggs_block_9", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);

    // RAW OHLY BLOCKS
    public static final RegistryObject<Block> RAW_OHLY_BLOCK = registerBlock("raw_blocks/ohly/raw_ohly_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(7f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_RAW_OHLY_BLOCK_1 = registerBlock("raw_blocks/ohly/compressed_raw_ohly_block_1", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_RAW_OHLY_BLOCK_2 = registerBlock("raw_blocks/ohly/compressed_raw_ohly_block_2", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_RAW_OHLY_BLOCK_3 = registerBlock("raw_blocks/ohly/compressed_raw_ohly_block_3", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_RAW_OHLY_BLOCK_4 = registerBlock("raw_blocks/ohly/compressed_raw_ohly_block_4", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_RAW_OHLY_BLOCK_5 = registerBlock("raw_blocks/ohly/compressed_raw_ohly_block_5", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_RAW_OHLY_BLOCK_6 = registerBlock("raw_blocks/ohly/compressed_raw_ohly_block_6", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_RAW_OHLY_BLOCK_7 = registerBlock("raw_blocks/ohly/compressed_raw_ohly_block_7", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_RAW_OHLY_BLOCK_8 = registerBlock("raw_blocks/ohly/compressed_raw_ohly_block_8", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_RAW_OHLY_BLOCK_9 = registerBlock("raw_blocks/ohly/compressed_raw_ohly_block_9", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);

    // MANXIUM ORES
    public static final RegistryObject<Block> POOR_MANXIUM_ORE = registerBlock("ores/manxium/stone/poor_manxium_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(5f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> MANXIUM_ORE = registerBlock("ores/manxium/stone/manxium_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(5f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> RICH_MANXIUM_ORE = registerBlock("ores/manxium/stone/rich_manxium_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(5f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);

    public static final RegistryObject<Block> POOR_DEEPSLATE_MANXIUM_ORE = registerBlock("ores/manxium/deepslate/poor_deepslate_manxium_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(7f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> DEEPSLATE_MANXIUM_ORE = registerBlock("ores/manxium/deepslate/deepslate_manxium_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(7f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> RICH_DEEPSLATE_MANXIUM_ORE = registerBlock("ores/manxium/deepslate/rich_deepslate_manxium_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(7f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);

    public static final RegistryObject<Block> POOR_NETHERRACK_MANXIUM_ORE = registerBlock("ores/manxium/netherrack/poor_netherrack_manxium_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(5f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> NETHERRACK_MANXIUM_ORE = registerBlock("ores/manxium/netherrack/netherrack_manxium_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(5f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> RICH_NETHERRACK_MANXIUM_ORE = registerBlock("ores/manxium/netherrack/rich_netherrack_manxium_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(5f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);

    public static final RegistryObject<Block> POOR_ENDSTONE_MANXIUM_ORE = registerBlock("ores/manxium/endstone/poor_endstone_manxium_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(5f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> ENDSTONE_MANXIUM_ORE = registerBlock("ores/manxium/endstone/endstone_manxium_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(5f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> RICH_ENDSTONE_MANXIUM_ORE = registerBlock("ores/manxium/endstone/rich_endstone_manxium_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(5f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);

    // KIRIONITE ORES
    public static final RegistryObject<Block> POOR_KIRIONITE_ORE = registerBlock("ores/kirionite/stone/poor_kirionite_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(5f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> KIRIONITE_ORE = registerBlock("ores/kirionite/stone/kirionite_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(5f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> RICH_KIRIONITE_ORE = registerBlock("ores/kirionite/stone/rich_kirionite_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(5f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);

    public static final RegistryObject<Block> POOR_DEEPSLATE_KIRIONITE_ORE = registerBlock("ores/kirionite/deepslate/poor_deepslate_kirionite_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(7f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> DEEPSLATE_KIRIONITE_ORE = registerBlock("ores/kirionite/deepslate/deepslate_kirionite_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(7f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> RICH_DEEPSLATE_KIRIONITE_ORE = registerBlock("ores/kirionite/deepslate/rich_deepslate_kirionite_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(7f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);

    public static final RegistryObject<Block> POOR_NETHERRACK_KIRIONITE_ORE = registerBlock("ores/kirionite/netherrack/poor_netherrack_kirionite_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(5f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> NETHERRACK_KIRIONITE_ORE = registerBlock("ores/kirionite/netherrack/netherrack_kirionite_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(5f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> RICH_NETHERRACK_KIRIONITE_ORE = registerBlock("ores/kirionite/netherrack/rich_netherrack_kirionite_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(5f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);

    public static final RegistryObject<Block> POOR_ENDSTONE_KIRIONITE_ORE = registerBlock("ores/kirionite/endstone/poor_endstone_kirionite_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(5f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> ENDSTONE_KIRIONITE_ORE = registerBlock("ores/kirionite/endstone/endstone_kirionite_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(5f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> RICH_ENDSTONE_KIRIONITE_ORE = registerBlock("ores/kirionite/endstone/rich_endstone_kirionite_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(5f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);

    // SLITHESE ORES
    public static final RegistryObject<Block> POOR_SLITHESE_ORE = registerBlock("ores/slithese/stone/poor_slithese_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(5f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> SLITHESE_ORE = registerBlock("ores/slithese/stone/slithese_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(5f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> RICH_SLITHESE_ORE = registerBlock("ores/slithese/stone/rich_slithese_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(5f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);

    public static final RegistryObject<Block> POOR_DEEPSLATE_SLITHESE_ORE = registerBlock("ores/slithese/deepslate/poor_deepslate_slithese_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(7f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> DEEPSLATE_SLITHESE_ORE = registerBlock("ores/slithese/deepslate/deepslate_slithese_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(7f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> RICH_DEEPSLATE_SLITHESE_ORE = registerBlock("ores/slithese/deepslate/rich_deepslate_slithese_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(7f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);

    public static final RegistryObject<Block> POOR_NETHERRACK_SLITHESE_ORE = registerBlock("ores/slithese/netherrack/poor_netherrack_slithese_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(5f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> NETHERRACK_SLITHESE_ORE = registerBlock("ores/slithese/netherrack/netherrack_slithese_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(5f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> RICH_NETHERRACK_SLITHESE_ORE = registerBlock("ores/slithese/netherrack/rich_netherrack_slithese_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(5f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);

    public static final RegistryObject<Block> POOR_ENDSTONE_SLITHESE_ORE = registerBlock("ores/slithese/endstone/poor_endstone_slithese_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(5f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> ENDSTONE_SLITHESE_ORE = registerBlock("ores/slithese/endstone/endstone_slithese_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(5f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> RICH_ENDSTONE_SLITHESE_ORE = registerBlock("ores/slithese/endstone/rich_endstone_slithese_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(5f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);

    // VOLUCIERA ORES
    public static final RegistryObject<Block> POOR_VOLUCIERA_ORE = registerBlock("ores/voluciera/stone/poor_voluciera_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(5f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> VOLUCIERA_ORE = registerBlock("ores/voluciera/stone/voluciera_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(5f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> RICH_VOLUCIERA_ORE = registerBlock("ores/voluciera/stone/rich_voluciera_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(5f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);

    public static final RegistryObject<Block> POOR_DEEPSLATE_VOLUCIERA_ORE = registerBlock("ores/voluciera/deepslate/poor_deepslate_voluciera_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(7f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> DEEPSLATE_VOLUCIERA_ORE = registerBlock("ores/voluciera/deepslate/deepslate_voluciera_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(7f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> RICH_DEEPSLATE_VOLUCIERA_ORE = registerBlock("ores/voluciera/deepslate/rich_deepslate_voluciera_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(7f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);

    public static final RegistryObject<Block> POOR_NETHERRACK_VOLUCIERA_ORE = registerBlock("ores/voluciera/netherrack/poor_netherrack_voluciera_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(5f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> NETHERRACK_VOLUCIERA_ORE = registerBlock("ores/voluciera/netherrack/netherrack_voluciera_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(5f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> RICH_NETHERRACK_VOLUCIERA_ORE = registerBlock("ores/voluciera/netherrack/rich_netherrack_voluciera_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(5f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);

    public static final RegistryObject<Block> POOR_ENDSTONE_VOLUCIERA_ORE = registerBlock("ores/voluciera/endstone/poor_endstone_voluciera_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(5f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> ENDSTONE_VOLUCIERA_ORE = registerBlock("ores/voluciera/endstone/endstone_voluciera_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(5f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> RICH_ENDSTONE_VOLUCIERA_ORE = registerBlock("ores/voluciera/endstone/rich_endstone_voluciera_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(5f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);

    // YGGS ORES
    public static final RegistryObject<Block> POOR_YGGS_ORE = registerBlock("ores/yggs/stone/poor_yggs_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(5f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> YGGS_ORE = registerBlock("ores/yggs/stone/yggs_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(5f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> RICH_YGGS_ORE = registerBlock("ores/yggs/stone/rich_yggs_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(5f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);

    public static final RegistryObject<Block> POOR_DEEPSLATE_YGGS_ORE = registerBlock("ores/yggs/deepslate/poor_deepslate_yggs_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(7f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> DEEPSLATE_YGGS_ORE = registerBlock("ores/yggs/deepslate/deepslate_yggs_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(7f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> RICH_DEEPSLATE_YGGS_ORE = registerBlock("ores/yggs/deepslate/rich_deepslate_yggs_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(7f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);

    public static final RegistryObject<Block> POOR_NETHERRACK_YGGS_ORE = registerBlock("ores/yggs/netherrack/poor_netherrack_yggs_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(5f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> NETHERRACK_YGGS_ORE = registerBlock("ores/yggs/netherrack/netherrack_yggs_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(5f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> RICH_NETHERRACK_YGGS_ORE = registerBlock("ores/yggs/netherrack/rich_netherrack_yggs_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(5f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);

    public static final RegistryObject<Block> POOR_ENDSTONE_YGGS_ORE = registerBlock("ores/yggs/endstone/poor_endstone_yggs_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(5f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> ENDSTONE_YGGS_ORE = registerBlock("ores/yggs/endstone/endstone_yggs_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(5f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> RICH_ENDSTONE_YGGS_ORE = registerBlock("ores/yggs/endstone/rich_endstone_yggs_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(5f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);

    // OHLY ORES
    public static final RegistryObject<Block> POOR_OHLY_ORE = registerBlock("ores/ohly/stone/poor_ohly_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(5f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> OHLY_ORE = registerBlock("ores/ohly/stone/ohly_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(5f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> RICH_OHLY_ORE = registerBlock("ores/ohly/stone/rich_ohly_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(5f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);

    public static final RegistryObject<Block> POOR_DEEPSLATE_OHLY_ORE = registerBlock("ores/ohly/deepslate/poor_deepslate_ohly_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(7f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> DEEPSLATE_OHLY_ORE = registerBlock("ores/ohly/deepslate/deepslate_ohly_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(7f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> RICH_DEEPSLATE_OHLY_ORE = registerBlock("ores/ohly/deepslate/rich_deepslate_ohly_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(7f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);

    public static final RegistryObject<Block> POOR_NETHERRACK_OHLY_ORE = registerBlock("ores/ohly/netherrack/poor_netherrack_ohly_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(5f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> NETHERRACK_OHLY_ORE = registerBlock("ores/ohly/netherrack/netherrack_ohly_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(5f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> RICH_NETHERRACK_OHLY_ORE = registerBlock("ores/ohly/netherrack/rich_netherrack_ohly_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(5f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);

    public static final RegistryObject<Block> POOR_ENDSTONE_OHLY_ORE = registerBlock("ores/ohly/endstone/poor_endstone_ohly_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(5f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> ENDSTONE_OHLY_ORE = registerBlock("ores/ohly/endstone/endstone_ohly_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(5f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> RICH_ENDSTONE_OHLY_ORE = registerBlock("ores/ohly/endstone/rich_endstone_ohly_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(5f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);

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
