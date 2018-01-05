package com.google.android.finsky.installqueue.p141a;

import com.google.android.finsky.installqueue.C1003o;
import com.google.android.finsky.installqueue.C3369m;
import com.google.android.finsky.utils.FinskyLog;
import p002a.C0002a;

public final class C3335g implements C1003o {
    public final C0002a f17192a;

    public C3335g(C0002a c0002a) {
        this.f17192a = c0002a;
    }

    public final void mo1205a(C3369m c3369m) {
        C3342k c3342k = (C3342k) this.f17192a.mo1a();
        FinskyLog.m21662b("Got updated install status %s", c3369m);
        c3342k.m16775b().mo4403a(new C3354w(c3342k, c3369m)).mo4398a(new C3355x(c3342k, c3369m));
    }
}
