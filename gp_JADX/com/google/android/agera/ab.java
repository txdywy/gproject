package com.google.android.agera;

final class ab extends C0894b implements C0896s {
    public Object f5649i;

    ab(Object obj) {
        this.f5649i = C0917x.m5639a(obj);
    }

    public final synchronized Object i_() {
        return this.f5649i;
    }

    public final void mo1146b(Object obj) {
        synchronized (this) {
            if (obj.equals(this.f5649i)) {
                return;
            }
            this.f5649i = obj;
            m5570a();
        }
    }
}
