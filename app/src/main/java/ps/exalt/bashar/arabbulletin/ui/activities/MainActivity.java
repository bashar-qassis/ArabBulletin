package ps.exalt.bashar.arabbulletin.ui.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.crashlytics.android.Crashlytics;

import io.fabric.sdk.android.Fabric;
import ps.exalt.bashar.arabbulletin.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Fabric.with(this, new Crashlytics());
//        while(ApplicationClass.newsList==null){
//
//        }
        setContentView(R.layout.activity_main);
//        ViewPager viewPager = (ViewPager) findViewById(R.id.pager);
//        viewPager.setAdapter(new MyPageAdapter(getSupportFragmentManager(), this));
    }
}
