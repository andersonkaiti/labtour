package com.example.labtour;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class SobreUNISAGRADO extends AppCompatActivity {

    private Button btnSaibaMais;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sobre_unisagrado);

        Toolbar toolbar = findViewById(R.id.toolbarSobreUNISAGRADO);

        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(true);

        btnSaibaMais = findViewById(R.id.btnSaibaMais);

        btnSaibaMais.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://unisagrado.edu.br/institucional/quem-somos";
                Intent telaSaibaMais = new Intent(Intent.ACTION_VIEW);
                telaSaibaMais.setData(Uri.parse(url));
                startActivity(telaSaibaMais);
            }
        });
    }
    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        if (item.getItemId()==android.R.id.home) {
            finish();
        }
        return super.onContextItemSelected(item);
    }
}