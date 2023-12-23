package com.example.Zelentsova_v_4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Personal_area extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.personal_area);
        // Отобразите имя пользователя

        TextView usernameTextView = findViewById(R.id.tv_name);
        SharedPreferences sharedPreferences = getSharedPreferences("app_preferences", MODE_PRIVATE);
        String username = sharedPreferences.getString("username", "");
        usernameTextView.setText(username);

    }

    public void onClick(View view) {
        startActivity(new Intent(this, Statistic.class));


    }
    public void Click(View view) {
        startActivity(new Intent(this, Login.class));}
}