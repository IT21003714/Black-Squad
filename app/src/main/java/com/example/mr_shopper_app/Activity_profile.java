package com.example.mr_shopper_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class Activity_profile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        ImageView image_arrow=(ImageView) findViewById(R.id.image_arrow);

        image_arrow.setOnClickListener(view -> startActivity(new Intent(Activity_profile.this, Activity_setting.class)));


    }
}