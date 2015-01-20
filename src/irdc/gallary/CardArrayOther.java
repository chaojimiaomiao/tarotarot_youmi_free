package irdc.gallary;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

import net.youmi.android.spot.SpotManager;

/**
 * Created by zhaibingjie on 15-1-4.
 */
public class CardArrayOther extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        this.getWindow().setFlags (
              WindowManager.LayoutParams.FLAG_FULLSCREEN,
              WindowManager.LayoutParams.FLAG_FULLSCREEN
        );
        //隐藏标题栏
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.layout);

        SpotManager.getInstance(CardArrayOther.this).setAnimationType(SpotManager.ANIM_ADVANCE);
        SpotManager.getInstance(CardArrayOther.this).showSpotAds(this);
    }
}
