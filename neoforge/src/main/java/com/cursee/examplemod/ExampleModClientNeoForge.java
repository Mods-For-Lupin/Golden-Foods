package com.cursee.examplemod;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.javafmlmod.FMLModContainer;

public class ExampleModClientNeoForge {

  public static IEventBus modEventBus;

  public ExampleModClientNeoForge(IEventBus modEventBus, FMLModContainer fmlModContainer) {
    ExampleModClientNeoForge.modEventBus = modEventBus;
    ExampleModClient.init();
  }
}
