package com.example.labtour;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class SobreUNISAGRADO extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sobre_unisagrado);

        Toolbar toolbar = findViewById(R.id.toolbarSobreUNISAGRADO);
        ToolbarConf.iniciarToolbar(this, toolbar);

        CardView cardVestibular = findViewById(R.id.cardVestibular);
        Button btnSaibaMais = findViewById(R.id.btnSaibaMais);

        cardVestibular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://eventos.unisagrado.edu.br/conheca-os-nossos-cursos";
                Intent linkVestibular = new Intent(Intent.ACTION_VIEW);
                linkVestibular.setData(Uri.parse(url));
                startActivity(linkVestibular);
            }
        });

        btnSaibaMais.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://unisagrado.edu.br/graduacao/ciencia-da-computacao";
                Intent linkSaibaMais = new Intent(Intent.ACTION_VIEW);
                linkSaibaMais.setData(Uri.parse(url));
                startActivity(linkSaibaMais);
            }
        });
    }
}