package com.example.dashboard;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Register extends AppCompatActivity {

    ImageView back;
    TextView signup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        back = findViewById(R.id.kembali);
        back.setOnClickListener(view ->{
            Intent i = new Intent(Register.this, Login.class);
            startActivity(i);
        });

        signup = findViewById(R.id.daftar);
        signup.setOnClickListener(view ->{
            Intent u = new Intent(Register.this, Login.class);
            startActivity(u);
        });

    }
}