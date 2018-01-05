package com.google.android.libraries.flowlayoutmanager;

import android.support.v4.p037h.C0321q;
import android.support.v4.p037h.C0322r;
import android.support.v7.widget.ew;
import android.util.Log;
import android.view.View;

final class C5926f {
    public static final C0321q f29523a = new C0322r(30);
    public int f29524b;
    public int f29525c;
    public float f29526d;
    public int f29527e;
    public int f29528f;
    public int f29529g;
    public int f29530h;
    public int f29531i;
    public int f29532j;
    public int f29533k;
    public int f29534l;
    public int f29535m;
    public int f29536n;
    public boolean f29537o;
    public int f29538p;

    C5926f() {
        m27492b();
    }

    public final void m27494a(View view, boolean z) {
        int c = ew.m2984c(view);
        int d = ew.m2986d(view);
        int baseline = view.getBaseline();
        if (baseline < 0 || baseline > view.getMeasuredHeight()) {
            baseline = d;
        } else {
            baseline += ew.m2991i(view);
        }
        if (z && !(c == this.f29534l && d == this.f29535m && baseline == this.f29536n)) {
            Log.w("FlowLayoutManager", "Child measurement changed without notifying from the adapter! Some layout may be incorrect.");
        }
        this.f29534l = c;
        this.f29535m = d;
        this.f29536n = baseline;
        this.f29537o = true;
    }

    public final void m27493a() {
        m27492b();
        f29523a.mo382a(this);
    }

    private final void m27492b() {
        this.f29534l = -1;
        this.f29535m = -1;
        this.f29527e = 0;
        this.f29528f = 0;
        this.f29529g = 0;
        this.f29530h = 0;
        this.f29531i = 0;
        this.f29532j = 0;
        this.f29536n = 0;
        this.f29533k = 0;
        this.f29524b = 0;
        this.f29525c = 0;
        this.f29526d = Float.NaN;
        this.f29538p = 0;
        this.f29537o = false;
    }
}
