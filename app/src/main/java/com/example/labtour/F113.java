package com.example.labtour;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;

public class F113 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_f113);

        Toolbar toolbar = findViewById(R.id.toolbarF113);
        ToolbarConf.iniciarToolbar(this, toolbar);
    }
}