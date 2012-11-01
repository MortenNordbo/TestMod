package mortenMod;

import net.minecraft.src.Block;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.EnumToolMaterial;
import net.minecraft.src.Item;
import net.minecraft.src.ItemStack;
import net.minecraft.src.Material;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.oredict.OreDictionary;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid="MortenMod", name="MortenMod", version="0.0.2")
@NetworkMod(clientSideRequired=true, serverSideRequired=false)
public class MortensModRenameFort {
	
	public static final Item MortenAxe = new MortenOks(5002, EnumToolMaterial.IRON).setMaxStackSize(1).setIconIndex(2).setItemName("Mortens Axe").setFull3D();
	
	
	public final static Block MobTrekker = new MortenBlock(502, 1, Material.iron).setBlockName("Mob Train").setCreativeTab(CreativeTabs.tabBlock).setHardness(0.5f);
	
	
	
        // The instance of your mod that Forge uses.
	@Instance("MortesnModRenameFort")
	public static MortensModRenameFort instance;
	
	// Says where the client and server 'proxy' code is loaded.
	@SidedProxy(clientSide="tutorial.generic.client.ClientProxy", serverSide="mortenMod.CommonProxy")
	public static CommonProxy proxy;
	
	@PreInit
	public void preInit(FMLPreInitializationEvent event) {
		// Stub Method
	}
	
	@Init
	public void load(FMLInitializationEvent event) {
		
		
		SetUp();
		proxy.registerRenderers();
	}
	
	private void SetUp() 
	{
		// TODO Auto-generated method stub
		RegistrerLang();
		
		MCForgeHarvest();
		
		GameRegis();
		
		OreDictRegis();
		
		Recipes();
	}

	

	@PostInit
	public void postInit(FMLPostInitializationEvent event) {
		// Stub Method
	}
	
	private void Recipes() {
		// TODO Auto-generated method stub
		ItemStack ironIngotStack = new ItemStack(Item.ingotIron);
		ItemStack stickStack = new ItemStack(Item.stick);
		
		GameRegistry.addRecipe(new ItemStack(MortenAxe), "xxx", "xyx", " y ", 'x', ironIngotStack, 'y', stickStack);
	}
	
	private void OreDictRegis() 
	{
		// TODO Auto-generated method stub

	}

	private void GameRegis() {
		// TODO Auto-generated method stub
		
		
		
	}

	private void MCForgeHarvest() {
		// TODO Auto-generated method stub
	}

	private void RegistrerLang() 
	{
		// TODO Auto-generated method stub
		LanguageRegistry.addName(MortenAxe, "Mortens Axe");
	}

}