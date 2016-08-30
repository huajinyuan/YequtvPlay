package com.foru.yequtvplay.views;

import android.support.annotation.StringRes;

import com.foru.yequtvplay.activity.BaseActivity;

public class Snackbar {

    public static void show(BaseActivity context, CharSequence msg) {
        android.support.design.widget.Snackbar.make(context.getContentRoot(), msg, android.support.design.widget.Snackbar.LENGTH_LONG).show();
    }

    public static void show(BaseActivity context, @StringRes int stringId) {
        android.support.design.widget.Snackbar.make(context.getContentRoot(), stringId, android.support.design.widget.Snackbar.LENGTH_LONG).show();
    }

}
