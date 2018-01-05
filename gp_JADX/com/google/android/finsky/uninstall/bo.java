package com.google.android.finsky.uninstall;

import android.content.pm.PackageStats;
import com.google.android.finsky.co.C2332j;
import com.google.android.finsky.p111d.C2474c;
import com.google.android.finsky.utils.FinskyLog;

final class bo implements C2332j {
    public final /* synthetic */ C2332j f23584a;
    public final /* synthetic */ bl f23585b;

    bo(bl blVar, C2332j c2332j) {
        this.f23585b = blVar;
        this.f23584a = c2332j;
    }

    public final void mo3143a(PackageStats packageStats) {
        this.f23584a.mo3143a(packageStats);
    }

    public final void mo3144a(String str, int i, Exception exception) {
        int i2;
        if (exception == null) {
            FinskyLog.m21665c("Failed to get status for package '%s' (%d)", str, Integer.valueOf(i));
        } else {
            FinskyLog.m21660a(exception, "Failed to get status for package '%s' (%d)", str, Integer.valueOf(i));
        }
        switch (i) {
            case 1600:
                FinskyLog.m21669e("Shouldn't have tried getting package stats if API wasunavailable", new Object[0]);
                i2 = 1500;
                break;
            case 1601:
                i2 = 1503;
                break;
            case 1602:
                i2 = 1504;
                break;
            default:
                FinskyLog.m21669e("Unknown error code getting package stats: " + i, new Object[0]);
                i2 = 1505;
                break;
        }
        this.f23585b.f23575f.dc().m13319a(new C2474c(135).m13254g(i2).f13342a, null);
        this.f23585b.f23574e = false;
        this.f23584a.mo3144a(str, i, exception);
    }
}
