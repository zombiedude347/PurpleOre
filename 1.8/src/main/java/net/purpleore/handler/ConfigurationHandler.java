package net.purpleore.handler;

import java.io.File;

import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.purpleore.reference.Reference;

public class ConfigurationHandler {

	public static int oreMaxVeinSize;
	public static Configuration configuration;
	public static int oreSpawnTries;
	public static int oreMinY;
	public static int oreMaxY;

	public static void init(final File suggestedConfigurationFile) {
		if (ConfigurationHandler.configuration == null)
			ConfigurationHandler.configuration = new Configuration(suggestedConfigurationFile);
		ConfigurationHandler.loadConfiguration();
	}

	private static void loadConfiguration() {
		ConfigurationHandler.oreMaxVeinSize = ConfigurationHandler.configuration
				.get(Configuration.CATEGORY_GENERAL, "oreMaxVeinSize", 4, "").getInt(4);
		ConfigurationHandler.oreSpawnTries = ConfigurationHandler.configuration
				.get(Configuration.CATEGORY_GENERAL, "oreSpawnTries", 1, "").getInt(1);
		ConfigurationHandler.oreMinY = ConfigurationHandler.configuration
				.get(Configuration.CATEGORY_GENERAL, "oreMinY", 0, "").getInt(0);
		ConfigurationHandler.oreMaxY = ConfigurationHandler.configuration
				.get(Configuration.CATEGORY_GENERAL, "oreMaxY", 10, "").getInt(10);
		if (ConfigurationHandler.configuration.hasChanged())
			ConfigurationHandler.configuration.save();
	}

	@SubscribeEvent
	public void onConfigurationChangedEvent(final ConfigChangedEvent.OnConfigChangedEvent event) {
		if (event.modID.equalsIgnoreCase(Reference.MOD_ID))
			ConfigurationHandler.loadConfiguration();
	}
}
