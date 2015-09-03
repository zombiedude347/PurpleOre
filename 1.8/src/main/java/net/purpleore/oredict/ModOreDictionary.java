package net.purpleore.oredict;

import net.minecraftforge.oredict.OreDictionary;
import net.purpleore.init.ModBlocks;
import net.purpleore.init.ModItems;

public class ModOreDictionary {
	public static void init() {
		OreDictionary.registerOre("blockPurple", ModBlocks.blockPurple);
		OreDictionary.registerOre("blockFlamestone", ModBlocks.blockFlame);
		OreDictionary.registerOre("orePurple", ModBlocks.orePurple);
		OreDictionary.registerOre("oreFlamestone", ModBlocks.oreFlame);
		OreDictionary.registerOre("ingotPurple", ModItems.ingotPurple);
		OreDictionary.registerOre("ingotFlamestone", ModItems.ingotFlame);
		OreDictionary.registerOre("nuggetPurple", ModItems.nuggetPurple);
		OreDictionary.registerOre("stickPurple", ModItems.stickPurple);
	}
}
