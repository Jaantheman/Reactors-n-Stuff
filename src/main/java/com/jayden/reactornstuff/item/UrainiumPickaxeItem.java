
package com.jayden.reactornstuff.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import com.jayden.reactornstuff.itemgroup.ReactorsnstufftabItemGroup;
import com.jayden.reactornstuff.ReactorNStuffModElements;

@ReactorNStuffModElements.ModElement.Tag
public class UrainiumPickaxeItem extends ReactorNStuffModElements.ModElement {
	@ObjectHolder("reactor_n_stuff:urainium_pickaxe")
	public static final Item block = null;
	public UrainiumPickaxeItem(ReactorNStuffModElements instance) {
		super(instance, 5);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new PickaxeItem(new IItemTier() {
			public int getMaxUses() {
				return 170;
			}

			public float getEfficiency() {
				return 8f;
			}

			public float getAttackDamage() {
				return 6f;
			}

			public int getHarvestLevel() {
				return 10;
			}

			public int getEnchantability() {
				return 5;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}
		}, 1, -3f, new Item.Properties().group(ReactorsnstufftabItemGroup.tab).isImmuneToFire()) {
		}.setRegistryName("urainium_pickaxe"));
	}
}
