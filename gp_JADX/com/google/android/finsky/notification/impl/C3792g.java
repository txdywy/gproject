package com.google.android.finsky.notification.impl;

import com.google.android.finsky.scheduler.ba;
import com.google.android.finsky.scheduler.bb;
import com.google.android.finsky.scheduler.p238b.C4023a;
import com.google.android.finsky.scheduler.p238b.C4024b;

public final class C3792g {
    public ba f19068a;

    public C3792g(bb bbVar) {
        this.f19068a = bbVar.m18890a(7);
    }

    static C4023a m18143a(long j, long j2) {
        if (j > j2) {
            j = j2;
        }
        return new C4024b().m18839a(j).m18843b(j2).m18842b(3).m18837a();
    }

    public final void m18144a() {
        if (!this.f19068a.m18889b(1)) {
            this.f19068a.m18888a(1, "Notification_Redelivery", C3794i.class, C3792g.m18143a(0, 0), null).mo4398a(C3793h.f19069a);
        }
    }
}
