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
            R.id.cardEthernet,
            R.id.cardWindows,
            R.id.cardLinux,
            R.id.cardCPU,
            R.id.cardMemoriaRAM,
            R.id.cardSSD,
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
                "https://storyset.com/work", //https://storyset.com/illustration/telework/pana
                "https://storyset.com/people", //https://storyset.com/illustration/shared-workspace/pana
                "https://www.flaticon.com/br/icones-gratis/ethernet", //https://www.flaticon.com/br/icone-gratis/ethernet_977993?term=ethernet&page=1&position=1&origin=search&related_id=977993
                "https://www.flaticon.com/br/icones-gratis/janelas", //https://www.flaticon.com/br/icone-gratis/logotipo-do-windows_38466?term=windows&page=1&position=38&origin=search&related_id=38466
                "https://www.flaticon.com/br/icones-gratis/linux", //https://www.flaticon.com/br/icone-gratis/linux_2333149?term=linux&page=1&position=12&origin=search&related_id=2333149
                "https://br.freepik.com/vetores-gratis/conceito-moderno-de-hospedagem-com-design-plano_3378458.htm#page=3&query=processador%20cartoon&position=34&from_view=search&track=ais",
                "https://www.flaticon.com/free-icons/ssd", //https://www.flaticon.com/free-icon/storage_10656985
                "https://www.flaticon.com/free-icons/graphic-card",
                "https://www.flaticon.com/free-icons/screen",
                "https://unisagrado.edu.br/site/conteudo/12630-unisagrado-apresenta-balanco-social-2021.html",
                "https://unisagrado.edu.br/graduacao/ciencia-da-computacao"
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