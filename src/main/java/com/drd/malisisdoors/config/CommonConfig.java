package com.drd.malisisdoors.config;

import net.neoforged.neoforge.common.ModConfigSpec;

public class CommonConfig {
    private static final ModConfigSpec.Builder BUILDER = new ModConfigSpec.Builder();

    public static final ModConfigSpec.BooleanValue MODIFY_VANILLA_DOORS = BUILDER
            .translation("config.malisisdoors.modify_vanilla_doors")
            .define("modify_vanilla_doors", true);

    public static final ModConfigSpec SPEC = BUILDER.build();
}
