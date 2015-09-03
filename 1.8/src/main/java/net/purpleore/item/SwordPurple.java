package net.purpleore.item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemSword;
import net.purpleore.PurpleOreCore;

public class SwordPurple extends ItemSword {
	private final String name;

	public SwordPurple(final Item.ToolMaterial p_i45356_1_) {
		super(p_i45356_1_);
		setCreativeTab(PurpleOreCore.tabPurple);
		name = "swordPurple";
		setUnlocalizedName(name);
	}
}
