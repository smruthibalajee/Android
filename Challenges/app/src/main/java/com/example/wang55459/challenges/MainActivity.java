
package com.example.wang55459.challenges;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.NumberPicker;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private final int WHOLE_NOTE = 1000;
    private Button button1;
    private Button button2;
    private Button button3;
    private Button button5;
    private Button button6;
    private MediaPlayer mpE;
    private MediaPlayer mpF;
    private MediaPlayer mpFs;
    private MediaPlayer mpG;
    private MediaPlayer mpGs;
    private MediaPlayer mpHighE;
    private MediaPlayer mpHighF;
    private MediaPlayer mpHighFs;
    private MediaPlayer mpHighG;
    private MediaPlayer mpA;
    private MediaPlayer mpB;
    private MediaPlayer mpBB;
    private MediaPlayer mpC;
    private MediaPlayer mpCs;
    private MediaPlayer mpD;
    private MediaPlayer mpDs;
    private NumberPicker note1;
    private NumberPicker note2;
    private int x;
    private int y;
    private int i;
    MediaPlayer aSongs[];
    private MediaPlayer mp;




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

        button5 = (Button) findViewById(R.id.button5);
        button5.setOnClickListener(MainActivity.this);

        button6 = (Button) findViewById(R.id.button6);
        button6.setOnClickListener(MainActivity.this);





        MediaPlayer [] aSongs;
        aSongs = new MediaPlayer[16];

        mpE = MediaPlayer.create(this, R.raw.scalee);
        mpF = MediaPlayer.create(this, R.raw.scalef);
        mpFs = MediaPlayer.create(this, R.raw.scalefs);
        mpG = MediaPlayer.create(this, R.raw.scaleg);
        mpGs = MediaPlayer.create(this, R.raw.scalegs);
        mpA = MediaPlayer.create(this, R.raw.scalea);
        mpB = MediaPlayer.create(this, R.raw.scaleb);
        mpBB = MediaPlayer.create(this, R.raw.scalebb);
        mpC = MediaPlayer.create(this, R.raw.scalec);
        mpCs = MediaPlayer.create(this, R.raw.scalecs);
        mpD = MediaPlayer.create(this, R.raw.scaled);
        mpDs = MediaPlayer.create(this, R.raw.scaleds);
        mpHighE = MediaPlayer.create(this, R.raw.scalehighe);
        mpHighF = MediaPlayer.create(this, R.raw.scalehighf);
        mpHighFs = MediaPlayer.create(this, R.raw.scalehighfs);
        mpHighG = MediaPlayer.create(this, R.raw.scalehighg);

        aSongs[0] = mpA;



        note1 = (NumberPicker) findViewById(R.id.numberPicker2);
        note2 = (NumberPicker) findViewById(R.id.numberPicker3);

        note1.setMinValue(0);
        note1.setMaxValue(16);

        note2.setMinValue(0);
        note2.setMaxValue(16);




    }


    private void delayPlaying(int delay) throws InterruptedException {
        try {
            Thread.sleep(delay);
        } catch (InterruptedException e) {
            Log.e("Synthesizer", "Audio Playback Interrupted");
        }
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.button1) {
            try {
                mpE.start();
                delayPlaying(WHOLE_NOTE);
                mpF.start();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


        }

        if (v.getId() == R.id.button2) {
            try {
                mpE.start();
                delayPlaying(WHOLE_NOTE / 2);
                mpFs.start();
                delayPlaying(WHOLE_NOTE / 2);
                mpG.start();
                delayPlaying(WHOLE_NOTE / 2);
                mpA.start();
                delayPlaying(WHOLE_NOTE / 2);
                mpB.start();
                delayPlaying(WHOLE_NOTE / 2);
                mpCs.start();
                delayPlaying(WHOLE_NOTE / 2);
                mpD.start();
                delayPlaying(WHOLE_NOTE / 2);
                mpE.start();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        if (v.getId() == R.id.button3) {
            x = note2.getValue() - 1;

            if (note1.getValue() == 1) {
                mpA.start();
                mpA.setLooping(true);
                try {
                    delayPlaying((5000 * x) + 1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                mpA.setLooping(false);


            } else if (note1.getValue() == 2) {
                mpB.start();
                mpB.setLooping(true);
                try {
                    delayPlaying((5000 * x) + 1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                mpB.setLooping(false);
            } else if (note1.getValue() == 3) {
                mpBB.start();
                mpBB.setLooping(true);
                try {
                    delayPlaying((5000 * x) + 1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                mpBB.setLooping(false);
            } else if (note1.getValue() == 4) {
                mpC.start();
                mpC.setLooping(true);
                try {
                    delayPlaying((5000 * x) + 1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                mpC.setLooping(false);
            } else if (note1.getValue() == 5) {
                mpCs.start();
                mpCs.setLooping(true);
                try {
                    delayPlaying((5000 * x) + 1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                mpCs.setLooping(false);
            } else if (note1.getValue() == 6) {
                mpD.start();
            } else if (note1.getValue() == 7) {
                mpDs.start();
            } else if (note1.getValue() == 8) {
                mpE.start();
            } else if (note1.getValue() == 9) {
                mpF.start();
            } else if (note1.getValue() == 10) {
                mpFs.start();
            } else if (note1.getValue() == 11) {
                mpG.start();
            } else if (note1.getValue() == 12) {
                mpHighE.start();
            } else if (note1.getValue() == 13) {
                mpHighG.start();
            } else if (note1.getValue() == 14) {
                mpGs.start();
            } else if (note1.getValue() == 15) {
                mpHighF.start();
            } else if (note1.getValue() == 16) {
                mpHighFs.start();
            }

        }

        if (v.getId() == R.id.button5) {
            try {
                mpA.start();
                delayPlaying(WHOLE_NOTE / 2);
                mpA.seekTo(0);
                mpA.start();
                delayPlaying(WHOLE_NOTE / 2);
                mpHighE.start();
                delayPlaying(WHOLE_NOTE / 2);
                mpHighE.seekTo(0);
                mpHighE.start();
                delayPlaying(WHOLE_NOTE / 2);
                mpHighFs.start();
                delayPlaying(WHOLE_NOTE / 2);
                mpHighFs.seekTo(0);
                mpHighFs.start();
                delayPlaying(WHOLE_NOTE / 2);
                mpHighE.seekTo(0);
                mpHighE.start();
                delayPlaying(WHOLE_NOTE);;
                mpD.start();
                delayPlaying(WHOLE_NOTE / 2);
                mpD.seekTo(0);
                mpD.start();
                delayPlaying(WHOLE_NOTE / 2);
                mpCs.start();
                delayPlaying(WHOLE_NOTE / 2);
                mpCs.seekTo(0);
                mpCs.start();
                delayPlaying(WHOLE_NOTE / 2);
                mpB.start();
                delayPlaying(WHOLE_NOTE / 2);
                mpB.seekTo(0);
                mpB.start();
                delayPlaying(WHOLE_NOTE / 2);
                mpA.start();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        else if (v.getId() == R.id.button6) {
            try {
                mpA.start();
                delayPlaying(WHOLE_NOTE / 2);
                mpA.seekTo(0);
                mpA.start();
                delayPlaying(WHOLE_NOTE / 2);
                mpHighE.start();
                delayPlaying(WHOLE_NOTE / 2);
                mpHighE.seekTo(0);
                mpHighE.start();
                delayPlaying(WHOLE_NOTE / 2);
                mpHighFs.start();
                delayPlaying(WHOLE_NOTE / 2);
                mpHighFs.seekTo(0);
                mpHighFs.start();
                delayPlaying(WHOLE_NOTE / 2);
                mpHighE.seekTo(0);
                mpHighE.start();
                delayPlaying(WHOLE_NOTE);;
                mpD.start();
                delayPlaying(WHOLE_NOTE / 2);
                mpD.seekTo(0);
                mpD.start();
                delayPlaying(WHOLE_NOTE / 2);
                mpCs.start();
                delayPlaying(WHOLE_NOTE / 2);
                mpCs.seekTo(0);
                mpCs.start();
                delayPlaying(WHOLE_NOTE / 2);
                mpB.start();
                delayPlaying(WHOLE_NOTE / 2);
                mpB.seekTo(0);
                mpB.start();
                delayPlaying(WHOLE_NOTE / 2);
                mpA.start();
                delayPlaying(WHOLE_NOTE);


                mpHighE.seekTo(0);
                mpHighE.start();
                delayPlaying(WHOLE_NOTE / 2);
                mpHighE.seekTo(0);
                mpHighE.start();
                delayPlaying(WHOLE_NOTE / 2);
                mpD.seekTo(0);
                mpD.start();
                delayPlaying(WHOLE_NOTE / 2);
                mpD.seekTo(0);
                mpD.start();
                delayPlaying(WHOLE_NOTE / 2);
                mpCs.seekTo(0);
                mpCs.start();
                delayPlaying(WHOLE_NOTE / 2);
                mpCs.seekTo(0);
                mpCs.start();
                delayPlaying(WHOLE_NOTE / 2);
                mpB.seekTo(0);
                mpB.start();
                delayPlaying(WHOLE_NOTE);


                mpHighE.seekTo(0);
                mpHighE.start();
                delayPlaying(WHOLE_NOTE / 2);
                mpHighE.seekTo(0);
                mpHighE.start();
                delayPlaying(WHOLE_NOTE / 2);
                mpD.seekTo(0);
                mpD.start();
                delayPlaying(WHOLE_NOTE / 2);
                mpD.seekTo(0);
                mpD.start();
                delayPlaying(WHOLE_NOTE / 2);
                mpCs.seekTo(0);
                mpCs.start();
                delayPlaying(WHOLE_NOTE / 2);
                mpCs.seekTo(0);
                mpCs.start();
                delayPlaying(WHOLE_NOTE / 2);
                mpB.seekTo(0);
                mpB.start();
                delayPlaying(WHOLE_NOTE);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

}





