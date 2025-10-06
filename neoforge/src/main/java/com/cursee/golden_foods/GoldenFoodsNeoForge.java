package com.cursee.golden_foods;


import com.cursee.golden_foods.impl.common.registry.ModBlocks;
import com.cursee.golden_foods.impl.common.registry.ModItems;
import com.cursee.golden_foods.impl.common.registry.ModTabs;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.Event;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.javafmlmod.FMLModContainer;
import net.neoforged.neoforge.registries.RegisterEvent;

@Mod(Constants.MOD_ID)
public class GoldenFoodsNeoForge {

  public static IEventBus modEventBus;

  public GoldenFoodsNeoForge(IEventBus modEventBus, FMLModContainer fmlModContainer, Dist dist) {

    GoldenFoodsNeoForge.modEventBus = modEventBus;

    bind(Registries.BLOCK, ModBlocks::register);
    bind(Registries.ITEM, ModItems::register);
    bind(Registries.CREATIVE_MODE_TAB, ModTabs::register);

    GoldenFoods.init();
    if (dist == Dist.CLIENT) new GoldenFoodsClientNeoForge(modEventBus, fmlModContainer);
  }

  public static <T> void bind(ResourceKey<Registry<T>> registry, Consumer<BiConsumer<T, ResourceLocation>> source) {
    modEventBus.addListener((Consumer<RegisterEvent>) event -> {
      if (registry.equals(event.getRegistryKey())) {
        source.accept((t, rl) -> event.register(registry, rl, () -> t));
      }
    });
  }
}