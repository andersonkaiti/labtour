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

public class Referencias extends AppCompatActivity {

    private CardView cardTelaUm, cardTelaTres, cardCPU, cardMemoriaRAM, cardHD, cardGPU, cardMonitor, cardBalancoSocial, cardSobreUNISAGRADO;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_referencias);

        Toolbar toolbar = findViewById(R.id.toolbarReferencias);

        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(true);

        cardTelaUm = findViewById(R.id.cardTelaUm);
        cardTelaTres = findViewById(R.id.cardTelaTres);
        cardCPU = findViewById(R.id.cardCPU);
        cardMemoriaRAM = findViewById(R.id.cardMemoriaRAM);
        cardHD = findViewById(R.id.cardHD);
        cardGPU = findViewById(R.id.cardGPU);
        cardMonitor = findViewById(R.id.cardMonitor);
        cardBalancoSocial = findViewById(R.id.cardBalancoSocial);
        cardSobreUNISAGRADO = findViewById(R.id.cardSobreUNISAGRADO);

        cardTelaUm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://storyset.com/illustration/telework/pana";
                Intent linkImagem1 = new Intent(Intent.ACTION_VIEW);
                linkImagem1.setData(Uri.parse(url));
                startActivity(linkImagem1);
            }
        });

        cardTelaTres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://storyset.com/illustration/shared-workspace/pana";
                Intent linkImagem3 = new Intent(Intent.ACTION_VIEW);
                linkImagem3.setData(Uri.parse(url));
                startActivity(linkImagem3);
            }
        });

        cardCPU.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://br.freepik.com/vetores-gratis/conceito-moderno-de-hospedagem-com-design-plano_3378458.htm#page=3&query=processador%20cartoon&position=34&from_view=search&track=ais";
                Intent linkImagemCPU = new Intent(Intent.ACTION_VIEW);
                linkImagemCPU.setData(Uri.parse(url));
                startActivity(linkImagemCPU);
            }
        });

        cardMemoriaRAM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://br.freepik.com/vetores-gratis/modern-cpu-colecao-com-design-plano_3317258.htm#query=hard%20drive&position=13&from_view=search&track=ais";
                Intent linkImagemRAM = new Intent(Intent.ACTION_VIEW);
                linkImagemRAM.setData(Uri.parse(url));
                startActivity(linkImagemRAM);
            }
        });

        cardHD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // String url = "https://www.flaticon.com/free-icon/hard-disk_861621?term=hard+drive&page=4&position=9&origin=search&related_id=861621";
                String url = "https://www.flaticon.com/free-icons/hard-disk";
                Intent linkImagemHD = new Intent(Intent.ACTION_VIEW);
                linkImagemHD.setData(Uri.parse(url));
                startActivity(linkImagemHD);
            }
        });

        cardGPU.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // String url = "https://www.flaticon.com/free-icon/gpu_8900415?term=graphic+card&page=1&position=5&origin=tag&related_id=8900415";
                String url = "https://www.flaticon.com/free-icons/graphic-card";
                Intent linkImagemGPU = new Intent(Intent.ACTION_VIEW);
                linkImagemGPU.setData(Uri.parse(url));
                startActivity(linkImagemGPU);
            }
        });

        cardMonitor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // String url = "https://www.flaticon.com/free-icon/tv_896280?term=monitor&related_id=896280";
                String url = "https://www.flaticon.com/free-icons/screen";
                Intent linkImagemMonitor = new Intent(Intent.ACTION_VIEW);
                linkImagemMonitor.setData(Uri.parse(url));
                startActivity(linkImagemMonitor);
            }
        });

        cardBalancoSocial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://unisagrado.edu.br/site/conteudo/12630-unisagrado-apresenta-balanco-social-2021.html";
                Intent linkBalancoSocial = new Intent(Intent.ACTION_VIEW);
                linkBalancoSocial.setData(Uri.parse(url));
                startActivity(linkBalancoSocial);
            }
        });

        cardSobreUNISAGRADO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://unisagrado.edu.br/institucional/quem-somos";
                Intent linkSobreUNISAGRADO = new Intent(Intent.ACTION_VIEW);
                linkSobreUNISAGRADO.setData(Uri.parse(url));
                startActivity(linkSobreUNISAGRADO);
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