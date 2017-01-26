package com.example.wang55459.synthesizer;

import android.media.MediaPlayer;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class SynthesizerActivity extends AppCompatActivity {
    private static final String TAG =
            SynthesizerActivity.class.getName();
    private Button button1;
    private Button button2;
    private MediaPlayer mpE;
    private MediaPlayer mpF;

    public void onButtonClick1(View v) {
        Log.e(TAG, "Button 1 Clicked");
        mpE.start();
    }

    public void onButtonClick2(View v) {
        Log.e(TAG, "Button 2 Clicked");
        mpF.start();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_synthesizer);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        mpE = MediaPlayer.create(this, R.raw.scalee);
        mpF = MediaPlayer.create(this, R.raw.scalef);
    }


}




