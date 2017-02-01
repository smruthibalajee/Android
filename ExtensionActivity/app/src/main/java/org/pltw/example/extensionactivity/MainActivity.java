package org.pltw.example.extensionactivity;

import android.media.MediaPlayer;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private final int WHOLE_NOTE = 1000;
    private final int HALF_NOTE = 500;

    private Button button1;
    private Button button2;
    private Button button3;

    private MediaPlayer mpA;
    private MediaPlayer mpB;
    private MediaPlayer mpBB;
    private MediaPlayer mpC;
    private MediaPlayer mpCs;
    private MediaPlayer mpD;
    private MediaPlayer mpDs;
    private MediaPlayer mpE;
    private MediaPlayer mpF;
    private MediaPlayer mpFs;
    private MediaPlayer mpG;
    private MediaPlayer mpGs;
    private MediaPlayer mpHighE;
    private MediaPlayer mpHighF;
    private MediaPlayer mpHighFs;
    private MediaPlayer mpHighG;

    private int[] randList = {1,2,3,4,5};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(MainActivity.this);

        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(MainActivity.this);

        button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(MainActivity.this);

        mpA = MediaPlayer.create(this, R.raw.scalea);
        mpB = MediaPlayer.create(this, R.raw.scaleb);
        mpBB = MediaPlayer.create(this, R.raw.scalebb);
        mpC = MediaPlayer.create(this, R.raw.scalec);
        mpCs = MediaPlayer.create(this, R.raw.scalecs);
        mpD = MediaPlayer.create(this, R.raw.scaled);
        mpDs = MediaPlayer.create(this, R.raw.scaleds);
        mpE = MediaPlayer.create(this, R.raw.scalee);
        mpHighE = MediaPlayer.create(this, R.raw.scalehighe);
        mpF = MediaPlayer.create(this, R.raw.scalef);
        mpFs = MediaPlayer.create(this, R.raw.scalefs);
        mpHighF = MediaPlayer.create(this, R.raw.scalehighf);
        mpHighFs = MediaPlayer.create(this, R.raw.scalehighfs);
        mpHighG = MediaPlayer.create(this, R.raw.scalehighg);
        mpG = MediaPlayer.create(this, R.raw.scaleg);
        mpGs = MediaPlayer.create(this, R.raw.scalegs);

    }


    private void delayPlaying(int delay) throws InterruptedException {
        try {
            Thread.sleep(delay);
        } catch (InterruptedException e) {
            Log.e("Synthesizer", "Audio Playback Interrupted");
        }
    }

    private static int[] shuffleArray(int[] array)
    {
        int index, temp;
        Random random = new Random();
        for (int i = array.length - 1; i > 0; i--)
        {
            index = random.nextInt(i + 1);
            temp = array[index];
            array[index] = array[i];
            array[i] = temp;
        }

        return array;
    }

    private void Song1(){ //Scales a --> g
        try{
            mpA.start();
            delayPlaying(HALF_NOTE);
            mpA.seekTo(0);
            mpB.start();
            delayPlaying(HALF_NOTE);
            mpB.seekTo(0);
            mpC.start();
            delayPlaying(HALF_NOTE);
            mpC.seekTo(0);
            mpD.start();
            delayPlaying(HALF_NOTE);
            mpD.seekTo(0);
            mpE.start();
            delayPlaying(HALF_NOTE);
            mpE.seekTo(0);
            mpF.start();
            delayPlaying(HALF_NOTE);
            mpF.seekTo(0);
            mpG.start();
            delayPlaying(HALF_NOTE);
            mpG.seekTo(0);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void Song2(){ //Scales g --> a
        try{
            mpG.start();
            delayPlaying(HALF_NOTE);
            mpG.seekTo(0);
            mpF.start();
            delayPlaying(HALF_NOTE);
            mpF.seekTo(0);
            mpE.start();
            delayPlaying(HALF_NOTE);
            mpE.seekTo(0);
            mpD.start();
            delayPlaying(HALF_NOTE);
            mpD.seekTo(0);
            mpC.start();
            delayPlaying(HALF_NOTE);
            mpC.seekTo(0);
            mpB.start();
            delayPlaying(HALF_NOTE);
            mpB.seekTo(0);
            mpA.start();
            delayPlaying(HALF_NOTE);
            mpA.seekTo(0);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void Song3(){
        try{
            mpB.start();
            delayPlaying(HALF_NOTE);
            mpB.seekTo(0);
            mpB.start();
            delayPlaying(HALF_NOTE);
            mpB.seekTo(0);
            mpC.start();
            delayPlaying(HALF_NOTE);
            mpC.seekTo(0);
            mpD.start();
            delayPlaying(HALF_NOTE);
            mpD.seekTo(0);
            mpD.start();
            delayPlaying(HALF_NOTE);
            mpD.seekTo(0);
            mpC.start();
            delayPlaying(HALF_NOTE);
            mpC.seekTo(0);
            mpB.start();
            delayPlaying(HALF_NOTE);
            mpB.seekTo(0);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void Song4(){
        try{
            mpD.start();
            delayPlaying(HALF_NOTE);
            mpD.seekTo(0);
            mpB.start();
            delayPlaying(HALF_NOTE);
            mpB.seekTo(0);
            mpG.start();
            delayPlaying(HALF_NOTE);
            mpG.seekTo(0);
            mpB.start();
            delayPlaying(HALF_NOTE);
            mpB.seekTo(0);
            mpD.start();
            delayPlaying(HALF_NOTE);
            mpD.seekTo(0);
            mpG.start();
            delayPlaying(HALF_NOTE);
            mpG.seekTo(0);
            mpB.start();
            delayPlaying(HALF_NOTE);
            mpB.seekTo(0);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void Song5(){
        try{
            mpD.start();
            delayPlaying(HALF_NOTE);
            mpD.seekTo(0);
            mpD.start();
            delayPlaying(HALF_NOTE);
            mpD.seekTo(0);
            mpD.start();
            delayPlaying(HALF_NOTE);
            mpD.seekTo(0);
            mpG.start();
            delayPlaying(HALF_NOTE);
            mpG.seekTo(0);
            mpD.start();
            delayPlaying(HALF_NOTE);
            mpD.seekTo(0);
            mpC.start();
            delayPlaying(HALF_NOTE);
            mpC.seekTo(0);
            mpB.start();
            delayPlaying(HALF_NOTE);
            mpB.seekTo(0);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }



    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.button1) {
            randList = shuffleArray(randList);
            for(int i = 0; i < 5; i++) {
                if(randList[i] == 1) {
                Song1();
                }
                if(randList[i] == 2) {
                    Song2();
                }
                if(randList[i] == 3) {
                    Song3();
                }
                if(randList[i] == 4) {
                    Song4();
                }
                if(randList[i] == 5) {
                    Song5();
                }

            }
        }
        }
    }

