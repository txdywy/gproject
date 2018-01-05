package com.google.android.finsky.bg;

import android.content.Context;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;

public static class com.google.android.finsky.bg.s
{

    public static void a(Context p0, View p1) {
        if (p1 != 0)
            ((InputMethodManager)p0.getSystemService("input_method")).hideSoftInputFromWindow(p1.getWindowToken(), 0);
    }

    public static void a(Context p0, EditText p1) {
        p1.requestFocus();
        p1.postDelayed(new com.google.android.finsky.bg.t((InputMethodManager)p0.getSystemService("input_method"), p1), 300);
    }

}
