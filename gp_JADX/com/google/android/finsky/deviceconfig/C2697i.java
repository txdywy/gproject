package com.google.android.finsky.deviceconfig;

import com.android.volley.C0657w;
import com.android.volley.VolleyError;
import com.google.android.finsky.p111d.C2474c;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.p111d.aj;
import com.google.android.finsky.utils.FinskyLog;

final class C2697i implements C0657w {
    public final /* synthetic */ C2482j f14848a;
    public final /* synthetic */ C1050j f14849b;
    public final /* synthetic */ C2698k f14850c;
    public final /* synthetic */ C2693e f14851d;

    C2697i(C2693e c2693e, C2482j c2482j, C1050j c1050j, C2698k c2698k) {
        this.f14851d = c2693e;
        this.f14848a = c2482j;
        this.f14849b = c1050j;
        this.f14850c = c2698k;
    }

    public final void mo1062a(VolleyError volleyError) {
        C2474c c2474c = new C2474c(120);
        aj.m13208a(c2474c, volleyError, true);
        this.f14848a.m13319a(c2474c.f13342a, null);
        FinskyLog.m21667d("Couldn't upload device config", new Object[0]);
        if (this.f14849b != null) {
            this.f14849b.mo1307a(volleyError);
        }
        this.f14851d.m14564a(this.f14850c);
    }
}
