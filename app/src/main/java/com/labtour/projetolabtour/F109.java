package com.labtour.projetolabtour;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;

public class F109 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_f109);

        Toolbar toolbar = findViewById(R.id.toolbarF109);
        ToolbarConf.iniciarToolbar(this, toolbar);
    }
}