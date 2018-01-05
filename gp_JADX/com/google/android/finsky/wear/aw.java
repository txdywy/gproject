package com.google.android.finsky.wear;

import android.content.Intent;
import android.os.Build.VERSION;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.utils.FinskyLog;

final class aw implements Runnable {
    public final /* synthetic */ Intent f24844a;
    public final /* synthetic */ ar f24845b;

    aw(ar arVar, Intent intent) {
        this.f24845b = arVar;
        this.f24844a = intent;
    }

    public final void run() {
        Object obj = this.f24845b;
        Intent intent = this.f24844a;
        if (VERSION.SDK_INT < 18) {
            FinskyLog.m21659a("Not supported on API %d device", Integer.valueOf(VERSION.SDK_INT));
            return;
        }
        FinskyLog.m21659a("Starting WearSupport for Hygiene.", new Object[0]);
        Runnable axVar = new ax(obj, intent);
        C1473m.f7980a.ah().mo2815a(axVar);
        obj.f24823g.m22457a(axVar, obj);
    }
}
