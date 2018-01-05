package com.google.android.finsky.setup;

import com.google.android.finsky.aa.C0954a;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.bb;
import java.util.concurrent.atomic.AtomicInteger;

final class dj implements Runnable {
    public final /* synthetic */ AtomicInteger f21068a;
    public final /* synthetic */ dh f21069b;

    dj(dh dhVar, AtomicInteger atomicInteger) {
        this.f21069b = dhVar;
        this.f21068a = atomicInteger;
    }

    public final void run() {
        if (this.f21068a.get() == 0) {
            FinskyLog.m21659a("Successfully acquired all preloads.", new Object[0]);
            C0954a.bc.m5765c();
            C0954a.bd.m5765c();
        } else {
            C0954a.bd.m5763a(Integer.valueOf(((Integer) C0954a.bd.m5760a()).intValue() + 1));
            FinskyLog.m21659a("Failed to acquire %d preloads. Used %d attempts.", Integer.valueOf(this.f21068a.get()), (Integer) C0954a.bd.m5760a());
        }
        VpaService vpaService = this.f21069b.f21066a;
        bb.m21791a();
        if (vpaService.f20719t == 0 && !vpaService.f20720u && VpaService.f20697b == 0) {
            vpaService.stopForeground(true);
            vpaService.m19149a(1);
            vpaService.stopSelf(vpaService.f20718s);
        }
    }
}
