package irdc.gallary;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;

import com.umeng.analytics.MobclickAgent;
import com.umeng.fb.FeedbackAgent;

/**
 * Created by zhaibingjie on 15-1-4.
 */
public class Intro extends Activity {

    public void onResume() {
        super.onResume();
        MobclickAgent.onResume(this);
    }
    public void onPause() {
        super.onPause();
        MobclickAgent.onPause(this);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.getWindow().setFlags (
             WindowManager.LayoutParams.FLAG_FULLSCREEN,
             WindowManager.LayoutParams.FLAG_FULLSCREEN
        );
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.intro);//你的建议
        
        EditText feedbackButton = (EditText) findViewById(R.id.intro_feedback);
        feedbackButton.setOnClickListener(new Button.OnClickListener() {

          @Override
          public void onClick(View v)
          {
            FeedbackAgent agent = new FeedbackAgent(Intro.this);
            agent.startFeedbackActivity();
          }
          
        });
    }
}
