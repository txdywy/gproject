package com.google.android.finsky.installer.p207a;

final class C3305w implements Runnable {
    public final /* synthetic */ boolean f17101a;
    public final /* synthetic */ C3301s f17102b;

    C3305w(C3301s c3301s, boolean z) {
        this.f17102b = c3301s;
        this.f17101a = z;
    }

    public final void run() {
        if (!this.f17101a || this.f17102b.m16628f()) {
            this.f17102b.m16607a(false);
        }
    }
}
