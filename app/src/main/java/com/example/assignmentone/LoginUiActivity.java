package com.example.assignmentone;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class LoginUiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_ui);

        Button btnLogin = findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(view -> {
            Intent i = new Intent(LoginUiActivity.this, ConstraintLayoutActivity.class);
            startActivity(i);
        });

    }
}