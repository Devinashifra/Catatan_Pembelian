package com.example.catatanpembelian.MerchKpop;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.catatanpembelian.R;

public class adaptermk extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Button save = findViewById(R.id.btnsavemk);
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(adaptermk.this, tampilmk.class));
            }
        });

    }

}
