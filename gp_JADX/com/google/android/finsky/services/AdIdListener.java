package com.google.android.finsky.services;

import com.google.android.finsky.C1473m;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.gms.ads.p239b.C4066d;
import com.google.android.gms.ads.p239b.C4893b;

public class AdIdListener extends C4066d {
    public void onCreate() {
        super.onCreate();
        FinskyLog.m21659a("AdId refresh", new Object[0]);
        C1473m.f7980a.mo2023C().mo2829a(2303);
    }

    public final void mo3899a(C4893b c4893b) {
        FinskyLog.m21659a("AdId change: id (hash)=%d limit=%b", Integer.valueOf(c4893b.f25246a.hashCode()), Boolean.valueOf(c4893b.f25247b));
    }
}
