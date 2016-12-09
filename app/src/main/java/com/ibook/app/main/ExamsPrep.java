package com.ibook.app.main;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.ibook.app.R;
import com.ibook.app.help.AppUtils;
import com.ibook.app.help.Base;

import pl.bclogic.pulsator4droid.library.PulsatorLayout;

public class ExamsPrep extends Base implements View.OnClickListener {
    private PulsatorLayout pulsatorLayout;
    private Button buttonStart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        pulsatorLayout.start();

        buttonStart.setOnClickListener(this);

    }

    @Override
    protected int getLayoutResourceId() {
        return R.layout.activity_exams_prep;
    }

    @Override
    protected void setUpWidget() {
        pulsatorLayout = (PulsatorLayout) findViewById(R.id.pulsator);
        buttonStart = (Button) findViewById(R.id.buttonStart);

    }

    @Override
    protected String setTitle() {
        return getString(R.string.app_name);
    }

    @Override
    public void onClick(View view) {
        if (view == buttonStart) {
            AppUtils.navigateUpKeep(ExamsPrep.this, Quiz.class, null);
            finish();
        }

    }
}
