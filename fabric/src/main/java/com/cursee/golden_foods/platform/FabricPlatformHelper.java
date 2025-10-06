package com.cursee.golden_foods.platform;

import com.cursee.golden_foods.platform.services.IPlatformHelper;
import java.nio.file.Path;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.world.item.CreativeModeTab.Builder;

public class FabricPlatformHelper implements IPlatformHelper {

  @Override
  public String getPlatformName() {
    return "Fabric";
  }

  @Override
  public boolean isModLoaded(String modId) {

    return FabricLoader.getInstance().isModLoaded(modId);
  }

  @Override
  public boolean isDevelopmentEnvironment() {

    return FabricLoader.getInstance().isDevelopmentEnvironment();
  }

  @Override
  public Path getGameDirectory() {

    return FabricLoader.getInstance().getGameDir();
  }

  @Override
  public String getGameDirectoryString() {

    return getGameDirectory().toString();
  }

  @Override
  public Builder tabBuilder() {
    return FabricItemGroup.builder();
  }
}
