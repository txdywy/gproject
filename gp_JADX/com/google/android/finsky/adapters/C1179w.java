package com.google.android.finsky.adapters;

import android.support.v7.widget.em;
import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.finsky.cv.p177a.iu;
import com.google.android.finsky.ratereview.C3973p;

final class C1179w implements OnClickListener {
    public final /* synthetic */ iu f7246a;
    public final /* synthetic */ int f7247b;
    public final /* synthetic */ C1180y f7248c;
    public final /* synthetic */ C3973p f7249d;
    public final /* synthetic */ C1177u f7250e;

    C1179w(C1177u c1177u, iu iuVar, int i, C1180y c1180y, C3973p c3973p) {
        this.f7250e = c1177u;
        this.f7246a = iuVar;
        this.f7247b = i;
        this.f7248c = c1180y;
        this.f7249d = c3973p;
    }

    public final void onClick(View view) {
        em emVar = this.f7250e;
        iu iuVar = this.f7246a;
        int i = this.f7247b;
        C1180y c1180y = this.f7248c;
        emVar.f7238l.m18693b(emVar.f7229c.f14885a.f12096c, iuVar.f12715c, this.f7249d);
        emVar.f7241o.add(i, c1180y);
        emVar.f3433a.m3635a(i, 1);
    }
}
