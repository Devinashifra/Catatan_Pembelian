package com.example.catatanpembelian.Dana;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.provider.BaseColumns;
import android.widget.BaseAdapter;

import androidx.annotation.Nullable;

public class DbDana extends SQLiteOpenHelper {

    static abstract class MyColumns implements BaseColumns{
        static final String NamaTabel = "Dana";
        static final String Tanggal = "Tanggal";
        static final String Kategori = "Kategori";
        static final String Nominal = "Nominal";
    }

    private static final String NamaDatabase = "Dana.db";
    private static final int VersiDatabase = 1;

    private static final String SQL_CREATE_ENTRIES = "Create table "+MyColumns.NamaTabel+"("+MyColumns.Tanggal+" date,"+MyColumns.Kategori+" text,"+MyColumns.Nominal+" money)";
    private static final String SQL_DELETE_ENTRIES = "Drop table if Exists "+MyColumns.NamaTabel;
    public DbDana(@Nullable Context context) {
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
