package com.example.kadai04;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.Color;
import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.RotateAnimation;
import android.widget.Button;
import android.widget.Toast;

import java.util.Random;

public class SubActivity4 extends AppCompatActivity {

    //効果音の設定
    SoundPool soundPool;
    public int clap_funk_5;
    public int cowbell_808_wm;

    private static Toast t;

    public int array_4[][] = new int[7][7];

    public int sum01_4 = 0;
    public int sum02_4 = 0;
    public int sum03_4 = 0;
    public int sum04_4 = 0;
    public int sum05_4 = 0;
    public int sum06_4 = 0;
    public int sum07_4 = 0;
    public int sum08_4 = 0;
    public int sum09_4 = 0;
    public int sum10_4 = 0;

    public int flag_sum_4 = 0;
    public int flag_end = 0;

    public int cp_play_4 = 0;

    public int win_v_h_4 = 7;
    public int win_sla_4 = 4;
    public int win_usr_4 = -4;
    public int win_com_4 = 4;

    public int num1 = 0;
    public int num2 = 0;
    public int num3 = 0;
    public int num4 = 0;

    public int num_4_1 = 0;

    final Activity activity = this;

    //ユーザーメソッド

    //勝敗の判定
    public void Judgment() {

        int sum_judgment_4 = 0;

        //よこ
        while (num1 < 4) {
            for (int i = 0; i < win_v_h_4; i++) {
                sum_judgment_4 = array_4[i][num1] + array_4[i][num1 + 1] + array_4[i][num1 + 2] + array_4[i][num1 + 3];

                //ユーザー勝利
                if (win_usr_4 == sum_judgment_4) {
                    //トースト表示
                    Toast toast = Toast.makeText(activity, "! ! ! ! ! VIVA LA REVOLUTION ! ! ! ! !", Toast.LENGTH_SHORT);
                    toast.setGravity(Gravity.CENTER | Gravity.CENTER, 0, 0);
                    toast.show();
                    //ゲーム終了
                    flag_end = 5;
                    cp_play_4 = 0;
                }

                //コンピュータ勝利
                if (win_com_4 == sum_judgment_4) {
                    //トースト表示
                    Toast toast = Toast.makeText(activity, "! ! ! ! ! LOSE ! ! ! ! !", Toast.LENGTH_SHORT);
                    toast.setGravity(Gravity.CENTER | Gravity.CENTER, 0, 0);
                    toast.show();
                    //ゲーム終了
                    flag_end = 1;
                    cp_play_4 = 0;
                }
            }
            num1++;
        }
        num1 = 0;

        //たて
        while (num2 < 4) {
            for (int i = 0; i < win_v_h_4; i++) {
                sum_judgment_4 = array_4[num2][i] + array_4[num2 + 1][i] + array_4[num2 + 2][i] + array_4[num2 + 3][i];

                //ユーザー勝利
                if (win_usr_4 == sum_judgment_4) {
                    //トースト表示
                    Toast toast = Toast.makeText(activity, "! ! ! ! ! VIVA LA REVOLUTION ! ! ! ! !", Toast.LENGTH_SHORT);
                    toast.setGravity(Gravity.CENTER | Gravity.CENTER, 0, 0);
                    toast.show();
                    //ゲーム終了
                    flag_end = 1;
                    cp_play_4 = 0;
                }

                //コンピュータ勝利
                if (win_com_4 == sum_judgment_4) {
                    //トースト表示
                    Toast toast = Toast.makeText(activity, "! ! ! ! ! LOSE ! ! ! ! !", Toast.LENGTH_SHORT);
                    toast.setGravity(Gravity.CENTER | Gravity.CENTER, 0, 0);
                    toast.show();
                    //ゲーム終了
                    flag_end = 1;
                    cp_play_4 = 0;
                }
            }
            num2++;
        }
        num2 = 0;

        //ななめ　左上から右下
        while (num3 < 4) {
            for (int i = 0; i < win_sla_4; i++) {
                sum_judgment_4 = array_4[num3][i] + array_4[num3 + 1][i + 1] + array_4[num3 + 2][i + 2] + array_4[num3 + 3][i + 3];

                //ユーザー勝利
                if (win_usr_4 == sum_judgment_4) {
                    //トースト表示
                    Toast toast = Toast.makeText(activity, "! ! ! ! ! VIVA LA REVOLUTION ! ! ! ! !", Toast.LENGTH_SHORT);
                    toast.setGravity(Gravity.CENTER | Gravity.CENTER, 0, 0);
                    toast.show();
                    //ゲーム終了
                    flag_end = 1;
                    cp_play_4 = 0;
                }

                //コンピュータ勝利
                if (win_com_4 == sum_judgment_4) {
                    //トースト表示
                    Toast toast = Toast.makeText(activity, "! ! ! ! ! LOSE ! ! ! ! !", Toast.LENGTH_SHORT);
                    toast.setGravity(Gravity.CENTER | Gravity.CENTER, 0, 0);
                    toast.show();
                    //ゲーム終了
                    flag_end = 1;
                    cp_play_4 = 0;
                }
            }
            num3++;
        }
        num3 = 0;

        //ななめ　右上から左下
        while (num4 < 4) {
            for (int i = 0; i < win_sla_4; i++) {
                sum_judgment_4 = array_4[num4][6 - i] + array_4[num4 + 1][5 - i] + array_4[num4 + 2][4 - i] + array_4[num4 + 3][3 - i];

                //ユーザー勝利
                if (win_usr_4 == sum_judgment_4) {
                    //トースト表示
                    Toast toast = Toast.makeText(activity, "! ! ! ! ! VIVA LA REVOLUTION ! ! ! ! !", Toast.LENGTH_SHORT);
                    toast.setGravity(Gravity.CENTER | Gravity.CENTER, 0, 0);
                    toast.show();
                    //ゲーム終了
                    flag_end = 1;
                    cp_play_4 = 0;
                }

                //コンピュータ勝利
                if (win_com_4 == sum_judgment_4) {
                    //トースト表示
                    Toast toast = Toast.makeText(activity, "! ! ! ! ! LOSE ! ! ! ! !", Toast.LENGTH_SHORT);
                    toast.setGravity(Gravity.CENTER | Gravity.CENTER, 0, 0);
                    toast.show();
                    //ゲーム終了
                    flag_end = 1;
                    cp_play_4 = 0;
                }
            }
            num4++;
        }
        num4 = 0;

        //引き分け
        if (cp_play_4 == 25) {

            //トースト表示
            Toast toast = Toast.makeText(activity, "! ! ! ! ! DRAW ! ! ! ! !", Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER | Gravity.CENTER, 0, 0);
            toast.show();

            //ゲーム終了
            flag_end = 1;
            cp_play_4 = 0;
        }
    }

