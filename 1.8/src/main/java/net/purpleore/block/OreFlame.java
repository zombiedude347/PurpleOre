package net.purpleore.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockOre;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.purpleore.PurpleOreCore;

public class OreFlame extends BlockOre {
	private final String name = "oreFlame";

	public OreFlame() {
		super();
		GameRegistry.registerBlock(this, name);
		setCreativeTab(PurpleOreCore.tabPurple);
		setUnlocalizedName(name);
		setHardness(3.0F);
		setResistance(5.0F);
		setStepSound(Block.soundTypePiston);
		this.setHarvestLevel("pickaxe", 4);
	}

	public String getName() {
		return name;
	}
}
