package com.example.uas_1911500328_ab;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class dbconfignilaimurid extends SQLiteOpenHelper{
    private static final String DATABASE_NAME = "nilaimurid.db";
    private static final int DATABASE_VERSION = 3;
    public dbconfignilaimurid (Context context) {super(context, DATABASE_NAME, null, DATABASE_VERSION);}

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = "create table biodata(no integer primary key, nama text null, tgl text null, nmkls text null, sklh text null, kpln text null)";
        Log.d("Data", "OnCreate"+sql);
        db.execSQL(sql);
        sql = "INSERT INTO biodata (no, nama, tgl, nmkls, sklh, kpln) values ('1', 'Angel Alda', '08-07-2021', 'Viriya', 'SMAN 5 TANGSEL', 'Ujian Tengah Semester')";
        db.execSQL(sql);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}

