package com.slobodsky.nick.drumpadapp;

import android.media.AudioManager;
import android.media.SoundPool;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private SoundPool sp;

    private int sound1, sound2, sound3, sound4, sound5, sound6, sound7, sound8, sound9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        sp = new SoundPool(2, AudioManager.STREAM_MUSIC, 0);

        sound1 = sp.load(getApplicationContext(), R.raw.sounds1, 1);

        sound2 = sp.load(getApplicationContext(), R.raw.sounds2, 1);

        sound3 = sp.load(getApplicationContext(), R.raw.sounds3, 1);

        sound4 = sp.load(getApplicationContext(), R.raw.sounds4, 1);

        sound5 = sp.load(getApplicationContext(), R.raw.sounds5, 1);

        sound6 = sp.load(getApplicationContext(), R.raw.sounds6, 1);

        sound7 = sp.load(getApplicationContext(), R.raw.sounds7, 1);

        sound8 = sp.load(getApplicationContext(), R.raw.sounds8, 1);

        sound9 = sp.load(getApplicationContext(), R.raw.sounds9, 1);

    }

    void playSound1(View v)
    {
        sp.play(sound1, 1.0f, 1.0f, 0, 0, 10);
    }

    void playSound2(View v)
    {
        sp.play(sound2, 1.0f, 1.0f, 0, 0, 10);
    }

    void playSound3(View v)
    {
        sp.play(sound3, 1.0f, 1.0f, 0, 0, 10);
    }

    void playSound4(View v)
    {
        sp.play(sound4, 1.0f, 1.0f, 0, 0, 10);
    }

    void playSound5(View v)
    {
        sp.play(sound5, 1.0f, 1.0f, 0, 0, 10);
    }

    void playSound6(View v)
    {
        sp.play(sound6, 1.0f, 1.0f, 0, 0, 10);
    }

    void playSound7(View v)
    {
        sp.play(sound7, 1.0f, 1.0f, 0, 0, 10);
    }

    void playSound8(View v)
    {
        sp.play(sound8, 1.0f, 1.0f, 0, 0, 10);
    }

    void playSound9(View v)
    {
        sp.play(sound9, 1.0f, 1.0f, 0, 0, 10);
    }
}
