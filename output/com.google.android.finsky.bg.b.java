package com.google.android.finsky.bg;

import android.os.Build$VERSION;
import android.support.v4.view.a.b;
import android.support.v4.view.a.c;
import android.support.v4.view.b;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction;

public final class com.google.android.finsky.bg.b extends android.support.v4.view.b
{

    public final int a;
    public final String e;

    b(String p0) {
        android.support.v4.view.b();
        this.a = 16;
        this.e = p0;
    }

    public final void a(View p0, android.support.v4.view.a.b p1) {
        super.a(p0, p1);
        if (Build$VERSION.SDK_INT >= 21)
            p1.a.addAction((AccessibilityNodeInfo$AccessibilityAction)new android.support.v4.view.a.c(this.a, this.e).c);
    }

}
