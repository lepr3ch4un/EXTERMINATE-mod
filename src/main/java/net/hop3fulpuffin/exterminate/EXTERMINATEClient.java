package net.hop3fulpuffin.exterminate;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.hop3fulpuffin.exterminate.entity.ModEntities;
import net.hop3fulpuffin.exterminate.entity.client.CybermanModel;
import net.hop3fulpuffin.exterminate.entity.client.CybermanRenderer;
import net.hop3fulpuffin.exterminate.entity.client.ModModelLayers;

public class EXTERMINATEClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {

        EntityRendererRegistry.register(ModEntities.CYBERMAN, CybermanRenderer::new);
        EntityModelLayerRegistry.registerModelLayer(ModModelLayers.CYBERMAN, CybermanModel::getTexturedModelData);

    }
}
