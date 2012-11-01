package mortenMod;

import java.util.Random;

import net.minecraft.src.Block;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.Material;

public class MortenOre extends Block {
	
	public MortenOre(int id, int texture, Material material) {
		super(id, texture, material);
		
		setHardness(4.0F); // 33% harder than diamond
		setStepSound(Block.soundStoneFootstep);
		setBlockName("genericOre");
		setCreativeTab(CreativeTabs.tabBlock);
	}
	@Override
	public String getTextureFile () {
		return CommonProxy.BLOCK_PNG;
	}
	/*
	public int idDropped(int par1, Random random, int par2) {
		return MortensModRenameFort.genericIngot.shiftedIndex;
	}
*/
}
