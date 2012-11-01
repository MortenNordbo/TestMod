package mortenMod;

import net.minecraft.src.CreativeTabs;
import net.minecraft.src.Item;

public class MortenItem extends Item {

	protected MortenItem(int id) {
		super(id);
		
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
