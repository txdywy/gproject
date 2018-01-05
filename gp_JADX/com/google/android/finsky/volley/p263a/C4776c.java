package com.google.android.finsky.volley.p263a;

final class C4776c implements Runnable {
    public int f24736a = 0;
    public final /* synthetic */ int f24737b;
    public final /* synthetic */ Runnable f24738c;

    C4776c(int i, Runnable runnable) {
        this.f24737b = i;
        this.f24738c = runnable;
    }

    public final void run() {
        this.f24736a++;
        if (this.f24736a == this.f24737b && this.f24738c != null) {
            this.f24738c.run();
        }
    }
}
