package com.google.android.finsky.scheduler;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.google.android.finsky.aa.C0954a;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.scheduler.p238b.C4023a;
import com.google.android.finsky.scheduler.p238b.C4026d;
import com.google.android.finsky.utils.C4678i;
import com.google.android.finsky.utils.FinskyLog;
import java.util.List;

public final class C4019a implements C4011l {
    public final Intent f20191a = new Intent(this.f20193c, AlarmEngineService.class);
    public final AlarmManager f20192b = ((AlarmManager) this.f20193c.getSystemService("alarm"));
    public final Context f20193c;

    public C4019a(Context context) {
        this.f20193c = context;
    }

    public final void mo3886a(List list, int i) {
        C4023a c4023a;
        FinskyLog.m21662b("Scheduling %d jobs", Integer.valueOf(list.size()));
        C4031b c4031b = new C4031b(list);
        if (c4031b.f20258c.isEmpty()) {
            c4023a = null;
        } else {
            c4023a = c4031b.m18884a(null, true);
        }
        if (c4023a != null) {
            int i2;
            for (C4026d a : list) {
                if (a.m18856a().f20246a.f20159g == 1) {
                    i2 = 2;
                    break;
                }
            }
            i2 = 3;
            long b = c4023a.f20246a.f20154b + C4678i.m21813b();
            long longValue = ((Long) C0954a.bl.m5760a()).longValue();
            if (longValue != -1) {
                b = Math.max(b, longValue + ((Long) C0955b.iX.m28964b()).longValue());
            }
            m18788a(i2, b);
        }
    }

    public final void mo3885a() {
        FinskyLog.m21659a("Scheduling immediate wakeup", new Object[0]);
        m18788a(3, C4678i.m21813b());
    }

    private final void m18788a(int i, long j) {
        Intent intent = new Intent(this.f20191a);
        intent.putExtra("phoneskyscheduler-alarm-period", 1);
        this.f20192b.set(i, j, PendingIntent.getService(this.f20193c, 1, intent, 134217728));
        FinskyLog.m21659a("Scheduling wakeup in %d (absolute: %d)", Long.valueOf(j - C4678i.m21813b()), Long.valueOf(j));
    }
}
