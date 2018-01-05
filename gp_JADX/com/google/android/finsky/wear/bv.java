package com.google.android.finsky.wear;

import com.google.android.finsky.utils.FinskyLog;

final class bv implements Runnable {
    public final /* synthetic */ boolean f24908a;
    public final /* synthetic */ String f24909b;
    public final /* synthetic */ WearSupportService f24910c;

    bv(WearSupportService wearSupportService, boolean z, String str) {
        this.f24910c = wearSupportService;
        this.f24908a = z;
        this.f24909b = str;
    }

    public final void run() {
        this.f24910c.f24760g = this.f24910c.f24760g - 1;
        if (this.f24908a) {
            ar arVar = this.f24910c.f24757d;
            FinskyLog.m21659a("New node found %s", this.f24909b);
            arVar.f24821e = 0;
            ar.m22463b(r1);
        }
        this.f24910c.m22419a();
    }
}
