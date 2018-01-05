package com.google.android.gms.internal;

public final class cn extends wu {
    public byte[] f26639a;
    public byte[] f26640b;
    public byte[] f26641c;
    public byte[] f26642d;

    public cn() {
        this.f26639a = null;
        this.f26640b = null;
        this.f26641c = null;
        this.f26642d = null;
        this.ai = -1;
    }

    protected final int mo4701a() {
        int a = super.mo4701a();
        if (this.f26639a != null) {
            a += wt.m25893b(1, this.f26639a);
        }
        if (this.f26640b != null) {
            a += wt.m25893b(2, this.f26640b);
        }
        if (this.f26641c != null) {
            a += wt.m25893b(3, this.f26641c);
        }
        return this.f26642d != null ? a + wt.m25893b(4, this.f26642d) : a;
    }

    public final /* synthetic */ wz mo4705a(ws wsVar) {
        while (true) {
            int a = wsVar.m25865a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f26639a = wsVar.m25874d();
                    continue;
                case 18:
                    this.f26640b = wsVar.m25874d();
                    continue;
                case 26:
                    this.f26641c = wsVar.m25874d();
                    continue;
                case 34:
                    this.f26642d = wsVar.m25874d();
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
        if (this.f26639a != null) {
            wtVar.m25906a(1, this.f26639a);
        }
        if (this.f26640b != null) {
            wtVar.m25906a(2, this.f26640b);
        }
        if (this.f26641c != null) {
            wtVar.m25906a(3, this.f26641c);
        }
        if (this.f26642d != null) {
            wtVar.m25906a(4, this.f26642d);
        }
        super.mo4702a(wtVar);
    }
}
