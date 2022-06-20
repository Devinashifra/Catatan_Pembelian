package com.example.catatanpembelian;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import androidx.annotation.Nullable;

import java.util.List;

public class DatabaseHelper extends SQLiteOpenHelper {
    private static final String Pembelian_Name = "catatanpembelian.db";
    private static final int Pembelian_Ver = 5;

    public DatabaseHelper(Context context) {
        super(context, Pembelian_Name, null, Pembelian_Ver);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sqlmakan = "create table Makanan(Nama_Makanan text, Jumlah int, Harga money, Total money)";
        Log.d("Data", "Oncreate: " + sqlmakan);
        db.execSQL(sqlmakan);

        String sqlpakaian = "create table Pakaian(Nama_Barang text, Jumlah int, Harga money, Total money)";
        Log.d("Data", "Oncreate: " + sqlpakaian);
        db.execSQL(sqlpakaian);

        String sqlmerch = "create table MerchKPOP(Nama_Barang text, Kategori text, Jumlah int, Harga money, Total money)";
        Log.d("Data", "Oncreate: " + sqlmerch);
        db.execSQL(sqlmerch);

        String sqldana = "create table Dana(Tanggal date, Kategori text, Nominal money)";
        Log.d("Data", "Oncreate: " + sqldana);
        db.execSQL(sqldana);

        String sqlspay = "create table Shopeepay(Tanggal date, Kategori text, Nominal money)";
        Log.d("Data", "Oncreate: " + sqlspay);
        db.execSQL(sqlspay);

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
