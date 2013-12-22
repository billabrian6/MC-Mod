package billabrian6;

import billabrian6.config.ConfigHandler;
import billabrian6.items.Items;
import billabrian6.items.armor.Armor;
import billabrian6.network.PacketHandler;
import billabrian6.proxies.CommonProxy;
import billabrian6.recipes.Recipes;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;

@Mod(modid = ModInformation.ID, name = ModInformation.NAME, version = ModInformation.VERSION)
@NetworkMod(channels = {ModInformation.CHANNEL}, clientSideRequired = true, serverSideRequired = false, packetHandler = PacketHandler.class)
public class MyMod {
	
	@Instance("MyMod")
	public static MyMod instance;
	
	@SidedProxy(clientSide = "billabrian6.proxies.ClientProxy", serverSide = "billabrian6.proxies.CommonProxy")
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event){
		ConfigHandler.init(event.getSuggestedConfigurationFile());
		Items.init();
		Armor.init();
		
		proxy.initSounds();
		proxy.initRenderers();
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event){
		Items.addNames();
		Items.registerRecipes();
		Armor.addNames();
		Armor.registerRecipes();
		Recipes.registerRecipes();
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event){
		
	}
}

