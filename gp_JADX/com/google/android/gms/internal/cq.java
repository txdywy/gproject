package com.google.android.gms.internal;

public final class cq extends wu {
    public Long f26643a;
    public String f26644b;
    public byte[] f26645c;

    public cq() {
        this.f26643a = null;
        this.f26644b = null;
        this.f26645c = null;
        this.ai = -1;
    }

    protected final int mo4701a() {
        int a = super.mo4701a();
        if (this.f26643a != null) {
            a += wt.m25890b(1, this.f26643a.longValue());
        }
        if (this.f26644b != null) {
            a += wt.m25892b(3, this.f26644b);
        }
        return this.f26645c != null ? a + wt.m25893b(4, this.f26645c) : a;
    }

    public final /* synthetic */ wz mo4705a(ws wsVar) {
        while (true) {
            int a = wsVar.m25865a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f26643a = Long.valueOf(wsVar.m25877f());
                    continue;
                case 26:
                    this.f26644b = wsVar.m25872c();
                    continue;
                case 34:
                    this.f26645c = wsVar.m25874d();
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
        if (this.f26643a != null) {
            wtVar.m25902a(1, this.f26643a.longValue());
        }
        if (this.f26644b != null) {
            wtVar.m25904a(3, this.f26644b);
        }
        if (this.f26645c != null) {
            wtVar.m25906a(4, this.f26645c);
        }
        super.mo4702a(wtVar);
    }
}
