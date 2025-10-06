package com.cursee.golden_foods.impl.common.registry;

import com.cursee.golden_foods.GoldenFoods;
import java.util.LinkedHashMap;
import java.util.function.BiConsumer;
import java.util.function.Function;
import net.minecraft.core.component.DataComponents;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Item.Properties;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.component.Consumables;

public class ModItems {

  public static final LinkedHashMap<String, Item> REGISTERED = new LinkedHashMap<>();

  public static final Item GOLDEN_CAKE = new BlockItem(ModBlocks.GOLDEN_CAKE, new Item.Properties().setId(ResourceKey.create(Registries.ITEM, BuiltInRegistries.BLOCK.getKey(ModBlocks.GOLDEN_CAKE))));

  public static final Item ENCHANTED_GOLDEN_CAKE = new BlockItem(ModBlocks.ENCHANTED_GOLDEN_CAKE, new Item.Properties().rarity(Rarity.RARE).component(DataComponents.ENCHANTMENT_GLINT_OVERRIDE, true)
      .setId(ResourceKey.create(Registries.ITEM, BuiltInRegistries.BLOCK.getKey(ModBlocks.ENCHANTED_GOLDEN_CAKE))));

  public static final Item GOLDEN_BAKED_POTATO = registerItem("golden_baked_potato", new Item.Properties().food(ModFoods.GOLDEN_BAKED_POTATO, ModConsumables.GOLDEN_BAKED_POTATO));
  public static final Item GOLDEN_BEETROOT = registerItem("golden_beetroot", new Item.Properties().food(ModFoods.GOLDEN_BEETROOT, ModConsumables.GOLDEN_BEETROOT));
  public static final Item GOLDEN_BEETROOT_SOUP = registerItem("golden_beetroot_soup",
      new Item.Properties().food(ModFoods.GOLDEN_BEETROOT_SOUP, ModConsumables.GOLDEN_BEETROOT_SOUP).usingConvertsTo(Items.BOWL));
  public static final Item GOLDEN_BREAD = registerItem("golden_bread", new Item.Properties().food(ModFoods.GOLDEN_BREAD, ModConsumables.GOLDEN_BREAD));
  public static final Item GOLDEN_CHORUS_FRUIT = registerItem("golden_chorus_fruit", new Item.Properties().food(ModFoods.GOLDEN_CHORUS_FRUIT, ModConsumables.GOLDEN_CHORUS_FRUIT));
  public static final Item GOLDEN_COOKED_BEEF = registerItem("golden_cooked_beef", new Item.Properties().food(ModFoods.GOLDEN_COOKED_BEEF, ModConsumables.GOLDEN_COOKED_BEEF));
  public static final Item GOLDEN_COOKED_CHICKEN = registerItem("golden_cooked_chicken", new Item.Properties().food(ModFoods.GOLDEN_COOKED_CHICKEN, ModConsumables.GOLDEN_COOKED_CHICKEN));
  public static final Item GOLDEN_COOKED_COD = registerItem("golden_cooked_cod", new Item.Properties().food(ModFoods.GOLDEN_COOKED_COD, ModConsumables.GOLDEN_COOKED_COD));
  public static final Item GOLDEN_COOKED_MUTTON = registerItem("golden_cooked_mutton", new Item.Properties().food(ModFoods.GOLDEN_COOKED_MUTTON, ModConsumables.GOLDEN_COOKED_MUTTON));
  public static final Item GOLDEN_COOKED_PORKCHOP = registerItem("golden_cooked_porkchop", new Item.Properties().food(ModFoods.GOLDEN_COOKED_PORKCHOP, ModConsumables.GOLDEN_COOKED_PORKCHOP));
  public static final Item GOLDEN_COOKED_RABBIT = registerItem("golden_cooked_rabbit", new Item.Properties().food(ModFoods.GOLDEN_COOKED_RABBIT, ModConsumables.GOLDEN_COOKED_RABBIT));
  public static final Item GOLDEN_COOKED_SALMON = registerItem("golden_cooked_salmon", new Item.Properties().food(ModFoods.GOLDEN_COOKED_SALMON, ModConsumables.GOLDEN_COOKED_SALMON));
  public static final Item GOLDEN_COOKIE = registerItem("golden_cookie", new Item.Properties().food(ModFoods.GOLDEN_COOKIE, ModConsumables.GOLDEN_COOKIE));
  public static final Item GOLDEN_DRIED_KELP = registerItem("golden_dried_kelp", new Item.Properties().food(ModFoods.GOLDEN_DRIED_KELP, ModConsumables.GOLDEN_DRIED_KELP));
  public static final Item GOLDEN_GLOW_BERRIES = registerItem("golden_glow_berries", new Item.Properties().food(ModFoods.GOLDEN_GLOW_BERRIES, ModConsumables.GOLDEN_GLOW_BERRIES));
  public static final Item GOLDEN_HONEY_BOTTLE = registerItem("golden_honey_bottle", new Item.Properties().food(ModFoods.GOLDEN_HONEY_BOTTLE, ModConsumables.GOLDEN_HONEY_BOTTLE));
  public static final Item GOLDEN_MELON_SLICE = registerItem("golden_melon_slice", new Item.Properties().food(ModFoods.GOLDEN_MELON_SLICE, ModConsumables.GOLDEN_MELON_SLICE));

