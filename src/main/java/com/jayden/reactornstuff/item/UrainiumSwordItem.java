
package com.jayden.reactornstuff.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import com.jayden.reactornstuff.itemgroup.ReactorsnstufftabItemGroup;
import com.jayden.reactornstuff.ReactorNStuffModElements;

@ReactorNStuffModElements.ModElement.Tag
public class UrainiumSwordItem extends ReactorNStuffModElements.ModElement {
	@ObjectHolder("reactor_n_stuff:urainium_sword")
	public static final Item block = null;
	public UrainiumSwordItem(ReactorNStuffModElements instance) {
		super(instance, 6);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 100;
			}

			public float getEfficiency() {
				return 4f;
			}

			public float getAttackDamage() {
				return 6f;
			}

			public int getHarvestLevel() {
				return 1;
			}

			public int getEnchantability() {
				return 2;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}
		}, 3, -3f, new Item.Properties().group(ReactorsnstufftabItemGroup.tab)) {
		}.setRegistryName("urainium_sword"));
	}
}
