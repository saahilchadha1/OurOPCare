package com.example.uhghackathon;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CancelledPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cancelled_page);
        Button additionalBtn = (Button)findViewById(R.id.gear_button);
        additionalBtn.bringToFront();
        additionalBtn.requestLayout();

        additionalBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(CancelledPage.this, PersonalInfo.class);
                startActivity(intent);
            }
        });

        Button apptBtn = (Button)findViewById(R.id.appt_button);
        apptBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(CancelledPage.this, choose_appointment.class);
                startActivity(intent);
            }
        });
    }
}
