package com.ibook.app.onboard;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.preference.PreferenceManager;

import com.chyrta.onboarder.OnboarderActivity;
import com.chyrta.onboarder.OnboarderPage;
import com.ibook.app.R;
import com.ibook.app.help.AppUtils;

import java.util.ArrayList;
import java.util.List;


public class OnBoard extends OnboarderActivity {
    private Context context;
    List<OnboarderPage> pages;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        context = this;
        pages = new ArrayList<>();

        // Create your first page
        OnboarderPage one = new OnboarderPage(getString(R.string.title_one), getString(R.string.message_one), R.drawable.ic_download);
        OnboarderPage two = new OnboarderPage(getString(R.string.title_two), getString(R.string.message_one), R.drawable.ic_exam);
        OnboarderPage three = new OnboarderPage(getString(R.string.title_three), getString(R.string.message_one), R.drawable.ic_teacher);

        // You can define title and description colors (by default_tone white)
        one.setTitleColor(R.color.colorWhite);
        two.setDescriptionColor(R.color.colorWhite);
        three.setDescriptionColor(R.color.colorWhite);


        // Don't forget to set background color for your page
        one.setBackgroundColor(R.color.colorWelcomeOne);
        two.setBackgroundColor(R.color.colorWelcomedTwo);
        three.setBackgroundColor(R.color.colorWelcomedThree);

        // Add your pages to the list
        pages.add(one);
        pages.add(two);
        pages.add(three);


        shouldDarkenButtonsLayout(true);
        setDividerColor(Color.WHITE);
        setDividerHeight(1);
        setSkipButtonTitle("Skip");
        setFinishButtonTitle("Jump In");


        setOnboardPagesReady(pages);

    }


    @Override
    public void onSkipButtonPressed() {
        super.onSkipButtonPressed();
        startMain();
    }


    @Override
    public void onFinishButtonPressed() {
        startMain();
    }

    private void startMain() {
        PreferenceManager.getDefaultSharedPreferences(context).edit().putBoolean("INSTALLED", true).apply();
        AppUtils.navigateUp(OnBoard.this);
    }


}