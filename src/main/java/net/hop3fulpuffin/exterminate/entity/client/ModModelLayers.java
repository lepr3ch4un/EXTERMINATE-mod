package net.hop3fulpuffin.exterminate.entity.client;

import net.hop3fulpuffin.exterminate.EXTERMINATE;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.util.Identifier;

public class ModModelLayers {
    public static final EntityModelLayer CYBERMAN =
            new EntityModelLayer(new Identifier(EXTERMINATE.MOD_ID,"porcupine"), "main");
}
