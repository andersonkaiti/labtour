package com.example.labtour;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ScrollView;

public class Rede extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rede);

        Toolbar toolbar = findViewById(R.id.toolbarRede);
        ToolbarConf.iniciarToolbar(this, toolbar);

        ScrollView scrollView = findViewById(R.id.scrollViewRede);
        scrollView.setVerticalScrollBarEnabled(true);
    }
}