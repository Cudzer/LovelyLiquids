package com.cudzer.lovelyliquids.util;

import com.cudzer.lovelyliquids.LovelyLiquidsMain;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static class Blocks{
        public static final TagKey<Block> VALID_PH_TARGETS = tag("ph_meter_valid_targets");

        private static TagKey<Block> tag(String name)
        {
            return BlockTags.create(new ResourceLocation(LovelyLiquidsMain.MOD_ID, name));
        }

        private static TagKey<Block> forgeTag(String name)
        {
            return BlockTags.create(new ResourceLocation("forge", name));
        }
    }

    public static class Items{
        public static final TagKey<Item> HOPS_CROP = forgeTag("crops/hops");
        public static final TagKey<Item> HOPS_SEED = forgeTag("seeds/hops_seed");

        private static TagKey<Item> tag(String name)
        {
            return ItemTags.create(new ResourceLocation(LovelyLiquidsMain.MOD_ID, name));
        }

        private static TagKey<Item> forgeTag(String name)
        {
            return ItemTags.create(new ResourceLocation("forge", name));
        }
    }
}
