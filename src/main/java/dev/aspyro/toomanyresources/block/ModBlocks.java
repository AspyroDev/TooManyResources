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

    // BLUE_DRAGCITE BLOCKS
    public static final RegistryObject<Block> BLUE_DRAGCITE_BLOCK = registerBlock("blue_dragcite_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_BLUE_DRAGCITE_BLOCK_1 = registerBlock("compressed_blue_dragcite_block_1", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_BLUE_DRAGCITE_BLOCK_2 = registerBlock("compressed_blue_dragcite_block_2", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_BLUE_DRAGCITE_BLOCK_3 = registerBlock("compressed_blue_dragcite_block_3", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_BLUE_DRAGCITE_BLOCK_4 = registerBlock("compressed_blue_dragcite_block_4", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_BLUE_DRAGCITE_BLOCK_5 = registerBlock("compressed_blue_dragcite_block_5", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_BLUE_DRAGCITE_BLOCK_6 = registerBlock("compressed_blue_dragcite_block_6", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_BLUE_DRAGCITE_BLOCK_7 = registerBlock("compressed_blue_dragcite_block_7", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_BLUE_DRAGCITE_BLOCK_8 = registerBlock("compressed_blue_dragcite_block_8", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_BLUE_DRAGCITE_BLOCK_9 = registerBlock("compressed_blue_dragcite_block_9", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);

    // TARMENIS BLOCKS
    public static final RegistryObject<Block> TARMENIS_BLOCK = registerBlock("tarmenis_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_TARMENIS_BLOCK_1 = registerBlock("compressed_tarmenis_block_1", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_TARMENIS_BLOCK_2 = registerBlock("compressed_tarmenis_block_2", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_TARMENIS_BLOCK_3 = registerBlock("compressed_tarmenis_block_3", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_TARMENIS_BLOCK_4 = registerBlock("compressed_tarmenis_block_4", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_TARMENIS_BLOCK_5 = registerBlock("compressed_tarmenis_block_5", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_TARMENIS_BLOCK_6 = registerBlock("compressed_tarmenis_block_6", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_TARMENIS_BLOCK_7 = registerBlock("compressed_tarmenis_block_7", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_TARMENIS_BLOCK_8 = registerBlock("compressed_tarmenis_block_8", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_TARMENIS_BLOCK_9 = registerBlock("compressed_tarmenis_block_9", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);

    // KHELSTONE BLOCKS
    public static final RegistryObject<Block> KHELSTONE_BLOCK = registerBlock("khelstone_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_KHELSTONE_BLOCK_1 = registerBlock("compressed_khelstone_block_1", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_KHELSTONE_BLOCK_2 = registerBlock("compressed_khelstone_block_2", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_KHELSTONE_BLOCK_3 = registerBlock("compressed_khelstone_block_3", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_KHELSTONE_BLOCK_4 = registerBlock("compressed_khelstone_block_4", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_KHELSTONE_BLOCK_5 = registerBlock("compressed_khelstone_block_5", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_KHELSTONE_BLOCK_6 = registerBlock("compressed_khelstone_block_6", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_KHELSTONE_BLOCK_7 = registerBlock("compressed_khelstone_block_7", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_KHELSTONE_BLOCK_8 = registerBlock("compressed_khelstone_block_8", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_KHELSTONE_BLOCK_9 = registerBlock("compressed_khelstone_block_9", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);

    // BAMIRITE BLOCKS
    public static final RegistryObject<Block> BAMIRITE_BLOCK = registerBlock("bamirite_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_BAMIRITE_BLOCK_1 = registerBlock("compressed_bamirite_block_1", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_BAMIRITE_BLOCK_2 = registerBlock("compressed_bamirite_block_2", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_BAMIRITE_BLOCK_3 = registerBlock("compressed_bamirite_block_3", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_BAMIRITE_BLOCK_4 = registerBlock("compressed_bamirite_block_4", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_BAMIRITE_BLOCK_5 = registerBlock("compressed_bamirite_block_5", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_BAMIRITE_BLOCK_6 = registerBlock("compressed_bamirite_block_6", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_BAMIRITE_BLOCK_7 = registerBlock("compressed_bamirite_block_7", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_BAMIRITE_BLOCK_8 = registerBlock("compressed_bamirite_block_8", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_BAMIRITE_BLOCK_9 = registerBlock("compressed_bamirite_block_9", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);

    // VIGNASS BLOCKS
    public static final RegistryObject<Block> VIGNASS_BLOCK = registerBlock("vignass_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_VIGNASS_BLOCK_1 = registerBlock("compressed_vignass_block_1", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_VIGNASS_BLOCK_2 = registerBlock("compressed_vignass_block_2", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_VIGNASS_BLOCK_3 = registerBlock("compressed_vignass_block_3", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_VIGNASS_BLOCK_4 = registerBlock("compressed_vignass_block_4", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_VIGNASS_BLOCK_5 = registerBlock("compressed_vignass_block_5", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_VIGNASS_BLOCK_6 = registerBlock("compressed_vignass_block_6", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_VIGNASS_BLOCK_7 = registerBlock("compressed_vignass_block_7", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_VIGNASS_BLOCK_8 = registerBlock("compressed_vignass_block_8", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_VIGNASS_BLOCK_9 = registerBlock("compressed_vignass_block_9", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);

    // JEPERCKSTONE BLOCKS
    public static final RegistryObject<Block> JEPERCKSTONE_BLOCK = registerBlock("jeperckstone_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_JEPERCKSTONE_BLOCK_1 = registerBlock("compressed_jeperckstone_block_1", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_JEPERCKSTONE_BLOCK_2 = registerBlock("compressed_jeperckstone_block_2", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_JEPERCKSTONE_BLOCK_3 = registerBlock("compressed_jeperckstone_block_3", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_JEPERCKSTONE_BLOCK_4 = registerBlock("compressed_jeperckstone_block_4", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_JEPERCKSTONE_BLOCK_5 = registerBlock("compressed_jeperckstone_block_5", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_JEPERCKSTONE_BLOCK_6 = registerBlock("compressed_jeperckstone_block_6", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_JEPERCKSTONE_BLOCK_7 = registerBlock("compressed_jeperckstone_block_7", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_JEPERCKSTONE_BLOCK_8 = registerBlock("compressed_jeperckstone_block_8", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_JEPERCKSTONE_BLOCK_9 = registerBlock("compressed_jeperckstone_block_9", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);

    // HELMINIUM BLOCKS
    public static final RegistryObject<Block> HELMINIUM_BLOCK = registerBlock("helminium_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_HELMINIUM_BLOCK_1 = registerBlock("compressed_helminium_block_1", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_HELMINIUM_BLOCK_2 = registerBlock("compressed_helminium_block_2", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_HELMINIUM_BLOCK_3 = registerBlock("compressed_helminium_block_3", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_HELMINIUM_BLOCK_4 = registerBlock("compressed_helminium_block_4", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_HELMINIUM_BLOCK_5 = registerBlock("compressed_helminium_block_5", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_HELMINIUM_BLOCK_6 = registerBlock("compressed_helminium_block_6", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_HELMINIUM_BLOCK_7 = registerBlock("compressed_helminium_block_7", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_HELMINIUM_BLOCK_8 = registerBlock("compressed_helminium_block_8", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_HELMINIUM_BLOCK_9 = registerBlock("compressed_helminium_block_9", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);

    // RAGOUTON BLOCKS
    public static final RegistryObject<Block> RAGOUTON_BLOCK = registerBlock("ragouton_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_RAGOUTON_BLOCK_1 = registerBlock("compressed_ragouton_block_1", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_RAGOUTON_BLOCK_2 = registerBlock("compressed_ragouton_block_2", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_RAGOUTON_BLOCK_3 = registerBlock("compressed_ragouton_block_3", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_RAGOUTON_BLOCK_4 = registerBlock("compressed_ragouton_block_4", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_RAGOUTON_BLOCK_5 = registerBlock("compressed_ragouton_block_5", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_RAGOUTON_BLOCK_6 = registerBlock("compressed_ragouton_block_6", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_RAGOUTON_BLOCK_7 = registerBlock("compressed_ragouton_block_7", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_RAGOUTON_BLOCK_8 = registerBlock("compressed_ragouton_block_8", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_RAGOUTON_BLOCK_9 = registerBlock("compressed_ragouton_block_9", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);

    // EISSELTE BLOCKS
    public static final RegistryObject<Block> EISSELTE_BLOCK = registerBlock("eisselte_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_EISSELTE_BLOCK_1 = registerBlock("compressed_eisselte_block_1", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_EISSELTE_BLOCK_2 = registerBlock("compressed_eisselte_block_2", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_EISSELTE_BLOCK_3 = registerBlock("compressed_eisselte_block_3", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_EISSELTE_BLOCK_4 = registerBlock("compressed_eisselte_block_4", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_EISSELTE_BLOCK_5 = registerBlock("compressed_eisselte_block_5", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_EISSELTE_BLOCK_6 = registerBlock("compressed_eisselte_block_6", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_EISSELTE_BLOCK_7 = registerBlock("compressed_eisselte_block_7", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_EISSELTE_BLOCK_8 = registerBlock("compressed_eisselte_block_8", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_EISSELTE_BLOCK_9 = registerBlock("compressed_eisselte_block_9", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);

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

    // RAW BLUE_DRAGCITE BLOCKS
    public static final RegistryObject<Block> RAW_BLUE_DRAGCITE_BLOCK = registerBlock("raw_blue_dragcite_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(7f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_RAW_BLUE_DRAGCITE_BLOCK_1 = registerBlock("compressed_raw_blue_dragcite_block_1", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_RAW_BLUE_DRAGCITE_BLOCK_2 = registerBlock("compressed_raw_blue_dragcite_block_2", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_RAW_BLUE_DRAGCITE_BLOCK_3 = registerBlock("compressed_raw_blue_dragcite_block_3", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_RAW_BLUE_DRAGCITE_BLOCK_4 = registerBlock("compressed_raw_blue_dragcite_block_4", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_RAW_BLUE_DRAGCITE_BLOCK_5 = registerBlock("compressed_raw_blue_dragcite_block_5", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_RAW_BLUE_DRAGCITE_BLOCK_6 = registerBlock("compressed_raw_blue_dragcite_block_6", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_RAW_BLUE_DRAGCITE_BLOCK_7 = registerBlock("compressed_raw_blue_dragcite_block_7", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_RAW_BLUE_DRAGCITE_BLOCK_8 = registerBlock("compressed_raw_blue_dragcite_block_8", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_RAW_BLUE_DRAGCITE_BLOCK_9 = registerBlock("compressed_raw_blue_dragcite_block_9", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);

    // RAW TARMENIS BLOCKS
    public static final RegistryObject<Block> RAW_TARMENIS_BLOCK = registerBlock("raw_tarmenis_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(7f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_RAW_TARMENIS_BLOCK_1 = registerBlock("compressed_raw_tarmenis_block_1", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_RAW_TARMENIS_BLOCK_2 = registerBlock("compressed_raw_tarmenis_block_2", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_RAW_TARMENIS_BLOCK_3 = registerBlock("compressed_raw_tarmenis_block_3", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_RAW_TARMENIS_BLOCK_4 = registerBlock("compressed_raw_tarmenis_block_4", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_RAW_TARMENIS_BLOCK_5 = registerBlock("compressed_raw_tarmenis_block_5", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_RAW_TARMENIS_BLOCK_6 = registerBlock("compressed_raw_tarmenis_block_6", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_RAW_TARMENIS_BLOCK_7 = registerBlock("compressed_raw_tarmenis_block_7", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_RAW_TARMENIS_BLOCK_8 = registerBlock("compressed_raw_tarmenis_block_8", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_RAW_TARMENIS_BLOCK_9 = registerBlock("compressed_raw_tarmenis_block_9", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);

    // RAW KHELSTONE BLOCKS
    public static final RegistryObject<Block> RAW_KHELSTONE_BLOCK = registerBlock("raw_khelstone_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(7f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_RAW_KHELSTONE_BLOCK_1 = registerBlock("compressed_raw_khelstone_block_1", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_RAW_KHELSTONE_BLOCK_2 = registerBlock("compressed_raw_khelstone_block_2", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_RAW_KHELSTONE_BLOCK_3 = registerBlock("compressed_raw_khelstone_block_3", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_RAW_KHELSTONE_BLOCK_4 = registerBlock("compressed_raw_khelstone_block_4", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_RAW_KHELSTONE_BLOCK_5 = registerBlock("compressed_raw_khelstone_block_5", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_RAW_KHELSTONE_BLOCK_6 = registerBlock("compressed_raw_khelstone_block_6", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_RAW_KHELSTONE_BLOCK_7 = registerBlock("compressed_raw_khelstone_block_7", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_RAW_KHELSTONE_BLOCK_8 = registerBlock("compressed_raw_khelstone_block_8", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_RAW_KHELSTONE_BLOCK_9 = registerBlock("compressed_raw_khelstone_block_9", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);

    // RAW BAMIRITE BLOCKS
    public static final RegistryObject<Block> RAW_BAMIRITE_BLOCK = registerBlock("raw_bamirite_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(7f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_RAW_BAMIRITE_BLOCK_1 = registerBlock("compressed_raw_bamirite_block_1", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_RAW_BAMIRITE_BLOCK_2 = registerBlock("compressed_raw_bamirite_block_2", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_RAW_BAMIRITE_BLOCK_3 = registerBlock("compressed_raw_bamirite_block_3", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_RAW_BAMIRITE_BLOCK_4 = registerBlock("compressed_raw_bamirite_block_4", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_RAW_BAMIRITE_BLOCK_5 = registerBlock("compressed_raw_bamirite_block_5", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_RAW_BAMIRITE_BLOCK_6 = registerBlock("compressed_raw_bamirite_block_6", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_RAW_BAMIRITE_BLOCK_7 = registerBlock("compressed_raw_bamirite_block_7", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_RAW_BAMIRITE_BLOCK_8 = registerBlock("compressed_raw_bamirite_block_8", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_RAW_BAMIRITE_BLOCK_9 = registerBlock("compressed_raw_bamirite_block_9", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);

    // RAW VIGNASS BLOCKS
    public static final RegistryObject<Block> RAW_VIGNASS_BLOCK = registerBlock("raw_vignass_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(7f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_RAW_VIGNASS_BLOCK_1 = registerBlock("compressed_raw_vignass_block_1", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_RAW_VIGNASS_BLOCK_2 = registerBlock("compressed_raw_vignass_block_2", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_RAW_VIGNASS_BLOCK_3 = registerBlock("compressed_raw_vignass_block_3", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_RAW_VIGNASS_BLOCK_4 = registerBlock("compressed_raw_vignass_block_4", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_RAW_VIGNASS_BLOCK_5 = registerBlock("compressed_raw_vignass_block_5", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_RAW_VIGNASS_BLOCK_6 = registerBlock("compressed_raw_vignass_block_6", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_RAW_VIGNASS_BLOCK_7 = registerBlock("compressed_raw_vignass_block_7", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_RAW_VIGNASS_BLOCK_8 = registerBlock("compressed_raw_vignass_block_8", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_RAW_VIGNASS_BLOCK_9 = registerBlock("compressed_raw_vignass_block_9", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);

    // RAW JEPERCKSTONE BLOCKS
    public static final RegistryObject<Block> RAW_JEPERCKSTONE_BLOCK = registerBlock("raw_jeperckstone_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(7f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_RAW_JEPERCKSTONE_BLOCK_1 = registerBlock("compressed_raw_jeperckstone_block_1", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_RAW_JEPERCKSTONE_BLOCK_2 = registerBlock("compressed_raw_jeperckstone_block_2", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_RAW_JEPERCKSTONE_BLOCK_3 = registerBlock("compressed_raw_jeperckstone_block_3", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_RAW_JEPERCKSTONE_BLOCK_4 = registerBlock("compressed_raw_jeperckstone_block_4", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_RAW_JEPERCKSTONE_BLOCK_5 = registerBlock("compressed_raw_jeperckstone_block_5", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_RAW_JEPERCKSTONE_BLOCK_6 = registerBlock("compressed_raw_jeperckstone_block_6", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_RAW_JEPERCKSTONE_BLOCK_7 = registerBlock("compressed_raw_jeperckstone_block_7", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_RAW_JEPERCKSTONE_BLOCK_8 = registerBlock("compressed_raw_jeperckstone_block_8", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_RAW_JEPERCKSTONE_BLOCK_9 = registerBlock("compressed_raw_jeperckstone_block_9", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);

    // RAW HELMINIUM BLOCKS
    public static final RegistryObject<Block> RAW_HELMINIUM_BLOCK = registerBlock("raw_helminium_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(7f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_RAW_HELMINIUM_BLOCK_1 = registerBlock("compressed_raw_helminium_block_1", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_RAW_HELMINIUM_BLOCK_2 = registerBlock("compressed_raw_helminium_block_2", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_RAW_HELMINIUM_BLOCK_3 = registerBlock("compressed_raw_helminium_block_3", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_RAW_HELMINIUM_BLOCK_4 = registerBlock("compressed_raw_helminium_block_4", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_RAW_HELMINIUM_BLOCK_5 = registerBlock("compressed_raw_helminium_block_5", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_RAW_HELMINIUM_BLOCK_6 = registerBlock("compressed_raw_helminium_block_6", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_RAW_HELMINIUM_BLOCK_7 = registerBlock("compressed_raw_helminium_block_7", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_RAW_HELMINIUM_BLOCK_8 = registerBlock("compressed_raw_helminium_block_8", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_RAW_HELMINIUM_BLOCK_9 = registerBlock("compressed_raw_helminium_block_9", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);

    // RAW RAGOUTON BLOCKS
    public static final RegistryObject<Block> RAW_RAGOUTON_BLOCK = registerBlock("raw_ragouton_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(7f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_RAW_RAGOUTON_BLOCK_1 = registerBlock("compressed_raw_ragouton_block_1", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_RAW_RAGOUTON_BLOCK_2 = registerBlock("compressed_raw_ragouton_block_2", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_RAW_RAGOUTON_BLOCK_3 = registerBlock("compressed_raw_ragouton_block_3", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_RAW_RAGOUTON_BLOCK_4 = registerBlock("compressed_raw_ragouton_block_4", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_RAW_RAGOUTON_BLOCK_5 = registerBlock("compressed_raw_ragouton_block_5", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_RAW_RAGOUTON_BLOCK_6 = registerBlock("compressed_raw_ragouton_block_6", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_RAW_RAGOUTON_BLOCK_7 = registerBlock("compressed_raw_ragouton_block_7", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_RAW_RAGOUTON_BLOCK_8 = registerBlock("compressed_raw_ragouton_block_8", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_RAW_RAGOUTON_BLOCK_9 = registerBlock("compressed_raw_ragouton_block_9", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);

    // RAW EISSELTE BLOCKS
    public static final RegistryObject<Block> RAW_EISSELTE_BLOCK = registerBlock("raw_eisselte_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(7f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_RAW_EISSELTE_BLOCK_1 = registerBlock("compressed_raw_eisselte_block_1", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_RAW_EISSELTE_BLOCK_2 = registerBlock("compressed_raw_eisselte_block_2", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_RAW_EISSELTE_BLOCK_3 = registerBlock("compressed_raw_eisselte_block_3", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_RAW_EISSELTE_BLOCK_4 = registerBlock("compressed_raw_eisselte_block_4", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_RAW_EISSELTE_BLOCK_5 = registerBlock("compressed_raw_eisselte_block_5", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_RAW_EISSELTE_BLOCK_6 = registerBlock("compressed_raw_eisselte_block_6", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_RAW_EISSELTE_BLOCK_7 = registerBlock("compressed_raw_eisselte_block_7", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_RAW_EISSELTE_BLOCK_8 = registerBlock("compressed_raw_eisselte_block_8", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COMPRESSED_RAW_EISSELTE_BLOCK_9 = registerBlock("compressed_raw_eisselte_block_9", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);

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

    // BLUE_DRAGCITE ORES
    public static final RegistryObject<Block> POOR_BLUE_DRAGCITE_ORE = registerBlock("poor_blue_dragcite_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(5f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> BLUE_DRAGCITE_ORE = registerBlock("blue_dragcite_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(5f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> RICH_BLUE_DRAGCITE_ORE = registerBlock("rich_blue_dragcite_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(5f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);

    public static final RegistryObject<Block> POOR_DEEPSLATE_BLUE_DRAGCITE_ORE = registerBlock("poor_deepslate_blue_dragcite_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(7f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> DEEPSLATE_BLUE_DRAGCITE_ORE = registerBlock("deepslate_blue_dragcite_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(7f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> RICH_DEEPSLATE_BLUE_DRAGCITE_ORE = registerBlock("rich_deepslate_blue_dragcite_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(7f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);

    public static final RegistryObject<Block> POOR_NETHERRACK_BLUE_DRAGCITE_ORE = registerBlock("poor_netherrack_blue_dragcite_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(5f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> NETHERRACK_BLUE_DRAGCITE_ORE = registerBlock("netherrack_blue_dragcite_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(5f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> RICH_NETHERRACK_BLUE_DRAGCITE_ORE = registerBlock("rich_netherrack_blue_dragcite_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(5f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);

    public static final RegistryObject<Block> POOR_ENDSTONE_BLUE_DRAGCITE_ORE = registerBlock("poor_endstone_blue_dragcite_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(5f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> ENDSTONE_BLUE_DRAGCITE_ORE = registerBlock("endstone_blue_dragcite_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(5f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> RICH_ENDSTONE_BLUE_DRAGCITE_ORE = registerBlock("rich_endstone_blue_dragcite_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(5f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);

    // TARMENIS ORES
    public static final RegistryObject<Block> POOR_TARMENIS_ORE = registerBlock("poor_tarmenis_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(5f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TARMENIS_ORE = registerBlock("tarmenis_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(5f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> RICH_TARMENIS_ORE = registerBlock("rich_tarmenis_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(5f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);

    public static final RegistryObject<Block> POOR_DEEPSLATE_TARMENIS_ORE = registerBlock("poor_deepslate_tarmenis_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(7f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> DEEPSLATE_TARMENIS_ORE = registerBlock("deepslate_tarmenis_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(7f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> RICH_DEEPSLATE_TARMENIS_ORE = registerBlock("rich_deepslate_tarmenis_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(7f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);

    public static final RegistryObject<Block> POOR_NETHERRACK_TARMENIS_ORE = registerBlock("poor_netherrack_tarmenis_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(5f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> NETHERRACK_TARMENIS_ORE = registerBlock("netherrack_tarmenis_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(5f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> RICH_NETHERRACK_TARMENIS_ORE = registerBlock("rich_netherrack_tarmenis_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(5f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);

    public static final RegistryObject<Block> POOR_ENDSTONE_TARMENIS_ORE = registerBlock("poor_endstone_tarmenis_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(5f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> ENDSTONE_TARMENIS_ORE = registerBlock("endstone_tarmenis_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(5f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> RICH_ENDSTONE_TARMENIS_ORE = registerBlock("rich_endstone_tarmenis_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(5f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);

    // KHELSTONE ORES
    public static final RegistryObject<Block> POOR_KHELSTONE_ORE = registerBlock("poor_khelstone_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(5f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> KHELSTONE_ORE = registerBlock("khelstone_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(5f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> RICH_KHELSTONE_ORE = registerBlock("rich_khelstone_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(5f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);

    public static final RegistryObject<Block> POOR_DEEPSLATE_KHELSTONE_ORE = registerBlock("poor_deepslate_khelstone_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(7f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> DEEPSLATE_KHELSTONE_ORE = registerBlock("deepslate_khelstone_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(7f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> RICH_DEEPSLATE_KHELSTONE_ORE = registerBlock("rich_deepslate_khelstone_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(7f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);

    public static final RegistryObject<Block> POOR_NETHERRACK_KHELSTONE_ORE = registerBlock("poor_netherrack_khelstone_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(5f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> NETHERRACK_KHELSTONE_ORE = registerBlock("netherrack_khelstone_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(5f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> RICH_NETHERRACK_KHELSTONE_ORE = registerBlock("rich_netherrack_khelstone_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(5f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);

    public static final RegistryObject<Block> POOR_ENDSTONE_KHELSTONE_ORE = registerBlock("poor_endstone_khelstone_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(5f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> ENDSTONE_KHELSTONE_ORE = registerBlock("endstone_khelstone_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(5f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> RICH_ENDSTONE_KHELSTONE_ORE = registerBlock("rich_endstone_khelstone_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(5f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);

    // BAMIRITE ORES
    public static final RegistryObject<Block> POOR_BAMIRITE_ORE = registerBlock("poor_bamirite_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(5f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> BAMIRITE_ORE = registerBlock("bamirite_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(5f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> RICH_BAMIRITE_ORE = registerBlock("rich_bamirite_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(5f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);

    public static final RegistryObject<Block> POOR_DEEPSLATE_BAMIRITE_ORE = registerBlock("poor_deepslate_bamirite_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(7f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> DEEPSLATE_BAMIRITE_ORE = registerBlock("deepslate_bamirite_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(7f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> RICH_DEEPSLATE_BAMIRITE_ORE = registerBlock("rich_deepslate_bamirite_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(7f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);

    public static final RegistryObject<Block> POOR_NETHERRACK_BAMIRITE_ORE = registerBlock("poor_netherrack_bamirite_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(5f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> NETHERRACK_BAMIRITE_ORE = registerBlock("netherrack_bamirite_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(5f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> RICH_NETHERRACK_BAMIRITE_ORE = registerBlock("rich_netherrack_bamirite_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(5f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);

    public static final RegistryObject<Block> POOR_ENDSTONE_BAMIRITE_ORE = registerBlock("poor_endstone_bamirite_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(5f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> ENDSTONE_BAMIRITE_ORE = registerBlock("endstone_bamirite_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(5f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> RICH_ENDSTONE_BAMIRITE_ORE = registerBlock("rich_endstone_bamirite_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(5f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);

    // VIGNASS ORES
    public static final RegistryObject<Block> POOR_VIGNASS_ORE = registerBlock("poor_vignass_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(5f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> VIGNASS_ORE = registerBlock("vignass_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(5f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> RICH_VIGNASS_ORE = registerBlock("rich_vignass_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(5f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);

    public static final RegistryObject<Block> POOR_DEEPSLATE_VIGNASS_ORE = registerBlock("poor_deepslate_vignass_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(7f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> DEEPSLATE_VIGNASS_ORE = registerBlock("deepslate_vignass_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(7f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> RICH_DEEPSLATE_VIGNASS_ORE = registerBlock("rich_deepslate_vignass_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(7f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);

    public static final RegistryObject<Block> POOR_NETHERRACK_VIGNASS_ORE = registerBlock("poor_netherrack_vignass_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(5f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> NETHERRACK_VIGNASS_ORE = registerBlock("netherrack_vignass_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(5f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> RICH_NETHERRACK_VIGNASS_ORE = registerBlock("rich_netherrack_vignass_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(5f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);

    public static final RegistryObject<Block> POOR_ENDSTONE_VIGNASS_ORE = registerBlock("poor_endstone_vignass_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(5f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> ENDSTONE_VIGNASS_ORE = registerBlock("endstone_vignass_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(5f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> RICH_ENDSTONE_VIGNASS_ORE = registerBlock("rich_endstone_vignass_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(5f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);

    // JEPERCKSTONE ORES
    public static final RegistryObject<Block> POOR_JEPERCKSTONE_ORE = registerBlock("poor_jeperckstone_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(5f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> JEPERCKSTONE_ORE = registerBlock("jeperckstone_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(5f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> RICH_JEPERCKSTONE_ORE = registerBlock("rich_jeperckstone_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(5f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);

    public static final RegistryObject<Block> POOR_DEEPSLATE_JEPERCKSTONE_ORE = registerBlock("poor_deepslate_jeperckstone_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(7f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> DEEPSLATE_JEPERCKSTONE_ORE = registerBlock("deepslate_jeperckstone_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(7f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> RICH_DEEPSLATE_JEPERCKSTONE_ORE = registerBlock("rich_deepslate_jeperckstone_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(7f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);

    public static final RegistryObject<Block> POOR_NETHERRACK_JEPERCKSTONE_ORE = registerBlock("poor_netherrack_jeperckstone_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(5f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> NETHERRACK_JEPERCKSTONE_ORE = registerBlock("netherrack_jeperckstone_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(5f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> RICH_NETHERRACK_JEPERCKSTONE_ORE = registerBlock("rich_netherrack_jeperckstone_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(5f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);

    public static final RegistryObject<Block> POOR_ENDSTONE_JEPERCKSTONE_ORE = registerBlock("poor_endstone_jeperckstone_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(5f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> ENDSTONE_JEPERCKSTONE_ORE = registerBlock("endstone_jeperckstone_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(5f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> RICH_ENDSTONE_JEPERCKSTONE_ORE = registerBlock("rich_endstone_jeperckstone_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(5f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);

    // HELMINIUM ORES
    public static final RegistryObject<Block> POOR_HELMINIUM_ORE = registerBlock("poor_helminium_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(5f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> HELMINIUM_ORE = registerBlock("helminium_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(5f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> RICH_HELMINIUM_ORE = registerBlock("rich_helminium_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(5f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);

    public static final RegistryObject<Block> POOR_DEEPSLATE_HELMINIUM_ORE = registerBlock("poor_deepslate_helminium_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(7f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> DEEPSLATE_HELMINIUM_ORE = registerBlock("deepslate_helminium_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(7f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> RICH_DEEPSLATE_HELMINIUM_ORE = registerBlock("rich_deepslate_helminium_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(7f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);

    public static final RegistryObject<Block> POOR_NETHERRACK_HELMINIUM_ORE = registerBlock("poor_netherrack_helminium_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(5f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> NETHERRACK_HELMINIUM_ORE = registerBlock("netherrack_helminium_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(5f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> RICH_NETHERRACK_HELMINIUM_ORE = registerBlock("rich_netherrack_helminium_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(5f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);

    public static final RegistryObject<Block> POOR_ENDSTONE_HELMINIUM_ORE = registerBlock("poor_endstone_helminium_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(5f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> ENDSTONE_HELMINIUM_ORE = registerBlock("endstone_helminium_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(5f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> RICH_ENDSTONE_HELMINIUM_ORE = registerBlock("rich_endstone_helminium_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(5f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);

    // RAGOUTON ORES
    public static final RegistryObject<Block> POOR_RAGOUTON_ORE = registerBlock("poor_ragouton_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(5f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> RAGOUTON_ORE = registerBlock("ragouton_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(5f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> RICH_RAGOUTON_ORE = registerBlock("rich_ragouton_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(5f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);

    public static final RegistryObject<Block> POOR_DEEPSLATE_RAGOUTON_ORE = registerBlock("poor_deepslate_ragouton_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(7f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> DEEPSLATE_RAGOUTON_ORE = registerBlock("deepslate_ragouton_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(7f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> RICH_DEEPSLATE_RAGOUTON_ORE = registerBlock("rich_deepslate_ragouton_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(7f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);

    public static final RegistryObject<Block> POOR_NETHERRACK_RAGOUTON_ORE = registerBlock("poor_netherrack_ragouton_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(5f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> NETHERRACK_RAGOUTON_ORE = registerBlock("netherrack_ragouton_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(5f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> RICH_NETHERRACK_RAGOUTON_ORE = registerBlock("rich_netherrack_ragouton_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(5f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);

    public static final RegistryObject<Block> POOR_ENDSTONE_RAGOUTON_ORE = registerBlock("poor_endstone_ragouton_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(5f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> ENDSTONE_RAGOUTON_ORE = registerBlock("endstone_ragouton_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(5f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> RICH_ENDSTONE_RAGOUTON_ORE = registerBlock("rich_endstone_ragouton_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(5f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);

    // EISSELTE ORES
    public static final RegistryObject<Block> POOR_EISSELTE_ORE = registerBlock("poor_eisselte_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(5f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> EISSELTE_ORE = registerBlock("eisselte_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(5f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> RICH_EISSELTE_ORE = registerBlock("rich_eisselte_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(5f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);

    public static final RegistryObject<Block> POOR_DEEPSLATE_EISSELTE_ORE = registerBlock("poor_deepslate_eisselte_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(7f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> DEEPSLATE_EISSELTE_ORE = registerBlock("deepslate_eisselte_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(7f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> RICH_DEEPSLATE_EISSELTE_ORE = registerBlock("rich_deepslate_eisselte_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(7f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);

    public static final RegistryObject<Block> POOR_NETHERRACK_EISSELTE_ORE = registerBlock("poor_netherrack_eisselte_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(5f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> NETHERRACK_EISSELTE_ORE = registerBlock("netherrack_eisselte_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(5f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> RICH_NETHERRACK_EISSELTE_ORE = registerBlock("rich_netherrack_eisselte_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(5f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);

    public static final RegistryObject<Block> POOR_ENDSTONE_EISSELTE_ORE = registerBlock("poor_endstone_eisselte_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(5f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> ENDSTONE_EISSELTE_ORE = registerBlock("endstone_eisselte_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(5f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> RICH_ENDSTONE_EISSELTE_ORE = registerBlock("rich_endstone_eisselte_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(5f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);

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
