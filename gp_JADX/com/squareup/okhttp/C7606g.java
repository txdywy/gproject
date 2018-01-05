package com.squareup.okhttp;

final class C7606g implements ab {
    public final int f39359a;
    public final ag f39360b;
    public final boolean f39361c;
    public final /* synthetic */ C7605f f39362d;

    C7606g(C7605f c7605f, int i, ag agVar, boolean z) {
        this.f39362d = c7605f;
        this.f39359a = i;
        this.f39360b = agVar;
        this.f39361c = z;
    }

    public final ag mo6419a() {
        return this.f39360b;
    }

    public final ak mo6420a(ag agVar) {
        if (this.f39359a >= this.f39362d.f39354a.i.size()) {
            return this.f39362d.m36673a(agVar, this.f39361c);
        }
        aa aaVar = (aa) this.f39362d.f39354a.i.get(this.f39359a);
        ak a = aaVar.a(new C7606g(this.f39362d, this.f39359a + 1, agVar, this.f39361c));
        if (a != null) {
            return a;
        }
        throw new NullPointerException("application interceptor " + aaVar + " returned null");
    }
}
