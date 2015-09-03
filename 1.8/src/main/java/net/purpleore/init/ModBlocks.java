package net.purpleore.init;

import net.purpleore.block.BlockFlame;
import net.purpleore.block.BlockPurple;
import net.purpleore.block.OreFlame;
import net.purpleore.block.OrePurple;

public class ModBlocks {
	public static BlockPurple blockPurple;
	public static BlockFlame blockFlame;
	public static OrePurple orePurple;
	public static OreFlame oreFlame;

	public static void init() {
		ModBlocks.blockPurple = new BlockPurple();
		ModBlocks.blockFlame = new BlockFlame();
		ModBlocks.orePurple = new OrePurple();
		ModBlocks.oreFlame = new OreFlame();

	}
}
