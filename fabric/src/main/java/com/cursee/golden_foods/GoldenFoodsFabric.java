package com.cursee.golden_foods;

import com.cursee.golden_foods.impl.common.EnchantedGoldenFoodCreationMethod;
import com.cursee.golden_foods.impl.common.registry.ModBlocks;
import com.cursee.golden_foods.impl.common.registry.ModItems;
import com.cursee.golden_foods.impl.common.registry.ModTabs;
import com.cursee.monolib.impl.common.event.FabricAnvilCreateResultEvent;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import net.fabricmc.api.ModInitializer;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;

public class GoldenFoodsFabric implements ModInitializer {

  @Override
  public void onInitialize() {

    bind(BuiltInRegistries.BLOCK, ModBlocks::register);
    bind(BuiltInRegistries.ITEM, ModItems::register);
    bind(BuiltInRegistries.CREATIVE_MODE_TAB, ModTabs::register);

    GoldenFoods.init();

    FabricAnvilCreateResultEvent.EVENT.register(EnchantedGoldenFoodCreationMethod::createGoldenFoods);
    // FabricAnvilCreateResultEvent.EVENT.register((anvilMenu, itemStack, itemStack1, itemStack2, s, i, player) -> EnchantedGoldenFoodCreationMethodFabric.createGoldenFoods(itemStack, itemStack1, itemStack2, s, i, player));
  }

  public static <T> void bind(Registry<T> registry, Consumer<BiConsumer<T, ResourceLocation>> source) {
    source.accept((t, rl) -> Registry.register(registry, rl, t));
  }
}
