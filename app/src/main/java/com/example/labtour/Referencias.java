package com.example.labtour;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class Referencias extends AppCompatActivity {

    private Button btnImagem1, btnImagem3, btnImagemCPU, btnImagemRAM, btnImagemHD, btnImagemGPU, btnBalancoSocial, btnSobreUNISAGRADO;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_referencias);

        Toolbar toolbar = findViewById(R.id.toolbarReferencias);

        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(true);

        btnImagem1 = findViewById(R.id.btnImagem1);
        btnImagem3 = findViewById(R.id.btnImagem3);
        btnImagemCPU = findViewById(R.id.btnImagemCPU);
        btnImagemRAM = findViewById(R.id.btnImagemRAM);
        btnImagemHD = findViewById(R.id.btnImagemHD);
        btnImagemGPU = findViewById(R.id.btnImagemGPU);
        btnBalancoSocial = findViewById(R.id.btnBalancoSocial);
        btnSobreUNISAGRADO = findViewById(R.id.btnSobreUNISAGRADO);

        btnImagem1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://storyset.com/illustration/telework/pana";
                Intent linkImagem1 = new Intent(Intent.ACTION_VIEW);
                linkImagem1.setData(Uri.parse(url));
                startActivity(linkImagem1);
            }
        });

        btnImagem3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://storyset.com/illustration/shared-workspace/pana";
                Intent linkImagem3 = new Intent(Intent.ACTION_VIEW);
                linkImagem3.setData(Uri.parse(url));
                startActivity(linkImagem3);
            }
        });

        btnImagemCPU.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://br.freepik.com/vetores-gratis/conceito-moderno-de-hospedagem-com-design-plano_3378458.htm#page=3&query=processador%20cartoon&position=34&from_view=search&track=ais";
                Intent linkImagemCPU = new Intent(Intent.ACTION_VIEW);
                linkImagemCPU.setData(Uri.parse(url));
                startActivity(linkImagemCPU);
            }
        });

        btnImagemRAM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://br.freepik.com/vetores-gratis/modern-cpu-colecao-com-design-plano_3317258.htm#query=hard%20drive&position=13&from_view=search&track=ais";
                Intent linkImagemRAM = new Intent(Intent.ACTION_VIEW);
                linkImagemRAM.setData(Uri.parse(url));
                startActivity(linkImagemRAM);
            }
        });

        btnImagemHD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.flaticon.com/free-icon/hard-disk_861621?term=hard+drive&page=4&position=9&origin=search&related_id=861621";
                Intent linkImagemHD = new Intent(Intent.ACTION_VIEW);
                linkImagemHD.setData(Uri.parse(url));
                startActivity(linkImagemHD);
            }
        });

        btnImagemGPU.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.flaticon.com/free-icon/gpu_8900415?term=graphic+card&page=1&position=5&origin=tag&related_id=8900415";
                Intent linkImagemGPU = new Intent(Intent.ACTION_VIEW);
                linkImagemGPU.setData(Uri.parse(url));
                startActivity(linkImagemGPU);
            }
        });

        btnBalancoSocial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://unisagrado.edu.br/site/conteudo/12630-unisagrado-apresenta-balanco-social-2021.html";
                Intent linkBalancoSocial = new Intent(Intent.ACTION_VIEW);
                linkBalancoSocial.setData(Uri.parse(url));
                startActivity(linkBalancoSocial);
            }
        });

        btnSobreUNISAGRADO.setOnClickListener(new View.OnClickListener() {
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