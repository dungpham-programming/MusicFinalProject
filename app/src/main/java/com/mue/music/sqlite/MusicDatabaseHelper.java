package com.mue.music.sqlite;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import com.mue.music.R;
import com.mue.music.constant.DatabaseProps;

public class MusicDatabaseHelper extends SQLiteOpenHelper {
    public MusicDatabaseHelper(@Nullable Context context) {
        super(context, DatabaseProps.DATABASE_NAME, null, DatabaseProps.DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
//        db.execSQL(DatabaseProps.TABLE_CREATE);
//        fillInitialData(db);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

//    private void fillInitialData(SQLiteDatabase db) {
//        // Kiểm tra và chèn dữ liệu mẫu
//        Cursor cursor = db.rawQuery("SELECT COUNT(*) FROM " + DatabaseProps.TABLE_CATEGORIES, null);
//        if (cursor.moveToFirst() && cursor.getInt(0) == 0) {
//            insertCategory(db, "Track", R.color.green);
//            insertCategory(db, "Podcast", R.color.purple);
//            insertCategory(db, "Saved Track", R.color.pink);
//            insertCategory(db, "Artist", R.color.red);
//            insertCategory(db, "Discover", R.color.blue);
//            insertCategory(db, "Live Events", R.color.violet);
//            insertCategory(db, "Bollywood", R.color.purple_light);
//            insertCategory(db, "Punjabi", R.color.red_dark);
//            insertCategory(db, "Tamil", R.color.blue_dark);
//            insertCategory(db, "Telugu", R.color.purple_light);
//        }
//        cursor.close();
//    }
//
//    private void insertCategory(SQLiteDatabase db, String name, int color) {
//        ContentValues values = new ContentValues();
//        values.put(DatabaseProps.COLUMN_NAME, name);
//        values.put(DatabaseProps.COLUMN_COLOR, color);
//        db.insert(DatabaseProps.TABLE_CATEGORIES, null, values);
//    }
}
