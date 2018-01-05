package com.google.android.finsky.cf;

import com.google.android.finsky.p108z.C4831h;
import com.google.android.finsky.scheduler.ba;
import com.google.android.finsky.scheduler.bb;
import com.google.android.finsky.scheduler.p238b.C4024b;
import p002a.C0002a;

public final class C2272b {
    public C0002a f11268a;

    public C2272b(C0002a c0002a) {
        this.f11268a = c0002a;
    }

    public final void m11730a() {
        ba a = ((bb) this.f11268a.mo1a()).m18890a(9);
        if (!a.m18889b(1)) {
            a.m18888a(1, "Send_Reconnection_Notification", C2273c.class, new C4024b().m18843b(600000).m18838a(1).m18842b(3).m18837a(), null).mo4398a(C4831h.f25111a);
        }
    }
}
