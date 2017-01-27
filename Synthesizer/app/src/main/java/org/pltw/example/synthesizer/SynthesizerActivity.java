package org.pltw.example.synthesizer;

import android.media.MediaPlayer;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.NumberPicker;

public class SynthesizerActivity extends AppCompatActivity {
    private final int WHOLE_NOTE = 1000;
    private final int HALF_NOTE = 500;
    private static final String TAG = SynthesizerActivity.class.getName();
    private Button button1;
    private Button button2;
    private Button challenge1;
    private Button challenge2;
    private NumberPicker note;
    private NumberPicker iterations;

    private MediaPlayer mpA;
    private MediaPlayer mpB;
    private MediaPlayer mpC;
    private MediaPlayer mpCs;
    private MediaPlayer mpD;
    private MediaPlayer mpE;
    private MediaPlayer mpF;
    private MediaPlayer mpFs;
    MediaPlayer[] noteArray = {mpA, mpB, mpC, mpCs, mpD, mpE, mpF, mpFs};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_synthesizer);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        challenge1 = (Button) findViewById(R.id.challenge1);
        challenge2 = (Button) findViewById(R.id.challenge2);
        note = (NumberPicker) findViewById(R.id.note);
        iterations = (NumberPicker) findViewById(R.id.iterations);
        mpA = MediaPlayer.create(this, R.raw.scalea);
        mpB = MediaPlayer.create(this, R.raw.scaleb);
        mpC = MediaPlayer.create(this, R.raw.scalec);
        mpCs = MediaPlayer.create(this, R.raw.scalecs);
        mpD = MediaPlayer.create(this, R.raw.scaled);
        mpE = MediaPlayer.create(this, R.raw.scalee);
        mpF = MediaPlayer.create(this, R.raw.scalef);
        mpFs = MediaPlayer.create(this, R.raw.scalefs);
        note.setMinValue(0);
        note.setMaxValue(7);
        iterations.setMinValue(0);
        iterations.setMaxValue(7);

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

    public void onButtonCHL2Click(View v) {
       for(int i = 0; i < iterations.getValue(); i++) {
           MediaPlayer[] noteArray = {mpA, mpB, mpC, mpCs, mpD, mpE, mpF, mpFs};
           if(note.getValue() == 0) {
               //mpA.seekTo(0);
               mpA.start();
           }
           if(note.getValue() == 1) {
               mpB.seekTo(0);
               mpB.start();
           }
           if(note.getValue() == 2) {
               mpC.seekTo(0);
               mpC.start();
           }
           if(note.getValue() == 3) {
               mpCs.seekTo(0);
               mpCs.start();
           }
           if(note.getValue() == 4) {
               mpD.seekTo(0);
               mpD.start();
           }
           if(note.getValue() == 5) {
               mpE.seekTo(0);
               mpE.start();
           }
           if(note.getValue() == 6) {
               mpF.seekTo(0);
               mpF.start();
           }
           if(note.getValue() == 7) {
               mpFs.seekTo(0);
               mpFs.start();
           }


       }
       }
        /* try { //Challenge 3, 6
            for (int i = 0; i < iterations.getValue(); i++) {
                noteArray[note.getValue()].seekTo(0);
                noteArray[note.getValue()].start();
                //mpE.seekTo(0);
                //mpE.start();
                delayPlaying(WHOLE_NOTE);
            }
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
        */

    }




