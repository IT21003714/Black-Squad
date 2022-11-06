package com.example.mr_shopper_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Activity_setting extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);
        ImageView image_5=(ImageView) findViewById(R.id.image_5);

        image_5.setOnClickListener(view -> startActivity(new Intent(Activity_setting.this, Activity_profile.class)));

        ImageView image_setarow=(ImageView) findViewById(R.id.image_setarow);

        image_setarow.setOnClickListener(view -> startActivity(new Intent(Activity_setting.this, activity_home.class)));

    }
}