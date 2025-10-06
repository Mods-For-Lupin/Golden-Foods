package com.cursee.golden_foods.datagen_for_common;

import com.cursee.golden_foods.Constants;
import com.cursee.golden_foods.impl.common.registry.ModItems;
import java.util.Iterator;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.ModelProvider;
import net.minecraft.client.data.models.model.ModelTemplate;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.minecraft.data.PackOutput;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.data.event.GatherDataEvent;

@EventBusSubscriber(modid = Constants.MOD_ID)
public class DataGeneration {

  @SubscribeEvent
  public static void onGatherData(final GatherDataEvent.Client event) {
    // DataGenerator generator = event.getGenerator();
    // PackOutput packOutput = generator.getPackOutput();

    // generator.addProvider(true, new ModItemModelProvider(packOutput, Constants.MOD_ID));
    event.createProvider(ModItemModelProvider::new);
  }

  public static class ModItemModelProvider extends ModelProvider {

    public ModItemModelProvider(PackOutput output) {
      super(output, Constants.MOD_ID);
    }

    @Override
    protected void registerModels(BlockModelGenerators blockModels,
        ItemModelGenerators itemModels) {

//      itemModels.generateFlatItem(ModItems.TEST_ITEM, ModelTemplates.FLAT_ITEM);

      Iterator<Item> it = ModItems.REGISTERED.sequencedValues().iterator();
      while (it.hasNext()) {

        final Item goldenItem = it.next();
        final Item enchantedItem = it.next();

        itemModels.generateFlatItem(goldenItem, ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(enchantedItem, goldenItem, ModelTemplates.FLAT_ITEM);
      }
    }
  }
}
