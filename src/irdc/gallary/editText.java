package irdc.gallary;

import irdc.gallary.R.string;
import android.R.integer;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.app.AlertDialog;
import android.content.DialogInterface;

public class editText extends Activity
{
//  public static int num_editText=0;
  public boolean onTouchEvent(MotionEvent event) 
  {   
    /* event的Action?断 */
    if(event.getPointerCount()>1)
    {
      Intent intent=new Intent();
      intent.setClass(editText.this, Choose2.class);
      startActivity(intent);
      System.exit(0);
      editText.this.finish();
    }

    return super.onTouchEvent(event);
  }
  @Override
  public boolean onKeyDown(int keyCode, KeyEvent event) {
    
    //按下键盘上返回按钮
    if(keyCode == KeyEvent.KEYCODE_BACK){
      Intent intent=new Intent();
      intent.setClass(editText.this, Choose2.class);
      startActivity(intent);
      editText.this.finish();
//      choose.myMediaPlayer.stop();
      return true;
    }else{    
      return super.onKeyDown(keyCode, event);
    }
  }

  @Override
  public void onCreate(Bundle savedInstanceState)
  {
//    shuffle.num_shuffle=1;
  //隐藏状态栏，使imageview全屏显示
    this.getWindow().setFlags
    (
        WindowManager.LayoutParams.FLAG_FULLSCREEN,
        WindowManager.LayoutParams.FLAG_FULLSCREEN
    );
    //隐藏标题栏
    requestWindowFeature(Window.FEATURE_NO_TITLE);
    super.onCreate(savedInstanceState);
    setContentView(R.layout.main2_01_1);
    Button b1=(Button)findViewById(R.id.button1);
    b1.setOnClickListener(new OnClickListener()
    {
      @Override
      public void onClick(View v)
      {
        EditText etEditText=(EditText)findViewById(R.id.question);
        final String question=etEditText.getText().toString();
        new AlertDialog.Builder(editText.this).setTitle("重要").setMessage("Are you sure?").setIcon(R.drawable.hot)
        .setPositiveButton
        (
          "确定",
          new DialogInterface.OnClickListener()
          {
            public void onClick(DialogInterface dialoginterface,int i)
            {
              Intent intent=new Intent();
              intent.setClass(editText.this, cardarray1.class);
              
              Bundle bundle=new Bundle();
              bundle.putString("question",question);
              
              intent.putExtras(bundle);
              startActivity(intent);  
              editText.this.finish();
            }
          }
        ).setNegativeButton("取消", new DialogInterface.OnClickListener()
        {
          
          @Override
          public void onClick(DialogInterface dialog, int which)
          {
            // TODO Auto-generated method stub
            
          }
        })
        .show();
      }
    });
  }
}