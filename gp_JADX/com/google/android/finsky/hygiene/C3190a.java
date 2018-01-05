package com.google.android.finsky.hygiene;

import com.google.android.finsky.C1473m;
import com.google.android.finsky.aa.C0954a;
import com.google.android.finsky.deviceconfig.C2693e;
import com.google.android.finsky.utils.FinskyLog;

final class C3190a implements Runnable {
    public final /* synthetic */ DailyHygiene f16485a;

    C3190a(DailyHygiene dailyHygiene) {
        this.f16485a = dailyHygiene;
    }

    public final void run() {
        C3204n c3204n = this.f16485a.f16445q;
        C3204n.m16249a("beginOtaCleanup");
        if (c3204n.f16508d.mo2294a(12605261)) {
            FinskyLog.m21665c("OTA cleanup disabled by kill-switch", new Object[0]);
        } else {
            boolean a = C1473m.f7980a.cj().m14979a();
            if (a) {
                C0954a.aI.m5765c();
            }
            if (C1473m.f7980a.cj().m14980b() || a) {
                FinskyLog.m21659a("Diff version or system, clear token & cache", new Object[0]);
                C2693e.m14552a().mo3112a(C1473m.f7980a.ap());
                C1473m.f7980a.bk().mo4380a(new C3205o(c3204n), "system_or_phonesky_version_changed");
                return;
            }
        }
        c3204n.m16250a();
    }
}
