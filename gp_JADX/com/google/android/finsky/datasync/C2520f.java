package com.google.android.finsky.datasync;

import com.android.volley.C0660x;
import com.google.android.finsky.p111d.C2474c;
import com.google.android.finsky.scheduler.ah;
import com.google.android.finsky.utils.FinskyLog;

final class C2520f implements C0660x {
    public final /* synthetic */ C2514a f13544a;

    C2520f(C2514a c2514a) {
        this.f13544a = c2514a;
    }

    public final /* synthetic */ void b_(Object obj) {
        ah ahVar = this.f13544a;
        ahVar.f13508c = ahVar.f13508c;
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
