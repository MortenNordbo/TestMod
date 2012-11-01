package mortenMod;

import net.minecraft.src.CreativeTabs;
import net.minecraft.src.EnumToolMaterial;
import net.minecraft.src.Item;
import net.minecraft.src.ItemAxe;

public class MortenOks extends ItemAxe {

	protected MortenOks(int id, EnumToolMaterial toolMaterial) {
		super(id, toolMaterial);
		
		// Constructor Configuration
		setMaxStackSize(64);
		setCreativeTab(CreativeTabs.tabMisc);
		setIconIndex(0);
		setItemName("genericItem");
	}
	public String getTextureFile () {
		return CommonProxy.ITEMS_PNG;
	}
}
