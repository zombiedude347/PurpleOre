package net.purpleore.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockCompressed;
import net.minecraft.block.material.MapColor;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.purpleore.PurpleOreCore;
import net.purpleore.init.ModBlocks;

public class BlockFlame extends BlockCompressed {
	private final String name = "blockFlame";

	public BlockFlame() {
		super(MapColor.tntColor);
		GameRegistry.registerBlock(ModBlocks.blockFlame, name);
		setCreativeTab(PurpleOreCore.tabPurple);
		setUnlocalizedName(name);
		setHardness(5.0F);
		setResistance(10.0F);
		setStepSound(Block.soundTypeMetal);
		this.setHarvestLevel("pickaxe", 4);
	}

	public String getName() {
		return name;
	}
}