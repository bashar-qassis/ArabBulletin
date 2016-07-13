package ps.exalt.bashar.arabbulletin.ui.activities;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.crashlytics.android.Crashlytics;

import java.util.ArrayList;

import io.fabric.sdk.android.Fabric;
import ps.exalt.bashar.arabbulletin.R;
import ps.exalt.bashar.arabbulletin.models.Item;
import ps.exalt.bashar.arabbulletin.models.Rss;
import ps.exalt.bashar.arabbulletin.newsservices.NewsResponse;
import ps.exalt.bashar.arabbulletin.utilities.MyPageAdapter;
import ps.exalt.bashar.arabbulletin.utilities.NewsServicesCallback;

public class MainActivity extends AppCompatActivity implements NewsServicesCallback {

    public static ArrayList<Item> newsList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Fabric.with(this, new Crashlytics());
        setContentView(R.layout.activity_main);
        NewsResponse.getRss(this);
    }


    @Override
    public void onFailure(Object error) {

    }

    @Override
    public void onSuccess(Rss rss) {
        newsList = rss.getChannel().getItem();
        Log.v("ArabBulletin: ", newsList.toString());
        ViewPager viewPager = (ViewPager) findViewById(R.id.pager);
        viewPager.setOffscreenPageLimit(50);
        MyPageAdapter adapterView = new MyPageAdapter(getSupportFragmentManager(), this);
        viewPager.setAdapter(adapterView);
    }
}
