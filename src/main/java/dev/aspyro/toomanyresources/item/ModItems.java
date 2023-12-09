package dev.aspyro.toomanyresources.item;

import dev.aspyro.toomanyresources.TooManyResources;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
        DeferredRegister.create(ForgeRegistries.ITEMS, TooManyResources.MOD_ID);


    public static final RegistryObject<Item> MANXIUM_INGOT = ITEMS.register("manxium_ingot", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> MANXIUM_NUGGET = ITEMS.register("manxium_nugget", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> RAW_MANXIUM = ITEMS.register("raw_manxium", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> RAW_MANXIUM_PIECE = ITEMS.register("raw_manxium_piece", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> KIRIONITE_INGOT = ITEMS.register("kirionite_ingot", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> KIRIONITE_NUGGET = ITEMS.register("kirionite_nugget", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> RAW_KIRIONITE = ITEMS.register("raw_kirionite", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> RAW_KIRIONITE_PIECE = ITEMS.register("raw_kirionite_piece", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> SLITHESE_INGOT = ITEMS.register("slithese_ingot", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> SLITHESE_NUGGET = ITEMS.register("slithese_nugget", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> RAW_SLITHESE = ITEMS.register("raw_slithese", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> RAW_SLITHESE_PIECE = ITEMS.register("raw_slithese_piece", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> VOLUCIERA_INGOT = ITEMS.register("voluciera_ingot", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> VOLUCIERA_NUGGET = ITEMS.register("voluciera_nugget", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> RAW_VOLUCIERA = ITEMS.register("raw_voluciera", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> RAW_VOLUCIERA_PIECE = ITEMS.register("raw_voluciera_piece", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> YGGS_INGOT = ITEMS.register("yggs_ingot", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> YGGS_NUGGET = ITEMS.register("yggs_nugget", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> RAW_YGGS = ITEMS.register("raw_yggs", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> RAW_YGGS_PIECE = ITEMS.register("raw_yggs_piece", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> OHLY_INGOT = ITEMS.register("ohly_ingot", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> OHLY_NUGGET = ITEMS.register("ohly_nugget", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> RAW_OHLY = ITEMS.register("raw_ohly", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> RAW_OHLY_PIECE = ITEMS.register("raw_ohly_piece", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> BLUE_DRAGCITE_INGOT = ITEMS.register("blue_dragcite_ingot", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> BLUE_DRAGCITE_NUGGET = ITEMS.register("blue_dragcite_nugget", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> RAW_BLUE_DRAGCITE = ITEMS.register("raw_blue_dragcite", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> RAW_BLUE_DRAGCITE_PIECE = ITEMS.register("raw_blue_dragcite_piece", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> TARMENIS_INGOT = ITEMS.register("tarmenis_ingot", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> TARMENIS_NUGGET = ITEMS.register("tarmenis_nugget", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> RAW_TARMENIS = ITEMS.register("raw_tarmenis", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> RAW_TARMENIS_PIECE = ITEMS.register("raw_tarmenis_piece", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> KHELSTONE_INGOT = ITEMS.register("khelstone_ingot", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> KHELSTONE_NUGGET = ITEMS.register("khelstone_nugget", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> RAW_KHELSTONE = ITEMS.register("raw_khelstone", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> RAW_KHELSTONE_PIECE = ITEMS.register("raw_khelstone_piece", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> BAMIRITE_INGOT = ITEMS.register("bamirite_ingot", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> BAMIRITE_NUGGET = ITEMS.register("bamirite_nugget", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> RAW_BAMIRITE = ITEMS.register("raw_bamirite", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> RAW_BAMIRITE_PIECE = ITEMS.register("raw_bamirite_piece", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> VIGNASS_INGOT = ITEMS.register("vignass_ingot", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> VIGNASS_NUGGET = ITEMS.register("vignass_nugget", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> RAW_VIGNASS = ITEMS.register("raw_vignass", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> RAW_VIGNASS_PIECE = ITEMS.register("raw_vignass_piece", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> JEPERCKSTONE_INGOT = ITEMS.register("jeperckstone_ingot", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> JEPERCKSTONE_NUGGET = ITEMS.register("jeperckstone_nugget", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> RAW_JEPERCKSTONE = ITEMS.register("raw_jeperckstone", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> RAW_JEPERCKSTONE_PIECE = ITEMS.register("raw_jeperckstone_piece", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> HELMINIUM_INGOT = ITEMS.register("helminium_ingot", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> HELMINIUM_NUGGET = ITEMS.register("helminium_nugget", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> RAW_HELMINIUM = ITEMS.register("raw_helminium", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> RAW_HELMINIUM_PIECE = ITEMS.register("raw_helminium_piece", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> RAGOUTON_INGOT = ITEMS.register("ragouton_ingot", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> RAGOUTON_NUGGET = ITEMS.register("ragouton_nugget", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> RAW_RAGOUTON = ITEMS.register("raw_ragouton", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> RAW_RAGOUTON_PIECE = ITEMS.register("raw_ragouton_piece", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> EISSELTE_INGOT = ITEMS.register("eisselte_ingot", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> EISSELTE_NUGGET = ITEMS.register("eisselte_nugget", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> RAW_EISSELTE = ITEMS.register("raw_eisselte", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> RAW_EISSELTE_PIECE = ITEMS.register("raw_eisselte_piece", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> MANXIUM_PICKAXE = ITEMS.register("manxium_pickaxe", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> MANXIUM_AXE = ITEMS.register("manxium_axe", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> MANXIUM_HOE = ITEMS.register("manxium_hoe", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> MANXIUM_SHOVEL = ITEMS.register("manxium_shovel", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> MANXIUM_SWORD = ITEMS.register("manxium_sword", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));

    public static final RegistryObject<Item> KIRIONITE_PICKAXE = ITEMS.register("kirionite_pickaxe", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> KIRIONITE_AXE = ITEMS.register("kirionite_axe", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> KIRIONITE_HOE = ITEMS.register("kirionite_hoe", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> KIRIONITE_SHOVEL = ITEMS.register("kirionite_shovel", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> KIRIONITE_SWORD = ITEMS.register("kirionite_sword", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));

    public static final RegistryObject<Item> SLITHESE_PICKAXE = ITEMS.register("slithese_pickaxe", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> SLITHESE_AXE = ITEMS.register("slithese_axe", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> SLITHESE_HOE = ITEMS.register("slithese_hoe", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> SLITHESE_SHOVEL = ITEMS.register("slithese_shovel", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> SLITHESE_SWORD = ITEMS.register("slithese_sword", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));

    public static final RegistryObject<Item> VOLUCIERA_PICKAXE = ITEMS.register("voluciera_pickaxe", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> VOLUCIERA_AXE = ITEMS.register("voluciera_axe", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> VOLUCIERA_HOE = ITEMS.register("voluciera_hoe", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> VOLUCIERA_SHOVEL = ITEMS.register("voluciera_shovel", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> VOLUCIERA_SWORD = ITEMS.register("voluciera_sword", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));

    public static final RegistryObject<Item> YGGS_PICKAXE = ITEMS.register("yggs_pickaxe", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> YGGS_AXE = ITEMS.register("yggs_axe", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> YGGS_HOE = ITEMS.register("yggs_hoe", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> YGGS_SHOVEL = ITEMS.register("yggs_shovel", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> YGGS_SWORD = ITEMS.register("yggs_sword", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));

    public static final RegistryObject<Item> OHLY_PICKAXE = ITEMS.register("ohly_pickaxe", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> OHLY_AXE = ITEMS.register("ohly_axe", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> OHLY_HOE = ITEMS.register("ohly_hoe", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> OHLY_SHOVEL = ITEMS.register("ohly_shovel", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> OHLY_SWORD = ITEMS.register("ohly_sword", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));

    public static final RegistryObject<Item> BLUE_DRAGCITE_PICKAXE = ITEMS.register("blue_dragcite_pickaxe", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> BLUE_DRAGCITE_AXE = ITEMS.register("blue_dragcite_axe", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> BLUE_DRAGCITE_HOE = ITEMS.register("blue_dragcite_hoe", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> BLUE_DRAGCITE_SHOVEL = ITEMS.register("blue_dragcite_shovel", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> BLUE_DRAGCITE_SWORD = ITEMS.register("blue_dragcite_sword", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));

    public static final RegistryObject<Item> TARMENIS_PICKAXE = ITEMS.register("tarmenis_pickaxe", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> TARMENIS_AXE = ITEMS.register("tarmenis_axe", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> TARMENIS_HOE = ITEMS.register("tarmenis_hoe", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> TARMENIS_SHOVEL = ITEMS.register("tarmenis_shovel", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> TARMENIS_SWORD = ITEMS.register("tarmenis_sword", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));

    public static final RegistryObject<Item> KHELSTONE_PICKAXE = ITEMS.register("khelstone_pickaxe", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> KHELSTONE_AXE = ITEMS.register("khelstone_axe", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> KHELSTONE_HOE = ITEMS.register("khelstone_hoe", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> KHELSTONE_SHOVEL = ITEMS.register("khelstone_shovel", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> KHELSTONE_SWORD = ITEMS.register("khelstone_sword", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));

    public static final RegistryObject<Item> BAMIRITE_PICKAXE = ITEMS.register("bamirite_pickaxe", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> BAMIRITE_AXE = ITEMS.register("bamirite_axe", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> BAMIRITE_HOE = ITEMS.register("bamirite_hoe", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> BAMIRITE_SHOVEL = ITEMS.register("bamirite_shovel", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> BAMIRITE_SWORD = ITEMS.register("bamirite_sword", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));

    public static final RegistryObject<Item> VIGNASS_PICKAXE = ITEMS.register("vignass_pickaxe", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> VIGNASS_AXE = ITEMS.register("vignass_axe", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> VIGNASS_HOE = ITEMS.register("vignass_hoe", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> VIGNASS_SHOVEL = ITEMS.register("vignass_shovel", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> VIGNASS_SWORD = ITEMS.register("vignass_sword", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));

    public static final RegistryObject<Item> JEPERCKSTONE_PICKAXE = ITEMS.register("jeperckstone_pickaxe", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> JEPERCKSTONE_AXE = ITEMS.register("jeperckstone_axe", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> JEPERCKSTONE_HOE = ITEMS.register("jeperckstone_hoe", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> JEPERCKSTONE_SHOVEL = ITEMS.register("jeperckstone_shovel", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> JEPERCKSTONE_SWORD = ITEMS.register("jeperckstone_sword", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));

    public static final RegistryObject<Item> HELMINIUM_PICKAXE = ITEMS.register("helminium_pickaxe", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> HELMINIUM_AXE = ITEMS.register("helminium_axe", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> HELMINIUM_HOE = ITEMS.register("helminium_hoe", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> HELMINIUM_SHOVEL = ITEMS.register("helminium_shovel", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> HELMINIUM_SWORD = ITEMS.register("helminium_sword", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));

    public static final RegistryObject<Item> RAGOUTON_PICKAXE = ITEMS.register("ragouton_pickaxe", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> RAGOUTON_AXE = ITEMS.register("ragouton_axe", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> RAGOUTON_HOE = ITEMS.register("ragouton_hoe", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> RAGOUTON_SHOVEL = ITEMS.register("ragouton_shovel", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> RAGOUTON_SWORD = ITEMS.register("ragouton_sword", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));

    public static final RegistryObject<Item> EISSELTE_PICKAXE = ITEMS.register("eisselte_pickaxe", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> EISSELTE_AXE = ITEMS.register("eisselte_axe", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> EISSELTE_HOE = ITEMS.register("eisselte_hoe", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> EISSELTE_SHOVEL = ITEMS.register("eisselte_shovel", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> EISSELTE_SWORD = ITEMS.register("eisselte_sword", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));

    public static final RegistryObject<Item> MANXIUM_HELMET = ITEMS.register("manxium_helmet", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item> MANXIUM_CHESTPLATE = ITEMS.register("manxium_chestplate", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item> MANXIUM_LEGGINGS = ITEMS.register("manxium_leggings", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item> MANXIUM_BOOTS = ITEMS.register("manxium_boots", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));

    public static final RegistryObject<Item> KIRIONITE_HELMET = ITEMS.register("kirionite_helmet", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item> KIRIONITE_CHESTPLATE = ITEMS.register("kirionite_chestplate", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item> KIRIONITE_LEGGINGS = ITEMS.register("kirionite_leggings", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item> KIRIONITE_BOOTS = ITEMS.register("kirionite_boots", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));

    public static final RegistryObject<Item> SLITHESE_HELMET = ITEMS.register("slithese_helmet", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item> SLITHESE_CHESTPLATE = ITEMS.register("slithese_chestplate", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item> SLITHESE_LEGGINGS = ITEMS.register("slithese_leggings", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item> SLITHESE_BOOTS = ITEMS.register("slithese_boots", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));

    public static final RegistryObject<Item> VOLUCIERA_HELMET = ITEMS.register("voluciera_helmet", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item> VOLUCIERA_CHESTPLATE = ITEMS.register("voluciera_chestplate", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item> VOLUCIERA_LEGGINGS = ITEMS.register("voluciera_leggings", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item> VOLUCIERA_BOOTS = ITEMS.register("voluciera_boots", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));

    public static final RegistryObject<Item> YGGS_HELMET = ITEMS.register("yggs_helmet", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item> YGGS_CHESTPLATE = ITEMS.register("yggs_chestplate", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item> YGGS_LEGGINGS = ITEMS.register("yggs_leggings", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item> YGGS_BOOTS = ITEMS.register("yggs_boots", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));

    public static final RegistryObject<Item> OHLY_HELMET = ITEMS.register("ohly_helmet", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item> OHLY_CHESTPLATE = ITEMS.register("ohly_chestplate", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item> OHLY_LEGGINGS = ITEMS.register("ohly_leggings", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item> OHLY_BOOTS = ITEMS.register("ohly_boots", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));

    public static final RegistryObject<Item> BLUE_DRAGCITE_HELMET = ITEMS.register("blue_dragcite_helmet", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item> BLUE_DRAGCITE_CHESTPLATE = ITEMS.register("blue_dragcite_chestplate", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item> BLUE_DRAGCITE_LEGGINGS = ITEMS.register("blue_dragcite_leggings", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item> BLUE_DRAGCITE_BOOTS = ITEMS.register("blue_dragcite_boots", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));

    public static final RegistryObject<Item> TARMENIS_HELMET = ITEMS.register("tarmenis_helmet", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item> TARMENIS_CHESTPLATE = ITEMS.register("tarmenis_chestplate", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item> TARMENIS_LEGGINGS = ITEMS.register("tarmenis_leggings", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item> TARMENIS_BOOTS = ITEMS.register("tarmenis_boots", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));

    public static final RegistryObject<Item> KHELSTONE_HELMET = ITEMS.register("khelstone_helmet", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item> KHELSTONE_CHESTPLATE = ITEMS.register("khelstone_chestplate", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item> KHELSTONE_LEGGINGS = ITEMS.register("khelstone_leggings", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item> KHELSTONE_BOOTS = ITEMS.register("khelstone_boots", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));

    public static final RegistryObject<Item> BAMIRITE_HELMET = ITEMS.register("bamirite_helmet", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item> BAMIRITE_CHESTPLATE = ITEMS.register("bamirite_chestplate", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item> BAMIRITE_LEGGINGS = ITEMS.register("bamirite_leggings", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item> BAMIRITE_BOOTS = ITEMS.register("bamirite_boots", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));

    public static final RegistryObject<Item> VIGNASS_HELMET = ITEMS.register("vignass_helmet", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item> VIGNASS_CHESTPLATE = ITEMS.register("vignass_chestplate", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item> VIGNASS_LEGGINGS = ITEMS.register("vignass_leggings", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item> VIGNASS_BOOTS = ITEMS.register("vignass_boots", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));

    public static final RegistryObject<Item> JEPERCKSTONE_HELMET = ITEMS.register("jeperckstone_helmet", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item> JEPERCKSTONE_CHESTPLATE = ITEMS.register("jeperckstone_chestplate", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item> JEPERCKSTONE_LEGGINGS = ITEMS.register("jeperckstone_leggings", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item> JEPERCKSTONE_BOOTS = ITEMS.register("jeperckstone_boots", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));

    public static final RegistryObject<Item> HELMINIUM_HELMET = ITEMS.register("helminium_helmet", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item> HELMINIUM_CHESTPLATE = ITEMS.register("helminium_chestplate", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item> HELMINIUM_LEGGINGS = ITEMS.register("helminium_leggings", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item> HELMINIUM_BOOTS = ITEMS.register("helminium_boots", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));

    public static final RegistryObject<Item> RAGOUTON_HELMET = ITEMS.register("ragouton_helmet", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item> RAGOUTON_CHESTPLATE = ITEMS.register("ragouton_chestplate", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item> RAGOUTON_LEGGINGS = ITEMS.register("ragouton_leggings", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item> RAGOUTON_BOOTS = ITEMS.register("ragouton_boots", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));

    public static final RegistryObject<Item> EISSELTE_HELMET = ITEMS.register("eisselte_helmet", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item> EISSELTE_CHESTPLATE = ITEMS.register("eisselte_chestplate", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item> EISSELTE_LEGGINGS = ITEMS.register("eisselte_leggings", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item> EISSELTE_BOOTS = ITEMS.register("eisselte_boots", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
