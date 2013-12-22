package billabrian6.items;

import billabrian6.items.armor.MortisHelm;
import net.minecraft.block.Block;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class Items {
	
	public static Item wand;
	public static Item sword;
	
	public static void init(){
		wand = new ItemWand(ItemInfo.WAND_ID);
		sword = new ItemSword(ItemInfo.SWORD_ID);
	}
	
	public static void addNames(){
		LanguageRegistry.addName(wand, ItemInfo.WAND_NAME);
		LanguageRegistry.addName(sword, ItemInfo.SWORD_NAME);
	}
	
	public static void registerRecipes(){
		GameRegistry.addShapedRecipe(new ItemStack(wand), new Object[] { " xx", " /x", "/  ", 'x', Item.diamond, '/', Item.stick});
		GameRegistry.addShapedRecipe(new ItemStack(sword), new Object[] {" zy", "zyz", "xz ", 'x', Item.swordIron, 'y' ,Item.emerald, 'z', Item.ingotIron});
	}
}
