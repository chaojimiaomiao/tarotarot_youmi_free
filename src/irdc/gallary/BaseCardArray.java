package irdc.gallary;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import android.view.Window;
import android.view.WindowManager;

import java.util.ArrayList;

/**
 * Created by zhaibingjie on 14-12-19.
 */
public class BaseCardArray extends Activity implements View.OnClickListener {
    protected ArrayList<ImageButton> imageButtons;
    protected TextView hintTextView;

    @Override
    public void onCreate(android.os.Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //隐藏状态栏，使imageview全屏显示
        this.getWindow().setFlags (
                WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN
        );
        //隐藏标题栏
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        initViews();
    }

    public boolean onTouchEvent(MotionEvent event)
    {
        if(event.getPointerCount()>1)
        {
            Intent intent=new Intent();
            intent.setClass(BaseCardArray.this, Choose2.class);
            startActivity(intent);
            System.exit(0);
            BaseCardArray.this.finish();
        }

        return super.onTouchEvent(event);
    }

//    @Override
//    public boolean onKeyDown(int keyCode, KeyEvent event) {
//        if (keyCode == KeyEvent.KEYCODE_BACK) {
//            Intent intent = new Intent();
//            intent.setClass(cardarray2.this, Choose2.class);
//            startActivity(intent);
//            cardarray2.this.finish();
//            return true;
//        } else {
//            return super.onKeyDown(keyCode, event);
//        }
//    }

    protected void initViews() {

    }

