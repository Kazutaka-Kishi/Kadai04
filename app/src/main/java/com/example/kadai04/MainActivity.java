package com.example.kadai04;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.RotateAnimation;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    //効果音の設定
    SoundPool soundPool;
    public int clap_funk_5;
    public int cowbell_808_wm;
    //BGM
    public int new_session;

    private static Toast t;

    public int array[][] = new int[3][3];

    public int sum1 = 0;
    public int sum2 = 0;
    public int sum3 = 0;
    public int sum4 = 0;
    public int sum5 = 0;
    public int sum6 = 0;
    public int sum7 = 0;
    public int sum8 = 0;

    public int flag_sum = 0;
    public int flag_play = 0;

    public int cp_play = 0;

    public int win_count = 3;
    public int win_usr = -3;
    public int win_com = 3;

    final Activity activity = this;

    //ユーザーメソッド

    //勝敗の判定
    public void Judgment() {

        int sum_judgment = 0;

        //よこ
        for (int i = 0; i < win_count; i++) {
            sum_judgment = array[i][0] + array[i][1] + array[i][2];

            //ユーザー勝利
            if (win_usr == sum_judgment) {
                //トースト表示
                Toast toast = Toast.makeText(activity, "! ! ! ! ! VIVA LA REVOLUTION ! ! ! ! !", Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.CENTER | Gravity.CENTER, 0, 0);
                toast.show();
                //ゲーム終了
                flag_play = 0;
                cp_play = 0;
            }

            //コンピュータ勝利
            if (win_com == sum_judgment) {
                //トースト表示
                Toast toast = Toast.makeText(activity, "! ! ! ! ! LOSE ! ! ! ! !", Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.CENTER | Gravity.CENTER, 0, 0);
                toast.show();
                //ゲーム終了
                flag_play = 0;
                cp_play = 0;
            }
        }

        //たて
        for (int i = 0; i < win_count; i++) {
            sum_judgment = array[0][i] + array[1][i] + array[2][i];

            //ユーザー勝利
            if (win_usr == sum_judgment) {
                //トースト表示
                Toast toast = Toast.makeText(activity, "! ! ! ! ! VIVA LA REVOLUTION ! ! ! ! !", Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.CENTER | Gravity.CENTER, 0, 0);
                toast.show();
                //ゲーム終了
                flag_play = 0;
                cp_play = 0;
            }

            //コンピュータ勝利
            if (win_com == sum_judgment) {
                //トースト表示
                Toast toast = Toast.makeText(activity, "! ! ! ! ! LOSE ! ! ! ! !", Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.CENTER | Gravity.CENTER, 0, 0);
                toast.show();
                //ゲーム終了
                flag_play = 0;
                cp_play = 0;
            }
        }

        //ななめ
        for (int i = 0; i < win_count; i++) {
            sum_judgment = array[0][i] + array[1][1] + array[2][2 - i];

            if (win_usr == sum_judgment) {
                //トースト表示
                Toast toast = Toast.makeText(activity, "! ! ! ! ! VIVA LA REVOLUTION ! ! ! ! !", Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.CENTER | Gravity.CENTER, 0, 0);
                toast.show();
                //ゲーム終了
                flag_play = 0;
                cp_play = 0;
            }

            //コンピュータ勝利
            if (win_com == sum_judgment) {
                //トースト表示
                Toast toast = Toast.makeText(activity, "! ! ! ! ! LOSE ! ! ! ! !", Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.CENTER | Gravity.CENTER, 0, 0);
                toast.show();
                //ゲーム終了
                flag_play = 0;
                cp_play = 0;
            }
        }

        //引き分け（コンピュータが最後まで打ったとき）
        if (cp_play == 5) {

            //トースト表示
            Toast toast = Toast.makeText(activity, "! ! ! ! ! DRAW ! ! ! ! !", Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER | Gravity.CENTER, 0, 0);
            toast.show();

            //ゲーム終了
            flag_play = 0;
            cp_play = 0;
        }

    }

    //コンピュータの手番
    public void ComputerPlay() {

        final Button button1 = (Button) this.findViewById(R.id.button1);
        final Button button2 = (Button) this.findViewById(R.id.button2);
        final Button button3 = (Button) this.findViewById(R.id.button3);
        final Button button4 = (Button) this.findViewById(R.id.button4);
        final Button button5 = (Button) this.findViewById(R.id.button5);
        final Button button6 = (Button) this.findViewById(R.id.button6);
        final Button button7 = (Button) this.findViewById(R.id.button7);
        final Button button8 = (Button) this.findViewById(R.id.button8);
        final Button button9 = (Button) this.findViewById(R.id.button9);

        sum1 = array[0][0] + array[0][1] + array[0][2];
        sum2 = array[1][0] + array[1][1] + array[1][2];
        sum3 = array[2][0] + array[2][1] + array[2][2];

        sum4 = array[0][0] + array[1][0] + array[2][0];
        sum5 = array[0][1] + array[1][1] + array[2][1];
        sum6 = array[0][2] + array[1][2] + array[2][2];

        sum7 = array[0][0] + array[1][1] + array[2][2];
        sum8 = array[0][2] + array[1][1] + array[2][0];

        cp_play++;

        // アニメーション設定
        // 回転
        final RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 360.0f,
                Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
        rotateAnimation.setDuration(1000);
        // 透明度を0から1.0に変化させる
        AlphaAnimation alphaAnimation = new AlphaAnimation(0, 1.0f);
        alphaAnimation.setDuration(1000);
        // アニメーションを合成する
        AnimationSet animation_set = new AnimationSet(false);
        animation_set.addAnimation(rotateAnimation);
        animation_set.addAnimation(alphaAnimation);

        if (flag_play == 1) {

            //リーチをかけたときとかけられたときの処理
            if (flag_sum == 0) {
                if (sum1 == 2 | sum1 == -2) {

                    if (array[0][0] == 0) {
                        array[0][0] = 1;
                        //アニメーションスタート
                        button1.startAnimation(animation_set);
                        button1.setBackgroundResource(R.drawable.star_white);
                        flag_sum = 1;
                    }
                    if (array[0][1] == 0) {
                        array[0][1] = 1;
                        //アニメーションスタート
                        button2.startAnimation(animation_set);
                        button2.setBackgroundResource(R.drawable.star_white);
                        flag_sum = 1;
                    }
                    if (array[0][2] == 0) {
                        array[0][2] = 1;
                        //アニメーションスタート
                        button3.startAnimation(animation_set);
                        button3.setBackgroundResource(R.drawable.star_white);
                        flag_sum = 1;
                    }
                }
            }

            if (flag_sum == 0) {
                if (sum2 == 2 | sum2 == -2) {

                    if (array[1][0] == 0) {
                        array[1][0] = 1;
                        //アニメーションスタート
                        button4.startAnimation(animation_set);
                        button4.setBackgroundResource(R.drawable.star_white);
                        flag_sum = 1;
                    }
                    if (array[1][1] == 0) {
                        array[1][1] = 1;
                        //アニメーションスタート
                        button5.startAnimation(animation_set);
                        button5.setBackgroundResource(R.drawable.star_white);
                        flag_sum = 1;
                    }
                    if (array[1][2] == 0) {
                        array[1][2] = 1;
                        //アニメーションスタート
                        button6.startAnimation(animation_set);
                        button6.setBackgroundResource(R.drawable.star_white);
                        flag_sum = 1;
                    }
                }
            }

            if (flag_sum == 0) {
                if (sum3 == 2 | sum3 == -2) {

                    if (array[2][0] == 0) {
                        array[2][0] = 1;
                        //アニメーションスタート
                        button7.startAnimation(animation_set);
                        button7.setBackgroundResource(R.drawable.star_white);
                        flag_sum = 1;
                    }
                    if (array[2][1] == 0) {
                        array[2][1] = 1;
                        //アニメーションスタート
                        button8.startAnimation(animation_set);
                        button8.setBackgroundResource(R.drawable.star_white);
                        flag_sum = 1;
                    }
                    if (array[2][2] == 0) {
                        array[2][2] = 1;
                        //アニメーションスタート
                        button9.startAnimation(animation_set);
                        button9.setBackgroundResource(R.drawable.star_white);
                        flag_sum = 1;
                    }
                }
            }

            if (flag_sum == 0) {
                if (sum4 == 2 | sum4 == -2) {

                    if (array[0][0] == 0) {
                        array[0][0] = 1;
                        //アニメーションスタート
                        button1.startAnimation(animation_set);
                        button1.setBackgroundResource(R.drawable.star_white);
                        flag_sum = 1;
                    }
                    if (array[1][0] == 0) {
                        array[1][0] = 1;
                        //アニメーションスタート
                        button4.startAnimation(animation_set);
                        button4.setBackgroundResource(R.drawable.star_white);
                        flag_sum = 1;
                    }
                    if (array[2][0] == 0) {
                        array[2][0] = 1;
                        //アニメーションスタート
                        button7.startAnimation(animation_set);
                        button7.setBackgroundResource(R.drawable.star_white);
                        flag_sum = 1;
                    }
                }
            }

            if (flag_sum == 0) {
                if (sum5 == 2 | sum5 == -2) {

                    if (array[0][1] == 0) {
                        array[0][1] = 1;
                        //アニメーションスタート
                        button2.startAnimation(animation_set);
                        button2.setBackgroundResource(R.drawable.star_white);
                        flag_sum = 1;
                    }
                    if (array[1][1] == 0) {
                        array[1][1] = 1;
                        //アニメーションスタート
                        button5.startAnimation(animation_set);
                        button5.setBackgroundResource(R.drawable.star_white);
                        flag_sum = 1;
                    }
                    if (array[2][1] == 0) {
                        array[2][1] = 1;
                        //アニメーションスタート
                        button8.startAnimation(animation_set);
                        button8.setBackgroundResource(R.drawable.star_white);
                        flag_sum = 1;
                    }
                }
            }

            if (flag_sum == 0) {
                if (sum6 == 2 | sum6 == -2) {

                    if (array[0][2] == 0) {
                        array[0][2] = 1;
                        //アニメーションスタート
                        button3.startAnimation(animation_set);
                        button3.setBackgroundResource(R.drawable.star_white);
                        flag_sum = 1;
                    }
                    if (array[1][2] == 0) {
                        array[1][2] = 1;
                        //アニメーションスタート
                        button6.startAnimation(animation_set);
                        button6.setBackgroundResource(R.drawable.star_white);
                        flag_sum = 1;
                    }
                    if (array[2][2] == 0) {
                        array[2][2] = 1;
                        //アニメーションスタート
                        button9.startAnimation(animation_set);
                        button9.setBackgroundResource(R.drawable.star_white);
                        flag_sum = 1;
                    }
                }
            }

            if (flag_sum == 0) {
                if (sum7 == 2 | sum7 == -2) {

                    if (array[0][0] == 0) {
                        array[0][0] = 1;
                        //アニメーションスタート
                        button1.startAnimation(animation_set);
                        button1.setBackgroundResource(R.drawable.star_white);
                        flag_sum = 1;
                    }
                    if (array[1][1] == 0) {
                        array[1][1] = 1;
                        //アニメーションスタート
                        button5.startAnimation(animation_set);
                        button5.setBackgroundResource(R.drawable.star_white);
                        flag_sum = 1;
                    }
                    if (array[2][2] == 0) {
                        array[2][2] = 1;
                        //アニメーションスタート
                        button9.startAnimation(animation_set);
                        button9.setBackgroundResource(R.drawable.star_white);
                        flag_sum = 1;
                    }
                }
            }

            if (flag_sum == 0) {
                if (sum8 == 2 | sum8 == -2) {

                    if (array[0][2] == 0) {
                        array[0][2] = 1;
                        //アニメーションスタート
                        button3.startAnimation(animation_set);
                        button3.setBackgroundResource(R.drawable.star_white);
                        flag_sum = 1;
                    }
                    if (array[1][1] == 0) {
                        array[1][1] = 1;
                        //アニメーションスタート
                        button5.startAnimation(animation_set);
                        button5.setBackgroundResource(R.drawable.star_white);
                        flag_sum = 1;
                    }
                    if (array[2][0] == 0) {
                        array[2][0] = 1;
                        //アニメーションスタート
                        button7.startAnimation(animation_set);
                        button7.setBackgroundResource(R.drawable.star_white);
                        flag_sum = 1;
                    }
                }
            }

            if (flag_sum == 0) {
                int flag = 1;
                while (flag == 1) {

                    //ランダムで array_4 が 0 の場所に 1 を代入する
                    Random r = new Random();
                    int n = r.nextInt(8);

                    switch (n) {
                        case 0:
                            if (array[0][0] == 0) {
                                array[0][0] = 1;
                                //アニメーションスタート
                                button1.startAnimation(animation_set);
                                button1.setBackgroundResource(R.drawable.star_white);
                                flag = 0;
                            }
                            break;
                        case 1:
                            if (array[0][1] == 0) {
                                array[0][1] = 1;
                                //アニメーションスタート
                                button2.startAnimation(animation_set);
                                button2.setBackgroundResource(R.drawable.star_white);
                                flag = 0;
                            }
                            break;
                        case 2:
                            if (array[0][2] == 0) {
                                array[0][2] = 1;
                                //アニメーションスタート
                                button3.startAnimation(animation_set);
                                button3.setBackgroundResource(R.drawable.star_white);
                                flag = 0;
                            }
                            break;
                        case 3:
                            if (array[1][0] == 0) {
                                array[1][0] = 1;

                                //アニメーションスタート
                                button4.startAnimation(animation_set);

                                button4.setBackgroundResource(R.drawable.star_white);

                                flag = 0;
                            }
                            break;
                        case 4:
                            if (array[1][1] == 0) {
                                array[1][1] = 1;
                                //アニメーションスタート
                                button5.startAnimation(animation_set);
                                button5.setBackgroundResource(R.drawable.star_white);
                                flag = 0;
                            }
                            break;
                        case 5:
                            if (array[1][2] == 0) {
                                array[1][2] = 1;
                                //アニメーションスタート
                                button6.startAnimation(animation_set);
                                button6.setBackgroundResource(R.drawable.star_white);
                                flag = 0;
                            }
                            break;
                        case 6:
                            if (array[2][0] == 0) {
                                array[2][0] = 1;
                                //アニメーションスタート
                                button7.startAnimation(animation_set);
                                button7.setBackgroundResource(R.drawable.star_white);
                                flag = 0;
                            }
                            break;
                        case 7:
                            if (array[2][1] == 0) {
                                array[2][1] = 1;
                                //アニメーションスタート
                                button8.startAnimation(animation_set);
                                button8.setBackgroundResource(R.drawable.star_white);
                                flag = 0;
                            }
                            break;
                        case 8:
                            if (array[2][2] == 0) {
                                array[2][2] = 1;
                                //アニメーションスタート
                                button9.startAnimation(animation_set);
                                button9.setBackgroundResource(R.drawable.star_white);
                                flag = 0;
                            }
                            break;
                        default:
                            array[0][0] = 0;
                            button1.setBackgroundResource(R.drawable.star_white);
                            break;
                    }
                }
            }
        }
        flag_sum = 0;
    }

    //アクションバーの設定
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    //private MediaPlayer mp;

    //アクションバー
    //ゲーム開始＆リセット
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        if (id == R.id.action_staff) {
            Intent intent = new Intent(getApplication(), SubActivity.class);
            startActivity(intent);

            //効果音
            soundPool.play(cowbell_808_wm, 1.0f, 1.0f, 0, 0, 1f);
        }

        if (id == R.id.action_3) {

            final Button button1 = (Button) this.findViewById(R.id.button1);
            final Button button2 = (Button) this.findViewById(R.id.button2);
            final Button button3 = (Button) this.findViewById(R.id.button3);
            final Button button4 = (Button) this.findViewById(R.id.button4);
            final Button button5 = (Button) this.findViewById(R.id.button5);
            final Button button6 = (Button) this.findViewById(R.id.button6);
            final Button button7 = (Button) this.findViewById(R.id.button7);
            final Button button8 = (Button) this.findViewById(R.id.button8);
            final Button button9 = (Button) this.findViewById(R.id.button9);

            // 効果音
            soundPool.play(cowbell_808_wm, 1.0f, 1.0f, 0, 0, 1f);
            // BGM
            //mp = MediaPlayer.create(this, R.raw.new_session);
            // ループ設定
            //mp.setLooping(true);
            // 再生位置を0ミリ秒に指定
            //mp.seekTo(0);
            //mp.start();

            //ゲーム開始
            flag_play = 1;
            cp_play = 0;

            //トースト表示
            Toast toast = Toast.makeText(activity, "! ! ! ! ! GAME START ! ! ! ! !", Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER | Gravity.CENTER, 0, 0);
            toast.show();

            //配列の初期化
            int n = 0;
            while (n < 3) {
                for (int i = 0; i < 3; i++) {
                    array[n][i] = 0;
                }
                n++;
            }

            //勝敗判定の初期化
            sum1 = 0;
            sum2 = 0;
            sum3 = 0;
            sum4 = 0;
            sum5 = 0;
            sum6 = 0;
            sum7 = 0;
            sum8 = 0;

            flag_sum = 0;

            //ボタンの初期化
            button1.setText("");
            button1.setBackgroundColor(Color.rgb(000, 000, 000));
            button2.setText("");
            button2.setBackgroundColor(Color.rgb(000, 000, 000));
            button3.setText("");
            button3.setBackgroundColor(Color.rgb(000, 000, 000));
            button4.setText("");
            button4.setBackgroundColor(Color.rgb(000, 000, 000));
            button5.setText("");
            button5.setBackgroundColor(Color.rgb(000, 000, 000));
            button6.setText("");
            button6.setBackgroundColor(Color.rgb(000, 000, 000));
            button7.setText("");
            button7.setBackgroundColor(Color.rgb(000, 000, 000));
            button8.setText("");
            button8.setBackgroundColor(Color.rgb(000, 000, 000));
            button9.setText("");
            button9.setBackgroundColor(Color.rgb(000, 000, 000));

            ComputerPlay();
        }

        if (id == R.id.action_4) {
            Intent intent = new Intent(getApplication(), SubActivity4.class);
            startActivity(intent);

            //効果音
            soundPool.play(cowbell_808_wm, 1.0f, 1.0f, 0, 0, 1f);

            //トースト表示
            Toast toast = Toast.makeText(activity, "! ! ! ! ! GAME START ! ! ! ! !", Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER | Gravity.CENTER, 0, 0);
            toast.show();

        }

        if (id == R.id.action_5) {
            Intent intent = new Intent(getApplication(), SubActivity5.class);
            startActivity(intent);

            //効果音
            soundPool.play(cowbell_808_wm, 1.0f, 1.0f, 0, 0, 1f);

            //トースト表示
            Toast toast = Toast.makeText(activity, "! ! ! ! ! GAME START ! ! ! ! !", Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER | Gravity.CENTER, 0, 0);
            toast.show();
        }

        return super.onOptionsItemSelected(item);
    }

    //ユーザーの手番
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

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

        final Button button1 = (Button) this.findViewById(R.id.button1);
        final Button button2 = (Button) this.findViewById(R.id.button2);
        final Button button3 = (Button) this.findViewById(R.id.button3);
        final Button button4 = (Button) this.findViewById(R.id.button4);
        final Button button5 = (Button) this.findViewById(R.id.button5);
        final Button button6 = (Button) this.findViewById(R.id.button6);
        final Button button7 = (Button) this.findViewById(R.id.button7);
        final Button button8 = (Button) this.findViewById(R.id.button8);
        final Button button9 = (Button) this.findViewById(R.id.button9);

        button1.setTag("1");
        button2.setTag("2");
        button3.setTag("3");
        button4.setTag("4");
        button5.setTag("5");
        button6.setTag("6");
        button7.setTag("7");
        button8.setTag("8");
        button9.setTag("9");

        soundPool.play(clap_funk_5, 1.0f, 1.0f, 0, 0, 1f);

        // アニメーション設定
        final RotateAnimation buttonRotation = new RotateAnimation(360.0f, 0.0f,
                Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
        buttonRotation.setDuration(500);

        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (flag_play == 1) {
                    if (array[0][0] == 0) {
                        array[0][0] = -1;
                        soundPool.play(clap_funk_5, 1.0f, 1.0f, 0, 0, 1f);
                        button1.setBackgroundResource(R.drawable.star_red);

                        button1.startAnimation(buttonRotation);
                        Judgment();

                        ComputerPlay();
                        Judgment();
                    }
                }
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Log.d("Button Tapped", view.getTag().toString());
                if (flag_play == 1) {
                    if (array[0][1] == 0) {
                        array[0][1] = -1;
                        soundPool.play(clap_funk_5, 1.0f, 1.0f, 0, 0, 1f);
                        button2.setBackgroundResource(R.drawable.star_red);

                        button2.startAnimation(buttonRotation);
                        Judgment();

                        ComputerPlay();
                        Judgment();
                    }
                }
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Log.d("Button Tapped", view.getTag().toString());
                if (flag_play == 1) {
                    if (array[0][2] == 0) {
                        array[0][2] = -1;
                        soundPool.play(clap_funk_5, 1.0f, 1.0f, 0, 0, 1f);
                        button3.setBackgroundResource(R.drawable.star_red);

                        button3.startAnimation(buttonRotation);
                        Judgment();

                        ComputerPlay();
                        Judgment();
                    }
                }
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Log.d("Button Tapped", view.getTag().toString());
                if (flag_play == 1) {
                    if (array[1][0] == 0) {
                        array[1][0] = -1;
                        soundPool.play(clap_funk_5, 1.0f, 1.0f, 0, 0, 1f);
                        button4.setBackgroundResource(R.drawable.star_red);

                        button4.startAnimation(buttonRotation);
                        Judgment();

                        ComputerPlay();
                        Judgment();
                    }
                }
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Log.d("Button Tapped", view.getTag().toString());
                if (flag_play == 1) {
                    if (array[1][1] == 0) {
                        array[1][1] = -1;
                        soundPool.play(clap_funk_5, 1.0f, 1.0f, 0, 0, 1f);
                        button5.setBackgroundResource(R.drawable.star_red);

                        button5.startAnimation(buttonRotation);
                        Judgment();

                        ComputerPlay();
                        Judgment();
                    }
                }
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Log.d("Button Tapped", view.getTag().toString());
                if (flag_play == 1) {
                    if (array[1][2] == 0) {
                        array[1][2] = -1;
                        soundPool.play(clap_funk_5, 1.0f, 1.0f, 0, 0, 1f);
                        button6.setBackgroundResource(R.drawable.star_red);

                        button6.startAnimation(buttonRotation);
                        Judgment();

                        ComputerPlay();
                        Judgment();
                    }
                }
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Log.d("Button Tapped", view.getTag().toString());
                if (flag_play == 1) {
                    if (array[2][0] == 0) {
                        array[2][0] = -1;
                        soundPool.play(clap_funk_5, 1.0f, 1.0f, 0, 0, 1f);
                        button7.setBackgroundResource(R.drawable.star_red);

                        button7.startAnimation(buttonRotation);
                        Judgment();

                        ComputerPlay();
                        Judgment();
                    }
                }
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Log.d("Button Tapped", view.getTag().toString());
                if (flag_play == 1) {
                    if (array[2][1] == 0) {
                        array[2][1] = -1;
                        soundPool.play(clap_funk_5, 1.0f, 1.0f, 0, 0, 1f);
                        button8.setBackgroundResource(R.drawable.star_red);

                        button8.startAnimation(buttonRotation);
                        Judgment();

                        ComputerPlay();
                        Judgment();
                    }
                }
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Log.d("Button Tapped", view.getTag().toString());
                if (flag_play == 1) {
                    if (array[2][2] == 0) {
                        array[2][2] = -1;
                        soundPool.play(clap_funk_5, 1.0f, 1.0f, 0, 0, 1f);
                        button9.setBackgroundResource(R.drawable.star_red);

                        button9.startAnimation(buttonRotation);
                        Judgment();

                        ComputerPlay();
                        Judgment();
                    }
                }
            }
        });

        if (flag_play == 0) {
        }
    }

    // Toast キャンセル
    public void toast(String message) {
        if (t != null) {
            t.cancel();
        }
        t = Toast.makeText(this, message, Toast.LENGTH_LONG);
        t.show();
    }

}