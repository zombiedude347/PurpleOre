package net.purpleore.item;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import net.purpleore.PurpleOreCore;
import net.purpleore.init.ModItems;

public class ArmorPurple extends ItemArmor {

	private String name;

	public ArmorPurple(final int slot) {
		super(ModItems.armorPurple, ModItems.purpleArmorID, slot);

		if (slot == 0) {
			setCreativeTab(PurpleOreCore.tabPurple);
			name = "helmetPurple";
			setUnlocalizedName(name);
		}
		if (slot == 1) {
			setCreativeTab(PurpleOreCore.tabPurple);
			name = "chestplatePurple";
			setUnlocalizedName(name);
		}
		if (slot == 2) {
			setCreativeTab(PurpleOreCore.tabPurple);
			name = "leggingsPurple";
			setUnlocalizedName(name);
		}
		if (slot == 3) {
			setCreativeTab(PurpleOreCore.tabPurple);
			name = "bootsPurple";
			setUnlocalizedName(name);
		}
	}

	@Override
	public void onArmorTick(final World world, final EntityPlayer player, final ItemStack itemStack) {
		super.onArmorTick(world, player, itemStack);
		final ItemStack boots = player.inventory.armorItemInSlot(0);
		final ItemStack pants = player.inventory.armorItemInSlot(1);
		final ItemStack chest = player.inventory.armorItemInSlot(2);
		final ItemStack head = player.inventory.armorItemInSlot(3);

		if (boots != null && boots.getItem() == ModItems.bootsPurple && pants != null
				&& pants.getItem() == ModItems.leggingsPurple && chest != null
				&& chest.getItem() == ModItems.chestplatePurple && head != null
				&& head.getItem() == ModItems.helmetPurple)
			player.addPotionEffect(new PotionEffect(Potion.resistance.id, 0, 2));
	}
}
