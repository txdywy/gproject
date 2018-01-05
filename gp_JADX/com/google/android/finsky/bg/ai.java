package com.google.android.finsky.bg;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

public final class ai {
    public static final Rect f8512a = new Rect();

    public static boolean m9229a(View view) {
        return view.getGlobalVisibleRect(f8512a);
    }

    public static boolean m9230b(View view) {
        return view.getGlobalVisibleRect(f8512a) && view.getHeight() == f8512a.height() && view.getWidth() == f8512a.width();
    }

    public static void m9228a(ViewGroup viewGroup, int i) {
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            if (viewGroup.getChildAt(i2).getVisibility() == 0) {
                viewGroup.setVisibility(0);
                return;
            }
        }
        viewGroup.setVisibility(i);
    }
}
