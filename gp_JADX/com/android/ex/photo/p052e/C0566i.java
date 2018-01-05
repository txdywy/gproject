package com.android.ex.photo.p052e;

import android.os.Build.VERSION;
import android.view.accessibility.AccessibilityManager;

public final class C0566i {
    public static boolean m4104a(AccessibilityManager accessibilityManager) {
        if (VERSION.SDK_INT >= 14) {
            return accessibilityManager.isTouchExplorationEnabled();
        }
        return false;
    }
}