  public static final Item GOLDEN_MILK_BUCKET = registerItem("golden_milk_bucket",
      new Item.Properties().food(ModFoods.GOLDEN_MILK_BUCKET, ModConsumables.GOLDEN_MILK_BUCKET).craftRemainder(Items.BUCKET).component(DataComponents.CONSUMABLE, ModConsumables.GOLDEN_MILK_BUCKET)
          .usingConvertsTo(Items.BUCKET).stacksTo(1));

  public static final Item GOLDEN_MUSHROOM_STEW = registerItem("golden_mushroom_stew",
      new Item.Properties().food(ModFoods.GOLDEN_MUSHROOM_STEW, ModConsumables.GOLDEN_MUSHROOM_STEW).usingConvertsTo(Items.BOWL));
  public static final Item GOLDEN_PUMPKIN_PIE = registerItem("golden_pumpkin_pie", new Item.Properties().food(ModFoods.GOLDEN_PUMPKIN_PIE, ModConsumables.GOLDEN_PUMPKIN_PIE));
  public static final Item GOLDEN_RABBIT_STEW = registerItem("golden_rabbit_stew",
      new Item.Properties().food(ModFoods.GOLDEN_RABBIT_STEW, ModConsumables.GOLDEN_RABBIT_STEW).usingConvertsTo(Items.BOWL));
  public static final Item GOLDEN_SWEET_BERRIES = registerItem("golden_sweet_berries", new Item.Properties().food(ModFoods.GOLDEN_SWEET_BERRIES, ModConsumables.GOLDEN_SWEET_BERRIES));

