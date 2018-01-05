package com.google.android.finsky.cm;

final class C2304k implements Runnable {
    public final /* synthetic */ Runnable f11351a;
    public final /* synthetic */ C2298e f11352b;

    C2304k(C2298e c2298e, Runnable runnable) {
        this.f11352b = c2298e;
        this.f11351a = runnable;
    }

    public final void run() {
        this.f11352b.f11335f.post(this.f11351a);
    }
}
