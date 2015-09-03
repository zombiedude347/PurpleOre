package net.purpleore.item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemSpade;
import net.purpleore.PurpleOreCore;

public class ShovelPurple extends ItemSpade {
	private final String name;

	public ShovelPurple(final Item.ToolMaterial p_i45353_1_) {
		super(p_i45353_1_);
		setCreativeTab(PurpleOreCore.tabPurple);
		name = "shovelPurple";
		setUnlocalizedName(name);
	}
}
