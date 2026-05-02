package com.drd.malisisdoors.block;

import com.drd.malisisdoors.block.door.DoorSound;
import com.drd.malisisdoors.block.door.RedstoneBehavior;
import net.minecraft.world.level.block.WeatheringCopper;

public class WeatheringCopperGlassDoorBlock extends GlassDoorBlock implements ModWeatheringCopper {
    private final WeatheringCopper.WeatherState weatherState;

    public WeatheringCopperGlassDoorBlock(Properties properties, DoorSound doorSound, RedstoneBehavior redstoneBehavior, WeatheringCopper.WeatherState weatherState) {
        super(properties, doorSound, redstoneBehavior);
        this.weatherState = weatherState;
    }

    @Override
    public WeatheringCopper.WeatherState getAge() {
        return this.weatherState;
    }
}
