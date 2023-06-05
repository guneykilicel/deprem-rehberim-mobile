package com.example.depremncesihazrlkuygulamas;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DepremHazirliklariActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deprem_hazirliklari);

        TextView baslikTextView = findViewById(R.id.baslikTextView);
        TextView hazirliklarTextView = findViewById(R.id.hazirliklarTextView);

        String baslik = "";
        String hazirliklar = "";

        baslikTextView.setText(baslik);
        hazirliklarTextView.setText(hazirliklar);
    }
}

