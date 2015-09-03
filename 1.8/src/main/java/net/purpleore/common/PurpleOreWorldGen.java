package net.purpleore.common;

import java.util.Random;

import net.minecraft.block.state.pattern.BlockHelper;
import net.minecraft.init.Blocks;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;
import net.purpleore.handler.ConfigurationHandler;
import net.purpleore.init.ModBlocks;

public class PurpleOreWorldGen implements IWorldGenerator {
	private final WorldGenerator genPurpleOre;
	private final WorldGenMinable genFlameOre;

	public PurpleOreWorldGen() {
		this.genPurpleOre = new WorldGenMinable(ModBlocks.orePurple.getDefaultState(),
				ConfigurationHandler.oreMaxVeinSize);
		this.genFlameOre = new WorldGenMinable(ModBlocks.oreFlame.getDefaultState(), 8,
				BlockHelper.forBlock(Blocks.lava));
	}

	@Override
	public void generate(final Random random, final int chunkX, final int chunkZ, final World world,
			final IChunkProvider chunkGenerator, final IChunkProvider chunkProvider) {
		switch (world.provider.getDimensionId()) {
		case 0:
			this.runGenerator(genPurpleOre, world, random, chunkX, chunkZ, ConfigurationHandler.oreSpawnTries,
					ConfigurationHandler.oreMinY, ConfigurationHandler.oreMaxY);
			break;
		case -1:
			this.runGenerator(genFlameOre, world, random, chunkX, chunkZ, 1, 29, 31);
			break;
		case 1:
			break;
		}
	}

	private void runGenerator(WorldGenerator generator, World world, Random rand, int chunk_X, int chunk_Z,
			int chancesToSpawn, int minHeight, int maxHeight) {
		if (minHeight < 0 || maxHeight > 256 || minHeight > maxHeight) {
			throw new IllegalArgumentException("Illegal Height Arguments for WorldGenerator");
		}
		int heightDiff = maxHeight - minHeight + 1;
		for (int i = 0; i < chancesToSpawn; i++) {
			int x = chunk_X * 16 + rand.nextInt(16);
			int y = minHeight + rand.nextInt(heightDiff);
			int z = chunk_Z * 16 + rand.nextInt(16);
			generator.generate(world, rand, new BlockPos(x, y, z));
		}
	}
}