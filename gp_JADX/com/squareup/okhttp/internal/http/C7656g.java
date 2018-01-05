package com.squareup.okhttp.internal.http;

import p526e.C7730m;
import p526e.aa;
import p526e.ab;

abstract class C7656g implements aa {
    public final C7730m f39637a = new C7730m(this.f39639c.f39633b.mo6424a());
    public boolean f39638b;
    public final /* synthetic */ C7655f f39639c;

    C7656g(C7655f c7655f) {
        this.f39639c = c7655f;
    }

    public final ab mo6424a() {
        return this.f39637a;
    }

    protected final void m36944b() {
        if (this.f39639c.f39636e != 5) {
            throw new IllegalStateException("state: " + this.f39639c.f39636e);
        }
        C7730m c7730m = this.f39637a;
        ab abVar = c7730m.f40198a;
        ab abVar2 = ab.f39527h;
        if (abVar2 == null) {
            throw new IllegalArgumentException("delegate == null");
        }
        c7730m.f40198a = abVar2;
        abVar.mo6512e();
        abVar.mo6511d();
        this.f39639c.f39636e = 6;
        if (this.f39639c.f39632a != null) {
            this.f39639c.f39632a.m36915a(this.f39639c);
        }
    }

    protected final void m36945c() {
        if (this.f39639c.f39636e != 6) {
            this.f39639c.f39636e = 6;
            if (this.f39639c.f39632a != null) {
                this.f39639c.f39632a.m36917a(true, false, false);
                this.f39639c.f39632a.m36915a(this.f39639c);
            }
        }
    }
}
