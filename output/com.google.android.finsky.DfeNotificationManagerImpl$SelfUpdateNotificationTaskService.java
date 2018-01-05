package com.google.android.finsky;

import android.app.Application;
import android.os.Bundle;
import com.google.android.finsky.ba.e;
import com.google.android.finsky.d.a;
import com.google.android.finsky.d.c;
import com.google.android.finsky.d.w;
import com.google.android.finsky.dc.b;
import com.google.android.finsky.de.a;
import com.google.android.finsky.deviceconfig.e;
import com.google.android.finsky.hygiene.DailyHygiene;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.gms.gcm.OneoffTask;
import com.google.android.gms.gcm.b;
import com.google.android.gms.gcm.h;
import com.google.android.gms.gcm.l;
import com.google.wireless.android.a.a.a.a.t;

public final class DfeNotificationManagerImpl$SelfUpdateNotificationTaskService extends com.google.android.gms.gcm.b
{

    public final com.google.android.finsky.d.a a;
    public com.google.android.finsky.m b;

    DfeNotificationManagerImpl$SelfUpdateNotificationTaskService() {
        com.google.android.gms.gcm.b();
        this.a = com.google.android.finsky.m.a.aR();
        this.b = com.google.android.finsky.m.a;
    }

    static OneoffTask a(long p0, int p2) {
        v0 = new Bundle();
        if (p0 == 0)
            v0.putLong("delay_sec", 60);
        else
            v0.putLong("delay_sec", 3 * p0);
        v0.putInt("version_code", p2);
        v1 = new com.google.android.gms.gcm.h();
        v1.e = "SelfUpdateNotificationTaskService.TASK_TAG";
        v1.j = v0;
        v0 = v1.a(DfeNotificationManagerImpl$SelfUpdateNotificationTaskService);
        v0.g = 1;
        v0.c = 0;
        return v0.a(p0 - 60, 60 + p0).b();
    }

    public final int a(com.google.android.gms.gcm.l p0) {
        if (p0.a.getLong("delay_sec") == 60)
            v0 = "su_notification";
        else
            v0 = "su_notification_retry";
        v3 = this.a.a(v0);
        v1 = this.b.a(this.b.dj());
        v0 = p0.a.getInt("version_code");
        if (!com.google.android.finsky.m.a.dj().a(12638995) || v0 == -1 || v1.a(v0)) {
            v0 = new com.google.android.finsky.d.c(153).a(com.google.android.finsky.m.a.b.getPackageName()).a(new com.google.wireless.android.a.a.a.a.t().b(this.b.bi()));
            if (!this.b.dj().a(12609134)) {
                v0.a(-3);
                v3.a(v0);
                FinskyLog.a("Self-update notification ignored - experiment not enabled", new Object[0]);
            }
            else if (DailyHygiene.a != 0) {
                v0.a(-1);
                v3.a(v0);
                FinskyLog.a("Self-update notification ignored - DailyHygiene in progress", new Object[0]);
            }
            else if (v1.a()) {
                v0.a(-2);
                v3.a(v0);
                FinskyLog.a("Self-update notification ignored - Already running", new Object[0]);
            }
            else {
                v5 = this.b.ap();
                if (v5 == 0) {
                    v0.a(-4);
                    v3.a(v0);
                    FinskyLog.e("Self-update notification cannot be processed - DfeApi is null", new Object[0]);
                }
                else {
                    v2 = new com.google.wireless.android.a.a.a.a.t().b(this.b.bi()).a(1);
                    FinskyLog.a("Initiating push triggered self-update check", new Object[0]);
                    this.b.bI().a(v5, com.google.android.finsky.deviceconfig.e.a(), new com.google.android.finsky.l(v1, v2, v3, new com.google.android.finsky.d.c(119).a(v2), v5, p0));
                }
            }
        }
        return 0;
    }

}
