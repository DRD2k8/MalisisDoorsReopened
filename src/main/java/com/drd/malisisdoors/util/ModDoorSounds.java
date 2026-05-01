package com.drd.malisisdoors.util;

import com.drd.malisisdoors.MalisisDoorsReopened;
import com.drd.malisisdoors.block.door.DoorSound;
import com.drd.malisisdoors.init.ModSounds;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

public class ModDoorSounds {
    private static final Map<String, DoorSound> DOOR_SOUNDS = new LinkedHashMap<>();

    public static final DoorSound WOODEN_DOOR = register(doorSound("wooden_door", SoundEvents.WOODEN_DOOR_OPEN, SoundEvents.WOODEN_DOOR_CLOSE));
    public static final DoorSound CHERRY_DOOR = register(doorSound("cherry_door", SoundEvents.CHERRY_WOOD_DOOR_OPEN, SoundEvents.CHERRY_WOOD_DOOR_CLOSE));
    public static final DoorSound BAMBOO_DOOR = register(doorSound("bamboo_door", SoundEvents.BAMBOO_WOOD_DOOR_OPEN, SoundEvents.BAMBOO_WOOD_DOOR_CLOSE));
    public static final DoorSound NETHER_DOOR = register(doorSound("nether_door", SoundEvents.NETHER_WOOD_DOOR_OPEN, SoundEvents.NETHER_WOOD_DOOR_CLOSE));
    public static final DoorSound IRON_DOOR = register(doorSound("iron_door", SoundEvents.IRON_DOOR_OPEN, SoundEvents.IRON_DOOR_CLOSE));
    public static final DoorSound RUSTY_IRON_DOOR = register(doorSound("rusty_iron_door", ModSounds.RUSTY_IRON_DOOR_OPEN.get(), ModSounds.RUSTY_IRON_DOOR_CLOSE.get()));
    public static final DoorSound COPPER_DOOR = register(doorSound("copper_door", SoundEvents.COPPER_DOOR_OPEN, SoundEvents.COPPER_DOOR_CLOSE));
    public static final DoorSound WOODEN_GLASS_DOOR = register(doorSound("wooden_glass_door", ModSounds.WOODEN_GLASS_DOOR_TOGGLE.get()));
    public static final DoorSound CHERRY_GLASS_DOOR = register(doorSound("cherry_glass_door", ModSounds.CHERRY_GLASS_DOOR_TOGGLE.get()));
    public static final DoorSound BAMBOO_GLASS_DOOR = register(doorSound("bamboo_glass_door", ModSounds.BAMBOO_GLASS_DOOR_TOGGLE.get()));
    public static final DoorSound NETHER_GLASS_DOOR = register(doorSound("nether_glass_door", ModSounds.NETHER_GLASS_DOOR_TOGGLE.get()));
    public static final DoorSound IRON_GLASS_DOOR = register(doorSound("iron_glass_door", ModSounds.IRON_GLASS_DOOR_TOGGLE.get()));
    public static final DoorSound RUSTY_IRON_GLASS_DOOR = register(doorSound("rusty_iron_glass_door", ModSounds.RUSTY_IRON_GLASS_DOOR_TOGGLE.get()));
    public static final DoorSound COPPER_GLASS_DOOR = register(doorSound("copper_glass_door", ModSounds.COPPER_GLASS_DOOR_TOGGLE.get()));
    public static final DoorSound IRON_JAIL_DOOR = register(doorSound("iron_jail_door", ModSounds.IRON_JAIL_DOOR_TOGGLE.get()));
    public static final DoorSound COPPER_JAIL_DOOR = register(doorSound("copper_jail_door", ModSounds.COPPER_JAIL_DOOR_TOGGLE.get()));
    public static final DoorSound PNEUMATIC_DOOR = register(doorSound("pneumatic_door", ModSounds.PNEUMATIC_DOOR_OPEN.get(), ModSounds.PNEUMATIC_DOOR_CLOSE.get()));
    public static final DoorSound SHOJI_DOOR = register(doorSound("shoji_door", ModSounds.SHOJI_DOOR_TOGGLE.get()));
    public static final DoorSound CHERRY_SHOJI_DOOR = register(doorSound("cherry_shoji_door", ModSounds.CHERRY_SHOJI_DOOR_TOGGLE.get()));
    public static final DoorSound BAMBOO_SHOJI_DOOR = register(doorSound("bamboo_shoji_door", ModSounds.BAMBOO_SHOJI_DOOR_TOGGLE.get()));
    public static final DoorSound NETHER_SHOJI_DOOR = register(doorSound("nether_shoji_door", ModSounds.NETHER_SHOJI_DOOR_TOGGLE.get()));
    public static final DoorSound CARRIAGE_DOOR = register(doorSound("carriage_door", ModSounds.CARRIAGE_DOOR_OPEN.get(), ModSounds.CARRIAGE_DOOR_CLOSE.get()));
    public static final DoorSound CHERRY_CARRIAGE_DOOR = register(doorSound("cherry_carriage_door", ModSounds.CHERRY_CARRIAGE_DOOR_OPEN.get(), ModSounds.CHERRY_CARRIAGE_DOOR_CLOSE.get()));
    public static final DoorSound BAMBOO_CARRIAGE_DOOR = register(doorSound("bamboo_carriage_door", ModSounds.BAMBOO_CARRIAGE_DOOR_OPEN.get(), ModSounds.BAMBOO_CARRIAGE_DOOR_CLOSE.get()));
    public static final DoorSound NETHER_CARRIAGE_DOOR = register(doorSound("nether_carriage_door", ModSounds.NETHER_CARRIAGE_DOOR_OPEN.get(), ModSounds.NETHER_CARRIAGE_DOOR_CLOSE.get()));

    private static DoorSound register(DoorSound sound) {
        String key = sound.namespace() + ":" + sound.id();
        DOOR_SOUNDS.put(key, sound);
        return sound;
    }

    private static DoorSound doorSound(String id, SoundEvent openSound, SoundEvent closeSound) {
        return new DoorSound(id, MalisisDoorsReopened.MOD_ID, openSound, closeSound);
    }

    private static DoorSound doorSound(String id, SoundEvent toggleSound) {
        return doorSound(id, toggleSound, toggleSound);
    }

    public static Collection<DoorSound> all() {
        return DOOR_SOUNDS.values();
    }

    public static DoorSound get(String fullId) {
        return DOOR_SOUNDS.get(fullId);
    }
}
