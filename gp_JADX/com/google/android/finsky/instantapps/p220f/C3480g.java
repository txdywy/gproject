package com.google.android.finsky.instantapps.p220f;

final class C3480g implements Runnable {
    public final /* synthetic */ C3482i f17678a;
    public final /* synthetic */ C3479f f17679b;

    C3480g(C3479f c3479f, C3482i c3482i) {
        this.f17679b = c3479f;
        this.f17678a = c3482i;
    }

    public final void run() {
        int a = this.f17679b.m17048a(this.f17678a.f17680a);
        this.f17679b.f17675d.mo3543a(this.f17678a.f17680a);
        this.f17679b.f17677f.remove(a);
        if (this.f17679b.f17677f.isEmpty()) {
            this.f17679b.f3433a.m3638b();
        } else {
            this.f17679b.m3633d(a);
        }
    }
}
