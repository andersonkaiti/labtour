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
import android.widget.ScrollView;

public class Referencias extends AppCompatActivity {

    private CardView cardTelaUm, cardTelaTres, cardCPU, cardMemoriaRAM, cardHD, cardGPU, cardMonitor, cardBalancoSocial, cardSobreUNISAGRADO;

    int[] Ids = {
            R.id.cardTelaUm,
            R.id.cardTelaTres,
            R.id.cardCPU,
            R.id.cardMemoriaRAM,
            R.id.cardHD,
            R.id.cardGPU,
            R.id.cardMonitor,
            R.id.cardBalancoSocial,
            R.id.cardSobreUNISAGRADO
    };

    CardView[] cards = new CardView[Ids.length - 1];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_referencias);

        Toolbar toolbar = findViewById(R.id.toolbarReferencias);
        ToolbarConf.iniciarToolbar(this, toolbar);

        ScrollView scrollView = findViewById(R.id.scrollViewReferencias);
        scrollView.setVerticalScrollBarEnabled(true);

        String[] urls = {
                "https://storyset.com/illustration/telework/pana",
                "https://storyset.com/illustration/shared-workspace/pana",
                "https://br.freepik.com/vetores-gratis/conceito-moderno-de-hospedagem-com-design-plano_3378458.htm#page=3&query=processador%20cartoon&position=34&from_view=search&track=ais",
                "https://www.flaticon.com/free-icons/hard-disk",
                "https://www.flaticon.com/free-icons/graphic-card",
                "https://www.flaticon.com/free-icons/screen",
                "https://unisagrado.edu.br/site/conteudo/12630-unisagrado-apresenta-balanco-social-2021.html",
                "https://unisagrado.edu.br/institucional/quem-somos"
        };

        for(int i = 0; i < Ids.length - 1; i++) {
            cards[i] = findViewById(Ids[i]);
            String url = urls[i];
            cards[i].setOnClickListener(new ReferenciasClickListener(url));
        }
    }

    public class ReferenciasClickListener implements View.OnClickListener {
        private String url;

        public ReferenciasClickListener(String url) {
            this.url = url;
        }

        @Override
        public void onClick(View v) {
            Intent link = new Intent(Intent.ACTION_VIEW);
            link.setData(Uri.parse(url));
            v.getContext().startActivity(link);
        }
    }
}