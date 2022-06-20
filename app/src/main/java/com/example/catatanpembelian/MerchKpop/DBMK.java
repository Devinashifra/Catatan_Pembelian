package com.example.catatanpembelian.MerchKpop;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.provider.BaseColumns;

import androidx.annotation.Nullable;

public class DBMK extends SQLiteOpenHelper {

    static abstract class ColMk implements BaseColumns {
        static final String NamaTabel = "MerchKPOP";
        static final String Nama = "Nama Barang";
        static final String Kategori = "Kategori";
        static final String Jumlah = "Jumlah";
        static final String Harga = "Harga";
        static final String Total = "Total";
    }

    private static final String NamaDatabase = "MerchKPOP.db";
    private static final int VersiDatabase = 1;

    private static final String SQL_CREATE_ENTRIES = "Create table "+ DBMK.ColMk.NamaTabel+"("+ DBMK.ColMk.Nama+" ,"+ ColMk.Kategori+","+ DBMK.ColMk.Jumlah+" int,"+ DBMK.ColMk.Harga+" money,"+ DBMK.ColMk.Total+" money)";
    private static final String SQL_DELETE_ENTRIES = "Drop table if Exists "+ DBMK.ColMk.NamaTabel;
    public DBMK(Context context) {
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
