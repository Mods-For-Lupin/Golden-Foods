package com.cursee.golden_foods.impl.common.registry;

import com.cursee.golden_foods.Constants;
import com.cursee.golden_foods.platform.Services;
import java.util.function.BiConsumer;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModTabs {

  public static final CreativeModeTab GOLDEN_FOODS = Services.PLATFORM.tabBuilder()
      .icon(() -> new ItemStack(ModItems.ENCHANTED_GOLDEN_CAKE))
      .title(Component.translatable("itemGroup.goldenFoods"))
      .displayItems((itemDisplayParameters, output) -> {
        ModItems.REGISTERED.forEach((s, item) -> output.accept(item));
      }).build();

  public static void register(BiConsumer<CreativeModeTab, ResourceLocation> consumer) {
    consumer.accept(GOLDEN_FOODS,
        ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, Constants.MOD_ID));
  }
}
