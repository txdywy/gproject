package com.google.android.gms.internal;

final class jr implements Runnable {
    public /* synthetic */ int f27089a;
    public /* synthetic */ boolean f27090b;
    public /* synthetic */ jp f27091c;

    jr(jp jpVar, int i, boolean z) {
        this.f27091c = jpVar;
        this.f27089a = i;
        this.f27090b = z;
    }

    public final void run() {
        ci b = this.f27091c.m24981b(this.f27089a, this.f27090b);
        this.f27091c.f27081k = b;
        if (jp.m24973a(this.f27089a, b)) {
            this.f27091c.m24978a(this.f27089a + 1, this.f27090b);
        }
    }
}
