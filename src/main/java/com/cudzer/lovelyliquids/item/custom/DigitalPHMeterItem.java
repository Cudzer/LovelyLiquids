package com.cudzer.lovelyliquids.item.custom;

import com.cudzer.lovelyliquids.util.ModTags;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Registry;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class DigitalPHMeterItem extends Item {

    public DigitalPHMeterItem(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public InteractionResult useOn(UseOnContext pContext) {
        if(pContext.getLevel().isClientSide())
        {
            BlockPos positionClicked = pContext.getClickedPos();
            Player player = pContext.getPlayer();
            Block block = pContext.getLevel().getBlockState(positionClicked).getBlock();

            if(isValidTarget(block))
            {
                testPHLevel(positionClicked, player);
            }
            else
            {
                player.sendMessage(new TranslatableComponent("item.lovelyliquids.ph_meter.no_valid_target"), player.getUUID());
            }
        }
        return super.useOn(pContext);
    }

    @Override
    public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
        if(Screen.hasShiftDown())
        {
            pTooltipComponents.add(new TranslatableComponent("tooltip.lovelyliquids.ph_meter.tooltip.shift"));
        }
        else
        {
            pTooltipComponents.add(new TranslatableComponent("tooltip.lovelyliquids.ph_meter.tooltip"));
        }
    }

    private boolean isValidTarget(Block block)
    {
        return Registry.BLOCK.getHolderOrThrow(Registry.BLOCK.getResourceKey(block).get()).is(ModTags.Blocks.VALID_PH_TARGETS);
    }

    private void testPHLevel(BlockPos blockPos, Player player)
    {
        player.sendMessage(new TextComponent("Tested the PH!"), player.getUUID());
    }
}
