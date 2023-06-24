package com.labtour.projetolabtour;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.widget.ScrollView;

public class Termos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_termos);

        Toolbar toolbar = findViewById(R.id.toolbarTermos);
        ToolbarConf.iniciarToolbar(this, toolbar);

        ScrollView scrollView = findViewById(R.id.scrollViewTermos);
        scrollView.setVerticalScrollBarEnabled(true);
    }
}