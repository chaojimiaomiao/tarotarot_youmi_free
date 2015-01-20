package irdc.gallary;

import net.youmi.android.AdManager;
import net.youmi.android.banner.AdSize;
import net.youmi.android.banner.AdView;
import net.youmi.android.banner.AdViewListener;
import net.youmi.android.spot.SpotManager;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.Toast;
import android.view.View.OnFocusChangeListener;

import com.umeng.analytics.MobclickAgent;
import com.umeng.update.UmengUpdateAgent;

@SuppressLint("NewApi") public class ChooseMain extends Activity {
    private ImageView g_01Button;
    private ImageView g_02Button;
    private ImageView gImageView;
    public static MediaPlayer myMediaPlayer;
    int i = 0;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.getWindow().setFlags
                (
                        WindowManager.LayoutParams.FLAG_FULLSCREEN,
                        WindowManager.LayoutParams.FLAG_FULLSCREEN
                );
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.main);
        UmengUpdateAgent.update(this);
        g_01Button = (ImageView) findViewById(R.id.button1);
        g_02Button = (ImageView) findViewById(R.id.button2);
        gImageView = (ImageView) findViewById(R.id.image1);
        myMediaPlayer = new MediaPlayer();
        myMediaPlayer = MediaPlayer.create(ChooseMain.this, R.raw.egypt);
        Toast.makeText(ChooseMain.this, "单击水晶球停止音乐", Toast.LENGTH_LONG).show();

        AdManager.getInstance(this).init("a00a0af2be98fb2d", "9e8947e5a99300cd", false);
        SpotManager.getInstance(ChooseMain.this).loadSpotAds();

        try {
            if (myMediaPlayer != null) {
                myMediaPlayer.stop();
            }
            myMediaPlayer.prepare();
            myMediaPlayer.start();
        } catch (Exception e) {
            // TODO: handle exception
        }
        
        View introView = findViewById(R.id.id_intro);
        
        introView.setOnTouchListener(new View.OnTouchListener()
        {
          
          @Override
          public boolean onTouch(View v, MotionEvent event)
          {
            v.setAlpha(0.6f);
            return false;
          }
        });
        introView.setOnClickListener(new View.OnClickListener()
        {
          
          @Override
          public void onClick(View v)
          {
            Intent intent = new Intent(ChooseMain.this, Intro.class);
            startActivity(intent);
            v.setAlpha(0);
          }
        });

        gImageView.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    if (i == 1) {
                        i = 0;
                        if (myMediaPlayer != null) {
                            Toast.makeText(ChooseMain.this, "开始", Toast.LENGTH_LONG).show();
                            myMediaPlayer.stop();
                        }
                        myMediaPlayer.prepare();
                        myMediaPlayer.start();
                    } else if (i == 0) {
                        i = 1;
                        if (myMediaPlayer != null) {
                            Toast.makeText(ChooseMain.this, "停止", Toast.LENGTH_LONG).show();
                            myMediaPlayer.stop();
                        }
                    }
                } catch (Exception e) {
                    // TODO: handle exception
                }
            }
        });

        g_01Button.setOnFocusChangeListener(new OnFocusChangeListener() {
            public void onFocusChange(View arg0, boolean isFocused) {
                g_01Button.setImageResource(R.drawable.gallary_selected);
            }
        });
        g_01Button.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                g_01Button.setImageResource(R.drawable.gallary_selected);
                Intent intent = new Intent();
                intent.setClass(ChooseMain.this, gallary.class);
                startActivity(intent);
                ChooseMain.this.finish();
            }
        });
        g_02Button.setOnFocusChangeListener(new OnFocusChangeListener() {
            public void onFocusChange(View arg0, boolean isFocused) {
                g_02Button.setImageResource(R.drawable.cards_selected);
            }
        });
        g_02Button.setOnClickListener(new Button.OnClickListener() {
                                          @Override
                                          public void onClick(View v) {
                                              g_02Button.setImageResource(R.drawable.cards_selected);
                                              Intent intent = new Intent();
                                              intent.setClass(ChooseMain.this, Choose2.class);
                                              startActivity(intent);
                                          }
                                      }
        );

    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {

        if (keyCode == KeyEvent.KEYCODE_BACK) {

            new AlertDialog.Builder(this)
                    .setIcon(R.drawable.hot)
                    .setTitle("提示")
                    .setMessage("您确定要关闭么？")
                    .setNegativeButton("取消", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                        }
                    })
                    .setPositiveButton("确定", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int whichButton) {
                            myMediaPlayer.stop();
                            ActivityManager manager = (ActivityManager) getSystemService(Context.ACTIVITY_SERVICE);
                            manager.restartPackage(getPackageName());
                            finish();
                            onDestroy();
                            android.os.Process.killProcess(android.os.Process.myPid());
                            System.exit(0);
                        }
                    }).show();

            return true;
        } else {
            return super.onKeyDown(keyCode, event);
        }
    }

    private void showBanner() {

        // 广告条接口调用（适用于应用）
        // 将广告条adView添加到需要展示的layout控件中
        // LinearLayout adLayout = (LinearLayout) findViewById(R.id.adLayout);
        // AdView adView = new AdView(this, AdSize.FIT_SCREEN);
        // adLayout.addView(adView);

        // 广告条接口调用（适用于游戏）

        // 实例化LayoutParams(重要)
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(FrameLayout.LayoutParams.WRAP_CONTENT,
                FrameLayout.LayoutParams.WRAP_CONTENT);
        // 设置广告条的悬浮位置
        layoutParams.gravity = Gravity.BOTTOM | Gravity.RIGHT; // 这里示例为右下角
        // 实例化广告条
        AdView adView = new AdView(this, AdSize.FIT_SCREEN);
        // 调用Activity的addContentView函数

        // 监听广告条接口
        adView.setAdListener(new AdViewListener() {

            @Override
            public void onSwitchedAd(AdView arg0) {
                Log.i("YoumiAdDemo", "广告条切换");
            }

            @Override
            public void onReceivedAd(AdView arg0) {
                Log.i("YoumiAdDemo", "请求广告成功");

            }

            @Override
            public void onFailedToReceivedAd(AdView arg0) {
                Log.i("YoumiAdDemo", "请求广告失败");
            }
        });
        this.addContentView(adView, layoutParams);
    }

    public void onResume() {
        super.onResume();
        MobclickAgent.onResume(this);
    }
    public void onPause() {
        super.onPause();
        MobclickAgent.onPause(this);
    }
}