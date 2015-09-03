package net.purpleore.item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;
import net.purpleore.PurpleOreCore;

public class PickaxePurple extends ItemPickaxe {
	private final String name;

	public PickaxePurple(final Item.ToolMaterial p_i45347_1_) {
		super(p_i45347_1_);
		setCreativeTab(PurpleOreCore.tabPurple);
		name = "pickaxePurple";
		setUnlocalizedName(name);
	}
}
