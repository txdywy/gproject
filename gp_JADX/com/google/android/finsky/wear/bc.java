package com.google.android.finsky.wear;

final class bc implements Runnable {
    public final /* synthetic */ C4780a f24863a;
    public final /* synthetic */ String[] f24864b;
    public final /* synthetic */ cc f24865c;
    public final /* synthetic */ ar f24866d;

    bc(ar arVar, C4780a c4780a, String[] strArr, cc ccVar) {
        this.f24866d = arVar;
        this.f24863a = c4780a;
        this.f24864b = strArr;
        this.f24865c = ccVar;
    }

    public final void run() {
        this.f24863a.mo4386b();
        this.f24866d.m22469a(this.f24864b, this.f24865c);
    }
}
