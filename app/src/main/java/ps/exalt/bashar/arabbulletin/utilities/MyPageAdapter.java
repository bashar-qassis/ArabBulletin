package ps.exalt.bashar.arabbulletin.utilities;

import android.content.Context;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import ps.exalt.bashar.arabbulletin.fragments.FragmentViewPager;
import ps.exalt.bashar.arabbulletin.ui.activities.MainActivity;

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
        if (MainActivity.newsList == null)
            return null;
        if (pos < MainActivity.newsList.size()) {
            return FragmentViewPager.newInstance(MainActivity.newsList.get(pos));
        } else {
            return null;
        }
    }

    @Override
    public int getCount() {
        return 3;
    }

}
