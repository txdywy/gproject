package com.google.android.finsky.bn;

final class ac implements Runnable {
    public final /* synthetic */ String f10780a;
    public final /* synthetic */ int f10781b;
    public final /* synthetic */ C2134h f10782c;

    ac(C2134h c2134h, String str, int i) {
        this.f10782c = c2134h;
        this.f10780a = str;
        this.f10781b = i;
    }

    public final void run() {
        this.f10782c.f10840b.mo2661a(this.f10780a, this.f10781b);
    }
}
