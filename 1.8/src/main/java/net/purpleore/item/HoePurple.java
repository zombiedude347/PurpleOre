package net.purpleore.item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemHoe;
import net.purpleore.PurpleOreCore;

public class HoePurple extends ItemHoe {
	private final String name;

	public HoePurple(final Item.ToolMaterial p_i45343_1_) {
		super(p_i45343_1_);
		setCreativeTab(PurpleOreCore.tabPurple);
		name = "hoePurple";
		setUnlocalizedName(name);
	}
}
