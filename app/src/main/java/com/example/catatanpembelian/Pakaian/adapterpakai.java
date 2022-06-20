package com.example.catatanpembelian.Pakaian;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.catatanpembelian.R;

public class adapterpakai extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Button save = findViewById(R.id.btnsavepak);
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(adapterpakai.this, tampilpak.class));
            }
        });

    }

}
