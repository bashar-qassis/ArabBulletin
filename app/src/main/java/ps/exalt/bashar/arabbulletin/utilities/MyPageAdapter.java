package ps.exalt.bashar.arabbulletin.utilities;

import android.content.Context;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import ps.exalt.bashar.arabbulletin.ApplicationClass;
import ps.exalt.bashar.arabbulletin.fragments.FragmentViewPager;

/**
 * Created by Abdallah on 7/4/2016.
 */
public class MyPageAdapter extends FragmentPagerAdapter {
    private Context context;

    public MyPageAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.context = context;
    }

    @Override
    public android.support.v4.app.Fragment getItem(int pos) {
        if (pos < ApplicationClass.newsList.length)
        return FragmentViewPager.newInstance(ApplicationClass.newsList[pos]);
        else
            return null;
    }

    @Override
    public int getCount() {
        return 3;
    }

}
