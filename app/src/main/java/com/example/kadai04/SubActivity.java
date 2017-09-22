package com.example.kadai04;

import android.content.Intent;
import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class SubActivity extends AppCompatActivity {

    //効果音の設定
    SoundPool soundPool;
    public int clap_funk_5;
    public int cowbell_808_wm;

    //アクションバーの設定
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    //アクションバー
    //ゲーム開始＆リセット
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        if (id == R.id.action_staff) {
            Intent intent = new Intent(getApplication(), com.example.kadai04.SubActivity.class);
            startActivity(intent);
            //効果音
            soundPool.play(cowbell_808_wm, 1.0f, 1.0f, 0, 0, 1f);
        }

        if (id == R.id.action_3) {
            Intent intent = new Intent(getApplication(), MainActivity.class);
            startActivity(intent);
            //効果音
            soundPool.play(cowbell_808_wm, 1.0f, 1.0f, 0, 0, 1f);

            //トースト表示
            Toast toast = Toast.makeText(this, "! ! ! ! ! GAME START ! ! ! ! !", Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER | Gravity.CENTER, 0, 0);
            toast.show();
        }

        if (id == R.id.action_4) {
            Intent intent = new Intent(getApplication(), SubActivity4.class);
            startActivity(intent);

            //効果音
            soundPool.play(cowbell_808_wm, 1.0f, 1.0f, 0, 0, 1f);

            //トースト表示
            Toast toast = Toast.makeText(this, "! ! ! ! ! GAME START ! ! ! ! !", Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER | Gravity.CENTER, 0, 0);
            toast.show();
        }

        if (id == R.id.action_5) {
            Intent intent = new Intent(getApplication(), com.example.kadai04.SubActivity5.class);
            startActivity(intent);
            //効果音
            soundPool.play(cowbell_808_wm, 1.0f, 1.0f, 0, 0, 1f);

            //トースト表示
            Toast toast = Toast.makeText(this, "! ! ! ! ! GAME START ! ! ! ! !", Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER | Gravity.CENTER, 0, 0);
            toast.show();
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        // 効果音の初期化
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.LOLLIPOP) {
            soundPool = new SoundPool(5, AudioManager.STREAM_MUSIC, 0);
        } else {
            AudioAttributes attr = new AudioAttributes.Builder()
                    .setUsage(AudioAttributes.USAGE_MEDIA)
                    .setContentType(AudioAttributes.CONTENT_TYPE_MUSIC)
                    .build();
            soundPool = new SoundPool.Builder()
                    .setAudioAttributes(attr)
                    .setMaxStreams(5)
                    .build();
        }

        clap_funk_5 = soundPool.load(this, R.raw.clap_funk_5, 1);
        cowbell_808_wm = soundPool.load(this, R.raw.cowbell_808_wm, 1);

    }

}