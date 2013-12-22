package billabrian6.items.armor;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemArmor;

public class MortisLegs extends ItemArmor{

	public MortisLegs(int par1, EnumArmorMaterial par2EnumArmorMaterial, int par3, int par4) {
		super(par1, par2EnumArmorMaterial, par3, par4);
		setCreativeTab(CreativeTabs.tabCombat);
		setMaxStackSize(1);
		setUnlocalizedName(ArmorInfo.MORTIS_LEGS_UNLOCALIZED_NAME);
	}
	
	@Override
	public void registerIcons(IconRegister register) {
		itemIcon = register.registerIcon(ArmorInfo.TEXTURE_LOCATION + ":" + ArmorInfo.MORTIS_HELM_ICON);
	}
	
}
