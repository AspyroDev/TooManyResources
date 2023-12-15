package dev.aspyro.toomanyresources;

import dev.aspyro.toomanyresources.item.ModItems;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.LazyLoadedValue;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.function.Supplier;

public enum ModArmorMaterials implements ArmorMaterial {

    BAMIRITE("bamirite", 15, new int[]{2, 5, 6, 2}, 9, SoundEvents.ARMOR_EQUIP_IRON,
            0.0F, 0.0F, () -> Ingredient.of(ModItems.BAMIRITE_INGOT.get())),
    BLUE_DRAGCITE("blue_dragcite", 15, new int[]{2, 5, 6, 2}, 9, SoundEvents.ARMOR_EQUIP_IRON,
            0.0F, 0.0F, () -> Ingredient.of(ModItems.BLUE_DRAGCITE_INGOT.get())),
    EISSELTE("eisselte", 15, new int[]{2, 5, 6, 2}, 9, SoundEvents.ARMOR_EQUIP_IRON,
            0.0F, 0.0F, () -> Ingredient.of(ModItems.EISSELTE_INGOT.get())),
    HELMINIUM("helminium", 15, new int[]{2, 5, 6, 2}, 9, SoundEvents.ARMOR_EQUIP_IRON,
            0.0F, 0.0F, () -> Ingredient.of(ModItems.HELMINIUM_INGOT.get())),
    JEPERCKSTONE("jeperckstone", 15, new int[]{2, 5, 6, 2}, 9, SoundEvents.ARMOR_EQUIP_IRON,
            0.0F, 0.0F, () -> Ingredient.of(ModItems.JEPERCKSTONE_INGOT.get())),
    KHELSTONE("khelstone", 15, new int[]{2, 5, 6, 2}, 9, SoundEvents.ARMOR_EQUIP_IRON,
            0.0F, 0.0F, () -> Ingredient.of(ModItems.KHELSTONE_INGOT.get())),
    KIRIONITE("kirionite", 15, new int[]{2, 5, 6, 2}, 9, SoundEvents.ARMOR_EQUIP_IRON,
            0.0F, 0.0F, () -> Ingredient.of(ModItems.KIRIONITE_INGOT.get())),
    MANXIUM("manxium", 15, new int[]{2, 5, 6, 2}, 9, SoundEvents.ARMOR_EQUIP_IRON,
            0.0F, 0.0F, () -> Ingredient.of(ModItems.MANXIUM_INGOT.get())),
    OHLY("ohly", 15, new int[]{2, 5, 6, 2}, 9, SoundEvents.ARMOR_EQUIP_IRON,
            0.0F, 0.0F, () -> Ingredient.of(ModItems.OHLY_INGOT.get())),
    RAGOUTON("ragouton", 15, new int[]{2, 5, 6, 2}, 9, SoundEvents.ARMOR_EQUIP_IRON,
            0.0F, 0.0F, () -> Ingredient.of(ModItems.RAGOUTON_INGOT.get())),
    SLITHESE("slithese", 15, new int[]{2, 5, 6, 2}, 9, SoundEvents.ARMOR_EQUIP_IRON,
            0.0F, 0.0F, () -> Ingredient.of(ModItems.SLITHESE_INGOT.get())),
    TARMENIS("tarmenis", 15, new int[]{2, 5, 6, 2}, 9, SoundEvents.ARMOR_EQUIP_IRON,
            0.0F, 0.0F, () -> Ingredient.of(ModItems.TARMENIS_INGOT.get())),
    VIGNASS("vignass", 15, new int[]{2, 5, 6, 2}, 9, SoundEvents.ARMOR_EQUIP_IRON,
            0.0F, 0.0F, () -> Ingredient.of(ModItems.VIGNASS_INGOT.get())),
    VOLUCIERA("voluciera", 15, new int[]{2, 5, 6, 2}, 9, SoundEvents.ARMOR_EQUIP_IRON,
            0.0F, 0.0F, () -> Ingredient.of(ModItems.VOLUCIERA_INGOT.get())),
    YGGS("yggs", 15, new int[]{2, 5, 6, 2}, 9,
            SoundEvents.ARMOR_EQUIP_IRON, 0.0F, 0.0F,
            () -> Ingredient.of(ModItems.YGGS_INGOT.get()));

    private static final int[] HEALTH_PER_SLOT = new int[]{13, 15, 16, 11};
    private final String name;
    private final int durabilityMultiplier;
    private final int[] slotProtections;
    private final int enchantmentValue;
    private final SoundEvent sound;
    private final float toughness;
    private final float knockbackResistance;
    private final LazyLoadedValue<Ingredient> repairIngredient;

     ModArmorMaterials(String p_40474_, int p_40475_, int[] p_40476_, int p_40477_, SoundEvent p_40478_, float p_40479_, float p_40480_, Supplier<Ingredient> p_40481_) {
        this.name = p_40474_;
        this.durabilityMultiplier = p_40475_;
        this.slotProtections = p_40476_;
        this.enchantmentValue = p_40477_;
        this.sound = p_40478_;
        this.toughness = p_40479_;
        this.knockbackResistance = p_40480_;
        this.repairIngredient = new LazyLoadedValue<>(p_40481_);
    }

    public int getDurabilityForSlot(EquipmentSlot p_40484_) {
        return HEALTH_PER_SLOT[p_40484_.getIndex()] * this.durabilityMultiplier;
    }

    public int getDefenseForSlot(EquipmentSlot p_40487_) {
        return this.slotProtections[p_40487_.getIndex()];
    }

    public int getEnchantmentValue() {
        return this.enchantmentValue;
    }

    public SoundEvent getEquipSound() {
        return this.sound;
    }

    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }

    public String getName() {
        return TooManyResources.MOD_ID + ":" + this.name;
    }

    public float getToughness() {
        return this.toughness;
    }

    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }
}
