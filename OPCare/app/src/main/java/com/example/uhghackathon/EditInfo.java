package com.example.hackathon;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class EditInfo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_info);
    }

    public void submit(View view)
    {
        SharedPreferences sharedPreferences = getSharedPreferences("MyPrefs", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();

        TextView name = (TextView) findViewById(R.id.i_last_name);

        editor.putString("namekey", name.getText().toString() );
        editor.commit();

        Intent intent = new Intent(EditInfo.this, PersonalInfo.class);
        startActivity(intent);
    }
}
