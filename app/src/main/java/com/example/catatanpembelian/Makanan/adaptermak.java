package com.example.catatanpembelian.Makanan;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.catatanpembelian.R;

public class adaptermak extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Button save = findViewById(R.id.btnsavemak);
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(adaptermak.this, tampilmak.class));
            }
        });

    }

}
