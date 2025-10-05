package com.cursee.golden_foods;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.javafmlmod.FMLModContainer;

public class GoldenFoodsClientNeoForge {

  public static IEventBus modEventBus;

  public GoldenFoodsClientNeoForge(IEventBus modEventBus, FMLModContainer fmlModContainer) {
    GoldenFoodsClientNeoForge.modEventBus = modEventBus;
    GoldenFoodsClient.init();
  }
}
