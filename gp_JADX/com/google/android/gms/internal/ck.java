package com.google.android.gms.internal;

public final class ck extends wu {
    public Long f26627a;
    public Long f26628b;
    public Long f26629c;
    public Long f26630d;
    public Long f26631e;

    public ck() {
        this.f26627a = null;
        this.f26628b = null;
        this.f26629c = null;
        this.f26630d = null;
        this.f26631e = null;
        this.ai = -1;
    }

    protected final int mo4701a() {
        int a = super.mo4701a();
        if (this.f26627a != null) {
            a += wt.m25890b(1, this.f26627a.longValue());
        }
        if (this.f26628b != null) {
            a += wt.m25890b(2, this.f26628b.longValue());
        }
        if (this.f26629c != null) {
            a += wt.m25890b(3, this.f26629c.longValue());
        }
        if (this.f26630d != null) {
            a += wt.m25890b(4, this.f26630d.longValue());
        }
        return this.f26631e != null ? a + wt.m25890b(5, this.f26631e.longValue()) : a;
    }

    public final /* synthetic */ wz mo4705a(ws wsVar) {
        while (true) {
            int a = wsVar.m25865a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f26627a = Long.valueOf(wsVar.m25877f());
                    continue;
                case 16:
                    this.f26628b = Long.valueOf(wsVar.m25877f());
                    continue;
                case 24:
                    this.f26629c = Long.valueOf(wsVar.m25877f());
                    continue;
                case 32:
                    this.f26630d = Long.valueOf(wsVar.m25877f());
                    continue;
                case 40:
                    this.f26631e = Long.valueOf(wsVar.m25877f());
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
        if (this.f26627a != null) {
            wtVar.m25902a(1, this.f26627a.longValue());
        }
        if (this.f26628b != null) {
            wtVar.m25902a(2, this.f26628b.longValue());
        }
        if (this.f26629c != null) {
            wtVar.m25902a(3, this.f26629c.longValue());
        }
        if (this.f26630d != null) {
            wtVar.m25902a(4, this.f26630d.longValue());
        }
        if (this.f26631e != null) {
            wtVar.m25902a(5, this.f26631e.longValue());
        }
        super.mo4702a(wtVar);
    }
}
