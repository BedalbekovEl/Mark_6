package com.example.mark_6;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.widget.TextView;

import com.example.mark_6.fragment_one.Fragment_1;
import com.example.mark_6.fragment_three.Fragment_3;
import com.example.mark_6.fragment_two.Fragment_2;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
    TabLayout tabLayout;
    ViewPager viewPager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabLayout = findViewById(R.id.tab_layout);
        viewPager = findViewById(R.id.view_pager);

        setupViewPager(viewPager);
        tabLayout.setupWithViewPager(viewPager);

    }

    private void setupViewPager(ViewPager viewPager){
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment("TITLES", new Fragment_1());
        adapter.addFragment("NUMBERS", new Fragment_2());
        adapter.addFragment("IMAGES", new Fragment_3());
        viewPager.setAdapter(adapter);
    }


}