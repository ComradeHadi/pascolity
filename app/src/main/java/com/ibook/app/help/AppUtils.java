package com.ibook.app.help;

/**
 * Created by Monarchy on 01/12/2016.
 */

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.NavUtils;
import android.support.v4.app.TaskStackBuilder;
import android.support.v4.content.ContextCompat;

import com.afollestad.materialdialogs.DialogAction;
import com.afollestad.materialdialogs.MaterialDialog;
import com.ibook.app.R;

/**
 * Navigation utility class
 */

public class AppUtils {

    private AppUtils() {
    }

    /**
     * Navigate to the next activity
     *
     * @param activity the activity you are navigating from
     * @param extras   bundles to be passed to the other activity
     */
    public static void navigateUp(Activity activity, Bundle extras) {
        Intent upIntent = NavUtils.getParentActivityIntent(activity);
        if (upIntent != null) {
            if (extras != null) {
                upIntent.putExtras(extras);
            }
            if (NavUtils.shouldUpRecreateTask(activity, upIntent)) {
                TaskStackBuilder.create(activity)
                        .addNextIntentWithParentStack(upIntent)
                        .startActivities();
            } else {
                upIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                activity.startActivity(upIntent);
            }
        }
        activity.finish();
    }

    public static void navigateUpKeep(Activity activity, Class destination, Bundle extras) {
        Intent upIntent = new Intent(activity, destination);
        if (extras != null) {
            upIntent.putExtras(extras);
        }
        if (NavUtils.shouldUpRecreateTask(activity, upIntent)) {
            TaskStackBuilder.create(activity)
                    .addNextIntentWithParentStack(upIntent)
                    .startActivities();
        } else {
            upIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            activity.startActivity(upIntent);
        }
    }

    public static void navigateUp(Activity activity) {
        navigateUp(activity, null);
    }

    public static void startBrowser(Context context, String url) {
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        context.startActivity(i);
    }

    public static void showNotice(final Context context, String title, final String message, String action) {
        new MaterialDialog.Builder(context)
                .title(title)
                .content(message)
                .cancelable(true)
                .contentLineSpacing(1.2f)
                .positiveText(action)
                .buttonRippleColor(ContextCompat.getColor(context, R.color.colorPrimary))
                .negativeColor(ContextCompat.getColor(context, R.color.colorPrimary))
                .positiveColor(ContextCompat.getColor(context, R.color.colorPrimary))
                .onPositive(new MaterialDialog.SingleButtonCallback() {
                    @Override
                    public void onClick(@NonNull MaterialDialog dialog, @NonNull DialogAction which) {
                        dialog.dismiss();
                    }
                })
                .show();
    }
}