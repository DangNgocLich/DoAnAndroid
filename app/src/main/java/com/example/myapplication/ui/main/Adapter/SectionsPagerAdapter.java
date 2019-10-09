package com.example.myapplication.ui.main.Adapter;

import android.content.Context;

import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.myapplication.R;

import java.util.ArrayList;

/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
public class SectionsPagerAdapter extends FragmentPagerAdapter {

    @StringRes
    private static final int[] TAB_TITLES = new int[]{R.string.tab_text_1, R.string.tab_text_2};
    private final Context mContext;
    private ArrayList<Fragment>  arrayFragemnt = new ArrayList<>();
    private ArrayList<String> arrraytitle = new ArrayList<>();
    public SectionsPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        // getItem is called to instantiate the fragment for the given page.
        // Return a PlaceholderFragment (defined as a static inner class below).
        return arrayFragemnt.get(position);
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return arrraytitle.get(position);
    }
    public void addFragment(Fragment fragment,String title){
         arrayFragemnt.add(fragment);
         arrraytitle.add(title);
    }

    @Override
    public int getCount() {
        return arrayFragemnt.size();
    }
}