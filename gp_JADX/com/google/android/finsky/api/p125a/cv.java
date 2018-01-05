package com.google.android.finsky.api.p125a;

import com.android.volley.C0656n;
import com.android.volley.C0704v;
import com.google.android.finsky.utils.FinskyLog;

final class cv implements Runnable {
    public final /* synthetic */ C0656n f7509a;
    public final /* synthetic */ C0704v f7510b;
    public final /* synthetic */ cu f7511c;

    cv(cu cuVar, C0656n c0656n, C0704v c0704v) {
        this.f7511c = cuVar;
        this.f7509a = c0656n;
        this.f7510b = c0704v;
    }

    public final void run() {
        synchronized (this.f7509a) {
            if (!(this.f7509a.mo1539q() || this.f7509a.mo1073g())) {
                if ((((cp) this.f7509a).f7468H > 0 ? 1 : null) == null) {
                    FinskyLog.m21662b("Firm TTL timeout", new Object[0]);
                    this.f7509a.m4366a("firm-ttl-network-request-timeout");
                    ((cp) this.f7509a).m7355a(3);
                    this.f7510b.f4194d = true;
                    this.f7511c.f7507a.mo1082a(this.f7509a, this.f7510b, null);
                }
            }
            FinskyLog.m21662b("Firm TTL response received.", new Object[0]);
        }
    }
}
