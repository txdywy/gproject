package com.google.android.finsky.p140i;

final class C3220g implements Runnable {
    public final /* synthetic */ Runnable f16553a;
    public final /* synthetic */ int f16554b;
    public final /* synthetic */ C3219f f16555c;

    C3220g(C3219f c3219f, Runnable runnable, int i) {
        this.f16555c = c3219f;
        this.f16553a = runnable;
        this.f16554b = i;
    }

    public final void run() {
        if (this.f16555c.m16267a()) {
            this.f16553a.run();
        } else {
            this.f16555c.m16266a(this.f16554b, this.f16553a);
        }
    }
}
