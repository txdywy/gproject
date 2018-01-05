package com.google.android.finsky.billing.p130b;

import android.content.Context;
import com.google.android.finsky.billing.p151a.C1651d;
import com.google.android.finsky.billing.p151a.C1655h;
import com.google.android.finsky.cv.p177a.ax;
import com.google.android.finsky.utils.FinskyLog;
import com.google.wireless.android.finsky.dfe.c.a.l;

final class C1770j extends Thread {
    public final /* synthetic */ l f9168a;
    public final /* synthetic */ C1769i f9169b;

    C1770j(C1769i c1769i, l lVar) {
        this.f9169b = c1769i;
        this.f9168a = lVar;
    }

    public final void run() {
        if (this.f9169b.f9165x.d.f != 1 || this.f9169b.f9155n.b == null) {
            this.f9169b.f9141B.m9407a(this.f9169b.f9142a.mo1636c(), this.f9169b.f9144c);
            return;
        }
        C1655h c1655h = this.f9169b.f9141B;
        Context context = this.f9169b.getContext();
        String c = this.f9169b.f9142a.mo1636c();
        ax axVar = this.f9169b.f9155n.b.c;
        l lVar = this.f9168a;
        C1651d c1651d = this.f9169b.f9144c;
        if (c1655h.f8606b.mo2249j(c).mo2294a(12639865)) {
            c1655h.m9408b(c, c1651d);
            if (axVar == null) {
                FinskyLog.m21665c("Got null doc id. Skipping...", new Object[0]);
                return;
            }
            c1655h.f8605a.m9357a(c1655h.m9404a(context, c, axVar.f11833b, lVar), c1651d);
        }
    }
}
