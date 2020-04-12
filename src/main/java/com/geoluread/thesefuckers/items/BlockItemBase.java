package com.geoluread.thesefuckers.items;

import com.geoluread.thesefuckers.TheseFuckers;
import com.geoluread.thesefuckers.util.RegistryHandler;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;

public class BlockItemBase extends BlockItem {

    public BlockItemBase() {
        super(RegistryHandler.EXAMPLE_BLOCK.get(), new Item.Properties().group(TheseFuckers.TABS));
    }
}
