package irdc.gallary;

import java.util.Random;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class CardArray1 extends BaseCardArray {
    private ImageView mImageButton1;

    //  private TextView
    int i_1 = 0;
    Random r1 = new Random();
    int i1 = r1.nextInt(43);

    protected void initViews() {
        setContentView(R.layout.main2_01);

        mImageButton1 = (ImageView) findViewById(R.id.myImageButton1);
        hintTextView = (TextView) findViewById(R.id.myTextView1);
    }

    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Bundle bundle = this.getIntent().getExtras();
        String question = bundle.getString("question");

        String str1 = "所以你的";
        String str2 = "谜底是：？\n 点击查看牌面。";
        hintTextView.setText(str1 + question + str2);

        mImageButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (i_1 == 0) {
                    seeYourCard(i1, mImageButton1);
                    i_1 = 1;
                } else {
                    meaningOfCard(i1, "天狼星的使者已给出你想要的答案了，而你所要做的就是直面自己的内心。\\n两指触控屏幕以返回上一级。");
                    i_1 = 0;
                }
            }
        });
    }
}