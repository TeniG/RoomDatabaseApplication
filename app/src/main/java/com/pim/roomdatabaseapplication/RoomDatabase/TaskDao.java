package com.pim.roomdatabaseapplication.RoomDatabase;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface TaskDao {

    @Query("Select * from task")
    List<Task> getAllTask();

    @Insert
    void insert(Task task);

}
