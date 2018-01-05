package com.google.android.finsky.installqueue.p141a.p211b;

import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.bh.C1627b;
import com.google.android.finsky.bh.C1638i;
import com.google.android.finsky.scheduler.C3328c;
import com.google.android.finsky.scheduler.C3337d;
import com.google.android.finsky.utils.FinskyLog;

public final class C3329a implements C1638i, C3328c {
    public final C1627b f17185a;
    public C3337d f17186b;

    public C3329a(C1627b c1627b) {
        this.f17185a = c1627b;
    }

    public final void mo3471a(C3337d c3337d) {
        this.f17186b = c3337d;
        C1627b c1627b = this.f17185a;
        if (this == null) {
            FinskyLog.m21665c("Failed to add null listener", new Object[0]);
        } else {
            synchronized (c1627b.f8546d) {
                c1627b.f8546d.add(this);
            }
        }
        this.f17185a.m9310a(new C3330b(this));
    }

    public final void mo3470a() {
        this.f17186b = null;
        C1627b c1627b = this.f17185a;
        if (this == null) {
            FinskyLog.m21665c("Failed to remove null listener", new Object[0]);
            return;
        }
        synchronized (c1627b.f8546d) {
            c1627b.f8546d.remove(this);
        }
    }

    public final long mo3473b() {
        return ((Long) C0955b.dq.m28964b()).longValue();
    }

    public final void mo3472a(boolean z) {
        boolean z2 = true;
        if (this.f17186b != null) {
            FinskyLog.m21659a("Connection has changed %s", Boolean.valueOf(z));
            C3337d c3337d = this.f17186b;
            if (z) {
                z2 = false;
            }
            c3337d.mo3474a(this, z2);
        }
    }
}
