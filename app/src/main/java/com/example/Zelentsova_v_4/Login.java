package com.example.Zelentsova_v_4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Login extends AppCompatActivity implements View.OnClickListener {
    EditText et;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        et = findViewById(R.id.ed_name);
    }


    @Override
    public void onClick(View view) {
        startActivity(new Intent(this, Personal_area.class));

        SharedPreferences sharedPreferences = getSharedPreferences("app_preferences", MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        String username = et.getText().toString();
        editor.putString("username", username);
        editor.apply();


    }


}