package net.hop3fulpuffin.exterminate.entity.client;

import net.hop3fulpuffin.exterminate.EXTERMINATE;
import net.hop3fulpuffin.exterminate.entity.eli.CybermanEntity;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;

public class CybermanRenderer extends MobEntityRenderer<CybermanEntity, CybermanModel<CybermanEntity>> {

    private static final Identifier TEXTURE = new Identifier(EXTERMINATE.MOD_ID, "textures/entity/cyberman.png");

    public CybermanRenderer(EntityRendererFactory.Context context) {
        super(context, new CybermanModel<>(context.getPart(ModModelLayers.CYBERMAN)), 0.5f);
    }

    @Override
    public Identifier getTexture(CybermanEntity entity) {
        return TEXTURE;
    }

    @Override
    public void render(CybermanEntity mobEntity, float f, float g, MatrixStack matrixStack, VertexConsumerProvider vertexConsumerProvider, int i) {
        super.render(mobEntity, f, g, matrixStack, vertexConsumerProvider, i);
    }
}
