package com.mrmelon54.infrastructury.event.events.common;

import com.mrmelon54.infrastructury.event.Event;
import com.mrmelon54.infrastructury.event.EventWrapper;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.level.chunk.ChunkAccess;
import org.jetbrains.annotations.Nullable;

public interface ChunkEvent {
    interface Inner extends remapped.architectury.event.events.common.ChunkEvent {
    }

    Event<SaveData> SAVE_DATA = EventWrapper.of(Inner.SAVE_DATA, saveData -> saveData::save);
    Event<LoadData> LOAD_DATA = EventWrapper.of(Inner.LOAD_DATA, loadData -> loadData::load);

    interface SaveData {
        void save(ChunkAccess chunk, ServerLevel level, CompoundTag nbt);
    }

    interface LoadData {
        void load(ChunkAccess chunk, @Nullable ServerLevel level, CompoundTag nbt);
    }
}
