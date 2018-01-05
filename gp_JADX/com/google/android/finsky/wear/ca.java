package com.google.android.finsky.wear;

final class ca implements Runnable {
    public final /* synthetic */ String f24924a;
    public final /* synthetic */ String f24925b;
    public final /* synthetic */ WearSupportService f24926c;

    ca(WearSupportService wearSupportService, String str, String str2) {
        this.f24926c = wearSupportService;
        this.f24924a = str;
        this.f24925b = str2;
    }

    public final void run() {
        this.f24926c.f24756c.m22456a(new cb(this), this.f24926c.f24762i, this.f24926c.f24761h, false);
    }
}
