package net.purpleore.item;

import net.minecraft.item.ItemBow;
import net.purpleore.PurpleOreCore;

public class BowPurple extends ItemBow {
	private final String name;

	public BowPurple() {
		super();
		setMaxDamage(5000);
		setCreativeTab(PurpleOreCore.tabPurple);
		name = "bowPurple";
		setUnlocalizedName(name);
	}
}
