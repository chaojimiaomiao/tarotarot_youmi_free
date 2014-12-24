package irdc.gallary;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class CardArray2 extends BaseCardArray {
    private ImageView mImageButton1;
    private ImageView mImageButton2;
    private ImageView mImageButton3;

    @Override
    public void initGuides() {
      super.initGuides();
      guideStrings.add("翻开第一张牌，心中回忆着过去，它将告诉你你曾经的爱与你对那份爱的抉择。");
      guideStrings.add("然后，翻开第二张牌。心中想着现在。它将告诉你从这份爱中获得了什么");
      guideStrings.add("然后，翻开第三张牌。心中想着将来。它将告诉你从这份爱的未来。");
      guideStrings.add("亲爱的孩子，塔罗神指引你心灵的方向。我想现在你心中已经有对爱的答案了吧。");
    }
    
    @Override
    public void initViews() {
        setContentView(R.layout.main2_02);

        mImageButton1 = (ImageView) findViewById(R.id.myImageButton1);
        mImageButton2 = (ImageView) findViewById(R.id.myImageButton2);
        mImageButton3 = (ImageView) findViewById(R.id.myImageButton3);
        hintTextView = (TextView) findViewById(R.id.myTextView1);
        imageButtons.add(mImageButton1);
        imageButtons.add(mImageButton2);
        imageButtons.add(mImageButton3);
        super.initViews();
    }

    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }
}
