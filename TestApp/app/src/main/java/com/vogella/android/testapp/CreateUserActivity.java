package com.vogella.android.testapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class CreateUserActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //assign layout to an activity
        setContentView(R.layout.activity_create_user);
    }

    public void onClick(View view) {
        EditText text = findViewById(R.id.username);
        String toastMsg = text.getText().toString();
        Toast.makeText(this, "User: " + toastMsg + "created.", Toast.LENGTH_LONG).show();
    }
}