package irdc.gallary;

/**
 * Created by zhaibingjie on 14-12-28.
 */
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * 按行业分有金融、地产、煤炭、有色金属、钢铁、化工等好多，按地域分有上海板块、深圳板块等，按概念分有迪斯尼、世博会、新源源、3G
 * 地区、行业、概念、证监会行业板块等一共四个分类
 */
public class CardArrayStock extends BaseCardArray {
    private ImageView mImageButton1, mImageButton2, mImageButton3;
    private EditText textView1, textView2, textView3;
    //private Button sureButton;

    @Override
    public void initGuides() {
        super.initGuides();
        guideStrings.add("在三张文字部分填入你今天想要预测的股票名称或者代码，塔罗之神将感应它们的发展。填完不得悔改");
        guideStrings.add("依次翻开它们");
        guideStrings.add("依次翻开它们");
        guideStrings.add("虔诚的股民，塔罗神的触角分析了大盘的趋势。你现在下定决心了吗？");
    }

    protected void initViews() {
        setContentView(R.layout.main2_stock);

//        sureButton = (Button) findViewById(R.id.button_sure);
        textView1 = (EditText) findViewById(R.id.textView);
        textView2 = (EditText) findViewById(R.id.textView2);
        textView3 = (EditText) findViewById(R.id.textView3);
        mImageButton1 = (ImageView) findViewById(R.id.myImageButton1);
        mImageButton2 = (ImageView) findViewById(R.id.myImageButton2);
        mImageButton3 = (ImageView) findViewById(R.id.myImageButton3);
        hintTextView = (TextView) findViewById(R.id.myTextView1);
        imageButtons.add(mImageButton1);
        imageButtons.add(mImageButton2);
        imageButtons.add(mImageButton3);
        super.initViews();

//        dismissAnimation();
//        sureButton.setOnClickListener(new Button.OnClickListener() {
//
//            @Override
//            public void onClick(View view) {
//                animation.start();
//            }
//        });
    }
//
//    Animation animation;
//    private void dismissAnimation() {
//        animation = new TranslateAnimation(0, 0, 0, 200);
//        Animation animation1 = new AlphaAnimation(1.0f, 0.0f);
//        animation1.setDuration(5000);
//        //Animation animation2 = animation1;
//        //Animation animation3 = animation1;
//        textView1.setAnimation(animation);
//        textView2.setAnimation(animation);
//        textView3.setAnimation(animation);
//    }

    protected void checkRistrict(ImageView tmpButton, int nowNum) {

    }

}
