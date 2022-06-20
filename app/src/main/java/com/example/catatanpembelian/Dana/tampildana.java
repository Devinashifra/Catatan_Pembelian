package com.example.catatanpembelian.Dana;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.catatanpembelian.R;

import java.util.ArrayList;

public class tampildana extends AppCompatActivity {

    private ArrayList tanggaldana;
    private ArrayList kategoridana;
    private ArrayList nominaldana;

    tampildana(ArrayList tanggaldana, ArrayList kategoridana, ArrayList nominaldana){
        this.tanggaldana = tanggaldana;
        this.kategoridana = kategoridana;
        this.nominaldana = nominaldana;
    }

    class ViewHolder extends RecyclerView.ViewHolder{
        private TextView tgldana, ktgdana, nmndana;

        public ViewHolder(View itemView) {
            super(itemView);
            tgldana = itemView.findViewById(R.id.txttgd);
            ktgdana = itemView.findViewById(R.id.txtkatdan);
            nmndana = itemView.findViewById(R.id.txtnomd);
        }
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tampildana);
        DbDana dbDana = new DbDana(getBaseContext());
        Toast.makeText(getApplication(),dbDana.getDatabaseName(), Toast.LENGTH_SHORT).show();



        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
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