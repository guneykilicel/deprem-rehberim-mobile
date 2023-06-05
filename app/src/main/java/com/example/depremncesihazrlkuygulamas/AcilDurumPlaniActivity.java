package com.example.depremncesihazrlkuygulamas;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class AcilDurumPlaniActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acil_durum_plani);

        TextView baslikTextView = findViewById(R.id.baslikTextView);
        TextView acilDurumTextView = findViewById(R.id.acilDurumTextView);

        String baslik = "Acil Durum Planı";
        String acilDurum = "1. Deprem sırasında sakin olun ve panik yapmayın.\n\n" +
                "2. Hızla güvenli bir yer bulun, masa altına veya yapısal güçlendirme yapılmış bir alana geçin.\n\n" +
                "3. Pencerelerden ve camlardan uzak durun, cam parçalarının kesmesini önleyin.\n\n" +
                "4. Asansör kullanmayın, merdivenleri tercih edin.\n\n" +
                "5. Başınızı, boyununuzu ve vitrin, cam gibi kırılgan nesnelerden koruyun.\n\n" +
                "6. Sarsıntı durduktan sonra, güvenli bir alana geçin ve dışarı çıkmayın.\n\n" +
                "7. Elektrik, gaz ve su gibi kaynakları kontrol edin ve kapatın.\n\n" +
                "8. Yetkililerin talimatlarını takip edin ve güvenli bölgeleri tercih edin.\n\n" +
                "9. Deprem sonrasında aileniz ve sevdiklerinizle iletişim kurun, durumlarını kontrol edin.\n\n" +
                "10. Hasarlı binalara girmeyin, güvenli olmayan alanlardan uzak durun.\n\n" +
                "11. Gerekli ise ilk yardım becerilerinizi kullanarak yaralılara yardım edin.\n\n" +
                "12. Yetkililere yardıma ihtiyacınız olduğunu bildirin ve talimatlarını bekleyin.";;

        baslikTextView.setText(baslik);
        acilDurumTextView.setText(acilDurum);
    }
}
