package com.example.assignmentone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.NumberPicker;

public class screen2 extends AppCompatActivity {
    //    create obect for require field
    EditText name,email,password,phone;
    Button next;
    NumberPicker picker;

    boolean isAllFieldsChecked = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen2);
        //        set id to all views
        name = (EditText) findViewById(R.id.ETname);
        email = (EditText) findViewById(R.id.ETemail);
        password = (EditText) findViewById(R.id.Etpwd);
        phone = (EditText) findViewById(R.id.ETphone);
        next = (Button) findViewById(R.id.button);
        picker = (NumberPicker) findViewById(R.id.NPage);

//        set min-max value to Number piker
        picker.setMaxValue(129);
        picker.setMinValue(0);



//        next button onclick Event
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                isAllFieldsChecked = CheckAllFields();

                if (isAllFieldsChecked) {
                    Intent i = new Intent(screen2.this,LoginUi.class);
                    startActivity(i);
                }
            }
        });
//        onCreate End
    }

    private boolean CheckAllFields() {
        if (name.length() == 0) {
            name.setError("This field is required");
            return false;
        }

        if (email.length() == 0) {
            email.setError("This field is required");
            return false;
        }
        if (password.length() == 0) {
            password.setError("Password is required");
            return false;
        } else if (password.length() < 8) {
            password.setError("Password must be minimum 8 characters");
            return false;
        }
        if(password.length() != 0){
            password.setHint("   ");
        }

        if(phone.length() !=10) {
            phone.setError("Phone Number must be 10 digit number.");
            return false;
        }
        return true;
    }

}