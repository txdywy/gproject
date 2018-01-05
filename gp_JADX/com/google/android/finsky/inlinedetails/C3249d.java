package com.google.android.finsky.inlinedetails;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.support.v4.p037h.C0313h;
import com.google.android.finsky.activities.LaunchUrlHandlerActivity;
import com.google.android.finsky.activities.MarketDeepLinkHandlerActivity;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.ba.C1549f;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.bb;

public final class C3249d implements C1549f {
    public final Context f16752a;
    public final C1461c f16753b;

    public C3249d(Context context, C1461c c1461c) {
        this.f16752a = context;
        this.f16753b = c1461c;
    }

    public final void m16359a() {
        bb.m21792a(new C3250e(this), new Void[0]);
    }

    final synchronized void m16362b() {
        PackageManager packageManager = this.f16752a.getPackageManager();
        ComponentName componentName = new ComponentName(this.f16752a, LaunchUrlHandlerActivity.class);
        ComponentName componentName2 = new ComponentName(this.f16752a, MarketDeepLinkHandlerActivity.class);
        if (this.f16753b.dj().mo2294a(12634613)) {
            C3249d.m16358a(packageManager, componentName2, 1);
            C3249d.m16358a(packageManager, componentName, 2);
        } else {
            C3249d.m16358a(packageManager, componentName, 0);
            C3249d.m16358a(packageManager, componentName2, 0);
        }
    }

    private static void m16358a(PackageManager packageManager, ComponentName componentName, int i) {
        if (packageManager.getComponentEnabledSetting(componentName) != i) {
            packageManager.setComponentEnabledSetting(componentName, i, 1);
            FinskyLog.m21665c("Enabled state of %s was set to %d", componentName.toShortString(), Integer.valueOf(i));
        }
    }

    public final void mo2287a(boolean z) {
    }

    public final void mo2286a(C0313h c0313h, C0313h c0313h2) {
        if (c0313h.m1690c(12634613) >= 0 || c0313h2.m1690c(12634613) >= 0) {
            m16359a();
        }
    }
}