    protected void seeYourCard(int randonNum, ImageView mImageButton1) {
        switch (randonNum) {
            case 0:
                mImageButton1.setImageResource(R.drawable.i0);
                hintTextView.setText("这是一张正位的愚人牌。现在点击牌面查看它的释义，你将根据它来回答你曾经的爱与抉择");
                break;
            case 1:
                mImageButton1.setImageResource(R.drawable.i1);
                hintTextView.setText("这是一张正位的魔术师牌。现在点击牌面查看它的释义，你将根据它来回答你曾经的爱与抉择");
                break;
            case 2:
                mImageButton1.setImageResource(R.drawable.i2);
                hintTextView.setText("这是一张正位的女祭司牌。现在点击牌面查看它的释义，你将根据它来回答你曾经的爱与抉择");
                break;
            case 3:
                mImageButton1.setImageResource(R.drawable.i3);
                hintTextView.setText("这是一张正位的女皇牌。现在点击牌面查看它的释义，你将根据它来回答你曾经的爱与抉择");
                break;
            case 4:
                mImageButton1.setImageResource(R.drawable.i4);
                hintTextView.setText("这是一张正位的皇帝牌。现在点击牌面查看它的释义，你将根据它来回答你曾经的爱与抉择");
                break;
            case 5:
                mImageButton1.setImageResource(R.drawable.i5);
                hintTextView.setText("这是一张正位的教宗牌。现在点击牌面查看它的释义，你将根据它来回答你曾经的爱与抉择");
                break;
            case 6:
                mImageButton1.setImageResource(R.drawable.i6);
                hintTextView.setText("这是一张正位的恋人牌。现在点击牌面查看它的释义，你将根据它来回答你曾经的爱与抉择");
                break;
            case 7:
                mImageButton1.setImageResource(R.drawable.i7);
                hintTextView.setText("这是一张正位的战车牌。现在点击牌面查看它的释义，你将根据它来回答你曾经的爱与抉择");
                break;
            case 8:
                mImageButton1.setImageResource(R.drawable.i8);
                hintTextView.setText("这是一张正位的力量牌。现在点击牌面查看它的释义，你将根据它来回答你曾经的爱与抉择");
                break;
            case 9:
                mImageButton1.setImageResource(R.drawable.i9);
                hintTextView.setText("这是一张正位的隐士牌。现在点击牌面查看它的释义，你将根据它来回答你曾经的爱与抉择");
                break;
            case 10:
                mImageButton1.setImageResource(R.drawable.i10);
                hintTextView.setText("这是一张正位的命运之轮牌。现在点击牌面查看它的释义，你将根据它来回答你曾经的爱与抉择");
                break;
            case 11:
                mImageButton1.setImageResource(R.drawable.i11);
                hintTextView.setText("这是一张正位的正义牌。现在点击牌面查看它的释义，你将根据它来回答你曾经的爱与抉择");
                break;
            case 12:
                mImageButton1.setImageResource(R.drawable.i12);
                hintTextView.setText("这是一张正位的倒吊者牌。现在点击牌面查看它的释义，你将根据它来回答你曾经的爱与抉择");
                break;
            case 13:
                mImageButton1.setImageResource(R.drawable.i13);
                hintTextView.setText("这是一张正位的死神牌。现在点击牌面查看它的释义，你将根据它来回答你曾经的爱与抉择");
                break;
            case 14:
                mImageButton1.setImageResource(R.drawable.i14);
                hintTextView.setText("这是一张正位的节制牌。现在点击牌面查看它的释义，你将根据它来回答你曾经的爱与抉择");
                break;
            case 15:
                mImageButton1.setImageResource(R.drawable.i15);
                hintTextView.setText("这是一张正位的恶魔牌。现在点击牌面查看它的释义，你将根据它来回答你曾经的爱与抉择");
                break;
            case 16:
                mImageButton1.setImageResource(R.drawable.i16);
                hintTextView.setText("这是一张正位的塔牌。现在点击牌面查看它的释义，你将根据它来回答你曾经的爱与抉择");
                break;
            case 17:
                mImageButton1.setImageResource(R.drawable.i17);
                hintTextView.setText("这是一张正位的星星牌。现在点击牌面查看它的释义，你将根据它来回答你曾经的爱与抉择");
                break;
            case 18:
                mImageButton1.setImageResource(R.drawable.i18);
                hintTextView.setText("这是一张正位的月亮牌。现在点击牌面查看它的释义，你将根据它来回答你曾经的爱与抉择");
                break;
            case 19:
                mImageButton1.setImageResource(R.drawable.i19);
                hintTextView.setText("这是一张正位的太阳牌。现在点击牌面查看它的释义，你将根据它来回答你曾经的爱与抉择");
                break;
            case 20:
                mImageButton1.setImageResource(R.drawable.i20);
                hintTextView.setText("这是一张正位的审判牌。现在点击牌面查看它的释义，你将根据它来回答你曾经的爱与抉择");
                break;
            case 21:
                mImageButton1.setImageResource(R.drawable.i21);
                hintTextView.setText("这是一张正位的世界牌。现在点击牌面查看它的释义，你将根据它来回答你曾经的爱与抉择");
                break;
            case 22:
                mImageButton1.setImageResource(R.drawable.i22);
                hintTextView.setText("这是一张逆位的愚人牌。现在点击牌面查看它的释义，你将根据它来回答你曾经的爱与抉择");
                break;
            case 23:
                mImageButton1.setImageResource(R.drawable.i23);
                hintTextView.setText("这是一张逆位的魔术师牌。现在点击牌面查看它的释义，你将根据它来回答你曾经的爱与抉择");
                break;
            case 24:
                mImageButton1.setImageResource(R.drawable.i24);
                hintTextView.setText("这是一张逆位的女祭司牌。现在点击牌面查看它的释义，你将根据它来回答你曾经的爱与抉择");
                break;
            case 25:
                mImageButton1.setImageResource(R.drawable.i25);
                hintTextView.setText("这是一张逆位的女皇牌。现在点击牌面查看它的释义，你将根据它来回答你曾经的爱与抉择");
                break;
            case 26:
                mImageButton1.setImageResource(R.drawable.i26);
                hintTextView.setText("这是一张逆位的皇帝牌。现在点击牌面查看它的释义，你将根据它来回答你曾经的爱与抉择");
                break;
            case 27:
                mImageButton1.setImageResource(R.drawable.i27);
                hintTextView.setText("这是一张逆位的教宗牌。现在点击牌面查看它的释义，你将根据它来回答你曾经的爱与抉择");
                break;
            case 28:
                mImageButton1.setImageResource(R.drawable.i28);
                hintTextView.setText("这是一张逆位的恋人牌。现在点击牌面查看它的释义，你将根据它来回答你曾经的爱与抉择");
                break;
            case 29:
                mImageButton1.setImageResource(R.drawable.i29);
                hintTextView.setText("这是一张逆位的战车牌。现在点击牌面查看它的释义，你将根据它来回答你曾经的爱与抉择");
                break;
            case 30:
                mImageButton1.setImageResource(R.drawable.i30);
                hintTextView.setText("这是一张逆位的力量牌。现在点击牌面查看它的释义，你将根据它来回答你曾经的爱与抉择");
                break;
            case 31:
                mImageButton1.setImageResource(R.drawable.i31);
                hintTextView.setText("这是一张逆位的隐士牌。现在点击牌面查看它的释义，你将根据它来回答你曾经的爱与抉择");
                break;
            case 32:
                mImageButton1.setImageResource(R.drawable.i32);
                hintTextView.setText("这是一张逆位的命运之轮牌。现在点击牌面查看它的释义，你将根据它来回答你曾经的爱与抉择");
                break;
            case 33:
                mImageButton1.setImageResource(R.drawable.i33);
                hintTextView.setText("这是一张逆位的正义牌。现在点击牌面查看它的释义，你将根据它来回答你曾经的爱与抉择");
                break;
            case 34:
                mImageButton1.setImageResource(R.drawable.i34);
                hintTextView.setText("这是一张逆位的倒吊者牌。现在点击牌面查看它的释义，你将根据它来回答你曾经的爱与抉择");
                break;
            case 35:
                mImageButton1.setImageResource(R.drawable.i35);
                hintTextView.setText("这是一张逆位的死神牌。现在点击牌面查看它的释义，你将根据它来回答你曾经的爱与抉择");
                break;
            case 36:
                mImageButton1.setImageResource(R.drawable.i36);
                hintTextView.setText("这是一张逆位的节制牌。现在点击牌面查看它的释义，你将根据它来回答你曾经的爱与抉择");
                break;
            case 37:
                mImageButton1.setImageResource(R.drawable.i37);
                hintTextView.setText("这是一张逆位的恶魔牌。现在点击牌面查看它的释义，你将根据它来回答你曾经的爱与抉择");
                break;
            case 38:
                mImageButton1.setImageResource(R.drawable.i38);
                hintTextView.setText("这是一张逆位的塔牌。现在点击牌面查看它的释义，你将根据它来回答你曾经的爱与抉择");
                break;
            case 39:
                mImageButton1.setImageResource(R.drawable.i39);
                hintTextView.setText("这是一张逆位的星星牌。现在点击牌面查看它的释义，你将根据它来回答你曾经的爱与抉择");
                break;
            case 40:
                mImageButton1.setImageResource(R.drawable.i40);
                hintTextView.setText("这是一张逆位的月亮牌。现在点击牌面查看它的释义，你将根据它来回答你曾经的爱与抉择");
                break;
            case 41:
                mImageButton1.setImageResource(R.drawable.i41);
                hintTextView.setText("这是一张逆位的太阳牌。现在点击牌面查看它的释义，你将根据它来回答你曾经的爱与抉择");
                break;
            case 42:
                mImageButton1.setImageResource(R.drawable.i42);
                hintTextView.setText("这是一张逆位的审判牌。现在点击牌面查看它的释义，你将根据它来回答你曾经的爱与抉择");
                break;
            case 43:
                mImageButton1.setImageResource(R.drawable.i43);
                hintTextView.setText("这是一张逆位的世界牌。现在点击牌面查看它的释义，你将根据它来回答你曾经的爱与抉择");
                break;

            default:
                break;
        }
    }

