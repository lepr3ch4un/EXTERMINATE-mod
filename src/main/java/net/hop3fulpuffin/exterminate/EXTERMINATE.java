package net.hop3fulpuffin.exterminate;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.hop3fulpuffin.exterminate.entity.ModEntities;
import net.hop3fulpuffin.exterminate.entity.eli.CybermanEntity;
import net.hop3fulpuffin.exterminate.sound.ModSounds;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EXTERMINATE implements ModInitializer {
	public static final String MOD_ID = "exterminate";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("EXTERMINATION Locked and Loaded");

		ModSounds.initialize();

		FabricDefaultAttributeRegistry.register(ModEntities.CYBERMAN, CybermanEntity.createCybermanAttributes());
	}
}