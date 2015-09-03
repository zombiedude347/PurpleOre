package net.purpleore.init;

import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.purpleore.item.ArmorFlame;
import net.purpleore.item.ArmorPurple;
import net.purpleore.item.AxeFlame;
import net.purpleore.item.AxePurple;
import net.purpleore.item.BowPurple;
import net.purpleore.item.CoalPurple;
import net.purpleore.item.HoePurple;
import net.purpleore.item.IngotFlame;
import net.purpleore.item.IngotPurple;
import net.purpleore.item.NuggetFlame;
import net.purpleore.item.NuggetPurple;
import net.purpleore.item.PickaxePurple;
import net.purpleore.item.ShovelPurple;
import net.purpleore.item.StickFlame;
import net.purpleore.item.StickPurple;
import net.purpleore.item.SwordFlame;
import net.purpleore.item.SwordPurple;
import net.purpleore.reference.Reference;

public class ModItems {
	public static final Item leggingsFlame = new ArmorFlame(2);
	public static final Item chestplateFlame = new ArmorFlame(1);
	public static final Item helmetFlame = new ArmorFlame(0);
	public static int purpleArmorID;
	private static Item.ToolMaterial toolPurple = EnumHelper.addToolMaterial("PurpleToolMaterial", 4, 2000, 12.0F, 4.0F,
			22);
	public static Item.ToolMaterial toolFlame = EnumHelper.addToolMaterial("FlameToolMaterial", 5, 2500, 12.0F, 4.0F,
			11);
	public static ItemArmor.ArmorMaterial armorPurple = EnumHelper.addArmorMaterial("PurpleArmorMaterial",
			Reference.MOD_ID + ":PurpleArmor", 135, new int[] { 3, 6, 4, 3 }, 25);
	public static AxePurple axePurple = new AxePurple(ModItems.toolPurple);
	public static ArmorPurple bootsPurple = new ArmorPurple(3);
	public static BowPurple bowPurple = new BowPurple();
	public static ArmorPurple chestplatePurple = new ArmorPurple(1);
	public static CoalPurple coalPurple = new CoalPurple();
	public static ArmorPurple helmetPurple = new ArmorPurple(0);
	public static HoePurple hoePurple = new HoePurple(ModItems.toolPurple);
	public static IngotPurple ingotPurple = new IngotPurple();
	public static ArmorPurple leggingsPurple = new ArmorPurple(2);
	public static NuggetPurple nuggetPurple = new NuggetPurple();
	public static PickaxePurple pickaxePurple = new PickaxePurple(ModItems.toolPurple);
	public static ShovelPurple shovelPurple = new ShovelPurple(ModItems.toolPurple);
	public static StickPurple stickPurple = new StickPurple();
	public static SwordPurple swordPurple = new SwordPurple(ModItems.toolPurple);
	public static SwordFlame swordFlame = new SwordFlame();
	public static IngotFlame ingotFlame = new IngotFlame();
	public static AxeFlame axeFlame = new AxeFlame();
	public static StickFlame stickFlame = new StickFlame();
	public static NuggetFlame nuggetFlame = new NuggetFlame();
	public static Item bootsFlame = new ArmorFlame(3);
	public static ArmorMaterial armorFlame = EnumHelper.addArmorMaterial("FlameArmorMaterial",
			Reference.MOD_ID + ":FlameArmor", 135, new int[] { 3, 6, 4, 3 }, 25);
	public static int flameArmorID;

	public static void init() {
		ModItems.init(ModItems.ingotPurple);
		ModItems.init(ModItems.ingotFlame);
		ModItems.init(ModItems.axePurple);
		ModItems.init(ModItems.bootsPurple);
		ModItems.init(ModItems.chestplatePurple);
		ModItems.init(ModItems.helmetPurple);
		ModItems.init(ModItems.hoePurple);
		ModItems.init(ModItems.leggingsPurple);
		ModItems.init(ModItems.pickaxePurple);
		ModItems.init(ModItems.shovelPurple);
		ModItems.init(ModItems.swordPurple);
		ModItems.init(ModItems.nuggetPurple);
		ModItems.init(ModItems.coalPurple);
		ModItems.init(ModItems.bowPurple);
		ModItems.init(ModItems.stickPurple);
		ModItems.init(ModItems.swordFlame);
		ModItems.init(ModItems.stickFlame);
		ModItems.init(ModItems.nuggetFlame);
	}

	public static void init(final Item item) {
		GameRegistry.registerItem(item, item.getUnlocalizedName().substring(5));
	}
}
