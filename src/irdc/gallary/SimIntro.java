package irdc.gallary; 
/* import相关class */ 
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
    /* event的Action?断 */
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
    
    //按下键盘上返回按钮
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
    
  //隐藏状态栏，使imageview全屏显示
    this.getWindow().setFlags
    (
        WindowManager.LayoutParams.FLAG_FULLSCREEN,
        WindowManager.LayoutParams.FLAG_FULLSCREEN
    );
    //隐藏标题栏
    requestWindowFeature(Window.FEATURE_NO_TITLE);

    /* 加载main.xml Layout */

    /* 以findViewById()取得Button对象，并加入onClickListener */ 
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
  

  /* method jumpToLayout2：将layout由main.xml切换成mylayout.xml */ 
  public void jumpToLayout2()//............................................text0
  { 
    /* 将layout改成mylayout.xml */ 
    setContentView(R.layout.text0);
    /* 以findViewById()取得Button对象，并加入onClickListener */ 
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
    /* 将layout改成main.xml */ 
    setContentView(R.layout.main1_02);
    miImageView=(ImageView)findViewById(R.id.image1);
    miImageView.setImageDrawable(getResources().getDrawable(R.drawable.i1));
    /* 以findViewById()取得Button对象，并加入onClickListener */ 
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
    /* 将layout改成main.xml */ 
    setContentView(R.layout.text1);
    /* 以findViewById()取得Button对象，并加入onClickListener */ 
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
    /* 将layout改成main.xml */ 
    setContentView(R.layout.main1_02);
    miImageView=(ImageView)findViewById(R.id.image1);
    miImageView.setImageResource(R.drawable.i2);
    /* 以findViewById()取得Button对象，并加入onClickListener */ 
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
    /* 将layout改成main.xml */ 
    setContentView(R.layout.text2);
    /* 以findViewById()取得Button对象，并加入onClickListener */ 
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
    /* 将layout改成main.xml */ 
    setContentView(R.layout.main1_02);
    miImageView=(ImageView)findViewById(R.id.image1);
    miImageView.setImageResource(R.drawable.i3);
    /* 以findViewById()取得Button对象，并加入onClickListener */ 
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
    /* 将layout改成main.xml */ 
    setContentView(R.layout.text3);
    /* 以findViewById()取得Button对象，并加入onClickListener */ 
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
    /* 将layout改成main.xml */ 
    setContentView(R.layout.main1_02);
    miImageView=(ImageView)findViewById(R.id.image1);
    miImageView.setImageResource(R.drawable.i4);
    /* 以findViewById()取得Button对象，并加入onClickListener */ 
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
    /* 将layout改成main.xml */ 
    setContentView(R.layout.text4);
    /* 以findViewById()取得Button对象，并加入onClickListener */ 
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
    /* 将layout改成main.xml */ 
    setContentView(R.layout.main1_02);
    miImageView=(ImageView)findViewById(R.id.image1);
    miImageView.setImageResource(R.drawable.i5);
    /* 以findViewById()取得Button对象，并加入onClickListener */ 
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
    /* 将layout改成main.xml */ 
    setContentView(R.layout.text5);
    /* 以findViewById()取得Button对象，并加入onClickListener */ 
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
    /* 将layout改成main.xml */ 
    setContentView(R.layout.main1_02);
    miImageView=(ImageView)findViewById(R.id.image1);
    miImageView.setImageResource(R.drawable.i6);
    /* 以findViewById()取得Button对象，并加入onClickListener */ 
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
    /* 将layout改成main.xml */ 
    setContentView(R.layout.text6);
    /* 以findViewById()取得Button对象，并加入onClickListener */ 
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
    /* 将layout改成main.xml */ 
    setContentView(R.layout.main1_02);
    miImageView=(ImageView)findViewById(R.id.image1);
    miImageView.setImageResource(R.drawable.i7);
    /* 以findViewById()取得Button对象，并加入onClickListener */ 
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
    /* 将layout改成main.xml */ 
    setContentView(R.layout.text7);
    /* 以findViewById()取得Button对象，并加入onClickListener */ 
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
    /* 将layout改成main.xml */ 
    setContentView(R.layout.main1_02);
    miImageView=(ImageView)findViewById(R.id.image1);
    miImageView.setImageResource(R.drawable.i8);
    /* 以findViewById()取得Button对象，并加入onClickListener */ 
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
    /* 将layout改成main.xml */ 
    setContentView(R.layout.text8);
    /* 以findViewById()取得Button对象，并加入onClickListener */ 
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
    /* 将layout改成main.xml */ 
    setContentView(R.layout.main1_02);
    miImageView=(ImageView)findViewById(R.id.image1);
    miImageView.setImageResource(R.drawable.i9);
    /* 以findViewById()取得Button对象，并加入onClickListener */ 
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
    /* 将layout改成main.xml */ 
    setContentView(R.layout.text9);
    /* 以findViewById()取得Button对象，并加入onClickListener */ 
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
    /* 将layout改成main.xml */ 
    setContentView(R.layout.main1_02);
    miImageView=(ImageView)findViewById(R.id.image1);
    miImageView.setImageResource(R.drawable.i10);
    /* 以findViewById()取得Button对象，并加入onClickListener */ 
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
    /* 将layout改成main.xml */ 
    setContentView(R.layout.text10);
    /* 以findViewById()取得Button对象，并加入onClickListener */ 
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
    /* 将layout改成main.xml */ 
    setContentView(R.layout.main1_02);
    miImageView=(ImageView)findViewById(R.id.image1);
    miImageView.setImageResource(R.drawable.i11);
    /* 以findViewById()取得Button对象，并加入onClickListener */ 
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
    /* 将layout改成main.xml */ 
    setContentView(R.layout.text11);
    /* 以findViewById()取得Button对象，并加入onClickListener */ 
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
    /* 将layout改成main.xml */ 
    setContentView(R.layout.main1_02);
    miImageView=(ImageView)findViewById(R.id.image1);
    miImageView.setImageResource(R.drawable.i12);
    /* 以findViewById()取得Button对象，并加入onClickListener */ 
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
    /* 将layout改成main.xml */ 
    setContentView(R.layout.text12);
    /* 以findViewById()取得Button对象，并加入onClickListener */ 
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
    /* 将layout改成main.xml */ 
    setContentView(R.layout.main1_02);
    miImageView=(ImageView)findViewById(R.id.image1);
    miImageView.setImageResource(R.drawable.i13);
    /* 以findViewById()取得Button对象，并加入onClickListener */ 
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
    /* 将layout改成main.xml */ 
    setContentView(R.layout.text13);
    /* 以findViewById()取得Button对象，并加入onClickListener */ 
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
    /* 将layout改成main.xml */ 
    setContentView(R.layout.main1_02);
    miImageView=(ImageView)findViewById(R.id.image1);
    miImageView.setImageResource(R.drawable.i14);
    /* 以findViewById()取得Button对象，并加入onClickListener */ 
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
    /* 将layout改成main.xml */ 
    setContentView(R.layout.text14);
    /* 以findViewById()取得Button对象，并加入onClickListener */ 
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
    /* 将layout改成main.xml */ 
    setContentView(R.layout.main1_02);
    miImageView=(ImageView)findViewById(R.id.image1);
    miImageView.setImageResource(R.drawable.i15);
    /* 以findViewById()取得Button对象，并加入onClickListener */ 
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
    /* 将layout改成main.xml */ 
    setContentView(R.layout.text15);
    /* 以findViewById()取得Button对象，并加入onClickListener */ 
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
    /* 将layout改成main.xml */ 
    setContentView(R.layout.main1_02);
    miImageView=(ImageView)findViewById(R.id.image1);
    miImageView.setImageResource(R.drawable.i16);
    /* 以findViewById()取得Button对象，并加入onClickListener */ 
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
    /* 将layout改成main.xml */ 
    setContentView(R.layout.text16);
    /* 以findViewById()取得Button对象，并加入onClickListener */ 
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
    /* 将layout改成main.xml */ 
    setContentView(R.layout.main1_02);
    miImageView=(ImageView)findViewById(R.id.image1);
    miImageView.setImageResource(R.drawable.i17);
    /* 以findViewById()取得Button对象，并加入onClickListener */ 
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
    /* 将layout改成main.xml */ 
    setContentView(R.layout.text17);
    /* 以findViewById()取得Button对象，并加入onClickListener */ 
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
    /* 将layout改成main.xml */ 
    setContentView(R.layout.main1_02);
    miImageView=(ImageView)findViewById(R.id.image1);
    miImageView.setImageResource(R.drawable.i18);
    /* 以findViewById()取得Button对象，并加入onClickListener */ 
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
    /* 将layout改成main.xml */ 
    setContentView(R.layout.text18);
    /* 以findViewById()取得Button对象，并加入onClickListener */ 
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
    /* 将layout改成main.xml */ 
    setContentView(R.layout.main1_02);
    miImageView=(ImageView)findViewById(R.id.image1);
    miImageView.setImageResource(R.drawable.i19);
    /* 以findViewById()取得Button对象，并加入onClickListener */ 
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
    /* 将layout改成main.xml */ 
    setContentView(R.layout.text19);
    /* 以findViewById()取得Button对象，并加入onClickListener */ 
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
    /* 将layout改成main.xml */ 
    setContentView(R.layout.main1_02);
    miImageView=(ImageView)findViewById(R.id.image1);
    miImageView.setImageResource(R.drawable.i20);
    /* 以findViewById()取得Button对象，并加入onClickListener */ 
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
    /* 将layout改成main.xml */ 
    setContentView(R.layout.text20);
    /* 以findViewById()取得Button对象，并加入onClickListener */ 
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
    /* 将layout改成main.xml */ 
    setContentView(R.layout.main1_02);
    miImageView=(ImageView)findViewById(R.id.image1);
    miImageView.setImageResource(R.drawable.i21);
    /* 以findViewById()取得Button对象，并加入onClickListener */ 
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
    /* 将layout改成main.xml */ 
    setContentView(R.layout.text21);
    /* 以findViewById()取得Button对象，并加入onClickListener */ 
    ImageView b1 = (ImageView) findViewById(R.id.button2); 
    b1.setOnClickListener(new Button.OnClickListener() 
    { 
      public void onClick(View v) 
      {
        jumpToLayout1();
      } 
    });
  } 
  

  /* method jumpToLayout1：将layout由mylayout.xml切换成main.xml */
  public void jumpToLayout1() 
  {
    /* 将layout改成main.xml */ 
    setContentView(R.layout.main1_02);
    /* 以findViewById()取得Button对象，并加入onClickListener */ 
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
  