package com.google.android.gms.peerdownloadmanager.p301e;

public final class C5492h {
    public final C5486c f28252a;
    public final long f28253b;
    public long f28254c;

    public C5492h(C5486c c5486c) {
        this.f28252a = c5486c;
        this.f28253b = c5486c.mo5025a();
    }

    public final long m26377a() {
        if (this.f28254c == 0) {
            return this.f28252a.mo5025a() - this.f28253b;
        }
        return this.f28254c - this.f28253b;
    }
}
