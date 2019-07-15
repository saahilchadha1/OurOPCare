package com.example.uhghackathon;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class extra_appt_info extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_extra_appt_info);

        Button walkBtn = (Button)findViewById(R.id.walkInBtn);
        Button checkBtn = (Button)findViewById(R.id.preCheckBtn);
        final Button medBtn = (Button)findViewById(R.id.mediumBtn);
        final Button mildBtn = (Button) findViewById(R.id.mildBtn);
        final Button sevBtn = (Button) findViewById(R.id.spicyBtn);

        walkBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(extra_appt_info.this, WaitTime.class);
                startActivity(intent);
            }
        });

        checkBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent2 = new Intent(extra_appt_info.this,PreCheck.class);
                startActivity(intent2);
            }
        });



        medBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                medBtn.setBackgroundColor(Color.parseColor("#ffdb8f"));
            }
        });

        mildBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mildBtn.setBackgroundColor(Color.parseColor("#ffdb8f"));
            }
        });

        sevBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sevBtn.setBackgroundColor(Color.parseColor("#ffdb8f"));
            }
        });
    }
}
