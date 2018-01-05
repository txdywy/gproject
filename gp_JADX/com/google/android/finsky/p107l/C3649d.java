package com.google.android.finsky.p107l;

final /* synthetic */ class C3649d implements Runnable {
    public final C3648c f18041a;
    public final Runnable f18042b;

    C3649d(C3648c c3648c, Runnable runnable) {
        this.f18041a = c3648c;
        this.f18042b = runnable;
    }

    public final void run() {
        C3648c c3648c = this.f18041a;
        Runnable runnable = this.f18042b;
        if (runnable != null) {
            c3648c.f18033d.post(runnable);
        }
    }
}
