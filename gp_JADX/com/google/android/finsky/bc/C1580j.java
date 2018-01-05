package com.google.android.finsky.bc;

import com.android.volley.C0657w;
import com.android.volley.VolleyError;
import com.google.android.finsky.p111d.C2474c;

final class C1580j implements C0657w {
    public final /* synthetic */ C1577g f8398a;

    C1580j(C1577g c1577g) {
        this.f8398a = c1577g;
    }

    public final void mo1062a(VolleyError volleyError) {
        C1577g c1577g = this.f8398a;
        C2474c c2474c = new C2474c(537);
        c2474c.m13243b(Integer.valueOf(1));
        if (volleyError != null) {
            c2474c.m13238a((Throwable) volleyError);
        }
        c1577g.f8391c.dc().m13319a(c2474c.f13342a, null);
        this.f8398a.mo1062a(volleyError);
    }
}
