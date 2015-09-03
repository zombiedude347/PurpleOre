package net.purpleore.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockCompressed;
import net.minecraft.block.material.MapColor;
import net.minecraft.util.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.purpleore.PurpleOreCore;

public class BlockPurple extends BlockCompressed {
	private final String name = "blockPurple";

	public BlockPurple() {
		super(MapColor.purpleColor);
		GameRegistry.registerBlock(this, name);
		setCreativeTab(PurpleOreCore.tabPurple);
		setUnlocalizedName(name);
		setHardness(5.0F);
		setResistance(10.0F);
		setStepSound(Block.soundTypeMetal);
		this.setHarvestLevel("pickaxe", 3);
	}

	public String getName() {
		return name;
	}

	@Override
	public boolean isBeaconBase(final IBlockAccess worldObj, final BlockPos pos, final BlockPos beacon) {
		return true;
	}
}