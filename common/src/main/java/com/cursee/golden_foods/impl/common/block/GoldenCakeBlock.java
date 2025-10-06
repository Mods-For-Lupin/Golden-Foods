package com.cursee.golden_foods.impl.common.block;

import com.cursee.golden_foods.Constants;
import net.minecraft.core.BlockPos;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.stats.Stats;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.CakeBlock;
import net.minecraft.world.level.block.CandleBlock;
import net.minecraft.world.level.block.CandleCakeBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.gameevent.GameEvent;
import net.minecraft.world.phys.BlockHitResult;
import org.jetbrains.annotations.NotNull;

public class GoldenCakeBlock extends CakeBlock {

  public GoldenCakeBlock() {
    super(Properties.ofFullCopy(Blocks.CAKE).setId(ResourceKey.create(Registries.BLOCK,
        ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, "golden_cake"))));
  }

  protected static @NotNull InteractionResult eat(LevelAccessor levelAccessor,
      @NotNull BlockPos blockPos, BlockState blockState, Player player) {

    player.awardStat(Stats.EAT_CAKE_SLICE);

    player.getFoodData().eat(4, 1.2f);
    player.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 100, 1));
    player.addEffect(new MobEffectInstance(MobEffects.ABSORPTION, 2400, 1));

    int currentBites = blockState.getValue(BITES);

    levelAccessor.gameEvent(player, GameEvent.EAT, blockPos);

    if (currentBites < 6) {
      levelAccessor.setBlock(blockPos,
          blockState.setValue(BITES, Integer.valueOf(currentBites + 1)), 3);
    } else {
      levelAccessor.removeBlock(blockPos, false);
      levelAccessor.gameEvent(player, GameEvent.BLOCK_DESTROY, blockPos);
    }

    return InteractionResult.SUCCESS;
  }

  protected InteractionResult useItemOn(ItemStack stack, BlockState state, Level level,
      BlockPos pos, Player player, InteractionHand hand, BlockHitResult hitResult) {
    Item item = stack.getItem();
    if (stack.is(ItemTags.CANDLES) && state.getValue(BITES) == 0) {
      Block var10 = Block.byItem(item);
      if (var10 instanceof CandleBlock candleblock) {
        stack.consume(1, player);
        level.playSound(null, pos, SoundEvents.CAKE_ADD_CANDLE, SoundSource.BLOCKS, 1.0F,
            1.0F);
        level.setBlockAndUpdate(pos, CandleCakeBlock.byCandle(candleblock));
        level.gameEvent(player, GameEvent.BLOCK_CHANGE, pos);
        player.awardStat(Stats.ITEM_USED.get(item));
        return InteractionResult.SUCCESS;
      }
    }

    return InteractionResult.TRY_WITH_EMPTY_HAND;
  }

  protected InteractionResult useWithoutItem(BlockState state, Level level, BlockPos pos,
      Player player, BlockHitResult hitResult) {
    if (level.isClientSide()) {
      if (eat(level, pos, state, player).consumesAction()) {
        return InteractionResult.SUCCESS;
      }

      if (player.getItemInHand(InteractionHand.MAIN_HAND).isEmpty()) {
        return InteractionResult.CONSUME;
      }
    }

    return eat(level, pos, state, player);
  }
}
