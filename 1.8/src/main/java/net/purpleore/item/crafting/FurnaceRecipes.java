package net.purpleore.item.crafting;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.purpleore.init.ModBlocks;
import net.purpleore.init.ModItems;

public class FurnaceRecipes {
	public static void init() {
		GameRegistry.addSmelting(ModBlocks.orePurple, new ItemStack(ModItems.ingotPurple), 1.3F);
		GameRegistry.addSmelting(ModBlocks.oreFlame, new ItemStack(ModItems.ingotFlame), 1.3F);
	}
}
