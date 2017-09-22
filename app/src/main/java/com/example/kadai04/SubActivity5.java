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

public class SubActivity5 extends AppCompatActivity {

    //効果音の設定
    SoundPool soundPool;
    public int clap_funk_5;
    public int cowbell_808_wm;

    private static Toast t;

    public int array_5[][] = new int[9][9];

    public int sum01_5 = 0;
    public int sum02_5 = 0;
    public int sum03_5 = 0;
    public int sum04_5 = 0;
    public int sum05_5 = 0;
    public int sum06_5 = 0;
    public int sum07_5 = 0;
    public int sum08_5 = 0;
    public int sum09_5 = 0;
    public int sum10_5 = 0;

    public int flag_sum_5 = 0;
    public int flag_end_5 = 0;

    public int cp_play_5 = 0;

    public int win_v_h_5 = 9;
    public int win_sla_5 = 5;
    public int win_usr_5 = -5;
    public int win_com_5 = 5;

    public int num1_5 = 0;
    public int num2_5 = 0;
    public int num3_5 = 0;
    public int num4_5 = 0;

    public int num_5_1 = 0;

    final Activity activity = this;

    //ユーザーメソッド

    //勝敗の判定
    public void Judgment_5() {

        int sum_judgment_5 = 0;

        //よこ
        while (num1_5 < 5) {
            for (int i = 0; i < win_v_h_5; i++) {
                sum_judgment_5 = array_5[i][num1_5] + array_5[i][num1_5 + 1]
                        + array_5[i][num1_5 + 2] + array_5[i][num1_5 + 3] + array_5[i][num1_5 + 4];

                //ユーザー勝利
                if (win_usr_5 == sum_judgment_5) {
                    //トースト表示
                    Toast toast = Toast.makeText(activity, "! ! ! ! ! VIVA LA REVOLUTION ! ! ! ! !", Toast.LENGTH_SHORT);
                    toast.setGravity(Gravity.CENTER | Gravity.CENTER, 0, 0);
                    toast.show();
                    //ゲーム終了
                    flag_end_5 = 5;
                    cp_play_5 = 0;
                }

                //コンピュータ勝利
                if (win_com_5 == sum_judgment_5) {
                    //トースト表示
                    Toast toast = Toast.makeText(activity, "! ! ! ! ! LOSE ! ! ! ! !", Toast.LENGTH_SHORT);
                    toast.setGravity(Gravity.CENTER | Gravity.CENTER, 0, 0);
                    toast.show();
                    //ゲーム終了
                    flag_end_5 = 1;
                    cp_play_5 = 0;
                }
            }
            num1_5++;
        }
        num1_5 = 0;

        //たて
        while (num2_5 < 5) {
            for (int i = 0; i < win_v_h_5; i++) {
                sum_judgment_5 = array_5[num2_5][i] + array_5[num2_5 + 1][i]
                        + array_5[num2_5 + 2][i] + array_5[num2_5 + 3][i] + array_5[num2_5 + 4][i];

                //ユーザー勝利
                if (win_usr_5 == sum_judgment_5) {
                    //トースト表示
                    Toast toast = Toast.makeText(activity, "! ! ! ! ! VIVA LA REVOLUTION ! ! ! ! !", Toast.LENGTH_SHORT);
                    toast.setGravity(Gravity.CENTER | Gravity.CENTER, 0, 0);
                    toast.show();
                    //ゲーム終了
                    flag_end_5 = 1;
                    cp_play_5 = 0;
                }

                //コンピュータ勝利
                if (win_com_5 == sum_judgment_5) {
                    //トースト表示
                    Toast toast = Toast.makeText(activity, "! ! ! ! ! LOSE ! ! ! ! !", Toast.LENGTH_SHORT);
                    toast.setGravity(Gravity.CENTER | Gravity.CENTER, 0, 0);
                    toast.show();
                    //ゲーム終了
                    flag_end_5 = 1;
                    cp_play_5 = 0;
                }
            }
            num2_5++;
        }
        num2_5 = 0;

        // ななめ 左上から右下
        while (num3_5 < 5) {
            for (int i = 0; i < win_sla_5; i++) {
                sum_judgment_5 = array_5[num3_5][i] + array_5[num3_5 + 1][i + 1]
                        + array_5[num3_5 + 2][i + 2] + array_5[num3_5 + 3][i + 3] + array_5[num3_5 + 4][i + 4];

                //ユーザー勝利
                if (win_usr_5 == sum_judgment_5) {
                    //トースト表示
                    Toast toast = Toast.makeText(activity, "! ! ! ! ! VIVA LA REVOLUTION ! ! ! ! !", Toast.LENGTH_SHORT);
                    toast.setGravity(Gravity.CENTER | Gravity.CENTER, 0, 0);
                    toast.show();
                    //ゲーム終了
                    flag_end_5 = 1;
                    cp_play_5 = 0;
                }

                //コンピュータ勝利
                if (win_com_5 == sum_judgment_5) {
                    //トースト表示
                    Toast toast = Toast.makeText(activity, "! ! ! ! ! LOSE ! ! ! ! !", Toast.LENGTH_SHORT);
                    toast.setGravity(Gravity.CENTER | Gravity.CENTER, 0, 0);
                    toast.show();
                    //ゲーム終了
                    flag_end_5 = 1;
                    cp_play_5 = 0;
                }
            }
            num3_5++;
        }
        num3_5 = 0;

        // ななめ 右上から左下
        while (num4_5 < 5) {
            for (int i = 0; i < win_sla_5; i++) {
                sum_judgment_5 = array_5[num4_5][8 - i] + array_5[num4_5 + 1][7 - i]
                        + array_5[num4_5 + 2][6 - i] + array_5[num4_5 + 3][5 - i] + array_5[num4_5 + 4][4 - i];

                //ユーザー勝利
                if (win_usr_5 == sum_judgment_5) {
                    //トースト表示
                    Toast toast = Toast.makeText(activity, "! ! ! ! ! VIVA LA REVOLUTION ! ! ! ! !", Toast.LENGTH_SHORT);
                    toast.setGravity(Gravity.CENTER | Gravity.CENTER, 0, 0);
                    toast.show();
                    //ゲーム終了
                    flag_end_5 = 1;
                    cp_play_5 = 0;
                }

                //コンピュータ勝利
                if (win_com_5 == sum_judgment_5) {
                    //トースト表示
                    Toast toast = Toast.makeText(activity, "! ! ! ! ! LOSE ! ! ! ! !", Toast.LENGTH_SHORT);
                    toast.setGravity(Gravity.CENTER | Gravity.CENTER, 0, 0);
                    toast.show();
                    //ゲーム終了
                    flag_end_5 = 1;
                    cp_play_5 = 0;
                }
            }
            num4_5++;
        }
        num4_5 = 0;

        //引き分け
        if (cp_play_5 == 41) {

            //トースト表示
            Toast toast = Toast.makeText(activity, "! ! ! ! ! DRAW ! ! ! ! !", Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER | Gravity.CENTER, 0, 0);
            toast.show();

            //ゲーム終了
            flag_end_5 = 1;
            cp_play_5 = 0;
        }
    }

