package com.google.android.gms.common.p282a;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Build.VERSION;

public final class C5050a {
    public final AlarmManager f25617a;

    public C5050a(Context context) {
        this.f25617a = (AlarmManager) context.getSystemService("alarm");
    }

    public final void m23266a(PendingIntent pendingIntent) {
        this.f25617a.cancel(pendingIntent);
    }

    public final void m23265a(long j, PendingIntent pendingIntent) {
        if (VERSION.SDK_INT >= 23) {
            this.f25617a.setExactAndAllowWhileIdle(0, j, pendingIntent);
        } else {
            this.f25617a.setExact(0, j, pendingIntent);
        }
    }
}
