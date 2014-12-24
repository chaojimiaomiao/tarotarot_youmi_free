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

    @Override
    public void initGuides() {
      super.initGuides();
      guideStrings.add("翻开第一张牌，它预示着你现在的身体状态。");
      guideStrings.add("然后，翻开第二张牌。它预示着你现在的心智状态。");
      guideStrings.add("然后，翻开第三张牌。它预示着你现在的情绪状态。");
      guideStrings.add("然后，翻开第四张牌。它预示着你现在的情绪状态。");
      guideStrings.add("我亲爱的孩子啊，塔罗之神引领你心灵的方向。此时你是否已透过这扇窗户窥见自己的内心了呢？");
    }
    
    @Override
    protected void initViews() {
        setContentView(R.layout.main2_03);

        mImageButton1 = (ImageView) findViewById(R.id.myImageButton1);
        mImageButton2 = (ImageView) findViewById(R.id.myImageButton2);
        mImageButton3 = (ImageView) findViewById(R.id.myImageButton3);
        mImageButton4 = (ImageView) findViewById(R.id.myImageButton4);
        hintTextView = (TextView) findViewById(R.id.myTextView1);
        imageButtons.add(mImageButton1);
        imageButtons.add(mImageButton2);
        imageButtons.add(mImageButton3);
        imageButtons.add(mImageButton4);
        super.initViews();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
}