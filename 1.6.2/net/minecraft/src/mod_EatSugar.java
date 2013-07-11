package net.minecraft.src;

public class mod_EatSugar extends BaseMod
{
	public String getVersion()
	{
		return "1.6.2-1";
	}

	public void load()
	{
		Item.sugar = (new ItemFood(97, 2, 0.1F, false)).setUnlocalizedName("sugar").setPotionEffect(PotionHelper.sugarEffect).setCreativeTab(CreativeTabs.tabMaterials).func_111206_d("sugar");
	}
}
