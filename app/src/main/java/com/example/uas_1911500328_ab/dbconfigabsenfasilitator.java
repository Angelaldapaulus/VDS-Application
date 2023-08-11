package com.example.uas_1911500328_ab;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class dbconfigabsenfasilitator extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "absenfasilitator.db";
    private static final int DATABASE_VERSION = 2;
    public dbconfigabsenfasilitator (Context context) {super(context, DATABASE_NAME, null, DATABASE_VERSION);}

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = "create table biodata(no integer primary key, nama text null, tgl text null, nmkls text null, jnsmtr text null, mtr text null)";
        Log.d("Data", "OnCreate"+sql);
        db.execSQL(sql);
        sql = "INSERT INTO biodata (no, nama, tgl, nmkls, jnsmtr, mtr) values ('1', 'Cagga', '08-07-2001', 'Angel', 'Teori Dhamma', 'Kathina')";
        db.execSQL(sql);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
