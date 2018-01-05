package com.google.android.finsky.dn;

final class C2835c implements Runnable {
    public final /* synthetic */ C2834b f15235a;

    C2835c(C2834b c2834b) {
        this.f15235a = c2834b;
    }

    public final void run() {
        this.f15235a.f15234f.f15228g.remove(this.f15235a.f15231c);
        C2833a c2833a = this.f15235a.f15234f;
        String str = this.f15235a.f15231c;
        this.f15235a.f15234f.m14990b(this.f15235a.f15233e, this.f15235a.f15232d);
        c2833a.m14985a(str, false);
    }
}
