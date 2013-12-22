package billabrian6.items.armor;

import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemArmor;
import billabrian6.items.armor.ArmorInfo;

public class Armor {
	
	public static ItemArmor mortisHelm;
	public static ItemArmor mortisChest;
	public static ItemArmor mortisLegs;
	public static ItemArmor mortisBoots;


	public static void init(){
		mortisHelm = new MortisHelm(ArmorInfo.MORTIS_HELM_ID, EnumArmorMaterial.GOLD, 4, 0);
		mortisChest = new MortisChest(ArmorInfo.MORTIS_CHEST_ID, EnumArmorMaterial.GOLD, 4, 1);
		mortisLegs = new MortisLegs(ArmorInfo.MORTIS_LEGS_ID, EnumArmorMaterial.GOLD, 4, 2);
		mortisBoots = new MortisLegs(ArmorInfo.MORTIS_BOOTS_ID, EnumArmorMaterial.GOLD, 4, 3);

	}
	
	public static void addNames(){
		LanguageRegistry.addName(mortisHelm, ArmorInfo.MORTIS_HELM_NAME);
		LanguageRegistry.addName(mortisChest, ArmorInfo.MORTIS_CHEST_NAME);
		LanguageRegistry.addName(mortisLegs, ArmorInfo.MORTIS_LEGS_NAME);
		LanguageRegistry.addName(mortisBoots, ArmorInfo.MORTIS_BOOTS_NAME);
		
	}
	
	public static void registerRecipes(){
		
	}
}
