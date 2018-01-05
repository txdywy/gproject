package com.google.android.finsky.billing.addresschallenge.p156a;

public final class ap implements C1705y {
    public Object f8847a;
    public boolean f8848b = false;

    public ap(Object obj) {
        this.f8847a = obj;
    }

    public final void mo2413a() {
    }

    public final void mo2414b() {
        synchronized (this) {
            this.f8848b = true;
        }
        synchronized (this.f8847a) {
            this.f8847a.notify();
        }
    }

    public final void m9558c() {
        synchronized (this) {
            if (this.f8848b) {
                return;
            }
            synchronized (this.f8847a) {
                this.f8847a.wait();
            }
        }
    }
}
