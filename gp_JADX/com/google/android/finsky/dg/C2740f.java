package com.google.android.finsky.dg;

public final class C2740f implements Runnable {
    public final /* synthetic */ C2743j f14971a;
    public final /* synthetic */ C2734a f14972b;

    public C2740f(C2734a c2734a, C2743j c2743j) {
        this.f14972b = c2734a;
        this.f14971a = c2743j;
    }

    public final void run() {
        C2734a c2734a = this.f14972b;
        C2743j c2743j = this.f14971a;
        if (c2734a.m14777b()) {
            c2734a.m14774a(c2743j);
            return;
        }
        boolean isEmpty = c2734a.f14959b.isEmpty();
        c2734a.f14959b.add(c2743j);
        if (isEmpty) {
            c2734a.m14773a(c2734a.f14962e);
        }
    }
}
