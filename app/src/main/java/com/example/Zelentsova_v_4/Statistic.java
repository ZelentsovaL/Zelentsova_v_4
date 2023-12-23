package com.example.Zelentsova_v_4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Statistic extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.statistic);


    }

    public void OnClick (View view) {
        startActivity(new Intent(this, Personal_area.class));
    }


}