    protected void meaningOfCard(int randonNum, String hintString) {
        int titleRes;
        switch (randonNum)
        {
            case 0:
                titleRes = R.string.t0_0;
                initAlertDialog(titleRes, hintString);
                break;
            case 1:
                titleRes = R.string.t1_0;
                initAlertDialog(titleRes, hintString);
                break;
            case 2:
                titleRes = R.string.t2_0;
                initAlertDialog(titleRes, hintString);
                break;
            case 3:
                titleRes = R.string.t3_0;
                initAlertDialog(titleRes, hintString);
                break;
            case 4:
                titleRes = R.string.t4_0;
                initAlertDialog(titleRes, hintString);
                break;
            case 5:
                titleRes = R.string.t5_0;
                initAlertDialog(titleRes, hintString);
                break;
            case 6:
                titleRes = R.string.t6_0;
                initAlertDialog(titleRes, hintString);
                break;
            case 7:
                titleRes = R.string.t7_0;
                initAlertDialog(titleRes, hintString);
                break;
            case 8:
                titleRes = R.string.t8_0;
                initAlertDialog(titleRes, hintString);
                break;
            case 9:
                titleRes = R.string.t9_0;
                initAlertDialog(titleRes, hintString);
                break;
            case 10:
                titleRes = R.string.t10_0;
                initAlertDialog(titleRes, hintString);
                break;
            case 11:
                titleRes = R.string.t11_0;
                initAlertDialog(titleRes, hintString);
                break;
            case 12:
                titleRes = R.string.t12_0;
                initAlertDialog(titleRes, hintString);
                break;
            case 13:
                titleRes = R.string.t13_0;
                initAlertDialog(titleRes, hintString);
                break;
            case 14:
                titleRes = R.string.t14_0;
                initAlertDialog(titleRes, hintString);
                break;
            case 15:
                titleRes = R.string.t15_0;
                initAlertDialog(titleRes, hintString);
                break;
            case 16:
                titleRes = R.string.t16_0;
                initAlertDialog(titleRes, hintString);
                break;
            case 17:
                titleRes = R.string.t17_0;
                initAlertDialog(titleRes, hintString);
                break;
            case 18:
                titleRes = R.string.t18_0;
                initAlertDialog(titleRes, hintString);
                break;
            case 19:
                titleRes = R.string.t19_0;
                initAlertDialog(titleRes, hintString);
                break;
            case 20:
                titleRes = R.string.t20_0;
                initAlertDialog(titleRes, hintString);
                break;
            case 21:
                titleRes = R.string.t21_0;
                initAlertDialog(titleRes, hintString);
                break;
            case 22:
                titleRes = R.string.t0_1;
                initAlertDialog(titleRes, hintString);
                break;
            case 23:
                titleRes = R.string.t1_1;
                initAlertDialog(titleRes, hintString);
                break;
            case 24:
                titleRes = R.string.t2_1;
                initAlertDialog(titleRes, hintString);
                break;
            case 25:
                titleRes = R.string.t3_1;
                initAlertDialog(titleRes, hintString);
                break;
            case 26:
                titleRes = R.string.t4_1;
                initAlertDialog(titleRes, hintString);
                break;
            case 27:
                titleRes = R.string.t5_1;
                initAlertDialog(titleRes, hintString);
                break;
            case 28:
                titleRes = R.string.t6_1;
                initAlertDialog(titleRes, hintString);
                break;
            case 29:
                titleRes = R.string.t7_1;
                initAlertDialog(titleRes, hintString);
                break;
            case 30:
                titleRes = R.string.t8_1;
                initAlertDialog(titleRes, hintString);
                break;
            case 31:
                titleRes = R.string.t9_1;
                initAlertDialog(titleRes, hintString);
                break;
            case 32:
                titleRes = R.string.t10_1;
                initAlertDialog(titleRes, hintString);
                break;
            case 33:
                titleRes = R.string.t11_1;
                initAlertDialog(titleRes, hintString);
                break;
            case 34:
                titleRes = R.string.t12_1;
                initAlertDialog(titleRes, hintString);
                break;
            case 35:
                titleRes = R.string.t13_1;
                initAlertDialog(titleRes, hintString);
                break;
            case 36:
                titleRes = R.string.t14_1;
                initAlertDialog(titleRes, hintString);
                break;
            case 37:
                titleRes = R.string.t15_1;
                initAlertDialog(titleRes, hintString);
                break;
            case 38:
                titleRes = R.string.t16_1;
                initAlertDialog(titleRes, hintString);
                break;
            case 39:
                titleRes = R.string.t17_1;
                initAlertDialog(titleRes, hintString);
                break;
            case 40:
                titleRes = R.string.t18_1;
                initAlertDialog(titleRes, hintString);
                break;
            case 41:
                titleRes = R.string.t19_1;
                initAlertDialog(titleRes, hintString);
                break;
            case 42:
                titleRes = R.string.t20_1;
                initAlertDialog(titleRes, hintString);
                break;
            case 43:
                titleRes = R.string.t21_1;
                initAlertDialog(titleRes, hintString);
                break;

            default:
                break;
        }
    }

    private void initAlertDialog(int titleRes, String hintString) {
        new AlertDialog.Builder(BaseCardArray.this).setTitle("").setMessage(titleRes)
                .setPositiveButton("OK", null).show();
        hintTextView.setText(hintString);
    }

    public void onClick(View view) {

    }

}
