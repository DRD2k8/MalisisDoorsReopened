package com.drd.malisisdoors.door_movement;

import com.drd.malisisdoors.MalisisDoorsReopened;
import com.drd.malisisdoors.block.door.DoorMovement;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.math.Axis;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.DoorBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.DoorHingeSide;

public class RotatingDoorMovement extends DoorMovement {
    public RotatingDoorMovement() {
        super("rotating_door", MalisisDoorsReopened.MOD_ID);
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

        float angle = 90f * progress;

        if (hingeRight) {
            poseStack.translate(1, 0, 0);
            poseStack.mulPose(Axis.YP.rotationDegrees(angle));
            poseStack.translate(-1, 0, 0);
        } else {
            poseStack.mulPose(Axis.YP.rotationDegrees(-angle));
        }
    }
}
