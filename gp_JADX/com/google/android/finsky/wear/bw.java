package com.google.android.finsky.wear;

final class bw implements Runnable {
    public final /* synthetic */ String f24911a;
    public final /* synthetic */ String f24912b;
    public final /* synthetic */ boolean f24913c;
    public final /* synthetic */ WearSupportService f24914d;

    bw(WearSupportService wearSupportService, String str, String str2, boolean z) {
        this.f24914d = wearSupportService;
        this.f24911a = str;
        this.f24912b = str2;
        this.f24913c = z;
    }

    public final void run() {
        this.f24914d.f24756c.m22456a(new bx(this), this.f24914d.f24762i, this.f24914d.f24761h, false);
    }
}
