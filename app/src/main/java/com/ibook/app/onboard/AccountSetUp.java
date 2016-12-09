package com.ibook.app.onboard;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;

import com.ibook.app.R;
import com.ibook.app.fragment.FragmentLogin;
import com.ibook.app.fragment.FragmentRegister;
import com.ibook.app.help.Base;

public class AccountSetUp extends Base {

    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    protected int getLayoutResourceId() {
        return R.layout.activity_account_set_up;
    }

    @Override
    protected void setUpWidget() {
        tabLayout = (TabLayout) findViewById(R.id.tabLayout);
        tabLayout.addTab(tabLayout.newTab().setText(getString(R.string.page_login)));
        tabLayout.addTab(tabLayout.newTab().setText(getString(R.string.page_register)));
        tabLayout.setTabGravity(TabLayout.GRAVITY_CENTER);

        viewPager = (ViewPager) findViewById(R.id.pager);
        final PagerAdapter adapter = new PagerAdapter(getSupportFragmentManager(), tabLayout.getTabCount());
        viewPager.setAdapter(adapter);
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(@Nullable TabLayout.Tab tab) {
                int position = tab.getPosition();
                viewPager.setCurrentItem(position);
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

    }

    @Override
    protected String setTitle() {
        return getString(R.string.page_title);
    }

    private class PagerAdapter extends FragmentPagerAdapter {
        int mNumOfTabs;

        private PagerAdapter(FragmentManager fm, int NumOfTabs) {
            super(fm);
            this.mNumOfTabs = NumOfTabs;
        }


        @Override
        public CharSequence getPageTitle(int position) {
            String title = getString(R.string.app_name);
            switch (position) {
                case 1:
                    title = getString(R.string.page_register);
                    break;
                case 0:
                    title = getString(R.string.page_login);
                    break;
                default:
                    break;
            }

            return title;
        }

        @Override
        public Fragment getItem(int position) {
            Fragment fragment = null;
            switch (position) {
                case 1:
                    fragment = new FragmentRegister();
                    break;
                case 0:
                    fragment = new FragmentLogin();
                    break;
                default:
                    break;
            }
            return fragment;

        }

        @Override
        public int getCount() {
            return mNumOfTabs;
        }
    }
}
