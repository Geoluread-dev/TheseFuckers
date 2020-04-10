package com.geoluread.thesefuckers.init;

import com.geoluread.thesefuckers.TheseFuckers;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;

@Mod.EventBusSubscriber(modid = TheseFuckers.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
@ObjectHolder(TheseFuckers.MOD_ID)
public class ItemInit {

    public static final Item example_item = null;

    @SubscribeEvent
    public static void RegisterItems(final RegistryEvent.Register<Item> event) {
        event.getRegistry().register(new Item(new Item.Properties().group(ItemGroup.MISC)).setRegistryName("example_item"));
    }
}
