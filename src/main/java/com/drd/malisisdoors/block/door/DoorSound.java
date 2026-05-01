package com.drd.malisisdoors.block.door;

import net.minecraft.network.chat.Component;
import net.minecraft.sounds.SoundEvent;

public class DoorSound {
    private final String id;
    private final String namespace;
    private final String translationKey;
    private final SoundEvent openSound;
    private final SoundEvent closeSound;

    public DoorSound(String id, String namespace, SoundEvent openSound, SoundEvent closeSound) {
        this.id = id;
        this.namespace = namespace;
        this.translationKey = "door_sound." + namespace + "." + id;
        this.openSound = openSound;
        this.closeSound = closeSound;
    }

    public String id() {
        return id;
    }

    public String namespace() {
        return namespace;
    }

    public String translationKey() {
        return translationKey;
    }

    public Component getDisplayName() {
        return Component.translatable(translationKey);
    }

    public SoundEvent openSound() {
        return openSound;
    }

    public SoundEvent closeSound() {
        return closeSound;
    }
}
