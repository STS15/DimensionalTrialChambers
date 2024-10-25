package com.sts15.dimensionaltrialchambers;

import com.sts15.dimensionaltrialchambers.blocks.BlocksInit;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.renderer.RenderType;

public class DimensionalTrialChambersClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        // Set the render layer to cutout for each of the custom grates
        BlockRenderLayerMap.INSTANCE.putBlock(BlocksInit.POLISHED_BLACKSTONE_BRICKS_GRATE, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlocksInit.POLISHED_BLACKSTONE_GRATE, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlocksInit.OBSIDIAN_GRATE, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlocksInit.PURPUR_GRATE, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlocksInit.PURPUR_PILLAR_GRATE, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlocksInit.ENDSTONE_GRATE, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlocksInit.ENDSTONE_BRICKS_GRATE, RenderType.cutout());
    }
}
