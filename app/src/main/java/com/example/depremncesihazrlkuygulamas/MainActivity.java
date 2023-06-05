package com.example.depremncesihazrlkuygulamas;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button btnDepremBilgilendirme;
    private Button btnAcilDurumPlan;
    private Button btnDepremOncesiHazirlik;
    private Button btnDepremSirasi;
    private Button btnDepremSonrasi;
    private Button btnComplaintOrMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnDepremBilgilendirme = findViewById(R.id.btnDepremBilgilendirme);
        btnAcilDurumPlan = findViewById(R.id.btnAcilDurumPlan);
        btnDepremOncesiHazirlik = findViewById(R.id.btnDepremOncesiHazirlik);
        btnDepremSirasi = findViewById(R.id.btnDepremSirasi);
        btnDepremSonrasi = findViewById(R.id.btnDepremSonrasi);
        btnComplaintOrMessage = findViewById(R.id.btnComplaintOrMessage);

        btnDepremBilgilendirme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DepremBilgilendirmeActivity.class);
                startActivity(intent);
            }
        });

        btnAcilDurumPlan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AcilDurumPlaniActivity.class);
                startActivity(intent);
            }
        });

        btnDepremOncesiHazirlik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DepremHazirliklariActivity.class);
                startActivity(intent);
            }
        });

        btnDepremSirasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DepremSirasindaActivity.class);
                startActivity(intent);
            }
        });

        btnDepremSonrasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DepremSonrasiActivity.class);
                startActivity(intent);
            }
        });

        btnComplaintOrMessage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ComplaintOrMessageActivity.class);
                startActivity(intent);
            }
        });
    }
}