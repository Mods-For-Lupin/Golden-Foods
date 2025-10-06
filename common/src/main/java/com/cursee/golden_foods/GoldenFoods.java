package com.cursee.golden_foods;

import com.cursee.monolib.api.common.sailing.SailingApi;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.enchantment.Enchantment;

public class GoldenFoods {

  public static final ResourceKey<Enchantment> GOLDEN_FOODS = ResourceKey.create(Registries.ENCHANTMENT, identifier(Constants.MOD_ID));

  public static void init() {
    SailingApi.register(Constants.MOD_ID, Constants.MOD_ID, Constants.MOD_VERSION,
        Constants.MOD_PUBLISHER, Constants.MOD_URL);
  }

  public static ResourceLocation identifier(String path) {
    return ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, path);
  }
}