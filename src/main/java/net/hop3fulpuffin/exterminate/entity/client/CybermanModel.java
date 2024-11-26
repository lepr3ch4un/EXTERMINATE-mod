package net.hop3fulpuffin.exterminate.entity.client;

import net.hop3fulpuffin.exterminate.entity.eli.CybermanEntity;
import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;

public class CybermanModel<T extends CybermanEntity> extends SinglePartEntityModel<T> {
	private final ModelPart cyberman;
	private final ModelPart head;

	public CybermanModel(ModelPart root) {
		this.cyberman = root.getChild("cyberman");
		this.head = cyberman.getChild("Body").getChild("Head");
	}
	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData cyberman = modelPartData.addChild("cyberman", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 24.0F, 2.0F));

		ModelPartData Body = cyberman.addChild("Body", ModelPartBuilder.create().uv(16, 16).cuboid(-4.0F, -12.0F, -2.0F, 8.0F, 12.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -12.0F, -2.0F));

		ModelPartData Head = Body.addChild("Head", ModelPartBuilder.create().uv(0, 0).cuboid(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new Dilation(0.0F))
		.uv(32, 0).cuboid(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new Dilation(0.5F))
		.uv(0, 32).cuboid(5.0F, -10.0F, 0.0F, 1.0F, 7.0F, 0.0F, new Dilation(0.0F))
		.uv(2, 33).cuboid(4.0F, -3.0F, 0.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(2, 33).cuboid(-5.0F, -3.0F, 0.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(0, 32).cuboid(-6.0F, -10.0F, 0.0F, 1.0F, 7.0F, 0.0F, new Dilation(0.0F))
		.uv(2, 32).cuboid(-5.0F, -11.0F, 0.0F, 10.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(19, 32).cuboid(-1.5F, -10.0F, -2.5F, 3.0F, 2.0F, 3.0F, new Dilation(0.0F))
		.uv(22, 32).cuboid(1.525F, -10.0F, -2.5F, 0.0F, 2.0F, 3.0F, new Dilation(0.0F))
		.uv(19, 32).cuboid(-1.525F, -10.0F, -2.5F, 0.0F, 2.0F, 3.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -12.0F, 0.0F));

		ModelPartData cube_r1 = Head.addChild("cube_r1", ModelPartBuilder.create().uv(31, 32).cuboid(-1.0F, 0.0F, 0.0F, 3.0F, 2.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(-0.5F, -10.0F, 0.5F, -0.5236F, 0.0F, 0.0F));

		ModelPartData RightArm = Body.addChild("RightArm", ModelPartBuilder.create().uv(40, 16).cuboid(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(-5.0F, -10.0F, 0.0F));

		ModelPartData LeftArm = Body.addChild("LeftArm", ModelPartBuilder.create().uv(40, 16).mirrored().cuboid(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.pivot(5.0F, -10.0F, 0.0F));

		ModelPartData RightLeg = cyberman.addChild("RightLeg", ModelPartBuilder.create().uv(0, 16).cuboid(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(-1.9F, -12.0F, -2.0F));

		ModelPartData LeftLeg = cyberman.addChild("LeftLeg", ModelPartBuilder.create().uv(0, 16).mirrored().cuboid(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.pivot(1.9F, -12.0F, -2.0F));
		return TexturedModelData.of(modelData, 64, 64);
	}
	@Override
	public void setAngles(CybermanEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
	@Override
	public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, float red, float green, float blue, float alpha) {
		cyberman.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
	}

	@Override
	public ModelPart getPart() {
		return cyberman;
	}
}