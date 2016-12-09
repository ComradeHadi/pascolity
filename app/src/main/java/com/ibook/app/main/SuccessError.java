package com.ibook.app.main;

import android.os.Bundle;

import com.ibook.app.R;
import com.ibook.app.help.Base;

public class SuccessError extends Base {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }

    @Override
    protected int getLayoutResourceId() {
        return R.layout.activity_success_error;
    }

    @Override
    protected void setUpWidget() {

    }

    @Override
    protected String setTitle() {
        return getString(R.string.app_name);
    }
}
