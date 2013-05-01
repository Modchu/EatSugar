package net.minecraft.src;

public class mod_EatSugar extends BaseMod
{
	public String getVersion()
	{
		return "1.4.6~7-1";
	}

	public void load()
	{
		Item.sugar = (new ItemFood(97, 2, 0.1F, false)).setIconCoord(13, 0).setItemName("sugar").setPotionEffect(PotionHelper.sugarEffect).setCreativeTab(CreativeTabs.tabMaterials);
	}
}
