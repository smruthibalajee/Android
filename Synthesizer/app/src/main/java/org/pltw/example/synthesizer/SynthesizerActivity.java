package org.pltw.example.synthesizer;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class SynthesizerActivity extends AppCompatActivity {
    private final int WHOLE_NOTE = 1000;
    private static final String TAG = SynthesizerActivity.class.getName();
    private Button button1;
    private Button button2;
    private Button challenge1;

    private MediaPlayer mpA;
    private MediaPlayer mpB;
    private MediaPlayer mpC;
    private MediaPlayer mpCs;
    private MediaPlayer mpD;
    private MediaPlayer mpE;
    private MediaPlayer mpF;
    private MediaPlayer mpFs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_synthesizer);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        challenge1 = (Button) findViewById(R.id.challenge1);
        mpA = MediaPlayer.create(this, R.raw.scalea);
        mpB = MediaPlayer.create(this, R.raw.scaleb);
        mpC = MediaPlayer.create(this, R.raw.scalec);
        mpCs = MediaPlayer.create(this, R.raw.scalecs);
        mpD = MediaPlayer.create(this, R.raw.scaled);
        mpE = MediaPlayer.create(this, R.raw.scalee);
        mpF = MediaPlayer.create(this, R.raw.scalef);
        mpFs = MediaPlayer.create(this, R.raw.scalefs);
    }

    private void delayPlaying(int delay) throws InterruptedException {
        try {
            Thread.sleep(delay);
        } catch (InterruptedException e) {
            Log.e("SynthesizerActivity","Audio playback interrupted");
        }
    }

    public void onButton1Click(View v) {
        mpE.seekTo(0);
        Log.i(TAG, "Button 1 Clicked");
        mpE.start();
    }

    public void onButton2Click(View v) {
        mpF.seekTo(0);
        Log.i(TAG, "Button 2 Clicked");
        mpF.start();
    }

    public void onButtonCHL1Click(View v) {
        try {
            mpE.start();
            delayPlaying(WHOLE_NOTE);
            mpF.start();
            delayPlaying(WHOLE_NOTE);
            mpA.start();
            delayPlaying(WHOLE_NOTE);
            mpB.start();
            delayPlaying(WHOLE_NOTE);
            mpCs.start();
            delayPlaying(WHOLE_NOTE);
            mpD.start();
            delayPlaying(WHOLE_NOTE);
            mpE.start();
            delayPlaying(WHOLE_NOTE);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    }



