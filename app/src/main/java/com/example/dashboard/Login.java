package com.example.dashboard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Login extends AppCompatActivity {

    TextView menu1;
    TextView menu2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        menu1 = findViewById(R.id.pindah);

        menu1.setOnClickListener(view ->{
            Intent i = new Intent(Login.this, Register.class);
            startActivity(i);
        });

        menu2 = findViewById(R.id.masuk);

        menu2.setOnClickListener(view ->{
            Intent u = new Intent(Login.this, MainActivity.class);
            startActivity(u);
        });
    }
}