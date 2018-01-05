package com.google.android.finsky.wear;

final /* synthetic */ class bm implements Runnable {
    public final WearSupportService f24882a;
    public final String f24883b;

    bm(WearSupportService wearSupportService, String str) {
        this.f24882a = wearSupportService;
        this.f24883b = str;
    }

    public final void run() {
        WearSupportService wearSupportService = this.f24882a;
        wearSupportService.f24757d.m22467a(this.f24883b);
    }
}