  public static final Item ENCHANTED_GOLDEN_BAKED_POTATO = registerItem("enchanted_golden_baked_potato",
      new Item.Properties().rarity(Rarity.RARE).food(ModFoods.ENCHANTED_GOLDEN_BAKED_POTATO, ModConsumables.ENCHANTED_GOLDEN_BAKED_POTATO).component(DataComponents.ENCHANTMENT_GLINT_OVERRIDE, true));
  public static final Item ENCHANTED_GOLDEN_BEETROOT = registerItem("enchanted_golden_beetroot",
      new Item.Properties().rarity(Rarity.RARE).food(ModFoods.ENCHANTED_GOLDEN_BEETROOT, ModConsumables.ENCHANTED_GOLDEN_BEETROOT).component(DataComponents.ENCHANTMENT_GLINT_OVERRIDE, true));
  public static final Item ENCHANTED_GOLDEN_BEETROOT_SOUP = registerItem("enchanted_golden_beetroot_soup",
      new Item.Properties().rarity(Rarity.RARE).food(ModFoods.ENCHANTED_GOLDEN_BEETROOT_SOUP, ModConsumables.ENCHANTED_GOLDEN_BEETROOT_SOUP).component(DataComponents.ENCHANTMENT_GLINT_OVERRIDE, true)
          .usingConvertsTo(Items.BOWL));
  public static final Item ENCHANTED_GOLDEN_BREAD = registerItem("enchanted_golden_bread",
      new Item.Properties().rarity(Rarity.RARE).food(ModFoods.ENCHANTED_GOLDEN_BREAD, ModConsumables.ENCHANTED_GOLDEN_BREAD).component(DataComponents.ENCHANTMENT_GLINT_OVERRIDE, true));
  public static final Item ENCHANTED_GOLDEN_CARROT = registerItem("enchanted_golden_carrot",
      new Item.Properties().rarity(Rarity.RARE).food(ModFoods.ENCHANTED_GOLDEN_CARROT, ModConsumables.ENCHANTED_GOLDEN_CARROT).component(DataComponents.ENCHANTMENT_GLINT_OVERRIDE, true));
  public static final Item ENCHANTED_GOLDEN_CHORUS_FRUIT = registerItem("enchanted_golden_chorus_fruit",
      new Item.Properties().rarity(Rarity.RARE).food(ModFoods.ENCHANTED_GOLDEN_CHORUS_FRUIT, ModConsumables.ENCHANTED_GOLDEN_CHORUS_FRUIT).component(DataComponents.ENCHANTMENT_GLINT_OVERRIDE, true));
  public static final Item ENCHANTED_GOLDEN_COOKED_BEEF = registerItem("enchanted_golden_cooked_beef",
      new Item.Properties().rarity(Rarity.RARE).food(ModFoods.ENCHANTED_GOLDEN_COOKED_BEEF, ModConsumables.ENCHANTED_GOLDEN_COOKED_BEEF).component(DataComponents.ENCHANTMENT_GLINT_OVERRIDE, true));
  public static final Item ENCHANTED_GOLDEN_COOKED_CHICKEN = registerItem("enchanted_golden_cooked_chicken",
      new Item.Properties().rarity(Rarity.RARE).food(ModFoods.ENCHANTED_GOLDEN_COOKED_CHICKEN, ModConsumables.ENCHANTED_GOLDEN_COOKED_CHICKEN)
          .component(DataComponents.ENCHANTMENT_GLINT_OVERRIDE, true));
  public static final Item ENCHANTED_GOLDEN_COOKED_COD = registerItem("enchanted_golden_cooked_cod",
      new Item.Properties().rarity(Rarity.RARE).food(ModFoods.ENCHANTED_GOLDEN_COOKED_COD, ModConsumables.ENCHANTED_GOLDEN_COOKED_COD).component(DataComponents.ENCHANTMENT_GLINT_OVERRIDE, true));
  public static final Item ENCHANTED_GOLDEN_COOKED_MUTTON = registerItem("enchanted_golden_cooked_mutton",
      new Item.Properties().rarity(Rarity.RARE).food(ModFoods.ENCHANTED_GOLDEN_COOKED_MUTTON, ModConsumables.ENCHANTED_GOLDEN_COOKED_MUTTON)
          .component(DataComponents.ENCHANTMENT_GLINT_OVERRIDE, true));
  public static final Item ENCHANTED_GOLDEN_COOKED_PORKCHOP = registerItem("enchanted_golden_cooked_porkchop",
      new Item.Properties().rarity(Rarity.RARE).food(ModFoods.ENCHANTED_GOLDEN_COOKED_PORKCHOP, ModConsumables.ENCHANTED_GOLDEN_COOKED_PORKCHOP)
          .component(DataComponents.ENCHANTMENT_GLINT_OVERRIDE, true));
  public static final Item ENCHANTED_GOLDEN_COOKED_RABBIT = registerItem("enchanted_golden_cooked_rabbit",
      new Item.Properties().rarity(Rarity.RARE).food(ModFoods.ENCHANTED_GOLDEN_COOKED_RABBIT, ModConsumables.ENCHANTED_GOLDEN_COOKED_RABBIT)
          .component(DataComponents.ENCHANTMENT_GLINT_OVERRIDE, true));
  public static final Item ENCHANTED_GOLDEN_COOKED_SALMON = registerItem("enchanted_golden_cooked_salmon",
      new Item.Properties().rarity(Rarity.RARE).food(ModFoods.ENCHANTED_GOLDEN_COOKED_SALMON, ModConsumables.ENCHANTED_GOLDEN_COOKED_SALMON)
          .component(DataComponents.ENCHANTMENT_GLINT_OVERRIDE, true));
  public static final Item ENCHANTED_GOLDEN_COOKIE = registerItem("enchanted_golden_cookie",
      new Item.Properties().rarity(Rarity.RARE).food(ModFoods.ENCHANTED_GOLDEN_COOKIE, ModConsumables.ENCHANTED_GOLDEN_COOKIE).component(DataComponents.ENCHANTMENT_GLINT_OVERRIDE, true));
  public static final Item ENCHANTED_GOLDEN_DRIED_KELP = registerItem("enchanted_golden_dried_kelp",
      new Item.Properties().rarity(Rarity.RARE).food(ModFoods.ENCHANTED_GOLDEN_DRIED_KELP, ModConsumables.ENCHANTED_GOLDEN_DRIED_KELP).component(DataComponents.ENCHANTMENT_GLINT_OVERRIDE, true));
  public static final Item ENCHANTED_GOLDEN_GLOW_BERRIES = registerItem("enchanted_golden_glow_berries",
      new Item.Properties().rarity(Rarity.RARE).food(ModFoods.ENCHANTED_GOLDEN_GLOW_BERRIES, ModConsumables.ENCHANTED_GOLDEN_GLOW_BERRIES).component(DataComponents.ENCHANTMENT_GLINT_OVERRIDE, true));
  public static final Item ENCHANTED_GOLDEN_HONEY_BOTTLE = registerItem("enchanted_golden_honey_bottle",
      new Item.Properties().rarity(Rarity.RARE).food(ModFoods.ENCHANTED_GOLDEN_HONEY_BOTTLE, ModConsumables.ENCHANTED_GOLDEN_HONEY_BOTTLE).component(DataComponents.ENCHANTMENT_GLINT_OVERRIDE, true));
  public static final Item ENCHANTED_GOLDEN_MELON_SLICE = registerItem("enchanted_golden_melon_slice",
      new Item.Properties().rarity(Rarity.RARE).food(ModFoods.ENCHANTED_GOLDEN_MELON_SLICE, ModConsumables.ENCHANTED_GOLDEN_MELON_SLICE).component(DataComponents.ENCHANTMENT_GLINT_OVERRIDE, true));

