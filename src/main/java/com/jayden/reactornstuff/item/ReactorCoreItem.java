
package com.jayden.reactornstuff.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import com.jayden.reactornstuff.itemgroup.ReactorsnstufftabItemGroup;
import com.jayden.reactornstuff.ReactorNStuffModElements;

@ReactorNStuffModElements.ModElement.Tag
public class ReactorCoreItem extends ReactorNStuffModElements.ModElement {
	@ObjectHolder("reactor_n_stuff:reactor_core")
	public static final Item block = null;
	public ReactorCoreItem(ReactorNStuffModElements instance) {
		super(instance, 10);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(ReactorsnstufftabItemGroup.tab).maxStackSize(16).rarity(Rarity.COMMON));
			setRegistryName("reactor_core");
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
