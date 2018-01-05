package com.android.ex.photo.e;

import android.os.Build$VERSION;
import android.view.accessibility.AccessibilityManager;

public static class com.android.ex.photo.e.i
{

    public static boolean a(AccessibilityManager p0) {
        if (Build$VERSION.SDK_INT >= 14)
            v0 = p0.isTouchExplorationEnabled();
        else
            v0 = 0;
        return v0;
    }

}
