package billabrian6.items;

import java.util.List;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemWand extends Item {

	@SideOnly(Side.CLIENT)
	private Icon chargedIcon;
	
	public ItemWand(int id) {
		super(id);
		setCreativeTab(CreativeTabs.tabCombat);
		setMaxStackSize(1);
		setUnlocalizedName(ItemInfo.WAND_UNLOCALIZED_NAME);
		
	}

	@Override
	public boolean onLeftClickEntity(ItemStack itemstack, EntityPlayer player, Entity entity){
		if(entity.worldObj.isRemote){
			return false;
		}
		
		if(entity instanceof EntityCreeper){
			entity.motionX = 5;
			//entity.setFire(5000);
		}
		
		
		return false;
		
	}
	
	@Override
	public boolean itemInteractionForEntity(ItemStack itemstack, EntityPlayer player, EntityLivingBase entity) {
		if (entity.worldObj.isRemote) {
			return false;
		}

		if (entity instanceof EntityCreeper) {
			entity.motionY = 2;
			if(isCharged(itemstack.getItemDamage())){
				entity.motionX = (entity.posX - player.posX) * 2;
				entity.motionZ = (entity.posZ - player.posZ) * 2;
				itemstack.setItemDamage(0);
			}
			itemstack.setItemDamage(itemstack.getItemDamage() + 1);
		} 

		return false;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister register) {
		itemIcon = register.registerIcon(ItemInfo.TEXTURE_LOCATION + ":"
				+ ItemInfo.WAND_ICON);
		chargedIcon = register.registerIcon(ItemInfo.TEXTURE_LOCATION + ":" + ItemInfo.WAND_CHARGED_ICON);
		
	}
	
	@Override 
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack itemstack, EntityPlayer player, List info, boolean useExtraInformation){
		info.add("This wand has been used " + itemstack.getItemDamage() + " times");
		
		if(isCharged(itemstack.getItemDamage())){
			info.add("This item is charged");
		}
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public Icon getIconFromDamage(int dmg){
		if(isCharged(dmg)){
			return chargedIcon;
		}else{
			return itemIcon;
		}
	}
	
	private boolean isCharged(int dmg){
		
		return dmg >= 10;
		
	}

}
