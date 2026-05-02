package com.drd.malisisdoors.block;

import com.google.common.base.Suppliers;
import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.ChangeOverTimeBlock;
import net.minecraft.world.level.block.WeatheringCopper;
import net.minecraft.world.level.block.state.BlockState;
import net.neoforged.neoforge.common.DataMapHooks;
import net.neoforged.neoforge.registries.datamaps.builtin.NeoForgeDataMaps;
import net.neoforged.neoforge.registries.datamaps.builtin.Oxidizable;

import java.util.Optional;
import java.util.function.Supplier;

public interface ModWeatheringCopper extends ChangeOverTimeBlock<WeatheringCopper.WeatherState> {
    Supplier<BiMap<Block, Block>> NEXT_BY_BLOCK = Suppliers.memoize(() -> (BiMap)ImmutableBiMap.builder().build());

    Supplier<BiMap<Block, Block>> PREVIOUS_BY_BLOCK = Suppliers.memoize(() -> ((BiMap)NEXT_BY_BLOCK.get()).inverse());

    static Optional<Block> getPrevious(Block block) {
        return Optional.ofNullable(getPreviousOxidizedStage(block));
    }

    static Block getFirst(Block block) {
        Block candiate = block;

        for(Block previous = getPreviousOxidizedStage(block); previous != null; previous = getPreviousOxidizedStage(previous)) {
            candiate = previous;
        }

        return candiate;
    }

    static Optional<BlockState> getPrevious(BlockState state) {
        return getPrevious(state.getBlock()).map((s) -> s.withPropertiesOf(state));
    }

    static Optional<Block> getNext(Block block) {
        return Optional.ofNullable(getNextOxidizedStage(block));
    }

    public static Block getPreviousOxidizedStage(Block block) {
        return DataMapHooks.INVERSE_OXIDIZABLES_DATAMAP.containsKey(block) ? DataMapHooks.INVERSE_OXIDIZABLES_DATAMAP.get(block) : ModWeatheringCopper.PREVIOUS_BY_BLOCK.get().get(block);
    }

    public static Block getNextOxidizedStage(Block block) {
        Oxidizable oxidizable = block.builtInRegistryHolder().getData(NeoForgeDataMaps.OXIDIZABLES);
        return oxidizable != null ? oxidizable.nextOxidationStage() : ModWeatheringCopper.NEXT_BY_BLOCK.get().get(block);
    }

    static BlockState getFirst(BlockState state) {
        return getFirst(state.getBlock()).withPropertiesOf(state);
    }

    default Optional<BlockState> getNext(BlockState state) {
        return getNext(state.getBlock()).map((s) -> s.withPropertiesOf(state));
    }

    default float getChanceModifier() {
        return this.getAge() == WeatheringCopper.WeatherState.UNAFFECTED ? 0.75F : 1.0F;
    }
}
