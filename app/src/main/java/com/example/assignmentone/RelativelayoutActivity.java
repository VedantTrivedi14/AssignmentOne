package com.example.assignmentone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.NumberPicker;

public class RelativelayoutActivity extends AppCompatActivity {
    //    create obect for require field
    private EditText etName, etEmail, etPassword, etPhone;

    boolean isAllFieldsChecked = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relativelayout);
        //        set id to all views
        etName = findViewById(R.id.etName);
        etEmail = findViewById(R.id.etEmail);
        etPassword = findViewById(R.id.etPwd);
        etPhone = findViewById(R.id.etPhone);
        Button btnNext = findViewById(R.id.btn);
        NumberPicker npPicker = findViewById(R.id.npAge);

//        set min-max value to Number piker
        npPicker.setMaxValue(129);
        npPicker.setMinValue(0);


//        next button onclick Event
        btnNext.setOnClickListener(view -> {

            isAllFieldsChecked = CheckAllFields();

            if (isAllFieldsChecked) {
                Intent i = new Intent(RelativelayoutActivity.this, LoginUiActivity.class);
                startActivity(i);
            }
        });
//        onCreate End
    }

    private boolean CheckAllFields() {
        if (etName.length() == 0) {
            etName.setError("This field is required");
            return false;
        }

        if (etEmail.length() == 0) {
            etEmail.setError("This field is required");
            return false;
        }
        if (etPassword.length() == 0) {
            etPassword.setError("Password is required");
            return false;
        } else if (etPassword.length() < 8) {
            etPassword.setError("Password must be minimum 8 characters");
            return false;
        }
        if (etPhone.length() != 10) {
            etPhone.setError("Phone Number must be 10 digit number.");
            return false;
        }
        return true;
    }

}