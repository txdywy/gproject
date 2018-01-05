package com.google.android.gms.common.api.internal;

final class bi implements Runnable {
    public /* synthetic */ LifecycleCallback f25754a;
    public /* synthetic */ String f25755b;
    public /* synthetic */ bh f25756c;

    bi(bh bhVar, LifecycleCallback lifecycleCallback, String str) {
        this.f25756c = bhVar;
        this.f25754a = lifecycleCallback;
        this.f25755b = str;
    }

    public final void run() {
        if (this.f25756c.f25752c > 0) {
            this.f25754a.mo4595a(this.f25756c.f25753d != null ? this.f25756c.f25753d.getBundle(this.f25755b) : null);
        }
        if (this.f25756c.f25752c >= 2) {
            this.f25754a.mo4596b();
        }
        if (this.f25756c.f25752c >= 3) {
            this.f25754a.mo4605c();
        }
        if (this.f25756c.f25752c >= 4) {
            this.f25754a.mo4598d();
        }
        this.f25756c.f25752c;
    }
}
