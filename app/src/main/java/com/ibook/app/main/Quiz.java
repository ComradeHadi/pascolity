package com.ibook.app.main;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.ibook.app.R;
import com.ibook.app.help.AppUtils;
import com.ibook.app.help.Base;

import pl.bclogic.pulsator4droid.library.PulsatorLayout;

public class Quiz extends Base implements View.OnClickListener {
    private PulsatorLayout pulsatorLayout;
    private Button buttonAnswerOne;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        pulsatorLayout.start();
        buttonAnswerOne.setOnClickListener(this);

    }

    @Override
    protected int getLayoutResourceId() {
        return R.layout.activity_quiz;
    }

    @Override
    protected void setUpWidget() {
        pulsatorLayout = (PulsatorLayout) findViewById(R.id.pulsator);
        buttonAnswerOne = (Button) findViewById(R.id.buttonAnswerOne);

    }

    @Override
    protected String setTitle() {
        return getString(R.string.app_name);
    }

    @Override
    public void onClick(View view) {
        if (view == buttonAnswerOne) {
            AppUtils.navigateUpKeep(Quiz.this, SuccessError.class, null);
            finish();
        }
    }
}
