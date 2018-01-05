package com.google.android.finsky.application;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import com.google.android.finsky.aa.b;
import com.google.android.finsky.as.e;
import com.google.android.finsky.m;
import com.google.android.finsky.verifier.impl.PlayProtectHomeActivity;
import com.google.android.play.utils.b.a;

public final class com.google.android.finsky.application.dj implements Runnable
{

    public final com.google.android.finsky.application.d a;

    dj(com.google.android.finsky.application.d p0) {
        this.a = p0;
    }

    public final void run() {
        if (!this.a.O().d()) {
            if (((Boolean)com.google.android.finsky.aa.b.hY.b()).booleanValue())
                v0 = 1;
            else
                v0 = 2;
            this.a.b.getPackageManager().setComponentEnabledSetting(new ComponentName(this.a.b, PlayProtectHomeActivity), v0, 1);
        }
    }

}
