package com.google.android.finsky;

import com.android.volley.VolleyError;
import com.google.android.finsky.DfeNotificationManagerImpl.SelfUpdateNotificationTaskService;
import com.google.android.finsky.api.C1254c;
import com.google.android.finsky.dc.C2556b;
import com.google.android.finsky.de.C2496e;
import com.google.android.finsky.p111d.C2474c;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.aj;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.gms.gcm.C5195a;
import com.google.android.gms.gcm.C5205l;
import com.google.wireless.android.a.a.a.a.t;
import com.google.wireless.android.finsky.dfe.nano.gb;

final class C3655l implements C2496e {
    public final /* synthetic */ C2556b f18070a;
    public final /* synthetic */ t f18071b;
    public final /* synthetic */ C2495w f18072c;
    public final /* synthetic */ C2474c f18073d;
    public final /* synthetic */ C1254c f18074e;
    public final /* synthetic */ C5205l f18075f;

    C3655l(C2556b c2556b, t tVar, C2495w c2495w, C2474c c2474c, C1254c c1254c, C5205l c5205l) {
        this.f18070a = c2556b;
        this.f18071b = tVar;
        this.f18072c = c2495w;
        this.f18073d = c2474c;
        this.f18074e = c1254c;
        this.f18075f = c5205l;
    }

    public final void mo2920a(gb gbVar) {
        int a = this.f18070a.mo2944a(gbVar);
        if (a > 0) {
            this.f18071b.a(a);
        }
        this.f18072c.m13367a(this.f18073d);
        if (this.f18070a.mo2948a(a, this.f18074e, C1473m.f7980a.dj(), this.f18072c)) {
            C5205l c5205l = this.f18075f;
            C5195a a2 = C5195a.m23967a(C1473m.f7980a.f7981b);
            if (c5205l.f26255a.getLong("delay_sec") < 3600) {
                a2.m23972a(SelfUpdateNotificationTaskService.m5698a(c5205l.f26255a.getLong("delay_sec", 60), c5205l.f26255a.getInt("version_code")));
                FinskyLog.m21659a("Retrying GCM-Triggered Self-Update", new Object[0]);
                return;
            }
            FinskyLog.m21665c("Retries for GCM-Triggered Self-Update exhausted. Not retrying.", new Object[0]);
        }
    }

    public final void mo2919a(VolleyError volleyError) {
        FinskyLog.m21665c("Self-update check failed with error: %s", volleyError);
        aj.m13208a(this.f18073d, volleyError, false);
        this.f18072c.m13367a(this.f18073d);
        C5205l c5205l = this.f18075f;
        C5195a a = C5195a.m23967a(C1473m.f7980a.f7981b);
        if (c5205l.f26255a.getLong("delay_sec") < 3600) {
            a.m23972a(SelfUpdateNotificationTaskService.m5698a(c5205l.f26255a.getLong("delay_sec", 60), c5205l.f26255a.getInt("version_code")));
            FinskyLog.m21659a("Retrying GCM-Triggered Self-Update", new Object[0]);
            return;
        }
        FinskyLog.m21665c("Retries for GCM-Triggered Self-Update exhausted. Not retrying.", new Object[0]);
    }
}
