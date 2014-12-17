package irdc.gallary;

import java.security.PublicKey;
import java.util.Arrays;
import java.util.Random;

import android.R.integer;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.drawable.BitmapDrawable;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AbsoluteLayout;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import android.view.View.OnClickListener;
import android.os.Vibrator;
import android.app.Service;

public class shuffle extends Activity
{
//  public static int num_shuffle=0;
  private SensorManager mSensorManager;
  private ImageView mImageView1;
  private ImageView mImageView2;
  private ImageView mImageView3;
  private ImageView mImageView4;
  private ImageView mImageView5;
  private ImageView mImageView6;
  private ImageView mImageView7;
  private ImageView mImageView8;
  private Bitmap myBitmap;
  private Vibrator mVibrator01;
  private int key;
//  final private Bitmap myBitmap=BitmapFactory.decodeResource(getResources(), R.drawable.back);
//  public Bitmap[] b=new Bitmap[10];
//  final int width=myBitmap.getWidth();
//  final int height=myBitmap.getHeight();
  
  public boolean onTouchEvent(MotionEvent event) 
  {
    /* event的Action?断 */
    if(event.getPointerCount()>1)
    {
      Intent intent=new Intent();
      intent.setClass(shuffle.this, Choose2.class);
      startActivity(intent);
      System.exit(0);
      shuffle.this.finish();
    }
    return super.onTouchEvent(event);
  }
  @Override
  public boolean onKeyDown(int keyCode, KeyEvent event) {
    
    //按下键盘上返回按钮
    if(keyCode == KeyEvent.KEYCODE_BACK){
      Intent intent=new Intent();
      intent.setClass(shuffle.this, Choose2.class);
      startActivity(intent);
      shuffle.this.finish();
//      choose.myMediaPlayer.stop();
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
    setContentView(R.layout.main2_sensor);
    Toast.makeText(shuffle.this, "准备好了吗？  专注于你向塔罗之神祈求的问题，凭借心灵的感应来洗牌吧！按动按钮以完成洗牌。", Toast.LENGTH_LONG).show();

    Bundle bundle=this.getIntent().getExtras();
    key=bundle.getInt("key");
    Toast.makeText(shuffle.this, "摇晃屏幕来洗牌", Toast.LENGTH_SHORT);
    ImageView button=(ImageView)findViewById(R.id.myButton1);
    button.setOnClickListener(new Button.OnClickListener()
    {
      public void onClick(View v)
      {
        switch (key)
        {
        case 1:
          Intent intent1=new Intent();
          intent1.setClass(shuffle.this, editText.class);
          startActivity(intent1);
          shuffle.this.finish();
          break;
        case 2:
          Intent intent2=new Intent();
          intent2.setClass(shuffle.this, cardarray2.class);
          startActivity(intent2);
          shuffle.this.finish();
          break;
        case 3:
          Intent intent3=new Intent();
          intent3.setClass(shuffle.this, cardarray3.class);
          startActivity(intent3);
          shuffle.this.finish();
          break;

        default:
          break;
        }
      }
    });
    
    final Bitmap myBitmap=BitmapFactory.decodeResource(getResources(), R.drawable.back);//我擦，还没有onCreate不能先定义
    final int width=myBitmap.getWidth();final int height=myBitmap.getHeight();
//    int width=(int)(0.6*myBitmap.getWidth());int height=(int)(myBitmap.getHeight()*0.5);
//    Matrix matrix1=new Matrix();
//    matrix1.postScale(0.6f, 0.5f);//?
//    matrix1.setRotate(0);
//    Bitmap reBitmap1=Bitmap.createBitmap(myBitmap, 0, 0, width, height, matrix1, true);
    Matrix matrix2=new Matrix();
    matrix2.postScale(0.6f, 0.5f);
    matrix2.setRotate(30);
    Bitmap reBitmap2=Bitmap.createBitmap(myBitmap, 0, 0, width, height, matrix2, true);
    Matrix matrix3=new Matrix();
    matrix3.postScale(0.6f, 0.5f);
    matrix3.setRotate(60);
    Bitmap reBitmap3=Bitmap.createBitmap(myBitmap, 0, 0, width, height, matrix3, true);
    Matrix matrix4=new Matrix();
    matrix4.postScale(0.6f, 0.5f);
    matrix4.setRotate(90);
    Bitmap reBitmap4=Bitmap.createBitmap(myBitmap, 0, 0, width, height, matrix4, true);
    Matrix matrix5=new Matrix();
    matrix5.postScale(0.6f, 0.5f);
    matrix5.setRotate(120);
    Bitmap reBitmap5=Bitmap.createBitmap(myBitmap, 0, 0, width, height, matrix5, true);
    Matrix matrix6=new Matrix();
    matrix6.postScale(0.6f, 0.5f);
    matrix6.setRotate(150);
    Bitmap reBitmap6=Bitmap.createBitmap(myBitmap, 0, 0, width, height, matrix6, true);
    Matrix matrix7=new Matrix();
    matrix7.postScale(0.6f, 0.5f);
    matrix7.setRotate(170);
    Bitmap reBitmap7=Bitmap.createBitmap(myBitmap, 0, 0, width, height, matrix7, true);
    Matrix matrix8=new Matrix();
    matrix8.postScale(0.6f, 0.5f);
    matrix8.setRotate(20);
    Bitmap reBitmap8=Bitmap.createBitmap(myBitmap, 0, 0, width, height, matrix8, true);
 
//    mImageView1=(ImageView)findViewById(R.id.backview1);
//    mImageView1.setImageBitmap(reBitmap1);
    mImageView2=(ImageView)findViewById(R.id.backview2);
    mImageView2.setImageBitmap(reBitmap2);
    mImageView3=(ImageView)findViewById(R.id.backview3);
    mImageView3.setImageBitmap(reBitmap3);
    mImageView4=(ImageView)findViewById(R.id.backview4);
    mImageView4.setImageBitmap(reBitmap4);
    mImageView5=(ImageView)findViewById(R.id.backview5);
    mImageView5.setImageBitmap(reBitmap5);
    mImageView6=(ImageView)findViewById(R.id.backview6);
    mImageView6.setImageBitmap(reBitmap6);
    mImageView7=(ImageView)findViewById(R.id.backview7);
    mImageView7.setImageBitmap(reBitmap7);
    mImageView8=(ImageView)findViewById(R.id.backview8);
    mImageView8.setImageBitmap(reBitmap8);
    
    mSensorManager = (SensorManager) getSystemService(SENSOR_SERVICE);
    mVibrator01 = ( Vibrator )getApplication().getSystemService( Service .VIBRATOR_SERVICE ); 

  }
    @Override
    protected void onResume()
    {
   // TODO Auto-generated method stub
      super.onResume();
      /* 取得方守性的Sensor，并注册SensorEventListener */
      mSensorManager.registerListener(mSensorEventListener, mSensorManager
          .getDefaultSensor(Sensor.TYPE_ACCELEROMETER),
          SensorManager.SENSOR_DELAY_NORMAL);
    }

    @Override
    protected void onPause()
    {
      // TODO Auto-generated method stub
      /* 取消注册SensorEventListener */
      mSensorManager.unregisterListener(mSensorEventListener);
      super.onPause();
    }

    private final SensorEventListener mSensorEventListener = new SensorEventListener()
    {

      @Override
      public void onAccuracyChanged(Sensor sensor, int accuracy)
      {
        // TODO Auto-generated method stub

      }

      @Override
      public void onSensorChanged(SensorEvent event)
      {
        // TODO Auto-generated method stub
        /* 判断Sensor的种类 */
        if (event.sensor.getType() == Sensor.TYPE_ACCELEROMETER)
        {
          float x=event.values[SensorManager.DATA_X];
          float y=event.values[SensorManager.DATA_Y];
          float z=event.values[SensorManager.DATA_Z];
          if (x>2&&y>2)
          {
            if (x>5&&y>5)
            {
              mVibrator01.vibrate(new long[]{100,10,100,1000}, -1);
            }
            mImageView8.layout(0+(int)(10*x), 10+(int)(10*y), 300+(int)(10*x), 490+(int)(10*y));
            mImageView7.layout(200-(int)(5*x), 120-(int)(5*y), 500-(int)(5*x),520-(int)(5*y));
            mImageView6.layout(170+(int)(10*x), 240+(int)(10*y), 470+(int)(10*x), 720+(int)(10*y));
            mImageView5.layout(140-(int)(10*x), 0-(int)(10*y), 440-(int)(10*x), 480-(int)(10*y));
            mImageView4.layout(110+(int)(5*x), 300+(int)(5*y), 410+(int)(5*x), 780+(int)(5*y));
            mImageView3.layout(80-(int)(10*x), 60-(int)(10*y), 380-(int)(10*x), 540-(int)(10*y));
            mImageView2.layout(50+(int)(10*x), 180+(int)(10*y), 350+(int)(10*x), 660+(int)(10*y));
          }
        }
      }
    };
 }

