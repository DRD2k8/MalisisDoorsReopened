package com.drd.malisisdoors.block;

import com.drd.malisisdoors.block.door.DoorMovement;
import com.drd.malisisdoors.block.door.DoorSound;
import com.drd.malisisdoors.block.door.RedstoneBehavior;
import com.drd.malisisdoors.client.animation.block.DoorAnimationManager;
import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DoorBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;

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

    protected InteractionResult useWithoutItem(BlockState state, Level level, BlockPos pos, Player player, BlockHitResult hitResult) {
        if (getRedstoneBehavior() == RedstoneBehavior.REDSTONE_ONLY &&
                !level.hasNeighborSignal(pos)) {
            return InteractionResult.PASS;
        }

        boolean isOpen = state.getValue(DoorBlock.OPEN);
        BlockState newState = state.setValue(DoorBlock.OPEN, !isOpen);
        level.setBlock(pos, newState, Block.UPDATE_ALL);

        DoorSound sound = getDoorSound();
        level.playSound(
                null,
                pos,
                isOpen ? sound.closeSound() : sound.openSound(),
                SoundSource.BLOCKS,
                1.0f,
                1.0f
        );

        DoorAnimationManager.start(level, pos, this);

        return InteractionResult.SUCCESS;
    }
}
