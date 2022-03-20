package com.example.assignmentone;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.widget.Button;
import android.widget.EditText;
import android.widget.NumberPicker;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class RelativelayoutActivity extends AppCompatActivity {
    //    create object for require field
    private EditText etName, etEmail, etPassword, etPhone;
    NumberPicker npPicker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relativelayout);
        //        set id to all views
        etName = findViewById(R.id.etName);
        etEmail = findViewById(R.id.etEmail);
        etPassword = findViewById(R.id.etPwd);
        etPhone = findViewById(R.id.etPhone);

        Button btnNext = findViewById(R.id.btnNext);
        npPicker = findViewById(R.id.npAge);

        npPicker.setMaxValue(129);
        npPicker.setMinValue(0);
//        next button onclick Event
        btnNext.setOnClickListener(view -> {
            if (checkAllFields()) {
                Intent i = new Intent(RelativelayoutActivity.this, LoginUiActivity.class);
                startActivity(i);
            }
        });

//        onCreate End
    }

    private boolean checkAllFields() {
        if (etName.length() == 0) {
            Toast.makeText(this, R.string.name, Toast.LENGTH_SHORT).show();
            return false;
        }else if (etEmail.length() == 0) {
            Toast.makeText(this, R.string.email, Toast.LENGTH_SHORT).show();
            return false;
        }else if (Patterns.EMAIL_ADDRESS.matcher(etEmail.getText().toString()).matches()){
            Toast.makeText(this, R.string.invalid, Toast.LENGTH_SHORT).show();
            return false;
        }
        else if (etPassword.length() == 0) {
            Toast.makeText(this, R.string.pwd, Toast.LENGTH_SHORT).show();
            return false;
        } else if (etPassword.length() < 8) {
            Toast.makeText(this, R.string.pwd_invalid, Toast.LENGTH_SHORT).show();
            return false;
        }else if (etPhone.length() != 10) {
            Toast.makeText(this, R.string.phone, Toast.LENGTH_SHORT).show();
            return false;
        }
        return true;
    }



}