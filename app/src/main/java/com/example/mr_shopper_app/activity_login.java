package com.example.mr_shopper_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class activity_login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Button btn_login=(Button) findViewById(R.id.btn_singup);
        TextView txtforget=(TextView) findViewById(R.id.txtforget);
        TextView  txtbottem=(TextView) findViewById(R.id.txtbottem);


        btn_login.setOnClickListener(view -> startActivity(new Intent(activity_login.this, activity_home.class)));





        txtforget.setOnClickListener(view -> startActivity(new Intent(activity_login.this, activity_forget.class)));
        txtbottem.setOnClickListener(view -> startActivity(new Intent(activity_login.this, Activity_signup.class)));
    }
}