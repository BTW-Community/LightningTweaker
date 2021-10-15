package net.minecraft.src;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

import net.minecraft.client.Minecraft;

public class LTMod extends FCAddOn {
	private static LTMod instance;
	
	public static boolean lightningFire = true;
	
	public LTMod() {
		super("Lightning Tweaker", "1.1.1", "LT");
		this.shouldVersionCheck = false;
	}
	
	public static LTMod getInstance() {
		if (instance == null) {
			instance = new LTMod();
		}
		return instance;
	}

	@Override
	public void Initialize() {
		FCAddOnHandler.LogMessage(this.getName() + " Version " + this.getVersionString() + " Initializing...");
		initCommands();
		FCAddOnHandler.LogMessage(this.getName() + " Initialized");
	}
	
	public void initCommands() {
		ServerCommandManager.registerAddonCommand(new LTCommandLightning());
	}
	
	@Override
	public FCAddOnUtilsWorldData createWorldData() {
		return new LTUtilsWorldData();
	}
}
