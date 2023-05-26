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
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;

public class Laboratorios extends AppCompatActivity {

    int[] imageIds = {
            R.id.cardSala1,
            R.id.cardSala2,
            R.id.cardSala3,
            R.id.cardSala4,
    };

    int[] cardIds = {
            R.id.cardConfiguracoes,
            R.id.cardRede,
            R.id.cardTermos
    };

    LinearLayout[] image = new LinearLayout[imageIds.length];
    CardView[] cards = new CardView[cardIds.length];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_laboratorios);

        Toolbar toolbar = findViewById(R.id.toolbarLaboratorios);
        ToolbarConf.iniciarToolbar(this, toolbar);

        for(int i = 0; i < imageIds.length; i++) {
            image[i] = findViewById(imageIds[i]);
            image[i].setOnClickListener(new Laboratorios.LaboratoriosClickListener());
        };

        for(int i = 0; i < cardIds.length; i++) {
            cards[i] = findViewById(cardIds[i]);
            cards[i].setOnClickListener(new Laboratorios.LaboratoriosClickListener());
        };
    }

    public class LaboratoriosClickListener implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            Intent intent;
            switch (v.getId()) {
                case R.id.cardSala1:
                    intent = new Intent(v.getContext(), F108.class);
                    break;
                case R.id.cardSala2:
                    intent = new Intent(v.getContext(), F109.class);
                    break;
                case R.id.cardSala3:
                    intent = new Intent(v.getContext(), F111.class);
                    break;
                case R.id.cardSala4:
                    intent = new Intent(v.getContext(), F113.class);
                    break;
                case R.id.cardConfiguracoes:
                    intent = new Intent(v.getContext(), Configuracoes.class);
                    break;
                case R.id.cardRede:
                    intent = new Intent(v.getContext(), Rede.class);
                    break;
                case R.id.cardTermos:
                    intent = new Intent(v.getContext(), Termos.class);
                    break;
                default:
                    intent = new Intent(v.getContext(), Laboratorios.class);
            }
            v.getContext().startActivity(intent);
        }
    }
}