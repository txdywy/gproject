package com.google.android.finsky.application;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.verifier.impl.PlayProtectHomeActivity;

final class dj implements Runnable {
    public final /* synthetic */ C1475d f8043a;

    dj(C1475d c1475d) {
        this.f8043a = c1475d;
    }

    public final void run() {
        Context context = this.f8043a.f7981b;
        if (!this.f8043a.mo2035O().m8841d()) {
            int i;
            PackageManager packageManager = context.getPackageManager();
            ComponentName componentName = new ComponentName(context, PlayProtectHomeActivity.class);
            if (((Boolean) C0955b.hY.m28964b()).booleanValue()) {
                i = 1;
            } else {
                i = 2;
            }
            packageManager.setComponentEnabledSetting(componentName, i, 1);
        }
    }
}
