package com.ibook.app.util;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.support.compat.BuildConfig;

import com.ibook.app.R;

import java.util.Random;


public class Mics {


    public static String getVersionCode(Context context) {
        PackageInfo packageInfo = null;
        try {
            packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }

        if (packageInfo != null) {
            return packageInfo.versionName;
        } else {
            return BuildConfig.VERSION_NAME;
        }

    }


    public static String randColorHex(Context context) {
        String[] array = context.getResources().getStringArray(R.array.colors);
        return array[new Random().nextInt(array.length)];
    }

}
