package com.google.android.finsky.bg;

import android.graphics.Rect;
import android.view.View;
import com.google.android.play.utils.j;

public static class com.google.android.finsky.bg.ag
{

    public static void a(View p0, Rect p1, int p2, int p3) {
        v0 = 0;
        v2 = (p2 - p0.getHeight()) / 2;
        v1 = p3 - p0.getWidth();
        p0.getHitRect(p1);
        if (v1 / 2 > 0)
            v1 = -(v1 / 2);
        else
            v1 = 0;
        if (v2 > 0)
            v0 = -v2;
        p1.inset(v1, v0);
    }

    public static void a(View p0, Rect p1, Rect p2, int p3) {
        v0 = p0.getParent();
        if (v0 instanceof View) {
            if (p0.getVisibility() != 0 || p0.getWidth() >= p3 && p0.getHeight() >= p3) {
                p1.setEmpty();
                ((View)v0).setTouchDelegate(0);
            }
            else {
                com.google.android.finsky.bg.ag.a(p0, p1, p3, p3);
                if (!p1.equals(p2)) {
                    p2.set(p1);
                    ((View)v0).setTouchDelegate(new com.google.android.play.utils.j(p1, p0));
                }
            }
        }
    }

}
