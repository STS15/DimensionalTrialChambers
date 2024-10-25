package com.sts15.dimensionaltrialchambers;

import com.sts15.dimensionaltrialchambers.blocks.BlocksInit;
import net.fabricmc.api.ModInitializer;

public class DimensionalTrialChambers implements ModInitializer {
    
    @Override
    public void onInitialize() {
        // Common setup
        CommonClass.init();

        // Inits
        BlocksInit.registerBlocks();
        //FabricRegistry.init();
    }
}
