package net.purpleore.client;

import java.util.Set;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.fml.client.IModGuiFactory;

public class GuiFactory implements IModGuiFactory {

	@Override
	public RuntimeOptionGuiHandler getHandlerFor(final RuntimeOptionCategoryElement element) {

		return null;
	}

	@Override
	public void initialize(final Minecraft minecraftInstance) {

	}

	@Override
	public Class<? extends GuiScreen> mainConfigGuiClass() {

		return ModGuiConfig.class;
	}

	@Override
	public Set<RuntimeOptionCategoryElement> runtimeGuiCategories() {

		return null;
	}

}
