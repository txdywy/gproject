package com.google.android.finsky.setup.p242d.p244a;

import android.os.Bundle;
import com.google.android.finsky.installqueue.C1003o;
import com.google.android.finsky.installqueue.C3369m;
import com.google.android.finsky.setup.bq;
import com.google.android.finsky.utils.FinskyLog;

final class C4154k implements C1003o {
    public final /* synthetic */ C4147d f21008a;

    C4154k(C4147d c4147d) {
        this.f21008a = c4147d;
    }

    public final void mo1205a(C3369m c3369m) {
        if (this.f21008a.f20989f != null && c3369m.m16819a().equals(this.f21008a.f20989f.c.f11833b)) {
            FinskyLog.m21659a("EarlyUpdate %s: %s", c3369m.m16819a(), Integer.valueOf(c3369m.f17273c.f17153d));
            switch (c3369m.f17273c.f17153d) {
                case 0:
                case 1:
                case 11:
                    this.f21008a.m19430b(0, (Bundle) this.f21008a.f20987d.mo3197a(this.f21008a.f20989f));
                    return;
                case 2:
                    this.f21008a.m19432c();
                    return;
                case 3:
                    if (!bq.m19292a(c3369m.m16820b())) {
                        C4147d.m19425a(this.f21008a.f20989f);
                    }
                    this.f21008a.m19430b(1, (Bundle) this.f21008a.f20987d.mo3197a(this.f21008a.f20989f));
                    this.f21008a.m19432c();
                    return;
                case 4:
                    this.f21008a.m19430b(2, (Bundle) this.f21008a.f20987d.mo3197a(this.f21008a.f20989f));
                    return;
                case 5:
                    this.f21008a.m19430b(4, (Bundle) this.f21008a.f20987d.mo3197a(this.f21008a.f20989f));
                    C4147d.m19425a(this.f21008a.f20989f);
                    this.f21008a.m19432c();
                    return;
                case 6:
                    this.f21008a.m19430b(3, (Bundle) this.f21008a.f20987d.mo3197a(this.f21008a.f20989f));
                    this.f21008a.m19432c();
                    return;
                default:
                    FinskyLog.m21665c("EarlyUpdate %s: unexpected %d", c3369m.m16819a(), Integer.valueOf(c3369m.f17273c.f17153d));
                    this.f21008a.m19432c();
                    return;
            }
        }
    }
}
