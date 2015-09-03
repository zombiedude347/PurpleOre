package net.purpleore.item.crafting;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.purpleore.init.ModBlocks;
import net.purpleore.init.ModItems;

public class CraftingManager {
	public static void init() {
		GameRegistry.addRecipe(new ItemStack(ModBlocks.blockPurple),
				new Object[] { "PPP", "PPP", "PPP", Character.valueOf('P'), ModItems.ingotPurple });
		GameRegistry.addRecipe(new ItemStack(ModBlocks.blockFlame),
				new Object[] { "FFF", "FFF", "FFF", Character.valueOf('F'), ModItems.ingotFlame });
		GameRegistry.addRecipe(new ItemStack(ModItems.axePurple), new Object[] { "PP", "PS", " S",
				Character.valueOf('P'), ModItems.ingotPurple, Character.valueOf('S'), ModItems.stickPurple });
		GameRegistry.addRecipe(new ItemStack(ModItems.axeFlame), new Object[] { "FF", "FS", " s",
				Character.valueOf('F'), ModItems.ingotFlame, Character.valueOf('S'), ModItems.stickFlame });
		GameRegistry.addRecipe(new ItemStack(ModItems.bootsPurple),
				new Object[] { "P P", "P P", Character.valueOf('P'), ModItems.ingotPurple });
		GameRegistry.addRecipe(new ItemStack(ModItems.bootsFlame),
				new Object[] { "F F", "F F", Character.valueOf('F'), ModItems.ingotFlame });
		GameRegistry.addRecipe(new ItemStack(ModItems.chestplatePurple),
				new Object[] { "P P", "PPP", "PPP", Character.valueOf('P'), ModItems.ingotPurple });
		GameRegistry.addRecipe(new ItemStack(ModItems.chestplateFlame),
				new Object[] { "F F", "FFF", "FFF", Character.valueOf('F'), ModItems.ingotFlame });
		GameRegistry.addRecipe(new ItemStack(ModItems.helmetPurple),
				new Object[] { "PPP", "P P", Character.valueOf('P'), ModItems.ingotPurple });
		GameRegistry.addRecipe(new ItemStack(ModItems.helmetFlame),
				new Object[] { "FFF", "F F", Character.valueOf('F'), ModItems.ingotFlame });
		GameRegistry.addRecipe(new ItemStack(ModItems.hoePurple), new Object[] { "PP", " S", " S",
				Character.valueOf('P'), ModItems.ingotPurple, Character.valueOf('S'), ModItems.stickPurple });
		GameRegistry.addRecipe(new ItemStack(ModItems.leggingsPurple),
				new Object[] { "PPP", "P P", "P P", Character.valueOf('P'), ModItems.ingotPurple });
		GameRegistry.addRecipe(new ItemStack(ModItems.leggingsFlame),
				new Object[] { "FFF", "F F", "F F", Character.valueOf('F'), ModItems.ingotFlame });
		GameRegistry.addRecipe(new ItemStack(ModItems.pickaxePurple), new Object[] { "PPP", " S ", " S ",
				Character.valueOf('P'), ModItems.ingotPurple, Character.valueOf('S'), ModItems.stickPurple });
		GameRegistry.addRecipe(new ItemStack(ModItems.shovelPurple), new Object[] { "P", "S", "S",
				Character.valueOf('P'), ModItems.ingotPurple, Character.valueOf('S'), ModItems.stickPurple });
		GameRegistry.addRecipe(new ItemStack(ModItems.swordPurple), new Object[] { "P", "P", "S",
				Character.valueOf('P'), ModItems.ingotPurple, Character.valueOf('S'), ModItems.stickPurple });
		ItemStack swordFlame = new ItemStack(ModItems.swordFlame);
		swordFlame.addEnchantment(Enchantment.fireAspect, 3);
		GameRegistry.addRecipe(swordFlame, new Object[] { "F", "F", "S", Character.valueOf('F'), ModItems.ingotFlame,
				Character.valueOf('S'), ModItems.stickFlame });
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.ingotPurple, 9),
				new Object[] { new ItemStack(ModBlocks.blockPurple) });
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.ingotFlame, 9),
				new Object[] { new ItemStack(ModBlocks.blockFlame) });
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.nuggetPurple, 9),
				new Object[] { new ItemStack(ModItems.ingotPurple) });
		GameRegistry.addRecipe(new ItemStack(ModItems.coalPurple), new Object[] { " P ", "PCP", " P ",
				Character.valueOf('P'), ModItems.nuggetPurple, Character.valueOf('C'), Items.coal });
		GameRegistry.addRecipe(new ItemStack(ModItems.ingotPurple),
				new Object[] { "PPP", "PPP", "PPP", Character.valueOf('P'), ModItems.nuggetPurple });
		GameRegistry.addRecipe(new ItemStack(ModItems.stickPurple),
				new Object[] { "N", "N", Character.valueOf('N'), ModItems.nuggetPurple });
		GameRegistry.addRecipe(new ItemStack(ModItems.stickFlame),
				new Object[] { "N", "N", Character.valueOf('N'), ModItems.nuggetFlame });
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.nuggetPurple, 2),
				new Object[] { new ItemStack(ModItems.stickPurple) });
		GameRegistry.addRecipe(new ItemStack(ModItems.bowPurple), new Object[] { " PS", "P S", " PS",
				Character.valueOf('P'), ModItems.stickPurple, Character.valueOf('S'), Items.string });

	}
}
