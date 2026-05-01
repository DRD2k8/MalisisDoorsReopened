package com.drd.malisisdoors.block.door;

import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;

public abstract class DoorMovement {
    private final String id;
    private final String namespace;
    private final String translationKey;

    protected DoorMovement(String id, String namespace) {
        this.id = id;
        this.namespace = namespace;
        this.translationKey = "door_movement." + namespace + "." + id;
    }

    public String id() {
        return id;
    }

    public String namespace() {
        return namespace;
    }

    public String translationKey() {
        return translationKey;
    }

    public Component getDisplayName() {
        return Component.translatable(translationKey);
    }

    public abstract void applyTransform(float progress, PoseStack poseStack, BlockState state, Level level, BlockPos pos);
}
