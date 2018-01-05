package com.google.android.finsky.bg;

import android.os.Build.VERSION;
import android.support.v4.view.C0132b;
import android.support.v4.view.p038a.C0333b;
import android.support.v4.view.p038a.C0334c;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction;

public final class C1602b extends C0132b {
    public final int f8513a = 16;
    public final String f8514e;

    public C1602b(String str) {
        this.f8514e = str;
    }

    public final void mo67a(View view, C0333b c0333b) {
        super.mo67a(view, c0333b);
        C0334c c0334c = new C0334c(this.f8513a, this.f8514e);
        if (VERSION.SDK_INT >= 21) {
            c0333b.f1829a.addAction((AccessibilityAction) c0334c.f1833c);
        }
    }
}
