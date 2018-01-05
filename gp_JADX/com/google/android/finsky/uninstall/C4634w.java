package com.google.android.finsky.uninstall;

import com.android.volley.C0657w;
import com.android.volley.VolleyError;
import com.google.android.finsky.p111d.C2474c;
import com.google.android.finsky.p111d.aj;

final /* synthetic */ class C4634w implements C0657w {
    public final C4605t f23847a;

    C4634w(C4605t c4605t) {
        this.f23847a = c4605t;
    }

    public final void mo1062a(VolleyError volleyError) {
        C4605t c4605t = this.f23847a;
        C2474c c2474c = new C2474c(164);
        aj.m13208a(c2474c, volleyError, false);
        c4605t.f23672q.m13371a(c2474c.f13342a, null);
        c4605t.m21414a(volleyError);
    }
}
