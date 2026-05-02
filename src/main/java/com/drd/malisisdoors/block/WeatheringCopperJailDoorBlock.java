package com.drd.malisisdoors.block;

import com.drd.malisisdoors.block.door.DoorSound;
import net.minecraft.world.level.block.WeatheringCopper;

public class WeatheringCopperJailDoorBlock extends JailDoorBlock implements ModWeatheringCopper {
    private final WeatheringCopper.WeatherState weatherState;

    public WeatheringCopperJailDoorBlock(Properties properties, DoorSound doorSound, WeatheringCopper.WeatherState weatherState) {
        super(properties, doorSound);
        this.weatherState = weatherState;
    }

    @Override
    public WeatheringCopper.WeatherState getAge() {
        return this.weatherState;
    }
}
