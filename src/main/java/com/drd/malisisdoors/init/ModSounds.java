package com.drd.malisisdoors.init;

import com.drd.malisisdoors.MalisisDoorsReopened;
import net.minecraft.core.registries.Registries;
import net.minecraft.sounds.SoundEvent;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModSounds {
    public static final DeferredRegister<SoundEvent> SOUNDS = DeferredRegister.create(Registries.SOUND_EVENT, MalisisDoorsReopened.MOD_ID);

    public static final DeferredHolder<SoundEvent, SoundEvent> RUSTY_IRON_DOOR_CLOSE = SOUNDS.register("block.rusty_iron_door.close", SoundEvent::createVariableRangeEvent);
    public static final DeferredHolder<SoundEvent, SoundEvent> RUSTY_IRON_DOOR_OPEN = SOUNDS.register("block.rusty_iron_door.open", SoundEvent::createVariableRangeEvent);
    public static final DeferredHolder<SoundEvent, SoundEvent> WOODEN_GLASS_DOOR_TOGGLE = SOUNDS.register("block.wooden_glass_door.toggle", SoundEvent::createVariableRangeEvent);
    public static final DeferredHolder<SoundEvent, SoundEvent> CHERRY_GLASS_DOOR_TOGGLE = SOUNDS.register("block.cherry_glass_door.toggle", SoundEvent::createVariableRangeEvent);
    public static final DeferredHolder<SoundEvent, SoundEvent> BAMBOO_GLASS_DOOR_TOGGLE = SOUNDS.register("block.bamboo_glass_door.toggle", SoundEvent::createVariableRangeEvent);
    public static final DeferredHolder<SoundEvent, SoundEvent> NETHER_GLASS_DOOR_TOGGLE = SOUNDS.register("block.nether_glass_door.toggle", SoundEvent::createVariableRangeEvent);
    public static final DeferredHolder<SoundEvent, SoundEvent> IRON_GLASS_DOOR_TOGGLE = SOUNDS.register("block.iron_glass_door.toggle", SoundEvent::createVariableRangeEvent);
    public static final DeferredHolder<SoundEvent, SoundEvent> RUSTY_IRON_GLASS_DOOR_TOGGLE = SOUNDS.register("block.rusty_iron_glass_door.toggle", SoundEvent::createVariableRangeEvent);
    public static final DeferredHolder<SoundEvent, SoundEvent> COPPER_GLASS_DOOR_TOGGLE = SOUNDS.register("block.copper_glass_door.toggle", SoundEvent::createVariableRangeEvent);
    public static final DeferredHolder<SoundEvent, SoundEvent> IRON_JAIL_DOOR_TOGGLE = SOUNDS.register("block.iron_jail_door.toggle", SoundEvent::createVariableRangeEvent);
    public static final DeferredHolder<SoundEvent, SoundEvent> COPPER_JAIL_DOOR_TOGGLE = SOUNDS.register("block.copper_jail_door.toggle", SoundEvent::createVariableRangeEvent);
    public static final DeferredHolder<SoundEvent, SoundEvent> PNEUMATIC_DOOR_CLOSE = SOUNDS.register("block.pneumatic_door.close", SoundEvent::createVariableRangeEvent);
    public static final DeferredHolder<SoundEvent, SoundEvent> PNEUMATIC_DOOR_OPEN = SOUNDS.register("block.pneumatic_door.open", SoundEvent::createVariableRangeEvent);
    public static final DeferredHolder<SoundEvent, SoundEvent> SHOJI_DOOR_TOGGLE = SOUNDS.register("block.shoji_door.toggle", SoundEvent::createVariableRangeEvent);
    public static final DeferredHolder<SoundEvent, SoundEvent> CHERRY_SHOJI_DOOR_TOGGLE = SOUNDS.register("block.cherry_shoji_door.toggle", SoundEvent::createVariableRangeEvent);
    public static final DeferredHolder<SoundEvent, SoundEvent> BAMBOO_SHOJI_DOOR_TOGGLE = SOUNDS.register("block.bamboo_shoji_door.toggle", SoundEvent::createVariableRangeEvent);
    public static final DeferredHolder<SoundEvent, SoundEvent> NETHER_SHOJI_DOOR_TOGGLE = SOUNDS.register("block.nether_shoji_door.toggle", SoundEvent::createVariableRangeEvent);
    public static final DeferredHolder<SoundEvent, SoundEvent> CARRIAGE_DOOR_CLOSE = SOUNDS.register("block.carriage_door.close", SoundEvent::createVariableRangeEvent);
    public static final DeferredHolder<SoundEvent, SoundEvent> CARRIAGE_DOOR_OPEN = SOUNDS.register("block.carriage_door.open", SoundEvent::createVariableRangeEvent);
    public static final DeferredHolder<SoundEvent, SoundEvent> CHERRY_CARRIAGE_DOOR_CLOSE = SOUNDS.register("block.cherry_carriage_door.close", SoundEvent::createVariableRangeEvent);
    public static final DeferredHolder<SoundEvent, SoundEvent> CHERRY_CARRIAGE_DOOR_OPEN = SOUNDS.register("block.cherry_carriage_door.open", SoundEvent::createVariableRangeEvent);
    public static final DeferredHolder<SoundEvent, SoundEvent> BAMBOO_CARRIAGE_DOOR_CLOSE = SOUNDS.register("block.bamboo_carriage_door.close", SoundEvent::createVariableRangeEvent);
    public static final DeferredHolder<SoundEvent, SoundEvent> BAMBOO_CARRIAGE_DOOR_OPEN = SOUNDS.register("block.bamboo_carriage_door.open", SoundEvent::createVariableRangeEvent);
    public static final DeferredHolder<SoundEvent, SoundEvent> NETHER_CARRIAGE_DOOR_CLOSE = SOUNDS.register("block.nether_carriage_door.close", SoundEvent::createVariableRangeEvent);
    public static final DeferredHolder<SoundEvent, SoundEvent> NETHER_CARRIAGE_DOOR_OPEN = SOUNDS.register("block.nether_carriage_door.open", SoundEvent::createVariableRangeEvent);
    public static final DeferredHolder<SoundEvent, SoundEvent> RUSTY_HATCH_CLOSE = SOUNDS.register("block.rusty_hatch.close", SoundEvent::createVariableRangeEvent);
    public static final DeferredHolder<SoundEvent, SoundEvent> RUSTY_HATCH_OPEN = SOUNDS.register("block.rusty_hatch.open", SoundEvent::createVariableRangeEvent);

    public static void register(IEventBus eventBus) {
        SOUNDS.register(eventBus);
    }
}
