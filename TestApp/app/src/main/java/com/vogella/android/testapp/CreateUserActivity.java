package com.vogella.android.testapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.Toast;

public class CreateUserActivity extends AppCompatActivity {
    boolean male = true;
    //boolean female = true;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //assign layout to an activity
        setContentView(R.layout.activity_create_user);

    }

    public void onClick(View view) {
        RadioGroup radioGroup = findViewById(R.id.gender);

        EditText text = findViewById(R.id.username);
        String toastMsg = text.getText().toString();
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton btnF = findViewById(R.id.female);
                RadioButton btnM = findViewById(R.id.male);
                if (checkedId == R.id.male) {
                    male = true;
                    btnF.setAlpha(0);
                } else if (checkedId == R.id.female) {
                    male = false;
                    btnM.setAlpha(0);
                }
            }
        });
        Toast.makeText(this, "User: " + toastMsg + " created.", Toast.LENGTH_LONG).show();

    }
}