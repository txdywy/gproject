package com.google.android.finsky.uninstall;

import com.android.volley.C0657w;
import com.android.volley.VolleyError;
import com.google.android.finsky.p111d.C2474c;
import com.google.android.finsky.p111d.aj;

final /* synthetic */ class ah implements C0657w {
    public final ae f23478a;

    ah(ae aeVar) {
        this.f23478a = aeVar;
    }

    public final void mo1062a(VolleyError volleyError) {
        ae aeVar = this.f23478a;
        C2474c c2474c = new C2474c(164);
        aj.m13208a(c2474c, volleyError, false);
        aeVar.f23464p.m13371a(c2474c.f13342a, null);
        aeVar.m21273a(volleyError);
    }
}
