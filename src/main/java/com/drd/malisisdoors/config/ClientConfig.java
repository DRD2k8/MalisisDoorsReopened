package com.drd.malisisdoors.config;

import net.neoforged.neoforge.common.ModConfigSpec;

public class ClientConfig {
    private static final ModConfigSpec.Builder BUILDER = new ModConfigSpec.Builder();

    public static final ModConfigSpec.BooleanValue USE_3D_ITEMS = BUILDER
            .translation("config.malisisdoors.use_3d_items")
            .define("use_3d_items", false);

    public static final ModConfigSpec SPEC = BUILDER.build();
}
