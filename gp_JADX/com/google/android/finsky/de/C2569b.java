package com.google.android.finsky.de;

import com.android.volley.C0660x;
import com.android.volley.ServerError;
import com.google.android.finsky.api.C1254c;
import com.google.android.finsky.deviceconfig.C2693e;
import com.google.android.finsky.utils.FinskyLog;
import com.google.wireless.android.finsky.dfe.nano.gb;

final /* synthetic */ class C2569b implements C0660x {
    public final C2568a f13687a;
    public final boolean f13688b;
    public final C2496e f13689c;
    public final C2693e f13690d;
    public final C1254c f13691e;

    C2569b(C2568a c2568a, boolean z, C2496e c2496e, C2693e c2693e, C1254c c1254c) {
        this.f13687a = c2568a;
        this.f13688b = z;
        this.f13689c = c2496e;
        this.f13690d = c2693e;
        this.f13691e = c1254c;
    }

    public final void b_(Object obj) {
        C2568a c2568a = this.f13687a;
        boolean z = this.f13688b;
        C2496e c2496e = this.f13689c;
        C2693e c2693e = this.f13690d;
        C1254c c1254c = this.f13691e;
        gb gbVar = (gb) obj;
        if (gbVar.b) {
            FinskyLog.m21659a("Server requests device config token", new Object[0]);
            c2693e.mo3112a(c1254c);
            if (z) {
                c2568a.m13573a(false, c1254c, c2693e, c2496e, true);
                return;
            }
            FinskyLog.m21665c("Failed to converge on device config for selfUpdate", new Object[0]);
            c2496e.mo2919a(new ServerError());
            return;
        }
        c2496e.mo2920a(gbVar);
    }
}
