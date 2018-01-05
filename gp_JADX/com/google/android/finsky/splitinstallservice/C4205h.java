package com.google.android.finsky.splitinstallservice;

import com.google.android.finsky.installqueue.C3369m;
import com.google.android.finsky.p108z.C4809e;
import com.google.android.finsky.splitinstallservice.p245a.C4196a;
import com.google.android.finsky.utils.FinskyLog;

final /* synthetic */ class C4205h implements Runnable {
    public final C4203f f21237a;
    public final C4809e f21238b;
    public final C3369m f21239c;

    C4205h(C4203f c4203f, C4809e c4809e, C3369m c3369m) {
        this.f21237a = c4203f;
        this.f21238b = c4809e;
        this.f21239c = c3369m;
    }

    public final void run() {
        C4203f c4203f = this.f21237a;
        C4809e c4809e = this.f21238b;
        C3369m c3369m = this.f21239c;
        try {
            C4196a c4196a = (C4196a) c4809e.get();
            if (c4196a == null) {
                FinskyLog.m21659a("No active session in storage.", new Object[0]);
                return;
            }
            c4196a = c4203f.m19582a(c4196a.f21138c, c4196a.f21137b, new C4206i(c3369m));
            if (c4196a != null) {
                C4203f.m19579a(c4203f.f21233d, c4196a);
            }
        } catch (Throwable e) {
            FinskyLog.m21663b(e, "Cannot read latest session.", new Object[0]);
        }
    }
}
