package net.minecraft.src;

public class LTUtilsWorldData implements FCAddOnUtilsWorldData {
	
	private LTMod lt = LTMod.getInstance();

	@Override
	public void saveWorldDataToNBT(WorldServer world, NBTTagCompound tag) {
	}

	@Override
	public void loadWorldDataFromNBT(WorldServer world, NBTTagCompound tag) {
	}

	@Override
	public void saveGlobalDataToNBT(WorldInfo info, NBTTagCompound tag) {
		tag.setBoolean("LightningFire", lt.lightningFire);
	}

	@Override
	public void loadGlobalDataFromNBT(WorldInfo info, NBTTagCompound tag) {
		if (tag.hasKey("LightningFire")) {
			lt.lightningFire = tag.getBoolean("LightningFire"); 
	    }
	}

	@Override
	public void copyGlobalData(WorldInfo oldInfo, WorldInfo newInfo) {
	}

	@Override
	public String getFilename() {
		return null;
	}

}
