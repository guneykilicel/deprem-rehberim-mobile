package com.example.depremncesihazrlkuygulamas;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

    public class DepremSirasindaActivity extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_deprem_sirasinda);

            //TextView baslikTextView = findViewById(R.id.baslikTextView);
            TextView acilDurumTextView = findViewById(R.id.yapilacaklarTextView);

            //String baslik = "Deprem Sırasında Yapılması Gerekenler";
            String acilDurum =
                    "1- Deprem anında bir yaşam üçgeni oluşturmak, hayatta kalma şansını artırmak için önemlidir.\n\n" +
                    "2- Yaşam üçgeni, enkaz altında kalan kişilerin hayatta kalma süresini uzatmaya yardımcı olabilir.\n\n" +
                    "3- Bu üçgen, insanların su, hava ve yaşam destek sistemlerine erişimini sağlayarak hayati organların çalışmasını sürdürmesine yardımcı olur.\n\n" +
                    "4- Ayrıca, arama kurtarma ekiplerinin enkaz altında mahsur kalan kişilere ulaşmasını kolaylaştırır ve kurtarma sürecini hızlandırır.\n\n";

            //baslikTextView.setText(baslik);
            acilDurumTextView.setText(acilDurum);
        }
    }
