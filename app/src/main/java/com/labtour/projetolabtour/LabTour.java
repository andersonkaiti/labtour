package com.labtour.projetolabtour;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LabTour extends AppCompatActivity {

    private CardView cardUNISAGRADO, cardLabtoratorios, cardCreditos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_labtour);

        cardUNISAGRADO = findViewById(R.id.cardUNISAGRADO);
        cardLabtoratorios = findViewById(R.id.cardLabtoratorios);
        cardCreditos = findViewById(R.id.cardCreditos);

        cardUNISAGRADO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent telaSobreUNISAGRADO = new Intent(LabTour.this, SobreUNISAGRADO.class);
                startActivity(telaSobreUNISAGRADO);
            }
        });

        cardLabtoratorios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent telaLaboratorios = new Intent(LabTour.this, Laboratorios.class);
                startActivity(telaLaboratorios);
            }
        });

        cardCreditos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent telaCreditos = new Intent(LabTour.this, Creditos.class);
                startActivity(telaCreditos);
            }
        });
    }
}