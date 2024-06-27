package com.ltmobile.music.sqlite;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

public class CategoryDao {
    private SQLiteDatabase database;
    private MusicDatabaseHelper dbHelper;

    public CategoryDao(Context context) {
        dbHelper = new MusicDatabaseHelper(context);
        database = dbHelper.getWritableDatabase();
    }
}
