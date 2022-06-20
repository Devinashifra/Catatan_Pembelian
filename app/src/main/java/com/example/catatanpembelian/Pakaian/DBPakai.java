package com.example.catatanpembelian.Pakaian;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.provider.BaseColumns;

import androidx.annotation.Nullable;

public class DBPakai extends SQLiteOpenHelper {

    static abstract class ColumnPakai implements BaseColumns {
        static final String NamaTabel = "Pakaian";
        static final String Nama = "Nama Barang";
        static final String Jumlah = "Jumlah";
        static final String Harga = "Harga";
        static final String Total = "Total";
    }

    private static final String NamaDatabase = "Pakaian.db";
    private static final int VersiDatabase = 1;

    private static final String SQL_CREATE_ENTRIES = "Create table "+ DBPakai.ColumnPakai.NamaTabel+"("+ DBPakai.ColumnPakai.Nama+" ,"+ DBPakai.ColumnPakai.Jumlah+" int,"+ DBPakai.ColumnPakai.Harga+" money,"+ DBPakai.ColumnPakai.Total+" money)";
    private static final String SQL_DELETE_ENTRIES = "Drop table if Exists "+ DBPakai.ColumnPakai.NamaTabel;

    public DBPakai(Context context) {
        super(context, NamaDatabase, null, VersiDatabase);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(SQL_CREATE_ENTRIES);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL(SQL_DELETE_ENTRIES);
        onCreate(sqLiteDatabase);
    }


}
