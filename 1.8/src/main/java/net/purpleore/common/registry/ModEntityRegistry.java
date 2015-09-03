package net.purpleore.common.registry;

import java.util.Random;

import net.minecraft.entity.EntityList;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.purpleore.PurpleOreCore;

public class ModEntityRegistry {

	public static void registerEntity(final Class entityClass, final String name) {
		final int entityID = EntityRegistry.findGlobalUniqueEntityId();
		final long seed = name.hashCode();
		final Random rand = new Random(seed);
		final int primaryColor = rand.nextInt() * 16777215;
		final int secondaryColor = rand.nextInt() * 16777215;

		EntityRegistry.registerGlobalEntityID(entityClass, name, entityID);
		EntityRegistry.registerModEntity(entityClass, name, entityID, PurpleOreCore.instance, 64, 1, true);
		EntityList.entityEggs.put(Integer.valueOf(entityID),
				new EntityList.EntityEggInfo(entityID, primaryColor, secondaryColor));
	}

}
