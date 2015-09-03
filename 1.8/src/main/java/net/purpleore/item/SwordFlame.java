
package net.purpleore.item;

import net.minecraft.item.ItemSword;
import net.purpleore.PurpleOreCore;
import net.purpleore.init.ModItems;

public class SwordFlame extends ItemSword {

	public SwordFlame() {
		super(ModItems.toolFlame);
		setCreativeTab(PurpleOreCore.tabPurple);
		setUnlocalizedName("swordFlame");
	}
}
