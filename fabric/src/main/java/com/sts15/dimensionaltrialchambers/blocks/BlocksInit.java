package com.sts15.dimensionaltrialchambers.blocks;

import com.sts15.dimensionaltrialchambers.Constants;
import com.sts15.dimensionaltrialchambers.blocks.bulbs.CustomBulb;
import com.sts15.dimensionaltrialchambers.blocks.grates.CustomGrate;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;

public class BlocksInit {

    public static final Block POLISHED_BLACKSTONE_BULB = registerBlock("polished_blackstone_bulb",
            new CustomBulb(FabricBlockSettings.copyOf(Blocks.COPPER_BULB)));

    public static final Block POLISHED_BLACKSTONE_BRICKS_BULB = registerBlock("polished_blackstone_bricks_bulb",
            new CustomBulb(FabricBlockSettings.copyOf(Blocks.COPPER_BULB)));

    public static final Block PURPUR_BULB = registerBlock("purpur_bulb",
            new CustomBulb(FabricBlockSettings.copyOf(Blocks.COPPER_BULB)));

    public static final Block PURPUR_PILLAR_BULB = registerBlock("purpur_pillar_bulb",
            new CustomBulb(FabricBlockSettings.copyOf(Blocks.COPPER_BULB)));

    public static final Block ENDSTONE_BULB = registerBlock("endstone_bulb",
            new CustomBulb(FabricBlockSettings.copyOf(Blocks.COPPER_BULB)));

    public static final Block ENDSTONE_BRICKS_BULB = registerBlock("endstone_bricks_bulb",
            new CustomBulb(FabricBlockSettings.copyOf(Blocks.COPPER_BULB)));

    public static final Block OBSIDIAN_BULB = registerBlock("obsidian_bulb",
            new CustomBulb(FabricBlockSettings.copyOf(Blocks.COPPER_BULB)));

    public static final Block POLISHED_BLACKSTONE_BRICKS_GRATE = registerBlock("polished_blackstone_bricks_grate",
            new CustomGrate(FabricBlockSettings.copyOf(Blocks.WAXED_COPPER_GRATE)
                    .sounds(SoundType.COPPER)
                    .nonOpaque()
                    .requiresTool()
            ));

    public static final Block POLISHED_BLACKSTONE_GRATE = registerBlock("polished_blackstone_grate",
            new CustomGrate(FabricBlockSettings.copyOf(Blocks.WAXED_COPPER_GRATE)
                    .sounds(SoundType.COPPER)
                    .nonOpaque()
                    .requiresTool()
            ));

    public static final Block OBSIDIAN_GRATE = registerBlock("obsidian_grate",
            new CustomGrate(FabricBlockSettings.copyOf(Blocks.WAXED_COPPER_GRATE)
                    .sounds(SoundType.COPPER)
                    .nonOpaque()
                    .requiresTool()
            ));

    public static final Block PURPUR_GRATE = registerBlock("purpur_grate",
            new CustomGrate(FabricBlockSettings.copyOf(Blocks.WAXED_COPPER_GRATE)
                    .sounds(SoundType.COPPER)
                    .nonOpaque()
                    .requiresTool()
            ));

    public static final Block PURPUR_PILLAR_GRATE = registerBlock("purpur_pillar_grate",
            new CustomGrate(FabricBlockSettings.copyOf(Blocks.WAXED_COPPER_GRATE)
                    .sounds(SoundType.COPPER)
                    .nonOpaque()
                    .requiresTool()
            ));

    public static final Block ENDSTONE_GRATE = registerBlock("endstone_grate",
            new CustomGrate(FabricBlockSettings.copyOf(Blocks.WAXED_COPPER_GRATE)
                    .sounds(SoundType.COPPER)
                    .nonOpaque()
                    .requiresTool()
            ));

    public static final Block ENDSTONE_BRICKS_GRATE = registerBlock("endstone_bricks_grate",
            new CustomGrate(FabricBlockSettings.copyOf(Blocks.WAXED_COPPER_GRATE)
                    .sounds(SoundType.COPPER)
                    .nonOpaque()
                    .requiresTool()
            ));

    private static Block registerBlock(String name, Block block) {
        ResourceLocation id = ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, name);
        Block registeredBlock = Registry.register(BuiltInRegistries.BLOCK, id, block);

        // Register BlockItem so it appears in the Creative inventory
        Registry.register(BuiltInRegistries.ITEM, id, new BlockItem(block, new Item.Properties()));

        return registeredBlock;
    }

    public static final CreativeModeTab DIMENSIONALTRIALCHAMBERS_TAB = Registry.register(
            BuiltInRegistries.CREATIVE_MODE_TAB,
            ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, "dimensionaltrialchambers_tab"),
            FabricItemGroup.builder()
                    .icon(() -> new ItemStack(POLISHED_BLACKSTONE_BULB))
                    .title(Component.translatable("key.categories.dimensionaltrialchambers"))
                    .displayItems((params, output) -> {
                        // Add each block to the Creative Tab
                        output.accept(new ItemStack(POLISHED_BLACKSTONE_BULB));
                        output.accept(new ItemStack(POLISHED_BLACKSTONE_BRICKS_BULB));
                        output.accept(new ItemStack(PURPUR_BULB));
                        output.accept(new ItemStack(PURPUR_PILLAR_BULB));
                        output.accept(new ItemStack(ENDSTONE_BULB));
                        output.accept(new ItemStack(ENDSTONE_BRICKS_BULB));
                        output.accept(new ItemStack(OBSIDIAN_BULB));
                        output.accept(new ItemStack(POLISHED_BLACKSTONE_BRICKS_GRATE));
                        output.accept(new ItemStack(POLISHED_BLACKSTONE_GRATE));
                        output.accept(new ItemStack(OBSIDIAN_GRATE));
                        output.accept(new ItemStack(PURPUR_GRATE));
                        output.accept(new ItemStack(PURPUR_PILLAR_GRATE));
                        output.accept(new ItemStack(ENDSTONE_GRATE));
                        output.accept(new ItemStack(ENDSTONE_BRICKS_GRATE));
                    })
                    .build()
    );

    public static void registerBlocks() {
        // This method should be called in the mod initializer to ensure all blocks are registered.
    }
}
