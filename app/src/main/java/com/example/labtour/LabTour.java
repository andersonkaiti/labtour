package com.example.labtour;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LabTour extends AppCompatActivity {

    private Button btnSobreUNISAGRADO, btnLaboratorios, btnCreditos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_labtour);

        btnSobreUNISAGRADO = findViewById(R.id.btnSobreUNISAGRADO);
        btnLaboratorios = findViewById(R.id.btnLaboratorios);
        btnCreditos = findViewById(R.id.btnCreditos);

        btnSobreUNISAGRADO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent telaSobreUNISAGRADO = new Intent(LabTour.this, SobreUNISAGRADO.class);
                startActivity(telaSobreUNISAGRADO);
            }
        });

        btnLaboratorios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent telaLaboratorios = new Intent(LabTour.this, Laboratorios.class);
                startActivity(telaLaboratorios);
            }
        });

        btnCreditos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent telaCreditos = new Intent(LabTour.this, Creditos.class);
                startActivity(telaCreditos);
            }
        });
    }
}