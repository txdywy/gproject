package com.google.android.finsky.bn;

final class ad implements Runnable {
    public final /* synthetic */ String f10783a;
    public final /* synthetic */ int f10784b;
    public final /* synthetic */ C2134h f10785c;

    ad(C2134h c2134h, String str, int i) {
        this.f10785c = c2134h;
        this.f10783a = str;
        this.f10784b = i;
    }

    public final void run() {
        this.f10785c.f10840b.mo2669b(this.f10783a, this.f10784b);
    }
}
