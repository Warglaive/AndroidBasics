package com.vogella.android.testapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

public class CreateUserActivity extends AppCompatActivity {
    boolean male = true;
    boolean female = true;
    RadioGroup radioGroup = (RadioGroup) findViewById(R.id.gender);
    //TODO: FIX
    radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
        @Override
        public void onCheckedChanged(RadioGroup group, int checkedId) {
            switch (checkedId) {
                case R.id.male:
                    male = true;
                    break;
                case R.id.female:
                    male = false;
                    break;
            }
        }
    });








    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //assign layout to an activity
        setContentView(R.layout.activity_create_user);
    }

    public void onClick(View view) {
        EditText text = findViewById(R.id.username);
        String toastMsg = text.getText().toString();
        Toast.makeText(this, "User: " + toastMsg + " created.", Toast.LENGTH_LONG).show();
    }
}