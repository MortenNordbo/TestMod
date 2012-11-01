package mortenMod;

import net.minecraft.src.Block;
import net.minecraft.src.Material;

public class MortenBlock extends Block {

	public MortenBlock(int id, int texture, Material material) {
		super(id, texture, material);
		// TODO Auto-generated constructor stub
	}
	@Override
	public String getTextureFile () {
		return CommonProxy.BLOCK_PNG;
	}
}
