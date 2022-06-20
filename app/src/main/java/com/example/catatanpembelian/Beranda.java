package com.example.catatanpembelian;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.catatanpembelian.Dana.Dana;
import com.example.catatanpembelian.Makanan.Makanan;
import com.example.catatanpembelian.MerchKpop.MerchKpop;
import com.example.catatanpembelian.Pakaian.Pakaian;
import com.example.catatanpembelian.Spay.Shopeepay;

public class Beranda extends AppCompatActivity {

    Button buttonmk;
    Button buttonmak;
    Button buttonpak;
    Button buttondan;
    Button buttonspy;


    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beranda);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        buttonmk = findViewById(R.id.btnmk);
        buttonmk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Beranda.this, MerchKpop.class);
                startActivity(i);
            }
        });


        buttonmak = findViewById(R.id.btnmak);
        buttonmak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent m = new Intent(Beranda.this, Makanan.class);
                startActivity(m);
            }
        });

        buttonpak = findViewById(R.id.btnpak);
        buttonpak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent n = new Intent(Beranda.this, Pakaian.class);
                startActivity(n);
            }
        });

        buttondan = findViewById(R.id.btndn);
        buttondan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent o = new Intent(Beranda.this, Dana.class);
                startActivity(o);
            }
        });

        buttonspy = findViewById(R.id.btnshp);
        buttonspy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent p = new Intent(Beranda.this, Shopeepay.class);
                startActivity(p);
            }
        });

    }


    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}