package com.example.assignmentone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class ConstraintlayoutActivity extends AppCompatActivity {

    private ImageView imgL1, imgL2, imgR1, imgR2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_constraintlayout);

        Button btnTop = findViewById(R.id.btnTop);
        Button btnCenter = findViewById(R.id.btnCenter);
        Button btnBottom = findViewById(R.id.btnBottom);
        imgL1 = findViewById(R.id.imgL1);
        imgL2 = findViewById(R.id.imgL2);
        imgR1 = findViewById(R.id.imgR1);
        imgR2 = findViewById(R.id.imgR2);


        btnTop.setOnClickListener(view -> {
            imgL2.setVisibility(View.GONE);
            imgR2.setVisibility(View.GONE);
        });
        btnBottom.setOnClickListener(view -> {
            imgL1.setVisibility(View.GONE);
            imgR1.setVisibility(View.GONE);
        });

        btnCenter.setOnClickListener(view -> {
            imgL2.setVisibility(View.VISIBLE);
            imgR2.setVisibility(View.VISIBLE);
            imgL1.setVisibility(View.VISIBLE);
            imgR1.setVisibility(View.VISIBLE);
        });


    }
}