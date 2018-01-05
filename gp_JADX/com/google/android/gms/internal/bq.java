package com.google.android.gms.internal;

public final class bq extends wu {
    public String f26503a;
    public Long f26504b;
    public String f26505c;
    public String f26506d;
    public String f26507e;
    public Long f26508f;
    public Long f26509g;
    public String f26510h;
    public Long f26511i;
    public String f26512j;

    public bq() {
        this.f26503a = null;
        this.f26504b = null;
        this.f26505c = null;
        this.f26506d = null;
        this.f26507e = null;
        this.f26508f = null;
        this.f26509g = null;
        this.f26510h = null;
        this.f26511i = null;
        this.f26512j = null;
        this.ai = -1;
    }

    protected final int mo4701a() {
        int a = super.mo4701a();
        if (this.f26503a != null) {
            a += wt.m25892b(1, this.f26503a);
        }
        if (this.f26504b != null) {
            a += wt.m25890b(2, this.f26504b.longValue());
        }
        if (this.f26505c != null) {
            a += wt.m25892b(3, this.f26505c);
        }
        if (this.f26506d != null) {
            a += wt.m25892b(4, this.f26506d);
        }
        if (this.f26507e != null) {
            a += wt.m25892b(5, this.f26507e);
        }
        if (this.f26508f != null) {
            a += wt.m25890b(6, this.f26508f.longValue());
        }
        if (this.f26509g != null) {
            a += wt.m25890b(7, this.f26509g.longValue());
        }
        if (this.f26510h != null) {
            a += wt.m25892b(8, this.f26510h);
        }
        if (this.f26511i != null) {
            a += wt.m25890b(9, this.f26511i.longValue());
        }
        return this.f26512j != null ? a + wt.m25892b(10, this.f26512j) : a;
    }

    public final /* synthetic */ wz mo4705a(ws wsVar) {
        while (true) {
            int a = wsVar.m25865a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f26503a = wsVar.m25872c();
                    continue;
                case 16:
                    this.f26504b = Long.valueOf(wsVar.m25877f());
                    continue;
                case 26:
                    this.f26505c = wsVar.m25872c();
                    continue;
                case 34:
                    this.f26506d = wsVar.m25872c();
                    continue;
                case 42:
                    this.f26507e = wsVar.m25872c();
                    continue;
                case 48:
                    this.f26508f = Long.valueOf(wsVar.m25877f());
                    continue;
                case 56:
                    this.f26509g = Long.valueOf(wsVar.m25877f());
                    continue;
                case 66:
                    this.f26510h = wsVar.m25872c();
                    continue;
                case 72:
                    this.f26511i = Long.valueOf(wsVar.m25877f());
                    continue;
                case 82:
                    this.f26512j = wsVar.m25872c();
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
        if (this.f26503a != null) {
            wtVar.m25904a(1, this.f26503a);
        }
        if (this.f26504b != null) {
            wtVar.m25902a(2, this.f26504b.longValue());
        }
        if (this.f26505c != null) {
            wtVar.m25904a(3, this.f26505c);
        }
        if (this.f26506d != null) {
            wtVar.m25904a(4, this.f26506d);
        }
        if (this.f26507e != null) {
            wtVar.m25904a(5, this.f26507e);
        }
        if (this.f26508f != null) {
            wtVar.m25902a(6, this.f26508f.longValue());
        }
        if (this.f26509g != null) {
            wtVar.m25902a(7, this.f26509g.longValue());
        }
        if (this.f26510h != null) {
            wtVar.m25904a(8, this.f26510h);
        }
        if (this.f26511i != null) {
            wtVar.m25902a(9, this.f26511i.longValue());
        }
        if (this.f26512j != null) {
            wtVar.m25904a(10, this.f26512j);
        }
        super.mo4702a(wtVar);
    }
}
