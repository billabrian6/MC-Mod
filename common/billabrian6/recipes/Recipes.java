package billabrian6.recipes;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class Recipes {
	
	public static void registerRecipes(){
		GameRegistry.addShapelessRecipe(new ItemStack(Item.diamond, 64), Block.dirt);
	}

}
