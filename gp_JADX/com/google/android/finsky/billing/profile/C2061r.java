package com.google.android.finsky.billing.profile;

import com.android.volley.C0657w;
import com.android.volley.VolleyError;
import com.google.android.finsky.billing.common.C1089s;
import com.google.android.finsky.p111d.C2495w;

final class C2061r implements C0657w {
    public final C2495w f10583a;
    public final int f10584b;
    public final /* synthetic */ C2056m f10585c;

    public C2061r(C2056m c2056m, C2495w c2495w, int i) {
        this.f10585c = c2056m;
        this.f10583a = c2495w;
        this.f10584b = i;
    }

    public final void mo1062a(VolleyError volleyError) {
        C1089s c1089s = this.f10585c;
        C2495w c2495w = this.f10583a;
        int i = this.f10584b;
        c1089s.m10813a(1, (Throwable) volleyError, c2495w);
        c1089s.an = volleyError;
        c1089s.m6758b(i, 2);
    }
}
