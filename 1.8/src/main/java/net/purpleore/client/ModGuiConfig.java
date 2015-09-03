package net.purpleore.client;

import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.client.config.GuiConfig;
import net.purpleore.handler.ConfigurationHandler;
import net.purpleore.reference.Reference;

public class ModGuiConfig extends GuiConfig {
	private ModGuiConfig(final GuiScreen parentScreen) {
		super(parentScreen,
				new ConfigElement(ConfigurationHandler.configuration.getCategory(Configuration.CATEGORY_GENERAL))
						.getChildElements(),
				Reference.MOD_ID, false, false,
				GuiConfig.getAbridgedConfigPath(ConfigurationHandler.configuration.toString()));
	}
}