package billabrian6.config;

import java.io.File;

import billabrian6.items.ItemInfo;
import billabrian6.items.armor.ArmorInfo;
import net.minecraftforge.common.Configuration;

public class ConfigHandler {
		
	
	public static void init(File file){
		Configuration config = new Configuration(file);
		
		config.load();
		
		ItemInfo.WAND_ID = config.getItem(ItemInfo.WAND_KEY, ItemInfo.WAND_DEFAULT).getInt() - 256;
		ItemInfo.SWORD_ID = config.getItem(ItemInfo.SWORD_KEY, ItemInfo.SWORD_DEFAUlT).getInt() - 256;
		ArmorInfo.MORTIS_HELM_ID = config.getItem(ArmorInfo.MORTIS_HELM_KEY,  ArmorInfo.MORTIS_HELM_DEFAULT).getInt() - 256;
		ArmorInfo.MORTIS_CHEST_ID = config.getItem(ArmorInfo.MORTIS_CHEST_KEY, ArmorInfo.MORTIS_CHEST_DEFAULT).getInt() - 256;
		ArmorInfo.MORTIS_LEGS_ID = config.getItem(ArmorInfo.MORTIS_LEGS_KEY, ArmorInfo.MORTIS_LEGS_DEFAULT).getInt() - 256;
		ArmorInfo.MORTIS_BOOTS_ID = config.getItem(ArmorInfo.MORTIS_BOOTS_KEY, ArmorInfo.MORTIS_BOOTS_DEFAULT).getInt() - 256;
		
		config.save();
		
	}
}
