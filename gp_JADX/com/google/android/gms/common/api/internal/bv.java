package com.google.android.gms.common.api.internal;

final class bv implements Runnable {
    public /* synthetic */ LifecycleCallback f25777a;
    public /* synthetic */ String f25778b;
    public /* synthetic */ bu f25779c;

    bv(bu buVar, LifecycleCallback lifecycleCallback, String str) {
        this.f25779c = buVar;
        this.f25777a = lifecycleCallback;
        this.f25778b = str;
    }

    public final void run() {
        if (this.f25779c.f25775c > 0) {
            this.f25777a.mo4595a(this.f25779c.f25776d != null ? this.f25779c.f25776d.getBundle(this.f25778b) : null);
        }
        if (this.f25779c.f25775c >= 2) {
            this.f25777a.mo4596b();
        }
        if (this.f25779c.f25775c >= 3) {
            this.f25777a.mo4605c();
        }
        if (this.f25779c.f25775c >= 4) {
            this.f25777a.mo4598d();
        }
        this.f25779c.f25775c;
    }
}
