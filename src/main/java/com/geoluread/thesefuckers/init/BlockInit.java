package com.geoluread.thesefuckers.init;

import com.geoluread.thesefuckers.TheseFuckers;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;

@Mod.EventBusSubscriber(modid = TheseFuckers.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
@ObjectHolder(TheseFuckers.MOD_ID)
public class BlockInit {

    public static final Block example_block = null;

    @SubscribeEvent
    public static void registerBlocks(final RegistryEvent.Register<Block> event) {
        event.getRegistry().register(new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(0.5f, 15f)));
    }

    public static void registerBlockItems(final RegistryEvent.Register<Item> event) {
        event.getRegistry().register(new BlockItem(example_block, new Item.Properties().maxStackSize(64)).setRegistryName("example_block"));
    }
}
