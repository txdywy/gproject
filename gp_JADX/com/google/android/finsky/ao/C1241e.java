package com.google.android.finsky.ao;

final /* synthetic */ class C1241e implements Runnable {
    public final C1237a f7398a;
    public final C1243g f7399b;
    public final C1247k f7400c;

    C1241e(C1237a c1237a, C1243g c1243g, C1247k c1247k) {
        this.f7398a = c1237a;
        this.f7399b = c1243g;
        this.f7400c = c1247k;
    }

    public final void run() {
        C1237a c1237a = this.f7398a;
        C1243g c1243g = this.f7399b;
        C1247k c1247k = this.f7400c;
        c1237a.f7391g.remove(Integer.valueOf(c1243g.f7401a));
        c1243g.f7403c.mo2546a(c1247k);
        c1237a.m7242a();
    }
}
