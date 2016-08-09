package com.example.wingfly.reminder.adapter;


import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.wingfly.reminder.Fragments.AbstractFragment;
import com.example.wingfly.reminder.Fragments.HistoryFragment;
import com.example.wingfly.reminder.Fragments.IdeasFragment;
import com.example.wingfly.reminder.Fragments.TodoFragment;
import com.example.wingfly.reminder.R;

import java.util.HashMap;
import java.util.Map;

public class TabsFragmentAdapter extends FragmentPagerAdapter {

    private Map<Integer , AbstractFragment> tabs;
    private  Context context;

    public TabsFragmentAdapter(Context context, FragmentManager fm) {
        super(fm);
        this.context = context;
        initTabs(context);



    }

    @Override
    public Fragment getItem(int position) {


        return tabs.get(position);
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabs.get(position).getTitle();
    }

    @Override
    public int getCount() {
        return tabs.size();
    }

    private void initTabs(Context context) {
        tabs = new HashMap<>();
        tabs.put(0 , HistoryFragment.getInstance(context));
        tabs.put(1 , IdeasFragment.getInstance(context));
        tabs.put(2 , TodoFragment.getInstance(context));
        tabs.put(3 , IdeasFragment.getInstance(context));
    }
}
