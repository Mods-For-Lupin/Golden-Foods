package com.cursee.golden_foods.api.common.data;

public enum GoldenFoodBases {

  BAKED_POTATO("baked_potato"),
  BEETROOT("beetroot"),
  BEETROOT_SOUP("beetroot_soup"),
  BREAD("bread"),
  CHORUS_FRUIT("chorus_fruit"),
  COOKED_BEEF("cooked_beef"),
  COOKED_CHICKEN("cooked_chicken"),
  COOKED_COD("cooked_cod"),
  COOKED_MUTTON("cooked_mutton"),
  COOKED_PORKCHOP("cooked_porkchop"),
  COOKED_RABBIT("cooked_rabbit"),
  COOKED_SALMON("cooked_salmon"),
  COOKIE("cookie"),
  DRIED_KELP("dried_kelp"),
  GLOW_BERRIES("glow_berries"),
  HONEY_BOTTLE("honey_bottle"),
  MELON_SLICE("melon_slice"),
  MILK_BUCKET("milk_bucket"),
  MUSHROOM_STEW("mushroom_stew"),
  PUMPKIN_PIE("pumpkin_pie"),
  RABBIT_STEW("rabbit_stew"),
  SWEET_BERRIES("sweet_berries");

  private final String registryName;

  GoldenFoodBases(String registryName) {
    this.registryName = registryName;
  }

  public String registryName() {
    return registryName;
  }
}
