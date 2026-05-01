package com.drd.malisisdoors.block;

import com.drd.malisisdoors.block.door.DoorSound;
import com.drd.malisisdoors.block.door.RedstoneBehavior;
import com.drd.malisisdoors.util.ModDoorMovements;

public class GlassDoorBlock extends AbstractDoorBlock {
    public GlassDoorBlock(Properties properties, DoorSound doorSound, RedstoneBehavior redstoneBehavior) {
        super(properties, ModDoorMovements.SLIDING_DOOR_SIDE, doorSound, 6, 0, true, false, redstoneBehavior);
    }
}
