package irdc.gallary; 
import java.util.Random;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;

public class CardArray1 extends Activity {
    private final String resultString = "";
  private ImageView mImageButton1;
  
//  private TextView 
  int i_1=0;
  Random r1=new Random();int i1=r1.nextInt(43);
  private TextView mTextView1;
  private TextView mTextView2;
  
  
  public boolean onTouchEvent(MotionEvent event) 
  {
    if(event.getPointerCount()>1)
    {
      Intent intent=new Intent();
      intent.setClass(CardArray1.this, Choose2.class);
      startActivity(intent);
      System.exit(0);
      CardArray1.this.finish();
    }

    return super.onTouchEvent(event);
  }
  @Override
  public boolean onKeyDown(int keyCode, KeyEvent event) {

    if(keyCode == KeyEvent.KEYCODE_BACK){
 //     choose.myMediaPlayer.stop();
      Intent intent=new Intent();
      intent.setClass(CardArray1.this, Choose2.class);
      startActivity(intent);
      CardArray1.this.finish();
      return true;
    }else{    
      return super.onKeyDown(keyCode, event);
    }
  }

  /** Called when the activity is first created. */ 
  @Override 
  public void onCreate(Bundle savedInstanceState)
  { 
    super.onCreate(savedInstanceState);
    this.getWindow().setFlags
    (
        WindowManager.LayoutParams.FLAG_FULLSCREEN,
        WindowManager.LayoutParams.FLAG_FULLSCREEN
    );
    requestWindowFeature(Window.FEATURE_NO_TITLE);
    setContentView(R.layout.main2_01); 
    
    Bundle bundle=this.getIntent().getExtras();
    
    String question=bundle.getString("question");
    mImageButton1 =(ImageView) findViewById(R.id.myImageButton1);
    mTextView1 = (TextView) findViewById(R.id.myTextView1);
    String str1="所以你的";String str2="谜底是：？\n 点击查看牌面。";
    mTextView1.setText(str1+question+str2);
    mTextView2=(TextView)findViewById(R.id.text1);

    mImageButton1.setOnClickListener(new OnClickListener()
    { 
        public void onClick(View v) 
        {
           if (i_1==0)
          {
             mTextView2.setText("");
             switch (i1)
            {
                case 0:
                    mImageButton1.setImageResource(R.drawable.i0);
                    mTextView1.setText("正位的愚人牌！\n 继续点击查看牌义。");
                    break;
                case 1:
                    mImageButton1.setImageResource(R.drawable.i1);
                    mTextView1.setText("正位的魔术师牌！\n 继续点击查看牌义。");
                    break;
                case 2:
                    mImageButton1.setImageResource(R.drawable.i2);
                    mTextView1.setText("正位的女祭司牌！\n 继续点击查看牌义。");
                    break;
                case 3:
                    mImageButton1.setImageResource(R.drawable.i3);
                    mTextView1.setText("正位的女皇牌！\n 继续点击查看牌义。");
                    break;
                case 4:
                    mImageButton1.setImageResource(R.drawable.i4);
                    mTextView1.setText("正位的皇帝牌！\n 继续点击查看牌义。");
                    break;
                case 5:
                    mImageButton1.setImageResource(R.drawable.i5);
                    mTextView1.setText("正位的教宗牌！\n 继续点击查看牌义。");
                    break;
                case 6:
                    mImageButton1.setImageResource(R.drawable.i6);
                    mTextView1.setText("正位的恋人牌！\n 继续点击查看牌义。");
                    break;
                case 7:
                    mImageButton1.setImageResource(R.drawable.i7);
                    mTextView1.setText("正位的战车牌！\n 继续点击查看牌义。");
                    break;
                case 8:
                    mImageButton1.setImageResource(R.drawable.i8);
                    mTextView1.setText("正位的力量牌！\n 继续点击查看牌义。");
                    break;
                case 9:
                    mImageButton1.setImageResource(R.drawable.i9);
                    mTextView1.setText("正位的隐士牌！\n 继续点击查看牌义。");
                    break;
                case 10:
                    mImageButton1.setImageResource(R.drawable.i10);
                    mTextView1.setText("正位的命运之轮牌！\n 继续点击查看牌义。");
                    break;
                case 11:
                    mImageButton1.setImageResource(R.drawable.i11);
                    mTextView1.setText("正位的正义牌！\n 继续点击查看牌义。");
                    break;
                case 12:
                    mImageButton1.setImageResource(R.drawable.i12);
                    mTextView1.setText("正位的倒吊者牌！\n 继续点击查看牌义。");
                    break;
                case 13:
                    mImageButton1.setImageResource(R.drawable.i13);
                    mTextView1.setText("正位的死神牌！\n 继续点击查看牌义。");
                    break;
                case 14:
                    mImageButton1.setImageResource(R.drawable.i14);
                    mTextView1.setText("正位的节制牌！\n 继续点击查看牌义。");
                    break;
                case 15:
                    mImageButton1.setImageResource(R.drawable.i15);
                    mTextView1.setText("正位的恶魔牌！\n 继续点击查看牌义。");
                    break;
                case 16:
                    mImageButton1.setImageResource(R.drawable.i16);
                    mTextView1.setText("正位的塔牌！\n 继续点击查看牌义。");
                    break;
                case 17:
                    mImageButton1.setImageResource(R.drawable.i17);
                    mTextView1.setText("正位的星星牌！\n 继续点击查看牌义。");
                    break;
                case 18:
                    mImageButton1.setImageResource(R.drawable.i18);
                    mTextView1.setText("正位的月亮牌！\n 继续点击查看牌义。");
                    break;
                case 19:
                    mImageButton1.setImageResource(R.drawable.i19);
                    mTextView1.setText("正位的太阳牌！\n 继续点击查看牌义。");
                    break;
                case 20:
                    mImageButton1.setImageResource(R.drawable.i20);
                    mTextView1.setText("正位的审判牌！\n 继续点击查看牌义。");
                    break;
                case 21:
                    mImageButton1.setImageResource(R.drawable.i21);
                    mTextView1.setText("正位的世界牌！\n 继续点击查看牌义。");
                    break;
                case 22:
                    mImageButton1.setImageResource(R.drawable.i21);
                    mTextView1.setText("逆位的愚人牌！\n 继续点击查看牌义。");
                    break;
                case 23:
                    mImageButton1.setImageResource(R.drawable.i23);
                    mTextView1.setText("逆位的魔术师牌！\n 继续点击查看牌义。");
                    break;
                case 24:
                    mImageButton1.setImageResource(R.drawable.i24);
                    mTextView1.setText("逆位的女祭司牌！\n 继续点击查看牌义。");
                    break;
                case 25:
                    mImageButton1.setImageResource(R.drawable.i25);
                    mTextView1.setText("逆位的女皇牌！\n 继续点击查看牌义。");
                    break;
                case 26:
                    mImageButton1.setImageResource(R.drawable.i26);
                    mTextView1.setText("逆位的皇帝牌！\n 继续点击查看牌义。");
                    break;
                case 27:
                    mImageButton1.setImageResource(R.drawable.i27);
                    mTextView1.setText("逆位的教宗牌！\n 继续点击查看牌义。");
                    break;
                case 28:
                    mImageButton1.setImageResource(R.drawable.i28);
                    mTextView1.setText("逆位的恋人牌！\n 继续点击查看牌义。");
                    break;
                case 29:
                    mImageButton1.setImageResource(R.drawable.i29);
                    mTextView1.setText("逆位的战车牌！\n 继续点击查看牌义。");
                    break;
                case 30:
                    mImageButton1.setImageResource(R.drawable.i30);
                    mTextView1.setText("逆位的力量牌！\n 继续点击查看牌义。");
                    break;
                case 31:
                    mImageButton1.setImageResource(R.drawable.i31);
                    mTextView1.setText("逆位的隐士牌！\n 继续点击查看牌义。");
                    break;
                case 32:
                    mImageButton1.setImageResource(R.drawable.i32);
                    mTextView1.setText("逆位的命运之轮牌！\n 继续点击查看牌义。");
                    break;
                case 33:
                    mImageButton1.setImageResource(R.drawable.i33);
                    mTextView1.setText("逆位的正义牌！\n 继续点击查看牌义。");
                    break;
                case 34:
                    mImageButton1.setImageResource(R.drawable.i34);
                    mTextView1.setText("逆位的倒吊者牌！\n 继续点击查看牌义。");
                    break;
                case 35:
                    mImageButton1.setImageResource(R.drawable.i35);
                    mTextView1.setText("逆位的死神牌！\n 继续点击查看牌义。");
                    break;
                case 36:
                    mImageButton1.setImageResource(R.drawable.i36);
                    mTextView1.setText("逆位的节制牌！\n 继续点击查看牌义。");
                    break;
                case 37:
                    mImageButton1.setImageResource(R.drawable.i37);
                    mTextView1.setText("逆位的恶魔牌！\n 继续点击查看牌义。");
                    break;
                case 38:
                    mImageButton1.setImageResource(R.drawable.i38);
                    mTextView1.setText("逆位的塔牌！\n 继续点击查看牌义。");
                    break;
                case 39:
                    mImageButton1.setImageResource(R.drawable.i39);
                    mTextView1.setText("逆位的星星牌！\n 继续点击查看牌义。");
                    break;
                case 40:
                    mImageButton1.setImageResource(R.drawable.i40);
                    mTextView1.setText("逆位的月亮牌！\n 继续点击查看牌义。");
                    break;
                case 41:
                    mImageButton1.setImageResource(R.drawable.i41);
                    mTextView1.setText("逆位的太阳牌！\n 继续点击查看牌义。");
                    break;
                case 42:
                    mImageButton1.setImageResource(R.drawable.i42);
                    mTextView1.setText("逆位的审判牌！\n 继续点击查看牌义。");
                    break;
                case 43:
                    mImageButton1.setImageResource(R.drawable.i43);
                    mTextView1.setText("逆位的世界牌！\n 继续点击查看牌义。");
                    break;
              
              default:
                break;
            }
             i_1=1;
          }
           else {
               int titleRes;
             switch (i1)
             {
               case 0:
                   titleRes = R.string.t0_0;
                   initAlertDialog(titleRes);
                 break;
               case 1:
                   titleRes = R.string.t1_0;
                   initAlertDialog(titleRes);
                   break;
               case 2:
                   titleRes = R.string.t2_0;
                   initAlertDialog(titleRes);
                   break;
               case 3:
                   titleRes = R.string.t3_0;
                   initAlertDialog(titleRes);
                 break;
               case 4:
                   titleRes = R.string.t4_0;
                   initAlertDialog(titleRes);
                 break;
               case 5:
                   titleRes = R.string.t5_0;
                   initAlertDialog(titleRes);
                 break;
               case 6:
                   titleRes = R.string.t6_0;
                   initAlertDialog(titleRes);
                 break;
               case 7:
                   titleRes = R.string.t7_0;
                   initAlertDialog(titleRes);
                 break;
               case 8:
                   titleRes = R.string.t8_0;
                   initAlertDialog(titleRes);
                 break;
               case 9:
                   titleRes = R.string.t9_0;
                   initAlertDialog(titleRes);
                 break;
               case 10:
                   titleRes = R.string.t10_0;
                   initAlertDialog(titleRes);
                 break;
               case 11:
                   titleRes = R.string.t11_0;
                   initAlertDialog(titleRes);
                 break;
               case 12:
                   titleRes = R.string.t12_0;
                   initAlertDialog(titleRes);
                 break;
               case 13:
                   titleRes = R.string.t13_0;
                   initAlertDialog(titleRes);
                 break;
               case 14:
                   titleRes = R.string.t14_0;
                   initAlertDialog(titleRes);
                 break;
               case 15:
                   titleRes = R.string.t15_0;
                   initAlertDialog(titleRes);
                 break;
               case 16:
                   titleRes = R.string.t16_0;
                   initAlertDialog(titleRes);
                 break;
               case 17:
                   titleRes = R.string.t17_0;
                   initAlertDialog(titleRes);
                 break;
               case 18:
                   titleRes = R.string.t18_0;
                   initAlertDialog(titleRes);
                 break;
               case 19:
                   titleRes = R.string.t19_0;
                   initAlertDialog(titleRes);
                 break;
               case 20:
                   titleRes = R.string.t20_0;
                   initAlertDialog(titleRes);
                 break;
               case 21:
                   titleRes = R.string.t21_0;
                   initAlertDialog(titleRes);
                 break;
               case 22:
                   titleRes = R.string.t0_1;
                   initAlertDialog(titleRes);
                 break;
               case 23:
                   titleRes = R.string.t1_1;
                   initAlertDialog(titleRes);
                 break;
               case 24:
                   titleRes = R.string.t2_1;
                   initAlertDialog(titleRes);
                 break;
               case 25:
                   titleRes = R.string.t3_1;
                   initAlertDialog(titleRes);
                 break;
               case 26:
                   titleRes = R.string.t4_1;
                   initAlertDialog(titleRes);
                 break;
               case 27:
                   titleRes = R.string.t5_1;
                   initAlertDialog(titleRes);
                 break;
               case 28:
                   titleRes = R.string.t6_1;
                   initAlertDialog(titleRes);
                 break;
               case 29:
                   titleRes = R.string.t7_1;
                   initAlertDialog(titleRes);
                 break;
               case 30:
                   titleRes = R.string.t8_1;
                   initAlertDialog(titleRes);
                 break;
               case 31:
                   titleRes = R.string.t9_1;
                   initAlertDialog(titleRes);
                 break;
               case 32:
                   titleRes = R.string.t10_1;
                   initAlertDialog(titleRes);
                 break;
               case 33:
                   titleRes = R.string.t11_1;
                   initAlertDialog(titleRes);
                 break;
               case 34:
                   titleRes = R.string.t12_1;
                   initAlertDialog(titleRes);
                 break;
               case 35:
                   titleRes = R.string.t13_1;
                   initAlertDialog(titleRes);
                 break;
               case 36:
                   titleRes = R.string.t14_1;
                   initAlertDialog(titleRes);
                 break;
               case 37:
                   titleRes = R.string.t15_1;
                   initAlertDialog(titleRes);
                 break;
               case 38:
                   titleRes = R.string.t16_1;
                   initAlertDialog(titleRes);
                 break;
               case 39:
                   titleRes = R.string.t17_1;
                   initAlertDialog(titleRes);
                 break;
               case 40:
                   titleRes = R.string.t18_1;
                   initAlertDialog(titleRes);
                 break;
               case 41:
                   titleRes = R.string.t19_1;
                   initAlertDialog(titleRes);
                 break;
               case 42:
                   titleRes = R.string.t20_1;
                   initAlertDialog(titleRes);
                 break;
               case 43:
                   titleRes = R.string.t21_1;
                   initAlertDialog(titleRes);
                 break;

               default:
                 break;
             }
            
            i_1=0;  
          }
         }
     } );
  }

    private void initAlertDialog(int titleRes) {
        new AlertDialog.Builder(CardArray1.this).setTitle("").setMessage(titleRes)
                .setPositiveButton("OK",
                        new DialogInterface.OnClickListener()
                        {

                            @Override
                            public void onClick(DialogInterface dialog, int which)
                            {
                                // TODO Auto-generated method stub
                            }
                        }).show();
        mTextView1.setText("澶╃�兼�����浣胯��宸茬����轰����宠�����绛�妗�浜�锛����浣����瑕�������灏辨����撮�㈣��宸辩�����蹇����\n涓ゆ��瑙���у��骞�浠ヨ�����涓�涓�绾с��");
    }
}