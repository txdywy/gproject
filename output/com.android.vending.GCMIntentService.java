package com.android.vending;

import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import com.google.android.finsky.deviceconfig.m;
import com.google.android.finsky.deviceconfig.n;
import com.google.android.finsky.deviceconfig.o;
import com.google.android.finsky.m;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.gcm.a;

protected final class GCMIntentService extends com.google.android.gcm.a
{

    public final com.google.android.finsky.deviceconfig.n a;

    GCMIntentService() {
        v0 = new String[1];
        v0[0] = "932144863878";
        com.google.android.gcm.a(v0);
        this.a = com.google.android.finsky.m.a.bs();
    }

    protected final void a() {
        FinskyLog.a("GcmUnregistered - invalidating and requesting new id.", new Object[0]);
        new Handler(Looper.getMainLooper()).post(new com.google.android.finsky.deviceconfig.o(this.a));
    }

    protected final void a(Intent p0) {
        (new Object[1])[0] = p0.toString();
    }

    protected final void a(String p0) {
        v1 = new Object[1];
        v1[0] = p0;
        FinskyLog.d("%s", v1);
    }

    protected final void b(String p0) {
        (new Object[1])[0] = p0;
        new Handler(Looper.getMainLooper()).post(new com.google.android.finsky.deviceconfig.m());
    }

}
