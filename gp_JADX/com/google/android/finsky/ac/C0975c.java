package com.google.android.finsky.ac;

import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.p107l.C0974i;
import com.google.android.finsky.p107l.C3648c;
import com.google.android.finsky.providers.C3947d;
import com.google.android.finsky.scheduler.ah;
import com.google.android.finsky.scheduler.p238b.C4023a;
import com.google.android.finsky.scheduler.p238b.C4025c;
import com.google.android.finsky.scheduler.p238b.C4026d;
import com.google.android.finsky.scheduler.p238b.C4030h;
import com.google.android.finsky.utils.FinskyLog;

public class C0975c extends ah implements C0974i {
    public C3648c f5956a;
    public C4026d v_;

    public C0975c() {
        ((C0973b) C3947d.m18649a(C0973b.class)).mo1697a(this);
    }

    public final void mo1171a(boolean z) {
        if (z) {
            FinskyLog.m21659a("Installation state replication succeeded.", new Object[0]);
            m5802b(null);
            return;
        }
        FinskyLog.m21659a("Installation state replication failed.", new Object[0]);
        if (this.v_.m18858c() >= ((Integer) C0955b.jN.m28964b()).intValue()) {
            FinskyLog.m21659a("Giving up after %d failures.", Integer.valueOf(this.v_.m18858c()));
            m5802b(null);
            return;
        }
        long j;
        FinskyLog.m21659a("Scheduling replication attempt %d.", Integer.valueOf(this.v_.m18858c()));
        C4026d c4026d = this.v_;
        long longValue = ((Long) C0955b.jM.m28964b()).longValue();
        int c = c4026d.m18858c();
        C4023a a = c4026d.m18856a();
        C4025c d = c4026d.m18859d();
        if (c > 0) {
            j = longValue * ((long) (c + 1));
        } else {
            j = longValue;
        }
        j = Math.min(j, ((Long) C0955b.iZ.m28964b()).longValue());
        longValue = a.f20246a.f20155c;
        if (longValue >= j) {
            longValue = j;
        }
        m5802b(new C4030h(true, a.m18836a().m18839a(longValue).m18837a(), d));
    }

    protected final boolean mo1168a(C4026d c4026d) {
        FinskyLog.m21659a("ContentSyncJob started", new Object[0]);
        this.v_ = c4026d;
        this.f5956a.m17255a(new C0976d(this));
        return true;
    }

    protected final boolean k_(int i) {
        FinskyLog.m21659a("ContentSyncJob stopped", new Object[0]);
        return false;
    }
}
