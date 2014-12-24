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
        imageButtons.add(mImageButton1);
        super.initViews();
    }
    
    @Override
    public void initGuides() {
      super.initGuides();

      Bundle bundle = this.getIntent().getExtras();
      String question = bundle.getString("question");
      String str1 = "所以你的";
      String str2 = "谜底是：？\n 点击查看牌面。";
      guideStrings.add(str1 + question + str2);
      guideStrings.add("天狼星的使者已给出你想要的答案了，而你所要做的就是直面自己的内心。\\n两指触控屏幕以返回上一级。");
    }

    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }
}