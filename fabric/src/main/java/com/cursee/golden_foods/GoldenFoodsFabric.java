package com.cursee.golden_foods;

import net.fabricmc.api.ModInitializer;

public class GoldenFoodsFabric implements ModInitializer {

  @Override
  public void onInitialize() {
    GoldenFoods.init();
  }
}
