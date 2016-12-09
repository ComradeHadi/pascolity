package com.ibook.app.onboard;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.ibook.app.R;
import com.ibook.app.help.Base;
import com.ibook.app.main.Home;
import com.ibook.app.util.Mics;

import java.util.Timer;
import java.util.TimerTask;

import pl.bclogic.pulsator4droid.library.PulsatorLayout;

public class Splash extends Base {
    private TextView textViewVersion;
    private Timer timer = new Timer();
    private int DELAY = 2000;
    private Intent intent;
    private Context context;
    private PulsatorLayout pulsatorLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        pulsatorLayout.start();
        context = this;
        String name = "Version " + Mics.getVersionCode(context);
        textViewVersion.setText(name);

        intent = new Intent();

        timer.schedule(new TimerTask() {
            public void run() {
                intent.setClass(context, OnBoard.class);
                startActivity(intent);
                finish();
            }
        }, DELAY);

    }

    @Override
    protected int getLayoutResourceId() {
        return R.layout.activity_splash;
    }

    @Override
    protected void setUpWidget() {
        textViewVersion = (TextView) findViewById(R.id.textVersion);
        pulsatorLayout = (PulsatorLayout) findViewById(R.id.pulsator);

    }

    @Override
    protected String setTitle() {
        return getString(R.string.app_name);
    }
}
