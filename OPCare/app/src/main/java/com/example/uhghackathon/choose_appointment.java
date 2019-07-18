package com.example.hackathon;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class choose_appointment extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_appointment);

        Button urgentBtn = (Button)findViewById(R.id.urgentCareBtn);

        urgentBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(choose_appointment.this, appointment_reasons.class);
                startActivity(intent);
            }
        });

        Button checkupBtn = (Button)findViewById(R.id.checkupBtn);

        checkupBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent2 = new Intent(choose_appointment.this, appointment_reasons.class);
                startActivity(intent2);
            }
        });
    }
}
