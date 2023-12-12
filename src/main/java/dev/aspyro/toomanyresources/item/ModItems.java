package dev.aspyro.toomanyresources.item;

import dev.aspyro.toomanyresources.TooManyResources;
import net.minecraft.world.item.*;
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

    public static final RegistryObject<Item> MANXIUM_PICKAXE = ITEMS.register("manxium_pickaxe", () -> new PickaxeItem(Tiers.IRON, 1, -2.8F, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> MANXIUM_AXE = ITEMS.register("manxium_axe", () -> new AxeItem(Tiers.IRON, 6, -3.1F, (new Item.Properties()).tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> MANXIUM_HOE = ITEMS.register("manxium_hoe", () -> new HoeItem(Tiers.IRON, -2, -1.0F, (new Item.Properties()).tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> MANXIUM_SHOVEL = ITEMS.register("manxium_shovel", () -> new ShovelItem(Tiers.IRON, 1.5F, -3.0F, (new Item.Properties()).tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> MANXIUM_SWORD = ITEMS.register("manxium_sword", () -> new SwordItem(Tiers.IRON, 3, -2.4F, (new Item.Properties()).tab(CreativeModeTab.TAB_COMBAT)));

    public static final RegistryObject<Item> KIRIONITE_PICKAXE = ITEMS.register("kirionite_pickaxe", () -> new PickaxeItem(Tiers.IRON, 1, -2.8F, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> KIRIONITE_AXE = ITEMS.register("kirionite_axe", () -> new AxeItem(Tiers.IRON, 6, -3.1F, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> KIRIONITE_HOE = ITEMS.register("kirionite_hoe", () -> new HoeItem(Tiers.IRON, -2, -1.0F, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> KIRIONITE_SHOVEL = ITEMS.register("kirionite_shovel", () -> new ShovelItem(Tiers.IRON, 1.5F, -3.0F, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> KIRIONITE_SWORD = ITEMS.register("kirionite_sword", () -> new SwordItem(Tiers.IRON, 3, -2.4F, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));

    public static final RegistryObject<Item> SLITHESE_PICKAXE = ITEMS.register("slithese_pickaxe", () -> new PickaxeItem(Tiers.IRON, 1, -2.8F, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> SLITHESE_AXE = ITEMS.register("slithese_axe", () -> new AxeItem(Tiers.IRON, 6, -3.1F, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> SLITHESE_HOE = ITEMS.register("slithese_hoe", () -> new HoeItem(Tiers.IRON, -2, -1.0F, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> SLITHESE_SHOVEL = ITEMS.register("slithese_shovel", () -> new ShovelItem(Tiers.IRON, 1.5F, -3.0F, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> SLITHESE_SWORD = ITEMS.register("slithese_sword", () -> new SwordItem(Tiers.IRON, 3, -2.4F, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));

    public static final RegistryObject<Item> VOLUCIERA_PICKAXE = ITEMS.register("voluciera_pickaxe", () -> new PickaxeItem(Tiers.IRON, 1, -2.8F, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> VOLUCIERA_AXE = ITEMS.register("voluciera_axe", () -> new AxeItem(Tiers.IRON, 6, -3.1F, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> VOLUCIERA_HOE = ITEMS.register("voluciera_hoe", () -> new HoeItem(Tiers.IRON, -2, -1.0F, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> VOLUCIERA_SHOVEL = ITEMS.register("voluciera_shovel", () -> new ShovelItem(Tiers.IRON, 1.5F, -3.0F, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> VOLUCIERA_SWORD = ITEMS.register("voluciera_sword", () -> new SwordItem(Tiers.IRON, 3, -2.4F, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));

    public static final RegistryObject<Item> YGGS_PICKAXE = ITEMS.register("yggs_pickaxe", () -> new PickaxeItem(Tiers.IRON, 1, -2.8F, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> YGGS_AXE = ITEMS.register("yggs_axe", () -> new AxeItem(Tiers.IRON, 6, -3.1F, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> YGGS_HOE = ITEMS.register("yggs_hoe", () -> new HoeItem(Tiers.IRON, -2, -1.0F, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> YGGS_SHOVEL = ITEMS.register("yggs_shovel", () -> new ShovelItem(Tiers.IRON, 1.5F, -3.0F, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> YGGS_SWORD = ITEMS.register("yggs_sword", () -> new SwordItem(Tiers.IRON, 3, -2.4F, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));

    public static final RegistryObject<Item> OHLY_PICKAXE = ITEMS.register("ohly_pickaxe", () -> new PickaxeItem(Tiers.IRON, 1, -2.8F, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> OHLY_AXE = ITEMS.register("ohly_axe", () -> new AxeItem(Tiers.IRON, 6, -3.1F, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> OHLY_HOE = ITEMS.register("ohly_hoe", () -> new HoeItem(Tiers.IRON, -2, -1.0F, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> OHLY_SHOVEL = ITEMS.register("ohly_shovel", () -> new ShovelItem(Tiers.IRON, 1.5F, -3.0F, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> OHLY_SWORD = ITEMS.register("ohly_sword", () -> new SwordItem(Tiers.IRON, 3, -2.4F, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));

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

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
