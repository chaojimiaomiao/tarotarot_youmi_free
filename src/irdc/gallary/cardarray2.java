package irdc.gallary;

import java.util.Random;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;

public class CardArray2 extends BaseCardArray {
    private ImageView mImageButton1;
    private ImageView mImageButton2;
    private ImageView mImageButton3;

    int i_1 = 0;
    int i_2 = 0;
    int i_3 = 0;
    Random r1 = new Random();
    int i1 = r1.nextInt(43);
    Random r2 = new Random();
    int i2 = r2.nextInt(43);
    Random r3 = new Random();
    int i3 = r3.nextInt(43);

    @Override
    protected void initViews() {
        setContentView(R.layout.main2_02);

        mImageButton1 = (ImageView) findViewById(R.id.myImageButton1);
        mImageButton2 = (ImageView) findViewById(R.id.myImageButton2);
        mImageButton3 = (ImageView) findViewById(R.id.myImageButton3);
        hintTextView = (TextView) findViewById(R.id.myTextView1);
        hintTextView.setText("翻开第一张牌，心中回忆着过去，它将告诉你你曾经的爱与你对那份爱的抉择。");
    }

    /**
     * Called when the activity is first created.
     */
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
                    meaningOfCard(i1, "然后，翻开第二张牌。心中想着现在。它将告诉你从这份爱中获得了什么");
                    i_1 = 2;
                }
            }
        });


        mImageButton2.setOnClickListener(new OnClickListener() {

            public void onClick(View v) {
                // TODO Auto-generated method stub
                if (i_1 != 2) {
                    new AlertDialog.Builder(CardArray2.this).setTitle("").setMessage("提示：请先翻开第一张牌。")
                            .setPositiveButton("OK", null).show();
                } else if (i_2 == 0) {
                    seeYourCard(i2, mImageButton2);
                    i_2 = 1;
                } else {
                    meaningOfCard(i2, "然后，翻开第三张牌。心中想着将来。它将告诉你从这份爱的未来。");
                    i_2 = 2;
                }
            }
        });

        mImageButton3.setOnClickListener(new OnClickListener() {

            public void onClick(View v) {
                // TODO Auto-generated method stub
                if (i_1 != 2) {
                    new AlertDialog.Builder(CardArray2.this).setTitle("").setMessage("提示：请先翻开第一张牌。")
                            .setPositiveButton("OK",
                                    new DialogInterface.OnClickListener() {

                                        @Override
                                        public void onClick(DialogInterface dialog, int which) {
                                            // TODO Auto-generated method stub
                                        }
                                    }).show();
                } else if (i_2 != 2) {
                    new AlertDialog.Builder(CardArray2.this).setTitle("").setMessage("提示：请先翻开第二张牌。")
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
                    meaningOfCard(i3, "亲爱的孩子，塔罗神指引你心灵的方向。我想现在你心中已经有对爱的答案了吧。");
                    i_3 = 2;
                }
            }
        });
    }
}
