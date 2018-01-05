package com.google.android.finsky.datasync;

import com.android.volley.VolleyError;
import com.google.android.finsky.api.C1254c;
import com.google.android.finsky.dp.C1096g;
import com.google.android.finsky.p111d.C2474c;
import com.google.android.finsky.scheduler.ah;
import com.google.android.finsky.utils.FinskyLog;
import com.google.wireless.android.finsky.dfe.nano.gp;

final class C2517c implements C1096g {
    public final /* synthetic */ C1254c f13540a;
    public final /* synthetic */ C2514a f13541b;

    C2517c(C2514a c2514a, C1254c c1254c) {
        this.f13541b = c2514a;
        this.f13540a = c1254c;
    }

    public final void mo1427a(gp gpVar) {
        this.f13541b.m13438a(gpVar.f31765h, this.f13540a);
    }

    public final void mo1426a(VolleyError volleyError) {
        ah ahVar = this.f13541b;
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
