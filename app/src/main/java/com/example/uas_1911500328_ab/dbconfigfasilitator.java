package com.example.uas_1911500328_ab;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class dbconfigfasilitator extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "datafasilitator.db";
    private static final int DATABASE_VERSION = 1;
    public dbconfigfasilitator (Context context) {super(context, DATABASE_NAME, null, DATABASE_VERSION);}

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = "create table biodata(no integer primary key, nama text null, tgl text null, jk text null, alamat text null, nowa number null)";
        Log.d("Data", "OnCreate"+sql);
        db.execSQL(sql);
        sql = "INSERT INTO biodata (no, nama, tgl, jk, alamat, nowa) values ('1', 'Angel Alda', '08-07-2001', 'Perempuan', 'Bintaro', '089601005466')";
        db.execSQL(sql);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
