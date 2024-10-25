package com.sts15.dimensionaltrialchambers.init;

import com.sts15.dimensionaltrialchambers.Constants;
import com.sts15.dimensionaltrialchambers.block.BlocksInit;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class CreativeTabRegistry {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Constants.MOD_ID);

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> DIMENSIONALTRIALCHAMBERS_TAB = CREATIVE_MODE_TABS.register("dimensionaltrialchambers_tab", () -> CreativeModeTab.builder()
            .title(Component.translatable("key.categories.dimensionaltrialchambers"))
            .icon(() -> BlocksInit.POLISHED_BLACKSTONE_BULB.get().asItem().getDefaultInstance())
            .displayItems((parameters, output) -> {
                output.accept(BlocksInit.POLISHED_BLACKSTONE_BULB.get());
                output.accept(BlocksInit.POLISHED_BLACKSTONE_GRATE.get());
                output.accept(BlocksInit.POLISHED_BLACKSTONE_BRICKS_BULB.get());
                output.accept(BlocksInit.POLISHED_BLACKSTONE_BRICKS_GRATE.get());
                output.accept(BlocksInit.OBSIDIAN_BULB.get());
                output.accept(BlocksInit.OBSIDIAN_GRATE.get());
                output.accept(BlocksInit.PURPUR_BULB.get());
                output.accept(BlocksInit.PURPUR_GRATE.get());
                output.accept(BlocksInit.PURPUR_PILLAR_BULB.get());
                output.accept(BlocksInit.PURPUR_PILLAR_GRATE.get());
                output.accept(BlocksInit.ENDSTONE_BULB.get());
                output.accept(BlocksInit.ENDSTONE_GRATE.get());
                output.accept(BlocksInit.ENDSTONE_BRICKS_BULB.get());
                output.accept(BlocksInit.ENDSTONE_BRICKS_GRATE.get());
            }).build());

    public static void register(IEventBus modEventBus) {
        CREATIVE_MODE_TABS.register(modEventBus);
    }
}