  public static final Item ENCHANTED_GOLDEN_MILK_BUCKET = registerItem("enchanted_golden_milk_bucket",
      new Item.Properties().rarity(Rarity.RARE).food(ModFoods.ENCHANTED_GOLDEN_MILK_BUCKET, ModConsumables.ENCHANTED_GOLDEN_MILK_BUCKET).component(DataComponents.ENCHANTMENT_GLINT_OVERRIDE, true)
          .craftRemainder(Items.BUCKET).component(DataComponents.CONSUMABLE, ModConsumables.ENCHANTED_GOLDEN_MILK_BUCKET).usingConvertsTo(Items.BUCKET).stacksTo(1));

  public static final Item ENCHANTED_GOLDEN_MUSHROOM_STEW = registerItem("enchanted_golden_mushroom_stew",
      new Item.Properties().rarity(Rarity.RARE).food(ModFoods.ENCHANTED_GOLDEN_MUSHROOM_STEW, ModConsumables.ENCHANTED_GOLDEN_MUSHROOM_STEW).component(DataComponents.ENCHANTMENT_GLINT_OVERRIDE, true)
          .usingConvertsTo(Items.BOWL));
  public static final Item ENCHANTED_GOLDEN_PUMPKIN_PIE = registerItem("enchanted_golden_pumpkin_pie",
      new Item.Properties().rarity(Rarity.RARE).food(ModFoods.ENCHANTED_GOLDEN_PUMPKIN_PIE, ModConsumables.ENCHANTED_GOLDEN_PUMPKIN_PIE).component(DataComponents.ENCHANTMENT_GLINT_OVERRIDE, true));
  public static final Item ENCHANTED_GOLDEN_RABBIT_STEW = registerItem("enchanted_golden_rabbit_stew",
      new Item.Properties().rarity(Rarity.RARE).food(ModFoods.ENCHANTED_GOLDEN_RABBIT_STEW, ModConsumables.ENCHANTED_GOLDEN_RABBIT_STEW).component(DataComponents.ENCHANTMENT_GLINT_OVERRIDE, true)
          .usingConvertsTo(Items.BOWL));
  public static final Item ENCHANTED_GOLDEN_SWEET_BERRIES = registerItem("enchanted_golden_sweet_berries",
      new Item.Properties().rarity(Rarity.RARE).food(ModFoods.ENCHANTED_GOLDEN_SWEET_BERRIES, ModConsumables.ENCHANTED_GOLDEN_SWEET_BERRIES)
          .component(DataComponents.ENCHANTMENT_GLINT_OVERRIDE, true));

