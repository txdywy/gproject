package com.google.android.finsky.hygiene.p139a;

import com.google.android.finsky.C1473m;
import com.google.android.finsky.aa.C0954a;
import com.google.android.finsky.ae.C1183b;
import com.google.android.finsky.ba.C1552e;
import com.google.android.finsky.deviceconfig.C2693e;
import com.google.android.finsky.hygiene.C3204n;
import com.google.android.finsky.hygiene.C3205o;
import com.google.android.finsky.providers.C3947d;
import com.google.android.finsky.scheduler.ah;
import com.google.android.finsky.scheduler.p238b.C4023a;
import com.google.android.finsky.scheduler.p238b.C4026d;
import com.google.android.finsky.scheduler.p238b.C4030h;
import com.google.android.finsky.utils.FinskyLog;

public final class C3189n extends ah {
    public C3179d f16483a;
    public C3186k f16484c;

    protected final boolean mo1168a(C4026d c4026d) {
        ((C1392c) C3947d.m18649a(C1392c.class)).mo1852a(this);
        int a = c4026d.m18859d().m18846a("reason", 0);
        C1183b c1183b = this.f16483a;
        c1183b.f16463i = this;
        c1183b.f16461g.m7132a(c1183b);
        if (C3176a.m16200b()) {
            this.f16483a.m16219b(a);
        } else {
            C3186k c3186k = this.f16484c;
            C4023a a2 = c4026d.m18856a();
            c3186k.f16479f = a;
            c3186k.f16480g = a2;
            C1552e dj = c3186k.f16475b.dj();
            boolean a3 = dj.mo2294a(12641815);
            if (a == 0) {
                FinskyLog.m21669e("Missing hygiene reason", new Object[0]);
            }
            if (a3) {
                FinskyLog.m21662b("Routine Hygiene: start hygiene core", new Object[0]);
                C3204n c3204n = new C3204n(c3186k.f16479f, c3186k, dj, null);
                C3204n.m16249a("beginOtaCleanup");
                if (c3204n.f16508d.mo2294a(12605261)) {
                    FinskyLog.m21665c("OTA cleanup disabled by kill-switch", new Object[0]);
                } else {
                    boolean a4 = C1473m.f7980a.cj().m14979a();
                    if (a4) {
                        C0954a.aI.m5765c();
                    }
                    if (C1473m.f7980a.cj().m14980b() || a4) {
                        FinskyLog.m21659a("Diff version or system, clear token & cache", new Object[0]);
                        C2693e.m14552a().mo3112a(C1473m.f7980a.ap());
                        C1473m.f7980a.bk().mo4380a(new C3205o(c3204n), "system_or_phonesky_version_changed");
                    }
                }
                c3204n.m16250a();
            } else {
                FinskyLog.m21662b("Routine Hygiene: run full legacy hygiene", new Object[0]);
                c3186k.f16477d.m16219b(c3186k.f16479f);
            }
        }
        return true;
    }

    protected final void m16233a(C4030h c4030h) {
        m5802b(c4030h);
        this.f16483a.f16463i = null;
    }

    protected final boolean k_(int i) {
        this.f16483a.f16463i = null;
        return true;
    }
}
