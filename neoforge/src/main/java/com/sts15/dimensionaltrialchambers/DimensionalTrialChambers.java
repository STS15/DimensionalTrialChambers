package com.sts15.dimensionaltrialchambers;


import com.sts15.dimensionaltrialchambers.block.BlocksInit;
import com.sts15.dimensionaltrialchambers.init.CreativeTabRegistry;
import com.sts15.dimensionaltrialchambers.items.ItemInit;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.neoforge.client.event.EntityRenderersEvent;

@Mod(Constants.MOD_ID)
public class DimensionalTrialChambers {
    public DimensionalTrialChambers(IEventBus eventBus) {
        CommonClass.init();
        ItemInit.register(eventBus);
        BlocksInit.register(eventBus);
        CreativeTabRegistry.register(eventBus);

    }

    @EventBusSubscriber(modid = Constants.MOD_ID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {

        }

        @SubscribeEvent
        public static void registerBER(EntityRenderersEvent.RegisterRenderers event) {
            ItemBlockRenderTypes.setRenderLayer(BlocksInit.POLISHED_BLACKSTONE_BRICKS_GRATE.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(BlocksInit.POLISHED_BLACKSTONE_GRATE.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(BlocksInit.OBSIDIAN_GRATE.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(BlocksInit.PURPUR_GRATE.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(BlocksInit.PURPUR_PILLAR_GRATE.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(BlocksInit.ENDSTONE_GRATE.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(BlocksInit.ENDSTONE_BRICKS_GRATE.get(), RenderType.cutout());
        }
    }
}