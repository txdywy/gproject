package com.google.android.finsky.billing.redeem;

import com.android.volley.C0657w;
import com.android.volley.VolleyError;
import com.google.android.finsky.billing.common.C1089s;
import com.google.android.finsky.p111d.C2474c;
import com.google.android.finsky.p111d.C2495w;

final class C2093g implements C0657w {
    public final C2495w f10661a;
    public final /* synthetic */ C2089c f10662b;

    public C2093g(C2089c c2089c, C2495w c2495w) {
        this.f10662b = c2089c;
        this.f10661a = c2495w;
    }

    public final void mo1062a(VolleyError volleyError) {
        C1089s c1089s = this.f10662b;
        C2495w c2495w = this.f10661a;
        c1089s.f10656e = volleyError;
        c2495w.m13367a(new C2474c(801).m13210a(-1).m13238a((Throwable) volleyError));
        c1089s.m6758b(3, 1);
    }
}
