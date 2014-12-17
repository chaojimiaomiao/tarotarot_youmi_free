package irdc.gallary;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
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

public class Choose2 extends Activity
{
  private ImageView g_01Button;
  private ImageView g_02Button;
  private ImageView g_03Button;
  
  public boolean onTouchEvent(MotionEvent event) 
  {   
    /* event��Action?�� */
    if(event.getPointerCount()>1)
    {
      Intent intent=new Intent();
      intent.setClass(Choose2.this, choose.class);
      startActivity(intent);
      choose.myMediaPlayer.stop();
      Choose2.this.finish();
    }

    return super.onTouchEvent(event);
  }
  @Override
  public boolean onKeyDown(int keyCode, KeyEvent event) {
    
    //���¼����Ϸ��ذ�ť
    if(keyCode == KeyEvent.KEYCODE_BACK){
      Intent intent=new Intent();
      intent.setClass(Choose2.this, choose.class);
      startActivity(intent);
      choose.myMediaPlayer.stop();
      Choose2.this.finish();
      return true;
    }else{    
      return super.onKeyDown(keyCode, event);
    }
  }
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
    
    setContentView(R.layout.main2);
    g_01Button=(ImageView)findViewById(R.id.button1);
    g_02Button=(ImageView)findViewById(R.id.button2);
    g_03Button=(ImageView)findViewById(R.id.button3);
    Toast toast=Toast.makeText(Choose2.this, "��㴥����Ļ�Է�����һ��", Toast.LENGTH_SHORT);
    toast.setGravity(Gravity.TOP, 10, 10);
    toast.show();
    g_01Button.setOnFocusChangeListener(new OnFocusChangeListener()
    {
      public void onFocusChange(View arg0,boolean isFocused)
      {
        g_01Button.setImageResource(R.drawable.cards_1_down);
      } 
    });
    g_01Button.setOnClickListener(new Button.OnClickListener()
    {
      @Override
      public void onClick(View v)
      {
        g_01Button.setImageResource(R.drawable.cards_1_down);
        Intent intent=new Intent();
        intent.setClass(Choose2.this, shuffle.class);
        Bundle bundle =new Bundle();
        bundle.putInt("key", 1);
        intent.putExtras(bundle);
        //����һ���µ�Activity
        startActivity(intent);
        //�ر�ԭ����Activity
        Choose2.this.finish();
      }
    });
    g_02Button.setOnFocusChangeListener(new OnFocusChangeListener()
    {
      public void onFocusChange(View arg0,boolean isFocused)
      {
        g_02Button.setImageResource(R.drawable.cards_2_down);
      } 
    });
    g_02Button.setOnClickListener(new Button.OnClickListener()
    {
      @Override
      public void onClick(View v)
      {
        g_02Button.setImageResource(R.drawable.cards_2_down);
        Intent intent=new Intent();
        intent.setClass(Choose2.this, shuffle.class);
        Bundle bundle =new Bundle();
        bundle.putInt("key", 2);
        intent.putExtras(bundle);
        //����һ���µ�Activity
        startActivity(intent);
        //�ر�ԭ����Activity
        Choose2.this.finish();
      }
    });
    g_03Button.setOnFocusChangeListener(new OnFocusChangeListener()
    {
      public void onFocusChange(View arg0,boolean isFocused)
      {
        g_03Button.setImageResource(R.drawable.cards_3_down);
      } 
    });
    g_03Button.setOnClickListener(new Button.OnClickListener()
    {
      @Override
      public void onClick(View v)
      {
        g_03Button.setImageResource(R.drawable.cards_3_down);
        Intent intent=new Intent();
        intent.setClass(Choose2.this, shuffle.class);
        Bundle bundle =new Bundle();
        bundle.putInt("key", 3);
        intent.putExtras(bundle);
        //����һ���µ�Activity
        startActivity(intent);
        //�ر�ԭ����Activity
        Choose2.this.finish();
      }
    });
  }
}