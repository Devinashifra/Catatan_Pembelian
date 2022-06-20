package com.example.catatanpembelian.Makanan;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.provider.BaseColumns;

import androidx.annotation.Nullable;

public class DBMak extends SQLiteOpenHelper {

    static abstract class ColMak implements BaseColumns{
        static final String NamaTabel = "Makanan";
        static final String Nama = "Nama Barang";
        static final String Jumlah = "Jumlah";
        static final String Harga = "Harga";
        static final String Total = "Total";
    }

    private static final String NamaDatabase = "Makanan.db";
    private static final int VersiDatabase = 1;

    private static final String SQL_CREATE_ENTRIES = "Create table "+ DBMak.ColMak.NamaTabel+"("+ ColMak.Nama+" ,"+ ColMak.Jumlah+" int,"+ ColMak.Harga+" money,"+ ColMak.Total+" money)";
    private static final String SQL_DELETE_ENTRIES = "Drop table if Exists "+ DBMak.ColMak.NamaTabel;
    public DBMak(Context context) {
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
