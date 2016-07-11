package ps.exalt.bashar.arabbulletin.ui.activities;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import ps.exalt.bashar.arabbulletin.R;
import ps.exalt.bashar.arabbulletin.utilities.MyPageAdapter;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ViewPager viewPager = (ViewPager) findViewById(R.id.pager);
        viewPager.setAdapter(new MyPageAdapter(getSupportFragmentManager(), this));
    }
}
