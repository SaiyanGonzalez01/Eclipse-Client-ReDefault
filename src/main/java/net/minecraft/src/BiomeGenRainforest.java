package net.minecraft.src;

public class BiomeGenRainforest extends BiomeGenBase {
	public WorldGenerator getRandomWorldGenForTrees(Random var1) {
		return (WorldGenerator)(var1.nextInt(3) == 0 ? new WorldGenBigTree() : new WorldGenTrees());
	}

	public int getSkyColorByTemp(float var1) {
		return 1120580;
	}
}
