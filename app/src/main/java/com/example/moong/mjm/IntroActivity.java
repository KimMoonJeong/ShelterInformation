package com.example.moong.mjm;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by moong on 2017-07-24.
 */

public class IntroActivity extends AppCompatActivity{

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.image1);

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(IntroActivity.this, PresentActivity.class);
                startActivity(intent);

                finish();
            }
        }, 2000);
        }
    }

