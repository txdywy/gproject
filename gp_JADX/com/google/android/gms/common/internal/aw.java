package com.google.android.gms.common.internal;

public abstract class aw {
    public /* synthetic */ ar f25989c;
    public Object f25990d;
    public boolean f25991e = false;

    public aw(ar arVar, Object obj) {
        this.f25989c = arVar;
        this.f25990d = obj;
    }

    protected abstract void mo4612a(Object obj);

    protected abstract void mo4613b();

    public final void m23751c() {
        m23752d();
        synchronized (this.f25989c.f25426s) {
            this.f25989c.f25426s.remove(this);
        }
    }

    public final void m23752d() {
        synchronized (this) {
            this.f25990d = null;
        }
    }
}
