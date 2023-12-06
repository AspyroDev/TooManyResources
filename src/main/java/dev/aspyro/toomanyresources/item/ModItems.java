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


    public static final RegistryObject<Item> MANXIUM_INGOT = ITEMS.register("ores/manxium/manxium_ingot", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> MANXIUM_NUGGET = ITEMS.register("ores/manxium/manxium_nugget", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> RAW_MANXIUM = ITEMS.register("ores/manxium/raw_manxium", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> RAW_MANXIUM_PIECE = ITEMS.register("ores/manxium/raw_manxium_piece", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> KIRIONITE_INGOT = ITEMS.register("ores/kirionite/kirionite_ingot", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> KIRIONITE_NUGGET = ITEMS.register("ores/kirionite/kirionite_nugget", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> RAW_KIRIONITE = ITEMS.register("ores/kirionite/raw_kirionite", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> RAW_KIRIONITE_PIECE = ITEMS.register("ores/kirionite/raw_kirionite_piece", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> SLITHESE_INGOT = ITEMS.register("ores/slithese/slithese_ingot", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> SLITHESE_NUGGET = ITEMS.register("ores/slithese/slithese_nugget", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> RAW_SLITHESE = ITEMS.register("ores/slithese/raw_slithese", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> RAW_SLITHESE_PIECE = ITEMS.register("ores/slithese/raw_slithese_piece", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> VOLUCIERA_INGOT = ITEMS.register("ores/voluciera/voluciera_ingot", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> VOLUCIERA_NUGGET = ITEMS.register("ores/voluciera/voluciera_nugget", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> RAW_VOLUCIERA = ITEMS.register("ores/voluciera/raw_voluciera", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> RAW_VOLUCIERA_PIECE = ITEMS.register("ores/voluciera/raw_voluciera_piece", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> YGGS_INGOT = ITEMS.register("ores/yggs/yggs_ingot", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> YGGS_NUGGET = ITEMS.register("ores/yggs/yggs_nugget", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> RAW_YGGS = ITEMS.register("ores/yggs/raw_yggs", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> RAW_YGGS_PIECE = ITEMS.register("ores/yggs/raw_yggs_piece", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> OHLY_INGOT = ITEMS.register("ores/ohly/ohly_ingot", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> OHLY_NUGGET = ITEMS.register("ores/ohly/ohly_nugget", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> RAW_OHLY = ITEMS.register("ores/ohly/raw_ohly", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> RAW_OHLY_PIECE = ITEMS.register("ores/ohly/raw_ohly_piece", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> MANXIUM_PICKAXE = ITEMS.register("tools/manxium/manxium_pickaxe", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> MANXIUM_AXE = ITEMS.register("tools/manxium/manxium_axe", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> MANXIUM_HOE = ITEMS.register("tools/manxium/manxium_hoe", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> MANXIUM_SHOVEL = ITEMS.register("tools/manxium/manxium_shovel", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> MANXIUM_SWORD = ITEMS.register("tools/manxium/manxium_sword", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));

    public static final RegistryObject<Item> KIRIONITE_PICKAXE = ITEMS.register("tools/kirionite/kirionite_pickaxe", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> KIRIONITE_AXE = ITEMS.register("tools/kirionite/kirionite_axe", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> KIRIONITE_HOE = ITEMS.register("tools/kirionite/kirionite_hoe", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> KIRIONITE_SHOVEL = ITEMS.register("tools/kirionite/kirionite_shovel", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> KIRIONITE_SWORD = ITEMS.register("tools/kirionite/kirionite_sword", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));

    public static final RegistryObject<Item> SLITHESE_PICKAXE = ITEMS.register("tools/slithese/slithese_pickaxe", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> SLITHESE_AXE = ITEMS.register("tools/slithese/slithese_axe", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> SLITHESE_HOE = ITEMS.register("tools/slithese/slithese_hoe", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> SLITHESE_SHOVEL = ITEMS.register("tools/slithese/slithese_shovel", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> SLITHESE_SWORD = ITEMS.register("tools/slithese/slithese_sword", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));

    public static final RegistryObject<Item> VOLUCIERA_PICKAXE = ITEMS.register("tools/voluciera/voluciera_pickaxe", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> VOLUCIERA_AXE = ITEMS.register("tools/voluciera/voluciera_axe", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> VOLUCIERA_HOE = ITEMS.register("tools/voluciera/voluciera_hoe", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> VOLUCIERA_SHOVEL = ITEMS.register("tools/voluciera/voluciera_shovel", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> VOLUCIERA_SWORD = ITEMS.register("tools/voluciera/voluciera_sword", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));

    public static final RegistryObject<Item> YGGS_PICKAXE = ITEMS.register("tools/yggs/yggs_pickaxe", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> YGGS_AXE = ITEMS.register("tools/yggs/yggs_axe", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> YGGS_HOE = ITEMS.register("tools/yggs/yggs_hoe", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> YGGS_SHOVEL = ITEMS.register("tools/yggs/yggs_shovel", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> YGGS_SWORD = ITEMS.register("tools/yggs/yggs_sword", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));

    public static final RegistryObject<Item> OHLY_PICKAXE = ITEMS.register("tools/ohly/ohly_pickaxe", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> OHLY_AXE = ITEMS.register("tools/ohly/ohly_axe", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> OHLY_HOE = ITEMS.register("tools/ohly/ohly_hoe", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> OHLY_SHOVEL = ITEMS.register("tools/ohly/ohly_shovel", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> OHLY_SWORD = ITEMS.register("tools/ohly/ohly_sword", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));

    public static final RegistryObject<Item> MANXIUM_HELMET = ITEMS.register("armory/manxium/manxium_helmet", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item> MANXIUM_CHESTPLATE = ITEMS.register("armory/manxium/manxium_chestplate", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item> MANXIUM_LEGGINGS = ITEMS.register("armory/manxium/manxium_leggings", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item> MANXIUM_BOOTS = ITEMS.register("armory/manxium/manxium_boots", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));

    public static final RegistryObject<Item> KIRIONITE_HELMET = ITEMS.register("armory/kirionite/kirionite_helmet", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item> KIRIONITE_CHESTPLATE = ITEMS.register("armory/kirionite/kirionite_chestplate", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item> KIRIONITE_LEGGINGS = ITEMS.register("armory/kirionite/kirionite_leggings", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item> KIRIONITE_BOOTS = ITEMS.register("armory/kirionite/kirionite_boots", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));

    public static final RegistryObject<Item> SLITHESE_HELMET = ITEMS.register("armory/slithese/slithese_helmet", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item> SLITHESE_CHESTPLATE = ITEMS.register("armory/slithese/slithese_chestplate", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item> SLITHESE_LEGGINGS = ITEMS.register("armory/slithese/slithese_leggings", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item> SLITHESE_BOOTS = ITEMS.register("armory/slithese/slithese_boots", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));

    public static final RegistryObject<Item> VOLUCIERA_HELMET = ITEMS.register("armory/voluciera/voluciera_helmet", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item> VOLUCIERA_CHESTPLATE = ITEMS.register("armory/voluciera/voluciera_chestplate", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item> VOLUCIERA_LEGGINGS = ITEMS.register("armory/voluciera/voluciera_leggings", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item> VOLUCIERA_BOOTS = ITEMS.register("armory/voluciera/voluciera_boots", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));

    public static final RegistryObject<Item> YGGS_HELMET = ITEMS.register("armory/yggs/yggs_helmet", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item> YGGS_CHESTPLATE = ITEMS.register("armory/yggs/yggs_chestplate", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item> YGGS_LEGGINGS = ITEMS.register("armory/yggs/yggs_leggings", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item> YGGS_BOOTS = ITEMS.register("armory/yggs/yggs_boots", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));

    public static final RegistryObject<Item> OHLY_HELMET = ITEMS.register("armory/ohly/ohly_helmet", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item> OHLY_CHESTPLATE = ITEMS.register("armory/ohly/ohly_chestplate", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item> OHLY_LEGGINGS = ITEMS.register("armory/ohly/ohly_leggings", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item> OHLY_BOOTS = ITEMS.register("armory/ohly/ohly_boots", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
