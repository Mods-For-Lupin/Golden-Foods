package com.cursee.golden_foods.impl.common.registry;

import com.cursee.golden_foods.Constants;
import com.cursee.golden_foods.impl.common.block.EnchantedGoldenCakeBlock;
import com.cursee.golden_foods.impl.common.block.GoldenCakeBlock;
import java.util.function.BiConsumer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;

public class ModBlocks {

  public static final Block GOLDEN_CAKE = new GoldenCakeBlock();
  public static final Block ENCHANTED_GOLDEN_CAKE = new EnchantedGoldenCakeBlock();

  public static void register(BiConsumer<Block, ResourceLocation> consumer) {
    consumer.accept(GOLDEN_CAKE,
        ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, "golden_cake"));
    consumer.accept(ENCHANTED_GOLDEN_CAKE,
        ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, "enchanted_golden_cake"));
  }
}