    //コンピュータの手番
    public void ComputerPlay_4() {
        final Button button01 = (Button) this.findViewById(R.id.button01);
        final Button button02 = (Button) this.findViewById(R.id.button02);
        final Button button03 = (Button) this.findViewById(R.id.button03);
        final Button button04 = (Button) this.findViewById(R.id.button04);
        final Button button05 = (Button) this.findViewById(R.id.button05);
        final Button button06 = (Button) this.findViewById(R.id.button06);
        final Button button07 = (Button) this.findViewById(R.id.button07);
        final Button button08 = (Button) this.findViewById(R.id.button08);
        final Button button09 = (Button) this.findViewById(R.id.button09);
        final Button button10 = (Button) this.findViewById(R.id.button10);

        final Button button11 = (Button) this.findViewById(R.id.button11);
        final Button button12 = (Button) this.findViewById(R.id.button12);
        final Button button13 = (Button) this.findViewById(R.id.button13);
        final Button button14 = (Button) this.findViewById(R.id.button14);
        final Button button15 = (Button) this.findViewById(R.id.button15);
        final Button button16 = (Button) this.findViewById(R.id.button16);
        final Button button17 = (Button) this.findViewById(R.id.button17);
        final Button button18 = (Button) this.findViewById(R.id.button18);
        final Button button19 = (Button) this.findViewById(R.id.button19);

        final Button button20 = (Button) this.findViewById(R.id.button20);
        final Button button21 = (Button) this.findViewById(R.id.button21);
        final Button button22 = (Button) this.findViewById(R.id.button22);
        final Button button23 = (Button) this.findViewById(R.id.button23);
        final Button button24 = (Button) this.findViewById(R.id.button24);
        final Button button25 = (Button) this.findViewById(R.id.button25);
        final Button button26 = (Button) this.findViewById(R.id.button26);
        final Button button27 = (Button) this.findViewById(R.id.button27);
        final Button button28 = (Button) this.findViewById(R.id.button28);
        final Button button29 = (Button) this.findViewById(R.id.button29);
        final Button button30 = (Button) this.findViewById(R.id.button30);

        final Button button31 = (Button) this.findViewById(R.id.button31);
        final Button button32 = (Button) this.findViewById(R.id.button32);
        final Button button33 = (Button) this.findViewById(R.id.button33);
        final Button button34 = (Button) this.findViewById(R.id.button34);
        final Button button35 = (Button) this.findViewById(R.id.button35);
        final Button button36 = (Button) this.findViewById(R.id.button36);
        final Button button37 = (Button) this.findViewById(R.id.button37);
        final Button button38 = (Button) this.findViewById(R.id.button38);
        final Button button39 = (Button) this.findViewById(R.id.button39);
        final Button button40 = (Button) this.findViewById(R.id.button40);

        final Button button41 = (Button) this.findViewById(R.id.button41);
        final Button button42 = (Button) this.findViewById(R.id.button42);
        final Button button43 = (Button) this.findViewById(R.id.button43);
        final Button button44 = (Button) this.findViewById(R.id.button44);
        final Button button45 = (Button) this.findViewById(R.id.button45);
        final Button button46 = (Button) this.findViewById(R.id.button46);
        final Button button47 = (Button) this.findViewById(R.id.button47);
        final Button button48 = (Button) this.findViewById(R.id.button48);
        final Button button49 = (Button) this.findViewById(R.id.button49);

        cp_play_4++;
        int n = -1;

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

        if (flag_end == 0) {

            int ans = 0;
            // リーチ時の処理
            // よこ
            if (n == -1) {
                while (ans < 4) {
                    for (int ib = 0; ib < 7; ib++) {
                        sum01_4 = array_4[ib][ans] + array_4[ib][1 + ans] + array_4[ib][2 + ans] + array_4[ib][3 + ans];

                        if (sum01_4 == -3 | sum01_4 == 3) {
                            if (array_4[ib][ans] == 0)
                                n = 0 + ans + (ib * 7);
                            if (array_4[ib][1 + ans] == 0)
                                n = 1 + ans + (ib * 7);
                            if (array_4[ib][2 + ans] == 0)
                                n = 2 + ans + (ib * 7);
                            if (array_4[ib][3 + ans] == 0)
                                n = 3 + ans + (ib * 7);
                        }
                    }
                    ans++;
                }
                ans = 0;
            }
            // たて
            if (n == -1) {
                while (ans < 4) {
                    for (int ib = 0; ib < 7; ib++) {
                        sum01_4 = array_4[ans][ib] + array_4[1 + ans][ib] + array_4[2 + ans][ib] + array_4[3 + ans][ib];

                        if (sum01_4 == -3 | sum01_4 == 3) {
                            if (array_4[ans][ib] == 0)
                                n = 0 + ib + (ans * 7);
                            if (array_4[1 + ans][ib] == 0)
                                n = 7 + ib + (ans * 7);
                            if (array_4[2 + ans][ib] == 0)
                                n = 14 + ib + (ans * 7);
                            if (array_4[3 + ans][ib] == 0)
                                n = 21 + ib + (ans * 7);
                        }
                    }
                    ans++;
                }
                ans = 0;
            }
            // ななめ 左上から
            if (n == -1) {
                while (ans < 4) {
                    for (int ib = 0; ib < 4; ib++) {
                        sum01_4 = array_4[ans][ib] + array_4[1 + ans][1 + ib] + array_4[2 + ans][2 + ib] + array_4[3 + ans][3 + ib];

                        if (sum01_4 == -3 | sum01_4 == 3) {
                            if (array_4[0 + ans][ib] == 0)
                                n = 0 + ib + (ans * 7);
                            if (array_4[1 + ans][1 + ib] == 0)
                                n = 8 + ib + (ans * 7);
                            if (array_4[2 + ans][2 + ib] == 0)
                                n = 16 + ib + (ans * 7);
                            if (array_4[3 + ans][3 + ib] == 0)
                                n = 24 + ib + (ans * 7);
                        }
                    }
                    ans++;
                }
                ans = 0;
            }
            // ななめ 右上から
            if (n == -1) {
                while (ans < 4) {
                    for (int ib = 0; ib < 4; ib++) {
                        sum01_4 = array_4[ans][3 + ib] + array_4[1 + ans][2 + ib] + array_4[2 + ans][1 + ib] + array_4[3 + ans][0 + ib];

                        if (sum01_4 == -3 | sum01_4 == 3) {
                            if (array_4[ans][3 + ib] == 0)
                                n = 3 + ib + (ans * 7);
                            if (array_4[1 + ans][2 + ib] == 0)
                                n = 9 + ib + (ans * 7);
                            if (array_4[2 + ans][1 + ib] == 0)
                                n = 15 + ib + (ans * 7);
                            if (array_4[3 + ans][0 + ib] == 0)
                                n = 21 + ib + (ans * 7);
                        }
                    }
                    ans++;
                }
                ans = 0;
            }

            // イーシャンテンの処理
            // よこ
            if (n == -1) {
                while (ans < 4) {
                    for (int ib = 0; ib < 7; ib++) {
                        sum01_4 = array_4[ib][ans] + array_4[ib][1 + ans] + array_4[ib][2 + ans] + array_4[ib][3 + ans];
                        if (sum01_4 == -2 | sum01_4 == 2) {
                            if (array_4[ib][ans] == 0)
                                n = 0 + ans + (ib * 7);
                            if (array_4[ib][1 + ans] == 0)
                                n = 1 + ans + (ib * 7);
                            if (array_4[ib][2 + ans] == 0)
                                n = 2 + ans + (ib * 7);
                        }
                    }
                    ans++;
                }
                ans = 0;
            }
            // たて
            if (n == -1) {
                while (ans < 4) {
                    for (int ib = 0; ib < 7; ib++) {
                        sum01_4 = array_4[ans][ib] + array_4[1 + ans][ib] + array_4[2 + ans][ib] + array_4[3 + ans][ib];
                        if (sum01_4 == -2 | sum01_4 == 2) {
                            if (array_4[ans][ib] == 0)
                                n = 0 + ib + (ans * 7);
                            if (array_4[1 + ans][ib] == 0)
                                n = 7 + ib + (ans * 7);
                            if (array_4[2 + ans][ib] == 0)
                                n = 14 + ib + (ans * 7);
                        }
                    }
                    ans++;
                }
                ans = 0;
            }
            // ななめ 左上から
            if (n == -1) {
                while (ans < 4) {
                    for (int ib = 0; ib < 4; ib++) {
                        sum01_4 = array_4[ans][ib] + array_4[1 + ans][1 + ib] + array_4[2 + ans][2 + ib] + array_4[3 + ans][3 + ib];
                        if (sum01_4 == -2 | sum01_4 == 2) {
                            if (array_4[0 + ans][ib] == 0)
                                n = 0 + ib + (ans * 7);
                            if (array_4[1 + ans][1 + ib] == 0)
                                n = 8 + ib + (ans * 7);
                            if (array_4[2 + ans][2 + ib] == 0)
                                n = 16 + ib + (ans * 7);
                        }
                    }
                    ans++;
                }
                ans = 0;
            }
            // ななめ 右上から
            if (n == -1) {
                while (ans < 4) {
                    for (int ib = 0; ib < 4; ib++) {
                        sum01_4 = array_4[ans][3 + ib] + array_4[1 + ans][2 + ib] + array_4[2 + ans][1 + ib] + array_4[3 + ans][0 + ib];
                        if (sum01_4 == -2 | sum01_4 == 2) {
                            if (array_4[ans][3 + ib] == 0)
                                n = 3 + ib + (ans * 7);
                            if (array_4[1 + ans][2 + ib] == 0)
                                n = 9 + ib + (ans * 7);
                            if (array_4[2 + ans][1 + ib] == 0)
                                n = 15 + ib + (ans * 7);
                        }
                    }
                    ans++;
                }
                ans = 0;
            }

            // 二手目の考慮など
            // よこ
            if (n == -1) {
                while (ans < 4) {
                    for (int ib = 0; ib < 7; ib++) {
                        sum01_4 = array_4[ib][ans] + array_4[ib][1 + ans];

                        if (sum01_4 == 1) {
                            if (array_4[ib][ans] == 0)
                                n = 0 + ans + (ib * 7);
                            if (array_4[ib][1 + ans] == 0)
                                n = 1 + ans + (ib * 7);
                        }
                    }
                    ans++;
                }
                ans = 0;
            }
            // たて
            if (n == -1) {
                while (ans < 4) {
                    for (int ib = 0; ib < 7; ib++) {
                        sum01_4 = array_4[ans][ib] + array_4[1 + ans][ib];

                        if (sum01_4 == 1) {
                            if (array_4[ans][ib] == 0)
                                n = 0 + ib + (ans * 7);
                            if (array_4[1 + ans][ib] == 0)
                                n = 7 + ib + (ans * 7);
                        }
                    }
                    ans++;
                }
                ans = 0;
            }
            // ななめ 左上から
            if (n == -1) {
                while (ans < 4) {
                    for (int ib = 0; ib < 4; ib++) {
                        sum01_4 = array_4[ans][ib] + array_4[1 + ans][1 + ib];
                        if (sum01_4 == 1) {
                            if (array_4[0 + ans][ib] == 0)
                                n = 0 + ib + (ans * 7);
                            if (array_4[1 + ans][1 + ib] == 0)
                                n = 8 + ib + (ans * 7);
                        }
                    }
                    ans++;
                }
                ans = 0;
            }
            // ななめ 右上から
            if (n == -1) {
                while (ans < 4) {
                    for (int ib = 0; ib < 4; ib++) {
                        sum01_4 = array_4[ans][3 + ib] + array_4[1 + ans][2 + ib];
                        if (sum01_4 == -2) {
                            if (array_4[ans][3 + ib] == 0)
                                n = 3 + ib + (ans * 7);
                            if (array_4[1 + ans][2 + ib] == 0)
                                n = 9 + ib + (ans * 7);
                        }
                    }
                    ans++;
                }
                ans = 0;
            }

            // 候補がない場合はランダムで手を打つ
            if (n == -1) {
                Random r = new Random();
                n = r.nextInt(48);
            }

            while (n > -1) {
                switch (n) {
                    case 0:
                        if (array_4[0][0] == 0) {
                            array_4[0][0] = 1;
                            button01.startAnimation(animation_set);
                            button01.setBackgroundResource(R.drawable.star_white);
                            n = -1;
                        }
                        break;

                    case 1:
                        if (array_4[0][1] == 0) {
                            array_4[0][1] = 1;
                            button02.startAnimation(animation_set);
                            button02.setBackgroundResource(R.drawable.star_white);
                            n = -1;
                        }
                        break;

                    case 2:
                        if (array_4[0][2] == 0) {
                            array_4[0][2] = 1;
                            button03.startAnimation(animation_set);
                            button03.setBackgroundResource(R.drawable.star_white);
                            n = -1;
                        }
                        break;

                    case 3:
                        if (array_4[0][3] == 0) {
                            array_4[0][3] = 1;
                            button04.startAnimation(animation_set);
                            button04.setBackgroundResource(R.drawable.star_white);
                            n = -1;
                        }
                        break;

                    case 4:
                        if (array_4[0][4] == 0) {
                            array_4[0][4] = 1;
                            button05.startAnimation(animation_set);
                            button05.setBackgroundResource(R.drawable.star_white);
                            n = -1;
                        }
                        break;

                    case 5:
                        if (array_4[0][5] == 0) {
                            array_4[0][5] = 1;
                            button06.startAnimation(animation_set);
                            button06.setBackgroundResource(R.drawable.star_white);
                            n = -1;
                        }
                        break;

                    case 6:
                        if (array_4[0][6] == 0) {
                            array_4[0][6] = 1;
                            button07.startAnimation(animation_set);
                            button07.setBackgroundResource(R.drawable.star_white);
                            n = -1;
                        }
                        break;

                    case 7:
                        if (array_4[1][0] == 0) {
                            array_4[1][0] = 1;
                            button08.startAnimation(animation_set);
                            button08.setBackgroundResource(R.drawable.star_white);
                            n = -1;
                        }
                        break;

                    case 8:
                        if (array_4[1][1] == 0) {
                            array_4[1][1] = 1;
                            button09.startAnimation(animation_set);
                            button09.setBackgroundResource(R.drawable.star_white);
                            n = -1;
                        }
                        break;

                    case 9:
                        if (array_4[1][2] == 0) {
                            array_4[1][2] = 1;
                            button10.startAnimation(animation_set);
                            button10.setBackgroundResource(R.drawable.star_white);
                            n = -1;
                        }
                        break;

                    case 10:
                        if (array_4[1][3] == 0) {
                            array_4[1][3] = 1;
                            button11.startAnimation(animation_set);
                            button11.setBackgroundResource(R.drawable.star_white);
                            n = -1;
                        }
                        break;

                    case 11:
                        if (array_4[1][4] == 0) {
                            array_4[1][4] = 1;
                            button12.startAnimation(animation_set);
                            button12.setBackgroundResource(R.drawable.star_white);
                            n = -1;
                        }
                        break;

                    case 12:
                        if (array_4[1][5] == 0) {
                            array_4[1][5] = 1;
                            button13.startAnimation(animation_set);
                            button13.setBackgroundResource(R.drawable.star_white);
                            n = -1;
                        }
                        break;

                    case 13:
                        if (array_4[1][6] == 0) {
                            array_4[1][6] = 1;
                            button14.startAnimation(animation_set);
                            button14.setBackgroundResource(R.drawable.star_white);
                            n = -1;
                        }
                        break;

                    case 14:
                        if (array_4[2][0] == 0) {
                            array_4[2][0] = 1;
                            button15.startAnimation(animation_set);
                            button15.setBackgroundResource(R.drawable.star_white);
                            n = -1;
                        }
                        break;

                    case 15:
                        if (array_4[2][1] == 0) {
                            array_4[2][1] = 1;
                            button16.startAnimation(animation_set);
                            button16.setBackgroundResource(R.drawable.star_white);
                            n = -1;
                        }
                        break;

                    case 16:
                        if (array_4[2][2] == 0) {
                            array_4[2][2] = 1;
                            button17.startAnimation(animation_set);
                            button17.setBackgroundResource(R.drawable.star_white);
                            n = -1;
                        }
                        break;

                    case 17:
                        if (array_4[2][3] == 0) {
                            array_4[2][3] = 1;
                            button18.startAnimation(animation_set);
                            button18.setBackgroundResource(R.drawable.star_white);
                            n = -1;
                        }
                        break;

                    case 18:
                        if (array_4[2][4] == 0) {
                            array_4[2][4] = 1;
                            button19.startAnimation(animation_set);
                            button19.setBackgroundResource(R.drawable.star_white);
                            n = -1;
                        }
                        break;

                    case 19:
                        if (array_4[2][5] == 0) {
                            array_4[2][5] = 1;
                            button20.startAnimation(animation_set);
                            button20.setBackgroundResource(R.drawable.star_white);
                            n = -1;
                        }
                        break;

                    case 20:
                        if (array_4[2][6] == 0) {
                            array_4[2][6] = 1;
                            button21.startAnimation(animation_set);
                            button21.setBackgroundResource(R.drawable.star_white);
                            n = -1;
                        }
                        break;

                    case 21:
                        if (array_4[3][0] == 0) {
                            array_4[3][0] = 1;
                            button22.startAnimation(animation_set);
                            button22.setBackgroundResource(R.drawable.star_white);
                            n = -1;
                        }
                        break;

                    case 22:
                        if (array_4[3][1] == 0) {
                            array_4[3][1] = 1;
                            button23.startAnimation(animation_set);
                            button23.setBackgroundResource(R.drawable.star_white);
                            n = -1;
                        }
                        break;

                    case 23:
                        if (array_4[3][2] == 0) {
                            array_4[3][2] = 1;
                            button24.startAnimation(animation_set);
                            button24.setBackgroundResource(R.drawable.star_white);
                            n = -1;
                        }
                        break;

                    case 24:
                        if (array_4[3][3] == 0) {
                            array_4[3][3] = 1;
                            button25.startAnimation(animation_set);
                            button25.setBackgroundResource(R.drawable.star_white);
                            n = -1;
                        }
                        break;

                    case 25:
                        if (array_4[3][4] == 0) {
                            array_4[3][4] = 1;
                            button26.startAnimation(animation_set);
                            button26.setBackgroundResource(R.drawable.star_white);
                            n = -1;
                        }
                        break;

                    case 26:
                        if (array_4[3][5] == 0) {
                            array_4[3][5] = 1;
                            button27.startAnimation(animation_set);
                            button27.setBackgroundResource(R.drawable.star_white);
                            n = -1;
                        }
                        break;

                    case 27:
                        if (array_4[3][6] == 0) {
                            array_4[3][6] = 1;
                            button28.startAnimation(animation_set);
                            button28.setBackgroundResource(R.drawable.star_white);
                            n = -1;
                        }
                        break;

                    case 28:
                        if (array_4[4][0] == 0) {
                            array_4[4][0] = 1;
                            button29.startAnimation(animation_set);
                            button29.setBackgroundResource(R.drawable.star_white);
                            n = -1;
                        }
                        break;

                    case 29:
                        if (array_4[4][1] == 0) {
                            array_4[4][1] = 1;
                            button30.startAnimation(animation_set);
                            button30.setBackgroundResource(R.drawable.star_white);
                            n = -1;
                        }
                        break;

                    case 30:
                        if (array_4[4][2] == 0) {
                            array_4[4][2] = 1;
                            button31.startAnimation(animation_set);
                            button31.setBackgroundResource(R.drawable.star_white);
                            n = -1;
                        }
                        break;

                    case 31:
                        if (array_4[4][3] == 0) {
                            array_4[4][3] = 1;
                            button32.startAnimation(animation_set);
                            button32.setBackgroundResource(R.drawable.star_white);
                            n = -1;
                        }
                        break;

                    case 32:
                        if (array_4[4][4] == 0) {
                            array_4[4][4] = 1;
                            button33.startAnimation(animation_set);
                            button33.setBackgroundResource(R.drawable.star_white);
                            n = -1;
                        }
                        break;

                    case 33:
                        if (array_4[4][5] == 0) {
                            array_4[4][5] = 1;
                            button34.startAnimation(animation_set);
                            button34.setBackgroundResource(R.drawable.star_white);
                            n = -1;
                        }
                        break;

                    case 34:
                        if (array_4[4][6] == 0) {
                            array_4[4][6] = 1;
                            button35.startAnimation(animation_set);
                            button35.setBackgroundResource(R.drawable.star_white);
                            n = -1;
                        }
                        break;

                    case 35:
                        if (array_4[5][0] == 0) {
                            array_4[5][0] = 1;
                            button36.startAnimation(animation_set);
                            button36.setBackgroundResource(R.drawable.star_white);
                            n = -1;
                        }
                        break;

                    case 36:
                        if (array_4[5][1] == 0) {
                            array_4[5][1] = 1;
                            button37.startAnimation(animation_set);
                            button37.setBackgroundResource(R.drawable.star_white);
                            n = -1;
                        }
                        break;

                    case 37:
                        if (array_4[5][2] == 0) {
                            array_4[5][2] = 1;
                            button38.startAnimation(animation_set);
                            button38.setBackgroundResource(R.drawable.star_white);
                            n = -1;
                        }
                        break;

                    case 38:
                        if (array_4[5][3] == 0) {
                            array_4[5][3] = 1;
                            button39.startAnimation(animation_set);
                            button39.setBackgroundResource(R.drawable.star_white);
                            n = -1;
                        }
                        break;

                    case 39:
                        if (array_4[5][4] == 0) {
                            array_4[5][4] = 1;
                            button40.startAnimation(animation_set);
                            button40.setBackgroundResource(R.drawable.star_white);
                            n = -1;
                        }
                        break;

                    case 40:
                        if (array_4[5][5] == 0) {
                            array_4[5][5] = 1;
                            button41.startAnimation(animation_set);
                            button41.setBackgroundResource(R.drawable.star_white);
                            n = -1;
                        }
                        break;

                    case 41:
                        if (array_4[5][6] == 0) {
                            array_4[5][6] = 1;
                            button42.startAnimation(animation_set);
                            button42.setBackgroundResource(R.drawable.star_white);
                            n = -1;
                        }
                        break;

                    case 42:
                        if (array_4[6][0] == 0) {
                            array_4[6][0] = 1;
                            button43.startAnimation(animation_set);
                            button43.setBackgroundResource(R.drawable.star_white);
                            n = -1;
                        }
                        break;

                    case 43:
                        if (array_4[6][1] == 0) {
                            array_4[6][1] = 1;
                            button44.startAnimation(animation_set);
                            button44.setBackgroundResource(R.drawable.star_white);
                            n = -1;
                        }
                        break;

                    case 44:
                        if (array_4[6][2] == 0) {
                            array_4[6][2] = 1;
                            button45.startAnimation(animation_set);
                            button45.setBackgroundResource(R.drawable.star_white);
                            n = -1;
                        }
                        break;

                    case 45:
                        if (array_4[6][3] == 0) {
                            array_4[6][3] = 1;
                            button46.startAnimation(animation_set);
                            button46.setBackgroundResource(R.drawable.star_white);
                            n = -1;
                        }
                        break;

                    case 46:
                        if (array_4[6][4] == 0) {
                            array_4[6][4] = 1;
                            button47.startAnimation(animation_set);
                            button47.setBackgroundResource(R.drawable.star_white);
                            n = -1;
                        }
                        break;

                    case 47:
                        if (array_4[6][5] == 0) {
                            array_4[6][5] = 1;
                            button48.startAnimation(animation_set);
                            button48.setBackgroundResource(R.drawable.star_white);
                            n = -1;
                        }
                        break;

                    case 48:
                        if (array_4[6][6] == 0) {
                            array_4[6][6] = 1;
                            button49.startAnimation(animation_set);
                            button49.setBackgroundResource(R.drawable.star_white);
                            n = -1;
                        }
                        break;


                    default:
                        array_4[0][0] = 0;
                        button01.setBackgroundResource(R.drawable.star_white);
                        n = -1;
                        break;
                }

                if (n > -1) {
                    //ランダムで array_4 が 0 の場所に 1 を代入する
                    Random r = new Random();
                    n = r.nextInt(48);
                }
            }

            flag_sum_4 = 0;
        }
    }

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
            Intent intent = new Intent(getApplication(), SubActivity.class);
            startActivity(intent);
            //効果音
            soundPool.play(cowbell_808_wm, 1.0f, 1.0f, 0, 0, 1f);
        }

        if (id == R.id.action_3) {
            Intent intent = new Intent(getApplication(), MainActivity.class);
            startActivity(intent);
            //効果音
            soundPool.play(cowbell_808_wm, 1.0f, 1.0f, 0, 0, 1f);
        }

        if (id == R.id.action_4) {
            Intent intent = new Intent(getApplication(), SubActivity4.class);
            startActivity(intent);

            final Button button01 = (Button) this.findViewById(R.id.button01);
            final Button button02 = (Button) this.findViewById(R.id.button02);
            final Button button03 = (Button) this.findViewById(R.id.button03);
            final Button button04 = (Button) this.findViewById(R.id.button04);
            final Button button05 = (Button) this.findViewById(R.id.button05);
            final Button button06 = (Button) this.findViewById(R.id.button06);
            final Button button07 = (Button) this.findViewById(R.id.button07);
            final Button button08 = (Button) this.findViewById(R.id.button08);
            final Button button09 = (Button) this.findViewById(R.id.button09);
            final Button button10 = (Button) this.findViewById(R.id.button10);

            final Button button11 = (Button) this.findViewById(R.id.button11);
            final Button button12 = (Button) this.findViewById(R.id.button12);
            final Button button13 = (Button) this.findViewById(R.id.button13);
            final Button button14 = (Button) this.findViewById(R.id.button14);
            final Button button15 = (Button) this.findViewById(R.id.button15);
            final Button button16 = (Button) this.findViewById(R.id.button16);
            final Button button17 = (Button) this.findViewById(R.id.button17);
            final Button button18 = (Button) this.findViewById(R.id.button18);
            final Button button19 = (Button) this.findViewById(R.id.button19);

            final Button button20 = (Button) this.findViewById(R.id.button20);
            final Button button21 = (Button) this.findViewById(R.id.button21);
            final Button button22 = (Button) this.findViewById(R.id.button22);
            final Button button23 = (Button) this.findViewById(R.id.button23);
            final Button button24 = (Button) this.findViewById(R.id.button24);
            final Button button25 = (Button) this.findViewById(R.id.button25);
            final Button button26 = (Button) this.findViewById(R.id.button26);
            final Button button27 = (Button) this.findViewById(R.id.button27);
            final Button button28 = (Button) this.findViewById(R.id.button28);
            final Button button29 = (Button) this.findViewById(R.id.button29);
            final Button button30 = (Button) this.findViewById(R.id.button30);

            final Button button31 = (Button) this.findViewById(R.id.button31);
            final Button button32 = (Button) this.findViewById(R.id.button32);
            final Button button33 = (Button) this.findViewById(R.id.button33);
            final Button button34 = (Button) this.findViewById(R.id.button34);
            final Button button35 = (Button) this.findViewById(R.id.button35);
            final Button button36 = (Button) this.findViewById(R.id.button36);
            final Button button37 = (Button) this.findViewById(R.id.button37);
            final Button button38 = (Button) this.findViewById(R.id.button38);
            final Button button39 = (Button) this.findViewById(R.id.button39);
            final Button button40 = (Button) this.findViewById(R.id.button40);

            final Button button41 = (Button) this.findViewById(R.id.button41);
            final Button button42 = (Button) this.findViewById(R.id.button42);
            final Button button43 = (Button) this.findViewById(R.id.button43);
            final Button button44 = (Button) this.findViewById(R.id.button44);
            final Button button45 = (Button) this.findViewById(R.id.button45);
            final Button button46 = (Button) this.findViewById(R.id.button46);
            final Button button47 = (Button) this.findViewById(R.id.button47);
            final Button button48 = (Button) this.findViewById(R.id.button48);
            final Button button49 = (Button) this.findViewById(R.id.button49);

            //効果音
            soundPool.play(cowbell_808_wm, 1.0f, 1.0f, 0, 0, 1f);

            //トースト表示
            Toast toast = Toast.makeText(activity, "! ! ! ! ! GAME START ! ! ! ! !", Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER | Gravity.CENTER, 0, 0);
            toast.show();

            //配列の初期化
            int n = 0;
            while (n < 7) {
                for (int i = 0; i < 7; i++) {
                    array_4[n][i] = 0;
                }
                n++;
            }

            //勝敗判定の初期化
            sum01_4 = 0;
            sum02_4 = 0;
            sum03_4 = 0;
            sum04_4 = 0;
            sum05_4 = 0;
            sum06_4 = 0;
            sum07_4 = 0;
            sum08_4 = 0;
            sum09_4 = 0;
            sum10_4 = 0;

            flag_sum_4 = 0;

            num1 = 0;
            num2 = 0;

            num_4_1 = -1;

            //ボタンの初期化
            button01.setBackgroundColor(Color.rgb(000, 000, 000));
            button02.setBackgroundColor(Color.rgb(000, 000, 000));
            button03.setBackgroundColor(Color.rgb(000, 000, 000));
            button04.setBackgroundColor(Color.rgb(000, 000, 000));
            button05.setBackgroundColor(Color.rgb(000, 000, 000));
            button06.setBackgroundColor(Color.rgb(000, 000, 000));
            button07.setBackgroundColor(Color.rgb(000, 000, 000));
            button08.setBackgroundColor(Color.rgb(000, 000, 000));
            button09.setBackgroundColor(Color.rgb(000, 000, 000));
            button10.setBackgroundColor(Color.rgb(000, 000, 000));

            button11.setBackgroundColor(Color.rgb(000, 000, 000));
            button12.setBackgroundColor(Color.rgb(000, 000, 000));
            button13.setBackgroundColor(Color.rgb(000, 000, 000));
            button14.setBackgroundColor(Color.rgb(000, 000, 000));
            button15.setBackgroundColor(Color.rgb(000, 000, 000));
            button16.setBackgroundColor(Color.rgb(000, 000, 000));
            button17.setBackgroundColor(Color.rgb(000, 000, 000));
            button18.setBackgroundColor(Color.rgb(000, 000, 000));
            button19.setBackgroundColor(Color.rgb(000, 000, 000));
            button20.setBackgroundColor(Color.rgb(000, 000, 000));

            button21.setBackgroundColor(Color.rgb(000, 000, 000));
            button22.setBackgroundColor(Color.rgb(000, 000, 000));
            button23.setBackgroundColor(Color.rgb(000, 000, 000));
            button24.setBackgroundColor(Color.rgb(000, 000, 000));
            button25.setBackgroundColor(Color.rgb(000, 000, 000));
            button26.setBackgroundColor(Color.rgb(000, 000, 000));
            button27.setBackgroundColor(Color.rgb(000, 000, 000));
            button28.setBackgroundColor(Color.rgb(000, 000, 000));
            button29.setBackgroundColor(Color.rgb(000, 000, 000));
            button30.setBackgroundColor(Color.rgb(000, 000, 000));

            button31.setBackgroundColor(Color.rgb(000, 000, 000));
            button32.setBackgroundColor(Color.rgb(000, 000, 000));
            button33.setBackgroundColor(Color.rgb(000, 000, 000));
            button34.setBackgroundColor(Color.rgb(000, 000, 000));
            button35.setBackgroundColor(Color.rgb(000, 000, 000));
            button36.setBackgroundColor(Color.rgb(000, 000, 000));
            button37.setBackgroundColor(Color.rgb(000, 000, 000));
            button38.setBackgroundColor(Color.rgb(000, 000, 000));
            button39.setBackgroundColor(Color.rgb(000, 000, 000));
            button40.setBackgroundColor(Color.rgb(000, 000, 000));

            button41.setBackgroundColor(Color.rgb(000, 000, 000));
            button42.setBackgroundColor(Color.rgb(000, 000, 000));
            button43.setBackgroundColor(Color.rgb(000, 000, 000));
            button44.setBackgroundColor(Color.rgb(000, 000, 000));
            button45.setBackgroundColor(Color.rgb(000, 000, 000));
            button46.setBackgroundColor(Color.rgb(000, 000, 000));
            button47.setBackgroundColor(Color.rgb(000, 000, 000));
            button48.setBackgroundColor(Color.rgb(000, 000, 000));
            button49.setBackgroundColor(Color.rgb(000, 000, 000));

            //ゲーム開始
            flag_end = 0;
            cp_play_4 = 0;
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
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub4);

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

        final Button button01 = (Button) this.findViewById(R.id.button01);
        final Button button02 = (Button) this.findViewById(R.id.button02);
        final Button button03 = (Button) this.findViewById(R.id.button03);
        final Button button04 = (Button) this.findViewById(R.id.button04);
        final Button button05 = (Button) this.findViewById(R.id.button05);
        final Button button06 = (Button) this.findViewById(R.id.button06);
        final Button button07 = (Button) this.findViewById(R.id.button07);
        final Button button08 = (Button) this.findViewById(R.id.button08);
        final Button button09 = (Button) this.findViewById(R.id.button09);
        final Button button10 = (Button) this.findViewById(R.id.button10);

        final Button button11 = (Button) this.findViewById(R.id.button11);
        final Button button12 = (Button) this.findViewById(R.id.button12);
        final Button button13 = (Button) this.findViewById(R.id.button13);
        final Button button14 = (Button) this.findViewById(R.id.button14);
        final Button button15 = (Button) this.findViewById(R.id.button15);
        final Button button16 = (Button) this.findViewById(R.id.button16);
        final Button button17 = (Button) this.findViewById(R.id.button17);
        final Button button18 = (Button) this.findViewById(R.id.button18);
        final Button button19 = (Button) this.findViewById(R.id.button19);

        final Button button20 = (Button) this.findViewById(R.id.button20);
        final Button button21 = (Button) this.findViewById(R.id.button21);
        final Button button22 = (Button) this.findViewById(R.id.button22);
        final Button button23 = (Button) this.findViewById(R.id.button23);
        final Button button24 = (Button) this.findViewById(R.id.button24);
        final Button button25 = (Button) this.findViewById(R.id.button25);
        final Button button26 = (Button) this.findViewById(R.id.button26);
        final Button button27 = (Button) this.findViewById(R.id.button27);
        final Button button28 = (Button) this.findViewById(R.id.button28);
        final Button button29 = (Button) this.findViewById(R.id.button29);
        final Button button30 = (Button) this.findViewById(R.id.button30);

        final Button button31 = (Button) this.findViewById(R.id.button31);
        final Button button32 = (Button) this.findViewById(R.id.button32);
        final Button button33 = (Button) this.findViewById(R.id.button33);
        final Button button34 = (Button) this.findViewById(R.id.button34);
        final Button button35 = (Button) this.findViewById(R.id.button35);
        final Button button36 = (Button) this.findViewById(R.id.button36);
        final Button button37 = (Button) this.findViewById(R.id.button37);
        final Button button38 = (Button) this.findViewById(R.id.button38);
        final Button button39 = (Button) this.findViewById(R.id.button39);
        final Button button40 = (Button) this.findViewById(R.id.button40);

        final Button button41 = (Button) this.findViewById(R.id.button41);
        final Button button42 = (Button) this.findViewById(R.id.button42);
        final Button button43 = (Button) this.findViewById(R.id.button43);
        final Button button44 = (Button) this.findViewById(R.id.button44);
        final Button button45 = (Button) this.findViewById(R.id.button45);
        final Button button46 = (Button) this.findViewById(R.id.button46);
        final Button button47 = (Button) this.findViewById(R.id.button47);
        final Button button48 = (Button) this.findViewById(R.id.button48);
        final Button button49 = (Button) this.findViewById(R.id.button49);

        soundPool.play(clap_funk_5, 1.0f, 1.0f, 0, 0, 1f);

        // コンピューター初手
        ComputerPlay_4();
        //array_4[3][3] = 1;

        // アニメーション設定
        final RotateAnimation buttonRotation = new RotateAnimation(360.0f, 0.0f,
                Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
        buttonRotation.setDuration(500);

        // 1行め
        button01.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (flag_end == 0) {
                    if (array_4[0][0] == 0) {
                        array_4[0][0] = -1;
                        button01.setBackgroundResource(R.drawable.star_red);
                        soundPool.play(clap_funk_5, 1.0f, 1.0f, 0, 0, 1f);

                        button01.startAnimation(buttonRotation);
                        Judgment();

                        ComputerPlay_4();
                        Judgment();
                    }
                }
            }
        });

        button02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flag_end == 0) {
                    if (array_4[0][1] == 0) {
                        array_4[0][1] = -1;
                        button02.setBackgroundResource(R.drawable.star_red);
                        soundPool.play(clap_funk_5, 1.0f, 1.0f, 0, 0, 1f);

                        button02.startAnimation(buttonRotation);
                        Judgment();

                        ComputerPlay_4();
                        Judgment();
                    }
                }
            }
        });

        button03.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick(View v) {
                if (flag_end == 0) {
                    if (array_4[0][2] == 0) {
                        array_4[0][2] = -1;
                        button03.setBackgroundResource(R.drawable.star_red);
                        soundPool.play(clap_funk_5, 1.0f, 1.0f, 0, 0, 1f);

                        button03.startAnimation(buttonRotation);
                        Judgment();

                        ComputerPlay_4();
                        Judgment();
                    }
                }
            }
        });

        button04.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flag_end == 0) {
                    if (array_4[0][3] == 0) {
                        array_4[0][3] = -1;
                        button04.setBackgroundResource(R.drawable.star_red);
                        soundPool.play(clap_funk_5, 1.0f, 1.0f, 0, 0, 1f);

                        button04.startAnimation(buttonRotation);
                        Judgment();

                        ComputerPlay_4();
                        Judgment();
                    }
                }
            }
        });

        button05.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flag_end == 0) {
                    if (array_4[0][4] == 0) {
                        array_4[0][4] = -1;
                        button05.setBackgroundResource(R.drawable.star_red);
                        soundPool.play(clap_funk_5, 1.0f, 1.0f, 0, 0, 1f);

                        button05.startAnimation(buttonRotation);
                        Judgment();

                        ComputerPlay_4();
                        Judgment();
                    }
                }
            }
        });

        button06.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flag_end == 0) {
                    if (array_4[0][5] == 0) {
                        array_4[0][5] = -1;
                        button06.setBackgroundResource(R.drawable.star_red);
                        soundPool.play(clap_funk_5, 1.0f, 1.0f, 0, 0, 1f);

                        button06.startAnimation(buttonRotation);
                        Judgment();

                        ComputerPlay_4();
                        Judgment();
                    }
                }
            }
        });

        button07.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flag_end == 0) {
                    if (array_4[0][6] == 0) {
                        array_4[0][6] = -1;
                        button07.setBackgroundResource(R.drawable.star_red);
                        soundPool.play(clap_funk_5, 1.0f, 1.0f, 0, 0, 1f);

                        button07.startAnimation(buttonRotation);
                        Judgment();

                        ComputerPlay_4();
                        Judgment();
                    }
                }
            }
        });

        // 2行め
        button08.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flag_end == 0) {
                    if (array_4[1][0] == 0) {
                        array_4[1][0] = -1;
                        button08.setBackgroundResource(R.drawable.star_red);
                        soundPool.play(clap_funk_5, 1.0f, 1.0f, 0, 0, 1f);

                        button08.startAnimation(buttonRotation);
                        Judgment();

                        ComputerPlay_4();
                        Judgment();
                    }
                }
            }
        });

        button09.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flag_end == 0) {
                    if (array_4[1][1] == 0) {
                        array_4[1][1] = -1;
                        button09.setBackgroundResource(R.drawable.star_red);
                        soundPool.play(clap_funk_5, 1.0f, 1.0f, 0, 0, 1f);

                        button09.startAnimation(buttonRotation);
                        Judgment();

                        ComputerPlay_4();
                        Judgment();
                    }
                }
            }
        });

        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flag_end == 0) {
                    if (array_4[1][2] == 0) {
                        array_4[1][2] = -1;
                        button10.setBackgroundResource(R.drawable.star_red);
                        soundPool.play(clap_funk_5, 1.0f, 1.0f, 0, 0, 1f);

                        button10.startAnimation(buttonRotation);
                        Judgment();

                        ComputerPlay_4();
                        Judgment();
                    }
                }
            }
        });

        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flag_end == 0) {
                    if (array_4[1][3] == 0) {
                        array_4[1][3] = -1;
                        button11.setBackgroundResource(R.drawable.star_red);
                        soundPool.play(clap_funk_5, 1.0f, 1.0f, 0, 0, 1f);

                        button11.startAnimation(buttonRotation);
                        Judgment();

                        ComputerPlay_4();
                        Judgment();
                    }
                }
            }
        });

        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flag_end == 0) {
                    if (array_4[1][4] == 0) {
                        array_4[1][4] = -1;
                        button12.setBackgroundResource(R.drawable.star_red);
                        soundPool.play(clap_funk_5, 1.0f, 1.0f, 0, 0, 1f);

                        button12.startAnimation(buttonRotation);
                        Judgment();

                        ComputerPlay_4();
                        Judgment();
                    }
                }
            }
        });

        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flag_end == 0) {
                    if (array_4[1][5] == 0) {
                        array_4[1][5] = -1;
                        button13.setBackgroundResource(R.drawable.star_red);
                        soundPool.play(clap_funk_5, 1.0f, 1.0f, 0, 0, 1f);

                        button13.startAnimation(buttonRotation);
                        Judgment();

                        ComputerPlay_4();
                        Judgment();
                    }
                }
            }
        });

        button14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flag_end == 0) {
                    if (array_4[1][6] == 0) {
                        array_4[1][6] = -1;
                        button14.setBackgroundResource(R.drawable.star_red);
                        soundPool.play(clap_funk_5, 1.0f, 1.0f, 0, 0, 1f);

                        button14.startAnimation(buttonRotation);
                        Judgment();

                        ComputerPlay_4();
                        Judgment();
                    }
                }
            }
        });

        // 3行め
        button15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flag_end == 0) {
                    if (array_4[2][0] == 0) {
                        array_4[2][0] = -1;
                        button15.setBackgroundResource(R.drawable.star_red);
                        soundPool.play(clap_funk_5, 1.0f, 1.0f, 0, 0, 1f);

                        button15.startAnimation(buttonRotation);
                        Judgment();

                        ComputerPlay_4();
                        Judgment();
                    }
                }
            }
        });

        button16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flag_end == 0) {
                    if (array_4[2][1] == 0) {
                        array_4[2][1] = -1;
                        button16.setBackgroundResource(R.drawable.star_red);
                        soundPool.play(clap_funk_5, 1.0f, 1.0f, 0, 0, 1f);

                        button16.startAnimation(buttonRotation);
                        Judgment();

                        ComputerPlay_4();
                        Judgment();
                    }
                }
            }
        });

        button17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flag_end == 0) {
                    if (array_4[2][2] == 0) {
                        array_4[2][2] = -1;
                        button17.setBackgroundResource(R.drawable.star_red);
                        soundPool.play(clap_funk_5, 1.0f, 1.0f, 0, 0, 1f);

                        button17.startAnimation(buttonRotation);
                        Judgment();

                        ComputerPlay_4();
                        Judgment();
                    }
                }
            }
        });

        button18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flag_end == 0) {
                    if (array_4[2][3] == 0) {
                        array_4[2][3] = -1;
                        button18.setBackgroundResource(R.drawable.star_red);
                        soundPool.play(clap_funk_5, 1.0f, 1.0f, 0, 0, 1f);

                        button18.startAnimation(buttonRotation);
                        Judgment();

                        ComputerPlay_4();
                        Judgment();
                    }
                }
            }
        });

        button19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flag_end == 0) {
                    if (array_4[2][4] == 0) {
                        array_4[2][4] = -1;
                        button19.setBackgroundResource(R.drawable.star_red);
                        soundPool.play(clap_funk_5, 1.0f, 1.0f, 0, 0, 1f);

                        button19.startAnimation(buttonRotation);
                        Judgment();

                        ComputerPlay_4();
                        Judgment();
                    }
                }
            }
        });

        button20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flag_end == 0) {
                    if (array_4[2][5] == 0) {
                        array_4[2][5] = -1;
                        button20.setBackgroundResource(R.drawable.star_red);
                        soundPool.play(clap_funk_5, 1.0f, 1.0f, 0, 0, 1f);

                        button20.startAnimation(buttonRotation);
                        Judgment();

                        ComputerPlay_4();
                        Judgment();
                    }
                }
            }
        });

        button21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flag_end == 0) {
                    if (array_4[2][6] == 0) {
                        array_4[2][6] = -1;
                        button21.setBackgroundResource(R.drawable.star_red);
                        soundPool.play(clap_funk_5, 1.0f, 1.0f, 0, 0, 1f);

                        button21.startAnimation(buttonRotation);
                        Judgment();

                        ComputerPlay_4();
                        Judgment();
                    }
                }
            }
        });

        // 4行め
        button22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flag_end == 0) {
                    if (array_4[3][0] == 0) {
                        array_4[3][0] = -1;
                        button22.setBackgroundResource(R.drawable.star_red);
                        soundPool.play(clap_funk_5, 1.0f, 1.0f, 0, 0, 1f);

                        button22.startAnimation(buttonRotation);
                        Judgment();

                        ComputerPlay_4();
                        Judgment();
                    }
                }
            }
        });

        button23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flag_end == 0) {
                    if (array_4[3][1] == 0) {
                        array_4[3][1] = -1;
                        button23.setBackgroundResource(R.drawable.star_red);
                        soundPool.play(clap_funk_5, 1.0f, 1.0f, 0, 0, 1f);

                        button23.startAnimation(buttonRotation);
                        Judgment();

                        ComputerPlay_4();
                        Judgment();
                    }
                }
            }
        });

        button24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flag_end == 0) {
                    if (array_4[3][2] == 0) {
                        array_4[3][2] = -1;
                        button24.setBackgroundResource(R.drawable.star_red);
                        soundPool.play(clap_funk_5, 1.0f, 1.0f, 0, 0, 1f);

                        button24.startAnimation(buttonRotation);
                        Judgment();

                        ComputerPlay_4();
                        Judgment();
                    }
                }
            }
        });

        button25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flag_end == 0) {
                    if (array_4[3][3] == 0) {
                        array_4[3][3] = -1;
                        button25.setBackgroundResource(R.drawable.star_red);
                        soundPool.play(clap_funk_5, 1.0f, 1.0f, 0, 0, 1f);

                        button25.startAnimation(buttonRotation);
                        Judgment();

                        ComputerPlay_4();
                        Judgment();
                    }
                }
            }
        });

        button26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flag_end == 0) {
                    if (array_4[3][4] == 0) {
                        array_4[3][4] = -1;
                        button26.setBackgroundResource(R.drawable.star_red);
                        soundPool.play(clap_funk_5, 1.0f, 1.0f, 0, 0, 1f);

                        button26.startAnimation(buttonRotation);
                        Judgment();

                        ComputerPlay_4();
                        Judgment();
                    }
                }
            }
        });

        button27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flag_end == 0) {
                    if (array_4[3][5] == 0) {
                        array_4[3][5] = -1;
                        button27.setBackgroundResource(R.drawable.star_red);
                        soundPool.play(clap_funk_5, 1.0f, 1.0f, 0, 0, 1f);

                        button27.startAnimation(buttonRotation);
                        Judgment();

                        ComputerPlay_4();
                        Judgment();
                    }
                }
            }
        });

        button28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flag_end == 0) {
                    if (array_4[3][6] == 0) {
                        array_4[3][6] = -1;
                        button28.setBackgroundResource(R.drawable.star_red);
                        soundPool.play(clap_funk_5, 1.0f, 1.0f, 0, 0, 1f);

                        button28.startAnimation(buttonRotation);
                        Judgment();

                        ComputerPlay_4();
                        Judgment();
                    }
                }
            }
        });

        // 5行め
        button29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flag_end == 0) {
                    if (array_4[4][0] == 0) {
                        array_4[4][0] = -1;
                        button29.setBackgroundResource(R.drawable.star_red);
                        soundPool.play(clap_funk_5, 1.0f, 1.0f, 0, 0, 1f);

                        button29.startAnimation(buttonRotation);
                        Judgment();

                        ComputerPlay_4();
                        Judgment();
                    }
                }
            }
        });

        button30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flag_end == 0) {
                    if (array_4[4][1] == 0) {
                        array_4[4][1] = -1;
                        button30.setBackgroundResource(R.drawable.star_red);
                        soundPool.play(clap_funk_5, 1.0f, 1.0f, 0, 0, 1f);

                        button30.startAnimation(buttonRotation);
                        Judgment();

                        ComputerPlay_4();
                        Judgment();
                    }
                }
            }
        });

        button31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flag_end == 0) {
                    if (array_4[4][2] == 0) {
                        array_4[4][2] = -1;
                        button31.setBackgroundResource(R.drawable.star_red);
                        soundPool.play(clap_funk_5, 1.0f, 1.0f, 0, 0, 1f);

                        button31.startAnimation(buttonRotation);
                        Judgment();

                        ComputerPlay_4();
                        Judgment();
                    }
                }
            }
        });

        button32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flag_end == 0) {
                    if (array_4[4][3] == 0) {
                        array_4[4][3] = -1;
                        button32.setBackgroundResource(R.drawable.star_red);
                        soundPool.play(clap_funk_5, 1.0f, 1.0f, 0, 0, 1f);

                        button32.startAnimation(buttonRotation);
                        Judgment();

                        ComputerPlay_4();
                        Judgment();
                    }
                }
            }
        });

        button33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flag_end == 0) {
                    if (array_4[4][4] == 0) {
                        array_4[4][4] = -1;
                        button33.setBackgroundResource(R.drawable.star_red);
                        soundPool.play(clap_funk_5, 1.0f, 1.0f, 0, 0, 1f);

                        button33.startAnimation(buttonRotation);
                        Judgment();

                        ComputerPlay_4();
                        Judgment();
                    }
                }
            }
        });

        button34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flag_end == 0) {
                    if (array_4[4][5] == 0) {
                        array_4[4][5] = -1;
                        button34.setBackgroundResource(R.drawable.star_red);
                        soundPool.play(clap_funk_5, 1.0f, 1.0f, 0, 0, 1f);

                        button34.startAnimation(buttonRotation);
                        Judgment();

                        ComputerPlay_4();
                        Judgment();
                    }
                }
            }
        });

        button35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flag_end == 0) {
                    if (array_4[4][6] == 0) {
                        array_4[4][6] = -1;
                        button35.setBackgroundResource(R.drawable.star_red);
                        soundPool.play(clap_funk_5, 1.0f, 1.0f, 0, 0, 1f);

                        button35.startAnimation(buttonRotation);
                        Judgment();

                        ComputerPlay_4();
                        Judgment();
                    }
                }
            }
        });

        // 6行め
        button36.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flag_end == 0) {
                    if (array_4[5][0] == 0) {
                        array_4[5][0] = -1;
                        button36.setBackgroundResource(R.drawable.star_red);
                        soundPool.play(clap_funk_5, 1.0f, 1.0f, 0, 0, 1f);

                        button36.startAnimation(buttonRotation);
                        Judgment();

                        ComputerPlay_4();
                        Judgment();
                    }
                }
            }
        });

        button37.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flag_end == 0) {
                    if (array_4[5][1] == 0) {
                        array_4[5][1] = -1;
                        button37.setBackgroundResource(R.drawable.star_red);
                        soundPool.play(clap_funk_5, 1.0f, 1.0f, 0, 0, 1f);

                        button37.startAnimation(buttonRotation);
                        Judgment();

                        ComputerPlay_4();
                        Judgment();
                    }
                }
            }
        });

        button38.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flag_end == 0) {
                    if (array_4[5][2] == 0) {
                        array_4[5][2] = -1;
                        button38.setBackgroundResource(R.drawable.star_red);
                        soundPool.play(clap_funk_5, 1.0f, 1.0f, 0, 0, 1f);

                        button38.startAnimation(buttonRotation);
                        Judgment();

                        ComputerPlay_4();
                        Judgment();
                    }
                }
            }
        });

        button39.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flag_end == 0) {
                    if (array_4[5][3] == 0) {
                        array_4[5][3] = -1;
                        button39.setBackgroundResource(R.drawable.star_red);
                        soundPool.play(clap_funk_5, 1.0f, 1.0f, 0, 0, 1f);

                        button39.startAnimation(buttonRotation);
                        Judgment();

                        ComputerPlay_4();
                        Judgment();
                    }
                }
            }
        });

        button40.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flag_end == 0) {
                    if (array_4[5][4] == 0) {
                        array_4[5][4] = -1;
                        button40.setBackgroundResource(R.drawable.star_red);
                        soundPool.play(clap_funk_5, 1.0f, 1.0f, 0, 0, 1f);

                        button40.startAnimation(buttonRotation);
                        Judgment();

                        ComputerPlay_4();
                        Judgment();
                    }
                }
            }
        });

        button41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flag_end == 0) {
                    if (array_4[5][5] == 0) {
                        array_4[5][5] = -1;
                        button41.setBackgroundResource(R.drawable.star_red);
                        soundPool.play(clap_funk_5, 1.0f, 1.0f, 0, 0, 1f);

                        button41.startAnimation(buttonRotation);
                        Judgment();

                        ComputerPlay_4();
                        Judgment();
                    }
                }
            }
        });

        button42.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flag_end == 0) {
                    if (array_4[5][6] == 0) {
                        array_4[5][6] = -1;
                        button42.setBackgroundResource(R.drawable.star_red);
                        soundPool.play(clap_funk_5, 1.0f, 1.0f, 0, 0, 1f);

                        button42.startAnimation(buttonRotation);
                        Judgment();

                        ComputerPlay_4();
                        Judgment();
                    }
                }
            }
        });

        // 7行め
        button43.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flag_end == 0) {
                    if (array_4[6][0] == 0) {
                        array_4[6][0] = -1;
                        button43.setBackgroundResource(R.drawable.star_red);
                        soundPool.play(clap_funk_5, 1.0f, 1.0f, 0, 0, 1f);

                        button43.startAnimation(buttonRotation);
                        Judgment();

                        ComputerPlay_4();
                        Judgment();
                    }
                }
            }
        });

        button44.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flag_end == 0) {
                    if (array_4[6][1] == 0) {
                        array_4[6][1] = -1;
                        button44.setBackgroundResource(R.drawable.star_red);
                        soundPool.play(clap_funk_5, 1.0f, 1.0f, 0, 0, 1f);

                        button44.startAnimation(buttonRotation);
                        Judgment();

                        ComputerPlay_4();
                        Judgment();
                    }
                }
            }
        });

        button45.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flag_end == 0) {
                    if (array_4[6][2] == 0) {
                        array_4[6][2] = -1;
                        button45.setBackgroundResource(R.drawable.star_red);
                        soundPool.play(clap_funk_5, 1.0f, 1.0f, 0, 0, 1f);

                        button45.startAnimation(buttonRotation);
                        Judgment();

                        ComputerPlay_4();
                        Judgment();
                    }
                }
            }
        });

        button46.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flag_end == 0) {
                    if (array_4[6][3] == 0) {
                        array_4[6][3] = -1;
                        button46.setBackgroundResource(R.drawable.star_red);
                        soundPool.play(clap_funk_5, 1.0f, 1.0f, 0, 0, 1f);

                        button46.startAnimation(buttonRotation);
                        Judgment();

                        ComputerPlay_4();
                        Judgment();
                    }
                }
            }
        });

        button47.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flag_end == 0) {
                    if (array_4[6][4] == 0) {
                        array_4[6][4] = -1;
                        button47.setBackgroundResource(R.drawable.star_red);
                        soundPool.play(clap_funk_5, 1.0f, 1.0f, 0, 0, 1f);

                        button47.startAnimation(buttonRotation);
                        Judgment();

                        ComputerPlay_4();
                        Judgment();
                    }
                }
            }
        });

        button48.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flag_end == 0) {
                    if (array_4[6][5] == 0) {
                        array_4[6][5] = -1;
                        button48.setBackgroundResource(R.drawable.star_red);
                        soundPool.play(clap_funk_5, 1.0f, 1.0f, 0, 0, 1f);

                        button48.startAnimation(buttonRotation);
                        Judgment();

                        ComputerPlay_4();
                        Judgment();
                    }
                }
            }
        });

        button49.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flag_end == 0) {
                    if (array_4[6][6] == 0) {
                        array_4[6][6] = -1;
                        button49.setBackgroundResource(R.drawable.star_red);
                        soundPool.play(clap_funk_5, 1.0f, 1.0f, 0, 0, 1f);

                        button49.startAnimation(buttonRotation);
                        Judgment();

                        ComputerPlay_4();
                        Judgment();
                    }
                }
            }
        });
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