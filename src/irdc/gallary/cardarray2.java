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
  /*���������������(ͼƬ��ť,��ť,��TextView)*/ 
//  private ImageButton mImageButton1;
  private ImageView mImageButton1;
  private ImageView mImageButton2;
  private ImageView mImageButton3;

//  private TextView 
  int i_1=0;int i_2=0;int i_3=0;//i_1��¼����˳��
  Random r1=new Random();int i1=r1.nextInt(43);//i1��¼��������
  Random r2=new Random();int i2=r2.nextInt(43);
  Random r3=new Random();int i3=r3.nextInt(43);
  private TextView mTextView1;
  private TextView mTextView2;//�����һ����
  private TextView mTextView3;//����ڶ�����
  private TextView mTextView4;//�����������
  
  public boolean onTouchEvent(MotionEvent event) 
  {   
    /* event��Action?�� */
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
    
    //���¼����Ϸ��ذ�ť
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
    //����״̬����ʹimageviewȫ����ʾ
    this.getWindow().setFlags
    (
        WindowManager.LayoutParams.FLAG_FULLSCREEN,
        WindowManager.LayoutParams.FLAG_FULLSCREEN
    );
    //���ر�����
    requestWindowFeature(Window.FEATURE_NO_TITLE);
    setContentView(R.layout.main2_02); 
    
//    DisplayMetrics dm =new DisplayMetrics();
//    getWindowManager().getDefaultDisplay().getMetrics(dm);//.....�õ���Ļ�ķֱ���
    
    /*͸��findViewById������������*/ 
    mImageButton1 =(ImageView) findViewById(R.id.myImageButton1);
    mImageButton2=(ImageView)findViewById(R.id.myImageButton2);
    mImageButton3=(ImageView)findViewById(R.id.myImageButton3);
    mTextView1 = (TextView) findViewById(R.id.myTextView1);
    mTextView1.setText("������һ���ƣ����л����Ź�ȥ�������������������İ�������Ƿݰ��ľ���");
    mTextView2=(TextView)findViewById(R.id.text1);
    mTextView3=(TextView)findViewById(R.id.text2);
    mTextView4=(TextView)findViewById(R.id.text3);
    
    
    
    /*͸��onClickListener����ӦImageButton��onClick�¼�*/ 
    mImageButton1.setOnClickListener(new OnClickListener()
    { 
        public void onClick(View v) 
        {
        // TODO Auto-generated method stub 
        /*��ImageButton״̬ΪonClick�ı�ImageButton��ͼƬ * ���ı�textView������*/ 
           if (i_1==0)
          {
             mTextView2.setText("");
             switch (i1)
            {
              case 0:
                mImageButton1.setImageResource(R.drawable.i0);
                mTextView1.setText("����һ����λ�������ơ����ڵ������鿴�������壬�㽫���������ش��������İ������");
                break;
              case 1:
                mImageButton1.setImageResource(R.drawable.i1);
                mTextView1.setText("����һ����λ��ħ��ʦ�ơ����ڵ������鿴�������壬�㽫���������ش��������İ������");
                break;
              case 2:
                mImageButton1.setImageResource(R.drawable.i2);
                mTextView1.setText("����һ����λ��Ů��˾�ơ����ڵ������鿴�������壬�㽫���������ش��������İ������");
                break;
              case 3:
                mImageButton1.setImageResource(R.drawable.i3);
                mTextView1.setText("����һ����λ��Ů���ơ����ڵ������鿴�������壬�㽫���������ش��������İ������");
                break;
              case 4:
                mImageButton1.setImageResource(R.drawable.i4);
                mTextView1.setText("����һ����λ�Ļʵ��ơ����ڵ������鿴�������壬�㽫���������ش��������İ������");
                break;
              case 5:
                mImageButton1.setImageResource(R.drawable.i5);
                mTextView1.setText("����һ����λ�Ľ����ơ����ڵ������鿴�������壬�㽫���������ش��������İ������");
                break;
              case 6:
                mImageButton1.setImageResource(R.drawable.i6);
                mTextView1.setText("����һ����λ�������ơ����ڵ������鿴�������壬�㽫���������ش��������İ������");
                break;
              case 7:
                mImageButton1.setImageResource(R.drawable.i7);
                mTextView1.setText("����һ����λ��ս���ơ����ڵ������鿴�������壬�㽫���������ش��������İ������");
                break;
              case 8:
                mImageButton1.setImageResource(R.drawable.i8);
                mTextView1.setText("����һ����λ�������ơ����ڵ������鿴�������壬�㽫���������ش��������İ������");
                break;
              case 9:
                mImageButton1.setImageResource(R.drawable.i9);
                mTextView1.setText("����һ����λ����ʿ�ơ����ڵ������鿴�������壬�㽫���������ش��������İ������");
                break;
              case 10:
                mImageButton1.setImageResource(R.drawable.i10);
                mTextView1.setText("����һ����λ������֮���ơ����ڵ������鿴�������壬�㽫���������ش��������İ������");
                break;
              case 11:
                mImageButton1.setImageResource(R.drawable.i11);
                mTextView1.setText("����һ����λ�������ơ����ڵ������鿴�������壬�㽫���������ش��������İ������");
                break;
              case 12:
                mImageButton1.setImageResource(R.drawable.i12);
                mTextView1.setText("����һ����λ�ĵ������ơ����ڵ������鿴�������壬�㽫���������ش��������İ������");
                break;
              case 13:
                mImageButton1.setImageResource(R.drawable.i13);
                mTextView1.setText("����һ����λ�������ơ����ڵ������鿴�������壬�㽫���������ش��������İ������");
                break;
              case 14:
                mImageButton1.setImageResource(R.drawable.i14);
                mTextView1.setText("����һ����λ�Ľ����ơ����ڵ������鿴�������壬�㽫���������ش��������İ������");
                break;
              case 15:
                mImageButton1.setImageResource(R.drawable.i15);
                mTextView1.setText("����һ����λ�Ķ�ħ�ơ����ڵ������鿴�������壬�㽫���������ش��������İ������");
                break;
              case 16:
                mImageButton1.setImageResource(R.drawable.i16);
                mTextView1.setText("����һ����λ�����ơ����ڵ������鿴�������壬�㽫���������ش��������İ������");
                break;
              case 17:
                mImageButton1.setImageResource(R.drawable.i17);
                mTextView1.setText("����һ����λ�������ơ����ڵ������鿴�������壬�㽫���������ش��������İ������");
                break;
              case 18:
                mImageButton1.setImageResource(R.drawable.i18);
                mTextView1.setText("����һ����λ�������ơ����ڵ������鿴�������壬�㽫���������ش��������İ������");
                break;
              case 19:
                mImageButton1.setImageResource(R.drawable.i19);
                mTextView1.setText("����һ����λ��̫���ơ����ڵ������鿴�������壬�㽫���������ش��������İ������");
                break;
              case 20:
                mImageButton1.setImageResource(R.drawable.i20);
                mTextView1.setText("����һ����λ�������ơ����ڵ������鿴�������壬�㽫���������ش��������İ������");
                break;
              case 21:
                mImageButton1.setImageResource(R.drawable.i21);
                mTextView1.setText("����һ����λ�������ơ����ڵ������鿴�������壬�㽫���������ش��������İ������");
                break;
              case 22:
                mImageButton1.setImageResource(R.drawable.i22);
                mTextView1.setText("����һ����λ�������ơ����ڵ������鿴�������壬�㽫���������ش��������İ������");
                break;
              case 23:
                mImageButton1.setImageResource(R.drawable.i23);
                mTextView1.setText("����һ����λ��ħ��ʦ�ơ����ڵ������鿴�������壬�㽫���������ش��������İ������");
                break;
              case 24:
                mImageButton1.setImageResource(R.drawable.i24);
                mTextView1.setText("����һ����λ��Ů��˾�ơ����ڵ������鿴�������壬�㽫���������ش��������İ������");
                break;
              case 25:
                mImageButton1.setImageResource(R.drawable.i25);
                mTextView1.setText("����һ����λ��Ů���ơ����ڵ������鿴�������壬�㽫���������ش��������İ������");
                break;
              case 26:
                mImageButton1.setImageResource(R.drawable.i26);
                mTextView1.setText("����һ����λ�Ļʵ��ơ����ڵ������鿴�������壬�㽫���������ش��������İ������");
                break;
              case 27:
                mImageButton1.setImageResource(R.drawable.i27);
                mTextView1.setText("����һ����λ�Ľ����ơ����ڵ������鿴�������壬�㽫���������ش��������İ������");
                break;
              case 28:
                mImageButton1.setImageResource(R.drawable.i28);
                mTextView1.setText("����һ����λ�������ơ����ڵ������鿴�������壬�㽫���������ش��������İ������");
                break;
              case 29:
                mImageButton1.setImageResource(R.drawable.i29);
                mTextView1.setText("����һ����λ��ս���ơ����ڵ������鿴�������壬�㽫���������ش��������İ������");
                break;
              case 30:
                mImageButton1.setImageResource(R.drawable.i30);
                mTextView1.setText("����һ����λ�������ơ����ڵ������鿴�������壬�㽫���������ش��������İ������");
                break;
              case 31:
                mImageButton1.setImageResource(R.drawable.i31);
                mTextView1.setText("����һ����λ����ʿ�ơ����ڵ������鿴�������壬�㽫���������ش��������İ������");
                break;
              case 32:
                mImageButton1.setImageResource(R.drawable.i32);
                mTextView1.setText("����һ����λ������֮���ơ����ڵ������鿴�������壬�㽫���������ش��������İ������");
                break;
              case 33:
                mImageButton1.setImageResource(R.drawable.i33);
                mTextView1.setText("����һ����λ�������ơ����ڵ������鿴�������壬�㽫���������ش��������İ������");
                break;
              case 34:
                mImageButton1.setImageResource(R.drawable.i34);
                mTextView1.setText("����һ����λ�ĵ������ơ����ڵ������鿴�������壬�㽫���������ش��������İ������");
                break;
              case 35:
                mImageButton1.setImageResource(R.drawable.i35);
                mTextView1.setText("����һ����λ�������ơ����ڵ������鿴�������壬�㽫���������ش��������İ������");
                break;
              case 36:
                mImageButton1.setImageResource(R.drawable.i36);
                mTextView1.setText("����һ����λ�Ľ����ơ����ڵ������鿴�������壬�㽫���������ش��������İ������");
                break;
              case 37:
                mImageButton1.setImageResource(R.drawable.i37);
                mTextView1.setText("����һ����λ�Ķ�ħ�ơ����ڵ������鿴�������壬�㽫���������ش��������İ������");
                break;
              case 38:
                mImageButton1.setImageResource(R.drawable.i38);
                mTextView1.setText("����һ����λ�����ơ����ڵ������鿴�������壬�㽫���������ش��������İ������");
                break;
              case 39:
                mImageButton1.setImageResource(R.drawable.i39);
                mTextView1.setText("����һ����λ�������ơ����ڵ������鿴�������壬�㽫���������ش��������İ������");
                break;
              case 40:
                mImageButton1.setImageResource(R.drawable.i40);
                mTextView1.setText("����һ����λ�������ơ����ڵ������鿴�������壬�㽫���������ش��������İ������");
                break;
              case 41:
                mImageButton1.setImageResource(R.drawable.i41);
                mTextView1.setText("����һ����λ��̫���ơ����ڵ������鿴�������壬�㽫���������ش��������İ������");
                break;
              case 42:
                mImageButton1.setImageResource(R.drawable.i42);
                mTextView1.setText("����һ����λ�������ơ����ڵ������鿴�������壬�㽫���������ش��������İ������");
                break;
              case 43:
                mImageButton1.setImageResource(R.drawable.i43);
                mTextView1.setText("����һ����λ�������ơ����ڵ������鿴�������壬�㽫���������ش��������İ������");
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
                 mTextView1.setText("Ȼ�󣬷����ڶ����ơ������������ڡ��������������ݰ��л����ʲô��");                
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
                 mTextView1.setText("Ȼ�󣬷����ڶ����ơ������������ڡ��������������ݰ��л����ʲô��");                
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
                 mTextView1.setText("Ȼ�󣬷����ڶ����ơ������������ڡ��������������ݰ��л����ʲô��");                
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
                 mTextView1.setText("Ȼ�󣬷����ڶ����ơ������������ڡ��������������ݰ��л����ʲô��");                
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
                 mTextView1.setText("Ȼ�󣬷����ڶ����ơ������������ڡ��������������ݰ��л����ʲô��");                
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
                 mTextView1.setText("Ȼ�󣬷����ڶ����ơ������������ڡ��������������ݰ��л����ʲô��");                
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
                 mTextView1.setText("Ȼ�󣬷����ڶ����ơ������������ڡ��������������ݰ��л����ʲô��");                
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
                 mTextView1.setText("Ȼ�󣬷����ڶ����ơ������������ڡ��������������ݰ��л����ʲô��");                
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
                 mTextView1.setText("Ȼ�󣬷����ڶ����ơ������������ڡ��������������ݰ��л����ʲô��");                
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
                 mTextView1.setText("Ȼ�󣬷����ڶ����ơ������������ڡ��������������ݰ��л����ʲô��");                
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
                 mTextView1.setText("Ȼ�󣬷����ڶ����ơ������������ڡ��������������ݰ��л����ʲô��");                
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
                 mTextView1.setText("Ȼ�󣬷����ڶ����ơ������������ڡ��������������ݰ��л����ʲô��");                
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
                 mTextView1.setText("Ȼ�󣬷����ڶ����ơ������������ڡ��������������ݰ��л����ʲô��");                
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
                 mTextView1.setText("Ȼ�󣬷����ڶ����ơ������������ڡ��������������ݰ��л����ʲô��");                
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
                 mTextView1.setText("Ȼ�󣬷����ڶ����ơ������������ڡ��������������ݰ��л����ʲô��");                
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
                 mTextView1.setText("Ȼ�󣬷����ڶ����ơ������������ڡ��������������ݰ��л����ʲô��");                
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
                 mTextView1.setText("Ȼ�󣬷����ڶ����ơ������������ڡ��������������ݰ��л����ʲô��");                
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
                 mTextView1.setText("Ȼ�󣬷����ڶ����ơ������������ڡ��������������ݰ��л����ʲô��");                
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
                 mTextView1.setText("Ȼ�󣬷����ڶ����ơ������������ڡ��������������ݰ��л����ʲô��");                
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
                 mTextView1.setText("Ȼ�󣬷����ڶ����ơ������������ڡ��������������ݰ��л����ʲô��");                
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
                 mTextView1.setText("Ȼ�󣬷����ڶ����ơ������������ڡ��������������ݰ��л����ʲô��");                
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
                 mTextView1.setText("Ȼ�󣬷����ڶ����ơ������������ڡ��������������ݰ��л����ʲô��");                
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
                 mTextView1.setText("Ȼ�󣬷����ڶ����ơ������������ڡ��������������ݰ��л����ʲô��");                
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
                 mTextView1.setText("Ȼ�󣬷����ڶ����ơ������������ڡ��������������ݰ��л����ʲô��");                
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
                 mTextView1.setText("Ȼ�󣬷����ڶ����ơ������������ڡ��������������ݰ��л����ʲô��");                
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
                 mTextView1.setText("Ȼ�󣬷����ڶ����ơ������������ڡ��������������ݰ��л����ʲô��");                
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
                 mTextView1.setText("Ȼ�󣬷����ڶ����ơ������������ڡ��������������ݰ��л����ʲô��");                
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
                 mTextView1.setText("Ȼ�󣬷����ڶ����ơ������������ڡ��������������ݰ��л����ʲô��");                
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
                 mTextView1.setText("Ȼ�󣬷����ڶ����ơ������������ڡ��������������ݰ��л����ʲô��");                
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
                 mTextView1.setText("Ȼ�󣬷����ڶ����ơ������������ڡ��������������ݰ��л����ʲô��");                
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
                 mTextView1.setText("Ȼ�󣬷����ڶ����ơ������������ڡ��������������ݰ��л����ʲô��");                
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
                 mTextView1.setText("Ȼ�󣬷����ڶ����ơ������������ڡ��������������ݰ��л����ʲô��");                
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
                 mTextView1.setText("Ȼ�󣬷����ڶ����ơ������������ڡ��������������ݰ��л����ʲô��");                
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
                 mTextView1.setText("Ȼ�󣬷����ڶ����ơ������������ڡ��������������ݰ��л����ʲô��");                
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
                 mTextView1.setText("Ȼ�󣬷����ڶ����ơ������������ڡ��������������ݰ��л����ʲô��");                
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
                 mTextView1.setText("Ȼ�󣬷����ڶ����ơ������������ڡ��������������ݰ��л����ʲô��");                
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
                 mTextView1.setText("Ȼ�󣬷����ڶ����ơ������������ڡ��������������ݰ��л����ʲô��");                
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
                 mTextView1.setText("Ȼ�󣬷����ڶ����ơ������������ڡ��������������ݰ��л����ʲô��");                
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
                 mTextView1.setText("Ȼ�󣬷����ڶ����ơ������������ڡ��������������ݰ��л����ʲô��");                
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
                 mTextView1.setText("Ȼ�󣬷����ڶ����ơ������������ڡ��������������ݰ��л����ʲô��");                
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
                 mTextView1.setText("Ȼ�󣬷����ڶ����ơ������������ڡ��������������ݰ��л����ʲô��");                
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
                 mTextView1.setText("Ȼ�󣬷����ڶ����ơ������������ڡ��������������ݰ��л����ʲô��");                
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
                 mTextView1.setText("Ȼ�󣬷����ڶ����ơ������������ڡ��������������ݰ��л����ʲô��");                
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
                 mTextView1.setText("Ȼ�󣬷����ڶ����ơ������������ڡ��������������ݰ��л����ʲô��");                
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
          new AlertDialog.Builder(cardarray2.this).setTitle("").setMessage("��ʾ�����ȷ�����һ���ơ�")
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
              mTextView1.setText("����һ����λ�������ơ����ڵ������鿴�������壬�㽫���������ش����������ݰ��л����ʲô��");
              break;
            case 1:
              mImageButton2.setImageResource(R.drawable.i1);
              mTextView1.setText("����һ����λ��ħ��ʦ�ơ����ڵ������鿴�������壬�㽫���������ش����������ݰ��л����ʲô��");
              break;
            case 2:
              mImageButton2.setImageResource(R.drawable.i2);
              mTextView1.setText("����һ����λ��Ů��˾�ơ����ڵ������鿴�������壬�㽫���������ش����������ݰ��л����ʲô��");
              break;
            case 3:
              mImageButton2.setImageResource(R.drawable.i3);
              mTextView1.setText("����һ����λ��Ů���ơ����ڵ������鿴�������壬�㽫���������ش����������ݰ��л����ʲô��");
              break;
            case 4:
              mImageButton2.setImageResource(R.drawable.i4);
              mTextView1.setText("����һ����λ�Ļʵ��ơ����ڵ������鿴�������壬�㽫���������ش����������ݰ��л����ʲô��");
              break;
            case 5:
              mImageButton2.setImageResource(R.drawable.i5);
              mTextView1.setText("����һ����λ�Ľ����ơ����ڵ������鿴�������壬�㽫���������ش����������ݰ��л����ʲô��");
              break;
            case 6:
              mImageButton2.setImageResource(R.drawable.i6);
              mTextView1.setText("����һ����λ�������ơ����ڵ������鿴�������壬�㽫���������ش����������ݰ��л����ʲô��");
              break;
            case 7:
              mImageButton2.setImageResource(R.drawable.i7);
              mTextView1.setText("����һ����λ��ս���ơ����ڵ������鿴�������壬�㽫���������ش����������ݰ��л����ʲô��");
              break;
            case 8:
              mImageButton2.setImageResource(R.drawable.i8);
              mTextView1.setText("����һ����λ�������ơ����ڵ������鿴�������壬�㽫���������ش����������ݰ��л����ʲô��");
              break;
            case 9:
              mImageButton2.setImageResource(R.drawable.i9);
              mTextView1.setText("����һ����λ����ʿ�ơ����ڵ������鿴�������壬�㽫���������ش����������ݰ��л����ʲô��");
              break;
            case 10:
              mImageButton2.setImageResource(R.drawable.i10);
              mTextView1.setText("����һ����λ������֮���ơ����ڵ������鿴�������壬�㽫���������ش����������ݰ��л����ʲô��");
              break;
            case 11:
              mImageButton2.setImageResource(R.drawable.i11);
              mTextView1.setText("����һ����λ�������ơ����ڵ������鿴�������壬�㽫���������ش����������ݰ��л����ʲô��");
              break;
            case 12:
              mImageButton2.setImageResource(R.drawable.i12);
              mTextView1.setText("����һ����λ�ĵ������ơ����ڵ������鿴�������壬�㽫���������ش����������ݰ��л����ʲô��");
              break;
            case 13:
              mImageButton2.setImageResource(R.drawable.i13);
              mTextView1.setText("����һ����λ�������ơ����ڵ������鿴�������壬�㽫���������ش����������ݰ��л����ʲô��");
              break;
            case 14:
              mImageButton2.setImageResource(R.drawable.i14);
              mTextView1.setText("����һ����λ�Ľ����ơ����ڵ������鿴�������壬�㽫���������ش����������ݰ��л����ʲô��");
              break;
            case 15:
              mImageButton2.setImageResource(R.drawable.i15);
              mTextView1.setText("����һ����λ�Ķ�ħ�ơ����ڵ������鿴�������壬�㽫���������ش����������ݰ��л����ʲô��");
              break;
            case 16:
              mImageButton2.setImageResource(R.drawable.i16);
              mTextView1.setText("����һ����λ�����ơ����ڵ������鿴�������壬�㽫���������ش����������ݰ��л����ʲô��");
              break;
            case 17:
              mImageButton2.setImageResource(R.drawable.i17);
              mTextView1.setText("����һ����λ�������ơ����ڵ������鿴�������壬�㽫���������ش����������ݰ��л����ʲô��");
              break;
            case 18:
              mImageButton2.setImageResource(R.drawable.i18);
              mTextView1.setText("����һ����λ�������ơ����ڵ������鿴�������壬�㽫���������ش����������ݰ��л����ʲô��");
              break;
            case 19:
              mImageButton2.setImageResource(R.drawable.i19);
              mTextView1.setText("����һ����λ��̫���ơ����ڵ������鿴�������壬�㽫���������ش����������ݰ��л����ʲô��");
              break;
            case 20:
              mImageButton2.setImageResource(R.drawable.i20);
              mTextView1.setText("����һ����λ�������ơ����ڵ������鿴�������壬�㽫���������ش����������ݰ��л����ʲô��");
              break;
            case 21:
              mImageButton2.setImageResource(R.drawable.i21);
              mTextView1.setText("����һ����λ�������ơ����ڵ������鿴�������壬�㽫���������ش����������ݰ��л����ʲô��");
              break;
            case 22:
              mImageButton2.setImageResource(R.drawable.i22);
              mTextView1.setText("����һ����λ�������ơ����ڵ������鿴�������壬�㽫���������ش����������ݰ��л����ʲô��");
              break;
            case 23:
              mImageButton2.setImageResource(R.drawable.i23);
              mTextView1.setText("����һ����λ��ħ��ʦ�ơ����ڵ������鿴�������壬�㽫���������ش����������ݰ��л����ʲô��");
              break;
            case 24:
              mImageButton2.setImageResource(R.drawable.i24);
              mTextView1.setText("����һ����λ��Ů��˾�ơ����ڵ������鿴�������壬�㽫���������ش����������ݰ��л����ʲô��");
              break;
            case 25:
              mImageButton2.setImageResource(R.drawable.i25);
              mTextView1.setText("����һ����λ��Ů���ơ����ڵ������鿴�������壬�㽫���������ش����������ݰ��л����ʲô��");
              break;
            case 26:
              mImageButton2.setImageResource(R.drawable.i26);
              mTextView1.setText("����һ����λ�Ļʵ��ơ����ڵ������鿴�������壬�㽫���������ش����������ݰ��л����ʲô��");
              break;
            case 27:
              mImageButton2.setImageResource(R.drawable.i27);
              mTextView1.setText("����һ����λ�Ľ����ơ����ڵ������鿴�������壬�㽫���������ش����������ݰ��л����ʲô��");
              break;
            case 28:
              mImageButton2.setImageResource(R.drawable.i28);
              mTextView1.setText("����һ����λ�������ơ����ڵ������鿴�������壬�㽫���������ش����������ݰ��л����ʲô��");
              break;
            case 29:
              mImageButton2.setImageResource(R.drawable.i29);
              mTextView1.setText("����һ����λ��ս���ơ����ڵ������鿴�������壬�㽫���������ش����������ݰ��л����ʲô��");
              break;
            case 30:
              mImageButton2.setImageResource(R.drawable.i30);
              mTextView1.setText("����һ����λ�������ơ����ڵ������鿴�������壬�㽫���������ش����������ݰ��л����ʲô��");
              break;
            case 31:
              mImageButton2.setImageResource(R.drawable.i31);
              mTextView1.setText("����һ����λ����ʿ�ơ����ڵ������鿴�������壬�㽫���������ش����������ݰ��л����ʲô��");
              break;
            case 32:
              mImageButton2.setImageResource(R.drawable.i32);
              mTextView1.setText("����һ����λ������֮���ơ����ڵ������鿴�������壬�㽫���������ش����������ݰ��л����ʲô��");
              break;
            case 33:
              mImageButton2.setImageResource(R.drawable.i33);
              mTextView1.setText("����һ����λ�������ơ����ڵ������鿴�������壬�㽫���������ش����������ݰ��л����ʲô��");
              break;
            case 34:
              mImageButton2.setImageResource(R.drawable.i34);
              mTextView1.setText("����һ����λ�ĵ������ơ����ڵ������鿴�������壬�㽫���������ش����������ݰ��л����ʲô��");
              break;
            case 35:
              mImageButton2.setImageResource(R.drawable.i35);
              mTextView1.setText("����һ����λ�������ơ����ڵ������鿴�������壬�㽫���������ش����������ݰ��л����ʲô��");
              break;
            case 36:
              mImageButton2.setImageResource(R.drawable.i36);
              mTextView1.setText("����һ����λ�Ľ����ơ����ڵ������鿴�������壬�㽫���������ش����������ݰ��л����ʲô��");
              break;
            case 37:
              mImageButton2.setImageResource(R.drawable.i37);
              mTextView1.setText("����һ����λ�Ķ�ħ�ơ����ڵ������鿴�������壬�㽫���������ش����������ݰ��л����ʲô��");
              break;
            case 38:
              mImageButton2.setImageResource(R.drawable.i38);
              mTextView1.setText("����һ����λ�����ơ����ڵ������鿴�������壬�㽫���������ش����������ݰ��л����ʲô��");
              break;
            case 39:
              mImageButton2.setImageResource(R.drawable.i39);
              mTextView1.setText("����һ����λ�������ơ����ڵ������鿴�������壬�㽫���������ش����������ݰ��л����ʲô��");
              break;
            case 40:
              mImageButton2.setImageResource(R.drawable.i40);
              mTextView1.setText("����һ����λ�������ơ����ڵ������鿴�������壬�㽫���������ش����������ݰ��л����ʲô��");
              break;
            case 41:
              mImageButton2.setImageResource(R.drawable.i41);
              mTextView1.setText("����һ����λ��̫���ơ����ڵ������鿴�������壬�㽫���������ش����������ݰ��л����ʲô��");
              break;
            case 42:
              mImageButton2.setImageResource(R.drawable.i42);
              mTextView1.setText("����һ����λ�������ơ����ڵ������鿴�������壬�㽫���������ش����������ݰ��л����ʲô��");
              break;
            case 43:
              mImageButton2.setImageResource(R.drawable.i43);
              mTextView1.setText("����һ����λ�������ơ����ڵ������鿴�������壬�㽫���������ش����������ݰ��л����ʲô��");
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
               mTextView1.setText("Ȼ�󣬷����������ơ��������Ž������������������ݰ���δ����");                
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
               mTextView1.setText("Ȼ�󣬷����������ơ��������Ž������������������ݰ���δ����");                
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
               mTextView1.setText("Ȼ�󣬷����������ơ��������Ž������������������ݰ���δ����");                
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
               mTextView1.setText("Ȼ�󣬷����������ơ��������Ž������������������ݰ���δ����");                
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
               mTextView1.setText("Ȼ�󣬷����������ơ��������Ž������������������ݰ���δ����");                
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
               mTextView1.setText("Ȼ�󣬷����������ơ��������Ž������������������ݰ���δ����");                
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
               mTextView1.setText("Ȼ�󣬷����������ơ��������Ž������������������ݰ���δ����");                
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
               mTextView1.setText("Ȼ�󣬷����������ơ��������Ž������������������ݰ���δ����");                
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
               mTextView1.setText("Ȼ�󣬷����������ơ��������Ž������������������ݰ���δ����");                
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
               mTextView1.setText("Ȼ�󣬷����������ơ��������Ž������������������ݰ���δ����");                
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
               mTextView1.setText("Ȼ�󣬷����������ơ��������Ž������������������ݰ���δ����");                
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
               mTextView1.setText("Ȼ�󣬷����������ơ��������Ž������������������ݰ���δ����");                
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
               mTextView1.setText("Ȼ�󣬷����������ơ��������Ž������������������ݰ���δ����");                
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
               mTextView1.setText("Ȼ�󣬷����������ơ��������Ž������������������ݰ���δ����");                
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
               mTextView1.setText("Ȼ�󣬷����������ơ��������Ž������������������ݰ���δ����");                
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
               mTextView1.setText("Ȼ�󣬷����������ơ��������Ž������������������ݰ���δ����");                
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
               mTextView1.setText("Ȼ�󣬷����������ơ��������Ž������������������ݰ���δ����");                
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
               mTextView1.setText("Ȼ�󣬷����������ơ��������Ž������������������ݰ���δ����");                
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
               mTextView1.setText("Ȼ�󣬷����������ơ��������Ž������������������ݰ���δ����");                
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
               mTextView1.setText("Ȼ�󣬷����������ơ��������Ž������������������ݰ���δ����");                
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
               mTextView1.setText("Ȼ�󣬷����������ơ��������Ž������������������ݰ���δ����");                
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
               mTextView1.setText("Ȼ�󣬷����������ơ��������Ž������������������ݰ���δ����");                
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
               mTextView1.setText("Ȼ�󣬷����������ơ��������Ž������������������ݰ���δ����");                
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
               mTextView1.setText("Ȼ�󣬷����������ơ��������Ž������������������ݰ���δ����");                
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
               mTextView1.setText("Ȼ�󣬷����������ơ��������Ž������������������ݰ���δ����");                
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
               mTextView1.setText("Ȼ�󣬷����������ơ��������Ž������������������ݰ���δ����");                
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
               mTextView1.setText("Ȼ�󣬷����������ơ��������Ž������������������ݰ���δ����");                
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
               mTextView1.setText("Ȼ�󣬷����������ơ��������Ž������������������ݰ���δ����");                
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
               mTextView1.setText("Ȼ�󣬷����������ơ��������Ž������������������ݰ���δ����");                
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
               mTextView1.setText("Ȼ�󣬷����������ơ��������Ž������������������ݰ���δ����");                
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
               mTextView1.setText("Ȼ�󣬷����������ơ��������Ž������������������ݰ���δ����");                
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
               mTextView1.setText("Ȼ�󣬷����������ơ��������Ž������������������ݰ���δ����");                
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
               mTextView1.setText("Ȼ�󣬷����������ơ��������Ž������������������ݰ���δ����");                
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
               mTextView1.setText("Ȼ�󣬷����������ơ��������Ž������������������ݰ���δ����");                
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
               mTextView1.setText("Ȼ�󣬷����������ơ��������Ž������������������ݰ���δ����");                
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
               mTextView1.setText("Ȼ�󣬷����������ơ��������Ž������������������ݰ���δ����");                
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
               mTextView1.setText("Ȼ�󣬷����������ơ��������Ž������������������ݰ���δ����");                
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
               mTextView1.setText("Ȼ�󣬷����������ơ��������Ž������������������ݰ���δ����");                
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
               mTextView1.setText("Ȼ�󣬷����������ơ��������Ž������������������ݰ���δ����");                
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
               mTextView1.setText("Ȼ�󣬷����������ơ��������Ž������������������ݰ���δ����");                
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
               mTextView1.setText("Ȼ�󣬷����������ơ��������Ž������������������ݰ���δ����");                
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
               mTextView1.setText("Ȼ�󣬷����������ơ��������Ž������������������ݰ���δ����");                
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
               mTextView1.setText("Ȼ�󣬷����������ơ��������Ž������������������ݰ���δ����");                
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
               mTextView1.setText("Ȼ�󣬷����������ơ��������Ž������������������ݰ���δ����");                
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
          new AlertDialog.Builder(cardarray2.this).setTitle("").setMessage("��ʾ�����ȷ����ڶ����ơ�")
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
          new AlertDialog.Builder(cardarray2.this).setTitle("").setMessage("��ʾ�����ȷ����ڶ����ơ�")
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
              mTextView1.setText("����һ����λ�������ơ����ڵ������鿴�������壬�㽫���������ش���ݰ���δ����");
              break;
            case 1:
              mImageButton3.setImageResource(R.drawable.i1);
              mTextView1.setText("����һ����λ��ħ��ʦ�ơ����ڵ������鿴�������壬�㽫���������ش���ݰ���δ����");
              break;
            case 2:
              mImageButton3.setImageResource(R.drawable.i2);
              mTextView1.setText("����һ����λ��Ů��˾�ơ����ڵ������鿴�������壬�㽫���������ش���ݰ���δ����");
              break;
            case 3:
              mImageButton3.setImageResource(R.drawable.i3);
              mTextView1.setText("����һ����λ��Ů���ơ����ڵ������鿴�������壬�㽫���������ش���ݰ���δ����");
              break;
            case 4:
              mImageButton3.setImageResource(R.drawable.i4);
              mTextView1.setText("����һ����λ�Ļʵ��ơ����ڵ������鿴�������壬�㽫���������ش���ݰ���δ����");
              break;
            case 5:
              mImageButton3.setImageResource(R.drawable.i5);
              mTextView1.setText("����һ����λ�Ľ����ơ����ڵ������鿴�������壬�㽫���������ش���ݰ���δ����");
              break;
            case 6:
              mImageButton3.setImageResource(R.drawable.i6);
              mTextView1.setText("����һ����λ�������ơ����ڵ������鿴�������壬�㽫���������ش���ݰ���δ����");
              break;
            case 7:
              mImageButton3.setImageResource(R.drawable.i7);
              mTextView1.setText("����һ����λ��ս���ơ����ڵ������鿴�������壬�㽫���������ش���ݰ���δ����");
              break;
            case 8:
              mImageButton3.setImageResource(R.drawable.i8);
              mTextView1.setText("����һ����λ�������ơ����ڵ������鿴�������壬�㽫���������ش���ݰ���δ����");
              break;
            case 9:
              mImageButton3.setImageResource(R.drawable.i9);
              mTextView1.setText("����һ����λ����ʿ�ơ����ڵ������鿴�������壬�㽫���������ش���ݰ���δ����");
              break;
            case 10:
              mImageButton3.setImageResource(R.drawable.i10);
              mTextView1.setText("����һ����λ������֮���ơ����ڵ������鿴�������壬�㽫���������ش���ݰ���δ����");
              break;
            case 11:
              mImageButton3.setImageResource(R.drawable.i11);
              mTextView1.setText("����һ����λ�������ơ����ڵ������鿴�������壬�㽫���������ش���ݰ���δ����");
              break;
            case 12:
              mImageButton3.setImageResource(R.drawable.i12);
              mTextView1.setText("����һ����λ�ĵ������ơ����ڵ������鿴�������壬�㽫���������ش���ݰ���δ����");
              break;
            case 13:
              mImageButton3.setImageResource(R.drawable.i13);
              mTextView1.setText("����һ����λ�������ơ����ڵ������鿴�������壬�㽫���������ش���ݰ���δ����");
              break;
            case 14:
              mImageButton3.setImageResource(R.drawable.i14);
              mTextView1.setText("����һ����λ�Ľ����ơ����ڵ������鿴�������壬�㽫���������ش���ݰ���δ����");
              break;
            case 15:
              mImageButton3.setImageResource(R.drawable.i15);
              mTextView1.setText("����һ����λ�Ķ�ħ�ơ����ڵ������鿴�������壬�㽫���������ش���ݰ���δ����");
              break;
            case 16:
              mImageButton3.setImageResource(R.drawable.i16);
              mTextView1.setText("����һ����λ�����ơ����ڵ������鿴�������壬�㽫���������ش���ݰ���δ����");
              break;
            case 17:
              mImageButton3.setImageResource(R.drawable.i17);
              mTextView1.setText("����һ����λ�������ơ����ڵ������鿴�������壬�㽫���������ش���ݰ���δ����");
              break;
            case 18:
              mImageButton3.setImageResource(R.drawable.i18);
              mTextView1.setText("����һ����λ�������ơ����ڵ������鿴�������壬�㽫���������ش���ݰ���δ����");
              break;
            case 19:
              mImageButton3.setImageResource(R.drawable.i19);
              mTextView1.setText("����һ����λ��̫���ơ����ڵ������鿴�������壬�㽫���������ش���ݰ���δ����");
              break;
            case 20:
              mImageButton3.setImageResource(R.drawable.i20);
              mTextView1.setText("����һ����λ�������ơ����ڵ������鿴�������壬�㽫���������ش���ݰ���δ����");
              break;
            case 21:
              mImageButton3.setImageResource(R.drawable.i21);
              mTextView1.setText("����һ����λ�������ơ����ڵ������鿴�������壬�㽫���������ش���ݰ���δ����");
              break;
            case 22:
              mImageButton3.setImageResource(R.drawable.i22);
              mTextView1.setText("����һ����λ�������ơ����ڵ������鿴�������壬�㽫���������ش���ݰ���δ����");
              break;
            case 23:
              mImageButton3.setImageResource(R.drawable.i23);
              mTextView1.setText("����һ����λ��ħ��ʦ�ơ����ڵ������鿴�������壬�㽫���������ش���ݰ���δ����");
              break;
            case 24:
              mImageButton3.setImageResource(R.drawable.i24);
              mTextView1.setText("����һ����λ��Ů��˾�ơ����ڵ������鿴�������壬�㽫���������ش���ݰ���δ����");
              break;
            case 25:
              mImageButton3.setImageResource(R.drawable.i25);
              mTextView1.setText("����һ����λ��Ů���ơ����ڵ������鿴�������壬�㽫���������ش���ݰ���δ����");
              break;
            case 26:
              mImageButton3.setImageResource(R.drawable.i26);
              mTextView1.setText("����һ����λ�Ļʵ��ơ����ڵ������鿴�������壬�㽫���������ش���ݰ���δ����");
              break;
            case 27:
              mImageButton3.setImageResource(R.drawable.i27);
              mTextView1.setText("����һ����λ�Ľ����ơ����ڵ������鿴�������壬�㽫���������ش���ݰ���δ����");
              break;
            case 28:
              mImageButton3.setImageResource(R.drawable.i28);
              mTextView1.setText("����һ����λ�������ơ����ڵ������鿴�������壬�㽫���������ش���ݰ���δ����");
              break;
            case 29:
              mImageButton3.setImageResource(R.drawable.i29);
              mTextView1.setText("����һ����λ��ս���ơ����ڵ������鿴�������壬�㽫���������ش���ݰ���δ����");
              break;
            case 30:
              mImageButton3.setImageResource(R.drawable.i30);
              mTextView1.setText("����һ����λ�������ơ����ڵ������鿴�������壬�㽫���������ش���ݰ���δ����");
              break;
            case 31:
              mImageButton3.setImageResource(R.drawable.i31);
              mTextView1.setText("����һ����λ����ʿ�ơ����ڵ������鿴�������壬�㽫���������ش���ݰ���δ����");
              break;
            case 32:
              mImageButton3.setImageResource(R.drawable.i32);
              mTextView1.setText("����һ����λ������֮���ơ����ڵ������鿴�������壬�㽫���������ش���ݰ���δ����");
              break;
            case 33:
              mImageButton3.setImageResource(R.drawable.i33);
              mTextView1.setText("����һ����λ�������ơ����ڵ������鿴�������壬�㽫���������ش���ݰ���δ����");
              break;
            case 34:
              mImageButton3.setImageResource(R.drawable.i34);
              mTextView1.setText("����һ����λ�ĵ������ơ����ڵ������鿴�������壬�㽫���������ش���ݰ���δ����");
              break;
            case 35:
              mImageButton3.setImageResource(R.drawable.i35);
              mTextView1.setText("����һ����λ�������ơ����ڵ������鿴�������壬�㽫���������ش���ݰ���δ����");
              break;
            case 36:
              mImageButton3.setImageResource(R.drawable.i36);
              mTextView1.setText("����һ����λ�Ľ����ơ����ڵ������鿴�������壬�㽫���������ش���ݰ���δ����");
              break;
            case 37:
              mImageButton3.setImageResource(R.drawable.i37);
              mTextView1.setText("����һ����λ�Ķ�ħ�ơ����ڵ������鿴�������壬�㽫���������ش���ݰ���δ����");
              break;
            case 38:
              mImageButton3.setImageResource(R.drawable.i38);
              mTextView1.setText("����һ����λ�����ơ����ڵ������鿴�������壬�㽫���������ش���ݰ���δ����");
              break;
            case 39:
              mImageButton3.setImageResource(R.drawable.i39);
              mTextView1.setText("����һ����λ�������ơ����ڵ������鿴�������壬�㽫���������ش���ݰ���δ����");
              break;
            case 40:
              mImageButton3.setImageResource(R.drawable.i40);
              mTextView1.setText("����һ����λ�������ơ����ڵ������鿴�������壬�㽫���������ش���ݰ���δ����");
              break;
            case 41:
              mImageButton3.setImageResource(R.drawable.i41);
              mTextView1.setText("����һ����λ��̫���ơ����ڵ������鿴�������壬�㽫���������ش���ݰ���δ����");
              break;
            case 42:
              mImageButton3.setImageResource(R.drawable.i42);
              mTextView1.setText("����һ����λ�������ơ����ڵ������鿴�������壬�㽫���������ش���ݰ���δ����");
              break;
            case 43:
              mImageButton3.setImageResource(R.drawable.i43);
              mTextView1.setText("����һ����λ�������ơ����ڵ������鿴�������壬�㽫���������ش���ݰ���δ����");
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
               mTextView1.setText("�װ��ĺ��ӣ�������ָ��������ķ������������������Ѿ��ж԰��Ĵ��˰ɡ�");                
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
               mTextView1.setText("�װ��ĺ��ӣ�������ָ��������ķ������������������Ѿ��ж԰��Ĵ��˰ɡ�");                
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
               mTextView1.setText("�װ��ĺ��ӣ�������ָ��������ķ������������������Ѿ��ж԰��Ĵ��˰ɡ�");                
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
               mTextView1.setText("�װ��ĺ��ӣ�������ָ��������ķ������������������Ѿ��ж԰��Ĵ��˰ɡ���");                
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
               mTextView1.setText("�װ��ĺ��ӣ�������ָ��������ķ������������������Ѿ��ж԰��Ĵ��˰ɡ�");                
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
               mTextView1.setText("�װ��ĺ��ӣ�������ָ��������ķ������������������Ѿ��ж԰��Ĵ��˰ɡ�");                
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
               mTextView1.setText("�װ��ĺ��ӣ�������ָ��������ķ������������������Ѿ��ж԰��Ĵ��˰ɡ�");                
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
               mTextView1.setText("�װ��ĺ��ӣ�������ָ��������ķ������������������Ѿ��ж԰��Ĵ��˰ɡ�");                
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
               mTextView1.setText("�װ��ĺ��ӣ�������ָ��������ķ������������������Ѿ��ж԰��Ĵ��˰ɡ���");                
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
               mTextView1.setText("�װ��ĺ��ӣ�������ָ��������ķ������������������Ѿ��ж԰��Ĵ��˰ɡ�");                
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
               mTextView1.setText("�װ��ĺ��ӣ�������ָ��������ķ������������������Ѿ��ж԰��Ĵ��˰ɡ�");                
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
               mTextView1.setText("�װ��ĺ��ӣ�������ָ��������ķ������������������Ѿ��ж԰��Ĵ��˰ɡ�");                
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
               mTextView1.setText("�װ��ĺ��ӣ�������ָ��������ķ������������������Ѿ��ж԰��Ĵ��˰ɡ�");                
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
               mTextView1.setText("�װ��ĺ��ӣ�������ָ��������ķ������������������Ѿ��ж԰��Ĵ��˰ɡ�");                
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
               mTextView1.setText("�װ��ĺ��ӣ�������ָ��������ķ������������������Ѿ��ж԰��Ĵ��˰ɡ�");                
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
               mTextView1.setText("�װ��ĺ��ӣ�������ָ��������ķ������������������Ѿ��ж԰��Ĵ��˰ɡ�");                
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
               mTextView1.setText("�װ��ĺ��ӣ�������ָ��������ķ������������������Ѿ��ж԰��Ĵ��˰ɡ�");                
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
               mTextView1.setText("�װ��ĺ��ӣ�������ָ��������ķ������������������Ѿ��ж԰��Ĵ��˰ɡ�");                
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
               mTextView1.setText("�װ��ĺ��ӣ�������ָ��������ķ������������������Ѿ��ж԰��Ĵ��˰ɡ�");                
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
               mTextView1.setText("�װ��ĺ��ӣ�������ָ��������ķ������������������Ѿ��ж԰��Ĵ��˰ɡ�");                
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
               mTextView1.setText("�װ��ĺ��ӣ�������ָ��������ķ������������������Ѿ��ж԰��Ĵ��˰ɡ�");                
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
               mTextView1.setText("�װ��ĺ��ӣ�������ָ��������ķ������������������Ѿ��ж԰��Ĵ��˰ɡ�");                
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
               mTextView1.setText("�װ��ĺ��ӣ�������ָ��������ķ������������������Ѿ��ж԰��Ĵ��˰ɡ�");                
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
               mTextView1.setText("�װ��ĺ��ӣ�������ָ��������ķ������������������Ѿ��ж԰��Ĵ��˰ɡ�");                
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
               mTextView1.setText("�װ��ĺ��ӣ�������ָ��������ķ������������������Ѿ��ж԰��Ĵ��˰ɡ�");                
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
               mTextView1.setText("�װ��ĺ��ӣ�������ָ��������ķ������������������Ѿ��ж԰��Ĵ��˰ɡ���");                
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
               mTextView1.setText("�װ��ĺ��ӣ�������ָ��������ķ������������������Ѿ��ж԰��Ĵ��˰ɡ�");                
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
               mTextView1.setText("�װ��ĺ��ӣ�������ָ��������ķ������������������Ѿ��ж԰��Ĵ��˰ɡ�");                
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
               mTextView1.setText("�װ��ĺ��ӣ�������ָ��������ķ������������������Ѿ��ж԰��Ĵ��˰ɡ�");                
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
               mTextView1.setText("�װ��ĺ��ӣ�������ָ��������ķ������������������Ѿ��ж԰��Ĵ��˰ɡ�");                
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
               mTextView1.setText("�װ��ĺ��ӣ�������ָ��������ķ������������������Ѿ��ж԰��Ĵ��˰ɡ���");                
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
               mTextView1.setText("�װ��ĺ��ӣ�������ָ��������ķ������������������Ѿ��ж԰��Ĵ��˰ɡ�");                
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
               mTextView1.setText("�װ��ĺ��ӣ�������ָ��������ķ������������������Ѿ��ж԰��Ĵ��˰ɡ�");                
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
               mTextView1.setText("�װ��ĺ��ӣ�������ָ��������ķ������������������Ѿ��ж԰��Ĵ��˰ɡ�");                
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
               mTextView1.setText("�װ��ĺ��ӣ�������ָ��������ķ������������������Ѿ��ж԰��Ĵ��˰ɡ�");                
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
               mTextView1.setText("�װ��ĺ��ӣ�������ָ��������ķ������������������Ѿ��ж԰��Ĵ��˰ɡ�");                
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
               mTextView1.setText("�װ��ĺ��ӣ�������ָ��������ķ������������������Ѿ��ж԰��Ĵ��˰ɡ�");                
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
               mTextView1.setText("�װ��ĺ��ӣ�������ָ��������ķ������������������Ѿ��ж԰��Ĵ��˰ɡ�");                
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
               mTextView1.setText("�װ��ĺ��ӣ�������ָ��������ķ������������������Ѿ��ж԰��Ĵ��˰ɡ�");                
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
               mTextView1.setText("�װ��ĺ��ӣ�������ָ��������ķ������������������Ѿ��ж԰��Ĵ��˰ɡ�");                
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
               mTextView1.setText("�װ��ĺ��ӣ�������ָ��������ķ������������������Ѿ��ж԰��Ĵ��˰ɡ�");                
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
               mTextView1.setText("�װ��ĺ��ӣ�������ָ��������ķ������������������Ѿ��ж԰��Ĵ��˰ɡ�");                
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
               mTextView1.setText("�װ��ĺ��ӣ�������ָ��������ķ������������������Ѿ��ж԰��Ĵ��˰ɡ�");                
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
               mTextView1.setText("�װ��ĺ��ӣ�������ָ��������ķ������������������Ѿ��ж԰��Ĵ��˰ɡ�");                
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
