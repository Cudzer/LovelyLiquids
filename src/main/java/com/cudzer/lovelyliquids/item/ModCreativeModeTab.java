package com.cudzer.lovelyliquids.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab
{
    public static final CreativeModeTab LOVELY_LIQUID_TAB = new CreativeModeTab("lovely_liquids_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.HOPS.get());
        }
    };
}
