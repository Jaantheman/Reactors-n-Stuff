
package com.jayden.reactornstuff.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import com.jayden.reactornstuff.itemgroup.ReactorsnstufftabItemGroup;
import com.jayden.reactornstuff.ReactorNStuffModElements;

@ReactorNStuffModElements.ModElement.Tag
public class CrystalLightItemItem extends ReactorNStuffModElements.ModElement {
	@ObjectHolder("reactor_n_stuff:crystal_light_item")
	public static final Item block = null;
	public CrystalLightItemItem(ReactorNStuffModElements instance) {
		super(instance, 11);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(ReactorsnstufftabItemGroup.tab).maxStackSize(64).rarity(Rarity.COMMON));
			setRegistryName("crystal_light_item");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}
