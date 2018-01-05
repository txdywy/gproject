package com.google.android.finsky.billing.profile;

import com.android.volley.C0657w;
import com.android.volley.VolleyError;
import com.google.android.finsky.p111d.C2474c;

final class ab implements C0657w {
    public final /* synthetic */ C2067x f10542a;

    ab(C2067x c2067x) {
        this.f10542a = c2067x;
    }

    public final void mo1062a(VolleyError volleyError) {
        C2067x c2067x = this.f10542a;
        C2474c a = new C2474c(308).m13230a(C2067x.m10829a());
        if (volleyError != null) {
            a.m13238a((Throwable) volleyError).m13239a(false);
        }
        c2067x.f10605e.m13367a(a);
    }
}