    //コンピュータの手番
    public void ComputerPlay_5() {
        final Button btn01 = (Button) this.findViewById(R.id.btn01);
        final Button btn02 = (Button) this.findViewById(R.id.btn02);
        final Button btn03 = (Button) this.findViewById(R.id.btn03);
        final Button btn04 = (Button) this.findViewById(R.id.btn04);
        final Button btn05 = (Button) this.findViewById(R.id.btn05);
        final Button btn06 = (Button) this.findViewById(R.id.btn06);
        final Button btn07 = (Button) this.findViewById(R.id.btn07);
        final Button btn08 = (Button) this.findViewById(R.id.btn08);
        final Button btn09 = (Button) this.findViewById(R.id.btn09);
        final Button btn10 = (Button) this.findViewById(R.id.btn10);

        final Button btn11 = (Button) this.findViewById(R.id.btn11);
        final Button btn12 = (Button) this.findViewById(R.id.btn12);
        final Button btn13 = (Button) this.findViewById(R.id.btn13);
        final Button btn14 = (Button) this.findViewById(R.id.btn14);
        final Button btn15 = (Button) this.findViewById(R.id.btn15);
        final Button btn16 = (Button) this.findViewById(R.id.btn16);
        final Button btn17 = (Button) this.findViewById(R.id.btn17);
        final Button btn18 = (Button) this.findViewById(R.id.btn18);
        final Button btn19 = (Button) this.findViewById(R.id.btn19);

        final Button btn20 = (Button) this.findViewById(R.id.btn20);
        final Button btn21 = (Button) this.findViewById(R.id.btn21);
        final Button btn22 = (Button) this.findViewById(R.id.btn22);
        final Button btn23 = (Button) this.findViewById(R.id.btn23);
        final Button btn24 = (Button) this.findViewById(R.id.btn24);
        final Button btn25 = (Button) this.findViewById(R.id.btn25);
        final Button btn26 = (Button) this.findViewById(R.id.btn26);
        final Button btn27 = (Button) this.findViewById(R.id.btn27);
        final Button btn28 = (Button) this.findViewById(R.id.btn28);
        final Button btn29 = (Button) this.findViewById(R.id.btn29);
        final Button btn30 = (Button) this.findViewById(R.id.btn30);

        final Button btn31 = (Button) this.findViewById(R.id.btn31);
        final Button btn32 = (Button) this.findViewById(R.id.btn32);
        final Button btn33 = (Button) this.findViewById(R.id.btn33);
        final Button btn34 = (Button) this.findViewById(R.id.btn34);
        final Button btn35 = (Button) this.findViewById(R.id.btn35);
        final Button btn36 = (Button) this.findViewById(R.id.btn36);
        final Button btn37 = (Button) this.findViewById(R.id.btn37);
        final Button btn38 = (Button) this.findViewById(R.id.btn38);
        final Button btn39 = (Button) this.findViewById(R.id.btn39);
        final Button btn40 = (Button) this.findViewById(R.id.btn40);

        final Button btn41 = (Button) this.findViewById(R.id.btn41);
        final Button btn42 = (Button) this.findViewById(R.id.btn42);
        final Button btn43 = (Button) this.findViewById(R.id.btn43);
        final Button btn44 = (Button) this.findViewById(R.id.btn44);
        final Button btn45 = (Button) this.findViewById(R.id.btn45);
        final Button btn46 = (Button) this.findViewById(R.id.btn46);
        final Button btn47 = (Button) this.findViewById(R.id.btn47);
        final Button btn48 = (Button) this.findViewById(R.id.btn48);
        final Button btn49 = (Button) this.findViewById(R.id.btn49);
        final Button btn50 = (Button) this.findViewById(R.id.btn50);

        final Button btn51 = (Button) this.findViewById(R.id.btn51);
        final Button btn52 = (Button) this.findViewById(R.id.btn52);
        final Button btn53 = (Button) this.findViewById(R.id.btn53);
        final Button btn54 = (Button) this.findViewById(R.id.btn54);
        final Button btn55 = (Button) this.findViewById(R.id.btn55);
        final Button btn56 = (Button) this.findViewById(R.id.btn56);
        final Button btn57 = (Button) this.findViewById(R.id.btn57);
        final Button btn58 = (Button) this.findViewById(R.id.btn58);
        final Button btn59 = (Button) this.findViewById(R.id.btn59);
        final Button btn60 = (Button) this.findViewById(R.id.btn60);

        final Button btn61 = (Button) this.findViewById(R.id.btn61);
        final Button btn62 = (Button) this.findViewById(R.id.btn62);
        final Button btn63 = (Button) this.findViewById(R.id.btn63);
        final Button btn64 = (Button) this.findViewById(R.id.btn64);
        final Button btn65 = (Button) this.findViewById(R.id.btn65);
        final Button btn66 = (Button) this.findViewById(R.id.btn66);
        final Button btn67 = (Button) this.findViewById(R.id.btn67);
        final Button btn68 = (Button) this.findViewById(R.id.btn68);
        final Button btn69 = (Button) this.findViewById(R.id.btn69);
        final Button btn70 = (Button) this.findViewById(R.id.btn70);

        final Button btn71 = (Button) this.findViewById(R.id.btn71);
        final Button btn72 = (Button) this.findViewById(R.id.btn72);
        final Button btn73 = (Button) this.findViewById(R.id.btn73);
        final Button btn74 = (Button) this.findViewById(R.id.btn74);
        final Button btn75 = (Button) this.findViewById(R.id.btn75);
        final Button btn76 = (Button) this.findViewById(R.id.btn76);
        final Button btn77 = (Button) this.findViewById(R.id.btn77);
        final Button btn78 = (Button) this.findViewById(R.id.btn78);
        final Button btn79 = (Button) this.findViewById(R.id.btn79);
        final Button btn80 = (Button) this.findViewById(R.id.btn80);

        final Button btn81 = (Button) this.findViewById(R.id.btn81);

        cp_play_5++;
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

        if (flag_end_5 == 0) {

            int ans = 0;
            // テンパイ時の処理
            // よこ
            if (n == -1) {
                while (ans < 5) {
                    for (int ib = 0; ib < 9; ib++) {
                        sum01_5 = array_5[ib][ans] + array_5[ib][1 + ans]
                                + array_5[ib][2 + ans] + array_5[ib][3 + ans] + array_5[ib][4 + ans];

                        if (sum01_5 == -4 | sum01_5 == 4) {
                            if (array_5[ib][0 + ans] == 0)
                                n = 0 + ans + (ib * 9);
                            if (array_5[ib][1 + ans] == 0)
                                n = 1 + ans + (ib * 9);
                            if (array_5[ib][2 + ans] == 0)
                                n = 2 + ans + (ib * 9);
                            if (array_5[ib][3 + ans] == 0)
                                n = 3 + ans + (ib * 9);
                            if (array_5[ib][4 + ans] == 0)
                                n = 4 + ans + (ib * 9);
                        }
                    }
                    ans++;
                }
                ans = 0;
            }
            // たて
            if (n == -1) {
                while (ans < 5) {
                    for (int ib = 0; ib < 9; ib++) {
                        sum01_5 = array_5[0 + ans][ib]
                                + array_5[1 + ans][ib]
                                + array_5[2 + ans][ib]
                                + array_5[3 + ans][ib]
                                + array_5[4 + ans][ib];

                        if (sum01_5 == -4 | sum01_5 == 4) {
                            if (array_5[0 + ans][ib] == 0)
                                n = 0 + ib + (ans * 9);
                            if (array_5[1 + ans][ib] == 0)
                                n = 9 + ib + (ans * 9);
                            if (array_5[2 + ans][ib] == 0)
                                n = 18 + ib + (ans * 9);
                            if (array_5[3 + ans][ib] == 0)
                                n = 27 + ib + (ans * 9);
                            if (array_5[4 + ans][ib] == 0)
                                n = 36 + ib + (ans * 9);
                        }
                    }
                    ans++;
                }
                ans = 0;
            }
            // ななめ 左上から
            if (n == -1) {
                while (ans < 5) {
                    for (int ib = 0; ib < 5; ib++) {
                        sum01_5 = array_5[ans][ib] + array_5[1 + ans][1 + ib]
                                + array_5[2 + ans][2 + ib] + array_5[3 + ans][3 + ib] + array_5[4 + ans][4 + ib];

                        if (sum01_5 == -4 | sum01_5 == 4) {
                            if (array_5[0 + ans][0 + ib] == 0)
                                n = 0 + ib + (ans * 9);
                            if (array_5[1 + ans][1 + ib] == 0)
                                n = 10 + ib + (ans * 9);
                            if (array_5[2 + ans][2 + ib] == 0)
                                n = 20 + ib + (ans * 9);
                            if (array_5[3 + ans][3 + ib] == 0)
                                n = 30 + ib + (ans * 9);
                            if (array_5[4 + ans][4 + ib] == 0)
                                n = 40 + ib + (ans * 9);
                        }
                    }
                    ans++;
                }
                ans = 0;
            }
            // ななめ 右上から
            if (n == -1) {
                while (ans < 5) {
                    for (int ib = 0; ib < 5; ib++) {
                        sum01_5 = array_5[0 + ans][4 + ib] + array_5[1 + ans][3 + ib]
                                + array_5[2 + ans][2 + ib] + array_5[3 + ans][1 + ib] + array_5[4 + ans][0 + ib];

                        if (sum01_5 == -4 | sum01_5 == 4) {
                            if (array_5[0 + ans][4 + ib] == 0)
                                n = 4 + ib + (ans * 9);
                            if (array_5[1 + ans][3 + ib] == 0)
                                n = 12 + ib + (ans * 9);
                            if (array_5[2 + ans][2 + ib] == 0)
                                n = 20 + ib + (ans * 9);
                            if (array_5[3 + ans][1 + ib] == 0)
                                n = 28 + ib + (ans * 9);
                            if (array_5[4 + ans][0 + ib] == 0)
                                n = 36 + ib + (ans * 9);
                        }
                    }
                    ans++;
                }
                ans = 0;
            }

            // イーシャンテン時の処理
            // よこ
            if (n == -1) {
                while (ans < 5) {
                    for (int ib = 0; ib < 9; ib++) {
                        sum01_5 = array_5[ib][ans] + array_5[ib][1 + ans]
                                + array_5[ib][2 + ans] + array_5[ib][3 + ans] + array_5[ib][4 + ans];
                        if (sum01_5 == -3 | sum01_5 == 3) {
                            if (array_5[ib][ans] == 0)
                                n = 0 + ans + (ib * 9);
                            if (array_5[ib][1 + ans] == 0)
                                n = 1 + ans + (ib * 9);
                            if (array_5[ib][2 + ans] == 0)
                                n = 2 + ans + (ib * 9);
                            if (array_5[ib][3 + ans] == 0)
                                n = 3 + ans + (ib * 9);
                        }
                    }
                    ans++;
                }
                ans = 0;
            }
            // たて
            if (n == -1) {
                while (ans < 5) {
                    for (int ib = 0; ib < 9; ib++) {
                        sum01_5 = array_5[ans][ib] + array_5[1 + ans][ib]
                                + array_5[2 + ans][ib] + array_5[3 + ans][ib] + array_5[4 + ans][ib];
                        if (sum01_5 == -3 | sum01_5 == 3) {
                            if (array_5[0 + ans][ib] == 0)
                                n = 0 + ib + (ans * 9);
                            if (array_5[1 + ans][ib] == 0)
                                n = 9 + ib + (ans * 9);
                            if (array_5[2 + ans][ib] == 0)
                                n = 18 + ib + (ans * 9);
                            if (array_5[3 + ans][ib] == 0)
                                n = 27 + ib + (ans * 9);
                        }
                    }
                    ans++;
                }
                ans = 0;
            }
            // ななめ 左上から
            if (n == -1) {
                while (ans < 5) {
                    for (int ib = 0; ib < 5; ib++) {
                        sum01_5 = array_5[ans][ib] + array_5[1 + ans][1 + ib]
                                + array_5[2 + ans][2 + ib] + array_5[3 + ans][3 + ib] + array_5[4 + ans][4 + ib];

                        if (sum01_5 == -3 | sum01_5 == 3) {
                            if (array_5[0 + ans][0 + ib] == 0)
                                n = 0 + ib + (ans * 9);
                            if (array_5[1 + ans][1 + ib] == 0)
                                n = 10 + ib + (ans * 9);
                            if (array_5[2 + ans][2 + ib] == 0)
                                n = 20 + ib + (ans * 9);
                            if (array_5[3 + ans][3 + ib] == 0)
                                n = 30 + ib + (ans * 9);
                        }
                    }
                    ans++;
                }
                ans = 0;
            }
            // ななめ 右上から
            if (n == -1) {
                while (ans < 5) {
                    for (int ib = 0; ib < 5; ib++) {
                        sum01_5 = array_5[0 + ans][4 + ib] + array_5[1 + ans][3 + ib]
                                + array_5[2 + ans][2 + ib] + array_5[3 + ans][1 + ib] + array_5[4 + ans][0 + ib];

                        if (sum01_5 == -3 | sum01_5 == 3) {
                            if (array_5[0 + ans][4 + ib] == 0)
                                n = 4 + ib + (ans * 9);
                            if (array_5[1 + ans][3 + ib] == 0)
                                n = 12 + ib + (ans * 9);
                            if (array_5[2 + ans][2 + ib] == 0)
                                n = 20 + ib + (ans * 9);
                            if (array_5[3 + ans][1 + ib] == 0)
                                n = 28 + ib + (ans * 9);
                        }
                    }
                    ans++;
                }
                ans = 0;
            }

            // リャンシャンテン時の処理
            // よこ
            if (n == -1) {
                while (ans < 5) {
                    for (int ib = 0; ib < 9; ib++) {
                        sum01_5 = array_5[ib][ans] + array_5[ib][1 + ans] + array_5[ib][2 + ans];
                        if (sum01_5 == -2 | sum01_5 == 2) {
                            if (array_5[ib][ans] == 0)
                                n = 0 + ans + (ib * 9);
                            if (array_5[ib][1 + ans] == 0)
                                n = 1 + ans + (ib * 9);
                            if (array_5[ib][2 + ans] == 0)
                                n = 2 + ans + (ib * 9);
                        }
                    }
                    ans++;
                }
                ans = 0;
            }
            // たて
            if (n == -1) {
                while (ans < 5) {
                    for (int ib = 0; ib < 9; ib++) {
                        sum01_5 = array_5[ans][ib] + array_5[1 + ans][ib] + array_5[2 + ans][ib];
                        if (sum01_5 == -2 | sum01_5 == 2) {
                            if (array_5[0 + ans][ib] == 0)
                                n = 0 + ib + (ans * 9);
                            if (array_5[1 + ans][ib] == 0)
                                n = 9 + ib + (ans * 9);
                            if (array_5[2 + ans][ib] == 0)
                                n = 18 + ib + (ans * 9);
                        }
                    }
                    ans++;
                }
                ans = 0;
            }
            // ななめ 左上から
            if (n == -1) {
                while (ans < 5) {
                    for (int ib = 0; ib < 5; ib++) {
                        sum01_5 = array_5[ans][ib] + array_5[1 + ans][1 + ib] + array_5[2 + ans][2 + ib];
                        if (sum01_5 == -2 | sum01_5 == 2) {
                            if (array_5[0 + ans][0 + ib] == 0)
                                n = 0 + ib + (ans * 9);
                            if (array_5[1 + ans][1 + ib] == 0)
                                n = 10 + ib + (ans * 9);
                            if (array_5[2 + ans][2 + ib] == 0)
                                n = 20 + ib + (ans * 9);
                        }
                    }
                    ans++;
                }
                ans = 0;
            }
            // ななめ 右上から
            if (n == -1) {
                while (ans < 5) {
                    for (int ib = 0; ib < 5; ib++) {
                        sum01_5 = array_5[0 + ans][4 + ib] + array_5[1 + ans][3 + ib] + array_5[2 + ans][2 + ib];
                        if (sum01_5 == -2 | sum01_5 == 2) {
                            if (array_5[0 + ans][4 + ib] == 0)
                                n = 4 + ib + (ans * 9);
                            if (array_5[1 + ans][3 + ib] == 0)
                                n = 12 + ib + (ans * 9);
                            if (array_5[2 + ans][2 + ib] == 0)
                                n = 20 + ib + (ans * 9);
                        }
                    }
                    ans++;
                }
                ans = 0;
            }

            // 二手目の考慮など
            // ななめ 右上から
            if (n == -1) {
                while (ans < 5) {
                    for (int ib = 0; ib < 7; ib++) {
                        sum01_5 = array_5[ans][1 + ib] + array_5[1 + ans][ib];
                        if (sum01_5 == 1) {
                            if (array_5[0 + ans][1 + ib] == 0)
                                n = 1 + ib + (ans * 9);
                            if (array_5[1 + ans][0 + ib] == 0)
                                n = 9 + ib + (ans * 9);
                        }
                    }
                    ans++;
                }
                ans = 0;
            }
            // ななめ 左上から
            if (n == -1) {
                while (ans < 5) {
                    for (int ib = 0; ib < 7; ib++) {
                        sum01_5 = array_5[ans][ib] + array_5[1 + ans][1 + ib];
                        if (sum01_5 == 1) {
                            if (array_5[0 + ans][ib] == 0)
                                n = 0 + ib + (ans * 9);
                            if (array_5[1 + ans][1 + ib] == 0)
                                n = 10 + ib + (ans * 9);
                        }
                    }
                    ans++;
                }
                ans = 0;
            }
            // よこ
            if (n == -1) {
                while (ans < 5) {
                    for (int ib = 0; ib < 9; ib++) {
                        sum01_5 = array_5[ib][ans] + array_5[ib][1 + ans];

                        if (sum01_5 == 1) {
                            if (array_5[ib][ans] == 0)
                                n = 0 + ans + (ib * 9);
                            if (array_5[ib][1 + ans] == 0)
                                n = 1 + ans + (ib * 9);
                        }
                    }
                    ans++;
                }
                ans = 0;
            }
            // たて
            if (n == -1) {
                while (ans < 5) {
                    for (int ib = 0; ib < 9; ib++) {
                        sum01_5 = array_5[ans][ib] + array_5[1 + ans][ib];

                        if (sum01_5 == 1) {
                            if (array_5[ans][ib] == 0)
                                n = 0 + ib + (ans * 9);
                            if (array_5[1 + ans][ib] == 0)
                                n = 9 + ib + (ans * 9);
                        }
                    }
                    ans++;
                }
                ans = 0;
            }

            // 候補がない場合はランダムで手を打つ
            if (n == -1) {
                Random r = new Random();
                n = r.nextInt(80);
            }

            while (n > -1) {
                switch (n) {
                    case 0:
                        if (array_5[0][0] == 0) {
                            array_5[0][0] = 1;
                            btn01.startAnimation(animation_set);
                            btn01.setBackgroundResource(R.drawable.star_white);
                            n = -1;
                        }
                        break;

                    case 1:
                        if (array_5[0][1] == 0) {
                            array_5[0][1] = 1;
                            btn02.startAnimation(animation_set);
                            btn02.setBackgroundResource(R.drawable.star_white);
                            n = -1;
                        }
                        break;

                    case 2:
                        if (array_5[0][2] == 0) {
                            array_5[0][2] = 1;
                            btn03.startAnimation(animation_set);
                            btn03.setBackgroundResource(R.drawable.star_white);
                            n = -1;
                        }
                        break;

                    case 3:
                        if (array_5[0][3] == 0) {
                            array_5[0][3] = 1;
                            btn04.startAnimation(animation_set);
                            btn04.setBackgroundResource(R.drawable.star_white);
                            n = -1;
                        }
                        break;

                    case 4:
                        if (array_5[0][4] == 0) {
                            array_5[0][4] = 1;
                            btn05.startAnimation(animation_set);
                            btn05.setBackgroundResource(R.drawable.star_white);
                            n = -1;
                        }
                        break;

                    case 5:
                        if (array_5[0][5] == 0) {
                            array_5[0][5] = 1;
                            btn06.startAnimation(animation_set);
                            btn06.setBackgroundResource(R.drawable.star_white);
                            n = -1;
                        }
                        break;

                    case 6:
                        if (array_5[0][6] == 0) {
                            array_5[0][6] = 1;
                            btn07.startAnimation(animation_set);
                            btn07.setBackgroundResource(R.drawable.star_white);
                            n = -1;
                        }
                        break;

                    case 7:
                        if (array_5[0][7] == 0) {
                            array_5[0][7] = 1;
                            btn08.startAnimation(animation_set);
                            btn08.setBackgroundResource(R.drawable.star_white);
                            n = -1;
                        }
                        break;

                    case 8:
                        if (array_5[0][8] == 0) {
                            array_5[0][8] = 1;
                            btn09.startAnimation(animation_set);
                            btn09.setBackgroundResource(R.drawable.star_white);
                            n = -1;
                        }
                        break;

                    case 9:
                        if (array_5[1][0] == 0) {
                            array_5[1][0] = 1;
                            btn10.startAnimation(animation_set);
                            btn10.setBackgroundResource(R.drawable.star_white);
                            n = -1;
                        }
                        break;

                    case 10:
                        if (array_5[1][1] == 0) {
                            array_5[1][1] = 1;
                            btn11.startAnimation(animation_set);
                            btn11.setBackgroundResource(R.drawable.star_white);
                            n = -1;
                        }
                        break;

                    case 11:
                        if (array_5[1][2] == 0) {
                            array_5[1][2] = 1;
                            btn12.startAnimation(animation_set);
                            btn12.setBackgroundResource(R.drawable.star_white);
                            n = -1;
                        }
                        break;

                    case 12:
                        if (array_5[1][3] == 0) {
                            array_5[1][3] = 1;
                            btn13.startAnimation(animation_set);
                            btn13.setBackgroundResource(R.drawable.star_white);
                            n = -1;
                        }
                        break;

                    case 13:
                        if (array_5[1][4] == 0) {
                            array_5[1][4] = 1;
                            btn14.startAnimation(animation_set);
                            btn14.setBackgroundResource(R.drawable.star_white);
                            n = -1;
                        }
                        break;

                    case 14:
                        if (array_5[1][5] == 0) {
                            array_5[1][5] = 1;
                            btn15.startAnimation(animation_set);
                            btn15.setBackgroundResource(R.drawable.star_white);
                            n = -1;
                        }
                        break;

                    case 15:
                        if (array_5[1][6] == 0) {
                            array_5[1][6] = 1;
                            btn16.startAnimation(animation_set);
                            btn16.setBackgroundResource(R.drawable.star_white);
                            n = -1;
                        }
                        break;

                    case 16:
                        if (array_5[1][7] == 0) {
                            array_5[1][7] = 1;
                            btn17.startAnimation(animation_set);
                            btn17.setBackgroundResource(R.drawable.star_white);
                            n = -1;
                        }
                        break;

                    case 17:
                        if (array_5[1][8] == 0) {
                            array_5[1][8] = 1;
                            btn18.startAnimation(animation_set);
                            btn18.setBackgroundResource(R.drawable.star_white);
                            n = -1;
                        }
                        break;

                    case 18:
                        if (array_5[2][0] == 0) {
                            array_5[2][0] = 1;
                            btn19.startAnimation(animation_set);
                            btn19.setBackgroundResource(R.drawable.star_white);
                            n = -1;
                        }
                        break;

                    case 19:
                        if (array_5[2][1] == 0) {
                            array_5[2][1] = 1;
                            btn20.startAnimation(animation_set);
                            btn20.setBackgroundResource(R.drawable.star_white);
                            n = -1;
                        }
                        break;

                    case 20:
                        if (array_5[2][2] == 0) {
                            array_5[2][2] = 1;
                            btn21.startAnimation(animation_set);
                            btn21.setBackgroundResource(R.drawable.star_white);
                            n = -1;
                        }
                        break;

                    case 21:
                        if (array_5[2][3] == 0) {
                            array_5[2][3] = 1;
                            btn22.startAnimation(animation_set);
                            btn22.setBackgroundResource(R.drawable.star_white);
                            n = -1;
                        }
                        break;

                    case 22:
                        if (array_5[2][4] == 0) {
                            array_5[2][4] = 1;
                            btn23.startAnimation(animation_set);
                            btn23.setBackgroundResource(R.drawable.star_white);
                            n = -1;
                        }
                        break;

                    case 23:
                        if (array_5[2][5] == 0) {
                            array_5[2][5] = 1;
                            btn24.startAnimation(animation_set);
                            btn24.setBackgroundResource(R.drawable.star_white);
                            n = -1;
                        }
                        break;

                    case 24:
                        if (array_5[2][6] == 0) {
                            array_5[2][6] = 1;
                            btn25.startAnimation(animation_set);
                            btn25.setBackgroundResource(R.drawable.star_white);
                            n = -1;
                        }
                        break;

                    case 25:
                        if (array_5[2][7] == 0) {
                            array_5[2][7] = 1;
                            btn26.startAnimation(animation_set);
                            btn26.setBackgroundResource(R.drawable.star_white);
                            n = -1;
                        }
                        break;

                    case 26:
                        if (array_5[2][8] == 0) {
                            array_5[2][8] = 1;
                            btn27.startAnimation(animation_set);
                            btn27.setBackgroundResource(R.drawable.star_white);
                            n = -1;
                        }
                        break;

                    case 27:
                        if (array_5[3][0] == 0) {
                            array_5[3][0] = 1;
                            btn28.startAnimation(animation_set);
                            btn28.setBackgroundResource(R.drawable.star_white);
                            n = -1;
                        }
                        break;

                    case 28:
                        if (array_5[3][1] == 0) {
                            array_5[3][1] = 1;
                            btn29.startAnimation(animation_set);
                            btn29.setBackgroundResource(R.drawable.star_white);
                            n = -1;
                        }
                        break;

                    case 29:
                        if (array_5[3][2] == 0) {
                            array_5[3][2] = 1;
                            btn30.startAnimation(animation_set);
                            btn30.setBackgroundResource(R.drawable.star_white);
                            n = -1;
                        }
                        break;

                    case 30:
                        if (array_5[3][3] == 0) {
                            array_5[3][3] = 1;
                            btn31.startAnimation(animation_set);
                            btn31.setBackgroundResource(R.drawable.star_white);
                            n = -1;
                        }
                        break;

                    case 31:
                        if (array_5[3][4] == 0) {
                            array_5[3][4] = 1;
                            btn32.startAnimation(animation_set);
                            btn32.setBackgroundResource(R.drawable.star_white);
                            n = -1;
                        }
                        break;

                    case 32:
                        if (array_5[3][5] == 0) {
                            array_5[3][5] = 1;
                            btn33.startAnimation(animation_set);
                            btn33.setBackgroundResource(R.drawable.star_white);
                            n = -1;
                        }
                        break;

                    case 33:
                        if (array_5[3][6] == 0) {
                            array_5[3][6] = 1;
                            btn34.startAnimation(animation_set);
                            btn34.setBackgroundResource(R.drawable.star_white);
                            n = -1;
                        }
                        break;

                    case 34:
                        if (array_5[3][7] == 0) {
                            array_5[3][7] = 1;
                            btn35.startAnimation(animation_set);
                            btn35.setBackgroundResource(R.drawable.star_white);
                            n = -1;
                        }
                        break;

                    case 35:
                        if (array_5[3][8] == 0) {
                            array_5[3][8] = 1;
                            btn36.startAnimation(animation_set);
                            btn36.setBackgroundResource(R.drawable.star_white);
                            n = -1;
                        }
                        break;

                    case 36:
                        if (array_5[4][0] == 0) {
                            array_5[4][0] = 1;
                            btn37.startAnimation(animation_set);
                            btn37.setBackgroundResource(R.drawable.star_white);
                            n = -1;
                        }
                        break;

                    case 37:
                        if (array_5[4][1] == 0) {
                            array_5[4][1] = 1;
                            btn38.startAnimation(animation_set);
                            btn38.setBackgroundResource(R.drawable.star_white);
                            n = -1;
                        }
                        break;

                    case 38:
                        if (array_5[4][2] == 0) {
                            array_5[4][2] = 1;
                            btn39.startAnimation(animation_set);
                            btn39.setBackgroundResource(R.drawable.star_white);
                            n = -1;
                        }
                        break;

                    case 39:
                        if (array_5[4][3] == 0) {
                            array_5[4][3] = 1;
                            btn40.startAnimation(animation_set);
                            btn40.setBackgroundResource(R.drawable.star_white);
                            n = -1;
                        }
                        break;

                    case 40:
                        if (array_5[4][4] == 0) {
                            array_5[4][4] = 1;
                            btn41.startAnimation(animation_set);
                            btn41.setBackgroundResource(R.drawable.star_white);
                            n = -1;
                        }
                        break;

                    case 41:
                        if (array_5[4][5] == 0) {
                            array_5[4][5] = 1;
                            btn42.startAnimation(animation_set);
                            btn42.setBackgroundResource(R.drawable.star_white);
                            n = -1;
                        }
                        break;

                    case 42:
                        if (array_5[4][6] == 0) {
                            array_5[4][6] = 1;
                            btn43.startAnimation(animation_set);
                            btn43.setBackgroundResource(R.drawable.star_white);
                            n = -1;
                        }
                        break;

                    case 43:
                        if (array_5[4][7] == 0) {
                            array_5[4][7] = 1;
                            btn44.startAnimation(animation_set);
                            btn44.setBackgroundResource(R.drawable.star_white);
                            n = -1;
                        }
                        break;

                    case 44:
                        if (array_5[4][8] == 0) {
                            array_5[4][8] = 1;
                            btn45.startAnimation(animation_set);
                            btn45.setBackgroundResource(R.drawable.star_white);
                            n = -1;
                        }
                        break;

                    case 45:
                        if (array_5[5][0] == 0) {
                            array_5[5][0] = 1;
                            btn46.startAnimation(animation_set);
                            btn46.setBackgroundResource(R.drawable.star_white);
                            n = -1;
                        }
                        break;

                    case 46:
                        if (array_5[5][1] == 0) {
                            array_5[5][1] = 1;
                            btn47.startAnimation(animation_set);
                            btn47.setBackgroundResource(R.drawable.star_white);
                            n = -1;
                        }
                        break;

                    case 47:
                        if (array_5[5][2] == 0) {
                            array_5[5][2] = 1;
                            btn48.startAnimation(animation_set);
                            btn48.setBackgroundResource(R.drawable.star_white);
                            n = -1;
                        }
                        break;

                    case 48:
                        if (array_5[5][3] == 0) {
                            array_5[5][3] = 1;
                            btn49.startAnimation(animation_set);
                            btn49.setBackgroundResource(R.drawable.star_white);
                            n = -1;
                        }
                        break;

                    case 49:
                        if (array_5[5][4] == 0) {
                            array_5[5][4] = 1;
                            btn50.startAnimation(animation_set);
                            btn50.setBackgroundResource(R.drawable.star_white);
                            n = -1;
                        }
                        break;

                    case 50:
                        if (array_5[5][5] == 0) {
                            array_5[5][5] = 1;
                            btn51.startAnimation(animation_set);
                            btn51.setBackgroundResource(R.drawable.star_white);
                            n = -1;
                        }
                        break;

                    case 51:
                        if (array_5[5][6] == 0) {
                            array_5[5][6] = 1;
                            btn52.startAnimation(animation_set);
                            btn52.setBackgroundResource(R.drawable.star_white);
                            n = -1;
                        }
                        break;

                    case 52:
                        if (array_5[5][7] == 0) {
                            array_5[5][7] = 1;
                            btn53.startAnimation(animation_set);
                            btn53.setBackgroundResource(R.drawable.star_white);
                            n = -1;
                        }
                        break;

                    case 53:
                        if (array_5[5][8] == 0) {
                            array_5[5][8] = 1;
                            btn54.startAnimation(animation_set);
                            btn54.setBackgroundResource(R.drawable.star_white);
                            n = -1;
                        }
                        break;

                    case 54:
                        if (array_5[6][0] == 0) {
                            array_5[6][0] = 1;
                            btn55.startAnimation(animation_set);
                            btn55.setBackgroundResource(R.drawable.star_white);
                            n = -1;
                        }
                        break;

                    case 55:
                        if (array_5[6][1] == 0) {
                            array_5[6][1] = 1;
                            btn56.startAnimation(animation_set);
                            btn56.setBackgroundResource(R.drawable.star_white);
                            n = -1;
                        }
                        break;

                    case 56:
                        if (array_5[6][2] == 0) {
                            array_5[6][2] = 1;
                            btn57.startAnimation(animation_set);
                            btn57.setBackgroundResource(R.drawable.star_white);
                            n = -1;
                        }
                        break;

                    case 57:
                        if (array_5[6][3] == 0) {
                            array_5[6][3] = 1;
                            btn58.startAnimation(animation_set);
                            btn58.setBackgroundResource(R.drawable.star_white);
                            n = -1;
                        }
                        break;

                    case 58:
                        if (array_5[6][4] == 0) {
                            array_5[6][4] = 1;
                            btn59.startAnimation(animation_set);
                            btn59.setBackgroundResource(R.drawable.star_white);
                            n = -1;
                        }
                        break;

                    case 59:
                        if (array_5[6][5] == 0) {
                            array_5[6][5] = 1;
                            btn60.startAnimation(animation_set);
                            btn60.setBackgroundResource(R.drawable.star_white);
                            n = -1;
                        }
                        break;

                    case 60:
                        if (array_5[6][6] == 0) {
                            array_5[6][6] = 1;
                            btn61.startAnimation(animation_set);
                            btn61.setBackgroundResource(R.drawable.star_white);
                            n = -1;
                        }
                        break;

                    case 61:
                        if (array_5[6][7] == 0) {
                            array_5[6][7] = 1;
                            btn62.startAnimation(animation_set);
                            btn62.setBackgroundResource(R.drawable.star_white);
                            n = -1;
                        }
                        break;

                    case 62:
                        if (array_5[6][8] == 0) {
                            array_5[6][8] = 1;
                            btn63.startAnimation(animation_set);
                            btn63.setBackgroundResource(R.drawable.star_white);
                            n = -1;
                        }
                        break;

                    case 63:
                        if (array_5[7][0] == 0) {
                            array_5[7][0] = 1;
                            btn64.startAnimation(animation_set);
                            btn64.setBackgroundResource(R.drawable.star_white);
                            n = -1;
                        }
                        break;

                    case 64:
                        if (array_5[7][1] == 0) {
                            array_5[7][1] = 1;
                            btn65.startAnimation(animation_set);
                            btn65.setBackgroundResource(R.drawable.star_white);
                            n = -1;
                        }
                        break;

                    case 65:
                        if (array_5[7][2] == 0) {
                            array_5[7][2] = 1;
                            btn66.startAnimation(animation_set);
                            btn66.setBackgroundResource(R.drawable.star_white);
                            n = -1;
                        }
                        break;

                    case 66:
                        if (array_5[7][3] == 0) {
                            array_5[7][3] = 1;
                            btn67.startAnimation(animation_set);
                            btn67.setBackgroundResource(R.drawable.star_white);
                            n = -1;
                        }
                        break;

                    case 67:
                        if (array_5[7][4] == 0) {
                            array_5[7][4] = 1;
                            btn68.startAnimation(animation_set);
                            btn68.setBackgroundResource(R.drawable.star_white);
                            n = -1;
                        }
                        break;

                    case 68:
                        if (array_5[7][5] == 0) {
                            array_5[7][5] = 1;
                            btn69.startAnimation(animation_set);
                            btn69.setBackgroundResource(R.drawable.star_white);
                            n = -1;
                        }
                        break;

                    case 69:
                        if (array_5[7][6] == 0) {
                            array_5[7][6] = 1;
                            btn70.startAnimation(animation_set);
                            btn70.setBackgroundResource(R.drawable.star_white);
                            n = -1;
                        }
                        break;

                    case 70:
                        if (array_5[7][7] == 0) {
                            array_5[7][7] = 1;
                            btn71.startAnimation(animation_set);
                            btn71.setBackgroundResource(R.drawable.star_white);
                            n = -1;
                        }
                        break;

                    case 71:
                        if (array_5[7][8] == 0) {
                            array_5[7][8] = 1;
                            btn72.startAnimation(animation_set);
                            btn72.setBackgroundResource(R.drawable.star_white);
                            n = -1;
                        }
                        break;

                    case 72:
                        if (array_5[8][0] == 0) {
                            array_5[8][0] = 1;
                            btn73.startAnimation(animation_set);
                            btn73.setBackgroundResource(R.drawable.star_white);
                            n = -1;
                        }
                        break;

                    case 73:
                        if (array_5[8][1] == 0) {
                            array_5[8][1] = 1;
                            btn74.startAnimation(animation_set);
                            btn74.setBackgroundResource(R.drawable.star_white);
                            n = -1;
                        }
                        break;

                    case 74:
                        if (array_5[8][2] == 0) {
                            array_5[8][2] = 1;
                            btn75.startAnimation(animation_set);
                            btn75.setBackgroundResource(R.drawable.star_white);
                            n = -1;
                        }
                        break;

                    case 75:
                        if (array_5[8][3] == 0) {
                            array_5[8][3] = 1;
                            btn76.startAnimation(animation_set);
                            btn76.setBackgroundResource(R.drawable.star_white);
                            n = -1;
                        }
                        break;

                    case 76:
                        if (array_5[8][4] == 0) {
                            array_5[8][4] = 1;
                            btn77.startAnimation(animation_set);
                            btn77.setBackgroundResource(R.drawable.star_white);
                            n = -1;
                        }
                        break;

                    case 77:
                        if (array_5[8][5] == 0) {
                            array_5[8][5] = 1;
                            btn78.startAnimation(animation_set);
                            btn78.setBackgroundResource(R.drawable.star_white);
                            n = -1;
                        }
                        break;

                    case 78:
                        if (array_5[8][6] == 0) {
                            array_5[8][6] = 1;
                            btn79.startAnimation(animation_set);
                            btn79.setBackgroundResource(R.drawable.star_white);
                            n = -1;
                        }
                        break;

                    case 79:
                        if (array_5[8][7] == 0) {
                            array_5[8][7] = 1;
                            btn80.startAnimation(animation_set);
                            btn80.setBackgroundResource(R.drawable.star_white);
                            n = -1;
                        }
                        break;

                    case 80:
                        if (array_5[8][8] == 0) {
                            array_5[8][8] = 1;
                            btn81.startAnimation(animation_set);
                            btn81.setBackgroundResource(R.drawable.star_white);
                            n = -1;
                        }
                        break;

                    default:
                        if (array_5[8][8] == 0) {
                            array_5[8][8] = 1;
                            btn81.startAnimation(animation_set);
                            btn81.setBackgroundResource(R.drawable.star_white);
                            n = -1;
                        }
                        break;
                }

                if (n > -1) {
                    //ランダムで array_5 が 0 の場所に 1 を代入する
                    Random r = new Random();
                    n = r.nextInt(48);
                }
            }

            flag_sum_5 = 0;
        }
    }

