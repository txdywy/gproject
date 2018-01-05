package com.google.android.finsky.bg;

import android.os.Build.VERSION;
import android.view.ViewGroup;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;

public abstract class C1060p implements OnGlobalLayoutListener {
    public ViewGroup f6695c;

    public C1060p(ViewGroup viewGroup) {
        this.f6695c = viewGroup;
        this.f6695c.getViewTreeObserver().addOnGlobalLayoutListener(this);
    }

    public final void m6486a() {
        if (VERSION.SDK_INT >= 16) {
            if (this.f6695c != null) {
                this.f6695c.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                this.f6695c = null;
            }
        } else if (this.f6695c != null) {
            this.f6695c.getViewTreeObserver().removeGlobalOnLayoutListener(this);
            this.f6695c = null;
        }
    }
}
