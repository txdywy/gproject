package com.google.android.finsky;

import com.android.volley.VolleyError;
import com.google.android.finsky.api.C1254c;
import com.google.android.finsky.dc.C2556b;
import com.google.android.finsky.de.C2496e;
import com.google.android.finsky.p111d.C2474c;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.aj;
import com.google.android.finsky.utils.FinskyLog;
import com.google.wireless.android.a.a.a.a.t;
import com.google.wireless.android.finsky.dfe.nano.gb;

final class C2497d implements C2496e {
    public final /* synthetic */ C2556b f13436a;
    public final /* synthetic */ t f13437b;
    public final /* synthetic */ C2495w f13438c;
    public final /* synthetic */ C2474c f13439d;
    public final /* synthetic */ C1254c f13440e;

    C2497d(C2556b c2556b, t tVar, C2495w c2495w, C2474c c2474c, C1254c c1254c) {
        this.f13436a = c2556b;
        this.f13437b = tVar;
        this.f13438c = c2495w;
        this.f13439d = c2474c;
        this.f13440e = c1254c;
    }

    public final void mo2920a(gb gbVar) {
        int a = this.f13436a.mo2944a(gbVar);
        if (a > 0) {
            this.f13437b.a(a);
        }
        this.f13438c.m13367a(this.f13439d);
        this.f13436a.mo2948a(a, this.f13440e, C1473m.f7980a.dj(), this.f13438c);
    }

    public final void mo2919a(VolleyError volleyError) {
        FinskyLog.m21665c("Self-update check failed with error: %s", volleyError);
        aj.m13208a(this.f13439d, volleyError, false);
        this.f13438c.m13367a(this.f13439d);
    }
}
