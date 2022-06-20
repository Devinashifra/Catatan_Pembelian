package com.example.catatanpembelian.Spay;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.provider.BaseColumns;

import androidx.annotation.Nullable;


public class DBSpay extends SQLiteOpenHelper {

    static abstract class ColumnSpay implements BaseColumns {
        static final String NamaTabel = "Shopeepay";
        static final String Tanggal = "Tanggal";
        static final String Kategori = "Kategori";
        static final String Nominal = "Nominal";
    }

    private static final String NamaDatabase = "Spay.db";
    private static final int VersiDatabase = 1;

    private static final String SQL_CREATE_ENTRIES = "Create table "+ DBSpay.ColumnSpay.NamaTabel+"("+ DBSpay.ColumnSpay.Tanggal+" date,"+ DBSpay.ColumnSpay.Kategori+" text,"+ DBSpay.ColumnSpay.Nominal+" money)";
    private static final String SQL_DELETE_ENTRIES = "Drop table if Exists "+ DBSpay.ColumnSpay.NamaTabel;
    public DBSpay(@Nullable Context context) {
        super(context, NamaDatabase, null, VersiDatabase);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(SQL_CREATE_ENTRIES);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL(SQL_DELETE_ENTRIES);
        onCreate(db);
    }


}
