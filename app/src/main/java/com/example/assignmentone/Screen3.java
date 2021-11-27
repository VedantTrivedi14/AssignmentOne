package com.example.assignmentone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Screen3 extends AppCompatActivity {

    Button top,center,bottom;
    ImageView L1,L2,R1,R2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen3);

        top = (Button) findViewById(R.id.Top);
        center = (Button) findViewById(R.id.Center);
        bottom = (Button) findViewById(R.id.Bottom);
        L1 = (ImageView) findViewById(R.id.l1);
        L2 = (ImageView) findViewById(R.id.l2);
        R1 = (ImageView) findViewById(R.id.r1);
        R2 = (ImageView) findViewById(R.id.r2);


        top.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                L2.setVisibility(view.GONE);
                R2.setVisibility(view.GONE);
            }
        });
        bottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                L1.setVisibility(view.GONE);
                R1.setVisibility(view.GONE);
            }
        });

        center.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                L2.setVisibility(view.VISIBLE);
                R2.setVisibility(view.VISIBLE);
                L1.setVisibility(view.VISIBLE);
                R1.setVisibility(view.VISIBLE);
            }
        });


    }
}