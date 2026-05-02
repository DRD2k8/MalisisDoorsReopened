package com.drd.malisisdoors.client.animation.block;

import com.drd.malisisdoors.block.door.DoorMovement;
import com.drd.malisisdoors.block.door.DoorSound;

public class DoorAnimationState {
    public final DoorMovement movement;
    public final DoorSound sound;
    public final int openingTime;
    public final int autoCloseDelay;

    public float progress = 0f;
    public boolean opening = true;
    public int ticks = 0;

    public DoorAnimationState(DoorMovement movement,
                              DoorSound sound,
                              int openingTime,
                              int autoCloseDelay) {
        this.movement = movement;
        this.sound = sound;
        this.openingTime = openingTime;
        this.autoCloseDelay = autoCloseDelay;
    }
}
