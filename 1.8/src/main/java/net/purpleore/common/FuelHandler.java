package net.purpleore.common;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.IFuelHandler;
import net.purpleore.init.ModItems;

public class FuelHandler implements IFuelHandler {
	@Override
	public int getBurnTime(final ItemStack fuel) {
		if (fuel.getItem() == ModItems.coalPurple)
			return 1800;
		return 0;
	}
}
