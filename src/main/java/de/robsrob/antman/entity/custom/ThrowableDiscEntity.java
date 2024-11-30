package de.robsrob.antman.entity.custom;

import de.robsrob.antman.entity.ModEntities;
import de.robsrob.antman.item.ModItems;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.ThrowableItemProjectile;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.EntityHitResult;

public class ThrowableDiscEntity extends ThrowableItemProjectile {

    public ThrowableDiscEntity(EntityType<? extends ThrowableItemProjectile> pEntityType, Level pLevel) {
        super(pEntityType, pLevel);
    }

    public ThrowableDiscEntity(Level pLevel) {
        super(ModEntities.THROWABLE_DISC.get(), pLevel);
    }

    public ThrowableDiscEntity(Level pLevel, LivingEntity livingEntity) {
        super(ModEntities.THROWABLE_DISC.get(), livingEntity, pLevel);
    }

    @Override
    protected Item getDefaultItem() {
        return ModItems.THROWABLE_DISC.get();
    }

    @Override
    protected void onHitEntity(EntityHitResult pResult) {
        if(!this.level().isClientSide()) {
            Entity target = pResult.getEntity();
            if(target instanceof LivingEntity livingEntity) {
                DamageSource damageSource = level().damageSources().thrown(this, this.getOwner());
                livingEntity.hurt(damageSource, 1f);
            }
            this.discard();
        }
        super.onHitEntity(pResult);
    }

    @Override
    protected void onHitBlock(BlockHitResult pResult) {
        this.discard();
        super.onHitBlock(pResult);
    }
}
