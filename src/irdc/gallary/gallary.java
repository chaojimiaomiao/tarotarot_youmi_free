package irdc.gallary; 

import irdc.gallary.R.string;
import android.R.integer;
import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.TextView; /*����Layout��ʹ��Gallery widget������������Щģ��*/ 
import android.content.Context; 
import android.content.Intent;
import android.widget.Gallery;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast; 
import android.widget.AdapterView.OnItemClickListener;

public class gallary extends Activity { 
  private TextView mTextView01;
  public String preString;
  private ImageView b1;
  public static int Pos;
  
  public boolean onTouchEvent(MotionEvent event) 
  {   
    /* event��Action?�� */
    if(event.getPointerCount()>1)
    {
      Intent intent=new Intent();
      intent.setClass(gallary.this, choose.class);
      startActivity(intent);
      choose.myMediaPlayer.stop();
      gallary.this.finish();
    }

    return super.onTouchEvent(event);
  }
  @Override
  public boolean onKeyDown(int keyCode, KeyEvent event) {
    
    //���¼����Ϸ��ذ�ť
    if(keyCode == KeyEvent.KEYCODE_BACK){
      Intent intent=new Intent();
      intent.setClass(gallary.this, choose.class);
      startActivity(intent);
      choose.myMediaPlayer.stop();
      gallary.this.finish();
      return true;
    }else{    
      return super.onKeyDown(keyCode, event);
    }
  }
/** Called when the activity is first created. */ 
@Override 
public void onCreate(Bundle savedInstanceState) { 
  super.onCreate(savedInstanceState); 
//����״̬����ʹimageviewȫ����ʾ
  this.getWindow().setFlags
  (
      WindowManager.LayoutParams.FLAG_FULLSCREEN,
      WindowManager.LayoutParams.FLAG_FULLSCREEN
  );
  //���ر�����
  requestWindowFeature(Window.FEATURE_NO_TITLE);
setContentView(R.layout.main1_01);
Toast toast=Toast.makeText(gallary.this, "��㴥����Ļ�Է�����һ��", Toast.LENGTH_LONG);
toast.setGravity(Gravity.TOP, 10, 10);
toast.show();
b1=(ImageView)findViewById(R.id.button1);

b1.setOnClickListener(new Button.OnClickListener()
{
  @Override
  public void onClick(View v)
  {
    b1.setImageResource(R.drawable.detail_down);
    Intent intent=new Intent();
    intent.setClass(gallary.this, SimIntro.class);
    //����һ���µ�Activity
    startActivity(intent);
    //�ر�ԭ����Activity
    gallary.this.finish();
  }
});

Gallery g=(Gallery) findViewById(R.id.myGallery1);
g.setAdapter(new ImageAdapter(this)); 
//    Pos=position;//                                ...............................
g.setOnItemClickListener(new OnItemClickListener()
{
  public void onItemClick(AdapterView<?>parent,View v,int position,long id)
  {
    Pos=position;
    switch (position)
    {
    case 0:
      preString="����";  
      break;
    case 1:
      preString="ħ��ʦ"; 
      break;
    case 2:
      preString="Ů��˾";      
      break;
    case 3:
      preString="����";      
      break;
    case 4:
      preString="����";      
      break;
    case 5:
      preString="�̻�";      
      break;
    case 6:
      preString="����";      
      break;
    case 7:
      preString="ս��";      
      break;
    case 8:
      preString="����";      
      break;
    case 9:
      preString="��ʿ";      
      break;
    case 10:
      preString="����֮��";      
      break;
    case 11:
      preString="����";      
      break;
    case 12:
      preString="������";      
      break;
    case 13:
      preString="����";      
      break;
    case 14:
      preString="����";      
      break;
    case 15:
      preString="��ħ";      
      break;
    case 16:
      preString="��";      
      break;
    case 17:
      preString="�ǳ�";      
      break;
    case 18:
      preString="����";      
      break;
    case 19:
      preString="̫��";      
      break;
    case 20:
      preString="����";      
      break;
    case 21:
      preString="����";      
      break;


    default:
      break;
    }
    Toast.makeText(gallary.this, preString, Toast.LENGTH_SHORT).show();
  }
});
} 
public class ImageAdapter extends BaseAdapter 
{ /* ���Ա myContextΪContext���� */ 
  private Context myContext; 
  
private int[] myImageIds = 
{   R.drawable.i0,
    R.drawable.i1,
    R.drawable.i2,
    R.drawable.i3,
    R.drawable.i4,
    R.drawable.i5,
    R.drawable.i6,
    R.drawable.i7,
    R.drawable.i8,
    R.drawable.i9,
    R.drawable.i10,
    R.drawable.i11,
    R.drawable.i12,
    R.drawable.i13,
    R.drawable.i14,
    R.drawable.i15,
    R.drawable.i16,
    R.drawable.i17,
    R.drawable.i18,
    R.drawable.i19,
    R.drawable.i20,
    R.drawable.i21,}; 
/* ������ֻ��һ����������Ҫ�����Context */
public ImageAdapter(Context c) { this.myContext = c; }
/* �ش������Ѷ����ͼƬ������ */ 
public int getCount() { return this.myImageIds.length; } 
/* ����getItem������ȡ��Ŀǰ������Ӱ�������ID */ 
public Object getItem(int position) { return position; } 
public long getItemId(int position) { return position; } 
/* ȡ��Ŀǰ����ʾ��Ӱ��View����������IDֵʹ֮��ȡ����� */ 
public View getView(int position, View convertView, ViewGroup parent)
{ /* ����һ��ImageView���� */ ImageView i = new ImageView(this.myContext); 
i.setImageResource(this.myImageIds[position]);
i.setScaleType(ImageView.ScaleType.FIT_XY);
/* �趨���ImageView����Ŀ�ߣ���λΪdip */
i.setLayoutParams(new Gallery.LayoutParams(271, 470)); 
return i; }
/*���ݾ��������λ���� ����getScale�ش�views�Ĵ�С(0.0f to 1.0f)*/ 
public float getScale(boolean focused, int offset) 
{ /* Formula: 1 / (2 ^ offset) */ 
  return Math.max(0,1.0f/(float)Math.pow(2,Math.abs(offset))*1.2f); 
  }
} 
}