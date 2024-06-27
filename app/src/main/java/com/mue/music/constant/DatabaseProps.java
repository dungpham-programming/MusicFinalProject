package com.mue.music.constant;

public class DatabaseProps {
    public static final String DATABASE_NAME = "music_app.db";
    public static final int DATABASE_VERSION = 1;
    public static final String TABLE_CATEGORIES = "categories";
    public static final String COLUMN_ID = "id";
    public static final String COLUMN_NAME = "name";
    public static final String COLUMN_COLOR = "color";

    public static final String TABLE_CREATE =
            "CREATE TABLE " + TABLE_CATEGORIES + " (" +
                    COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                    COLUMN_NAME + " TEXT, " +
                    COLUMN_COLOR + " INTEGER);";
}
