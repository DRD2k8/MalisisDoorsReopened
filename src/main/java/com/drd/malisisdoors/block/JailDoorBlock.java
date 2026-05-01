package com.drd.malisisdoors.block;

import com.drd.malisisdoors.block.door.DoorSound;
import com.drd.malisisdoors.block.door.RedstoneBehavior;
import com.drd.malisisdoors.util.ModDoorMovements;

public class JailDoorBlock extends AbstractDoorBlock {
    public JailDoorBlock(Properties properties, DoorSound doorSound) {
        super(properties, ModDoorMovements.SLIDING_DOOR_SIDE, doorSound, 12, 0, true, false, RedstoneBehavior.REDSTONE_ONLY);
    }
}
