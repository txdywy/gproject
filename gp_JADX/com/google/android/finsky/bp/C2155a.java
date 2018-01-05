package com.google.android.finsky.bp;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.support.v4.os.C0327a;
import android.support.v4.p037h.C0313h;
import com.google.android.finsky.as.C1506e;
import com.google.android.finsky.ba.C1549f;
import com.google.android.finsky.instantapps.PhenotypeUpdateService;

public final class C2155a implements C1549f {
    public final Context f10907a;
    public final C1506e f10908b;

    public C2155a(Context context, C1506e c1506e) {
        this.f10907a = context;
        this.f10908b = c1506e;
    }

    public final boolean m11228a() {
        return (!C0327a.m1722b() || this.f10908b.m8841d() || this.f10908b.m8843f() == 7 || this.f10908b.m8843f() == 5) ? false : true;
    }

    public final void m11229b(boolean z) {
        if (!this.f10908b.m8841d()) {
            boolean a = m11225a("com.google.android.finsky.instantapps.EphemeralInstallerActivity", z);
            boolean a2 = m11225a("com.google.android.finsky.instantapps.InstantAppsConfigChangeListener", z);
            boolean a3 = m11225a("com.google.android.finsky.instantapps.ContentFilterUpdatedReceiver", z);
            boolean a4 = m11225a("com.google.android.finsky.instantapps.appmanagement.InstantAppRemoveMonitor", z);
            if ((!a && !a2 && !a3 && !a4) || !C0327a.m1722b()) {
                return;
            }
            if (z) {
                PhenotypeUpdateService.m16867b(this.f10907a);
            } else {
                PhenotypeUpdateService.m16868c(this.f10907a);
            }
        }
    }

    private final boolean m11225a(String str, boolean z) {
        int i = 2;
        ComponentName componentName = new ComponentName(this.f10907a, str);
        PackageManager packageManager = this.f10907a.getPackageManager();
        int componentEnabledSetting = packageManager.getComponentEnabledSetting(componentName);
        if (z && componentEnabledSetting == 1) {
            return false;
        }
        if (!z && (componentEnabledSetting == 2 || componentEnabledSetting == 4)) {
            return false;
        }
        if (componentEnabledSetting == 3) {
            return false;
        }
        if (z) {
            i = 1;
        }
        packageManager.setComponentEnabledSetting(componentName, i, 1);
        return true;
    }

    public final void mo2287a(boolean z) {
    }

    public final void mo2286a(C0313h c0313h, C0313h c0313h2) {
        if (m11228a() && c0313h2.m1690c(12625103) >= 0) {
            m11229b(true);
        } else if (!m11228a() || c0313h.m1690c(12625103) >= 0) {
            m11229b(false);
        }
    }
}
