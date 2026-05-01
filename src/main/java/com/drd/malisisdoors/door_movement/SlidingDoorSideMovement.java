package com.drd.malisisdoors.door_movement;

import com.drd.malisisdoors.MalisisDoorsReopened;
import com.drd.malisisdoors.block.door.DoorMovement;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.DoorBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.DoorHingeSide;

public class SlidingDoorSideMovement extends DoorMovement {
    public SlidingDoorSideMovement() {
        super("sliding_door_side", MalisisDoorsReopened.MOD_ID);
    }

    @Override
    public void applyTransform(
            float progress,
            PoseStack poseStack,
            BlockState state,
            Level level,
            BlockPos pos
    ) {
        boolean hingeRight = state.getValue(DoorBlock.HINGE) == DoorHingeSide.RIGHT;

        float slide = 1.0f * progress;

        if (hingeRight) {
            poseStack.translate(slide, 0, 0);
        } else {
            poseStack.translate(-slide, 0, 0);
        }
    }
}
