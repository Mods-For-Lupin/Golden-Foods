package com.cursee.golden_foods;


import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.javafmlmod.FMLModContainer;

@Mod(Constants.MOD_ID)
public class GoldenFoodsNeoForge {

  public static IEventBus modEventBus;

  public GoldenFoodsNeoForge(IEventBus modEventBus, FMLModContainer fmlModContainer, Dist dist) {
    GoldenFoodsNeoForge.modEventBus = modEventBus;
    GoldenFoods.init();
    if (dist == Dist.CLIENT) new GoldenFoodsClientNeoForge(modEventBus, fmlModContainer);
  }
}