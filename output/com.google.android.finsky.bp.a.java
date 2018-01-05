package com.google.android.finsky.bp;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.support.v4.h.h;
import android.support.v4.os.a;
import com.google.android.finsky.as.e;
import com.google.android.finsky.instantapps.PhenotypeUpdateService;

public final class com.google.android.finsky.bp.a implements com.google.android.finsky.ba.f
{

    public final Context a;
    public final com.google.android.finsky.as.e b;

    a(Context p0, com.google.android.finsky.as.e p1) {
        this.a = p0;
        this.b = p1;
    }

    private final boolean a(String p0, boolean p1) {
        v0 = 2;
        v1 = 1;
        v3 = new ComponentName(this.a, p0);
        v4 = this.a.getPackageManager();
        v5 = v4.getComponentEnabledSetting(v3);
        if (p1 != 0 && v5 == 1)
            v1 = 0;
        else if (p1 == 0 && (v5 == 2 || v5 == 4))
            v1 = 0;
        else if (v5 == 3)
            v1 = 0;
        else {
            if (p1 != 0)
                v0 = 1;
            v4.setComponentEnabledSetting(v3, v0, 1);
        }
        return v1;
    }

    public final void a(android.support.v4.h.h p0, android.support.v4.h.h p1) {
        if (this.a() && p1.c(12625103) >= 0)
            this.b(1);
        else if ((!this.a()) || p0.c(12625103) >= 0)
            this.b(0);
    }

    public final void a(boolean p0) {
    }

    public final boolean a() {
        if (android.support.v4.os.a.b() && !this.b.d() && this.b.f() != 7 && this.b.f() != 5)
            v0 = 1;
        else
            v0 = 0;
        return v0;
    }

    public final void b(boolean p0) {
        if (!this.b.d() && ((this.a("com.google.android.finsky.instantapps.EphemeralInstallerActivity", p0)) || (this.a("com.google.android.finsky.instantapps.InstantAppsConfigChangeListener", p0)) || (this.a("com.google.android.finsky.instantapps.ContentFilterUpdatedReceiver", p0)) || this.a("com.google.android.finsky.instantapps.appmanagement.InstantAppRemoveMonitor", p0)) && android.support.v4.os.a.b()) {
            if (p0 != 0)
                PhenotypeUpdateService.b(this.a);
            else
                PhenotypeUpdateService.c(this.a);
        }
    }

}
