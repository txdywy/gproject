package com.google.android.gms.internal;

abstract class hz extends hy {
    public boolean f26776q;

    hz(hv hvVar) {
        super(hvVar);
        hv hvVar2 = this.p;
        hvVar2.f26923A++;
    }

    protected abstract void mo4745s();

    final boolean m24431w() {
        return this.f26776q;
    }

    protected final void m24432x() {
        if (!m24431w()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void m24433y() {
        if (this.f26776q) {
            throw new IllegalStateException("Can't initialize twice");
        }
        mo4745s();
        hv hvVar = this.p;
        hvVar.f26924B++;
        this.f26776q = true;
    }
}
