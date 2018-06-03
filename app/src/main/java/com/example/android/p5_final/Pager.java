package com.example.android.p5_final;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class Pager extends FragmentPagerAdapter {

    public Pager(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new Libraries();

            case 1:
                return new Restaurants();

            case 2:
                return new Entertainment();

            case 3:
                return new Shopping();
        }
        return null;
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0:
                return "Library";

            case 1:
                return "Restaurant";

            case 2:
                return "Entertainment";

            case 3:
                return "Shopping";
        }
        return super.getPageTitle(position);
    }
}
