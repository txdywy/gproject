package com.google.android.finsky.bg;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewParent;
import com.google.android.play.utils.j;

public final class ag {
    public static void m9225a(View view, Rect rect, int i, int i2) {
        int i3 = 0;
        int height = (i - view.getHeight()) / 2;
        int width = (i2 - view.getWidth()) / 2;
        view.getHitRect(rect);
        if (width > 0) {
            width = -width;
        } else {
            width = 0;
        }
        if (height > 0) {
            i3 = -height;
        }
        rect.inset(width, i3);
    }

    public static void m9226a(View view, Rect rect, Rect rect2, int i) {
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            if (view.getVisibility() != 0 || (view.getWidth() >= i && view.getHeight() >= i)) {
                rect.setEmpty();
                view2.setTouchDelegate(null);
                return;
            }
            m9225a(view, rect, i, i);
            if (!rect.equals(rect2)) {
                rect2.set(rect);
                view2.setTouchDelegate(new j(rect, view));
            }
        }
    }
}
