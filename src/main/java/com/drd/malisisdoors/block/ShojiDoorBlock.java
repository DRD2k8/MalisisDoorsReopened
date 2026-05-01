package com.drd.malisisdoors.block;

import com.drd.malisisdoors.block.door.DoorSound;
import com.drd.malisisdoors.block.door.RedstoneBehavior;
import com.drd.malisisdoors.util.ModDoorMovements;

public class ShojiDoorBlock extends AbstractDoorBlock {
    public ShojiDoorBlock(Properties properties, DoorSound doorSound) {
        super(properties, ModDoorMovements.SLIDING_DOOR_SIDE, doorSound, 20, 0, true, false, RedstoneBehavior.STANDARD);
    }
}
