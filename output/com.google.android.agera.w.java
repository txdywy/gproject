package com.google.android.agera;

protected final class com.google.android.agera.w extends com.google.android.agera.b implements com.google.android.agera.am
{

    public final t[] i;

    w(int p0, t[] p1) {
        com.google.android.agera.b(p0);
        this.i = p1;
    }

    public final void ad_() {
        this.a();
    }

    protected final void b() {
        v0 = 0;
        while (v0 < this.i.length) {
            this.i[v0].a(this);
            v0 = v0 + 1;
        }
    }

    protected final void c() {
        v0 = 0;
        while (v0 < this.i.length) {
            this.i[v0].b(this);
            v0 = v0 + 1;
        }
    }

}
