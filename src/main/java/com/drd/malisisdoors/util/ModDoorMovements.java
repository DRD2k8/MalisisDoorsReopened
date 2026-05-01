package com.drd.malisisdoors.util;

import com.drd.malisisdoors.block.door.DoorMovement;
import com.drd.malisisdoors.door_movement.*;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

public class ModDoorMovements {
    private static final Map<String, DoorMovement> DOOR_MOVEMENTS = new LinkedHashMap<>();

    public static final DoorMovement ROTATING_DOOR = register(new RotatingDoorMovement());
    public static final DoorMovement SLIDING_DOOR_SIDE = register(new SlidingDoorSideMovement());

    private static DoorMovement register(DoorMovement movement) {
        DOOR_MOVEMENTS.put(movement.id(), movement);
        return movement;
    }

    public static Collection<DoorMovement> all() {
        return DOOR_MOVEMENTS.values();
    }

    public static DoorMovement get(String id) {
        return DOOR_MOVEMENTS.get(id);
    }
}
