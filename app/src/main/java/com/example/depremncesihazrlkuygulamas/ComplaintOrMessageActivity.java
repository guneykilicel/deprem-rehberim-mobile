package com.example.depremncesihazrlkuygulamas;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ComplaintOrMessageActivity extends AppCompatActivity {

    private EditText etFullName;
    private EditText etEmail;
    private EditText etMessage;
    private Button btnSubmit;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_complaint_or_message);

        etFullName = findViewById(R.id.etFullName);
        etEmail = findViewById(R.id.etEmail);
        etMessage = findViewById(R.id.etMessage);
        btnSubmit = findViewById(R.id.btnSubmit);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Verileri al
                String fullName = etFullName.getText().toString().trim();
                String email = etEmail.getText().toString().trim();
                String message = etMessage.getText().toString().trim();

                // Verileri kontrol et ve işle
                if (validateData(fullName, email, message)) {
                    // Şikayet veya ileti gönderme işlemlerini burada gerçekleştirin
                    // Örnek olarak, basit bir Toast mesajı gösteriyoruz
                    Toast.makeText(ComplaintOrMessageActivity.this, "Şikayet veya ileti gönderildi.", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private boolean validateData(String fullName, String email, String message) {
        // Veri doğrulama işlemlerini burada gerçekleştirin
        // Örneğin, gerekli alanların dolu olduğunu kontrol edebilirsiniz
        if (fullName.isEmpty() || email.isEmpty() || message.isEmpty()) {
            Toast.makeText(this, "Lütfen tüm alanları doldurun.", Toast.LENGTH_SHORT).show();
            return false;
        }
        return true;
    }
}