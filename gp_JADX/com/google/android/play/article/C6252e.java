package com.google.android.play.article;

final class C6252e implements Runnable {
    public final /* synthetic */ String f31274a;
    public final /* synthetic */ C6251d f31275b;

    C6252e(C6251d c6251d, String str) {
        this.f31275b = c6251d;
        this.f31274a = str;
    }

    public final void run() {
        this.f31275b.f31273b.f31270f.remove(this.f31275b.f31272a);
        if (this.f31275b.f31273b.f31266b) {
            this.f31275b.f31273b.f31268d.m1693a(this.f31275b.f31272a, this.f31274a);
        }
        this.f31275b.f31273b.m28763a(this.f31275b.f31272a, this.f31274a);
    }
}
