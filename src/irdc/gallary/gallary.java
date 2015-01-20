package irdc.gallary;

import android.app.Activity;
import android.os.Bundle;
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
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;

import com.umeng.analytics.MobclickAgent;

public class gallary extends Activity {
    public String preString;
    private ImageView b1;
    public static int Pos;

    public boolean onTouchEvent(MotionEvent event) {
        if (event.getPointerCount() > 1) {
            Intent intent = new Intent();
            intent.setClass(gallary.this, ChooseMain.class);
            startActivity(intent);
            ChooseMain.myMediaPlayer.stop();
            gallary.this.finish();
        }

        return super.onTouchEvent(event);
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            Intent intent = new Intent();
            intent.setClass(gallary.this, ChooseMain.class);
            startActivity(intent);
            ChooseMain.myMediaPlayer.stop();
            gallary.this.finish();
            return true;
        } else {
            return super.onKeyDown(keyCode, event);
        }
    }

    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.getWindow().setFlags
                (
                        WindowManager.LayoutParams.FLAG_FULLSCREEN,
                        WindowManager.LayoutParams.FLAG_FULLSCREEN
                );
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.main1_01);

        Toast toast = Toast.makeText(gallary.this, "多点触控屏幕以返回上一级", Toast.LENGTH_LONG);
        toast.setGravity(Gravity.TOP, 10, 10);
        toast.show();
        b1 = (ImageView) findViewById(R.id.button1);

        b1.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                b1.setImageResource(R.drawable.detail_down);
                Intent intent = new Intent();
                intent.setClass(gallary.this, SimIntro.class);
                startActivity(intent);
                gallary.this.finish();
            }
        });

        Gallery g = (Gallery) findViewById(R.id.myGallery1);
        g.setAdapter(new ImageAdapter(this));
        g.setOnItemClickListener(new OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
                Pos = position;
                switch (position) {
                    case 0:
                        preString="愚人";
                        break;
                    case 1:
                        preString="魔术师";
                        break;
                    case 2:
                        preString="女祭司";
                        break;
                    case 3:
                        preString="王后";
                        break;
                    case 4:
                        preString="国王";
                        break;
                    case 5:
                        preString="教皇";
                        break;
                    case 6:
                        preString="恋人";
                        break;
                    case 7:
                        preString="战车";
                        break;
                    case 8:
                        preString="力量";
                        break;
                    case 9:
                        preString="隐士";
                        break;
                    case 10:
                        preString="命运之轮";
                        break;
                    case 11:
                        preString="正义";
                        break;
                    case 12:
                        preString="倒吊者";
                        break;
                    case 13:
                        preString="死神";
                        break;
                    case 14:
                        preString="节制";
                        break;
                    case 15:
                        preString="恶魔";
                        break;
                    case 16:
                        preString="塔";
                        break;
                    case 17:
                        preString="星辰";
                        break;
                    case 18:
                        preString="月亮";
                        break;
                    case 19:
                        preString="太阳";
                        break;
                    case 20:
                        preString="审判";
                        break;
                    case 21:
                        preString="世界";
                        break;


                    default:
                        break;
                }
                Toast.makeText(gallary.this, preString, Toast.LENGTH_SHORT).show();
            }
        });
    }

    public class ImageAdapter extends BaseAdapter {
        private Context myContext;

        private int[] myImageIds =
                {R.drawable.i0,
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

        public ImageAdapter(Context c) {
            this.myContext = c;
        }

        public int getCount() {
            return this.myImageIds.length;
        }

        public Object getItem(int position) {
            return position;
        }

        public long getItemId(int position) {
            return position;
        }

        public View getView(int position, View convertView, ViewGroup parent) {
            ImageView i = new ImageView(this.myContext);
            i.setImageResource(this.myImageIds[position]);
            i.setScaleType(ImageView.ScaleType.FIT_XY);
            i.setLayoutParams(new Gallery.LayoutParams(271, 470));
            return i;
        }

        public float getScale(boolean focused, int offset) { /* Formula: 1 / (2 ^ offset) */
            return Math.max(0, 1.0f / (float) Math.pow(2, Math.abs(offset)) * 1.2f);
        }
    }

    public void onResume() {
        super.onResume();
        MobclickAgent.onResume(this);
    }
    public void onPause() {
        super.onPause();
        MobclickAgent.onPause(this);
    }
}