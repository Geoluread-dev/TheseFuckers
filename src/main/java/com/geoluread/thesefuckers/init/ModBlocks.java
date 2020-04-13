package com.geoluread.thesefuckers.init;

import com.geoluread.thesefuckers.TheseFuckers;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, TheseFuckers.MOD_ID);

    public static final RegistryObject<Block> GOO_BLOCK = BLOCKS.register("goo_block", () -> new Block(Block.Properties.create(Material.ROCK)));
}