    //アクションバーの設定
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

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

            final Button btn01 = (Button) this.findViewById(R.id.btn01);
            final Button btn02 = (Button) this.findViewById(R.id.btn02);
            final Button btn03 = (Button) this.findViewById(R.id.btn03);
            final Button btn04 = (Button) this.findViewById(R.id.btn04);
            final Button btn05 = (Button) this.findViewById(R.id.btn05);
            final Button btn06 = (Button) this.findViewById(R.id.btn06);
            final Button btn07 = (Button) this.findViewById(R.id.btn07);
            final Button btn08 = (Button) this.findViewById(R.id.btn08);
            final Button btn09 = (Button) this.findViewById(R.id.btn09);
            final Button btn10 = (Button) this.findViewById(R.id.btn10);

            final Button btn11 = (Button) this.findViewById(R.id.btn11);
            final Button btn12 = (Button) this.findViewById(R.id.btn12);
            final Button btn13 = (Button) this.findViewById(R.id.btn13);
            final Button btn14 = (Button) this.findViewById(R.id.btn14);
            final Button btn15 = (Button) this.findViewById(R.id.btn15);
            final Button btn16 = (Button) this.findViewById(R.id.btn16);
            final Button btn17 = (Button) this.findViewById(R.id.btn17);
            final Button btn18 = (Button) this.findViewById(R.id.btn18);
            final Button btn19 = (Button) this.findViewById(R.id.btn19);

