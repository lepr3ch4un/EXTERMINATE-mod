package net.hop3fulpuffin.exterminate.entity;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.hop3fulpuffin.exterminate.EXTERMINATE;
import net.hop3fulpuffin.exterminate.entity.eli.CybermanEntity;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModEntities {
    public static final EntityType<CybermanEntity> CYBERMAN = Registry.register(Registries.ENTITY_TYPE,
            new Identifier(EXTERMINATE.MOD_ID, "cyberman"),
            FabricEntityTypeBuilder.create(SpawnGroup.MONSTER, CybermanEntity::new).dimensions(EntityDimensions.fixed(0.6f,1.95f)).build());
}
