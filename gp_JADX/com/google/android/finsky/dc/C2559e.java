package com.google.android.finsky.dc;

import com.android.volley.C0657w;
import com.android.volley.VolleyError;
import com.google.android.finsky.p111d.C2474c;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.aj;
import com.google.android.finsky.utils.FinskyLog;

final class C2559e implements C0657w {
    public final /* synthetic */ C2495w f13654a;
    public final /* synthetic */ C2557c f13655b;

    C2559e(C2557c c2557c, C2495w c2495w) {
        this.f13655b = c2557c;
        this.f13654a = c2495w;
    }

    public final void mo1062a(VolleyError volleyError) {
        this.f13655b.f13649f = null;
        FinskyLog.m21665c("SelfUpdate error - %s", volleyError);
        C2474c b = this.f13655b.m13549b(104);
        aj.m13208a(b, volleyError, false);
        this.f13654a.m13367a(b);
    }
}
