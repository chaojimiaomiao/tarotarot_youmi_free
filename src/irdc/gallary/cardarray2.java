package irdc.gallary; 
import java.security.PublicKey;
import java.util.Random;

import android.R.integer;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
public class cardarray2 extends Activity
{ 
  /*宣告三个对象变量(图片按钮,按钮,与TextView)*/ 
//  private ImageButton mImageButton1;
  private ImageView mImageButton1;
  private ImageView mImageButton2;
  private ImageView mImageButton3;

//  private TextView 
  int i_1=0;int i_2=0;int i_3=0;//i_1记录翻拍顺序
  Random r1=new Random();int i1=r1.nextInt(43);//i1记录翻开的牌
  Random r2=new Random();int i2=r2.nextInt(43);
  Random r3=new Random();int i3=r3.nextInt(43);
  private TextView mTextView1;
  private TextView mTextView2;//对齐第一张牌
  private TextView mTextView3;//对齐第二张牌
  private TextView mTextView4;//对齐第三张牌
  
  public boolean onTouchEvent(MotionEvent event) 
  {   
    /* event的Action?断 */
    if(event.getPointerCount()>1)
    {
      Intent intent=new Intent();
      intent.setClass(cardarray2.this, Choose2.class);
      startActivity(intent);
      cardarray2.this.finish();
    }

    return super.onTouchEvent(event);
  }
  @Override
  public boolean onKeyDown(int keyCode, KeyEvent event) {
    
    //按下键盘上返回按钮
    if(keyCode == KeyEvent.KEYCODE_BACK){
      Intent intent=new Intent();
      intent.setClass(cardarray2.this, Choose2.class);
      startActivity(intent);
      cardarray2.this.finish();
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
    //隐藏状态栏，使imageview全屏显示
    this.getWindow().setFlags
    (
        WindowManager.LayoutParams.FLAG_FULLSCREEN,
        WindowManager.LayoutParams.FLAG_FULLSCREEN
    );
    //隐藏标题栏
    requestWindowFeature(Window.FEATURE_NO_TITLE);
    setContentView(R.layout.main2_02); 
    
//    DisplayMetrics dm =new DisplayMetrics();
//    getWindowManager().getDefaultDisplay().getMetrics(dm);//.....得到屏幕的分辨率
    
    /*透过findViewById建构三个对象*/ 
    mImageButton1 =(ImageView) findViewById(R.id.myImageButton1);
    mImageButton2=(ImageView)findViewById(R.id.myImageButton2);
    mImageButton3=(ImageView)findViewById(R.id.myImageButton3);
    mTextView1 = (TextView) findViewById(R.id.myTextView1);
    mTextView1.setText("翻开第一张牌，心中回忆着过去，它将告诉你你曾经的爱与你对那份爱的抉择。");
    mTextView2=(TextView)findViewById(R.id.text1);
    mTextView3=(TextView)findViewById(R.id.text2);
    mTextView4=(TextView)findViewById(R.id.text3);
    
    
    
    /*透过onClickListener来响应ImageButton的onClick事件*/ 
    mImageButton1.setOnClickListener(new OnClickListener()
    { 
        public void onClick(View v) 
        {
        // TODO Auto-generated method stub 
        /*若ImageButton状态为onClick改变ImageButton的图片 * 并改变textView的文字*/ 
           if (i_1==0)
          {
             mTextView2.setText("");
             switch (i1)
            {
              case 0:
                mImageButton1.setImageResource(R.drawable.i0);
                mTextView1.setText("这是一张正位的愚人牌。现在点击牌面查看它的释义，你将根据它来回答你曾经的爱与抉择");
                break;
              case 1:
                mImageButton1.setImageResource(R.drawable.i1);
                mTextView1.setText("这是一张正位的魔术师牌。现在点击牌面查看它的释义，你将根据它来回答你曾经的爱与抉择");
                break;
              case 2:
                mImageButton1.setImageResource(R.drawable.i2);
                mTextView1.setText("这是一张正位的女祭司牌。现在点击牌面查看它的释义，你将根据它来回答你曾经的爱与抉择");
                break;
              case 3:
                mImageButton1.setImageResource(R.drawable.i3);
                mTextView1.setText("这是一张正位的女皇牌。现在点击牌面查看它的释义，你将根据它来回答你曾经的爱与抉择");
                break;
              case 4:
                mImageButton1.setImageResource(R.drawable.i4);
                mTextView1.setText("这是一张正位的皇帝牌。现在点击牌面查看它的释义，你将根据它来回答你曾经的爱与抉择");
                break;
              case 5:
                mImageButton1.setImageResource(R.drawable.i5);
                mTextView1.setText("这是一张正位的教宗牌。现在点击牌面查看它的释义，你将根据它来回答你曾经的爱与抉择");
                break;
              case 6:
                mImageButton1.setImageResource(R.drawable.i6);
                mTextView1.setText("这是一张正位的恋人牌。现在点击牌面查看它的释义，你将根据它来回答你曾经的爱与抉择");
                break;
              case 7:
                mImageButton1.setImageResource(R.drawable.i7);
                mTextView1.setText("这是一张正位的战车牌。现在点击牌面查看它的释义，你将根据它来回答你曾经的爱与抉择");
                break;
              case 8:
                mImageButton1.setImageResource(R.drawable.i8);
                mTextView1.setText("这是一张正位的力量牌。现在点击牌面查看它的释义，你将根据它来回答你曾经的爱与抉择");
                break;
              case 9:
                mImageButton1.setImageResource(R.drawable.i9);
                mTextView1.setText("这是一张正位的隐士牌。现在点击牌面查看它的释义，你将根据它来回答你曾经的爱与抉择");
                break;
              case 10:
                mImageButton1.setImageResource(R.drawable.i10);
                mTextView1.setText("这是一张正位的命运之轮牌。现在点击牌面查看它的释义，你将根据它来回答你曾经的爱与抉择");
                break;
              case 11:
                mImageButton1.setImageResource(R.drawable.i11);
                mTextView1.setText("这是一张正位的正义牌。现在点击牌面查看它的释义，你将根据它来回答你曾经的爱与抉择");
                break;
              case 12:
                mImageButton1.setImageResource(R.drawable.i12);
                mTextView1.setText("这是一张正位的倒吊者牌。现在点击牌面查看它的释义，你将根据它来回答你曾经的爱与抉择");
                break;
              case 13:
                mImageButton1.setImageResource(R.drawable.i13);
                mTextView1.setText("这是一张正位的死神牌。现在点击牌面查看它的释义，你将根据它来回答你曾经的爱与抉择");
                break;
              case 14:
                mImageButton1.setImageResource(R.drawable.i14);
                mTextView1.setText("这是一张正位的节制牌。现在点击牌面查看它的释义，你将根据它来回答你曾经的爱与抉择");
                break;
              case 15:
                mImageButton1.setImageResource(R.drawable.i15);
                mTextView1.setText("这是一张正位的恶魔牌。现在点击牌面查看它的释义，你将根据它来回答你曾经的爱与抉择");
                break;
              case 16:
                mImageButton1.setImageResource(R.drawable.i16);
                mTextView1.setText("这是一张正位的塔牌。现在点击牌面查看它的释义，你将根据它来回答你曾经的爱与抉择");
                break;
              case 17:
                mImageButton1.setImageResource(R.drawable.i17);
                mTextView1.setText("这是一张正位的星星牌。现在点击牌面查看它的释义，你将根据它来回答你曾经的爱与抉择");
                break;
              case 18:
                mImageButton1.setImageResource(R.drawable.i18);
                mTextView1.setText("这是一张正位的月亮牌。现在点击牌面查看它的释义，你将根据它来回答你曾经的爱与抉择");
                break;
              case 19:
                mImageButton1.setImageResource(R.drawable.i19);
                mTextView1.setText("这是一张正位的太阳牌。现在点击牌面查看它的释义，你将根据它来回答你曾经的爱与抉择");
                break;
              case 20:
                mImageButton1.setImageResource(R.drawable.i20);
                mTextView1.setText("这是一张正位的审判牌。现在点击牌面查看它的释义，你将根据它来回答你曾经的爱与抉择");
                break;
              case 21:
                mImageButton1.setImageResource(R.drawable.i21);
                mTextView1.setText("这是一张正位的世界牌。现在点击牌面查看它的释义，你将根据它来回答你曾经的爱与抉择");
                break;
              case 22:
                mImageButton1.setImageResource(R.drawable.i22);
                mTextView1.setText("这是一张逆位的愚人牌。现在点击牌面查看它的释义，你将根据它来回答你曾经的爱与抉择");
                break;
              case 23:
                mImageButton1.setImageResource(R.drawable.i23);
                mTextView1.setText("这是一张逆位的魔术师牌。现在点击牌面查看它的释义，你将根据它来回答你曾经的爱与抉择");
                break;
              case 24:
                mImageButton1.setImageResource(R.drawable.i24);
                mTextView1.setText("这是一张逆位的女祭司牌。现在点击牌面查看它的释义，你将根据它来回答你曾经的爱与抉择");
                break;
              case 25:
                mImageButton1.setImageResource(R.drawable.i25);
                mTextView1.setText("这是一张逆位的女皇牌。现在点击牌面查看它的释义，你将根据它来回答你曾经的爱与抉择");
                break;
              case 26:
                mImageButton1.setImageResource(R.drawable.i26);
                mTextView1.setText("这是一张逆位的皇帝牌。现在点击牌面查看它的释义，你将根据它来回答你曾经的爱与抉择");
                break;
              case 27:
                mImageButton1.setImageResource(R.drawable.i27);
                mTextView1.setText("这是一张逆位的教宗牌。现在点击牌面查看它的释义，你将根据它来回答你曾经的爱与抉择");
                break;
              case 28:
                mImageButton1.setImageResource(R.drawable.i28);
                mTextView1.setText("这是一张逆位的恋人牌。现在点击牌面查看它的释义，你将根据它来回答你曾经的爱与抉择");
                break;
              case 29:
                mImageButton1.setImageResource(R.drawable.i29);
                mTextView1.setText("这是一张逆位的战车牌。现在点击牌面查看它的释义，你将根据它来回答你曾经的爱与抉择");
                break;
              case 30:
                mImageButton1.setImageResource(R.drawable.i30);
                mTextView1.setText("这是一张逆位的力量牌。现在点击牌面查看它的释义，你将根据它来回答你曾经的爱与抉择");
                break;
              case 31:
                mImageButton1.setImageResource(R.drawable.i31);
                mTextView1.setText("这是一张逆位的隐士牌。现在点击牌面查看它的释义，你将根据它来回答你曾经的爱与抉择");
                break;
              case 32:
                mImageButton1.setImageResource(R.drawable.i32);
                mTextView1.setText("这是一张逆位的命运之轮牌。现在点击牌面查看它的释义，你将根据它来回答你曾经的爱与抉择");
                break;
              case 33:
                mImageButton1.setImageResource(R.drawable.i33);
                mTextView1.setText("这是一张逆位的正义牌。现在点击牌面查看它的释义，你将根据它来回答你曾经的爱与抉择");
                break;
              case 34:
                mImageButton1.setImageResource(R.drawable.i34);
                mTextView1.setText("这是一张逆位的倒吊者牌。现在点击牌面查看它的释义，你将根据它来回答你曾经的爱与抉择");
                break;
              case 35:
                mImageButton1.setImageResource(R.drawable.i35);
                mTextView1.setText("这是一张逆位的死神牌。现在点击牌面查看它的释义，你将根据它来回答你曾经的爱与抉择");
                break;
              case 36:
                mImageButton1.setImageResource(R.drawable.i36);
                mTextView1.setText("这是一张逆位的节制牌。现在点击牌面查看它的释义，你将根据它来回答你曾经的爱与抉择");
                break;
              case 37:
                mImageButton1.setImageResource(R.drawable.i37);
                mTextView1.setText("这是一张逆位的恶魔牌。现在点击牌面查看它的释义，你将根据它来回答你曾经的爱与抉择");
                break;
              case 38:
                mImageButton1.setImageResource(R.drawable.i38);
                mTextView1.setText("这是一张逆位的塔牌。现在点击牌面查看它的释义，你将根据它来回答你曾经的爱与抉择");
                break;
              case 39:
                mImageButton1.setImageResource(R.drawable.i39);
                mTextView1.setText("这是一张逆位的星星牌。现在点击牌面查看它的释义，你将根据它来回答你曾经的爱与抉择");
                break;
              case 40:
                mImageButton1.setImageResource(R.drawable.i40);
                mTextView1.setText("这是一张逆位的月亮牌。现在点击牌面查看它的释义，你将根据它来回答你曾经的爱与抉择");
                break;
              case 41:
                mImageButton1.setImageResource(R.drawable.i41);
                mTextView1.setText("这是一张逆位的太阳牌。现在点击牌面查看它的释义，你将根据它来回答你曾经的爱与抉择");
                break;
              case 42:
                mImageButton1.setImageResource(R.drawable.i42);
                mTextView1.setText("这是一张逆位的审判牌。现在点击牌面查看它的释义，你将根据它来回答你曾经的爱与抉择");
                break;
              case 43:
                mImageButton1.setImageResource(R.drawable.i43);
                mTextView1.setText("这是一张逆位的世界牌。现在点击牌面查看它的释义，你将根据它来回答你曾经的爱与抉择");
                break;
              
              default:
                break;
            }
             i_1=1;
          }
           else if(i_1==1||i_1==2){
             switch (i1)
             {
               case 0:
                 new AlertDialog.Builder(cardarray2.this).setTitle("").setMessage(R.string.t0_0)
                 .setPositiveButton("OK", 
                     new DialogInterface.OnClickListener()
                    {
                      
                      @Override
                      public void onClick(DialogInterface dialog, int which)
                      {
                        // TODO Auto-generated method stub                        
                      }
                    }).show();
                 mTextView1.setText("然后，翻开第二张牌。心中想着现在。它将告诉你从这份爱中获得了什么。");                
                 break;
               case 1:
                 new AlertDialog.Builder(cardarray2.this).setTitle("").setMessage(R.string.t1_0)
                 .setPositiveButton("OK", 
                     new DialogInterface.OnClickListener()
                    {
                      
                      @Override
                      public void onClick(DialogInterface dialog, int which)
                      {
                        // TODO Auto-generated method stub                        
                      }
                    }).show();
                 mTextView1.setText("然后，翻开第二张牌。心中想着现在。它将告诉你从这份爱中获得了什么。");                
                 break;
               case 2:
                 new AlertDialog.Builder(cardarray2.this).setTitle("").setMessage(R.string.t2_0)
                 .setPositiveButton("OK", 
                     new DialogInterface.OnClickListener()
                    {
                      
                      @Override
                      public void onClick(DialogInterface dialog, int which)
                      {
                        // TODO Auto-generated method stub                        
                      }
                    }).show();
                 mTextView1.setText("然后，翻开第二张牌。心中想着现在。它将告诉你从这份爱中获得了什么。");                
                 break;
               case 3:
                 new AlertDialog.Builder(cardarray2.this).setTitle("").setMessage(R.string.t3_0)
                 .setPositiveButton("OK", 
                     new DialogInterface.OnClickListener()
                    {
                      
                      @Override
                      public void onClick(DialogInterface dialog, int which)
                      {
                        // TODO Auto-generated method stub                        
                      }
                    }).show();
                 mTextView1.setText("然后，翻开第二张牌。心中想着现在。它将告诉你从这份爱中获得了什么。");                
                 break;
               case 4:
                 new AlertDialog.Builder(cardarray2.this).setTitle("").setMessage(R.string.t4_0)
                 .setPositiveButton("OK", 
                     new DialogInterface.OnClickListener()
                    {
                      
                      @Override
                      public void onClick(DialogInterface dialog, int which)
                      {
                        // TODO Auto-generated method stub                        
                      }
                    }).show();
                 mTextView1.setText("然后，翻开第二张牌。心中想着现在。它将告诉你从这份爱中获得了什么。");                
                 break;
               case 5:
                 new AlertDialog.Builder(cardarray2.this).setTitle("").setMessage(R.string.t5_0)
                 .setPositiveButton("OK", 
                     new DialogInterface.OnClickListener()
                    {
                      
                      @Override
                      public void onClick(DialogInterface dialog, int which)
                      {
                        // TODO Auto-generated method stub                        
                      }
                    }).show();
                 mTextView1.setText("然后，翻开第二张牌。心中想着现在。它将告诉你从这份爱中获得了什么。");                
                 break;
               case 6:
                 new AlertDialog.Builder(cardarray2.this).setTitle("").setMessage(R.string.t6_0)
                 .setPositiveButton("OK", 
                     new DialogInterface.OnClickListener()
                    {
                      
                      @Override
                      public void onClick(DialogInterface dialog, int which)
                      {
                        // TODO Auto-generated method stub                        
                      }
                    }).show();
                 mTextView1.setText("然后，翻开第二张牌。心中想着现在。它将告诉你从这份爱中获得了什么。");                
                 break;
               case 7:
                 new AlertDialog.Builder(cardarray2.this).setTitle("").setMessage(R.string.t7_0)
                 .setPositiveButton("OK", 
                     new DialogInterface.OnClickListener()
                    {
                      
                      @Override
                      public void onClick(DialogInterface dialog, int which)
                      {
                        // TODO Auto-generated method stub                        
                      }
                    }).show();
                 mTextView1.setText("然后，翻开第二张牌。心中想着现在。它将告诉你从这份爱中获得了什么。");                
                 break;
               case 8:
                 new AlertDialog.Builder(cardarray2.this).setTitle("").setMessage(R.string.t8_0)
                 .setPositiveButton("OK", 
                     new DialogInterface.OnClickListener()
                    {
                      
                      @Override
                      public void onClick(DialogInterface dialog, int which)
                      {
                        // TODO Auto-generated method stub                        
                      }
                    }).show();
                 mTextView1.setText("然后，翻开第二张牌。心中想着现在。它将告诉你从这份爱中获得了什么。");                
                 break;
               case 9:
                 new AlertDialog.Builder(cardarray2.this).setTitle("").setMessage(R.string.t9_0)
                 .setPositiveButton("OK", 
                     new DialogInterface.OnClickListener()
                    {
                      
                      @Override
                      public void onClick(DialogInterface dialog, int which)
                      {
                        // TODO Auto-generated method stub                        
                      }
                    }).show();
                 mTextView1.setText("然后，翻开第二张牌。心中想着现在。它将告诉你从这份爱中获得了什么。");                
                 break;
               case 10:
                 new AlertDialog.Builder(cardarray2.this).setTitle("").setMessage(R.string.t10_0)
                 .setPositiveButton("OK", 
                     new DialogInterface.OnClickListener()
                    {
                      
                      @Override
                      public void onClick(DialogInterface dialog, int which)
                      {
                        // TODO Auto-generated method stub                        
                      }
                    }).show();
                 mTextView1.setText("然后，翻开第二张牌。心中想着现在。它将告诉你从这份爱中获得了什么。");                
                 break;
               case 11:
                 new AlertDialog.Builder(cardarray2.this).setTitle("").setMessage(R.string.t11_0)
                 .setPositiveButton("OK", 
                     new DialogInterface.OnClickListener()
                    {
                      
                      @Override
                      public void onClick(DialogInterface dialog, int which)
                      {
                        // TODO Auto-generated method stub                        
                      }
                    }).show();
                 mTextView1.setText("然后，翻开第二张牌。心中想着现在。它将告诉你从这份爱中获得了什么。");                
                 break;
               case 12:
                 new AlertDialog.Builder(cardarray2.this).setTitle("").setMessage(R.string.t12_0)
                 .setPositiveButton("OK", 
                     new DialogInterface.OnClickListener()
                    {
                      
                      @Override
                      public void onClick(DialogInterface dialog, int which)
                      {
                        // TODO Auto-generated method stub                        
                      }
                    }).show();
                 mTextView1.setText("然后，翻开第二张牌。心中想着现在。它将告诉你从这份爱中获得了什么。");                
                 break;
               case 13:
                 new AlertDialog.Builder(cardarray2.this).setTitle("").setMessage(R.string.t13_0)
                 .setPositiveButton("OK", 
                     new DialogInterface.OnClickListener()
                    {
                      
                      @Override
                      public void onClick(DialogInterface dialog, int which)
                      {
                        // TODO Auto-generated method stub                        
                      }
                    }).show();
                 mTextView1.setText("然后，翻开第二张牌。心中想着现在。它将告诉你从这份爱中获得了什么。");                
                 break;
               case 14:
                 new AlertDialog.Builder(cardarray2.this).setTitle("").setMessage(R.string.t14_0)
                 .setPositiveButton("OK", 
                     new DialogInterface.OnClickListener()
                    {
                      
                      @Override
                      public void onClick(DialogInterface dialog, int which)
                      {
                        // TODO Auto-generated method stub                        
                      }
                    }).show();
                 mTextView1.setText("然后，翻开第二张牌。心中想着现在。它将告诉你从这份爱中获得了什么。");                
                 break;
               case 15:
                 new AlertDialog.Builder(cardarray2.this).setTitle("").setMessage(R.string.t15_0)
                 .setPositiveButton("OK", 
                     new DialogInterface.OnClickListener()
                    {
                      
                      @Override
                      public void onClick(DialogInterface dialog, int which)
                      {
                        // TODO Auto-generated method stub                        
                      }
                    }).show();
                 mTextView1.setText("然后，翻开第二张牌。心中想着现在。它将告诉你从这份爱中获得了什么。");                
                 break;
               case 16:
                 new AlertDialog.Builder(cardarray2.this).setTitle("").setMessage(R.string.t16_0)
                 .setPositiveButton("OK", 
                     new DialogInterface.OnClickListener()
                    {
                      
                      @Override
                      public void onClick(DialogInterface dialog, int which)
                      {
                        // TODO Auto-generated method stub                        
                      }
                    }).show();
                 mTextView1.setText("然后，翻开第二张牌。心中想着现在。它将告诉你从这份爱中获得了什么。");                
                 break;
               case 17:
                 new AlertDialog.Builder(cardarray2.this).setTitle("").setMessage(R.string.t17_0)
                 .setPositiveButton("OK", 
                     new DialogInterface.OnClickListener()
                    {
                      
                      @Override
                      public void onClick(DialogInterface dialog, int which)
                      {
                        // TODO Auto-generated method stub                        
                      }
                    }).show();
                 mTextView1.setText("然后，翻开第二张牌。心中想着现在。它将告诉你从这份爱中获得了什么。");                
                 break;
               case 18:
                 new AlertDialog.Builder(cardarray2.this).setTitle("").setMessage(R.string.t18_0)
                 .setPositiveButton("OK", 
                     new DialogInterface.OnClickListener()
                    {
                      
                      @Override
                      public void onClick(DialogInterface dialog, int which)
                      {
                        // TODO Auto-generated method stub                        
                      }
                    }).show();
                 mTextView1.setText("然后，翻开第二张牌。心中想着现在。它将告诉你从这份爱中获得了什么。");                
                 break;
               case 19:
                 new AlertDialog.Builder(cardarray2.this).setTitle("").setMessage(R.string.t19_0)
                 .setPositiveButton("OK", 
                     new DialogInterface.OnClickListener()
                    {
                      
                      @Override
                      public void onClick(DialogInterface dialog, int which)
                      {
                        // TODO Auto-generated method stub                        
                      }
                    }).show();;
                 mTextView1.setText("然后，翻开第二张牌。心中想着现在。它将告诉你从这份爱中获得了什么。");                
                 break;
               case 20:
                 new AlertDialog.Builder(cardarray2.this).setTitle("").setMessage(R.string.t20_0)
                 .setPositiveButton("OK", 
                     new DialogInterface.OnClickListener()
                    {
                      
                      @Override
                      public void onClick(DialogInterface dialog, int which)
                      {
                        // TODO Auto-generated method stub                        
                      }
                    }).show();
                 mTextView1.setText("然后，翻开第二张牌。心中想着现在。它将告诉你从这份爱中获得了什么。");                
                 break;
               case 21:
                 new AlertDialog.Builder(cardarray2.this).setTitle("").setMessage(R.string.t21_0)
                 .setPositiveButton("OK", 
                     new DialogInterface.OnClickListener()
                    {
                      
                      @Override
                      public void onClick(DialogInterface dialog, int which)
                      {
                        // TODO Auto-generated method stub                        
                      }
                    }).show();
                 mTextView1.setText("然后，翻开第二张牌。心中想着现在。它将告诉你从这份爱中获得了什么。");                
                 break;
               case 22:
                 new AlertDialog.Builder(cardarray2.this).setTitle("").setMessage(R.string.t0_1)
                 .setPositiveButton("OK", 
                     new DialogInterface.OnClickListener()
                    {
                      
                      @Override
                      public void onClick(DialogInterface dialog, int which)
                      {
                        // TODO Auto-generated method stub                        
                      }
                    }).show();
                 mTextView1.setText("然后，翻开第二张牌。心中想着现在。它将告诉你从这份爱中获得了什么。");                
                 break;
               case 23:
                 new AlertDialog.Builder(cardarray2.this).setTitle("").setMessage(R.string.t1_1)
                 .setPositiveButton("OK", 
                     new DialogInterface.OnClickListener()
                    {
                      
                      @Override
                      public void onClick(DialogInterface dialog, int which)
                      {
                        // TODO Auto-generated method stub                        
                      }
                    }).show();
                 mTextView1.setText("然后，翻开第二张牌。心中想着现在。它将告诉你从这份爱中获得了什么。");                
                 break;
               case 24:
                 new AlertDialog.Builder(cardarray2.this).setTitle("").setMessage(R.string.t2_1)
                 .setPositiveButton("OK", 
                     new DialogInterface.OnClickListener()
                    {
                      
                      @Override
                      public void onClick(DialogInterface dialog, int which)
                      {
                        // TODO Auto-generated method stub                        
                      }
                    }).show();
                 mTextView1.setText("然后，翻开第二张牌。心中想着现在。它将告诉你从这份爱中获得了什么。");                
                 break;
               case 25:
                 new AlertDialog.Builder(cardarray2.this).setTitle("").setMessage(R.string.t3_1)
                 .setPositiveButton("OK", 
                     new DialogInterface.OnClickListener()
                    {
                      
                      @Override
                      public void onClick(DialogInterface dialog, int which)
                      {
                        // TODO Auto-generated method stub                        
                      }
                    }).show();
                 mTextView1.setText("然后，翻开第二张牌。心中想着现在。它将告诉你从这份爱中获得了什么。");                
                 break;
               case 26:
                 new AlertDialog.Builder(cardarray2.this).setTitle("").setMessage(R.string.t4_1)
                 .setPositiveButton("OK", 
                     new DialogInterface.OnClickListener()
                    {
                      
                      @Override
                      public void onClick(DialogInterface dialog, int which)
                      {
                        // TODO Auto-generated method stub                        
                      }
                    }).show();
                 mTextView1.setText("然后，翻开第二张牌。心中想着现在。它将告诉你从这份爱中获得了什么。");                
                 break;
               case 27:
                 new AlertDialog.Builder(cardarray2.this).setTitle("").setMessage(R.string.t5_1)
                 .setPositiveButton("OK", 
                     new DialogInterface.OnClickListener()
                    {
                      
                      @Override
                      public void onClick(DialogInterface dialog, int which)
                      {
                        // TODO Auto-generated method stub                        
                      }
                    }).show();
                 mTextView1.setText("然后，翻开第二张牌。心中想着现在。它将告诉你从这份爱中获得了什么。");                
                 break;
               case 28:
                 new AlertDialog.Builder(cardarray2.this).setTitle("").setMessage(R.string.t6_1)
                 .setPositiveButton("OK", 
                     new DialogInterface.OnClickListener()
                    {
                      
                      @Override
                      public void onClick(DialogInterface dialog, int which)
                      {
                        // TODO Auto-generated method stub                        
                      }
                    }).show();
                 mTextView1.setText("然后，翻开第二张牌。心中想着现在。它将告诉你从这份爱中获得了什么。");                
                 break;
               case 29:
                 new AlertDialog.Builder(cardarray2.this).setTitle("").setMessage(R.string.t7_1)
                 .setPositiveButton("OK", 
                     new DialogInterface.OnClickListener()
                    {
                      
                      @Override
                      public void onClick(DialogInterface dialog, int which)
                      {
                        // TODO Auto-generated method stub                        
                      }
                    }).show();
                 mTextView1.setText("然后，翻开第二张牌。心中想着现在。它将告诉你从这份爱中获得了什么。");                
                 break;
               case 30:
                 new AlertDialog.Builder(cardarray2.this).setTitle("").setMessage(R.string.t8_1)
                 .setPositiveButton("OK", 
                     new DialogInterface.OnClickListener()
                    {
                      
                      @Override
                      public void onClick(DialogInterface dialog, int which)
                      {
                        // TODO Auto-generated method stub                        
                      }
                    }).show();
                 mTextView1.setText("然后，翻开第二张牌。心中想着现在。它将告诉你从这份爱中获得了什么。");                
                 break;
               case 31:
                 new AlertDialog.Builder(cardarray2.this).setTitle("").setMessage(R.string.t9_1)
                 .setPositiveButton("OK", 
                     new DialogInterface.OnClickListener()
                    {
                      
                      @Override
                      public void onClick(DialogInterface dialog, int which)
                      {
                        // TODO Auto-generated method stub                        
                      }
                    }).show();
                 mTextView1.setText("然后，翻开第二张牌。心中想着现在。它将告诉你从这份爱中获得了什么。");                
                 break;
               case 32:
                 new AlertDialog.Builder(cardarray2.this).setTitle("").setMessage(R.string.t10_1)
                 .setPositiveButton("OK", 
                     new DialogInterface.OnClickListener()
                    {
                      
                      @Override
                      public void onClick(DialogInterface dialog, int which)
                      {
                        // TODO Auto-generated method stub                        
                      }
                    }).show();
                 mTextView1.setText("然后，翻开第二张牌。心中想着现在。它将告诉你从这份爱中获得了什么。");                
                 break;
               case 33:
                 new AlertDialog.Builder(cardarray2.this).setTitle("").setMessage(R.string.t11_1)
                 .setPositiveButton("OK", 
                     new DialogInterface.OnClickListener()
                    {
                      
                      @Override
                      public void onClick(DialogInterface dialog, int which)
                      {
                        // TODO Auto-generated method stub                        
                      }
                    }).show();
                 mTextView1.setText("然后，翻开第二张牌。心中想着现在。它将告诉你从这份爱中获得了什么。");                
                 break;
               case 34:
                 new AlertDialog.Builder(cardarray2.this).setTitle("").setMessage(R.string.t12_1)
                 .setPositiveButton("OK", 
                     new DialogInterface.OnClickListener()
                    {
                      
                      @Override
                      public void onClick(DialogInterface dialog, int which)
                      {
                        // TODO Auto-generated method stub                        
                      }
                    }).show();
                 mTextView1.setText("然后，翻开第二张牌。心中想着现在。它将告诉你从这份爱中获得了什么。");                
                 break;
               case 35:
                 new AlertDialog.Builder(cardarray2.this).setTitle("").setMessage(R.string.t13_1)
                 .setPositiveButton("OK", 
                     new DialogInterface.OnClickListener()
                    {
                      
                      @Override
                      public void onClick(DialogInterface dialog, int which)
                      {
                        // TODO Auto-generated method stub                        
                      }
                    }).show();
                 mTextView1.setText("然后，翻开第二张牌。心中想着现在。它将告诉你从这份爱中获得了什么。");                
                 break;
               case 36:
                 new AlertDialog.Builder(cardarray2.this).setTitle("").setMessage(R.string.t14_1)
                 .setPositiveButton("OK", 
                     new DialogInterface.OnClickListener()
                    {
                      
                      @Override
                      public void onClick(DialogInterface dialog, int which)
                      {
                        // TODO Auto-generated method stub                        
                      }
                    }).show();
                 mTextView1.setText("然后，翻开第二张牌。心中想着现在。它将告诉你从这份爱中获得了什么。");                
                 break;
               case 37:
                 new AlertDialog.Builder(cardarray2.this).setTitle("").setMessage(R.string.t15_1)
                 .setPositiveButton("OK", 
                     new DialogInterface.OnClickListener()
                    {
                      
                      @Override
                      public void onClick(DialogInterface dialog, int which)
                      {
                        // TODO Auto-generated method stub                        
                      }
                    }).show();
                 mTextView1.setText("然后，翻开第二张牌。心中想着现在。它将告诉你从这份爱中获得了什么。");                
                 break;
               case 38:
                 new AlertDialog.Builder(cardarray2.this).setTitle("").setMessage(R.string.t16_1)
                 .setPositiveButton("OK", 
                     new DialogInterface.OnClickListener()
                    {
                      
                      @Override
                      public void onClick(DialogInterface dialog, int which)
                      {
                        // TODO Auto-generated method stub                        
                      }
                    }).show();
                 mTextView1.setText("然后，翻开第二张牌。心中想着现在。它将告诉你从这份爱中获得了什么。");                
                 break;
               case 39:
                 new AlertDialog.Builder(cardarray2.this).setTitle("").setMessage(R.string.t17_1)
                 .setPositiveButton("OK", 
                     new DialogInterface.OnClickListener()
                    {
                      
                      @Override
                      public void onClick(DialogInterface dialog, int which)
                      {
                        // TODO Auto-generated method stub                        
                      }
                    }).show();
                 mTextView1.setText("然后，翻开第二张牌。心中想着现在。它将告诉你从这份爱中获得了什么。");                
                 break;
               case 40:
                 new AlertDialog.Builder(cardarray2.this).setTitle("").setMessage(R.string.t18_1)
                 .setPositiveButton("OK", 
                     new DialogInterface.OnClickListener()
                    {
                      
                      @Override
                      public void onClick(DialogInterface dialog, int which)
                      {
                        // TODO Auto-generated method stub                        
                      }
                    }).show();
                 mTextView1.setText("然后，翻开第二张牌。心中想着现在。它将告诉你从这份爱中获得了什么。");                
                 break;
               case 41:
                 new AlertDialog.Builder(cardarray2.this).setTitle("").setMessage(R.string.t19_1)
                 .setPositiveButton("OK", 
                     new DialogInterface.OnClickListener()
                    {
                      
                      @Override
                      public void onClick(DialogInterface dialog, int which)
                      {
                        // TODO Auto-generated method stub                        
                      }
                    }).show();
                 mTextView1.setText("然后，翻开第二张牌。心中想着现在。它将告诉你从这份爱中获得了什么。");                
                 break;
               case 42:
                 new AlertDialog.Builder(cardarray2.this).setTitle("").setMessage(R.string.t20_1)
                 .setPositiveButton("OK", 
                     new DialogInterface.OnClickListener()
                    {
                      
                      @Override
                      public void onClick(DialogInterface dialog, int which)
                      {
                        // TODO Auto-generated method stub                        
                      }
                    }).show();
                 mTextView1.setText("然后，翻开第二张牌。心中想着现在。它将告诉你从这份爱中获得了什么。");                
                 break;
               case 43:
                 new AlertDialog.Builder(cardarray2.this).setTitle("").setMessage(R.string.t21_1)
                 .setPositiveButton("OK", 
                     new DialogInterface.OnClickListener()
                    {
                      
                      @Override
                      public void onClick(DialogInterface dialog, int which)
                      {
                        // TODO Auto-generated method stub                        
                      }
                    }).show();
                 mTextView1.setText("然后，翻开第二张牌。心中想着现在。它将告诉你从这份爱中获得了什么。");                
                 break;

               default:
                 break;
             }
            
            i_1=2;  
          }
         }
     } );
    
    mImageButton2.setOnClickListener(new OnClickListener()
    {
      
      public void onClick(View v)
      {
        // TODO Auto-generated method stub
        if (i_1!=2)
        {
          new AlertDialog.Builder(cardarray2.this).setTitle("").setMessage("提示：请先翻开第一张牌。")
          .setPositiveButton("OK", 
              new DialogInterface.OnClickListener()
             {
               
               @Override
               public void onClick(DialogInterface dialog, int which)
               {
                 // TODO Auto-generated method stub                        
               }
             }).show();
        }
        else if (i_2==0)
        {
          mTextView3.setText("");
           switch (i2)
          {
            case 0:
              mImageButton2.setImageResource(R.drawable.i0);
              mTextView1.setText("这是一张正位的愚人牌。现在点击牌面查看它的释义，你将根据它来回答你从现在这份爱中获得了什么。");
              break;
            case 1:
              mImageButton2.setImageResource(R.drawable.i1);
              mTextView1.setText("这是一张正位的魔术师牌。现在点击牌面查看它的释义，你将根据它来回答你从现在这份爱中获得了什么。");
              break;
            case 2:
              mImageButton2.setImageResource(R.drawable.i2);
              mTextView1.setText("这是一张正位的女祭司牌。现在点击牌面查看它的释义，你将根据它来回答你从现在这份爱中获得了什么。");
              break;
            case 3:
              mImageButton2.setImageResource(R.drawable.i3);
              mTextView1.setText("这是一张正位的女皇牌。现在点击牌面查看它的释义，你将根据它来回答你从现在这份爱中获得了什么。");
              break;
            case 4:
              mImageButton2.setImageResource(R.drawable.i4);
              mTextView1.setText("这是一张正位的皇帝牌。现在点击牌面查看它的释义，你将根据它来回答你从现在这份爱中获得了什么。");
              break;
            case 5:
              mImageButton2.setImageResource(R.drawable.i5);
              mTextView1.setText("这是一张正位的教宗牌。现在点击牌面查看它的释义，你将根据它来回答你从现在这份爱中获得了什么。");
              break;
            case 6:
              mImageButton2.setImageResource(R.drawable.i6);
              mTextView1.setText("这是一张正位的恋人牌。现在点击牌面查看它的释义，你将根据它来回答你从现在这份爱中获得了什么。");
              break;
            case 7:
              mImageButton2.setImageResource(R.drawable.i7);
              mTextView1.setText("这是一张正位的战车牌。现在点击牌面查看它的释义，你将根据它来回答你从现在这份爱中获得了什么。");
              break;
            case 8:
              mImageButton2.setImageResource(R.drawable.i8);
              mTextView1.setText("这是一张正位的力量牌。现在点击牌面查看它的释义，你将根据它来回答你从现在这份爱中获得了什么。");
              break;
            case 9:
              mImageButton2.setImageResource(R.drawable.i9);
              mTextView1.setText("这是一张正位的隐士牌。现在点击牌面查看它的释义，你将根据它来回答你从现在这份爱中获得了什么。");
              break;
            case 10:
              mImageButton2.setImageResource(R.drawable.i10);
              mTextView1.setText("这是一张正位的命运之轮牌。现在点击牌面查看它的释义，你将根据它来回答你从现在这份爱中获得了什么。");
              break;
            case 11:
              mImageButton2.setImageResource(R.drawable.i11);
              mTextView1.setText("这是一张正位的正义牌。现在点击牌面查看它的释义，你将根据它来回答你从现在这份爱中获得了什么。");
              break;
            case 12:
              mImageButton2.setImageResource(R.drawable.i12);
              mTextView1.setText("这是一张正位的倒吊者牌。现在点击牌面查看它的释义，你将根据它来回答你从现在这份爱中获得了什么。");
              break;
            case 13:
              mImageButton2.setImageResource(R.drawable.i13);
              mTextView1.setText("这是一张正位的死神牌。现在点击牌面查看它的释义，你将根据它来回答你从现在这份爱中获得了什么。");
              break;
            case 14:
              mImageButton2.setImageResource(R.drawable.i14);
              mTextView1.setText("这是一张正位的节制牌。现在点击牌面查看它的释义，你将根据它来回答你从现在这份爱中获得了什么。");
              break;
            case 15:
              mImageButton2.setImageResource(R.drawable.i15);
              mTextView1.setText("这是一张正位的恶魔牌。现在点击牌面查看它的释义，你将根据它来回答你从现在这份爱中获得了什么。");
              break;
            case 16:
              mImageButton2.setImageResource(R.drawable.i16);
              mTextView1.setText("这是一张正位的塔牌。现在点击牌面查看它的释义，你将根据它来回答你从现在这份爱中获得了什么。");
              break;
            case 17:
              mImageButton2.setImageResource(R.drawable.i17);
              mTextView1.setText("这是一张正位的星星牌。现在点击牌面查看它的释义，你将根据它来回答你从现在这份爱中获得了什么。");
              break;
            case 18:
              mImageButton2.setImageResource(R.drawable.i18);
              mTextView1.setText("这是一张正位的月亮牌。现在点击牌面查看它的释义，你将根据它来回答你从现在这份爱中获得了什么。");
              break;
            case 19:
              mImageButton2.setImageResource(R.drawable.i19);
              mTextView1.setText("这是一张正位的太阳牌。现在点击牌面查看它的释义，你将根据它来回答你从现在这份爱中获得了什么。");
              break;
            case 20:
              mImageButton2.setImageResource(R.drawable.i20);
              mTextView1.setText("这是一张正位的审判牌。现在点击牌面查看它的释义，你将根据它来回答你从现在这份爱中获得了什么。");
              break;
            case 21:
              mImageButton2.setImageResource(R.drawable.i21);
              mTextView1.setText("这是一张正位的世界牌。现在点击牌面查看它的释义，你将根据它来回答你从现在这份爱中获得了什么。");
              break;
            case 22:
              mImageButton2.setImageResource(R.drawable.i22);
              mTextView1.setText("这是一张逆位的愚人牌。现在点击牌面查看它的释义，你将根据它来回答你从现在这份爱中获得了什么。");
              break;
            case 23:
              mImageButton2.setImageResource(R.drawable.i23);
              mTextView1.setText("这是一张逆位的魔术师牌。现在点击牌面查看它的释义，你将根据它来回答你从现在这份爱中获得了什么。");
              break;
            case 24:
              mImageButton2.setImageResource(R.drawable.i24);
              mTextView1.setText("这是一张逆位的女祭司牌。现在点击牌面查看它的释义，你将根据它来回答你从现在这份爱中获得了什么。");
              break;
            case 25:
              mImageButton2.setImageResource(R.drawable.i25);
              mTextView1.setText("这是一张逆位的女皇牌。现在点击牌面查看它的释义，你将根据它来回答你从现在这份爱中获得了什么。");
              break;
            case 26:
              mImageButton2.setImageResource(R.drawable.i26);
              mTextView1.setText("这是一张逆位的皇帝牌。现在点击牌面查看它的释义，你将根据它来回答你从现在这份爱中获得了什么。");
              break;
            case 27:
              mImageButton2.setImageResource(R.drawable.i27);
              mTextView1.setText("这是一张逆位的教宗牌。现在点击牌面查看它的释义，你将根据它来回答你从现在这份爱中获得了什么。");
              break;
            case 28:
              mImageButton2.setImageResource(R.drawable.i28);
              mTextView1.setText("这是一张逆位的恋人牌。现在点击牌面查看它的释义，你将根据它来回答你从现在这份爱中获得了什么。");
              break;
            case 29:
              mImageButton2.setImageResource(R.drawable.i29);
              mTextView1.setText("这是一张逆位的战车牌。现在点击牌面查看它的释义，你将根据它来回答你从现在这份爱中获得了什么。");
              break;
            case 30:
              mImageButton2.setImageResource(R.drawable.i30);
              mTextView1.setText("这是一张逆位的力量牌。现在点击牌面查看它的释义，你将根据它来回答你从现在这份爱中获得了什么。");
              break;
            case 31:
              mImageButton2.setImageResource(R.drawable.i31);
              mTextView1.setText("这是一张逆位的隐士牌。现在点击牌面查看它的释义，你将根据它来回答你从现在这份爱中获得了什么。");
              break;
            case 32:
              mImageButton2.setImageResource(R.drawable.i32);
              mTextView1.setText("这是一张逆位的命运之轮牌。现在点击牌面查看它的释义，你将根据它来回答你从现在这份爱中获得了什么。");
              break;
            case 33:
              mImageButton2.setImageResource(R.drawable.i33);
              mTextView1.setText("这是一张逆位的正义牌。现在点击牌面查看它的释义，你将根据它来回答你从现在这份爱中获得了什么。");
              break;
            case 34:
              mImageButton2.setImageResource(R.drawable.i34);
              mTextView1.setText("这是一张逆位的倒吊者牌。现在点击牌面查看它的释义，你将根据它来回答你从现在这份爱中获得了什么。");
              break;
            case 35:
              mImageButton2.setImageResource(R.drawable.i35);
              mTextView1.setText("这是一张逆位的死神牌。现在点击牌面查看它的释义，你将根据它来回答你从现在这份爱中获得了什么。");
              break;
            case 36:
              mImageButton2.setImageResource(R.drawable.i36);
              mTextView1.setText("这是一张逆位的节制牌。现在点击牌面查看它的释义，你将根据它来回答你从现在这份爱中获得了什么。");
              break;
            case 37:
              mImageButton2.setImageResource(R.drawable.i37);
              mTextView1.setText("这是一张逆位的恶魔牌。现在点击牌面查看它的释义，你将根据它来回答你从现在这份爱中获得了什么。");
              break;
            case 38:
              mImageButton2.setImageResource(R.drawable.i38);
              mTextView1.setText("这是一张逆位的塔牌。现在点击牌面查看它的释义，你将根据它来回答你从现在这份爱中获得了什么。");
              break;
            case 39:
              mImageButton2.setImageResource(R.drawable.i39);
              mTextView1.setText("这是一张逆位的星星牌。现在点击牌面查看它的释义，你将根据它来回答你从现在这份爱中获得了什么。");
              break;
            case 40:
              mImageButton2.setImageResource(R.drawable.i40);
              mTextView1.setText("这是一张逆位的月亮牌。现在点击牌面查看它的释义，你将根据它来回答你从现在这份爱中获得了什么。");
              break;
            case 41:
              mImageButton2.setImageResource(R.drawable.i41);
              mTextView1.setText("这是一张逆位的太阳牌。现在点击牌面查看它的释义，你将根据它来回答你从现在这份爱中获得了什么。");
              break;
            case 42:
              mImageButton2.setImageResource(R.drawable.i42);
              mTextView1.setText("这是一张逆位的审判牌。现在点击牌面查看它的释义，你将根据它来回答你从现在这份爱中获得了什么。");
              break;
            case 43:
              mImageButton2.setImageResource(R.drawable.i43);
              mTextView1.setText("这是一张逆位的世界牌。现在点击牌面查看它的释义，你将根据它来回答你从现在这份爱中获得了什么。");
              break;
            
            default:
              break;
          }
           i_2=1;
        }
         else {
           switch (i2)
           {
             case 0:
               new AlertDialog.Builder(cardarray2.this).setTitle("").setMessage(R.string.t0_0)
               .setPositiveButton("OK", 
                   new DialogInterface.OnClickListener()
                  {
                    
                    @Override
                    public void onClick(DialogInterface dialog, int which)
                    {
                      // TODO Auto-generated method stub                        
                    }
                  }).show();
               mTextView1.setText("然后，翻开第三张牌。心中想着将来。它将告诉你从这份爱的未来。");                
               break;
             case 1:
               new AlertDialog.Builder(cardarray2.this).setTitle("").setMessage(R.string.t1_0)
               .setPositiveButton("OK", 
                   new DialogInterface.OnClickListener()
                  {
                    
                    @Override
                    public void onClick(DialogInterface dialog, int which)
                    {
                      // TODO Auto-generated method stub                        
                    }
                  }).show();
               mTextView1.setText("然后，翻开第三张牌。心中想着将来。它将告诉你从这份爱的未来。");                
               break;
             case 2:
               new AlertDialog.Builder(cardarray2.this).setTitle("").setMessage(R.string.t2_0)
               .setPositiveButton("OK", 
                   new DialogInterface.OnClickListener()
                  {
                    
                    @Override
                    public void onClick(DialogInterface dialog, int which)
                    {
                      // TODO Auto-generated method stub                        
                    }
                  }).show();
               mTextView1.setText("然后，翻开第三张牌。心中想着将来。它将告诉你从这份爱的未来。");                
               break;
             case 3:
               new AlertDialog.Builder(cardarray2.this).setTitle("").setMessage(R.string.t3_0)
               .setPositiveButton("OK", 
                   new DialogInterface.OnClickListener()
                  {
                    
                    @Override
                    public void onClick(DialogInterface dialog, int which)
                    {
                      // TODO Auto-generated method stub                        
                    }
                  }).show();
               mTextView1.setText("然后，翻开第三张牌。心中想着将来。它将告诉你从这份爱的未来。");                
               break;
             case 4:
               new AlertDialog.Builder(cardarray2.this).setTitle("").setMessage(R.string.t4_0)
               .setPositiveButton("OK", 
                   new DialogInterface.OnClickListener()
                  {
                    
                    @Override
                    public void onClick(DialogInterface dialog, int which)
                    {
                      // TODO Auto-generated method stub                        
                    }
                  }).show();
               mTextView1.setText("然后，翻开第三张牌。心中想着将来。它将告诉你从这份爱的未来。");                
               break;
             case 5:
               new AlertDialog.Builder(cardarray2.this).setTitle("").setMessage(R.string.t5_0)
               .setPositiveButton("OK", 
                   new DialogInterface.OnClickListener()
                  {
                    
                    @Override
                    public void onClick(DialogInterface dialog, int which)
                    {
                      // TODO Auto-generated method stub                        
                    }
                  }).show();
               mTextView1.setText("然后，翻开第三张牌。心中想着将来。它将告诉你从这份爱的未来。");                
               break;
             case 6:
               new AlertDialog.Builder(cardarray2.this).setTitle("").setMessage(R.string.t6_0)
               .setPositiveButton("OK", 
                   new DialogInterface.OnClickListener()
                  {
                    
                    @Override
                    public void onClick(DialogInterface dialog, int which)
                    {
                      // TODO Auto-generated method stub                        
                    }
                  }).show();
               mTextView1.setText("然后，翻开第三张牌。心中想着将来。它将告诉你从这份爱的未来。");                
               break;
             case 7:
               new AlertDialog.Builder(cardarray2.this).setTitle("").setMessage(R.string.t7_0)
               .setPositiveButton("OK", 
                   new DialogInterface.OnClickListener()
                  {
                    
                    @Override
                    public void onClick(DialogInterface dialog, int which)
                    {
                      // TODO Auto-generated method stub                        
                    }
                  }).show();
               mTextView1.setText("然后，翻开第三张牌。心中想着将来。它将告诉你从这份爱的未来。");                
               break;
             case 8:
               new AlertDialog.Builder(cardarray2.this).setTitle("").setMessage(R.string.t8_0)
               .setPositiveButton("OK", 
                   new DialogInterface.OnClickListener()
                  {
                    
                    @Override
                    public void onClick(DialogInterface dialog, int which)
                    {
                      // TODO Auto-generated method stub                        
                    }
                  }).show();
               mTextView1.setText("然后，翻开第三张牌。心中想着将来。它将告诉你从这份爱的未来。");                
               break;
             case 9:
               new AlertDialog.Builder(cardarray2.this).setTitle("").setMessage(R.string.t9_0)
               .setPositiveButton("OK", 
                   new DialogInterface.OnClickListener()
                  {
                    
                    @Override
                    public void onClick(DialogInterface dialog, int which)
                    {
                      // TODO Auto-generated method stub                        
                    }
                  }).show();
               mTextView1.setText("然后，翻开第三张牌。心中想着将来。它将告诉你从这份爱的未来。");                
               break;
             case 10:
               new AlertDialog.Builder(cardarray2.this).setTitle("").setMessage(R.string.t10_0)
               .setPositiveButton("OK", 
                   new DialogInterface.OnClickListener()
                  {
                    
                    @Override
                    public void onClick(DialogInterface dialog, int which)
                    {
                      // TODO Auto-generated method stub                        
                    }
                  }).show();;
               mTextView1.setText("然后，翻开第三张牌。心中想着将来。它将告诉你从这份爱的未来。");                
               break;
             case 11:
               new AlertDialog.Builder(cardarray2.this).setTitle("").setMessage(R.string.t11_0)
               .setPositiveButton("OK", 
                   new DialogInterface.OnClickListener()
                  {
                    
                    @Override
                    public void onClick(DialogInterface dialog, int which)
                    {
                      // TODO Auto-generated method stub                        
                    }
                  }).show();
               mTextView1.setText("然后，翻开第三张牌。心中想着将来。它将告诉你从这份爱的未来。");                
               break;
             case 12:
               new AlertDialog.Builder(cardarray2.this).setTitle("").setMessage(R.string.t12_0)
               .setPositiveButton("OK", 
                   new DialogInterface.OnClickListener()
                  {
                    
                    @Override
                    public void onClick(DialogInterface dialog, int which)
                    {
                      // TODO Auto-generated method stub                        
                    }
                  }).show();
               mTextView1.setText("然后，翻开第三张牌。心中想着将来。它将告诉你从这份爱的未来。");                
               break;
             case 13:
               new AlertDialog.Builder(cardarray2.this).setTitle("").setMessage(R.string.t13_0)
               .setPositiveButton("OK", 
                   new DialogInterface.OnClickListener()
                  {
                    
                    @Override
                    public void onClick(DialogInterface dialog, int which)
                    {
                      // TODO Auto-generated method stub                        
                    }
                  }).show();
               mTextView1.setText("然后，翻开第三张牌。心中想着将来。它将告诉你从这份爱的未来。");                
               break;
             case 14:
               new AlertDialog.Builder(cardarray2.this).setTitle("").setMessage(R.string.t14_0)
               .setPositiveButton("OK", 
                   new DialogInterface.OnClickListener()
                  {
                    
                    @Override
                    public void onClick(DialogInterface dialog, int which)
                    {
                      // TODO Auto-generated method stub                        
                    }
                  }).show();
               mTextView1.setText("然后，翻开第三张牌。心中想着将来。它将告诉你从这份爱的未来。");                
               break;
             case 15:
               new AlertDialog.Builder(cardarray2.this).setTitle("").setMessage(R.string.t15_0)
               .setPositiveButton("OK", 
                   new DialogInterface.OnClickListener()
                  {
                    
                    @Override
                    public void onClick(DialogInterface dialog, int which)
                    {
                      // TODO Auto-generated method stub                        
                    }
                  }).show();
               mTextView1.setText("然后，翻开第三张牌。心中想着将来。它将告诉你从这份爱的未来。");                
               break;
             case 16:
               new AlertDialog.Builder(cardarray2.this).setTitle("").setMessage(R.string.t16_0)
               .setPositiveButton("OK", 
                   new DialogInterface.OnClickListener()
                  {
                    
                    @Override
                    public void onClick(DialogInterface dialog, int which)
                    {
                      // TODO Auto-generated method stub                        
                    }
                  }).show();
               mTextView1.setText("然后，翻开第三张牌。心中想着将来。它将告诉你从这份爱的未来。");                
               break;
             case 17:
               new AlertDialog.Builder(cardarray2.this).setTitle("").setMessage(R.string.t17_0)
               .setPositiveButton("OK", 
                   new DialogInterface.OnClickListener()
                  {
                    
                    @Override
                    public void onClick(DialogInterface dialog, int which)
                    {
                      // TODO Auto-generated method stub                        
                    }
                  }).show();
               mTextView1.setText("然后，翻开第三张牌。心中想着将来。它将告诉你从这份爱的未来。");                
               break;
             case 18:
               new AlertDialog.Builder(cardarray2.this).setTitle("").setMessage(R.string.t18_0)
               .setPositiveButton("OK", 
                   new DialogInterface.OnClickListener()
                  {
                    
                    @Override
                    public void onClick(DialogInterface dialog, int which)
                    {
                      // TODO Auto-generated method stub                        
                    }
                  }).show();
               mTextView1.setText("然后，翻开第三张牌。心中想着将来。它将告诉你从这份爱的未来。");                
               break;
             case 19:
               new AlertDialog.Builder(cardarray2.this).setTitle("").setMessage(R.string.t19_0)
               .setPositiveButton("OK", 
                   new DialogInterface.OnClickListener()
                  {
                    
                    @Override
                    public void onClick(DialogInterface dialog, int which)
                    {
                      // TODO Auto-generated method stub                        
                    }
                  }).show();
               mTextView1.setText("然后，翻开第三张牌。心中想着将来。它将告诉你从这份爱的未来。");                
               break;
             case 20:
               new AlertDialog.Builder(cardarray2.this).setTitle("").setMessage(R.string.t20_0)
               .setPositiveButton("OK", 
                   new DialogInterface.OnClickListener()
                  {
                    
                    @Override
                    public void onClick(DialogInterface dialog, int which)
                    {
                      // TODO Auto-generated method stub                        
                    }
                  }).show();
               mTextView1.setText("然后，翻开第三张牌。心中想着将来。它将告诉你从这份爱的未来。");                
               break;
             case 21:
               new AlertDialog.Builder(cardarray2.this).setTitle("").setMessage(R.string.t21_0)
               .setPositiveButton("OK", 
                   new DialogInterface.OnClickListener()
                  {
                    
                    @Override
                    public void onClick(DialogInterface dialog, int which)
                    {
                      // TODO Auto-generated method stub                        
                    }
                  }).show();
               mTextView1.setText("然后，翻开第三张牌。心中想着将来。它将告诉你从这份爱的未来。");                
               break;
             case 22:
               new AlertDialog.Builder(cardarray2.this).setTitle("").setMessage(R.string.t0_1)
               .setPositiveButton("OK", 
                   new DialogInterface.OnClickListener()
                  {
                    
                    @Override
                    public void onClick(DialogInterface dialog, int which)
                    {
                      // TODO Auto-generated method stub                        
                    }
                  }).show();
               mTextView1.setText("然后，翻开第三张牌。心中想着将来。它将告诉你从这份爱的未来。");                
               break;
             case 23:
               new AlertDialog.Builder(cardarray2.this).setTitle("").setMessage(R.string.t1_1)
               .setPositiveButton("OK", 
                   new DialogInterface.OnClickListener()
                  {
                    
                    @Override
                    public void onClick(DialogInterface dialog, int which)
                    {
                      // TODO Auto-generated method stub                        
                    }
                  }).show();
               mTextView1.setText("然后，翻开第三张牌。心中想着将来。它将告诉你从这份爱的未来。");                
               break;
             case 24:
               new AlertDialog.Builder(cardarray2.this).setTitle("").setMessage(R.string.t2_1)
               .setPositiveButton("OK", 
                   new DialogInterface.OnClickListener()
                  {
                    
                    @Override
                    public void onClick(DialogInterface dialog, int which)
                    {
                      // TODO Auto-generated method stub                        
                    }
                  }).show();
               mTextView1.setText("然后，翻开第三张牌。心中想着将来。它将告诉你从这份爱的未来。");                
               break;
             case 25:
               new AlertDialog.Builder(cardarray2.this).setTitle("").setMessage(R.string.t3_1)
               .setPositiveButton("OK", 
                   new DialogInterface.OnClickListener()
                  {
                    
                    @Override
                    public void onClick(DialogInterface dialog, int which)
                    {
                      // TODO Auto-generated method stub                        
                    }
                  }).show();
               mTextView1.setText("然后，翻开第三张牌。心中想着将来。它将告诉你从这份爱的未来。");                
               break;
             case 26:
               new AlertDialog.Builder(cardarray2.this).setTitle("").setMessage(R.string.t4_1)
               .setPositiveButton("OK", 
                   new DialogInterface.OnClickListener()
                  {
                    
                    @Override
                    public void onClick(DialogInterface dialog, int which)
                    {
                      // TODO Auto-generated method stub                        
                    }
                  }).show();
               mTextView1.setText("然后，翻开第三张牌。心中想着将来。它将告诉你从这份爱的未来。");                
               break;
             case 27:
               new AlertDialog.Builder(cardarray2.this).setTitle("").setMessage(R.string.t5_1)
               .setPositiveButton("OK", 
                   new DialogInterface.OnClickListener()
                  {
                    
                    @Override
                    public void onClick(DialogInterface dialog, int which)
                    {
                      // TODO Auto-generated method stub                        
                    }
                  }).show();
               mTextView1.setText("然后，翻开第三张牌。心中想着将来。它将告诉你从这份爱的未来。");                
               break;
             case 28:
               new AlertDialog.Builder(cardarray2.this).setTitle("").setMessage(R.string.t6_1)
               .setPositiveButton("OK", 
                   new DialogInterface.OnClickListener()
                  {
                    
                    @Override
                    public void onClick(DialogInterface dialog, int which)
                    {
                      // TODO Auto-generated method stub                        
                    }
                  }).show();
               mTextView1.setText("然后，翻开第三张牌。心中想着将来。它将告诉你从这份爱的未来。");                
               break;
             case 29:
               new AlertDialog.Builder(cardarray2.this).setTitle("").setMessage(R.string.t7_1)
               .setPositiveButton("OK", 
                   new DialogInterface.OnClickListener()
                  {
                    
                    @Override
                    public void onClick(DialogInterface dialog, int which)
                    {
                      // TODO Auto-generated method stub                        
                    }
                  }).show();
               mTextView1.setText("然后，翻开第三张牌。心中想着将来。它将告诉你从这份爱的未来。");                
               break;
             case 30:
               new AlertDialog.Builder(cardarray2.this).setTitle("").setMessage(R.string.t8_1)
               .setPositiveButton("OK", 
                   new DialogInterface.OnClickListener()
                  {
                    
                    @Override
                    public void onClick(DialogInterface dialog, int which)
                    {
                      // TODO Auto-generated method stub                        
                    }
                  }).show();
               mTextView1.setText("然后，翻开第三张牌。心中想着将来。它将告诉你从这份爱的未来。");                
               break;
             case 31:
               new AlertDialog.Builder(cardarray2.this).setTitle("").setMessage(R.string.t9_1)
               .setPositiveButton("OK", 
                   new DialogInterface.OnClickListener()
                  {
                    
                    @Override
                    public void onClick(DialogInterface dialog, int which)
                    {
                      // TODO Auto-generated method stub                        
                    }
                  }).show();
               mTextView1.setText("然后，翻开第三张牌。心中想着将来。它将告诉你从这份爱的未来。");                
               break;
             case 32:
               new AlertDialog.Builder(cardarray2.this).setTitle("").setMessage(R.string.t10_1)
               .setPositiveButton("OK", 
                   new DialogInterface.OnClickListener()
                  {
                    
                    @Override
                    public void onClick(DialogInterface dialog, int which)
                    {
                      // TODO Auto-generated method stub                        
                    }
                  }).show();
               mTextView1.setText("然后，翻开第三张牌。心中想着将来。它将告诉你从这份爱的未来。");                
               break;
             case 33:
               new AlertDialog.Builder(cardarray2.this).setTitle("").setMessage(R.string.t11_1)
               .setPositiveButton("OK", 
                   new DialogInterface.OnClickListener()
                  {
                    
                    @Override
                    public void onClick(DialogInterface dialog, int which)
                    {
                      // TODO Auto-generated method stub                        
                    }
                  }).show();
               mTextView1.setText("然后，翻开第三张牌。心中想着将来。它将告诉你从这份爱的未来。");                
               break;
             case 34:
               new AlertDialog.Builder(cardarray2.this).setTitle("").setMessage(R.string.t12_1)
               .setPositiveButton("OK", 
                   new DialogInterface.OnClickListener()
                  {
                    
                    @Override
                    public void onClick(DialogInterface dialog, int which)
                    {
                      // TODO Auto-generated method stub                        
                    }
                  }).show();
               mTextView1.setText("然后，翻开第三张牌。心中想着将来。它将告诉你从这份爱的未来。");                
               break;
             case 35:
               new AlertDialog.Builder(cardarray2.this).setTitle("").setMessage(R.string.t13_1)
               .setPositiveButton("OK", 
                   new DialogInterface.OnClickListener()
                  {
                    
                    @Override
                    public void onClick(DialogInterface dialog, int which)
                    {
                      // TODO Auto-generated method stub                        
                    }
                  }).show();
               mTextView1.setText("然后，翻开第三张牌。心中想着将来。它将告诉你从这份爱的未来。");                
               break;
             case 36:
               new AlertDialog.Builder(cardarray2.this).setTitle("").setMessage(R.string.t14_1)
               .setPositiveButton("OK", 
                   new DialogInterface.OnClickListener()
                  {
                    
                    @Override
                    public void onClick(DialogInterface dialog, int which)
                    {
                      // TODO Auto-generated method stub                        
                    }
                  }).show();
               mTextView1.setText("然后，翻开第三张牌。心中想着将来。它将告诉你从这份爱的未来。");                
               break;
             case 37:
               new AlertDialog.Builder(cardarray2.this).setTitle("").setMessage(R.string.t15_1)
               .setPositiveButton("OK", 
                   new DialogInterface.OnClickListener()
                  {
                    
                    @Override
                    public void onClick(DialogInterface dialog, int which)
                    {
                      // TODO Auto-generated method stub                        
                    }
                  }).show();
               mTextView1.setText("然后，翻开第三张牌。心中想着将来。它将告诉你从这份爱的未来。");                
               break;
             case 38:
               new AlertDialog.Builder(cardarray2.this).setTitle("").setMessage(R.string.t16_1)
               .setPositiveButton("OK", 
                   new DialogInterface.OnClickListener()
                  {
                    
                    @Override
                    public void onClick(DialogInterface dialog, int which)
                    {
                      // TODO Auto-generated method stub                        
                    }
                  }).show();
               mTextView1.setText("然后，翻开第三张牌。心中想着将来。它将告诉你从这份爱的未来。");                
               break;
             case 39:
               new AlertDialog.Builder(cardarray2.this).setTitle("").setMessage(R.string.t17_1)
               .setPositiveButton("OK", 
                   new DialogInterface.OnClickListener()
                  {
                    
                    @Override
                    public void onClick(DialogInterface dialog, int which)
                    {
                      // TODO Auto-generated method stub                        
                    }
                  }).show();
               mTextView1.setText("然后，翻开第三张牌。心中想着将来。它将告诉你从这份爱的未来。");                
               break;
             case 40:
               new AlertDialog.Builder(cardarray2.this).setTitle("").setMessage(R.string.t18_1)
               .setPositiveButton("OK", 
                   new DialogInterface.OnClickListener()
                  {
                    
                    @Override
                    public void onClick(DialogInterface dialog, int which)
                    {
                      // TODO Auto-generated method stub                        
                    }
                  }).show();
               mTextView1.setText("然后，翻开第三张牌。心中想着将来。它将告诉你从这份爱的未来。");                
               break;
             case 41:
               new AlertDialog.Builder(cardarray2.this).setTitle("").setMessage(R.string.t19_1)
               .setPositiveButton("OK", 
                   new DialogInterface.OnClickListener()
                  {
                    
                    @Override
                    public void onClick(DialogInterface dialog, int which)
                    {
                      // TODO Auto-generated method stub                        
                    }
                  }).show();
               mTextView1.setText("然后，翻开第三张牌。心中想着将来。它将告诉你从这份爱的未来。");                
               break;
             case 42:
               new AlertDialog.Builder(cardarray2.this).setTitle("").setMessage(R.string.t20_1)
               .setPositiveButton("OK", 
                   new DialogInterface.OnClickListener()
                  {
                    
                    @Override
                    public void onClick(DialogInterface dialog, int which)
                    {
                      // TODO Auto-generated method stub                        
                    }
                  }).show();
               mTextView1.setText("然后，翻开第三张牌。心中想着将来。它将告诉你从这份爱的未来。");                
               break;
             case 43:
               new AlertDialog.Builder(cardarray2.this).setTitle("").setMessage(R.string.t21_1)
               .setPositiveButton("OK", 
                   new DialogInterface.OnClickListener()
                  {
                    
                    @Override
                    public void onClick(DialogInterface dialog, int which)
                    {
                      // TODO Auto-generated method stub                        
                    }
                  }).show();
               mTextView1.setText("然后，翻开第三张牌。心中想着将来。它将告诉你从这份爱的未来。");                
               break;

             default:
               break;
           }
           i_2=2;
        }
      }
    });
    
    mImageButton3.setOnClickListener(new OnClickListener()
    {
      
      public void onClick(View v)
      {
        // TODO Auto-generated method stub
        if (i_1!=2)
        {
          new AlertDialog.Builder(cardarray2.this).setTitle("").setMessage("提示：请先翻开第二张牌。")
          .setPositiveButton("OK", 
              new DialogInterface.OnClickListener()
             {
               
               @Override
               public void onClick(DialogInterface dialog, int which)
               {
                 // TODO Auto-generated method stub                        
               }
             }).show();
        }
        else if (i_2!=2)
        {
          new AlertDialog.Builder(cardarray2.this).setTitle("").setMessage("提示：请先翻开第二张牌。")
          .setPositiveButton("OK", 
              new DialogInterface.OnClickListener()
             {
               
               @Override
               public void onClick(DialogInterface dialog, int which)
               {
                 // TODO Auto-generated method stub                        
               }
             }).show();
        }
        else if (i_3==0)
        {
          mTextView4.setText("");
           switch (i3)
          {
            case 0:
              mImageButton3.setImageResource(R.drawable.i0);
              mTextView1.setText("这是一张正位的愚人牌。现在点击牌面查看它的释义，你将根据它来回答这份爱的未来。");
              break;
            case 1:
              mImageButton3.setImageResource(R.drawable.i1);
              mTextView1.setText("这是一张正位的魔术师牌。现在点击牌面查看它的释义，你将根据它来回答这份爱的未来。");
              break;
            case 2:
              mImageButton3.setImageResource(R.drawable.i2);
              mTextView1.setText("这是一张正位的女祭司牌。现在点击牌面查看它的释义，你将根据它来回答这份爱的未来。");
              break;
            case 3:
              mImageButton3.setImageResource(R.drawable.i3);
              mTextView1.setText("这是一张正位的女皇牌。现在点击牌面查看它的释义，你将根据它来回答这份爱的未来。");
              break;
            case 4:
              mImageButton3.setImageResource(R.drawable.i4);
              mTextView1.setText("这是一张正位的皇帝牌。现在点击牌面查看它的释义，你将根据它来回答这份爱的未来。");
              break;
            case 5:
              mImageButton3.setImageResource(R.drawable.i5);
              mTextView1.setText("这是一张正位的教宗牌。现在点击牌面查看它的释义，你将根据它来回答这份爱的未来。");
              break;
            case 6:
              mImageButton3.setImageResource(R.drawable.i6);
              mTextView1.setText("这是一张正位的恋人牌。现在点击牌面查看它的释义，你将根据它来回答这份爱的未来。");
              break;
            case 7:
              mImageButton3.setImageResource(R.drawable.i7);
              mTextView1.setText("这是一张正位的战车牌。现在点击牌面查看它的释义，你将根据它来回答这份爱的未来。");
              break;
            case 8:
              mImageButton3.setImageResource(R.drawable.i8);
              mTextView1.setText("这是一张正位的力量牌。现在点击牌面查看它的释义，你将根据它来回答这份爱的未来。");
              break;
            case 9:
              mImageButton3.setImageResource(R.drawable.i9);
              mTextView1.setText("这是一张正位的隐士牌。现在点击牌面查看它的释义，你将根据它来回答这份爱的未来。");
              break;
            case 10:
              mImageButton3.setImageResource(R.drawable.i10);
              mTextView1.setText("这是一张正位的命运之轮牌。现在点击牌面查看它的释义，你将根据它来回答这份爱的未来。");
              break;
            case 11:
              mImageButton3.setImageResource(R.drawable.i11);
              mTextView1.setText("这是一张正位的正义牌。现在点击牌面查看它的释义，你将根据它来回答这份爱的未来。");
              break;
            case 12:
              mImageButton3.setImageResource(R.drawable.i12);
              mTextView1.setText("这是一张正位的倒吊者牌。现在点击牌面查看它的释义，你将根据它来回答这份爱的未来。");
              break;
            case 13:
              mImageButton3.setImageResource(R.drawable.i13);
              mTextView1.setText("这是一张正位的死神牌。现在点击牌面查看它的释义，你将根据它来回答这份爱的未来。");
              break;
            case 14:
              mImageButton3.setImageResource(R.drawable.i14);
              mTextView1.setText("这是一张正位的节制牌。现在点击牌面查看它的释义，你将根据它来回答这份爱的未来。");
              break;
            case 15:
              mImageButton3.setImageResource(R.drawable.i15);
              mTextView1.setText("这是一张正位的恶魔牌。现在点击牌面查看它的释义，你将根据它来回答这份爱的未来。");
              break;
            case 16:
              mImageButton3.setImageResource(R.drawable.i16);
              mTextView1.setText("这是一张正位的塔牌。现在点击牌面查看它的释义，你将根据它来回答这份爱的未来。");
              break;
            case 17:
              mImageButton3.setImageResource(R.drawable.i17);
              mTextView1.setText("这是一张正位的星星牌。现在点击牌面查看它的释义，你将根据它来回答这份爱的未来。");
              break;
            case 18:
              mImageButton3.setImageResource(R.drawable.i18);
              mTextView1.setText("这是一张正位的月亮牌。现在点击牌面查看它的释义，你将根据它来回答这份爱的未来。");
              break;
            case 19:
              mImageButton3.setImageResource(R.drawable.i19);
              mTextView1.setText("这是一张正位的太阳牌。现在点击牌面查看它的释义，你将根据它来回答这份爱的未来。");
              break;
            case 20:
              mImageButton3.setImageResource(R.drawable.i20);
              mTextView1.setText("这是一张正位的审判牌。现在点击牌面查看它的释义，你将根据它来回答这份爱的未来。");
              break;
            case 21:
              mImageButton3.setImageResource(R.drawable.i21);
              mTextView1.setText("这是一张正位的世界牌。现在点击牌面查看它的释义，你将根据它来回答这份爱的未来。");
              break;
            case 22:
              mImageButton3.setImageResource(R.drawable.i22);
              mTextView1.setText("这是一张逆位的愚人牌。现在点击牌面查看它的释义，你将根据它来回答这份爱的未来。");
              break;
            case 23:
              mImageButton3.setImageResource(R.drawable.i23);
              mTextView1.setText("这是一张逆位的魔术师牌。现在点击牌面查看它的释义，你将根据它来回答这份爱的未来。");
              break;
            case 24:
              mImageButton3.setImageResource(R.drawable.i24);
              mTextView1.setText("这是一张逆位的女祭司牌。现在点击牌面查看它的释义，你将根据它来回答这份爱的未来。");
              break;
            case 25:
              mImageButton3.setImageResource(R.drawable.i25);
              mTextView1.setText("这是一张逆位的女皇牌。现在点击牌面查看它的释义，你将根据它来回答这份爱的未来。");
              break;
            case 26:
              mImageButton3.setImageResource(R.drawable.i26);
              mTextView1.setText("这是一张逆位的皇帝牌。现在点击牌面查看它的释义，你将根据它来回答这份爱的未来。");
              break;
            case 27:
              mImageButton3.setImageResource(R.drawable.i27);
              mTextView1.setText("这是一张逆位的教宗牌。现在点击牌面查看它的释义，你将根据它来回答这份爱的未来。");
              break;
            case 28:
              mImageButton3.setImageResource(R.drawable.i28);
              mTextView1.setText("这是一张逆位的恋人牌。现在点击牌面查看它的释义，你将根据它来回答这份爱的未来。");
              break;
            case 29:
              mImageButton3.setImageResource(R.drawable.i29);
              mTextView1.setText("这是一张逆位的战车牌。现在点击牌面查看它的释义，你将根据它来回答这份爱的未来。");
              break;
            case 30:
              mImageButton3.setImageResource(R.drawable.i30);
              mTextView1.setText("这是一张逆位的力量牌。现在点击牌面查看它的释义，你将根据它来回答这份爱的未来。");
              break;
            case 31:
              mImageButton3.setImageResource(R.drawable.i31);
              mTextView1.setText("这是一张逆位的隐士牌。现在点击牌面查看它的释义，你将根据它来回答这份爱的未来。");
              break;
            case 32:
              mImageButton3.setImageResource(R.drawable.i32);
              mTextView1.setText("这是一张逆位的命运之轮牌。现在点击牌面查看它的释义，你将根据它来回答这份爱的未来。");
              break;
            case 33:
              mImageButton3.setImageResource(R.drawable.i33);
              mTextView1.setText("这是一张逆位的正义牌。现在点击牌面查看它的释义，你将根据它来回答这份爱的未来。");
              break;
            case 34:
              mImageButton3.setImageResource(R.drawable.i34);
              mTextView1.setText("这是一张逆位的倒吊者牌。现在点击牌面查看它的释义，你将根据它来回答这份爱的未来。");
              break;
            case 35:
              mImageButton3.setImageResource(R.drawable.i35);
              mTextView1.setText("这是一张逆位的死神牌。现在点击牌面查看它的释义，你将根据它来回答这份爱的未来。");
              break;
            case 36:
              mImageButton3.setImageResource(R.drawable.i36);
              mTextView1.setText("这是一张逆位的节制牌。现在点击牌面查看它的释义，你将根据它来回答这份爱的未来。");
              break;
            case 37:
              mImageButton3.setImageResource(R.drawable.i37);
              mTextView1.setText("这是一张逆位的恶魔牌。现在点击牌面查看它的释义，你将根据它来回答这份爱的未来。");
              break;
            case 38:
              mImageButton3.setImageResource(R.drawable.i38);
              mTextView1.setText("这是一张逆位的塔牌。现在点击牌面查看它的释义，你将根据它来回答这份爱的未来。");
              break;
            case 39:
              mImageButton3.setImageResource(R.drawable.i39);
              mTextView1.setText("这是一张逆位的星星牌。现在点击牌面查看它的释义，你将根据它来回答这份爱的未来。");
              break;
            case 40:
              mImageButton3.setImageResource(R.drawable.i40);
              mTextView1.setText("这是一张逆位的月亮牌。现在点击牌面查看它的释义，你将根据它来回答这份爱的未来。");
              break;
            case 41:
              mImageButton3.setImageResource(R.drawable.i41);
              mTextView1.setText("这是一张逆位的太阳牌。现在点击牌面查看它的释义，你将根据它来回答这份爱的未来。");
              break;
            case 42:
              mImageButton3.setImageResource(R.drawable.i42);
              mTextView1.setText("这是一张逆位的审判牌。现在点击牌面查看它的释义，你将根据它来回答这份爱的未来。");
              break;
            case 43:
              mImageButton3.setImageResource(R.drawable.i43);
              mTextView1.setText("这是一张逆位的世界牌。现在点击牌面查看它的释义，你将根据它来回答这份爱的未来。");
              break;
            
            default:
              break;
          }
           i_3=1;
        }
         else {
           switch (i3)
           {
             case 0:
               new AlertDialog.Builder(cardarray2.this).setTitle("").setMessage(R.string.t0_0)
               .setPositiveButton("OK", 
                   new DialogInterface.OnClickListener()
                  {
                    
                    @Override
                    public void onClick(DialogInterface dialog, int which)
                    {
                      // TODO Auto-generated method stub                        
                    }
                  }).show();
               mTextView1.setText("亲爱的孩子，塔罗神指引你心灵的方向。我想现在你心中已经有对爱的答案了吧。");                
               break;
             case 1:
               new AlertDialog.Builder(cardarray2.this).setTitle("").setMessage(R.string.t1_0)
               .setPositiveButton("OK", 
                   new DialogInterface.OnClickListener()
                  {
                    
                    @Override
                    public void onClick(DialogInterface dialog, int which)
                    {
                      // TODO Auto-generated method stub                        
                    }
                  }).show();
               mTextView1.setText("亲爱的孩子，塔罗神指引你心灵的方向。我想现在你心中已经有对爱的答案了吧。");                
               break;
             case 2:
               new AlertDialog.Builder(cardarray2.this).setTitle("").setMessage(R.string.t2_0)
               .setPositiveButton("OK", 
                   new DialogInterface.OnClickListener()
                  {
                    
                    @Override
                    public void onClick(DialogInterface dialog, int which)
                    {
                      // TODO Auto-generated method stub                        
                    }
                  }).show();
               mTextView1.setText("亲爱的孩子，塔罗神指引你心灵的方向。我想现在你心中已经有对爱的答案了吧。");                
               break;
             case 3:
               new AlertDialog.Builder(cardarray2.this).setTitle("").setMessage(R.string.t3_0)
               .setPositiveButton("OK", 
                   new DialogInterface.OnClickListener()
                  {
                    
                    @Override
                    public void onClick(DialogInterface dialog, int which)
                    {
                      // TODO Auto-generated method stub                        
                    }
                  }).show();
               mTextView1.setText("亲爱的孩子，塔罗神指引你心灵的方向。我想现在你心中已经有对爱的答案了吧。。");                
               break;
             case 4:
               new AlertDialog.Builder(cardarray2.this).setTitle("").setMessage(R.string.t4_0)
               .setPositiveButton("OK", 
                   new DialogInterface.OnClickListener()
                  {
                    
                    @Override
                    public void onClick(DialogInterface dialog, int which)
                    {
                      // TODO Auto-generated method stub                        
                    }
                  }).show();
               mTextView1.setText("亲爱的孩子，塔罗神指引你心灵的方向。我想现在你心中已经有对爱的答案了吧。");                
               break;
             case 5:
               new AlertDialog.Builder(cardarray2.this).setTitle("").setMessage(R.string.t5_0)
               .setPositiveButton("OK", 
                   new DialogInterface.OnClickListener()
                  {
                    
                    @Override
                    public void onClick(DialogInterface dialog, int which)
                    {
                      // TODO Auto-generated method stub                        
                    }
                  }).show();
               mTextView1.setText("亲爱的孩子，塔罗神指引你心灵的方向。我想现在你心中已经有对爱的答案了吧。");                
               break;
             case 6:
               new AlertDialog.Builder(cardarray2.this).setTitle("").setMessage(R.string.t6_0)
               .setPositiveButton("OK", 
                   new DialogInterface.OnClickListener()
                  {
                    
                    @Override
                    public void onClick(DialogInterface dialog, int which)
                    {
                      // TODO Auto-generated method stub                        
                    }
                  }).show();
               mTextView1.setText("亲爱的孩子，塔罗神指引你心灵的方向。我想现在你心中已经有对爱的答案了吧。");                
               break;
             case 7:
               new AlertDialog.Builder(cardarray2.this).setTitle("").setMessage(R.string.t7_0)
               .setPositiveButton("OK", 
                   new DialogInterface.OnClickListener()
                  {
                    
                    @Override
                    public void onClick(DialogInterface dialog, int which)
                    {
                      // TODO Auto-generated method stub                        
                    }
                  }).show();
               mTextView1.setText("亲爱的孩子，塔罗神指引你心灵的方向。我想现在你心中已经有对爱的答案了吧。");                
               break;
             case 8:
               new AlertDialog.Builder(cardarray2.this).setTitle("").setMessage(R.string.t8_0)
               .setPositiveButton("OK", 
                   new DialogInterface.OnClickListener()
                  {
                    
                    @Override
                    public void onClick(DialogInterface dialog, int which)
                    {
                      // TODO Auto-generated method stub                        
                    }
                  }).show();
               mTextView1.setText("亲爱的孩子，塔罗神指引你心灵的方向。我想现在你心中已经有对爱的答案了吧。。");                
               break;
             case 9:
               new AlertDialog.Builder(cardarray2.this).setTitle("").setMessage(R.string.t9_0)
               .setPositiveButton("OK", 
                   new DialogInterface.OnClickListener()
                  {
                    
                    @Override
                    public void onClick(DialogInterface dialog, int which)
                    {
                      // TODO Auto-generated method stub                        
                    }
                  }).show();
               mTextView1.setText("亲爱的孩子，塔罗神指引你心灵的方向。我想现在你心中已经有对爱的答案了吧。");                
               break;
             case 10:
               new AlertDialog.Builder(cardarray2.this).setTitle("").setMessage(R.string.t10_0)
               .setPositiveButton("OK", 
                   new DialogInterface.OnClickListener()
                  {
                    
                    @Override
                    public void onClick(DialogInterface dialog, int which)
                    {
                      // TODO Auto-generated method stub                        
                    }
                  }).show();
               mTextView1.setText("亲爱的孩子，塔罗神指引你心灵的方向。我想现在你心中已经有对爱的答案了吧。");                
               break;
             case 11:
               new AlertDialog.Builder(cardarray2.this).setTitle("").setMessage(R.string.t11_0)
               .setPositiveButton("OK", 
                   new DialogInterface.OnClickListener()
                  {
                    
                    @Override
                    public void onClick(DialogInterface dialog, int which)
                    {
                      // TODO Auto-generated method stub                        
                    }
                  }).show();
               mTextView1.setText("亲爱的孩子，塔罗神指引你心灵的方向。我想现在你心中已经有对爱的答案了吧。");                
               break;
             case 12:
               new AlertDialog.Builder(cardarray2.this).setTitle("").setMessage(R.string.t12_0)
               .setPositiveButton("OK", 
                   new DialogInterface.OnClickListener()
                  {
                    
                    @Override
                    public void onClick(DialogInterface dialog, int which)
                    {
                      // TODO Auto-generated method stub                        
                    }
                  }).show();
               mTextView1.setText("亲爱的孩子，塔罗神指引你心灵的方向。我想现在你心中已经有对爱的答案了吧。");                
               break;
             case 13:
               new AlertDialog.Builder(cardarray2.this).setTitle("").setMessage(R.string.t13_0)
               .setPositiveButton("OK", 
                   new DialogInterface.OnClickListener()
                  {
                    
                    @Override
                    public void onClick(DialogInterface dialog, int which)
                    {
                      // TODO Auto-generated method stub                        
                    }
                  }).show();
               mTextView1.setText("亲爱的孩子，塔罗神指引你心灵的方向。我想现在你心中已经有对爱的答案了吧。");                
               break;
             case 14:
               new AlertDialog.Builder(cardarray2.this).setTitle("").setMessage(R.string.t14_0)
               .setPositiveButton("OK", 
                   new DialogInterface.OnClickListener()
                  {
                    
                    @Override
                    public void onClick(DialogInterface dialog, int which)
                    {
                      // TODO Auto-generated method stub                        
                    }
                  }).show();
               mTextView1.setText("亲爱的孩子，塔罗神指引你心灵的方向。我想现在你心中已经有对爱的答案了吧。");                
               break;
             case 15:
               new AlertDialog.Builder(cardarray2.this).setTitle("").setMessage(R.string.t15_0)
               .setPositiveButton("OK", 
                   new DialogInterface.OnClickListener()
                  {
                    
                    @Override
                    public void onClick(DialogInterface dialog, int which)
                    {
                      // TODO Auto-generated method stub                        
                    }
                  }).show();
               mTextView1.setText("亲爱的孩子，塔罗神指引你心灵的方向。我想现在你心中已经有对爱的答案了吧。");                
               break;
             case 16:
               new AlertDialog.Builder(cardarray2.this).setTitle("").setMessage(R.string.t16_0)
               .setPositiveButton("OK", 
                   new DialogInterface.OnClickListener()
                  {
                    
                    @Override
                    public void onClick(DialogInterface dialog, int which)
                    {
                      // TODO Auto-generated method stub                        
                    }
                  }).show();
               mTextView1.setText("亲爱的孩子，塔罗神指引你心灵的方向。我想现在你心中已经有对爱的答案了吧。");                
               break;
             case 17:
               new AlertDialog.Builder(cardarray2.this).setTitle("").setMessage(R.string.t17_0)
               .setPositiveButton("OK", 
                   new DialogInterface.OnClickListener()
                  {
                    
                    @Override
                    public void onClick(DialogInterface dialog, int which)
                    {
                      // TODO Auto-generated method stub                        
                    }
                  }).show();
               mTextView1.setText("亲爱的孩子，塔罗神指引你心灵的方向。我想现在你心中已经有对爱的答案了吧。");                
               break;
             case 18:
               new AlertDialog.Builder(cardarray2.this).setTitle("").setMessage(R.string.t18_0)
               .setPositiveButton("OK", 
                   new DialogInterface.OnClickListener()
                  {
                    
                    @Override
                    public void onClick(DialogInterface dialog, int which)
                    {
                      // TODO Auto-generated method stub                        
                    }
                  }).show();
               mTextView1.setText("亲爱的孩子，塔罗神指引你心灵的方向。我想现在你心中已经有对爱的答案了吧。");                
               break;
             case 19:
               new AlertDialog.Builder(cardarray2.this).setTitle("").setMessage(R.string.t19_0)
               .setPositiveButton("OK", 
                   new DialogInterface.OnClickListener()
                  {
                    
                    @Override
                    public void onClick(DialogInterface dialog, int which)
                    {
                      // TODO Auto-generated method stub                        
                    }
                  }).show();
               mTextView1.setText("亲爱的孩子，塔罗神指引你心灵的方向。我想现在你心中已经有对爱的答案了吧。");                
               break;
             case 20:
               new AlertDialog.Builder(cardarray2.this).setTitle("").setMessage(R.string.t20_0)
               .setPositiveButton("OK", 
                   new DialogInterface.OnClickListener()
                  {
                    
                    @Override
                    public void onClick(DialogInterface dialog, int which)
                    {
                      // TODO Auto-generated method stub                        
                    }
                  }).show();
               mTextView1.setText("亲爱的孩子，塔罗神指引你心灵的方向。我想现在你心中已经有对爱的答案了吧。");                
               break;
             case 21:
               new AlertDialog.Builder(cardarray2.this).setTitle("").setMessage(R.string.t21_0)
               .setPositiveButton("OK", 
                   new DialogInterface.OnClickListener()
                  {
                    
                    @Override
                    public void onClick(DialogInterface dialog, int which)
                    {
                      // TODO Auto-generated method stub                        
                    }
                  }).show();
               mTextView1.setText("亲爱的孩子，塔罗神指引你心灵的方向。我想现在你心中已经有对爱的答案了吧。");                
               break;
             case 22:
               new AlertDialog.Builder(cardarray2.this).setTitle("").setMessage(R.string.t0_1)
               .setPositiveButton("OK", 
                   new DialogInterface.OnClickListener()
                  {
                    
                    @Override
                    public void onClick(DialogInterface dialog, int which)
                    {
                      // TODO Auto-generated method stub                        
                    }
                  }).show();
               mTextView1.setText("亲爱的孩子，塔罗神指引你心灵的方向。我想现在你心中已经有对爱的答案了吧。");                
               break;
             case 23:
               new AlertDialog.Builder(cardarray2.this).setTitle("").setMessage(R.string.t1_1)
               .setPositiveButton("OK", 
                   new DialogInterface.OnClickListener()
                  {
                    
                    @Override
                    public void onClick(DialogInterface dialog, int which)
                    {
                      // TODO Auto-generated method stub                        
                    }
                  }).show();
               mTextView1.setText("亲爱的孩子，塔罗神指引你心灵的方向。我想现在你心中已经有对爱的答案了吧。");                
               break;
             case 24:
               new AlertDialog.Builder(cardarray2.this).setTitle("").setMessage(R.string.t2_1)
               .setPositiveButton("OK", 
                   new DialogInterface.OnClickListener()
                  {
                    
                    @Override
                    public void onClick(DialogInterface dialog, int which)
                    {
                      // TODO Auto-generated method stub                        
                    }
                  }).show();
               mTextView1.setText("亲爱的孩子，塔罗神指引你心灵的方向。我想现在你心中已经有对爱的答案了吧。");                
               break;
             case 25:
               new AlertDialog.Builder(cardarray2.this).setTitle("").setMessage(R.string.t3_1)
               .setPositiveButton("OK", 
                   new DialogInterface.OnClickListener()
                  {
                    
                    @Override
                    public void onClick(DialogInterface dialog, int which)
                    {
                      // TODO Auto-generated method stub                        
                    }
                  }).show();
               mTextView1.setText("亲爱的孩子，塔罗神指引你心灵的方向。我想现在你心中已经有对爱的答案了吧。。");                
               break;
             case 26:
               new AlertDialog.Builder(cardarray2.this).setTitle("").setMessage(R.string.t4_1)
               .setPositiveButton("OK", 
                   new DialogInterface.OnClickListener()
                  {
                    
                    @Override
                    public void onClick(DialogInterface dialog, int which)
                    {
                      // TODO Auto-generated method stub                        
                    }
                  }).show();
               mTextView1.setText("亲爱的孩子，塔罗神指引你心灵的方向。我想现在你心中已经有对爱的答案了吧。");                
               break;
             case 27:
               new AlertDialog.Builder(cardarray2.this).setTitle("").setMessage(R.string.t5_1)
               .setPositiveButton("OK", 
                   new DialogInterface.OnClickListener()
                  {
                    
                    @Override
                    public void onClick(DialogInterface dialog, int which)
                    {
                      // TODO Auto-generated method stub                        
                    }
                  }).show();
               mTextView1.setText("亲爱的孩子，塔罗神指引你心灵的方向。我想现在你心中已经有对爱的答案了吧。");                
               break;
             case 28:
               new AlertDialog.Builder(cardarray2.this).setTitle("").setMessage(R.string.t6_1)
               .setPositiveButton("OK", 
                   new DialogInterface.OnClickListener()
                  {
                    
                    @Override
                    public void onClick(DialogInterface dialog, int which)
                    {
                      // TODO Auto-generated method stub                        
                    }
                  }).show();
               mTextView1.setText("亲爱的孩子，塔罗神指引你心灵的方向。我想现在你心中已经有对爱的答案了吧。");                
               break;
             case 29:
               new AlertDialog.Builder(cardarray2.this).setTitle("").setMessage(R.string.t7_1)
               .setPositiveButton("OK", 
                   new DialogInterface.OnClickListener()
                  {
                    
                    @Override
                    public void onClick(DialogInterface dialog, int which)
                    {
                      // TODO Auto-generated method stub                        
                    }
                  }).show();
               mTextView1.setText("亲爱的孩子，塔罗神指引你心灵的方向。我想现在你心中已经有对爱的答案了吧。");                
               break;
             case 30:
               new AlertDialog.Builder(cardarray2.this).setTitle("").setMessage(R.string.t8_1)
               .setPositiveButton("OK", 
                   new DialogInterface.OnClickListener()
                  {
                    
                    @Override
                    public void onClick(DialogInterface dialog, int which)
                    {
                      // TODO Auto-generated method stub                        
                    }
                  }).show();
               mTextView1.setText("亲爱的孩子，塔罗神指引你心灵的方向。我想现在你心中已经有对爱的答案了吧。。");                
               break;
             case 31:
               new AlertDialog.Builder(cardarray2.this).setTitle("").setMessage(R.string.t9_1)
               .setPositiveButton("OK", 
                   new DialogInterface.OnClickListener()
                  {
                    
                    @Override
                    public void onClick(DialogInterface dialog, int which)
                    {
                      // TODO Auto-generated method stub                        
                    }
                  }).show();
               mTextView1.setText("亲爱的孩子，塔罗神指引你心灵的方向。我想现在你心中已经有对爱的答案了吧。");                
               break;
             case 32:
               new AlertDialog.Builder(cardarray2.this).setTitle("").setMessage(R.string.t10_1)
               .setPositiveButton("OK", 
                   new DialogInterface.OnClickListener()
                  {
                    
                    @Override
                    public void onClick(DialogInterface dialog, int which)
                    {
                      // TODO Auto-generated method stub                        
                    }
                  }).show();
               mTextView1.setText("亲爱的孩子，塔罗神指引你心灵的方向。我想现在你心中已经有对爱的答案了吧。");                
               break;
             case 33:
               new AlertDialog.Builder(cardarray2.this).setTitle("").setMessage(R.string.t11_1)
               .setPositiveButton("OK", 
                   new DialogInterface.OnClickListener()
                  {
                    
                    @Override
                    public void onClick(DialogInterface dialog, int which)
                    {
                      // TODO Auto-generated method stub                        
                    }
                  }).show();
               mTextView1.setText("亲爱的孩子，塔罗神指引你心灵的方向。我想现在你心中已经有对爱的答案了吧。");                
               break;
             case 34:
               new AlertDialog.Builder(cardarray2.this).setTitle("").setMessage(R.string.t12_1)
               .setPositiveButton("OK", 
                   new DialogInterface.OnClickListener()
                  {
                    
                    @Override
                    public void onClick(DialogInterface dialog, int which)
                    {
                      // TODO Auto-generated method stub                        
                    }
                  }).show();
               mTextView1.setText("亲爱的孩子，塔罗神指引你心灵的方向。我想现在你心中已经有对爱的答案了吧。");                
               break;
             case 35:
               new AlertDialog.Builder(cardarray2.this).setTitle("").setMessage(R.string.t13_1)
               .setPositiveButton("OK", 
                   new DialogInterface.OnClickListener()
                  {
                    
                    @Override
                    public void onClick(DialogInterface dialog, int which)
                    {
                      // TODO Auto-generated method stub                        
                    }
                  }).show();
               mTextView1.setText("亲爱的孩子，塔罗神指引你心灵的方向。我想现在你心中已经有对爱的答案了吧。");                
               break;
             case 36:
               new AlertDialog.Builder(cardarray2.this).setTitle("").setMessage(R.string.t14_1)
               .setPositiveButton("OK", 
                   new DialogInterface.OnClickListener()
                  {
                    
                    @Override
                    public void onClick(DialogInterface dialog, int which)
                    {
                      // TODO Auto-generated method stub                        
                    }
                  }).show();
               mTextView1.setText("亲爱的孩子，塔罗神指引你心灵的方向。我想现在你心中已经有对爱的答案了吧。");                
               break;
             case 37:
               new AlertDialog.Builder(cardarray2.this).setTitle("").setMessage(R.string.t15_1)
               .setPositiveButton("OK", 
                   new DialogInterface.OnClickListener()
                  {
                    
                    @Override
                    public void onClick(DialogInterface dialog, int which)
                    {
                      // TODO Auto-generated method stub                        
                    }
                  }).show();
               mTextView1.setText("亲爱的孩子，塔罗神指引你心灵的方向。我想现在你心中已经有对爱的答案了吧。");                
               break;
             case 38:
               new AlertDialog.Builder(cardarray2.this).setTitle("").setMessage(R.string.t16_1)
               .setPositiveButton("OK", 
                   new DialogInterface.OnClickListener()
                  {
                    
                    @Override
                    public void onClick(DialogInterface dialog, int which)
                    {
                      // TODO Auto-generated method stub                        
                    }
                  }).show();
               mTextView1.setText("亲爱的孩子，塔罗神指引你心灵的方向。我想现在你心中已经有对爱的答案了吧。");                
               break;
             case 39:
               new AlertDialog.Builder(cardarray2.this).setTitle("").setMessage(R.string.t17_1)
               .setPositiveButton("OK", 
                   new DialogInterface.OnClickListener()
                  {
                    
                    @Override
                    public void onClick(DialogInterface dialog, int which)
                    {
                      // TODO Auto-generated method stub                        
                    }
                  }).show();
               mTextView1.setText("亲爱的孩子，塔罗神指引你心灵的方向。我想现在你心中已经有对爱的答案了吧。");                
               break;
             case 40:
               new AlertDialog.Builder(cardarray2.this).setTitle("").setMessage(R.string.t18_1)
               .setPositiveButton("OK", 
                   new DialogInterface.OnClickListener()
                  {
                    
                    @Override
                    public void onClick(DialogInterface dialog, int which)
                    {
                      // TODO Auto-generated method stub                        
                    }
                  }).show();
               mTextView1.setText("亲爱的孩子，塔罗神指引你心灵的方向。我想现在你心中已经有对爱的答案了吧。");                
               break;
             case 41:
               new AlertDialog.Builder(cardarray2.this).setTitle("").setMessage(R.string.t19_1)
               .setPositiveButton("OK", 
                   new DialogInterface.OnClickListener()
                  {
                    
                    @Override
                    public void onClick(DialogInterface dialog, int which)
                    {
                      // TODO Auto-generated method stub                        
                    }
                  }).show();
               mTextView1.setText("亲爱的孩子，塔罗神指引你心灵的方向。我想现在你心中已经有对爱的答案了吧。");                
               break;
             case 42:
               new AlertDialog.Builder(cardarray2.this).setTitle("").setMessage(R.string.t20_1)
               .setPositiveButton("OK", 
                   new DialogInterface.OnClickListener()
                  {
                    
                    @Override
                    public void onClick(DialogInterface dialog, int which)
                    {
                      // TODO Auto-generated method stub                        
                    }
                  }).show();
               mTextView1.setText("亲爱的孩子，塔罗神指引你心灵的方向。我想现在你心中已经有对爱的答案了吧。");                
               break;
             case 43:
               new AlertDialog.Builder(cardarray2.this).setTitle("").setMessage(R.string.t21_1)
               .setPositiveButton("OK", 
                   new DialogInterface.OnClickListener()
                  {
                    
                    @Override
                    public void onClick(DialogInterface dialog, int which)
                    {
                      // TODO Auto-generated method stub                        
                    }
                  }).show();
               mTextView1.setText("亲爱的孩子，塔罗神指引你心灵的方向。我想现在你心中已经有对爱的答案了吧。");                
               break;

             default:
               break;
           }
           i_3=2;
         }
      }
    });
  }
}
