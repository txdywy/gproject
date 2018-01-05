package com.google.android.finsky.bg;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

public static class com.google.android.finsky.bg.ai
{

    public static final Rect a;

    static {
        com.google.android.finsky.bg.ai.a = new Rect();
    }

    public static void a(ViewGroup p0, int p1) {
        v0 = 0;
        while (v0 < p0.getChildCount()) {
            if (p0.getChildAt(v0).getVisibility() == 0) {
                p0.setVisibility(0);
                return;
            }
            v0 = v0 + 1;
        }
        p0.setVisibility(p1);
    }

    public static boolean a(View p0) {
        return p0.getGlobalVisibleRect(com.google.android.finsky.bg.ai.a);
    }

    public static boolean b(View p0) {
        if (p0.getGlobalVisibleRect(com.google.android.finsky.bg.ai.a) && p0.getHeight() == com.google.android.finsky.bg.ai.a.height() && p0.getWidth() == com.google.android.finsky.bg.ai.a.width())
            v0 = 1;
        else
            v0 = 0;
        return v0;
    }

}
