package com.labtour.projetolabtour;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class Creditos extends AppCompatActivity {

    private Button btnReferencias;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_creditos);

        Toolbar toolbar = findViewById(R.id.toolbarCreditos);
        ToolbarConf.iniciarToolbar(this, toolbar);

        btnReferencias = findViewById(R.id.btnReferencias);

        btnReferencias.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent telaReferencias = new Intent(Creditos.this, Referencias.class);
                startActivity(telaReferencias);
            }
        });
    }
}