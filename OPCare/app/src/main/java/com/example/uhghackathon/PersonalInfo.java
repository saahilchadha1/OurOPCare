package com.example.hackathon;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import org.w3c.dom.Text;

public class PersonalInfo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        SharedPreferences sharedPreferences = getSharedPreferences("MyPrefs", Context.MODE_PRIVATE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal_info);
        TextView name = (TextView) findViewById(R.id.u_last_name);
        name.setText(sharedPreferences.getString("namekey", "default"));
        Button regBtn = (Button)findViewById(R.id.signOut);

        regBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PersonalInfo.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }

    public void feedback(View view)
    {
        Intent intent = new Intent(PersonalInfo.this, Feedback.class);
        startActivity(intent);
    }

    public void editInfo(View view)
    {
        Intent intent = new Intent(PersonalInfo.this, EditInfo.class);
        startActivity(intent);
    }
}
