package net.purpleore.item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemAxe;
import net.purpleore.PurpleOreCore;

public class AxePurple extends ItemAxe {
	private final String name;

	public AxePurple(final Item.ToolMaterial materialPurple) {
		super(materialPurple);
		setCreativeTab(PurpleOreCore.tabPurple);
		name = "axePurple";
		setUnlocalizedName(name);
	}
}
