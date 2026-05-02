package com.drd.malisisdoors.client.animation.block;

import com.drd.malisisdoors.block.AbstractDoorBlock;
import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.level.Level;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class DoorAnimationManager {
    private static final Map<BlockPos, DoorAnimationState> ACTIVE = new HashMap<>();

    public static void start(Level level, BlockPos pos, AbstractDoorBlock block) {
        DoorAnimationState state = ACTIVE.get(pos);

        if (state == null) {
            state = new DoorAnimationState(
                    block.getDoorMovement(),
                    block.getDoorSound(),
                    block.getOpeningTime(),
                    block.getAutoCloseDelay()
            );
            ACTIVE.put(pos, state);
        }

        state.opening = !state.opening;
        state.ticks = 0;

        if (state.opening) {
            level.playSound(null, pos, state.sound.openSound(), SoundSource.BLOCKS, 1f, 1f);
        } else {
            level.playSound(null, pos, state.sound.closeSound(), SoundSource.BLOCKS, 1f, 1f);
        }
    }

    public static void tick(Level level) {
        Iterator<Map.Entry<BlockPos, DoorAnimationState>> it = ACTIVE.entrySet().iterator();

        while (it.hasNext()) {
            Map.Entry<BlockPos, DoorAnimationState> entry = it.next();
            BlockPos pos = entry.getKey();
            DoorAnimationState state = entry.getValue();

            state.ticks++;

            float speed = 1f / state.openingTime;

            if (state.opening) {
                state.progress = Math.min(1f, state.progress + speed);
            } else {
                state.progress = Math.max(0f, state.progress - speed);
            }

            if (state.progress == 0f && !state.opening) {
                it.remove();
                continue;
            }
            if (state.progress == 1f && state.opening && state.autoCloseDelay <= 0) {
                it.remove();
                continue;
            }

            if (state.opening && state.progress == 1f && state.autoCloseDelay > 0) {
                if (state.ticks >= state.autoCloseDelay) {
                    state.opening = false;
                    state.ticks = 0;
                }
            }
        }
    }

    public static DoorAnimationState get(BlockPos pos) {
        return ACTIVE.get(pos);
    }
}
