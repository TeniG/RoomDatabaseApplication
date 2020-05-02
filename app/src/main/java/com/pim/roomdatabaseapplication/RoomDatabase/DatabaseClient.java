package com.pim.roomdatabaseapplication.RoomDatabase;

import android.content.Context;

import androidx.room.Room;

public class DatabaseClient {

    private Context context;
    private static DatabaseClient mInstance;

    private AppDatabase appDatabase;

    DatabaseClient(Context context){
        this.context=context;
        appDatabase= Room.databaseBuilder(context,AppDatabase.class,"Todo_db").build();
    }

    public static synchronized DatabaseClient getInstance(Context mContext)
    {
        if (mInstance == null) {
            mInstance = new DatabaseClient(mContext);
        }
        return mInstance;
    }

    public AppDatabase getAppDatabase() {
        return appDatabase;
    }
}
