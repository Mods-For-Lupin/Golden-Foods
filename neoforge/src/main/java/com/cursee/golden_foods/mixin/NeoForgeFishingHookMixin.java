package com.cursee.golden_foods.mixin;

// import com.cursee.golden_foods.core.registry.ModEnchantmentsFabric;

import com.cursee.golden_foods.GoldenFoods;
import com.cursee.golden_foods.impl.common.registry.ModItems;
import java.util.concurrent.atomic.AtomicBoolean;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.FishingHook;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

// import javax.annotation.Nullable;

@Mixin(FishingHook.class)
public abstract class NeoForgeFishingHookMixin {

    @Shadow @Nullable
    public abstract Player getPlayerOwner();

    @Redirect(method = "retrieve", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/level/Level;addFreshEntity(Lnet/minecraft/world/entity/Entity;)Z", ordinal = 0))
    private boolean redirected$retrieveAddFreshEntity0(Level instance, Entity entity) {

        if (getPlayerOwner() == null || !(entity instanceof ItemEntity itemEntity) || instance.random.nextFloat() > 0.05f) return instance.addFreshEntity(entity);

        Player player = getPlayerOwner();

        final AtomicBoolean foundEnchantmentLeftHand = new AtomicBoolean(false);
        EnchantmentHelper.getEnchantmentsForCrafting(player.getOffhandItem()).keySet().forEach(enchantmentHolder -> {
            if (enchantmentHolder.is(GoldenFoods.GOLDEN_FOODS)) foundEnchantmentLeftHand.set(true);
        });
        final AtomicBoolean foundEnchantmentRightHand = new AtomicBoolean(false);
        EnchantmentHelper.getEnchantmentsForCrafting(player.getMainHandItem()).keySet().forEach(enchantmentHolder -> {
            if (enchantmentHolder.is(GoldenFoods.GOLDEN_FOODS)) foundEnchantmentRightHand.set(true);
        });

        if (!foundEnchantmentRightHand.get() || !foundEnchantmentLeftHand.get()) return instance.addFreshEntity(entity);

        if (itemEntity.getItem().is(Items.COD)) {
            return instance.addFreshEntity(new ItemEntity(instance, player.getX(), player.getY(), player.getZ(), new ItemStack(ModItems.ENCHANTED_GOLDEN_COOKED_COD)));
        }
        else if (itemEntity.getItem().is(Items.SALMON)) {
            return instance.addFreshEntity(new ItemEntity(instance, player.getX(), player.getY(), player.getZ(), new ItemStack(ModItems.ENCHANTED_GOLDEN_COOKED_SALMON)));
        }

        return instance.addFreshEntity(entity);
    }
}