            final Button btn20 = (Button) this.findViewById(R.id.btn20);
            final Button btn21 = (Button) this.findViewById(R.id.btn21);
            final Button btn22 = (Button) this.findViewById(R.id.btn22);
            final Button btn23 = (Button) this.findViewById(R.id.btn23);
            final Button btn24 = (Button) this.findViewById(R.id.btn24);
            final Button btn25 = (Button) this.findViewById(R.id.btn25);
            final Button btn26 = (Button) this.findViewById(R.id.btn26);
            final Button btn27 = (Button) this.findViewById(R.id.btn27);
            final Button btn28 = (Button) this.findViewById(R.id.btn28);
            final Button btn29 = (Button) this.findViewById(R.id.btn29);
            final Button btn30 = (Button) this.findViewById(R.id.btn30);

            final Button btn31 = (Button) this.findViewById(R.id.btn31);
            final Button btn32 = (Button) this.findViewById(R.id.btn32);
            final Button btn33 = (Button) this.findViewById(R.id.btn33);
            final Button btn34 = (Button) this.findViewById(R.id.btn34);
            final Button btn35 = (Button) this.findViewById(R.id.btn35);
            final Button btn36 = (Button) this.findViewById(R.id.btn36);
            final Button btn37 = (Button) this.findViewById(R.id.btn37);
            final Button btn38 = (Button) this.findViewById(R.id.btn38);
            final Button btn39 = (Button) this.findViewById(R.id.btn39);
            final Button btn40 = (Button) this.findViewById(R.id.btn40);

            final Button btn41 = (Button) this.findViewById(R.id.btn41);
            final Button btn42 = (Button) this.findViewById(R.id.btn42);
            final Button btn43 = (Button) this.findViewById(R.id.btn43);
            final Button btn44 = (Button) this.findViewById(R.id.btn44);
            final Button btn45 = (Button) this.findViewById(R.id.btn45);
            final Button btn46 = (Button) this.findViewById(R.id.btn46);
            final Button btn47 = (Button) this.findViewById(R.id.btn47);
            final Button btn48 = (Button) this.findViewById(R.id.btn48);
            final Button btn49 = (Button) this.findViewById(R.id.btn49);
            final Button btn50 = (Button) this.findViewById(R.id.btn50);

            final Button btn51 = (Button) this.findViewById(R.id.btn51);
            final Button btn52 = (Button) this.findViewById(R.id.btn52);
            final Button btn53 = (Button) this.findViewById(R.id.btn53);
            final Button btn54 = (Button) this.findViewById(R.id.btn54);
            final Button btn55 = (Button) this.findViewById(R.id.btn55);
            final Button btn56 = (Button) this.findViewById(R.id.btn56);
            final Button btn57 = (Button) this.findViewById(R.id.btn57);
            final Button btn58 = (Button) this.findViewById(R.id.btn58);
            final Button btn59 = (Button) this.findViewById(R.id.btn59);
            final Button btn60 = (Button) this.findViewById(R.id.btn60);

            final Button btn61 = (Button) this.findViewById(R.id.btn61);
            final Button btn62 = (Button) this.findViewById(R.id.btn62);
            final Button btn63 = (Button) this.findViewById(R.id.btn63);
            final Button btn64 = (Button) this.findViewById(R.id.btn64);
            final Button btn65 = (Button) this.findViewById(R.id.btn65);
            final Button btn66 = (Button) this.findViewById(R.id.btn66);
            final Button btn67 = (Button) this.findViewById(R.id.btn67);
            final Button btn68 = (Button) this.findViewById(R.id.btn68);
            final Button btn69 = (Button) this.findViewById(R.id.btn69);
            final Button btn70 = (Button) this.findViewById(R.id.btn70);

