package irdc.gallary;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;
import android.view.View.OnFocusChangeListener;

public class choose extends Activity {
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
        g_01Button = (ImageView) findViewById(R.id.button1);
        g_02Button = (ImageView) findViewById(R.id.button2);
        gImageView = (ImageView) findViewById(R.id.image1);
        myMediaPlayer = new MediaPlayer();
        myMediaPlayer = MediaPlayer.create(choose.this, R.raw.egypt);
        Toast.makeText(choose.this, "单击水晶球停止音乐", Toast.LENGTH_LONG).show();

        try {
            if (myMediaPlayer != null) {
                myMediaPlayer.stop();
            }
            myMediaPlayer.prepare();
            myMediaPlayer.start();
        } catch (Exception e) {
            // TODO: handle exception
        }

        gImageView.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    if (i == 1) {
                        i = 0;
                        if (myMediaPlayer != null) {
                            Toast.makeText(choose.this, "开始", Toast.LENGTH_LONG).show();
                            myMediaPlayer.stop();
                        }
                        myMediaPlayer.prepare();
                        myMediaPlayer.start();
                    } else if (i == 0) {
                        i = 1;
                        if (myMediaPlayer != null) {
                            Toast.makeText(choose.this, "停止", Toast.LENGTH_LONG).show();
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
                intent.setClass(choose.this, gallary.class);
                startActivity(intent);
                choose.this.finish();
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
                                              intent.setClass(choose.this, Choose2.class);
                                              startActivity(intent);
                                              choose.this.finish();
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


    static {

        //AdManager.init("  a00a0af2be98fb2d ", "9e8947e5a99300cd ", 31, false,"2.1");

    }
}