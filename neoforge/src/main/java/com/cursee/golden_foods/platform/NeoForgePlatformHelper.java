package com.cursee.golden_foods.platform;

import com.cursee.golden_foods.platform.services.IPlatformHelper;
import java.nio.file.Path;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTab.Builder;
import net.neoforged.fml.ModList;
import net.neoforged.fml.loading.FMLLoader;

public class NeoForgePlatformHelper implements IPlatformHelper {

  @Override
  public String getPlatformName() {

    return "NeoForge";
  }

  @Override
  public boolean isModLoaded(String modId) {

    return ModList.get().isLoaded(modId);
  }

  @Override
  public boolean isDevelopmentEnvironment() {

    return FMLLoader.getCurrentOrNull() != null && FMLLoader.getCurrent().isProduction();
  }

  @Override
  public Path getGameDirectory() {

    return FMLLoader.getCurrent().getGameDir();
  }

  @Override
  public String getGameDirectoryString() {

    return getGameDirectory().toString();
  }

  @Override
  public Builder tabBuilder() {
    return CreativeModeTab.builder();
  }
}