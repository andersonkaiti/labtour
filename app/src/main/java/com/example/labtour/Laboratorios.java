package com.example.labtour;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ScrollView;

public class Laboratorios extends AppCompatActivity {

    private CardView cardRede, cardConfiguracoes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_laboratorios);

        Toolbar toolbar = findViewById(R.id.toolbarLaboratorios);

        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(true);

        ScrollView scrollview = findViewById(R.id.scrollviewLab);
        scrollview.setVerticalScrollBarEnabled(true);

        cardConfiguracoes = findViewById(R.id.cardConfiguracoes);
        cardRede = findViewById(R.id.cardRede);
        cardConfiguracoes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent telaConfiguracoes = new Intent(Laboratorios.this, Configuracoes.class);
                startActivity(telaConfiguracoes);
            }
        });

        cardRede.setOnClickListener(new View.OnClickListener() {
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