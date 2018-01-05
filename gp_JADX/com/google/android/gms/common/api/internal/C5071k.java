package com.google.android.gms.common.api.internal;

import android.support.v4.p037h.C0308c;
import com.google.android.gms.common.ConnectionResult;

public class C5071k extends cp {
    public final C0308c f25872b = new C0308c();
    public ao f25873c;

    public C5071k(bg bgVar) {
        super(bgVar);
        this.a.mo4587a("ConnectionlessLifecycleHelper", (LifecycleCallback) this);
    }

    private final void m23600g() {
        if (!this.f25872b.isEmpty()) {
            this.f25873c.m23418a(this);
        }
    }

    protected final void mo4599a(ConnectionResult connectionResult, int i) {
        this.f25873c.m23422b(connectionResult, i);
    }

    public final void mo4596b() {
        super.mo4596b();
        m23600g();
    }

    public final void mo4605c() {
        super.mo4605c();
        m23600g();
    }

    public final void mo4598d() {
        super.mo4598d();
        ao aoVar = this.f25873c;
        synchronized (ao.f25699f) {
            if (aoVar.f25710n == this) {
                aoVar.f25710n = null;
                aoVar.f25711o.clear();
            }
        }
    }

    protected final void mo4601e() {
        this.f25873c.m23421b();
    }
}
