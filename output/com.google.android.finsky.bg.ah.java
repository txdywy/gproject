package com.google.android.finsky.bg;

import android.graphics.drawable.Drawable;
import android.os.Build$VERSION;
import android.view.View;

public static class com.google.android.finsky.bg.ah
{

    public static void a(View p0, Drawable p1) {
        if (Build$VERSION.SDK_INT < 16)
            p0.setBackgroundDrawable(p1);
        else
            p0.setBackground(p1);
    }

}
