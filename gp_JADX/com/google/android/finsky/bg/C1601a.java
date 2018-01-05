package com.google.android.finsky.bg;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build.VERSION;
import android.support.v4.view.p038a.C0332a;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;

public final class C1601a {
    public static boolean m9200a(Context context) {
        return ((AccessibilityManager) context.getSystemService("accessibility")).isTouchExplorationEnabled();
    }

    @TargetApi(16)
    public static void m9199a(Context context, CharSequence charSequence, View view, boolean z) {
        if (!C1601a.m9200a(context)) {
            return;
        }
        if (!z || VERSION.SDK_INT < 19) {
            int i;
            if (VERSION.SDK_INT >= 16) {
                i = 16384;
            } else {
                i = 8;
            }
            AccessibilityEvent obtain = AccessibilityEvent.obtain(i);
            obtain.getText().add(charSequence);
            obtain.setEnabled(true);
            if (view != null) {
                C0332a.m1762a(obtain).m1790a(view);
            }
            ((AccessibilityManager) context.getSystemService("accessibility")).sendAccessibilityEvent(obtain);
            return;
        }
        view.setAccessibilityLiveRegion(1);
    }
}
