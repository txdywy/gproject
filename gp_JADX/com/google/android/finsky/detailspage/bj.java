package com.google.android.finsky.detailspage;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.finsky.bg.C1060p;

final class bj extends C1060p {
    public final /* synthetic */ bh f14299a;

    bj(bh bhVar, ViewGroup viewGroup) {
        this.f14299a = bhVar;
        super(viewGroup);
    }

    public final void onGlobalLayout() {
        int i = 0;
        int height = this.f14299a.f14291b.getHeight();
        int childCount = this.f14299a.f14291b.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = this.f14299a.f14291b.getChildAt(i2);
            if (!bh.f14290a.contains(childAt.getClass())) {
                i += childAt.getHeight();
            }
        }
        if (i >= height) {
            this.f14299a.f14293d = true;
            m6486a();
        }
        this.f14299a.m13944b();
    }
}
