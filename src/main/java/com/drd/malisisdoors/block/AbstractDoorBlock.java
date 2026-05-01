package com.drd.malisisdoors.block;

import com.drd.malisisdoors.block.door.DoorMovement;
import com.drd.malisisdoors.block.door.DoorSound;
import com.drd.malisisdoors.block.door.RedstoneBehavior;
import net.minecraft.world.level.block.Block;

public abstract class AbstractDoorBlock extends Block {
    private final DoorMovement doorMovement;
    private final DoorSound doorSound;
    private final int openingTime;
    private final int autoCloseDelay;
    private final boolean doubleDoor;
    private final boolean playerDetection;
    private final RedstoneBehavior redstoneBehavior;

    public AbstractDoorBlock(Properties properties, DoorMovement doorMovement, DoorSound doorSound, int openingTime, int autoCloseDelay, boolean doubleDoor, boolean playerDetection, RedstoneBehavior redstoneBehavior) {
        super(properties);
        this.doorMovement = doorMovement;
        this.doorSound = doorSound;
        this.openingTime = openingTime;
        this.autoCloseDelay = autoCloseDelay;
        this.doubleDoor = doubleDoor;
        this.playerDetection = playerDetection;
        this.redstoneBehavior = redstoneBehavior;
    }

    public DoorMovement getDoorMovement() {
        return doorMovement;
    }

    public DoorSound getDoorSound() {
        return doorSound;
    }

    public int getOpeningTime() {
        return openingTime;
    }

    public int getAutoCloseDelay() {
        return autoCloseDelay;
    }

    public boolean isDoubleDoor() {
        return doubleDoor;
    }

    public boolean hasPlayerDetection() {
        return playerDetection;
    }

    public RedstoneBehavior getRedstoneBehavior() {
        return redstoneBehavior;
    }
}