            final Button btn71 = (Button) this.findViewById(R.id.btn71);
            final Button btn72 = (Button) this.findViewById(R.id.btn72);
            final Button btn73 = (Button) this.findViewById(R.id.btn73);
            final Button btn74 = (Button) this.findViewById(R.id.btn74);
            final Button btn75 = (Button) this.findViewById(R.id.btn75);
            final Button btn76 = (Button) this.findViewById(R.id.btn76);
            final Button btn77 = (Button) this.findViewById(R.id.btn77);
            final Button btn78 = (Button) this.findViewById(R.id.btn78);
            final Button btn79 = (Button) this.findViewById(R.id.btn79);
            final Button btn80 = (Button) this.findViewById(R.id.btn80);

            final Button btn81 = (Button) this.findViewById(R.id.btn81);

            //効果音
            soundPool.play(cowbell_808_wm, 1.0f, 1.0f, 0, 0, 1f);

            //トースト表示
            Toast toast = Toast.makeText(activity, "! ! ! ! ! GAME START ! ! ! ! !", Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER | Gravity.CENTER, 0, 0);
            toast.show();

            //配列の初期化
            int n = 0;
            while (n < 9) {
                for (int i = 0; i < 9; i++) {
                    array_5[n][i] = 0;
                }
                n++;
            }

            //勝敗判定の初期化
            sum01_5 = 0;
            sum02_5 = 0;
            sum03_5 = 0;
            sum04_5 = 0;
            sum05_5 = 0;
            sum06_5 = 0;
            sum07_5 = 0;
            sum08_5 = 0;
            sum09_5 = 0;
            sum10_5 = 0;

            flag_sum_5 = 0;

            num1_5 = 0;
            num2_5 = 0;

            num_5_1 = -1;

            //ボタンの初期化
            btn01.setBackgroundColor(Color.rgb(000, 000, 000));
            btn02.setBackgroundColor(Color.rgb(000, 000, 000));
            btn03.setBackgroundColor(Color.rgb(000, 000, 000));
            btn04.setBackgroundColor(Color.rgb(000, 000, 000));
            btn05.setBackgroundColor(Color.rgb(000, 000, 000));
            btn06.setBackgroundColor(Color.rgb(000, 000, 000));
            btn07.setBackgroundColor(Color.rgb(000, 000, 000));
            btn08.setBackgroundColor(Color.rgb(000, 000, 000));
            btn09.setBackgroundColor(Color.rgb(000, 000, 000));
            btn10.setBackgroundColor(Color.rgb(000, 000, 000));

            btn11.setBackgroundColor(Color.rgb(000, 000, 000));
            btn12.setBackgroundColor(Color.rgb(000, 000, 000));
            btn13.setBackgroundColor(Color.rgb(000, 000, 000));
            btn14.setBackgroundColor(Color.rgb(000, 000, 000));
            btn15.setBackgroundColor(Color.rgb(000, 000, 000));
            btn16.setBackgroundColor(Color.rgb(000, 000, 000));
            btn17.setBackgroundColor(Color.rgb(000, 000, 000));
            btn18.setBackgroundColor(Color.rgb(000, 000, 000));
            btn19.setBackgroundColor(Color.rgb(000, 000, 000));
            btn20.setBackgroundColor(Color.rgb(000, 000, 000));

            btn21.setBackgroundColor(Color.rgb(000, 000, 000));
            btn22.setBackgroundColor(Color.rgb(000, 000, 000));
            btn23.setBackgroundColor(Color.rgb(000, 000, 000));
            btn24.setBackgroundColor(Color.rgb(000, 000, 000));
            btn25.setBackgroundColor(Color.rgb(000, 000, 000));
            btn26.setBackgroundColor(Color.rgb(000, 000, 000));
            btn27.setBackgroundColor(Color.rgb(000, 000, 000));
            btn28.setBackgroundColor(Color.rgb(000, 000, 000));
            btn29.setBackgroundColor(Color.rgb(000, 000, 000));
            btn30.setBackgroundColor(Color.rgb(000, 000, 000));

            btn31.setBackgroundColor(Color.rgb(000, 000, 000));
            btn32.setBackgroundColor(Color.rgb(000, 000, 000));
            btn33.setBackgroundColor(Color.rgb(000, 000, 000));
            btn34.setBackgroundColor(Color.rgb(000, 000, 000));
            btn35.setBackgroundColor(Color.rgb(000, 000, 000));
            btn36.setBackgroundColor(Color.rgb(000, 000, 000));
            btn37.setBackgroundColor(Color.rgb(000, 000, 000));
            btn38.setBackgroundColor(Color.rgb(000, 000, 000));
            btn39.setBackgroundColor(Color.rgb(000, 000, 000));
            btn40.setBackgroundColor(Color.rgb(000, 000, 000));

            btn41.setBackgroundColor(Color.rgb(000, 000, 000));
            btn42.setBackgroundColor(Color.rgb(000, 000, 000));
            btn43.setBackgroundColor(Color.rgb(000, 000, 000));
            btn44.setBackgroundColor(Color.rgb(000, 000, 000));
            btn45.setBackgroundColor(Color.rgb(000, 000, 000));
            btn46.setBackgroundColor(Color.rgb(000, 000, 000));
            btn47.setBackgroundColor(Color.rgb(000, 000, 000));
            btn48.setBackgroundColor(Color.rgb(000, 000, 000));
            btn49.setBackgroundColor(Color.rgb(000, 000, 000));
            btn50.setBackgroundColor(Color.rgb(000, 000, 000));

            btn51.setBackgroundColor(Color.rgb(000, 000, 000));
            btn52.setBackgroundColor(Color.rgb(000, 000, 000));
            btn53.setBackgroundColor(Color.rgb(000, 000, 000));
            btn54.setBackgroundColor(Color.rgb(000, 000, 000));
            btn55.setBackgroundColor(Color.rgb(000, 000, 000));
            btn56.setBackgroundColor(Color.rgb(000, 000, 000));
            btn57.setBackgroundColor(Color.rgb(000, 000, 000));
            btn58.setBackgroundColor(Color.rgb(000, 000, 000));
            btn59.setBackgroundColor(Color.rgb(000, 000, 000));
            btn60.setBackgroundColor(Color.rgb(000, 000, 000));

            btn61.setBackgroundColor(Color.rgb(000, 000, 000));
            btn62.setBackgroundColor(Color.rgb(000, 000, 000));
            btn63.setBackgroundColor(Color.rgb(000, 000, 000));
            btn64.setBackgroundColor(Color.rgb(000, 000, 000));
            btn65.setBackgroundColor(Color.rgb(000, 000, 000));
            btn66.setBackgroundColor(Color.rgb(000, 000, 000));
            btn67.setBackgroundColor(Color.rgb(000, 000, 000));
            btn68.setBackgroundColor(Color.rgb(000, 000, 000));
            btn69.setBackgroundColor(Color.rgb(000, 000, 000));
            btn70.setBackgroundColor(Color.rgb(000, 000, 000));

            btn71.setBackgroundColor(Color.rgb(000, 000, 000));
            btn72.setBackgroundColor(Color.rgb(000, 000, 000));
            btn73.setBackgroundColor(Color.rgb(000, 000, 000));
            btn74.setBackgroundColor(Color.rgb(000, 000, 000));
            btn75.setBackgroundColor(Color.rgb(000, 000, 000));
            btn76.setBackgroundColor(Color.rgb(000, 000, 000));
            btn77.setBackgroundColor(Color.rgb(000, 000, 000));
            btn78.setBackgroundColor(Color.rgb(000, 000, 000));
            btn79.setBackgroundColor(Color.rgb(000, 000, 000));
            btn80.setBackgroundColor(Color.rgb(000, 000, 000));

            btn81.setBackgroundColor(Color.rgb(000, 000, 000));

