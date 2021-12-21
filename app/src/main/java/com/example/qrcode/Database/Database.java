package com.example.qrcode.Database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class Database extends SQLiteOpenHelper {
    public Database(@Nullable Context context) {
        super(context, "QR.db", null, 1);
    }
    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String TABLE_PERSON = "CREATE TABLE PERSON( ID TEXT PRIMARY KEY, FullName TEXT NOT NULL, Age INTEGER NOT NULL)";
        sqLiteDatabase.execSQL(TABLE_PERSON);
        sqLiteDatabase.execSQL("INSERT INTO PERSON VALUES(\"NV01\",\"Nguyen Hoai Nam\",21)");
        sqLiteDatabase.execSQL("INSERT INTO PERSON VALUES(\"NV02\",\"Nguyen Hoai 1\",22)");
        sqLiteDatabase.execSQL("INSERT INTO PERSON VALUES(\"NV03\",\"Nguyen Hoai 1\",23)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
