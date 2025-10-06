package com.cursee.golden_foods.impl.common.registry;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {

  private static FoodProperties createGoldenFoodProperties(int nutrition, float saturationModifier) {
    return new FoodProperties.Builder().nutrition(nutrition).saturationModifier(saturationModifier).alwaysEdible().build();
  }

  public static final FoodProperties ENCHANTED_GOLDEN_CARROT = createGoldenFoodProperties(3, 2.4f);

  public static final FoodProperties GOLDEN_MELON_SLICE = createGoldenFoodProperties(2, 1.2f);
  public static final FoodProperties ENCHANTED_GOLDEN_MELON_SLICE = createGoldenFoodProperties(2, 1.2f);

  public static final FoodProperties GOLDEN_SWEET_BERRIES = createGoldenFoodProperties(2, 0.4f);
  public static final FoodProperties ENCHANTED_GOLDEN_SWEET_BERRIES = createGoldenFoodProperties(2, 0.4f);

  public static final FoodProperties GOLDEN_GLOW_BERRIES = createGoldenFoodProperties(2, 0.4f);
  public static final FoodProperties ENCHANTED_GOLDEN_GLOW_BERRIES = createGoldenFoodProperties(2, 0.4f);

  public static final FoodProperties GOLDEN_BAKED_POTATO = createGoldenFoodProperties(5, 2.4f);
  public static final FoodProperties ENCHANTED_GOLDEN_BAKED_POTATO = createGoldenFoodProperties(5, 2.4f);

  public static final FoodProperties GOLDEN_BEETROOT = createGoldenFoodProperties(1, 2.4f);
  public static final FoodProperties ENCHANTED_GOLDEN_BEETROOT = createGoldenFoodProperties(1, 2.4f);

  public static final FoodProperties GOLDEN_DRIED_KELP = createGoldenFoodProperties(1, 2.4f);
  public static final FoodProperties ENCHANTED_GOLDEN_DRIED_KELP = createGoldenFoodProperties(1, 2.4f);

  public static final FoodProperties GOLDEN_BREAD = createGoldenFoodProperties(5, 2.4f);
  public static final FoodProperties ENCHANTED_GOLDEN_BREAD = createGoldenFoodProperties(5, 2.4f);

  public static final FoodProperties GOLDEN_COOKIE = createGoldenFoodProperties(2, 0.4f);
  public static final FoodProperties ENCHANTED_GOLDEN_COOKIE = createGoldenFoodProperties(2, 0.4f);

  public static final FoodProperties GOLDEN_PUMPKIN_PIE = createGoldenFoodProperties(8, 1.2f);
  public static final FoodProperties ENCHANTED_GOLDEN_PUMPKIN_PIE = createGoldenFoodProperties(8, 1.2f);

  public static final FoodProperties GOLDEN_CHORUS_FRUIT = createGoldenFoodProperties(4, 1.2f);
  public static final FoodProperties ENCHANTED_GOLDEN_CHORUS_FRUIT = createGoldenFoodProperties(4, 1.2f);

  public static final FoodProperties GOLDEN_MILK_BUCKET = createGoldenFoodProperties(4, 1.2f);
  public static final FoodProperties ENCHANTED_GOLDEN_MILK_BUCKET = createGoldenFoodProperties(4, 1.2f);

  public static final FoodProperties GOLDEN_HONEY_BOTTLE = createGoldenFoodProperties(6, 0.4f);
  public static final FoodProperties ENCHANTED_GOLDEN_HONEY_BOTTLE = createGoldenFoodProperties(6, 0.4f);

  public static final FoodProperties GOLDEN_MUSHROOM_STEW = createGoldenFoodProperties(6, 2.4f);
  public static final FoodProperties ENCHANTED_GOLDEN_MUSHROOM_STEW = createGoldenFoodProperties(6, 2.4f);

  public static final FoodProperties GOLDEN_BEETROOT_SOUP = createGoldenFoodProperties(6, 2.4f);
  public static final FoodProperties ENCHANTED_GOLDEN_BEETROOT_SOUP = createGoldenFoodProperties(6, 2.4f);

  public static final FoodProperties GOLDEN_RABBIT_STEW = createGoldenFoodProperties(10, 2.4f);
  public static final FoodProperties ENCHANTED_GOLDEN_RABBIT_STEW = createGoldenFoodProperties(10, 2.4f);

  public static final FoodProperties GOLDEN_COOKED_BEEF = createGoldenFoodProperties(8, 3.2f);
  public static final FoodProperties ENCHANTED_GOLDEN_COOKED_BEEF = createGoldenFoodProperties(8, 3.2f);

  public static final FoodProperties GOLDEN_COOKED_PORKCHOP = createGoldenFoodProperties(8, 3.2f);
  public static final FoodProperties ENCHANTED_GOLDEN_COOKED_PORKCHOP = createGoldenFoodProperties(8, 3.2f);

  public static final FoodProperties GOLDEN_COOKED_MUTTON = createGoldenFoodProperties(6, 3.2f);
  public static final FoodProperties ENCHANTED_GOLDEN_COOKED_MUTTON = createGoldenFoodProperties(6, 3.2f);

  public static final FoodProperties GOLDEN_COOKED_CHICKEN = createGoldenFoodProperties(6, 3.2f);
  public static final FoodProperties ENCHANTED_GOLDEN_COOKED_CHICKEN = createGoldenFoodProperties(6, 3.2f);

  public static final FoodProperties GOLDEN_COOKED_RABBIT = createGoldenFoodProperties(5, 3.2f);
  public static final FoodProperties ENCHANTED_GOLDEN_COOKED_RABBIT = createGoldenFoodProperties(5, 3.2f);

  public static final FoodProperties GOLDEN_COOKED_COD = createGoldenFoodProperties(5, 3.2f);
  public static final FoodProperties ENCHANTED_GOLDEN_COOKED_COD = createGoldenFoodProperties(5, 3.2f);

  public static final FoodProperties GOLDEN_COOKED_SALMON = createGoldenFoodProperties(6, 3.2f);
  public static final FoodProperties ENCHANTED_GOLDEN_COOKED_SALMON = createGoldenFoodProperties(6, 3.2f);

}
