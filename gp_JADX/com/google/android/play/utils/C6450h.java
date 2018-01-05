package com.google.android.play.utils;

import android.annotation.TargetApi;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityNodeInfo;

public final class C6450h {
    @TargetApi(16)
    public static void m29501a(AccessibilityNodeInfo accessibilityNodeInfo, String str) {
        if (VERSION.SDK_INT >= 16 && !TextUtils.isEmpty(str)) {
            accessibilityNodeInfo.setClassName(str);
        }
    }
}
