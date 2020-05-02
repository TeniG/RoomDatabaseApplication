package com.pim.roomdatabaseapplication.RoomDatabase;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = Task.class, version = 1, exportSchema = true)
public abstract class AppDatabase extends RoomDatabase {

    public abstract TaskDao taskDao();
}