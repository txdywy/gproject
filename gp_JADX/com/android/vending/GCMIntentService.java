package com.android.vending;

import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.deviceconfig.C2700m;
import com.google.android.finsky.deviceconfig.C2701n;
import com.google.android.finsky.deviceconfig.C2702o;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.gcm.C0624a;

public class GCMIntentService extends C0624a {
    public final C2701n f4007a = C1473m.f7980a.bs();

    public GCMIntentService() {
        super("932144863878");
    }

    protected final void mo1047a(String str) {
        FinskyLog.m21667d("%s", str);
    }

    protected final void mo1046a(Intent intent) {
        new Object[1][0] = intent.toString();
    }

    protected final void mo1048b(String str) {
        new Object[1][0] = str;
        new Handler(Looper.getMainLooper()).post(new C2700m());
    }

    protected final void mo1045a() {
        C2701n c2701n = this.f4007a;
        FinskyLog.m21659a("GcmUnregistered - invalidating and requesting new id.", new Object[0]);
        new Handler(Looper.getMainLooper()).post(new C2702o(c2701n));
    }
}
