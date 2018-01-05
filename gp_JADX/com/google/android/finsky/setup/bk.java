package com.google.android.finsky.setup;

import android.content.Intent;
import com.google.android.finsky.aa.C0954a;
import com.google.android.finsky.utils.FinskyLog;
import java.util.List;

final class bk implements Runnable {
    public int f20869a;
    public final /* synthetic */ Intent f20870b;
    public final /* synthetic */ RestoreServiceV2 f20871c;

    bk(RestoreServiceV2 restoreServiceV2, Intent intent) {
        this.f20871c = restoreServiceV2;
        this.f20870b = intent;
    }

    public final void run() {
        this.f20869a++;
        if (this.f20869a == 4) {
            boolean b;
            RestoreServiceV2 restoreServiceV2 = this.f20871c;
            restoreServiceV2.f20598j--;
            this.f20871c.f20592d.set(this.f20871c.m19105c());
            this.f20871c.f20593e.set(this.f20871c.m19106d());
            RestoreServiceV2 restoreServiceV22 = this.f20871c;
            Intent intent = this.f20870b;
            FinskyLog.m21659a("Handling intent %s", intent);
            switch (intent.getIntExtra("restore_request_type", -1)) {
                case 0:
                    b = restoreServiceV22.m19104b();
                    break;
                case 1:
                    restoreServiceV22.f20614z.mo3948a("installer_kick");
                    restoreServiceV22.f20603o = null;
                    restoreServiceV22.f20589A.mo3428a();
                    b = false;
                    break;
                case 2:
                    restoreServiceV22.f20606r.mo3986e();
                    b = false;
                    break;
                case 3:
                    b = restoreServiceV22.m19103a(intent);
                    break;
                case 4:
                    List b2 = restoreServiceV22.f20591C.mo3932b(intent);
                    restoreServiceV22.f20603o = null;
                    if (b2 != null && !b2.isEmpty()) {
                        restoreServiceV22.f20614z.mo3954a(((PackageSetupStatus) b2.get(0)).m19068b(), b2);
                        FinskyLog.m21659a("Start restore of %d packages (%d skipped) for acct:%s", Integer.valueOf(b2.size()), Integer.valueOf(b2.size() - restoreServiceV22.f20606r.mo3975a(b2)), FinskyLog.m21655a(r0));
                        if (restoreServiceV22.f20606r.mo3975a(b2) <= 0) {
                            b = false;
                            break;
                        } else {
                            b = true;
                            break;
                        }
                    }
                    b = false;
                    break;
                    break;
                case 5:
                    restoreServiceV22.f20614z.mo3948a("recover");
                    restoreServiceV22.f20603o = null;
                    b = restoreServiceV22.f20606r.mo3980a(intent.getStringExtra("package"));
                    break;
                case 6:
                    C0954a.bh.m5763a(Integer.valueOf(0));
                    C0954a.bi.m5763a(Integer.valueOf(0));
                    b = false;
                    break;
                default:
                    FinskyLog.m21665c("Unknown restore request type %d", Integer.valueOf(intent.getIntExtra("restore_request_type", -1)));
                    b = false;
                    break;
            }
            restoreServiceV22 = this.f20871c;
            if (!restoreServiceV22.f20600l) {
                restoreServiceV22.f20613y.mo3481a(restoreServiceV22.f20606r);
                restoreServiceV22.f20600l = true;
            }
            if (!b) {
                restoreServiceV2 = this.f20871c;
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
    }
}
