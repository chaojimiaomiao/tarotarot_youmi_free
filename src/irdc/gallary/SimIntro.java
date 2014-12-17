package irdc.gallary; 
/* import���class */ 
import net.youmi.android.AdManager;
import android.app.Activity; 
import android.content.Intent;
import android.os.Bundle; 
import android.provider.ContactsContract.CommonDataKinds.Im;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button; 
import android.widget.ImageView;
public class SimIntro extends Activity 
{ 
  private ImageView miImageView;
  private Button b1;
  
  public boolean onTouchEvent(MotionEvent event) 
  {   
    /* event��Action?�� */
    if(event.getPointerCount()>1)
    {
      Intent intent=new Intent();
      intent.setClass(SimIntro.this, gallary.class);
      startActivity(intent);
      SimIntro.this.finish();
    }

    return super.onTouchEvent(event);
  }
  @Override
  public boolean onKeyDown(int keyCode, KeyEvent event) {
    
    //���¼����Ϸ��ذ�ť
    if(keyCode == KeyEvent.KEYCODE_BACK){
      Intent intent=new Intent();
      intent.setClass(SimIntro.this, gallary.class);
      startActivity(intent);
      SimIntro.this.finish();
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
    final int pripos=gallary.Pos;
    
  //����״̬����ʹimageviewȫ����ʾ
    this.getWindow().setFlags
    (
        WindowManager.LayoutParams.FLAG_FULLSCREEN,
        WindowManager.LayoutParams.FLAG_FULLSCREEN
    );
    //���ر�����
    requestWindowFeature(Window.FEATURE_NO_TITLE);

    /* ����main.xml Layout */

    /* ��findViewById()ȡ��Button���󣬲�����onClickListener */ 
    setContentView(R.layout.main1_02); //..............................image0
    miImageView=(ImageView)findViewById(R.id.image1);//.......................//........//....//...//../
    ImageView b1 = (ImageView) findViewById(R.id.button1); 

    b1.setOnClickListener(new Button.OnClickListener()
    { 
      public void onClick(View v)
      { 
        jumpToLayout2();
       }
     }
    ); 
    ImageView b3=(ImageView)findViewById(R.id.button2);
    b3.setOnClickListener(new Button.OnClickListener() 
    { 
      public void onClick(View v) 
      {
        jumpToLayout44();
        } 
      });
    switch (pripos)
    {
    case 0:
      jumpToLayout2();
      break;
    case 1:
      jumpToLayout4();
      break;
    case 2:
      jumpToLayout6();
      break;
    case 3:
      jumpToLayout8();
      break;
    case 4:
      jumpToLayout10();
      break;
    case 5:
      jumpToLayout12();
      break;
    case 6:
      jumpToLayout14();
      break;
    case 7:
      jumpToLayout16();
      break;
    case 8:
      jumpToLayout18();
      break;
    case 9:
      jumpToLayout20();
      break;
    case 10:
      jumpToLayout22();
      break;
    case 11:
      jumpToLayout24();
      break;
    case 12:
      jumpToLayout26();
      break;
    case 13:
      jumpToLayout28();
      break;
    case 14:
      jumpToLayout30();
      break;
    case 15:
      jumpToLayout32();
      break;
    case 16:
      jumpToLayout34();
      break;
    case 17:
      jumpToLayout36();
      break;
    case 18:
      jumpToLayout38();
      break;
    case 19:
      jumpToLayout40();
      break;
    case 20:
      jumpToLayout42();
      break;
    case 21:
      jumpToLayout44();
      break;

    default:
      break;
    }
  }
  

  /* method jumpToLayout2����layout��main.xml�л���mylayout.xml */ 
  public void jumpToLayout2()//............................................text0
  { 
    /* ��layout�ĳ�mylayout.xml */ 
    setContentView(R.layout.text0);
    /* ��findViewById()ȡ��Button���󣬲�����onClickListener */ 
    ImageView b2 = (ImageView) findViewById(R.id.button2);
    b2.setOnClickListener(new Button.OnClickListener() 
    { 
      public void onClick(View v) 
      { 
        jumpToLayout3(); 
       } 
     });
    
   } 
  public void jumpToLayout3()                   //........................image1
  {
    /* ��layout�ĳ�main.xml */ 
    setContentView(R.layout.main1_02);
    miImageView=(ImageView)findViewById(R.id.image1);
    miImageView.setImageDrawable(getResources().getDrawable(R.drawable.i1));
    /* ��findViewById()ȡ��Button���󣬲�����onClickListener */ 
    ImageView b1 = (ImageView) findViewById(R.id.button1); 
    b1.setOnClickListener(new Button.OnClickListener() 
    { 
      public void onClick(View v) 
      {
        jumpToLayout4();
        } 
      });
    ImageView b3=(ImageView)findViewById(R.id.button2);
    b3.setOnClickListener(new Button.OnClickListener() 
    { 
      public void onClick(View v) 
      {
        jumpToLayout2();
        } 
      });
    } 
  public void jumpToLayout4()                   //........................text1
  {
    /* ��layout�ĳ�main.xml */ 
    setContentView(R.layout.text1);
    /* ��findViewById()ȡ��Button���󣬲�����onClickListener */ 
    ImageView b1 = (ImageView) findViewById(R.id.button2); 
    b1.setOnClickListener(new Button.OnClickListener() 
    { 
      public void onClick(View v) 
      {
        jumpToLayout5();
        } 
      });
    } 
  public void jumpToLayout5()                   //........................image2
  {
    /* ��layout�ĳ�main.xml */ 
    setContentView(R.layout.main1_02);
    miImageView=(ImageView)findViewById(R.id.image1);
    miImageView.setImageResource(R.drawable.i2);
    /* ��findViewById()ȡ��Button���󣬲�����onClickListener */ 
    ImageView b1 = (ImageView) findViewById(R.id.button1); 
    b1.setOnClickListener(new Button.OnClickListener() 
    { 
      public void onClick(View v) 
      {
        jumpToLayout6();
        } 
      });
    ImageView b3=(ImageView)findViewById(R.id.button2);
    b3.setOnClickListener(new Button.OnClickListener() 
    { 
      public void onClick(View v) 
      {
        jumpToLayout4();
        } 
      });
    } 
 
  public void jumpToLayout6()                   //........................text2
  {
    /* ��layout�ĳ�main.xml */ 
    setContentView(R.layout.text2);
    /* ��findViewById()ȡ��Button���󣬲�����onClickListener */ 
    ImageView b1 = (ImageView) findViewById(R.id.button2);  
    b1.setOnClickListener(new Button.OnClickListener() 
    { 
      public void onClick(View v) 
      {
        jumpToLayout7();
        }   
      });
    }
  public void jumpToLayout7()                   //........................image3
  {
    /* ��layout�ĳ�main.xml */ 
    setContentView(R.layout.main1_02);
    miImageView=(ImageView)findViewById(R.id.image1);
    miImageView.setImageResource(R.drawable.i3);
    /* ��findViewById()ȡ��Button���󣬲�����onClickListener */ 
    ImageView b1 = (ImageView) findViewById(R.id.button1); 
    b1.setOnClickListener(new Button.OnClickListener() 
    { 
      public void onClick(View v) 
      {
        jumpToLayout8();
        } 
      });
    ImageView b3=(ImageView)findViewById(R.id.button2);
    b3.setOnClickListener(new Button.OnClickListener() 
    { 
      public void onClick(View v) 
      {
        jumpToLayout6();
        } 
      });
    } 
  public void jumpToLayout8()                   //........................text3
  {
    /* ��layout�ĳ�main.xml */ 
    setContentView(R.layout.text3);
    /* ��findViewById()ȡ��Button���󣬲�����onClickListener */ 
    ImageView b1 = (ImageView) findViewById(R.id.button2); 
    b1.setOnClickListener(new Button.OnClickListener() 
    { 
      public void onClick(View v) 
      {
        jumpToLayout9();
        } 
      });
    } 
  public void jumpToLayout9()                   //........................image4
  {
    /* ��layout�ĳ�main.xml */ 
    setContentView(R.layout.main1_02);
    miImageView=(ImageView)findViewById(R.id.image1);
    miImageView.setImageResource(R.drawable.i4);
    /* ��findViewById()ȡ��Button���󣬲�����onClickListener */ 
    ImageView b1 = (ImageView) findViewById(R.id.button1); 
    b1.setOnClickListener(new Button.OnClickListener() 
    { 
      public void onClick(View v) 
      {
        jumpToLayout10();
        } 
      });
    ImageView b3=(ImageView)findViewById(R.id.button2);
    b3.setOnClickListener(new Button.OnClickListener() 
    { 
      public void onClick(View v) 
      {
        jumpToLayout8();
        } 
      });
    }
  public void jumpToLayout10()                   //........................text4
  {
    /* ��layout�ĳ�main.xml */ 
    setContentView(R.layout.text4);
    /* ��findViewById()ȡ��Button���󣬲�����onClickListener */ 
    ImageView b1 = (ImageView) findViewById(R.id.button2);  
    b1.setOnClickListener(new Button.OnClickListener() 
    { 
      public void onClick(View v) 
      {
        jumpToLayout11();
        } 
      });
    } 
  public void jumpToLayout11()                   //........................image5
  {
    /* ��layout�ĳ�main.xml */ 
    setContentView(R.layout.main1_02);
    miImageView=(ImageView)findViewById(R.id.image1);
    miImageView.setImageResource(R.drawable.i5);
    /* ��findViewById()ȡ��Button���󣬲�����onClickListener */ 
    ImageView b1 = (ImageView) findViewById(R.id.button1); 
    b1.setOnClickListener(new Button.OnClickListener() 
    { 
      public void onClick(View v) 
      {
        jumpToLayout12();
      } 
    });
    ImageView b3=(ImageView)findViewById(R.id.button2);
    b3.setOnClickListener(new Button.OnClickListener() 
    { 
      public void onClick(View v) 
      {
        jumpToLayout10();
        } 
      });
  } 
  public void jumpToLayout12()                   //........................text5
  {
    /* ��layout�ĳ�main.xml */ 
    setContentView(R.layout.text5);
    /* ��findViewById()ȡ��Button���󣬲�����onClickListener */ 
    ImageView b1 = (ImageView) findViewById(R.id.button2); 
    b1.setOnClickListener(new Button.OnClickListener() 
    { 
      public void onClick(View v) 
      {
        jumpToLayout13();
      } 
    });
  } 
  public void jumpToLayout13()                   //........................image6
  {
    /* ��layout�ĳ�main.xml */ 
    setContentView(R.layout.main1_02);
    miImageView=(ImageView)findViewById(R.id.image1);
    miImageView.setImageResource(R.drawable.i6);
    /* ��findViewById()ȡ��Button���󣬲�����onClickListener */ 
    ImageView b1 = (ImageView) findViewById(R.id.button1); 
    b1.setOnClickListener(new Button.OnClickListener() 
    { 
      public void onClick(View v) 
      {
        jumpToLayout14();
      } 
    });
    ImageView b3=(ImageView)findViewById(R.id.button2);
    b3.setOnClickListener(new Button.OnClickListener() 
    { 
      public void onClick(View v) 
      {
        jumpToLayout12();
        } 
      });
  } 
  public void jumpToLayout14()                   //........................text6
  {
    /* ��layout�ĳ�main.xml */ 
    setContentView(R.layout.text6);
    /* ��findViewById()ȡ��Button���󣬲�����onClickListener */ 
    ImageView b1 = (ImageView) findViewById(R.id.button2); 
    b1.setOnClickListener(new Button.OnClickListener() 
    { 
      public void onClick(View v) 
      {
        jumpToLayout15();
      } 
    });
  } 
  public void jumpToLayout15()                   //........................image7
  {
    /* ��layout�ĳ�main.xml */ 
    setContentView(R.layout.main1_02);
    miImageView=(ImageView)findViewById(R.id.image1);
    miImageView.setImageResource(R.drawable.i7);
    /* ��findViewById()ȡ��Button���󣬲�����onClickListener */ 
    ImageView b1 = (ImageView) findViewById(R.id.button1); 
    b1.setOnClickListener(new Button.OnClickListener() 
    { 
      public void onClick(View v) 
      {
        jumpToLayout16();
      } 
    });
    ImageView b3=(ImageView)findViewById(R.id.button2);
    b3.setOnClickListener(new Button.OnClickListener() 
    { 
      public void onClick(View v) 
      {
        jumpToLayout14();
        } 
      });
  } 
  public void jumpToLayout16()                   //........................text7
  {
    /* ��layout�ĳ�main.xml */ 
    setContentView(R.layout.text7);
    /* ��findViewById()ȡ��Button���󣬲�����onClickListener */ 
    ImageView b1 = (ImageView) findViewById(R.id.button2); 
    b1.setOnClickListener(new Button.OnClickListener() 
    { 
      public void onClick(View v) 
      {
        jumpToLayout17();
      } 
    });
  } 
  public void jumpToLayout17()                   //........................image8
  {
    /* ��layout�ĳ�main.xml */ 
    setContentView(R.layout.main1_02);
    miImageView=(ImageView)findViewById(R.id.image1);
    miImageView.setImageResource(R.drawable.i8);
    /* ��findViewById()ȡ��Button���󣬲�����onClickListener */ 
    ImageView b1 = (ImageView) findViewById(R.id.button1); 
    b1.setOnClickListener(new Button.OnClickListener() 
    { 
      public void onClick(View v) 
      {
        jumpToLayout18();
      } 
    });
    ImageView b3=(ImageView)findViewById(R.id.button2);
    b3.setOnClickListener(new Button.OnClickListener() 
    { 
      public void onClick(View v) 
      {
        jumpToLayout16();
        } 
      });
  } 
  public void jumpToLayout18()                   //........................text8
  {
    /* ��layout�ĳ�main.xml */ 
    setContentView(R.layout.text8);
    /* ��findViewById()ȡ��Button���󣬲�����onClickListener */ 
    ImageView b1 = (ImageView) findViewById(R.id.button2); 
    b1.setOnClickListener(new Button.OnClickListener() 
    { 
      public void onClick(View v) 
      {
        jumpToLayout19();
      } 
    });
  } 
  public void jumpToLayout19()                   //........................image9
  {
    /* ��layout�ĳ�main.xml */ 
    setContentView(R.layout.main1_02);
    miImageView=(ImageView)findViewById(R.id.image1);
    miImageView.setImageResource(R.drawable.i9);
    /* ��findViewById()ȡ��Button���󣬲�����onClickListener */ 
    ImageView b1 = (ImageView) findViewById(R.id.button1); 
    b1.setOnClickListener(new Button.OnClickListener() 
    { 
      public void onClick(View v) 
      {
        jumpToLayout20();
      } 
    });
    ImageView b3=(ImageView)findViewById(R.id.button2);
    b3.setOnClickListener(new Button.OnClickListener() 
    { 
      public void onClick(View v) 
      {
        jumpToLayout18();
        } 
      });
  } 
  public void jumpToLayout20()                   //........................text9
  {
    /* ��layout�ĳ�main.xml */ 
    setContentView(R.layout.text9);
    /* ��findViewById()ȡ��Button���󣬲�����onClickListener */ 
    ImageView b1 = (ImageView) findViewById(R.id.button2); 
    b1.setOnClickListener(new Button.OnClickListener() 
    { 
      public void onClick(View v) 
      {
        jumpToLayout21();
      } 
    });
  } 
  public void jumpToLayout21()                   //........................image10
  {
    /* ��layout�ĳ�main.xml */ 
    setContentView(R.layout.main1_02);
    miImageView=(ImageView)findViewById(R.id.image1);
    miImageView.setImageResource(R.drawable.i10);
    /* ��findViewById()ȡ��Button���󣬲�����onClickListener */ 
    ImageView b1 = (ImageView) findViewById(R.id.button1); 
    b1.setOnClickListener(new Button.OnClickListener() 
    { 
      public void onClick(View v) 
      {
        jumpToLayout22();
      } 
    });
    ImageView b3=(ImageView)findViewById(R.id.button2);
    b3.setOnClickListener(new Button.OnClickListener() 
    { 
      public void onClick(View v) 
      {
        jumpToLayout20();
        } 
      });
  } 
  public void jumpToLayout22()                   //........................text10
  {
    /* ��layout�ĳ�main.xml */ 
    setContentView(R.layout.text10);
    /* ��findViewById()ȡ��Button���󣬲�����onClickListener */ 
    ImageView b1 = (ImageView) findViewById(R.id.button2);  
    b1.setOnClickListener(new Button.OnClickListener() 
    { 
      public void onClick(View v) 
      {
        jumpToLayout23();
      } 
    });
  } 
  public void jumpToLayout23()                   //........................image11
  {
    /* ��layout�ĳ�main.xml */ 
    setContentView(R.layout.main1_02);
    miImageView=(ImageView)findViewById(R.id.image1);
    miImageView.setImageResource(R.drawable.i11);
    /* ��findViewById()ȡ��Button���󣬲�����onClickListener */ 
    ImageView b1 = (ImageView) findViewById(R.id.button1); 
    b1.setOnClickListener(new Button.OnClickListener() 
    { 
      public void onClick(View v) 
      {
        jumpToLayout24();
      } 
    });
    ImageView b3=(ImageView)findViewById(R.id.button2);
    b3.setOnClickListener(new Button.OnClickListener() 
    { 
      public void onClick(View v) 
      {
        jumpToLayout22();
        } 
      });
  } 
  public void jumpToLayout24()                   //........................text11
  {
    /* ��layout�ĳ�main.xml */ 
    setContentView(R.layout.text11);
    /* ��findViewById()ȡ��Button���󣬲�����onClickListener */ 
    ImageView b1 = (ImageView) findViewById(R.id.button2);  
    b1.setOnClickListener(new Button.OnClickListener() 
    { 
      public void onClick(View v) 
      {
        jumpToLayout25();
      } 
    });
  } 
  public void jumpToLayout25()                   //........................image12
  {
    /* ��layout�ĳ�main.xml */ 
    setContentView(R.layout.main1_02);
    miImageView=(ImageView)findViewById(R.id.image1);
    miImageView.setImageResource(R.drawable.i12);
    /* ��findViewById()ȡ��Button���󣬲�����onClickListener */ 
    ImageView b1 = (ImageView) findViewById(R.id.button1); 
    b1.setOnClickListener(new Button.OnClickListener() 
    { 
      public void onClick(View v) 
      {
        jumpToLayout26();
      } 
    });
    ImageView b3=(ImageView)findViewById(R.id.button2);
    b3.setOnClickListener(new Button.OnClickListener() 
    { 
      public void onClick(View v) 
      {
        jumpToLayout24();
        } 
      });
  } 
  public void jumpToLayout26()                   //........................text12
  {
    /* ��layout�ĳ�main.xml */ 
    setContentView(R.layout.text12);
    /* ��findViewById()ȡ��Button���󣬲�����onClickListener */ 
    ImageView b1 = (ImageView) findViewById(R.id.button2); 
    b1.setOnClickListener(new Button.OnClickListener() 
    { 
      public void onClick(View v) 
      {
        jumpToLayout27();
      } 
    });
  } 
  public void jumpToLayout27()                   //........................image13
  {
    /* ��layout�ĳ�main.xml */ 
    setContentView(R.layout.main1_02);
    miImageView=(ImageView)findViewById(R.id.image1);
    miImageView.setImageResource(R.drawable.i13);
    /* ��findViewById()ȡ��Button���󣬲�����onClickListener */ 
    ImageView b1 = (ImageView) findViewById(R.id.button1); 
    b1.setOnClickListener(new Button.OnClickListener() 
    { 
      public void onClick(View v) 
      {
        jumpToLayout28();
      } 
    });
    ImageView b3=(ImageView)findViewById(R.id.button2);
    b3.setOnClickListener(new Button.OnClickListener() 
    { 
      public void onClick(View v) 
      {
        jumpToLayout26();
        } 
      });
  }
  public void jumpToLayout28()                   //........................text13
  {
    /* ��layout�ĳ�main.xml */ 
    setContentView(R.layout.text13);
    /* ��findViewById()ȡ��Button���󣬲�����onClickListener */ 
    ImageView b1 = (ImageView) findViewById(R.id.button2);  
    b1.setOnClickListener(new Button.OnClickListener() 
    { 
      public void onClick(View v) 
      {
        jumpToLayout29();
      } 
    });
  }
  public void jumpToLayout29()                   //........................image14
  {
    /* ��layout�ĳ�main.xml */ 
    setContentView(R.layout.main1_02);
    miImageView=(ImageView)findViewById(R.id.image1);
    miImageView.setImageResource(R.drawable.i14);
    /* ��findViewById()ȡ��Button���󣬲�����onClickListener */ 
    ImageView b1 = (ImageView) findViewById(R.id.button1); 
    b1.setOnClickListener(new Button.OnClickListener() 
    { 
      public void onClick(View v) 
      {
        jumpToLayout30();
      } 
    });
    ImageView b3=(ImageView)findViewById(R.id.button2);
    b3.setOnClickListener(new Button.OnClickListener() 
    { 
      public void onClick(View v) 
      {
        jumpToLayout28();
        } 
      });
  }
  public void jumpToLayout30()                   //........................text14
  {
    /* ��layout�ĳ�main.xml */ 
    setContentView(R.layout.text14);
    /* ��findViewById()ȡ��Button���󣬲�����onClickListener */ 
    ImageView b1 = (ImageView) findViewById(R.id.button2);  
    b1.setOnClickListener(new Button.OnClickListener() 
    { 
      public void onClick(View v) 
      {
        jumpToLayout31();
      } 
    });
  } 
  public void jumpToLayout31()                   //........................image15
  {
    /* ��layout�ĳ�main.xml */ 
    setContentView(R.layout.main1_02);
    miImageView=(ImageView)findViewById(R.id.image1);
    miImageView.setImageResource(R.drawable.i15);
    /* ��findViewById()ȡ��Button���󣬲�����onClickListener */ 
    ImageView b1 = (ImageView) findViewById(R.id.button1); 
    b1.setOnClickListener(new Button.OnClickListener() 
    { 
      public void onClick(View v) 
      {
        jumpToLayout32();
      } 
    });
    ImageView b3=(ImageView)findViewById(R.id.button2);
    b3.setOnClickListener(new Button.OnClickListener() 
    { 
      public void onClick(View v) 
      {
        jumpToLayout30();
        } 
      });
  } 
  public void jumpToLayout32()                   //........................text15
  {
    /* ��layout�ĳ�main.xml */ 
    setContentView(R.layout.text15);
    /* ��findViewById()ȡ��Button���󣬲�����onClickListener */ 
    ImageView b1 = (ImageView) findViewById(R.id.button2); 
    b1.setOnClickListener(new Button.OnClickListener() 
    { 
      public void onClick(View v) 
      {
        jumpToLayout33();
      } 
    });
  } 
  public void jumpToLayout33()                   //........................image16
  {
    /* ��layout�ĳ�main.xml */ 
    setContentView(R.layout.main1_02);
    miImageView=(ImageView)findViewById(R.id.image1);
    miImageView.setImageResource(R.drawable.i16);
    /* ��findViewById()ȡ��Button���󣬲�����onClickListener */ 
    ImageView b1 = (ImageView) findViewById(R.id.button1); 
    b1.setOnClickListener(new Button.OnClickListener() 
    { 
      public void onClick(View v) 
      {
        jumpToLayout34();
      } 
    });
    ImageView b3=(ImageView)findViewById(R.id.button2);
    b3.setOnClickListener(new Button.OnClickListener() 
    { 
      public void onClick(View v) 
      {
        jumpToLayout32();
        } 
      });
  } 
  public void jumpToLayout34()                   //........................text16
  {
    /* ��layout�ĳ�main.xml */ 
    setContentView(R.layout.text16);
    /* ��findViewById()ȡ��Button���󣬲�����onClickListener */ 
    ImageView b1 = (ImageView) findViewById(R.id.button2); 
    b1.setOnClickListener(new Button.OnClickListener() 
    { 
      public void onClick(View v) 
      {
        jumpToLayout35();
      } 
    });
  } 
  public void jumpToLayout35()                   //........................image17
  {
    /* ��layout�ĳ�main.xml */ 
    setContentView(R.layout.main1_02);
    miImageView=(ImageView)findViewById(R.id.image1);
    miImageView.setImageResource(R.drawable.i17);
    /* ��findViewById()ȡ��Button���󣬲�����onClickListener */ 
    ImageView b1 = (ImageView) findViewById(R.id.button1); 
    b1.setOnClickListener(new Button.OnClickListener() 
    { 
      public void onClick(View v) 
      {
        jumpToLayout36();
      } 
    });
    ImageView b3=(ImageView)findViewById(R.id.button2);
    b3.setOnClickListener(new Button.OnClickListener() 
    { 
      public void onClick(View v) 
      {
        jumpToLayout34();
        } 
      });
  } 
  public void jumpToLayout36()                   //........................text17
  {
    /* ��layout�ĳ�main.xml */ 
    setContentView(R.layout.text17);
    /* ��findViewById()ȡ��Button���󣬲�����onClickListener */ 
    ImageView b1 = (ImageView) findViewById(R.id.button2); 
    b1.setOnClickListener(new Button.OnClickListener() 
    { 
      public void onClick(View v) 
      {
        jumpToLayout37();
      } 
    });
  } 
  public void jumpToLayout37()                   //........................image18
  {
    /* ��layout�ĳ�main.xml */ 
    setContentView(R.layout.main1_02);
    miImageView=(ImageView)findViewById(R.id.image1);
    miImageView.setImageResource(R.drawable.i18);
    /* ��findViewById()ȡ��Button���󣬲�����onClickListener */ 
    ImageView b1 = (ImageView) findViewById(R.id.button1); 
    b1.setOnClickListener(new Button.OnClickListener() 
    { 
      public void onClick(View v) 
      {
        jumpToLayout38();
      } 
    });
    ImageView b3=(ImageView)findViewById(R.id.button2);
    b3.setOnClickListener(new Button.OnClickListener() 
    { 
      public void onClick(View v) 
      {
        jumpToLayout36();
        } 
      });
  } 
  public void jumpToLayout38()                   //........................text18
  {
    /* ��layout�ĳ�main.xml */ 
    setContentView(R.layout.text18);
    /* ��findViewById()ȡ��Button���󣬲�����onClickListener */ 
    ImageView b1 = (ImageView) findViewById(R.id.button2); 
    b1.setOnClickListener(new Button.OnClickListener() 
    { 
      public void onClick(View v) 
      {
        jumpToLayout39();
      } 
    });
  } 
  public void jumpToLayout39()                   //........................image19
  {
    /* ��layout�ĳ�main.xml */ 
    setContentView(R.layout.main1_02);
    miImageView=(ImageView)findViewById(R.id.image1);
    miImageView.setImageResource(R.drawable.i19);
    /* ��findViewById()ȡ��Button���󣬲�����onClickListener */ 
    ImageView b1 = (ImageView) findViewById(R.id.button1); 
    b1.setOnClickListener(new Button.OnClickListener() 
    { 
      public void onClick(View v) 
      {
        jumpToLayout40();
      } 
    });
    ImageView b3=(ImageView)findViewById(R.id.button2);
    b3.setOnClickListener(new Button.OnClickListener() 
    { 
      public void onClick(View v) 
      {
        jumpToLayout38();
        } 
      });
  } 
  public void jumpToLayout40()                   //........................text19
  {
    /* ��layout�ĳ�main.xml */ 
    setContentView(R.layout.text19);
    /* ��findViewById()ȡ��Button���󣬲�����onClickListener */ 
    ImageView b1 = (ImageView) findViewById(R.id.button2); 
    b1.setOnClickListener(new Button.OnClickListener() 
    { 
      public void onClick(View v) 
      {
        jumpToLayout41();
      } 
    });
  } 
  public void jumpToLayout41()                   //........................image20
  {
    /* ��layout�ĳ�main.xml */ 
    setContentView(R.layout.main1_02);
    miImageView=(ImageView)findViewById(R.id.image1);
    miImageView.setImageResource(R.drawable.i20);
    /* ��findViewById()ȡ��Button���󣬲�����onClickListener */ 
    ImageView b1 = (ImageView) findViewById(R.id.button1); 
    b1.setOnClickListener(new Button.OnClickListener() 
    { 
      public void onClick(View v) 
      {
        jumpToLayout42();
      } 
    });
    ImageView b3=(ImageView)findViewById(R.id.button2);
    b3.setOnClickListener(new Button.OnClickListener() 
    { 
      public void onClick(View v) 
      {
        jumpToLayout40();
        } 
      });
  } 
  public void jumpToLayout42()                   //........................text20
  {
    /* ��layout�ĳ�main.xml */ 
    setContentView(R.layout.text20);
    /* ��findViewById()ȡ��Button���󣬲�����onClickListener */ 
    ImageView b1 = (ImageView) findViewById(R.id.button2); 
    b1.setOnClickListener(new Button.OnClickListener() 
    { 
      public void onClick(View v) 
      {
        jumpToLayout43();
      } 
    });
  } 
  public void jumpToLayout43()                   //........................image21
  {
    /* ��layout�ĳ�main.xml */ 
    setContentView(R.layout.main1_02);
    miImageView=(ImageView)findViewById(R.id.image1);
    miImageView.setImageResource(R.drawable.i21);
    /* ��findViewById()ȡ��Button���󣬲�����onClickListener */ 
    ImageView b1 = (ImageView) findViewById(R.id.button1); 
    b1.setOnClickListener(new Button.OnClickListener() 
    { 
      public void onClick(View v) 
      {
        jumpToLayout44();
      } 
    });
    ImageView b3=(ImageView)findViewById(R.id.button2);
    b3.setOnClickListener(new Button.OnClickListener() 
    { 
      public void onClick(View v) 
      {
        jumpToLayout42();
        } 
      });
  } 
  public void jumpToLayout44()                   //........................text21
  {
    /* ��layout�ĳ�main.xml */ 
    setContentView(R.layout.text21);
    /* ��findViewById()ȡ��Button���󣬲�����onClickListener */ 
    ImageView b1 = (ImageView) findViewById(R.id.button2); 
    b1.setOnClickListener(new Button.OnClickListener() 
    { 
      public void onClick(View v) 
      {
        jumpToLayout1();
      } 
    });
  } 
  

  /* method jumpToLayout1����layout��mylayout.xml�л���main.xml */
  public void jumpToLayout1() 
  {
    /* ��layout�ĳ�main.xml */ 
    setContentView(R.layout.main1_02);
    /* ��findViewById()ȡ��Button���󣬲�����onClickListener */ 
    ImageView b1 = (ImageView) findViewById(R.id.button1); 
    b1.setOnClickListener(new Button.OnClickListener() 
    { 
      public void onClick(View v) 
      {
        jumpToLayout2();
        } 
      });
    ImageView b3=(ImageView)findViewById(R.id.button2);
    b3.setOnClickListener(new Button.OnClickListener() 
    { 
      public void onClick(View v) 
      {
        jumpToLayout44();
        } 
      });
  } 

} 
  