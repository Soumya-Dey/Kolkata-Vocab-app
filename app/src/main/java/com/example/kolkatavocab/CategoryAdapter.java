package com.example.kolkatavocab;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Provides the appropriate {@link Fragment} for a view pager.
 */
public class CategoryAdapter extends FragmentPagerAdapter{
    private String [] tabTitles = {"See", "Eat", "Drink", "Shop", "Sleep"};

    public CategoryAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0)
            return new SeeFragment();
        else if (position == 1)
            return new EatFragment();
        else if (position == 2)
            return new DrinkFragment();
        else if (position == 3)
            return new ShopFragment();
        else
            return new SleepFragment();
    }

    @Override
    public int getCount() {
        return 5;
    }


    @Override
    public CharSequence getPageTitle(int position) {
        return tabTitles[position];
    }
}
