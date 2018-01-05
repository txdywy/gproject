package com.google.android.finsky.wear;

final class an implements Runnable {
    public int f24808a = 0;
    public final /* synthetic */ int f24809b;
    public final /* synthetic */ C4780a f24810c;
    public final /* synthetic */ ak f24811d;

    an(ak akVar, int i, C4780a c4780a) {
        this.f24811d = akVar;
        this.f24809b = i;
        this.f24810c = c4780a;
    }

    public final void run() {
        this.f24808a++;
        if (this.f24808a == this.f24809b) {
            this.f24810c.mo4386b();
            this.f24811d.m22453a(this.f24811d.f24795e, this.f24810c);
        }
    }
}
