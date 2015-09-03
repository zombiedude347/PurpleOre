package net.purpleore.utility;

import org.apache.logging.log4j.Level;

import net.minecraftforge.fml.common.FMLLog;
import net.purpleore.reference.Reference;

public class LogHelper {
	public static void info(final Object object) {
		LogHelper.log(Level.INFO, object);
	}

	private static void log(final Level logLevel, final Object object) {
		FMLLog.log(Reference.MOD_NAME, logLevel, String.valueOf(object));
	}
}
