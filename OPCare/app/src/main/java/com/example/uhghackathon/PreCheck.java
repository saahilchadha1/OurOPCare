package com.example.uhghackathon;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PreCheck extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pre_check);

        Button checkBtn = (Button)findViewById(R.id.claim_spot);

        checkBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(PreCheck.this, WaitTime.class);
                startActivity(intent);
            }
        });
        Button cancelBtn = (Button)findViewById(R.id.cancel_appointment2);

        cancelBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(PreCheck.this, CancelledPage.class);
                startActivity(intent);
            }
        });
    }
}
