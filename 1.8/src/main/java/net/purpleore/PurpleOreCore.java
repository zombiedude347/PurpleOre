package net.purpleore;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.purpleore.client.renderer.entity.RenderModItem;
import net.purpleore.common.FuelHandler;
import net.purpleore.common.PurpleOreWorldGen;
import net.purpleore.handler.ConfigurationHandler;
import net.purpleore.init.ModBlocks;
import net.purpleore.init.ModItems;
import net.purpleore.item.crafting.CraftingManager;
import net.purpleore.item.crafting.FurnaceRecipes;
import net.purpleore.oredict.ModOreDictionary;
import net.purpleore.proxy.IProxy;
import net.purpleore.reference.Reference;
import net.purpleore.utility.LogHelper;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)
public class PurpleOreCore {

    @SidedProxy(clientSide = Reference.CLIENT_SIDE, serverSide = Reference.SERVER_SIDE)
    public static IProxy proxy;
    public static CreativeTabs tabPurple = new CreativeTabs(Reference.MOD_ID) {
        @Override
        @SideOnly(Side.CLIENT)
        public Item getTabIconItem() {
            return Item.getItemFromBlock(ModBlocks.orePurple);
        }
    ;
    };
	@Mod.Instance(Reference.MOD_ID)
    public static PurpleOreCore instance;
    @Mod.EventHandler
    public void preInit(final FMLPreInitializationEvent preEvent) {
        ConfigurationHandler.init(preEvent.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigurationHandler());
        ModItems.init();
        ModBlocks.init();
        PurpleOreCore.proxy.registerRenderers();
        LogHelper.info("Pre Initialization Complete");
    }

    @Mod.EventHandler
    public void init(final FMLInitializationEvent event) {
        if (event.getSide() == Side.CLIENT) {
            final RenderItem renderItem = Minecraft.getMinecraft().getRenderItem();
            renderItem.getItemModelMesher().register(Item.getItemFromBlock(ModBlocks.blockPurple), 0,
                    new ModelResourceLocation(Reference.MOD_ID + ":" + ModBlocks.blockPurple.getName(), "inventory"));
            renderItem.getItemModelMesher().register(Item.getItemFromBlock(ModBlocks.blockFlame), 0,
                    new ModelResourceLocation(Reference.MOD_ID + ":" + ModBlocks.blockFlame.getName(), "inventory"));
            renderItem.getItemModelMesher().register(Item.getItemFromBlock(ModBlocks.orePurple), 0,
                    new ModelResourceLocation(Reference.MOD_ID + ":" + ModBlocks.orePurple.getName(), "inventory"));
            renderItem.getItemModelMesher().register(Item.getItemFromBlock(ModBlocks.oreFlame), 0,
                    new ModelResourceLocation(Reference.MOD_ID + ":" + ModBlocks.oreFlame.getName(), "inventory"));
        }
        ModOreDictionary.init();
        CraftingManager.init();
        FurnaceRecipes.init();
        GameRegistry.registerFuelHandler(new FuelHandler());
        LogHelper.info("Initialization Complete");
    }

    @Mod.EventHandler
    public void postInit(final FMLPostInitializationEvent postEvent) {
        PurpleOreWorldGen eventWorldGen = new PurpleOreWorldGen();
        GameRegistry.registerWorldGenerator(eventWorldGen, 1);
        RenderModItem.init();
        LogHelper.info("Post Initialization Complete");
    }

}
