package com.android.volley;

final class C0686d implements Runnable {
    public final /* synthetic */ C0656n f4146a;
    public final /* synthetic */ C0685c f4147b;

    C0686d(C0685c c0685c, C0656n c0656n) {
        this.f4147b = c0685c;
        this.f4146a = c0656n;
    }

    public final void run() {
        try {
            this.f4147b.f4141c.put(this.f4146a);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
