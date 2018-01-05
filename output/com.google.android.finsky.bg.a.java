package com.google.android.finsky.bg;

import android.content.Context;
import android.os.Build$VERSION;
import android.support.v4.view.a.a;
import android.support.v4.view.a.i;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import java.util.List;

public static class com.google.android.finsky.bg.a
{

    public static void a(Context p0, CharSequence p1, View p2, boolean p3) {
        if (com.google.android.finsky.bg.a.a(p0)) {
            if (p3 != 0 && Build$VERSION.SDK_INT >= 19)
                p2.setAccessibilityLiveRegion(1);
            else {
                if (Build$VERSION.SDK_INT >= 16)
                    v0 = 16384;
                else
                    v0 = 8;
                v1 = AccessibilityEvent.obtain(v0);
                v1.getText().add(p1);
                v1.setEnabled(1);
                if (p2 != 0)
                    android.support.v4.view.a.a.a(v1).a(p2);
                ((AccessibilityManager)p0.getSystemService("accessibility")).sendAccessibilityEvent(v1);
            }
        }
    }

    public static boolean a(Context p0) {
        return ((AccessibilityManager)p0.getSystemService("accessibility")).isTouchExplorationEnabled();
    }

}
