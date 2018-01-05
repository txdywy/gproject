package com.google.android.gms.internal;

public final class cd extends wu {
    public String f26548a;
    public String f26549b;
    public String f26550c;
    public String f26551d;
    public String f26552e;

    public cd() {
        this.f26548a = null;
        this.f26549b = null;
        this.f26550c = null;
        this.f26551d = null;
        this.f26552e = null;
        this.ai = -1;
    }

    protected final int mo4701a() {
        int a = super.mo4701a();
        if (this.f26548a != null) {
            a += wt.m25892b(1, this.f26548a);
        }
        if (this.f26549b != null) {
            a += wt.m25892b(2, this.f26549b);
        }
        if (this.f26550c != null) {
            a += wt.m25892b(3, this.f26550c);
        }
        if (this.f26551d != null) {
            a += wt.m25892b(4, this.f26551d);
        }
        return this.f26552e != null ? a + wt.m25892b(5, this.f26552e) : a;
    }

    public final /* synthetic */ wz mo4705a(ws wsVar) {
        while (true) {
            int a = wsVar.m25865a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f26548a = wsVar.m25872c();
                    continue;
                case 18:
                    this.f26549b = wsVar.m25872c();
                    continue;
                case 26:
                    this.f26550c = wsVar.m25872c();
                    continue;
                case 34:
                    this.f26551d = wsVar.m25872c();
                    continue;
                case 42:
                    this.f26552e = wsVar.m25872c();
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
        if (this.f26548a != null) {
            wtVar.m25904a(1, this.f26548a);
        }
        if (this.f26549b != null) {
            wtVar.m25904a(2, this.f26549b);
        }
        if (this.f26550c != null) {
            wtVar.m25904a(3, this.f26550c);
        }
        if (this.f26551d != null) {
            wtVar.m25904a(4, this.f26551d);
        }
        if (this.f26552e != null) {
            wtVar.m25904a(5, this.f26552e);
        }
        super.mo4702a(wtVar);
    }
}
