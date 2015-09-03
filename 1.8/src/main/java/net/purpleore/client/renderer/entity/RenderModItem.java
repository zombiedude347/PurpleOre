package net.purpleore.client.renderer.entity;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraft.client.resources.model.ModelManager;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.purpleore.PurpleOreCore;
import net.purpleore.init.ModItems;
import net.purpleore.reference.Reference;

public class RenderModItem extends RenderItem {

	public static void init() {
		RenderModItem.init(ModItems.helmetPurple);
		RenderModItem.init(ModItems.chestplatePurple);
		RenderModItem.init(ModItems.leggingsPurple);
		RenderModItem.init(ModItems.bootsPurple);
		RenderModItem.init(ModItems.axePurple);
		RenderModItem.init(ModItems.bowPurple);
		RenderModItem.init(ModItems.coalPurple);
		RenderModItem.init(ModItems.hoePurple);
		RenderModItem.init(ModItems.ingotPurple);
		RenderModItem.init(ModItems.ingotFlame);
		RenderModItem.init(ModItems.nuggetPurple);
		RenderModItem.init(ModItems.pickaxePurple);
		RenderModItem.init(ModItems.shovelPurple);
		RenderModItem.init(ModItems.stickPurple);
		RenderModItem.init(ModItems.swordPurple);
		RenderModItem.init(ModItems.stickFlame);
		RenderModItem.init(ModItems.ingotFlame);
		RenderModItem.init(ModItems.swordFlame);
		RenderModItem.init(ModItems.nuggetFlame);
		RenderModItem.init(ModItems.helmetFlame);
		RenderModItem.init(ModItems.chestplateFlame);
		RenderModItem.init(ModItems.leggingsFlame);
		RenderModItem.init(ModItems.bootsFlame);
	}

	private static void init(final Item item) {
		RenderModItem.init(item, item.getUnlocalizedName().substring(5));
	}

	private static void init(final Item item, final String name) {
		if (PurpleOreCore.proxy.isClient())
			Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0,
					new ModelResourceLocation(Reference.MOD_ID + ":" + name, "inventory"));
	}

	public RenderModItem(final TextureManager p_i46165_1_, final ModelManager p_i46165_2_) {
		super(p_i46165_1_, p_i46165_2_);
	}
}