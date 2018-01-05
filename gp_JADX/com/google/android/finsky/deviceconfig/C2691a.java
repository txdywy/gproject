package com.google.android.finsky.deviceconfig;

import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.api.C1254c;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.hygiene.C0971t;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.providers.C3947d;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.bb;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class C2691a extends C0971t {
    public CountDownLatch f14827a;
    public C1461c f14828c;

    protected final void mo1167a() {
        super.mo1167a();
        ((C1376c) C3947d.m18649a(C1376c.class)).mo1812a(this);
    }

    protected final void mo1170a(C1254c c1254c, C2495w c2495w) {
        if (this.f14828c.dj().mo2294a(12646337) || c1254c == null) {
            FinskyLog.m21662b("Account sync disabled", new Object[0]);
            return;
        }
        bb.m21793b();
        C2693e a = C2693e.m14552a();
        this.f14827a = new CountDownLatch(1);
        a.m14561a(c1254c, new C2692b(this));
        try {
            if (!this.f14827a.await(((Long) C0955b.dg.m28964b()).longValue(), TimeUnit.SECONDS)) {
                FinskyLog.m21665c("Account sync timed out.", new Object[0]);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            FinskyLog.m21669e("Thread was interrupted.", new Object[0]);
        }
    }
}
