package com.example.hackathon;

import android.app.Person;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;

public class Feedback extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);

        Button regBtn = (Button)findViewById(R.id.submit);

        regBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Feedback.this, PersonalInfo.class);
                startActivity(intent);
            }
        });
    }
    public void back(View view)
    {
        Intent intent = new Intent(Feedback.this, PersonalInfo.class);
        startActivity(intent);
    }
}
