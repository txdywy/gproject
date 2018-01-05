package com.google.android.finsky.scheduler;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.utils.C4678i;
import com.google.android.finsky.utils.FinskyLog;

public final class C4036k {
    public final AlarmManager f20301a = ((AlarmManager) this.f20302b.getSystemService("alarm"));
    public final Context f20302b;

    public C4036k(Context context) {
        this.f20302b = context;
    }

    public final void m18924a() {
        m18923a(2, C4678i.m21813b() + ((Long) C0955b.iO.m28964b()).longValue());
        m18923a(3, C4678i.m21813b() + ((Long) C0955b.iP.m28964b()).longValue());
    }

    private final void m18923a(int i, long j) {
        Intent intent = new Intent(this.f20302b, AlarmEngineService.class);
        intent.setAction("com.google.android.finsky.scheduler.FALLBACK" + i);
        intent.putExtra("phoneskyscheduler-alarm-period", i);
        this.f20301a.set(2, j, PendingIntent.getService(this.f20302b, i, intent, 134217728));
        FinskyLog.m21659a("Scheduling fallback in %d (absolute: %d)", Long.valueOf(j - C4678i.m21813b()), Long.valueOf(j));
    }
}
