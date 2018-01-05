package com.google.android.gms.internal;

public final class cm extends wu {
    public byte[] f26637a;
    public byte[] f26638b;

    public cm() {
        this.f26637a = null;
        this.f26638b = null;
        this.ai = -1;
    }

    protected final int mo4701a() {
        int a = super.mo4701a();
        if (this.f26637a != null) {
            a += wt.m25893b(1, this.f26637a);
        }
        return this.f26638b != null ? a + wt.m25893b(2, this.f26638b) : a;
    }

    public final /* synthetic */ wz mo4705a(ws wsVar) {
        while (true) {
            int a = wsVar.m25865a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f26637a = wsVar.m25874d();
                    continue;
                case 18:
                    this.f26638b = wsVar.m25874d();
                    continue;
                default:
                    if (!super.m24220a(wsVar, a)) {
                        break;
                    }
                    continue;
            }
            return this;
        }
    }

    public final void mo4702a(wt wtVar) {
        if (this.f26637a != null) {
            wtVar.m25906a(1, this.f26637a);
        }
        if (this.f26638b != null) {
            wtVar.m25906a(2, this.f26638b);
        }
        super.mo4702a(wtVar);
    }
}
