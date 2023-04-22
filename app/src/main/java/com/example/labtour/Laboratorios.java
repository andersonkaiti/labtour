package com.example.labtour;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class Laboratorios extends AppCompatActivity {

    private Button btnConfiguracoes, btnRede;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_laboratorios);

        Toolbar toolbar = findViewById(R.id.toolbarLaboratorios);

        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(true);

        btnConfiguracoes = findViewById(R.id.btnConfiguracoes);
        btnRede = findViewById(R.id.btnRede);
        btnConfiguracoes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent telaConfiguracoes = new Intent(Laboratorios.this, Configuracoes.class);
                startActivity(telaConfiguracoes);
            }
        });

        btnRede.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent telaRede = new Intent(Laboratorios.this, Rede.class);
                startActivity(telaRede);
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