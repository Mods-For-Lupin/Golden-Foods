package com.cursee.golden_foods.impl.common.registry;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderSet;
import net.minecraft.core.RegistryCodecs;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.network.codec.ByteBufCodecs;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ItemUseAnimation;
import net.minecraft.world.item.component.Consumable;
import net.minecraft.world.item.consume_effects.ApplyStatusEffectsConsumeEffect;
import net.minecraft.world.item.consume_effects.ConsumeEffect;
import net.minecraft.world.item.consume_effects.RemoveStatusEffectsConsumeEffect;
import net.minecraft.world.item.consume_effects.TeleportRandomlyConsumeEffect;
import net.minecraft.world.level.Level;

public class ModConsumables {

  public static final Consumable GOLDEN_APPLE = defaultFood().onConsume(
      new ApplyStatusEffectsConsumeEffect(List.of(new MobEffectInstance(MobEffects.REGENERATION, 100, 1), new MobEffectInstance(MobEffects.ABSORPTION, 2400, 0)))).build();

  public static final Consumable ENCHANTED_GOLDEN_APPLE = defaultFood().onConsume(new ApplyStatusEffectsConsumeEffect(
      List.of(new MobEffectInstance(MobEffects.REGENERATION, 400, 1), new MobEffectInstance(MobEffects.RESISTANCE, 6000, 0), new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 6000, 0),
          new MobEffectInstance(MobEffects.ABSORPTION, 2400, 3)))).build();

  public static final Consumable ENCHANTED_GOLDEN_CARROT = defaultEnchantedFood().build();

  public static final Consumable GOLDEN_MELON_SLICE = defaultGoldenFood().build();
  public static final Consumable ENCHANTED_GOLDEN_MELON_SLICE = defaultEnchantedFood().build();
  public static final Consumable GOLDEN_SWEET_BERRIES = defaultGoldenFood().build();
  public static final Consumable ENCHANTED_GOLDEN_SWEET_BERRIES = defaultEnchantedFood().build();
  public static final Consumable GOLDEN_GLOW_BERRIES = defaultGoldenFood().onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(new MobEffectInstance(MobEffects.GLOWING, 60)))).build();
  public static final Consumable ENCHANTED_GOLDEN_GLOW_BERRIES = defaultEnchantedFood().onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.GLOWING, 60))).build();
  public static final Consumable GOLDEN_BAKED_POTATO = defaultGoldenFood().build();
  public static final Consumable ENCHANTED_GOLDEN_BAKED_POTATO = defaultEnchantedFood().build();
  public static final Consumable GOLDEN_BEETROOT = defaultGoldenFood().build();
  public static final Consumable ENCHANTED_GOLDEN_BEETROOT = defaultEnchantedFood().build();
  public static final Consumable GOLDEN_DRIED_KELP = defaultGoldenFood().consumeSeconds(0.8F).build();
  public static final Consumable ENCHANTED_GOLDEN_DRIED_KELP = defaultEnchantedFood().consumeSeconds(0.8F).build();
  public static final Consumable GOLDEN_BREAD = defaultGoldenFood().build();
  public static final Consumable ENCHANTED_GOLDEN_BREAD = defaultEnchantedFood().build();
  public static final Consumable GOLDEN_COOKIE = defaultGoldenFood().build();
  public static final Consumable ENCHANTED_GOLDEN_COOKIE = defaultEnchantedFood().build();
  public static final Consumable GOLDEN_PUMPKIN_PIE = defaultGoldenFood().build();
  public static final Consumable ENCHANTED_GOLDEN_PUMPKIN_PIE = defaultEnchantedFood().build();
  public static final Consumable GOLDEN_CHORUS_FRUIT = defaultGoldenFood().onConsume(new TeleportRandomlyConsumeEffect()).build();
  public static final Consumable ENCHANTED_GOLDEN_CHORUS_FRUIT = defaultEnchantedFood().onConsume(new TeleportRandomlyConsumeEffect()).build();

  public static final Consumable GOLDEN_MILK_BUCKET = defaultGoldenDrink().onConsume(new ConsumeEffect() {
    @Override
    public Type<? extends ConsumeEffect> getType() {
      System.out.println("tried to get type? why?");
      return Type.REMOVE_EFFECTS;
    }

    @Override
    public boolean apply(Level level, ItemStack itemStack, LivingEntity entity) {


      boolean flag = false;

      for (Holder<MobEffect> effectHolder : BuiltInRegistries.MOB_EFFECT.asHolderIdMap()) {
        if (effectHolder.value().getCategory() == MobEffectCategory.HARMFUL && entity.removeEffect(effectHolder)) {
          flag = true;
        }
      }

      return flag;
    }
  }).build();
  public static final Consumable ENCHANTED_GOLDEN_MILK_BUCKET = defaultEnchantedDrink().onConsume(new ConsumeEffect() {
    @Override
    public Type<? extends ConsumeEffect> getType() {
      System.out.println("tried to get type? why?");
      return Type.REMOVE_EFFECTS;
    }

    @Override
    public boolean apply(Level level, ItemStack itemStack, LivingEntity entity) {


      boolean flag = false;

      for (Holder<MobEffect> effectHolder : BuiltInRegistries.MOB_EFFECT.asHolderIdMap()) {
        if (effectHolder.value().getCategory() == MobEffectCategory.HARMFUL && entity.removeEffect(effectHolder)) {
          flag = true;
        }
      }

      return flag;
    }
  }).build();

  public static final Consumable GOLDEN_HONEY_BOTTLE = defaultGoldenDrink().onConsume(new RemoveStatusEffectsConsumeEffect(MobEffects.POISON)).build();
  public static final Consumable ENCHANTED_GOLDEN_HONEY_BOTTLE = defaultEnchantedDrink().onConsume(new RemoveStatusEffectsConsumeEffect(MobEffects.POISON)).build();

  public static final Consumable GOLDEN_MUSHROOM_STEW = defaultGoldenFood().build();
  public static final Consumable ENCHANTED_GOLDEN_MUSHROOM_STEW = defaultEnchantedFood().build();
  public static final Consumable GOLDEN_BEETROOT_SOUP = defaultGoldenFood().build();
  public static final Consumable ENCHANTED_GOLDEN_BEETROOT_SOUP = defaultEnchantedFood().build();
  public static final Consumable GOLDEN_RABBIT_STEW = defaultGoldenFood().build();
  public static final Consumable ENCHANTED_GOLDEN_RABBIT_STEW = defaultEnchantedFood().build();
  public static final Consumable GOLDEN_COOKED_BEEF = defaultGoldenFood().build();
  public static final Consumable ENCHANTED_GOLDEN_COOKED_BEEF = defaultEnchantedFood().build();
  public static final Consumable GOLDEN_COOKED_PORKCHOP = defaultGoldenFood().build();
  public static final Consumable ENCHANTED_GOLDEN_COOKED_PORKCHOP = defaultEnchantedFood().build();
  public static final Consumable GOLDEN_COOKED_MUTTON = defaultGoldenFood().build();
  public static final Consumable ENCHANTED_GOLDEN_COOKED_MUTTON = defaultEnchantedFood().build();
  public static final Consumable GOLDEN_COOKED_CHICKEN = defaultGoldenFood().build();
  public static final Consumable ENCHANTED_GOLDEN_COOKED_CHICKEN = defaultEnchantedFood().build();
  public static final Consumable GOLDEN_COOKED_RABBIT = defaultGoldenFood().build();
  public static final Consumable ENCHANTED_GOLDEN_COOKED_RABBIT = defaultEnchantedFood().build();
  public static final Consumable GOLDEN_COOKED_COD = defaultGoldenFood().build();
  public static final Consumable ENCHANTED_GOLDEN_COOKED_COD = defaultEnchantedFood().build();
  public static final Consumable GOLDEN_COOKED_SALMON = defaultGoldenFood().build();
  public static final Consumable ENCHANTED_GOLDEN_COOKED_SALMON = defaultEnchantedFood().build();

  public static Consumable.Builder defaultFood() {
    return Consumable.builder().consumeSeconds(1.6F).animation(ItemUseAnimation.EAT).sound(SoundEvents.GENERIC_EAT).hasConsumeParticles(true);
  }

  public static Consumable.Builder defaultGoldenFood() {
    return Consumable.builder().consumeSeconds(1.6F).animation(ItemUseAnimation.EAT).sound(SoundEvents.GENERIC_EAT).hasConsumeParticles(true)
        .onConsume(new ApplyStatusEffectsConsumeEffect(List.of(new MobEffectInstance(MobEffects.REGENERATION, 100, 1), new MobEffectInstance(MobEffects.ABSORPTION, 2400, 0))));
  }

  public static Consumable.Builder defaultEnchantedFood() {
    return Consumable.builder().consumeSeconds(1.6F).animation(ItemUseAnimation.EAT).sound(SoundEvents.GENERIC_EAT).hasConsumeParticles(true).onConsume(new ApplyStatusEffectsConsumeEffect(
        List.of(new MobEffectInstance(MobEffects.REGENERATION, 400, 1), new MobEffectInstance(MobEffects.RESISTANCE, 6000, 0), new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 6000, 0),
            new MobEffectInstance(MobEffects.ABSORPTION, 2400, 3))));
  }

  public static Consumable.Builder defaultDrink() {
    return Consumable.builder().consumeSeconds(1.6F).animation(ItemUseAnimation.DRINK).sound(SoundEvents.GENERIC_DRINK).hasConsumeParticles(false);
  }

  public static Consumable.Builder defaultGoldenDrink() {
    return Consumable.builder().consumeSeconds(1.6F).animation(ItemUseAnimation.DRINK).sound(SoundEvents.GENERIC_DRINK).hasConsumeParticles(false)
        .onConsume(new ApplyStatusEffectsConsumeEffect(List.of(new MobEffectInstance(MobEffects.REGENERATION, 100, 1), new MobEffectInstance(MobEffects.ABSORPTION, 2400, 0))));
  }

  public static Consumable.Builder defaultEnchantedDrink() {
    return Consumable.builder().consumeSeconds(1.6F).animation(ItemUseAnimation.DRINK).sound(SoundEvents.GENERIC_DRINK).hasConsumeParticles(false).onConsume(new ApplyStatusEffectsConsumeEffect(
        List.of(new MobEffectInstance(MobEffects.REGENERATION, 400, 1), new MobEffectInstance(MobEffects.RESISTANCE, 6000, 0), new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 6000, 0),
            new MobEffectInstance(MobEffects.ABSORPTION, 2400, 3))));
  }
}