            //ゲーム開始
            flag_end_5 = 0;
            cp_play_5 = 0;
        }

        return super.onOptionsItemSelected(item);
    }

    //ユーザーの手番
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub5);

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

        final Button btn01 = (Button) this.findViewById(R.id.btn01);
        final Button btn02 = (Button) this.findViewById(R.id.btn02);
        final Button btn03 = (Button) this.findViewById(R.id.btn03);
        final Button btn04 = (Button) this.findViewById(R.id.btn04);
        final Button btn05 = (Button) this.findViewById(R.id.btn05);
        final Button btn06 = (Button) this.findViewById(R.id.btn06);
        final Button btn07 = (Button) this.findViewById(R.id.btn07);
        final Button btn08 = (Button) this.findViewById(R.id.btn08);
        final Button btn09 = (Button) this.findViewById(R.id.btn09);
        final Button btn10 = (Button) this.findViewById(R.id.btn10);

        final Button btn11 = (Button) this.findViewById(R.id.btn11);
        final Button btn12 = (Button) this.findViewById(R.id.btn12);
        final Button btn13 = (Button) this.findViewById(R.id.btn13);
        final Button btn14 = (Button) this.findViewById(R.id.btn14);
        final Button btn15 = (Button) this.findViewById(R.id.btn15);
        final Button btn16 = (Button) this.findViewById(R.id.btn16);
        final Button btn17 = (Button) this.findViewById(R.id.btn17);
        final Button btn18 = (Button) this.findViewById(R.id.btn18);
        final Button btn19 = (Button) this.findViewById(R.id.btn19);

        final Button btn20 = (Button) this.findViewById(R.id.btn20);
        final Button btn21 = (Button) this.findViewById(R.id.btn21);
        final Button btn22 = (Button) this.findViewById(R.id.btn22);
        final Button btn23 = (Button) this.findViewById(R.id.btn23);
        final Button btn24 = (Button) this.findViewById(R.id.btn24);
        final Button btn25 = (Button) this.findViewById(R.id.btn25);
        final Button btn26 = (Button) this.findViewById(R.id.btn26);
        final Button btn27 = (Button) this.findViewById(R.id.btn27);
        final Button btn28 = (Button) this.findViewById(R.id.btn28);
        final Button btn29 = (Button) this.findViewById(R.id.btn29);
        final Button btn30 = (Button) this.findViewById(R.id.btn30);

        final Button btn31 = (Button) this.findViewById(R.id.btn31);
        final Button btn32 = (Button) this.findViewById(R.id.btn32);
        final Button btn33 = (Button) this.findViewById(R.id.btn33);
        final Button btn34 = (Button) this.findViewById(R.id.btn34);
        final Button btn35 = (Button) this.findViewById(R.id.btn35);
        final Button btn36 = (Button) this.findViewById(R.id.btn36);
        final Button btn37 = (Button) this.findViewById(R.id.btn37);
        final Button btn38 = (Button) this.findViewById(R.id.btn38);
        final Button btn39 = (Button) this.findViewById(R.id.btn39);
        final Button btn40 = (Button) this.findViewById(R.id.btn40);

        final Button btn41 = (Button) this.findViewById(R.id.btn41);
        final Button btn42 = (Button) this.findViewById(R.id.btn42);
        final Button btn43 = (Button) this.findViewById(R.id.btn43);
        final Button btn44 = (Button) this.findViewById(R.id.btn44);
        final Button btn45 = (Button) this.findViewById(R.id.btn45);
        final Button btn46 = (Button) this.findViewById(R.id.btn46);
        final Button btn47 = (Button) this.findViewById(R.id.btn47);
        final Button btn48 = (Button) this.findViewById(R.id.btn48);
        final Button btn49 = (Button) this.findViewById(R.id.btn49);
        final Button btn50 = (Button) this.findViewById(R.id.btn50);

        final Button btn51 = (Button) this.findViewById(R.id.btn51);
        final Button btn52 = (Button) this.findViewById(R.id.btn52);
        final Button btn53 = (Button) this.findViewById(R.id.btn53);
        final Button btn54 = (Button) this.findViewById(R.id.btn54);
        final Button btn55 = (Button) this.findViewById(R.id.btn55);
        final Button btn56 = (Button) this.findViewById(R.id.btn56);
        final Button btn57 = (Button) this.findViewById(R.id.btn57);
        final Button btn58 = (Button) this.findViewById(R.id.btn58);
        final Button btn59 = (Button) this.findViewById(R.id.btn59);
        final Button btn60 = (Button) this.findViewById(R.id.btn60);

        final Button btn61 = (Button) this.findViewById(R.id.btn61);
        final Button btn62 = (Button) this.findViewById(R.id.btn62);
        final Button btn63 = (Button) this.findViewById(R.id.btn63);
        final Button btn64 = (Button) this.findViewById(R.id.btn64);
        final Button btn65 = (Button) this.findViewById(R.id.btn65);
        final Button btn66 = (Button) this.findViewById(R.id.btn66);
        final Button btn67 = (Button) this.findViewById(R.id.btn67);
        final Button btn68 = (Button) this.findViewById(R.id.btn68);
        final Button btn69 = (Button) this.findViewById(R.id.btn69);
        final Button btn70 = (Button) this.findViewById(R.id.btn70);

        final Button btn71 = (Button) this.findViewById(R.id.btn71);
        final Button btn72 = (Button) this.findViewById(R.id.btn72);
        final Button btn73 = (Button) this.findViewById(R.id.btn73);
        final Button btn74 = (Button) this.findViewById(R.id.btn74);
        final Button btn75 = (Button) this.findViewById(R.id.btn75);
        final Button btn76 = (Button) this.findViewById(R.id.btn76);
        final Button btn77 = (Button) this.findViewById(R.id.btn77);
        final Button btn78 = (Button) this.findViewById(R.id.btn78);
        final Button btn79 = (Button) this.findViewById(R.id.btn79);
        final Button btn80 = (Button) this.findViewById(R.id.btn80);

        final Button btn81 = (Button) this.findViewById(R.id.btn81);

        soundPool.play(clap_funk_5, 1.0f, 1.0f, 0, 0, 1f);

        // コンピューター初手
        ComputerPlay_5();

        // アニメーション設定
        final RotateAnimation buttonRotation_5 = new RotateAnimation(360.0f, 0.0f,
                Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
        buttonRotation_5.setDuration(500);

        // 1行め
        btn01.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (flag_end_5 == 0) {
                    if (array_5[0][0] == 0) {
                        array_5[0][0] = -1;
                        btn01.setBackgroundResource(R.drawable.star_red);
                        soundPool.play(clap_funk_5, 1.0f, 1.0f, 0, 0, 1f);

                        btn01.startAnimation(buttonRotation_5);
                        Judgment_5();

                        ComputerPlay_5();
                        Judgment_5();
                    }
                }
            }
        });

        btn02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flag_end_5 == 0) {
                    if (array_5[0][1] == 0) {
                        array_5[0][1] = -1;
                        btn02.setBackgroundResource(R.drawable.star_red);
                        soundPool.play(clap_funk_5, 1.0f, 1.0f, 0, 0, 1f);

                        btn02.startAnimation(buttonRotation_5);
                        Judgment_5();

                        ComputerPlay_5();
                        Judgment_5();
                    }
                }
            }
        });

        btn03.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick(View v) {
                if (flag_end_5 == 0) {
                    if (array_5[0][2] == 0) {
                        array_5[0][2] = -1;
                        btn03.setBackgroundResource(R.drawable.star_red);
                        soundPool.play(clap_funk_5, 1.0f, 1.0f, 0, 0, 1f);

                        btn03.startAnimation(buttonRotation_5);
                        Judgment_5();

                        ComputerPlay_5();
                        Judgment_5();
                    }
                }
            }
        });

        btn04.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flag_end_5 == 0) {
                    if (array_5[0][3] == 0) {
                        array_5[0][3] = -1;
                        btn04.setBackgroundResource(R.drawable.star_red);
                        soundPool.play(clap_funk_5, 1.0f, 1.0f, 0, 0, 1f);

                        btn04.startAnimation(buttonRotation_5);
                        Judgment_5();

                        ComputerPlay_5();
                        Judgment_5();
                    }
                }
            }
        });

        btn05.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flag_end_5 == 0) {
                    if (array_5[0][4] == 0) {
                        array_5[0][4] = -1;
                        btn05.setBackgroundResource(R.drawable.star_red);
                        soundPool.play(clap_funk_5, 1.0f, 1.0f, 0, 0, 1f);

                        btn05.startAnimation(buttonRotation_5);
                        Judgment_5();

                        ComputerPlay_5();
                        Judgment_5();
                    }
                }
            }
        });

        btn06.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flag_end_5 == 0) {
                    if (array_5[0][5] == 0) {
                        array_5[0][5] = -1;
                        btn06.setBackgroundResource(R.drawable.star_red);
                        soundPool.play(clap_funk_5, 1.0f, 1.0f, 0, 0, 1f);

                        btn06.startAnimation(buttonRotation_5);
                        Judgment_5();

                        ComputerPlay_5();
                        Judgment_5();
                    }
                }
            }
        });

        btn07.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flag_end_5 == 0) {
                    if (array_5[0][6] == 0) {
                        array_5[0][6] = -1;
                        btn07.setBackgroundResource(R.drawable.star_red);
                        soundPool.play(clap_funk_5, 1.0f, 1.0f, 0, 0, 1f);

                        btn07.startAnimation(buttonRotation_5);
                        Judgment_5();

                        ComputerPlay_5();
                        Judgment_5();
                    }
                }
            }
        });

        btn08.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flag_end_5 == 0) {
                    if (array_5[0][7] == 0) {
                        array_5[0][7] = -1;
                        btn08.setBackgroundResource(R.drawable.star_red);
                        soundPool.play(clap_funk_5, 1.0f, 1.0f, 0, 0, 1f);

                        btn08.startAnimation(buttonRotation_5);
                        Judgment_5();

                        ComputerPlay_5();
                        Judgment_5();
                    }
                }
            }
        });

        btn09.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flag_end_5 == 0) {
                    if (array_5[0][8] == 0) {
                        array_5[0][8] = -1;
                        btn09.setBackgroundResource(R.drawable.star_red);
                        soundPool.play(clap_funk_5, 1.0f, 1.0f, 0, 0, 1f);

                        btn09.startAnimation(buttonRotation_5);
                        Judgment_5();

                        ComputerPlay_5();
                        Judgment_5();
                    }
                }
            }
        });

        // 2行め
        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flag_end_5 == 0) {
                    if (array_5[1][0] == 0) {
                        array_5[1][0] = -1;
                        btn10.setBackgroundResource(R.drawable.star_red);
                        soundPool.play(clap_funk_5, 1.0f, 1.0f, 0, 0, 1f);

                        btn10.startAnimation(buttonRotation_5);
                        Judgment_5();

                        ComputerPlay_5();
                        Judgment_5();
                    }
                }
            }
        });

        btn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flag_end_5 == 0) {
                    if (array_5[1][1] == 0) {
                        array_5[1][1] = -1;
                        btn11.setBackgroundResource(R.drawable.star_red);
                        soundPool.play(clap_funk_5, 1.0f, 1.0f, 0, 0, 1f);

                        btn11.startAnimation(buttonRotation_5);
                        Judgment_5();

                        ComputerPlay_5();
                        Judgment_5();
                    }
                }
            }
        });

        btn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flag_end_5 == 0) {
                    if (array_5[1][2] == 0) {
                        array_5[1][2] = -1;
                        btn12.setBackgroundResource(R.drawable.star_red);
                        soundPool.play(clap_funk_5, 1.0f, 1.0f, 0, 0, 1f);

                        btn12.startAnimation(buttonRotation_5);
                        Judgment_5();

                        ComputerPlay_5();
                        Judgment_5();
                    }
                }
            }
        });

        btn13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flag_end_5 == 0) {
                    if (array_5[1][3] == 0) {
                        array_5[1][3] = -1;
                        btn13.setBackgroundResource(R.drawable.star_red);
                        soundPool.play(clap_funk_5, 1.0f, 1.0f, 0, 0, 1f);

                        btn13.startAnimation(buttonRotation_5);
                        Judgment_5();

                        ComputerPlay_5();
                        Judgment_5();
                    }
                }
            }
        });

        btn14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flag_end_5 == 0) {
                    if (array_5[1][4] == 0) {
                        array_5[1][4] = -1;
                        btn14.setBackgroundResource(R.drawable.star_red);
                        soundPool.play(clap_funk_5, 1.0f, 1.0f, 0, 0, 1f);

                        btn14.startAnimation(buttonRotation_5);
                        Judgment_5();

                        ComputerPlay_5();
                        Judgment_5();
                    }
                }
            }
        });

        btn15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flag_end_5 == 0) {
                    if (array_5[1][5] == 0) {
                        array_5[1][5] = -1;
                        btn15.setBackgroundResource(R.drawable.star_red);
                        soundPool.play(clap_funk_5, 1.0f, 1.0f, 0, 0, 1f);

                        btn15.startAnimation(buttonRotation_5);
                        Judgment_5();

                        ComputerPlay_5();
                        Judgment_5();
                    }
                }
            }
        });

        btn16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flag_end_5 == 0) {
                    if (array_5[1][6] == 0) {
                        array_5[1][6] = -1;
                        btn16.setBackgroundResource(R.drawable.star_red);
                        soundPool.play(clap_funk_5, 1.0f, 1.0f, 0, 0, 1f);

                        btn16.startAnimation(buttonRotation_5);
                        Judgment_5();

                        ComputerPlay_5();
                        Judgment_5();
                    }
                }
            }
        });

        btn17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flag_end_5 == 0) {
                    if (array_5[1][7] == 0) {
                        array_5[1][7] = -1;
                        btn17.setBackgroundResource(R.drawable.star_red);
                        soundPool.play(clap_funk_5, 1.0f, 1.0f, 0, 0, 1f);

                        btn17.startAnimation(buttonRotation_5);
                        Judgment_5();

                        ComputerPlay_5();
                        Judgment_5();
                    }
                }
            }
        });

        btn18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flag_end_5 == 0) {
                    if (array_5[1][8] == 0) {
                        array_5[1][8] = -1;
                        btn18.setBackgroundResource(R.drawable.star_red);
                        soundPool.play(clap_funk_5, 1.0f, 1.0f, 0, 0, 1f);

                        btn18.startAnimation(buttonRotation_5);
                        Judgment_5();

                        ComputerPlay_5();
                        Judgment_5();
                    }
                }
            }
        });

        // 3行め
        btn19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flag_end_5 == 0) {
                    if (array_5[2][0] == 0) {
                        array_5[2][0] = -1;
                        btn19.setBackgroundResource(R.drawable.star_red);
                        soundPool.play(clap_funk_5, 1.0f, 1.0f, 0, 0, 1f);

                        btn19.startAnimation(buttonRotation_5);
                        Judgment_5();

                        ComputerPlay_5();
                        Judgment_5();
                    }
                }
            }
        });

        btn20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flag_end_5 == 0) {
                    if (array_5[2][1] == 0) {
                        array_5[2][1] = -1;
                        btn20.setBackgroundResource(R.drawable.star_red);
                        soundPool.play(clap_funk_5, 1.0f, 1.0f, 0, 0, 1f);

                        btn20.startAnimation(buttonRotation_5);
                        Judgment_5();

                        ComputerPlay_5();
                        Judgment_5();
                    }
                }
            }
        });

        btn21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flag_end_5 == 0) {
                    if (array_5[2][2] == 0) {
                        array_5[2][2] = -1;
                        btn21.setBackgroundResource(R.drawable.star_red);
                        soundPool.play(clap_funk_5, 1.0f, 1.0f, 0, 0, 1f);

                        btn21.startAnimation(buttonRotation_5);
                        Judgment_5();

                        ComputerPlay_5();
                        Judgment_5();
                    }
                }
            }
        });

        btn22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flag_end_5 == 0) {
                    if (array_5[2][3] == 0) {
                        array_5[2][3] = -1;
                        btn22.setBackgroundResource(R.drawable.star_red);
                        soundPool.play(clap_funk_5, 1.0f, 1.0f, 0, 0, 1f);

                        btn22.startAnimation(buttonRotation_5);
                        Judgment_5();

                        ComputerPlay_5();
                        Judgment_5();
                    }
                }
            }
        });

        btn23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flag_end_5 == 0) {
                    if (array_5[2][4] == 0) {
                        array_5[2][4] = -1;
                        btn23.setBackgroundResource(R.drawable.star_red);
                        soundPool.play(clap_funk_5, 1.0f, 1.0f, 0, 0, 1f);

                        btn23.startAnimation(buttonRotation_5);
                        Judgment_5();

                        ComputerPlay_5();
                        Judgment_5();
                    }
                }
            }
        });

        btn24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flag_end_5 == 0) {
                    if (array_5[2][5] == 0) {
                        array_5[2][5] = -1;
                        btn24.setBackgroundResource(R.drawable.star_red);
                        soundPool.play(clap_funk_5, 1.0f, 1.0f, 0, 0, 1f);

                        btn24.startAnimation(buttonRotation_5);
                        Judgment_5();

                        ComputerPlay_5();
                        Judgment_5();
                    }
                }
            }
        });

        btn25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flag_end_5 == 0) {
                    if (array_5[2][6] == 0) {
                        array_5[2][6] = -1;
                        btn25.setBackgroundResource(R.drawable.star_red);
                        soundPool.play(clap_funk_5, 1.0f, 1.0f, 0, 0, 1f);

                        btn25.startAnimation(buttonRotation_5);
                        Judgment_5();

                        ComputerPlay_5();
                        Judgment_5();
                    }
                }
            }
        });

        btn26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flag_end_5 == 0) {
                    if (array_5[2][7] == 0) {
                        array_5[2][7] = -1;
                        btn26.setBackgroundResource(R.drawable.star_red);
                        soundPool.play(clap_funk_5, 1.0f, 1.0f, 0, 0, 1f);

                        btn26.startAnimation(buttonRotation_5);
                        Judgment_5();

                        ComputerPlay_5();
                        Judgment_5();
                    }
                }
            }
        });

        btn27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flag_end_5 == 0) {
                    if (array_5[2][8] == 0) {
                        array_5[2][8] = -1;
                        btn27.setBackgroundResource(R.drawable.star_red);
                        soundPool.play(clap_funk_5, 1.0f, 1.0f, 0, 0, 1f);

                        btn27.startAnimation(buttonRotation_5);
                        Judgment_5();

                        ComputerPlay_5();
                        Judgment_5();
                    }
                }
            }
        });

        // 4行め
        btn28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flag_end_5 == 0) {
                    if (array_5[3][0] == 0) {
                        array_5[3][0] = -1;
                        btn28.setBackgroundResource(R.drawable.star_red);
                        soundPool.play(clap_funk_5, 1.0f, 1.0f, 0, 0, 1f);

                        btn28.startAnimation(buttonRotation_5);
                        Judgment_5();

                        ComputerPlay_5();
                        Judgment_5();
                    }
                }
            }
        });

        btn29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flag_end_5 == 0) {
                    if (array_5[3][1] == 0) {
                        array_5[3][1] = -1;
                        btn29.setBackgroundResource(R.drawable.star_red);
                        soundPool.play(clap_funk_5, 1.0f, 1.0f, 0, 0, 1f);

                        btn29.startAnimation(buttonRotation_5);
                        Judgment_5();

                        ComputerPlay_5();
                        Judgment_5();
                    }
                }
            }
        });

        btn30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flag_end_5 == 0) {
                    if (array_5[3][2] == 0) {
                        array_5[3][2] = -1;
                        btn30.setBackgroundResource(R.drawable.star_red);
                        soundPool.play(clap_funk_5, 1.0f, 1.0f, 0, 0, 1f);

                        btn30.startAnimation(buttonRotation_5);
                        Judgment_5();

                        ComputerPlay_5();
                        Judgment_5();
                    }
                }
            }
        });

        btn31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flag_end_5 == 0) {
                    if (array_5[3][3] == 0) {
                        array_5[3][3] = -1;
                        btn31.setBackgroundResource(R.drawable.star_red);
                        soundPool.play(clap_funk_5, 1.0f, 1.0f, 0, 0, 1f);

                        btn31.startAnimation(buttonRotation_5);
                        Judgment_5();

                        ComputerPlay_5();
                        Judgment_5();
                    }
                }
            }
        });

        btn32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flag_end_5 == 0) {
                    if (array_5[3][4] == 0) {
                        array_5[3][4] = -1;
                        btn32.setBackgroundResource(R.drawable.star_red);
                        soundPool.play(clap_funk_5, 1.0f, 1.0f, 0, 0, 1f);

                        btn32.startAnimation(buttonRotation_5);
                        Judgment_5();

                        ComputerPlay_5();
                        Judgment_5();
                    }
                }
            }
        });

        btn33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flag_end_5 == 0) {
                    if (array_5[3][5] == 0) {
                        array_5[3][5] = -1;
                        btn33.setBackgroundResource(R.drawable.star_red);
                        soundPool.play(clap_funk_5, 1.0f, 1.0f, 0, 0, 1f);

                        btn33.startAnimation(buttonRotation_5);
                        Judgment_5();

                        ComputerPlay_5();
                        Judgment_5();
                    }
                }
            }
        });

        btn34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flag_end_5 == 0) {
                    if (array_5[3][6] == 0) {
                        array_5[3][6] = -1;
                        btn34.setBackgroundResource(R.drawable.star_red);
                        soundPool.play(clap_funk_5, 1.0f, 1.0f, 0, 0, 1f);

                        btn34.startAnimation(buttonRotation_5);
                        Judgment_5();

                        ComputerPlay_5();
                        Judgment_5();
                    }
                }
            }
        });

        btn35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flag_end_5 == 0) {
                    if (array_5[3][7] == 0) {
                        array_5[3][7] = -1;
                        btn35.setBackgroundResource(R.drawable.star_red);
                        soundPool.play(clap_funk_5, 1.0f, 1.0f, 0, 0, 1f);

                        btn35.startAnimation(buttonRotation_5);
                        Judgment_5();

                        ComputerPlay_5();
                        Judgment_5();
                    }
                }
            }
        });

        btn36.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flag_end_5 == 0) {
                    if (array_5[3][8] == 0) {
                        array_5[3][8] = -1;
                        btn36.setBackgroundResource(R.drawable.star_red);
                        soundPool.play(clap_funk_5, 1.0f, 1.0f, 0, 0, 1f);

                        btn36.startAnimation(buttonRotation_5);
                        Judgment_5();

                        ComputerPlay_5();
                        Judgment_5();
                    }
                }
            }
        });

        // 5行め
        btn37.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flag_end_5 == 0) {
                    if (array_5[4][0] == 0) {
                        array_5[4][0] = -1;
                        btn37.setBackgroundResource(R.drawable.star_red);
                        soundPool.play(clap_funk_5, 1.0f, 1.0f, 0, 0, 1f);

                        btn37.startAnimation(buttonRotation_5);
                        Judgment_5();

                        ComputerPlay_5();
                        Judgment_5();
                    }
                }
            }
        });

        btn38.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flag_end_5 == 0) {
                    if (array_5[4][1] == 0) {
                        array_5[4][1] = -1;
                        btn38.setBackgroundResource(R.drawable.star_red);
                        soundPool.play(clap_funk_5, 1.0f, 1.0f, 0, 0, 1f);

                        btn38.startAnimation(buttonRotation_5);
                        Judgment_5();

                        ComputerPlay_5();
                        Judgment_5();
                    }
                }
            }
        });

        btn39.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flag_end_5 == 0) {
                    if (array_5[4][2] == 0) {
                        array_5[4][2] = -1;
                        btn39.setBackgroundResource(R.drawable.star_red);
                        soundPool.play(clap_funk_5, 1.0f, 1.0f, 0, 0, 1f);

                        btn39.startAnimation(buttonRotation_5);
                        Judgment_5();

                        ComputerPlay_5();
                        Judgment_5();
                    }
                }
            }
        });

        btn40.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flag_end_5 == 0) {
                    if (array_5[4][3] == 0) {
                        array_5[4][3] = -1;
                        btn40.setBackgroundResource(R.drawable.star_red);
                        soundPool.play(clap_funk_5, 1.0f, 1.0f, 0, 0, 1f);

                        btn40.startAnimation(buttonRotation_5);
                        Judgment_5();

                        ComputerPlay_5();
                        Judgment_5();
                    }
                }
            }
        });

        btn41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flag_end_5 == 0) {
                    if (array_5[4][4] == 0) {
                        array_5[4][4] = -1;
                        btn41.setBackgroundResource(R.drawable.star_red);
                        soundPool.play(clap_funk_5, 1.0f, 1.0f, 0, 0, 1f);

                        btn41.startAnimation(buttonRotation_5);
                        Judgment_5();

                        ComputerPlay_5();
                        Judgment_5();
                    }
                }
            }
        });

        btn42.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flag_end_5 == 0) {
                    if (array_5[4][5] == 0) {
                        array_5[4][5] = -1;
                        btn42.setBackgroundResource(R.drawable.star_red);
                        soundPool.play(clap_funk_5, 1.0f, 1.0f, 0, 0, 1f);

                        btn42.startAnimation(buttonRotation_5);
                        Judgment_5();

                        ComputerPlay_5();
                        Judgment_5();
                    }
                }
            }
        });

        btn43.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flag_end_5 == 0) {
                    if (array_5[4][6] == 0) {
                        array_5[4][6] = -1;
                        btn43.setBackgroundResource(R.drawable.star_red);
                        soundPool.play(clap_funk_5, 1.0f, 1.0f, 0, 0, 1f);

                        btn43.startAnimation(buttonRotation_5);
                        Judgment_5();

                        ComputerPlay_5();
                        Judgment_5();
                    }
                }
            }
        });

        btn44.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flag_end_5 == 0) {
                    if (array_5[4][7] == 0) {
                        array_5[4][7] = -1;
                        btn44.setBackgroundResource(R.drawable.star_red);
                        soundPool.play(clap_funk_5, 1.0f, 1.0f, 0, 0, 1f);

                        btn44.startAnimation(buttonRotation_5);
                        Judgment_5();

                        ComputerPlay_5();
                        Judgment_5();
                    }
                }
            }
        });

        btn45.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flag_end_5 == 0) {
                    if (array_5[4][8] == 0) {
                        array_5[4][8] = -1;
                        btn45.setBackgroundResource(R.drawable.star_red);
                        soundPool.play(clap_funk_5, 1.0f, 1.0f, 0, 0, 1f);

                        btn45.startAnimation(buttonRotation_5);
                        Judgment_5();

                        ComputerPlay_5();
                        Judgment_5();
                    }
                }
            }
        });

        // 6行め
        btn46.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flag_end_5 == 0) {
                    if (array_5[5][0] == 0) {
                        array_5[5][0] = -1;
                        btn46.setBackgroundResource(R.drawable.star_red);
                        soundPool.play(clap_funk_5, 1.0f, 1.0f, 0, 0, 1f);

                        btn46.startAnimation(buttonRotation_5);
                        Judgment_5();

                        ComputerPlay_5();
                        Judgment_5();
                    }
                }
            }
        });

        btn47.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flag_end_5 == 0) {
                    if (array_5[5][1] == 0) {
                        array_5[5][1] = -1;
                        btn47.setBackgroundResource(R.drawable.star_red);
                        soundPool.play(clap_funk_5, 1.0f, 1.0f, 0, 0, 1f);

                        btn47.startAnimation(buttonRotation_5);
                        Judgment_5();

                        ComputerPlay_5();
                        Judgment_5();
                    }
                }
            }
        });

        btn48.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flag_end_5 == 0) {
                    if (array_5[5][2] == 0) {
                        array_5[5][2] = -1;
                        btn48.setBackgroundResource(R.drawable.star_red);
                        soundPool.play(clap_funk_5, 1.0f, 1.0f, 0, 0, 1f);

                        btn48.startAnimation(buttonRotation_5);
                        Judgment_5();

                        ComputerPlay_5();
                        Judgment_5();
                    }
                }
            }
        });

        btn49.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flag_end_5 == 0) {
                    if (array_5[5][3] == 0) {
                        array_5[5][3] = -1;
                        btn49.setBackgroundResource(R.drawable.star_red);
                        soundPool.play(clap_funk_5, 1.0f, 1.0f, 0, 0, 1f);

                        btn49.startAnimation(buttonRotation_5);
                        Judgment_5();

                        ComputerPlay_5();
                        Judgment_5();
                    }
                }
            }
        });

        btn50.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flag_end_5 == 0) {
                    if (array_5[5][4] == 0) {
                        array_5[5][4] = -1;
                        btn50.setBackgroundResource(R.drawable.star_red);
                        soundPool.play(clap_funk_5, 1.0f, 1.0f, 0, 0, 1f);

                        btn50.startAnimation(buttonRotation_5);
                        Judgment_5();

                        ComputerPlay_5();
                        Judgment_5();
                    }
                }
            }
        });

        btn51.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flag_end_5 == 0) {
                    if (array_5[5][5] == 0) {
                        array_5[5][5] = -1;
                        btn51.setBackgroundResource(R.drawable.star_red);
                        soundPool.play(clap_funk_5, 1.0f, 1.0f, 0, 0, 1f);

                        btn51.startAnimation(buttonRotation_5);
                        Judgment_5();

                        ComputerPlay_5();
                        Judgment_5();
                    }
                }
            }
        });

        btn52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flag_end_5 == 0) {
                    if (array_5[5][6] == 0) {
                        array_5[5][6] = -1;
                        btn52.setBackgroundResource(R.drawable.star_red);
                        soundPool.play(clap_funk_5, 1.0f, 1.0f, 0, 0, 1f);

                        btn52.startAnimation(buttonRotation_5);
                        Judgment_5();

                        ComputerPlay_5();
                        Judgment_5();
                    }
                }
            }
        });

        btn53.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flag_end_5 == 0) {
                    if (array_5[5][7] == 0) {
                        array_5[5][7] = -1;
                        btn53.setBackgroundResource(R.drawable.star_red);
                        soundPool.play(clap_funk_5, 1.0f, 1.0f, 0, 0, 1f);

                        btn53.startAnimation(buttonRotation_5);
                        Judgment_5();

                        ComputerPlay_5();
                        Judgment_5();
                    }
                }
            }
        });
        btn54.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flag_end_5 == 0) {
                    if (array_5[5][8] == 0) {
                        array_5[5][8] = -1;
                        btn54.setBackgroundResource(R.drawable.star_red);
                        soundPool.play(clap_funk_5, 1.0f, 1.0f, 0, 0, 1f);

                        btn54.startAnimation(buttonRotation_5);
                        Judgment_5();

                        ComputerPlay_5();
                        Judgment_5();
                    }
                }
            }
        });

        // 7行め
        btn55.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flag_end_5 == 0) {
                    if (array_5[6][0] == 0) {
                        array_5[6][0] = -1;
                        btn55.setBackgroundResource(R.drawable.star_red);
                        soundPool.play(clap_funk_5, 1.0f, 1.0f, 0, 0, 1f);

                        btn55.startAnimation(buttonRotation_5);
                        Judgment_5();

                        ComputerPlay_5();
                        Judgment_5();
                    }
                }
            }
        });
        btn56.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flag_end_5 == 0) {
                    if (array_5[6][1] == 0) {
                        array_5[6][1] = -1;
                        btn56.setBackgroundResource(R.drawable.star_red);
                        soundPool.play(clap_funk_5, 1.0f, 1.0f, 0, 0, 1f);

                        btn56.startAnimation(buttonRotation_5);
                        Judgment_5();

                        ComputerPlay_5();
                        Judgment_5();
                    }
                }
            }
        });
        btn57.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flag_end_5 == 0) {
                    if (array_5[6][2] == 0) {
                        array_5[6][2] = -1;
                        btn57.setBackgroundResource(R.drawable.star_red);
                        soundPool.play(clap_funk_5, 1.0f, 1.0f, 0, 0, 1f);

                        btn57.startAnimation(buttonRotation_5);
                        Judgment_5();

                        ComputerPlay_5();
                        Judgment_5();
                    }
                }
            }
        });
        btn58.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flag_end_5 == 0) {
                    if (array_5[6][3] == 0) {
                        array_5[6][3] = -1;
                        btn58.setBackgroundResource(R.drawable.star_red);
                        soundPool.play(clap_funk_5, 1.0f, 1.0f, 0, 0, 1f);

                        btn58.startAnimation(buttonRotation_5);
                        Judgment_5();

                        ComputerPlay_5();
                        Judgment_5();
                    }
                }
            }
        });
        btn59.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flag_end_5 == 0) {
                    if (array_5[6][4] == 0) {
                        array_5[6][4] = -1;
                        btn59.setBackgroundResource(R.drawable.star_red);
                        soundPool.play(clap_funk_5, 1.0f, 1.0f, 0, 0, 1f);

                        btn59.startAnimation(buttonRotation_5);
                        Judgment_5();

                        ComputerPlay_5();
                        Judgment_5();
                    }
                }
            }
        });
        btn60.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flag_end_5 == 0) {
                    if (array_5[6][5] == 0) {
                        array_5[6][5] = -1;
                        btn60.setBackgroundResource(R.drawable.star_red);
                        soundPool.play(clap_funk_5, 1.0f, 1.0f, 0, 0, 1f);

                        btn60.startAnimation(buttonRotation_5);
                        Judgment_5();

                        ComputerPlay_5();
                        Judgment_5();
                    }
                }
            }
        });


        btn61.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flag_end_5 == 0) {
                    if (array_5[6][6] == 0) {
                        array_5[6][6] = -1;
                        btn61.setBackgroundResource(R.drawable.star_red);
                        soundPool.play(clap_funk_5, 1.0f, 1.0f, 0, 0, 1f);

                        btn61.startAnimation(buttonRotation_5);
                        Judgment_5();

                        ComputerPlay_5();
                        Judgment_5();
                    }
                }
            }
        });
        btn62.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flag_end_5 == 0) {
                    if (array_5[6][7] == 0) {
                        array_5[6][7] = -1;
                        btn62.setBackgroundResource(R.drawable.star_red);
                        soundPool.play(clap_funk_5, 1.0f, 1.0f, 0, 0, 1f);

                        btn62.startAnimation(buttonRotation_5);
                        Judgment_5();

                        ComputerPlay_5();
                        Judgment_5();
                    }
                }
            }
        });
        btn63.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flag_end_5 == 0) {
                    if (array_5[6][8] == 0) {
                        array_5[6][8] = -1;
                        btn63.setBackgroundResource(R.drawable.star_red);
                        soundPool.play(clap_funk_5, 1.0f, 1.0f, 0, 0, 1f);

                        btn63.startAnimation(buttonRotation_5);
                        Judgment_5();

                        ComputerPlay_5();
                        Judgment_5();
                    }
                }
            }
        });

        // 8行め
        btn64.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flag_end_5 == 0) {
                    if (array_5[7][0] == 0) {
                        array_5[7][0] = -1;
                        btn64.setBackgroundResource(R.drawable.star_red);
                        soundPool.play(clap_funk_5, 1.0f, 1.0f, 0, 0, 1f);

                        btn64.startAnimation(buttonRotation_5);
                        Judgment_5();

                        ComputerPlay_5();
                        Judgment_5();
                    }
                }
            }
        });
        btn65.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flag_end_5 == 0) {
                    if (array_5[7][1] == 0) {
                        array_5[7][1] = -1;
                        btn65.setBackgroundResource(R.drawable.star_red);
                        soundPool.play(clap_funk_5, 1.0f, 1.0f, 0, 0, 1f);

                        btn65.startAnimation(buttonRotation_5);
                        Judgment_5();

                        ComputerPlay_5();
                        Judgment_5();
                    }
                }
            }
        });
        btn66.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flag_end_5 == 0) {
                    if (array_5[7][2] == 0) {
                        array_5[7][2] = -1;
                        btn66.setBackgroundResource(R.drawable.star_red);
                        soundPool.play(clap_funk_5, 1.0f, 1.0f, 0, 0, 1f);

                        btn66.startAnimation(buttonRotation_5);
                        Judgment_5();

                        ComputerPlay_5();
                        Judgment_5();
                    }
                }
            }
        });
        btn67.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flag_end_5 == 0) {
                    if (array_5[7][3] == 0) {
                        array_5[7][3] = -1;
                        btn67.setBackgroundResource(R.drawable.star_red);
                        soundPool.play(clap_funk_5, 1.0f, 1.0f, 0, 0, 1f);

                        btn67.startAnimation(buttonRotation_5);
                        Judgment_5();

                        ComputerPlay_5();
                        Judgment_5();
                    }
                }
            }
        });
        btn68.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flag_end_5 == 0) {
                    if (array_5[7][4] == 0) {
                        array_5[7][4] = -1;
                        btn68.setBackgroundResource(R.drawable.star_red);
                        soundPool.play(clap_funk_5, 1.0f, 1.0f, 0, 0, 1f);

                        btn68.startAnimation(buttonRotation_5);
                        Judgment_5();

                        ComputerPlay_5();
                        Judgment_5();
                    }
                }
            }
        });
        btn69.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flag_end_5 == 0) {
                    if (array_5[7][5] == 0) {
                        array_5[7][5] = -1;
                        btn69.setBackgroundResource(R.drawable.star_red);
                        soundPool.play(clap_funk_5, 1.0f, 1.0f, 0, 0, 1f);

                        btn69.startAnimation(buttonRotation_5);
                        Judgment_5();

                        ComputerPlay_5();
                        Judgment_5();
                    }
                }
            }
        });
        btn70.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flag_end_5 == 0) {
                    if (array_5[7][6] == 0) {
                        array_5[7][6] = -1;
                        btn70.setBackgroundResource(R.drawable.star_red);
                        soundPool.play(clap_funk_5, 1.0f, 1.0f, 0, 0, 1f);

                        btn70.startAnimation(buttonRotation_5);
                        Judgment_5();

                        ComputerPlay_5();
                        Judgment_5();
                    }
                }
            }
        });


        btn71.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flag_end_5 == 0) {
                    if (array_5[7][7] == 0) {
                        array_5[7][7] = -1;
                        btn71.setBackgroundResource(R.drawable.star_red);
                        soundPool.play(clap_funk_5, 1.0f, 1.0f, 0, 0, 1f);

                        btn71.startAnimation(buttonRotation_5);
                        Judgment_5();

                        ComputerPlay_5();
                        Judgment_5();
                    }
                }
            }
        });
        btn72.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flag_end_5 == 0) {
                    if (array_5[7][8] == 0) {
                        array_5[7][8] = -1;
                        btn72.setBackgroundResource(R.drawable.star_red);
                        soundPool.play(clap_funk_5, 1.0f, 1.0f, 0, 0, 1f);

                        btn72.startAnimation(buttonRotation_5);
                        Judgment_5();

                        ComputerPlay_5();
                        Judgment_5();
                    }
                }
            }
        });

        // 9行め
        btn73.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flag_end_5 == 0) {
                    if (array_5[8][0] == 0) {
                        array_5[8][0] = -1;
                        btn73.setBackgroundResource(R.drawable.star_red);
                        soundPool.play(clap_funk_5, 1.0f, 1.0f, 0, 0, 1f);

                        btn73.startAnimation(buttonRotation_5);
                        Judgment_5();

                        ComputerPlay_5();
                        Judgment_5();
                    }
                }
            }
        });
        btn74.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flag_end_5 == 0) {
                    if (array_5[8][1] == 0) {
                        array_5[8][1] = -1;
                        btn74.setBackgroundResource(R.drawable.star_red);
                        soundPool.play(clap_funk_5, 1.0f, 1.0f, 0, 0, 1f);

                        btn74.startAnimation(buttonRotation_5);
                        Judgment_5();

                        ComputerPlay_5();
                        Judgment_5();
                    }
                }
            }
        });
        btn75.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flag_end_5 == 0) {
                    if (array_5[8][2] == 0) {
                        array_5[8][2] = -1;
                        btn75.setBackgroundResource(R.drawable.star_red);
                        soundPool.play(clap_funk_5, 1.0f, 1.0f, 0, 0, 1f);

                        btn75.startAnimation(buttonRotation_5);
                        Judgment_5();

                        ComputerPlay_5();
                        Judgment_5();
                    }
                }
            }
        });
        btn76.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flag_end_5 == 0) {
                    if (array_5[8][3] == 0) {
                        array_5[8][3] = -1;
                        btn76.setBackgroundResource(R.drawable.star_red);
                        soundPool.play(clap_funk_5, 1.0f, 1.0f, 0, 0, 1f);

                        btn76.startAnimation(buttonRotation_5);
                        Judgment_5();

                        ComputerPlay_5();
                        Judgment_5();
                    }
                }
            }
        });
        btn77.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flag_end_5 == 0) {
                    if (array_5[8][4] == 0) {
                        array_5[8][4] = -1;
                        btn77.setBackgroundResource(R.drawable.star_red);
                        soundPool.play(clap_funk_5, 1.0f, 1.0f, 0, 0, 1f);

                        btn77.startAnimation(buttonRotation_5);
                        Judgment_5();

                        ComputerPlay_5();
                        Judgment_5();
                    }
                }
            }
        });
        btn78.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flag_end_5 == 0) {
                    if (array_5[8][5] == 0) {
                        array_5[8][5] = -1;
                        btn78.setBackgroundResource(R.drawable.star_red);
                        soundPool.play(clap_funk_5, 1.0f, 1.0f, 0, 0, 1f);

                        btn78.startAnimation(buttonRotation_5);
                        Judgment_5();

                        ComputerPlay_5();
                        Judgment_5();
                    }
                }
            }
        });
        btn79.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flag_end_5 == 0) {
                    if (array_5[8][6] == 0) {
                        array_5[8][6] = -1;
                        btn79.setBackgroundResource(R.drawable.star_red);
                        soundPool.play(clap_funk_5, 1.0f, 1.0f, 0, 0, 1f);

                        btn79.startAnimation(buttonRotation_5);
                        Judgment_5();

                        ComputerPlay_5();
                        Judgment_5();
                    }
                }
            }
        });
        btn80.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flag_end_5 == 0) {
                    if (array_5[8][7] == 0) {
                        array_5[8][7] = -1;
                        btn80.setBackgroundResource(R.drawable.star_red);
                        soundPool.play(clap_funk_5, 1.0f, 1.0f, 0, 0, 1f);

                        btn80.startAnimation(buttonRotation_5);
                        Judgment_5();

                        ComputerPlay_5();
                        Judgment_5();
                    }
                }
            }
        });

        btn81.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flag_end_5 == 0) {
                    if (array_5[8][8] == 0) {
                        array_5[8][8] = -1;
                        btn81.setBackgroundResource(R.drawable.star_red);
                        soundPool.play(clap_funk_5, 1.0f, 1.0f, 0, 0, 1f);

                        btn81.startAnimation(buttonRotation_5);
                        Judgment_5();

                        ComputerPlay_5();
                        Judgment_5();
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