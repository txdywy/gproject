package com.google.android.finsky.setup;

import com.google.android.finsky.aa.C0954a;
import com.google.android.finsky.setup.p242d.C4137g;
import com.google.android.finsky.utils.FinskyLog;

final class bi implements C4137g {
    public final /* synthetic */ RestoreServiceV2 f20867a;

    bi(RestoreServiceV2 restoreServiceV2) {
        this.f20867a = restoreServiceV2;
    }

    public final void mo3938a(String str) {
        this.f20867a.m19107e();
    }

    public final void mo3939a(String str, boolean z) {
        this.f20867a.m19107e();
        RestoreServiceV2 restoreServiceV2 = this.f20867a;
        String cZ = restoreServiceV2.f20609u.cZ();
        if (!restoreServiceV2.f20592d.get() && restoreServiceV2.m19105c()) {
            restoreServiceV2.f20592d.set(true);
            restoreServiceV2.f20614z.mo3960b(cZ, 2);
        }
        if (!restoreServiceV2.f20593e.get() && restoreServiceV2.m19106d()) {
            restoreServiceV2.f20593e.set(true);
            restoreServiceV2.f20614z.mo3960b(cZ, 1);
        }
        if (!restoreServiceV2.f20605q.mo3969b() && !restoreServiceV2.f20606r.mo3979a() && restoreServiceV2.f20598j <= 0) {
            if (restoreServiceV2.f20603o == null || restoreServiceV2.f20603o.booleanValue()) {
                restoreServiceV2.f20614z.mo3958b();
            }
            restoreServiceV2.f20603o = null;
            FinskyLog.m21659a("Restore complete with %d success and %d failed.", C0954a.bh.m5760a(), C0954a.bi.m5760a());
            C0954a.bh.m5763a(Integer.valueOf(0));
            C0954a.bi.m5763a(Integer.valueOf(0));
            restoreServiceV2.f20601m.m19282a(1, null);
            restoreServiceV2.m19108f();
            restoreServiceV2.stopSelf(restoreServiceV2.f20597i);
        }
    }

    public final void mo3937a() {
        this.f20867a.m19107e();
    }

    public final void mo3940b() {
        RestoreServiceV2 restoreServiceV2 = this.f20867a;
        String cZ = restoreServiceV2.f20609u.cZ();
        if (!restoreServiceV2.f20592d.get() && restoreServiceV2.m19105c()) {
            restoreServiceV2.f20592d.set(true);
            restoreServiceV2.f20614z.mo3960b(cZ, 2);
        }
        if (!restoreServiceV2.f20593e.get() && restoreServiceV2.m19106d()) {
            restoreServiceV2.f20593e.set(true);
            restoreServiceV2.f20614z.mo3960b(cZ, 1);
        }
        if (!restoreServiceV2.f20605q.mo3969b() && !restoreServiceV2.f20606r.mo3979a() && restoreServiceV2.f20598j <= 0) {
            if (restoreServiceV2.f20603o == null || restoreServiceV2.f20603o.booleanValue()) {
                restoreServiceV2.f20614z.mo3958b();
            }
            restoreServiceV2.f20603o = null;
            FinskyLog.m21659a("Restore complete with %d success and %d failed.", C0954a.bh.m5760a(), C0954a.bi.m5760a());
            C0954a.bh.m5763a(Integer.valueOf(0));
            C0954a.bi.m5763a(Integer.valueOf(0));
            restoreServiceV2.f20601m.m19282a(1, null);
            restoreServiceV2.m19108f();
            restoreServiceV2.stopSelf(restoreServiceV2.f20597i);
        }
    }
}
