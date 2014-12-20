package irdc.gallary;

import java.util.Random;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import android.app.AlertDialog;
import android.content.DialogInterface;

public class CardArray3 extends BaseCardArray {
    private ImageView mImageButton1;
    private ImageView mImageButton2;
    private ImageView mImageButton3;
    private ImageView mImageButton4;

    int i_1 = 0;
    int i_2 = 0;
    int i_3 = 0;
    int i_4 = 0;
    Random r1 = new Random();
    int i1 = r1.nextInt(43);
    Random r2 = new Random();
    int i2 = r2.nextInt(43);
    Random r3 = new Random();
    int i3 = r3.nextInt(43);
    Random r4 = new Random();
    int i4 = r4.nextInt(43);

    @Override
    protected void initViews() {
        setContentView(R.layout.main2_03);

        mImageButton1 = (ImageView) findViewById(R.id.myImageButton1);
        mImageButton2 = (ImageView) findViewById(R.id.myImageButton2);
        mImageButton3 = (ImageView) findViewById(R.id.myImageButton3);
        mImageButton4 = (ImageView) findViewById(R.id.myImageButton4);
        hintTextView = (TextView) findViewById(R.id.myTextView1);
        hintTextView.setText("翻开第一张牌，它预示着你现在的身体状态。");
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mImageButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (i_1 == 0) {
                    seeYourCard(i1, mImageButton1);
                    i_1 = 1;
                } else {
                    meaningOfCard(i1, "然后，翻开第二张牌。它预示着你现在的心智状态。");
                    i_1 = 2;
                }
            }
        });


        mImageButton2.setOnClickListener(new OnClickListener() {

            public void onClick(View v) {
                // TODO Auto-generated method stub
                if (i_1 != 2) {
                    new AlertDialog.Builder(CardArray3.this).setTitle("").setMessage("提示：请先翻开第一张牌。")
                            .setPositiveButton("OK", null).show();
                } else if (i_2 == 0) {
                    seeYourCard(i2, mImageButton2);
                    i_2 = 1;
                } else {
                    meaningOfCard(i2, "然后，翻开第三张牌。它预示着你现在的情绪状态。");
                    i_2 = 2;
                }
            }
        });

        mImageButton3.setOnClickListener(new OnClickListener() {

            public void onClick(View v) {
                // TODO Auto-generated method stub
                if (i_1 != 2) {
                    new AlertDialog.Builder(CardArray3.this).setTitle("").setMessage("提示：请先翻开第一张牌。")
                            .setPositiveButton("OK",
                                    new DialogInterface.OnClickListener() {

                                        @Override
                                        public void onClick(DialogInterface dialog, int which) {
                                            // TODO Auto-generated method stub
                                        }
                                    }).show();
                } else if (i_2 != 2) {
                    new AlertDialog.Builder(CardArray3.this).setTitle("").setMessage("提示：请先翻开第二张牌。")
                            .setPositiveButton("OK",
                                    new DialogInterface.OnClickListener() {

                                        @Override
                                        public void onClick(DialogInterface dialog, int which) {
                                            // TODO Auto-generated method stub
                                        }
                                    }).show();
                } else if (i_3 == 0) {
                    seeYourCard(i3, mImageButton3);
                    i_3 = 1;
                } else {
                    meaningOfCard(i3, "然后，翻开第四张牌。它预示着你现在的情绪状态。");
                    i_3 = 2;
                }
            }
        });

        mImageButton4.setOnClickListener(new OnClickListener() {

            public void onClick(View v) {
                // TODO Auto-generated method stub
                if (i_1 != 2) {
                    new AlertDialog.Builder(CardArray3.this).setTitle("").setMessage("提示：请先翻开第一张牌。")
                            .setPositiveButton("OK", null).show();
                } else if (i_2 != 2) {
                    new AlertDialog.Builder(CardArray3.this).setTitle("").setMessage("提示：请先翻开第二张牌。")
                            .setPositiveButton("OK", null).show();
                } else if (i_3 != 2) {
                    new AlertDialog.Builder(CardArray3.this).setTitle("").setMessage("提示：请先翻开第三张牌。")
                            .setPositiveButton("OK", null).show();
                } else if (i_4 == 0) {
                    seeYourCard(i4, mImageButton3);
                    i_4 = 1;
                } else {
                    meaningOfCard(i4, "我亲爱的孩子啊，塔罗之神引领你心灵的方向。此时你是否已透过这扇窗户窥见自己的内心了呢？");
                    i_4 = 2;
                }
            }
        });
    }
}