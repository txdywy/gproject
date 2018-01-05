package com.google.android.finsky.datasync;

import com.android.volley.C0657w;
import com.android.volley.VolleyError;
import com.google.android.finsky.p111d.C2474c;
import com.google.android.finsky.scheduler.ah;
import com.google.android.finsky.utils.FinskyLog;

final class C2521g implements C0657w {
    public final /* synthetic */ C2514a f13545a;

    C2521g(C2514a c2514a) {
        this.f13545a = c2514a;
    }

    public final void mo1062a(VolleyError volleyError) {
        ah ahVar = this.f13545a;
        ahVar.f13508c = true;
        ahVar.f13507a--;
        if (ahVar.f13507a == 0) {
            FinskyLog.m21659a("Fetch browse data complete", new Object[0]);
            C2474c c2474c = new C2474c(532);
            if (ahVar.f13508c) {
                c2474c.m13210a(1);
            }
            ahVar.f13511f.dc().m13319a(c2474c.f13342a, null);
            ahVar.m5802b(null);
        }
    }
}
