package com.geoluread.thesefuckers.init;

import com.geoluread.thesefuckers.TheseFuckers;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, TheseFuckers.MOD_ID);

    public static final RegistryObject<Item> GOO = ITEMS.register("goo", () -> new Item(new Item.Properties().group(TheseFuckers.TABS)));
    public static final RegistryObject<Item> GOO_ITEM = ITEMS.register("goo_block", () -> new BlockItem(ModBlocks.GOO_BLOCK.get(), new Item.Properties().group(TheseFuckers.TABS)));
}
