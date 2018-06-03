package com.example.android.p5_final;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    static ArrayList<Resources> resourcesClassArray = new ArrayList<>();
    private Pager PagerAdapter;
    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resourcesClassArray.add(new Resources("Piatto", "Restaurant", R.drawable.res1));
        resourcesClassArray.add(new Resources("Lusin", "Restaurant", R.drawable.res2));
        resourcesClassArray.add(new Resources("Corniche", "Entertainment", R.drawable.enter2));
        resourcesClassArray.add(new Resources("Shallal", "Entertainment", R.drawable.enter4));
        resourcesClassArray.add(new Resources("King Fahad library", "Library", R.drawable.lib2));
        resourcesClassArray.add(new Resources("King Abdulaziz university library", "Library", R.drawable.lib1));
        resourcesClassArray.add(new Resources("Redsea mall", "Shopping", R.drawable.shop1));
        resourcesClassArray.add(new Resources("Arab mall", "Shopping", R.drawable.shop2));



        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        TabLayout tabLayout = findViewById(R.id.tabs);
        PagerAdapter = new Pager(getSupportFragmentManager());
        mViewPager = findViewById(R.id.container);
        mViewPager.setAdapter(PagerAdapter);

        mViewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.addOnTabSelectedListener(new TabLayout.ViewPagerOnTabSelectedListener(mViewPager));
    }
}
