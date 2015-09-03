package net.purpleore.item;

import net.minecraft.item.Item;
import net.purpleore.PurpleOreCore;

public class ItemMod extends Item {
	public static String name;

	public static String getItemName() {
		return ItemMod.name;
	}

	public ItemMod(final String name) {
		super();
		setCreativeTab(PurpleOreCore.tabPurple);
		ItemMod.name = name;
		setUnlocalizedName(ItemMod.name);
	}
}