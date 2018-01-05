package com.google.android.finsky.activities;

import android.view.ViewGroup;
import com.google.android.finsky.ba.c;
import com.google.android.finsky.ba.e;
import com.google.android.finsky.bg.p;
import com.google.android.finsky.d.al;
import com.google.android.finsky.d.t;
import com.google.android.finsky.pagesystem.f;
import com.google.android.finsky.pagesystem.g;

public final class com.google.android.finsky.activities.en extends com.google.android.finsky.bg.p
{

    public final boolean a;
    public final com.google.android.finsky.activities.ek b;

    en(com.google.android.finsky.activities.ek p0, ViewGroup p1, boolean p2) {
        this.b = p0;
        this.a = p2;
        com.google.android.finsky.bg.p(p1);
    }

    public final void onGlobalLayout() {
        if (this.b.N != 0)
            this.b.M.b(1734, this.b.L, 0, 1);
        if (this.a != 0) {
            if (this.b.f.dj().a(12636210))
                this.b.a(1704);
            else if (this.b.h.b())
                this.b.G.j(1704);
        }
        if (this.b.t != 0)
            this.b.t.B();
        super.a();
    }

}
