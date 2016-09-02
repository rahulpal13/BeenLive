package com.amsyt.beenlive.BeenLive;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.amsyt.beenlive.Fragment.HomeFragment;
import com.amsyt.beenlive.R;

public class HomeActivity extends AppCompatActivity {

    private TabLayout.Tab home,profile,message,schedular;
    private TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        final ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);
        tabLayout = (TabLayout) findViewById(R.id.tabs);
        viewPager.setAdapter(new SampleFragmentPagerAdapter(getSupportFragmentManager()));

        tabLayout.setSelectedTabIndicatorColor(this.getResources().getColor(R.color.tab_indicator_color));
        tabLayout.setSelectedTabIndicatorHeight(5);

        setTabLayout();

        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {

             viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                switch (position){
                    case 0:
                        /*
                        setting Home as White and rest grey
                        and like wise for all other positions
                         */
                        setTabIcon();
                        break;
                    case 1:
                        setTabIcon();
                        break;
                    case 2:
                        setTabIcon();
                        break;
                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });


    }

    private void setTabLayout(){

        home = tabLayout.newTab();
        profile = tabLayout.newTab();
        message = tabLayout.newTab();
        schedular = tabLayout.newTab();

        home.setIcon(R.drawable.homeicon);
        profile.setIcon(R.drawable.profileicon);
        message.setIcon(R.drawable.messageicon);
        schedular.setIcon(R.drawable.scheduleicon);



        tabLayout.addTab(home, 0);
        tabLayout.addTab(profile, 1);
        tabLayout.addTab(message, 2);
        tabLayout.addTab(schedular, 3);

        tabLayout.setSelectedTabIndicatorColor(this.getResources().getColor(R.color.tab_indicator_color));
        tabLayout.setSelectedTabIndicatorHeight(5);
    }

    private void setTabIcon(){
        home.setIcon(R.drawable.homeicon);
        profile.setIcon(R.drawable.profileicon);
        message.setIcon(R.drawable.messageicon);
        schedular.setIcon(R.drawable.scheduleicon);
    }

    public class SampleFragmentPagerAdapter extends FragmentPagerAdapter {
        public SampleFragmentPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            return new HomeFragment();    // Which Fragment should be dislpayed by the viewpager for the given position
            // In my case we are showing up only one fragment in all the three tabs so we are
            // not worrying about the position and just returning the TabFragment
        }

        @Override
        public int getCount() {
            return 4;           // As there are only 3 Tabs
        }
    }

}
