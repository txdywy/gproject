package com.google.android.finsky.wear;

import com.google.android.finsky.utils.FinskyLog;

final class bo implements cj {
    public final /* synthetic */ String f24885a;
    public final /* synthetic */ String f24886b;
    public final /* synthetic */ WearSupportService f24887c;

    bo(WearSupportService wearSupportService, String str, String str2) {
        this.f24887c = wearSupportService;
        this.f24885a = str;
        this.f24886b = str2;
    }

    public final void mo4393a(boolean z) {
        FinskyLog.m21659a("Completed wear package check for node %s package %s", this.f24885a, this.f24886b);
        if (z) {
            this.f24887c.f24756c.f24798h.m22552b();
        }
        this.f24887c.m22423b(this.f24885a);
    }
}
