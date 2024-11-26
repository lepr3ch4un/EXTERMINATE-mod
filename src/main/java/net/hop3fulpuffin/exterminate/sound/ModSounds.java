package net.hop3fulpuffin.exterminate.sound;

import net.hop3fulpuffin.exterminate.EXTERMINATE;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class ModSounds {
    private ModSounds(){

    }

    public static final SoundEvent ENTITY_CYBERMAN_AMBIENT = registerSoundEvent("entity.cyberman.ambient");
    public static final SoundEvent ENTITY_CYBERMAN_STEP = registerSoundEvent("entity.cyberman.step");
    public static final SoundEvent ENTITY_CYBERMAN_HURT = registerSoundEvent("entity.cyberman.hurt");
    public static final SoundEvent ENTITY_CYBERMAN_DEATH = registerSoundEvent("entity.cyberman.death");

    private static SoundEvent registerSoundEvent(String name) {
        Identifier id = new Identifier(EXTERMINATE.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }

    public static void initialize() {
        EXTERMINATE.LOGGER.info("Registering EXTERMINATION Sounds");
    }
}
