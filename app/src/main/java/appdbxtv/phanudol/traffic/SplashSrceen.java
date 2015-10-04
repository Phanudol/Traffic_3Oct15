package appdbxtv.phanudol.traffic;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashSrceen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_srceen);

        Handler objHandler = new Handler();
        objHandler.postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(SplashSrceen.this, MainActivity.class));
                finish();
            }
        }, 8000);

        MediaPlayer introMediaPlayer = MediaPlayer.create(getBaseContext(),R.raw.intro_tata);
        introMediaPlayer.start();


    }// onCreate
} //Main class
