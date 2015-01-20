package irdc.gallary;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.View.OnFocusChangeListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.umeng.analytics.MobclickAgent;

//今日股市，，程序员求签...
public class Choose2 extends Activity {
    private ImageView g_01Button, buttonStock;
    private ImageView g_02Button;
    private ImageView g_03Button;

    public boolean onTouchEvent(MotionEvent event) {
        if (event.getPointerCount() > 1) {
            Intent intent = new Intent();
            intent.setClass(Choose2.this, ChooseMain.class);
            startActivity(intent);
            ChooseMain.myMediaPlayer.stop();
            Choose2.this.finish();
        }

        return super.onTouchEvent(event);
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {

        //按下键盘上返回按钮
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            Choose2.this.finish();
            return true;
        } else {
            return super.onKeyDown(keyCode, event);
        }
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //隐藏状态栏，使imageview全屏显示
        this.getWindow().setFlags
                (
                        WindowManager.LayoutParams.FLAG_FULLSCREEN,
                        WindowManager.LayoutParams.FLAG_FULLSCREEN
                );
        //隐藏标题栏
        requestWindowFeature(Window.FEATURE_NO_TITLE);

        setContentView(R.layout.main2);
        buttonStock = (ImageView) findViewById(R.id.button_stock);
        g_01Button = (ImageView) findViewById(R.id.button1);
        g_02Button = (ImageView) findViewById(R.id.button2);
        g_03Button = (ImageView) findViewById(R.id.button3);
        Toast toast = Toast.makeText(Choose2.this, "多点触控屏幕以返回上一级", Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.TOP, 10, 10);
        toast.show();
        g_01Button.setOnFocusChangeListener(new OnFocusChangeListener() {
            public void onFocusChange(View arg0, boolean isFocused) {
                g_01Button.setImageResource(R.drawable.cards_1_down);
            }
        });
        g_01Button.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                g_01Button.setImageResource(R.drawable.cards_1_down);
                Intent intent = new Intent();
                intent.setClass(Choose2.this, shuffle.class);
                Bundle bundle = new Bundle();
                bundle.putInt("key", 1);
                intent.putExtras(bundle);
                //调用一个新的Activity
                startActivity(intent);
                //关闭原本的Activity
                Choose2.this.finish();
            }
        });
        g_02Button.setOnFocusChangeListener(new OnFocusChangeListener() {
            public void onFocusChange(View arg0, boolean isFocused) {
                g_02Button.setImageResource(R.drawable.cards_2_down);
            }
        });
        g_02Button.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                g_02Button.setImageResource(R.drawable.cards_2_down);
                Intent intent = new Intent();
                intent.setClass(Choose2.this, shuffle.class);
                Bundle bundle = new Bundle();
                bundle.putInt("key", 2);
                intent.putExtras(bundle);
                //调用一个新的Activity
                startActivity(intent);
            }
        });
        g_03Button.setOnFocusChangeListener(new OnFocusChangeListener() {
            public void onFocusChange(View arg0, boolean isFocused) {
                g_03Button.setImageResource(R.drawable.cards_3_down);
            }
        });
        g_03Button.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                g_03Button.setImageResource(R.drawable.cards_3_down);
                Intent intent = new Intent();
                intent.setClass(Choose2.this, shuffle.class);
                Bundle bundle = new Bundle();
                bundle.putInt("key", 3);
                intent.putExtras(bundle);
                //调用一个新的Activity
                startActivity(intent);
            }
        });
        buttonStock.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                buttonStock.setImageResource(R.drawable.cards_stock_down);
                Intent intent = new Intent();
                intent.setClass(Choose2.this, shuffle.class);
                Bundle bundle = new Bundle();
                bundle.putInt("key", 0);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });

        initOtherButtons();
    }

    private void initOtherButtons() {
        ImageView button4, button5, button6, button7;
        button4 = (ImageView) findViewById(R.id.button4);
        button5 = (ImageView) findViewById(R.id.button5);
        button6 = (ImageView) findViewById(R.id.button6);
        button7 = (ImageView) findViewById(R.id.button7);
        button4.setOnClickListener(clickListener);
        button5.setOnClickListener(clickListener);
        button6.setOnClickListener(clickListener);
        button7.setOnClickListener(clickListener);

    }

    private View.OnClickListener clickListener = new View.OnClickListener() {

        @Override
        public void onClick(View view) {
            Intent intent = new Intent();
            intent.setClass(Choose2.this, CardArrayOther.class);
            startActivity(intent);
        }
    };

    public void onResume() {
        super.onResume();
        MobclickAgent.onResume(this);
    }
    public void onPause() {
        super.onPause();
        MobclickAgent.onPause(this);
    }
}