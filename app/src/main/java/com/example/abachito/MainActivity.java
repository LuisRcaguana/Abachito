package com.example.abachito;

import android.content.Intent;
import android.media.Image;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;


public class MainActivity extends AppCompatActivity {
    private ImageView logo;
    private TextView tvAbachitos;
    private TextView tvCom;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);


        tvAbachitos = findViewById(R.id.tex1);
        Animation animacionText = AnimationUtils.loadAnimation(this, R.anim.animacion_iz_derc);
        tvAbachitos.startAnimation(animacionText);

       tvCom = findViewById(R.id.text2);
       Animation anciontex2 = AnimationUtils.loadAnimation(this, R.anim.fade_in);
       tvCom.startAnimation(anciontex2);
        launchLoginActivity();


    }
    public void launchLoginActivity() {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(MainActivity.this, RegistrarActivity.class));
            }
        }, 11000);
    }
}
