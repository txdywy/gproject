package com.google.android.finsky.bg;

import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.view.View;

public final class ah {
    public static void m9227a(View view, Drawable drawable) {
        if (VERSION.SDK_INT < 16) {
            view.setBackgroundDrawable(drawable);
        } else {
            view.setBackground(drawable);
        }
    }
}
