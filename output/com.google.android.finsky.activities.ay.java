package com.google.android.finsky.activities;

import android.content.Context;
import android.widget.Toast;
import com.google.android.finsky.o;
import com.google.android.finsky.providers.d;
import com.google.android.finsky.scheduler.ah;
import com.google.android.finsky.scheduler.b.d;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.i;

protected final class com.google.android.finsky.activities.ay extends com.google.android.finsky.scheduler.ah
{

    public Context a;

    ay() {
        com.google.android.finsky.scheduler.ah();
    }

    protected final boolean a(com.google.android.finsky.scheduler.b.d p0) {
        ((com.google.android.finsky.o)com.google.android.finsky.providers.d.a(com.google.android.finsky.o)).a(this);
        Toast.makeText(this.a, "Debug Job Started. Check Logcat for details", 1).show();
        v1 = new Object[3];
        v1[0] = Long.valueOf(com.google.android.finsky.utils.i.a());
        v1[1] = Boolean.valueOf(p0.e());
        v1[2] = p0;
        FinskyLog.a("Debug job details: \nCurrentRTC: %d\nDeadline Expired: %b\n%s", v1);
        return 0;
    }

    protected final boolean k_(int p0) {
        return 0;
    }

}
