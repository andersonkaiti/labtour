package com.labtour.projetolabtour;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ScrollView;

public class Configuracoes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_configuracoes);

        Toolbar toolbar = findViewById(R.id.toolbarConfiguracoes);
        ToolbarConf.iniciarToolbar(this, toolbar);

        ScrollView scrollView = findViewById(R.id.scrollViewConfiguracoes);
        scrollView.setVerticalScrollBarEnabled(true);
    }
}