  public static void register(BiConsumer<Item, ResourceLocation> consumer) {

//    consumer.accept(GOLDEN_CAKE, BuiltInRegistries.BLOCK.getKey(ModBlocks.GOLDEN_CAKE));
    REGISTERED.put("golden_cake", GOLDEN_CAKE);

//    consumer.accept(ENCHANTED_GOLDEN_CAKE,
//        BuiltInRegistries.BLOCK.getKey(ModBlocks.ENCHANTED_GOLDEN_CAKE));
    REGISTERED.put("enchanted_golden_cake", ENCHANTED_GOLDEN_CAKE);

    REGISTERED.entrySet().forEach(stringItemEntry -> {
      consumer.accept(stringItemEntry.getValue(), GoldenFoods.identifier(stringItemEntry.getKey()));
    });

//    Stream<String> bases = Arrays.stream(GoldenFoodBases.values())
//        .map(GoldenFoodBases::registryName);
//
//    bases.forEach(base -> {
//      final ResourceLocation goldenRL = ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID,
//          "golden_" + base);
//      final Item GOLDEN_ITEM = new Item(
//          new Item.Properties().food(Foods.GOLDEN_APPLE, Consumables.GOLDEN_APPLE)
//              .setId(ResourceKey.create(Registries.ITEM, goldenRL)));
//      consumer.accept(GOLDEN_ITEM, goldenRL);
//      REGISTERED.add(GOLDEN_ITEM);
//
//      final ResourceLocation enchantedGoldenRL = ResourceLocation.fromNamespaceAndPath(
//          Constants.MOD_ID, "enchanted_golden_" + base);
//      final Item ENCHANTED_GOLDEN_ITEM = new Item(new Item.Properties().rarity(Rarity.RARE)
//          .food(Foods.ENCHANTED_GOLDEN_APPLE, Consumables.ENCHANTED_GOLDEN_APPLE)
//          .component(DataComponents.ENCHANTMENT_GLINT_OVERRIDE, true)
//          .setId(ResourceKey.create(Registries.ITEM, enchantedGoldenRL)));
//      consumer.accept(ENCHANTED_GOLDEN_ITEM, enchantedGoldenRL);
//      REGISTERED.add(ENCHANTED_GOLDEN_ITEM);
//    });
  }

  private static ResourceKey<Item> vanillaItemId(String name) {
    return ResourceKey.create(Registries.ITEM, GoldenFoods.identifier(name));
  }

  public static Item registerItem(String name, Function<Properties, Item> factory) {
    return registerItem(vanillaItemId(name), factory, new Item.Properties());
  }

  public static Item registerItem(String name, Function<Item.Properties, Item> factory, Item.Properties properties) {
    return registerItem(vanillaItemId(name), factory, properties);
  }

  public static Item registerItem(String name, Item.Properties properties) {
    return registerItem(vanillaItemId(name), Item::new, properties);
  }

  public static Item registerItem(String name) {
    return registerItem(vanillaItemId(name), Item::new, new Item.Properties());
  }

  public static Item registerItem(ResourceKey<Item> key, Function<Item.Properties, Item> factory) {
    return registerItem(key, factory, new Item.Properties());
  }

  public static Item registerItem(ResourceKey<Item> key, Function<Item.Properties, Item> factory, Item.Properties properties) {

    var item = factory.apply(properties.setId(key));

    REGISTERED.put(key.location().getPath(), item);

    return item;
  }
}
