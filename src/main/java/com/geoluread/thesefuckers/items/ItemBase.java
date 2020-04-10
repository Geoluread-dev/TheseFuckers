package com.geoluread.thesefuckers.items;

import com.geoluread.thesefuckers.TheseFuckers;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class ItemBase extends Item {
    public ItemBase() {
        super(new Item.Properties().group(TheseFuckers.TABS));
    }
}
