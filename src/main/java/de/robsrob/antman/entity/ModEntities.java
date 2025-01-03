package de.robsrob.antman.entity;

import de.robsrob.antman.AntManMod;
import de.robsrob.antman.entity.custom.GrowDiscEntity;
import de.robsrob.antman.entity.custom.ShrinkDiscEntity;
import de.robsrob.antman.entity.custom.ThrowableDiscEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEntities {

    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, AntManMod.MOD_ID);

    public static final RegistryObject<EntityType<ThrowableDiscEntity>> THROWABLE_DISC = ENTITY_TYPES.register("throwable_disc",
            () -> EntityType.Builder.<ThrowableDiscEntity>of(ThrowableDiscEntity::new, MobCategory.MISC).sized(.5f, .5f).build("throwable_disc"));
    public static final RegistryObject<EntityType<ShrinkDiscEntity>> SHRINK_DISC = ENTITY_TYPES.register("shrink_disc",
            () -> EntityType.Builder.<ShrinkDiscEntity>of(ShrinkDiscEntity::new, MobCategory.MISC).sized(.5f, .5f).build("shrink_disc"));
    public static final RegistryObject<EntityType<GrowDiscEntity>> GROW_DISC = ENTITY_TYPES.register("grow_disc",
            () -> EntityType.Builder.<GrowDiscEntity>of(GrowDiscEntity::new, MobCategory.MISC).sized(.5f, .5f).build("grow_disc"));


    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }

}
