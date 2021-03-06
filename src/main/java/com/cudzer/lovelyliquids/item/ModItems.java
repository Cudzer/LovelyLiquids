package com.cudzer.lovelyliquids.item;

import com.cudzer.lovelyliquids.LovelyLiquidsMain;
import com.cudzer.lovelyliquids.block.ModBlocks;
import com.cudzer.lovelyliquids.item.custom.DigitalPHMeterItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemNameBlockItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;


public class ModItems
{
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, LovelyLiquidsMain.MOD_ID);

    public static final RegistryObject<Item> HOPS_SEED = ITEMS.register("hops_seed",
            () -> new ItemNameBlockItem(ModBlocks.HOPS_PLANT.get(), new Item.Properties().tab(ModCreativeModeTab.LOVELY_LIQUID_TAB)));
    public static final RegistryObject<Item> HOPS = ITEMS.register("hops",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.LOVELY_LIQUID_TAB).food(ModFoods.HOPS)));
    public static final RegistryObject<Item> PH_METER = ITEMS.register("ph_meter",
            () -> new DigitalPHMeterItem(new Item.Properties().tab(ModCreativeModeTab.LOVELY_LIQUID_TAB)));
    public static final RegistryObject<Item> GRAPE_SEED = ITEMS.register("grape_seed",
            () -> new ItemNameBlockItem(ModBlocks.GRAPE_PLANT.get(), new Item.Properties().tab(ModCreativeModeTab.LOVELY_LIQUID_TAB)));
    public static final RegistryObject<Item> GRAPE = ITEMS.register("grape",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.LOVELY_LIQUID_TAB).food(ModFoods.GRAPE)));


    public static void register(IEventBus eventBus)
    {
        ITEMS.register(eventBus);
    }
}
