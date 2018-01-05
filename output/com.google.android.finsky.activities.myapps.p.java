package com.google.android.finsky.activities.myapps;

import android.view.ViewGroup;
import com.google.android.finsky.bg.p;
import com.google.android.finsky.pagesystem.f;

public final class com.google.android.finsky.activities.myapps.p extends com.google.android.finsky.bg.p
{

    public final com.google.android.finsky.activities.myapps.o a;

    p(com.google.android.finsky.activities.myapps.o p0, ViewGroup p1) {
        this.a = p0;
        com.google.android.finsky.bg.p(p1);
    }

    public final void onGlobalLayout() {
        if (this.a.v != 0) {
            this.a.v.j(1704);
            this.a.v = 0;
        }
        this.a();
    }

}
