package com.google.android.finsky.setup;

import com.google.android.finsky.billing.p120d.C1091e;
import com.google.android.finsky.billing.p120d.C1811c;
import com.google.android.finsky.cn.C2322b;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.bb;
import com.google.wireless.android.finsky.dfe.nano.ee;
import com.google.wireless.android.finsky.dfe.nano.ef;
import java.util.concurrent.atomic.AtomicInteger;

final class dh implements dp {
    public final /* synthetic */ VpaService f21066a;

    dh(VpaService vpaService) {
        this.f21066a = vpaService;
    }

    public final void mo3935a(String str, ee[] eeVarArr, ef[] efVarArr) {
        if (eeVarArr == null) {
            VpaService vpaService = this.f21066a;
            bb.m21791a();
            if (vpaService.f20719t == 0 && !vpaService.f20720u && VpaService.f20697b == 0) {
                vpaService.stopForeground(true);
                vpaService.m19149a(1);
                vpaService.stopSelf(vpaService.f20718s);
                return;
            }
            return;
        }
        AtomicInteger atomicInteger = new AtomicInteger();
        C1091e diVar = new di(atomicInteger);
        for (ee eeVar : eeVarArr) {
            C2322b a = this.f21066a.f20705f.mo2854a(eeVar.c.f11833b);
            if (a == null || a.f11419d <= 0 || a.f11424i) {
                FinskyLog.m21659a("Not acquiring preload as it is not installed: %s", r6);
            } else {
                FinskyLog.m21659a("Acquiring preload: %s", r6);
                this.f21066a.f20724y.mo2456a(new C1811c(this.f21066a.f20706g.cY(), eeVar, diVar));
            }
        }
        this.f21066a.f20724y.mo2457a(new dj(this, atomicInteger));
    }
}
