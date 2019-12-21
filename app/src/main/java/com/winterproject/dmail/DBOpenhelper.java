package com.winterproject.dmail;
//author:ABHISHEK KUMAR
//

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBOpenhelper extends SQLiteOpenHelper {
    //db name and versiom
    private static final String DATABASE_NAME ="notes_db.db";
    private static final int DATABASE_VER =1;

    //identifying tables and columns
    private static final String NOTES_TABLES="notes";
    private static final String NOTES_ID="id";
    private static final String NOTES_TEXT="notesText";
    private static final String NOTES_CREATED="notesCreated";

    //SQL to create Table





    public DBOpenhelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}


