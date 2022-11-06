package com.example.mr_shopper_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;
import android.widget.TextView;

import com.airbnb.lottie.LottieAnimationView;

public class SplashActivity extends AppCompatActivity {

    ImageView ivTop,ivBottom;
    TextView txtappname;
    LottieAnimationView lottie;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        ivTop=findViewById(R.id.iv_top);
        ivBottom=findViewById(R.id.iv_bottom);
        txtappname=findViewById(R.id.txtappname);
        lottie=findViewById(R.id.lottie);


        lottie.animate().translationX(2000).setDuration(2000).setStartDelay(2900);

        new Handler().postDelayed(() -> {
            Intent i= new Intent(getApplicationContext(),activity_main.class);
            startActivity(i);
            finish();
        },5000);




    }
}