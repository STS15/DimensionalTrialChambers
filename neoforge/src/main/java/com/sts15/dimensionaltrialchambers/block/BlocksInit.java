package com.sts15.dimensionaltrialchambers.block;

import com.sts15.dimensionaltrialchambers.Constants;
import com.sts15.dimensionaltrialchambers.block.bulbs.CustomBulb;
import com.sts15.dimensionaltrialchambers.block.grates.CustomGrate;
import com.sts15.dimensionaltrialchambers.items.ItemInit;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class BlocksInit {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(Constants.MOD_ID);

    public static final DeferredBlock<Block> POLISHED_BLACKSTONE_BULB = registerBlock("polished_blackstone_bulb",
            () -> new CustomBulb(BlockBehaviour.Properties.ofFullCopy(Blocks.COPPER_BULB)));

    public static final DeferredBlock<Block> POLISHED_BLACKSTONE_BRICKS_BULB = registerBlock("polished_blackstone_bricks_bulb",
            () -> new CustomBulb(BlockBehaviour.Properties.ofFullCopy(Blocks.COPPER_BULB)));

    public static final DeferredBlock<Block> PURPUR_BULB = registerBlock("purpur_bulb",
            () -> new CustomBulb(BlockBehaviour.Properties.ofFullCopy(Blocks.COPPER_BULB)));

    public static final DeferredBlock<Block> PURPUR_PILLAR_BULB = registerBlock("purpur_pillar_bulb",
            () -> new CustomBulb(BlockBehaviour.Properties.ofFullCopy(Blocks.COPPER_BULB)));

    public static final DeferredBlock<Block> ENDSTONE_BULB = registerBlock("endstone_bulb",
            () -> new CustomBulb(BlockBehaviour.Properties.ofFullCopy(Blocks.COPPER_BULB)));

    public static final DeferredBlock<Block> ENDSTONE_BRICKS_BULB = registerBlock("endstone_bricks_bulb",
            () -> new CustomBulb(BlockBehaviour.Properties.ofFullCopy(Blocks.COPPER_BULB)));

    public static final DeferredBlock<Block> OBSIDIAN_BULB = registerBlock("obsidian_bulb",
            () -> new CustomBulb(BlockBehaviour.Properties.ofFullCopy(Blocks.COPPER_BULB)));

    public static final DeferredBlock<Block> POLISHED_BLACKSTONE_BRICKS_GRATE = registerBlock("polished_blackstone_bricks_grate",
            () -> new CustomGrate(BlockBehaviour.Properties.ofFullCopy(Blocks.WAXED_WEATHERED_COPPER_GRATE)
                    .sound(SoundType.COPPER_GRATE)
                    .mapColor(MapColor.COLOR_BLACK)
                    .noOcclusion()
                    .requiresCorrectToolForDrops()
                    .isValidSpawn(Blocks::never)
            ));

    public static final DeferredBlock<Block> POLISHED_BLACKSTONE_GRATE = registerBlock("polished_blackstone_grate",
            () -> new CustomGrate(BlockBehaviour.Properties.ofFullCopy(Blocks.WAXED_WEATHERED_COPPER_GRATE)
                    .sound(SoundType.COPPER_GRATE)
                    .mapColor(MapColor.COLOR_BLACK)
                    .noOcclusion()
                    .requiresCorrectToolForDrops()
                    .isValidSpawn(Blocks::never)
            ));

    public static final DeferredBlock<Block> OBSIDIAN_GRATE = registerBlock("obsidian_grate",
            () -> new CustomGrate(BlockBehaviour.Properties.ofFullCopy(Blocks.WAXED_WEATHERED_COPPER_GRATE)
                    .sound(SoundType.COPPER_GRATE)
                    .mapColor(MapColor.COLOR_BLACK)
                    .noOcclusion()
                    .requiresCorrectToolForDrops()
                    .isValidSpawn(Blocks::never)
            ));

    public static final DeferredBlock<Block> PURPUR_GRATE = registerBlock("purpur_grate",
            () -> new CustomGrate(BlockBehaviour.Properties.ofFullCopy(Blocks.WAXED_WEATHERED_COPPER_GRATE)
                    .sound(SoundType.COPPER_GRATE)
                    .mapColor(MapColor.COLOR_BLACK)
                    .noOcclusion()
                    .requiresCorrectToolForDrops()
                    .isValidSpawn(Blocks::never)
            ));

    public static final DeferredBlock<Block> PURPUR_PILLAR_GRATE = registerBlock("purpur_pillar_grate",
            () -> new CustomGrate(BlockBehaviour.Properties.ofFullCopy(Blocks.WAXED_WEATHERED_COPPER_GRATE)
                    .sound(SoundType.COPPER_GRATE)
                    .mapColor(MapColor.COLOR_BLACK)
                    .noOcclusion()
                    .requiresCorrectToolForDrops()
                    .isValidSpawn(Blocks::never)
            ));

    public static final DeferredBlock<Block> ENDSTONE_GRATE = registerBlock("endstone_grate",
            () -> new CustomGrate(BlockBehaviour.Properties.ofFullCopy(Blocks.WAXED_WEATHERED_COPPER_GRATE)
                    .sound(SoundType.COPPER_GRATE)
                    .mapColor(MapColor.COLOR_BLACK)
                    .noOcclusion()
                    .requiresCorrectToolForDrops()
                    .isValidSpawn(Blocks::never)
            ));

    public static final DeferredBlock<Block> ENDSTONE_BRICKS_GRATE = registerBlock("endstone_bricks_grate",
            () -> new CustomGrate(BlockBehaviour.Properties.ofFullCopy(Blocks.WAXED_WEATHERED_COPPER_GRATE)
                    .sound(SoundType.COPPER_GRATE)
                    .mapColor(MapColor.COLOR_BLACK)
                    .noOcclusion()
                    .requiresCorrectToolForDrops()
                    .isValidSpawn(Blocks::never)
            ));

    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        ItemInit.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
