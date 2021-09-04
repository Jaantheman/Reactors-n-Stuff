
package com.jayden.reactornstuff.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import com.jayden.reactornstuff.ReactorNStuffModElements;

@ReactorNStuffModElements.ModElement.Tag
public class ReactorsnstufftabItemGroup extends ReactorNStuffModElements.ModElement {
	public ReactorsnstufftabItemGroup(ReactorNStuffModElements instance) {
		super(instance, 1);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabreactorsnstufftab") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(Items.SLIME_BALL);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}
	public static ItemGroup tab;
}
