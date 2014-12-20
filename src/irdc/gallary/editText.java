package irdc.gallary;

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

public class editText extends Activity {
    public boolean onTouchEvent(MotionEvent event) {
        if (event.getPointerCount() > 1) {
            Intent intent = new Intent();
            intent.setClass(editText.this, Choose2.class);
            startActivity(intent);
            System.exit(0);
            editText.this.finish();
        }

        return super.onTouchEvent(event);
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {

        if (keyCode == KeyEvent.KEYCODE_BACK) {
            Intent intent = new Intent();
            intent.setClass(editText.this, Choose2.class);
            startActivity(intent);
            editText.this.finish();
            return true;
        } else {
            return super.onKeyDown(keyCode, event);
        }
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        this.getWindow().setFlags
                (
                        WindowManager.LayoutParams.FLAG_FULLSCREEN,
                        WindowManager.LayoutParams.FLAG_FULLSCREEN
                );
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main2_01_1);
        Button b1 = (Button) findViewById(R.id.button1);
        b1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText etEditText = (EditText) findViewById(R.id.question);
                final String question = etEditText.getText().toString();
                new AlertDialog.Builder(editText.this).setTitle("重要").setMessage("Are you sure?").setIcon(R.drawable.hot)
                        .setPositiveButton
                                (
                                        "确定",
                                        new DialogInterface.OnClickListener() {
                                            public void onClick(DialogInterface dialoginterface, int i) {
                                                Intent intent = new Intent();
                                                intent.setClass(editText.this, CardArray1.class);

                                                Bundle bundle = new Bundle();
                                                bundle.putString("question", question);

                                                intent.putExtras(bundle);
                                                startActivity(intent);
                                                editText.this.finish();
                                            }
                                        }
                                ).setNegativeButton("取消", new DialogInterface.OnClickListener() {

                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        // TODO Auto-generated method stub

                    }
                })
                        .show();
            }
        });
    }
}