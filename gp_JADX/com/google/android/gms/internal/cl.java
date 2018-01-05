package com.google.android.gms.internal;

public final class cl extends wu {
    public Long f26632a;
    public Integer f26633b;
    public Boolean f26634c;
    public int[] f26635d;
    public Long f26636e;

    public cl() {
        this.f26632a = null;
        this.f26633b = null;
        this.f26634c = null;
        this.f26635d = xc.f27655a;
        this.f26636e = null;
        this.ai = -1;
    }

    public final /* synthetic */ wz mo4705a(ws wsVar) {
        while (true) {
            int a = wsVar.m25865a();
            int a2;
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f26632a = Long.valueOf(wsVar.m25877f());
                    continue;
                case 16:
                    this.f26633b = Integer.valueOf(wsVar.m25875e());
                    continue;
                case 24:
                    this.f26634c = Boolean.valueOf(wsVar.m25869b());
                    continue;
                case 32:
                    a2 = xc.m25935a(wsVar, 32);
                    a = this.f26635d == null ? 0 : this.f26635d.length;
                    Object obj = new int[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f26635d, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = wsVar.m25875e();
                        wsVar.m25865a();
                        a++;
                    }
                    obj[a] = wsVar.m25875e();
                    this.f26635d = obj;
                    continue;
                case 34:
                    int c = wsVar.m25871c(wsVar.m25875e());
                    a2 = wsVar.m25881j();
                    a = 0;
                    while (wsVar.m25880i() > 0) {
                        wsVar.m25875e();
                        a++;
                    }
                    wsVar.m25876e(a2);
                    a2 = this.f26635d == null ? 0 : this.f26635d.length;
                    Object obj2 = new int[(a + a2)];
                    if (a2 != 0) {
                        System.arraycopy(this.f26635d, 0, obj2, 0, a2);
                    }
                    while (a2 < obj2.length) {
                        obj2[a2] = wsVar.m25875e();
                        a2++;
                    }
                    this.f26635d = obj2;
                    wsVar.m25873d(c);
                    continue;
                case 40:
                    this.f26636e = Long.valueOf(wsVar.m25877f());
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
        if (this.f26632a != null) {
            wtVar.m25902a(1, this.f26632a.longValue());
        }
        if (this.f26633b != null) {
            wtVar.m25901a(2, this.f26633b.intValue());
        }
        if (this.f26634c != null) {
            wtVar.m25905a(3, this.f26634c.booleanValue());
        }
        if (this.f26635d != null && this.f26635d.length > 0) {
            for (int a : this.f26635d) {
                wtVar.m25901a(4, a);
            }
        }
        if (this.f26636e != null) {
            long longValue = this.f26636e.longValue();
            wtVar.m25910c(5, 0);
            wtVar.m25907a(longValue);
        }
        super.mo4702a(wtVar);
    }

    protected final int mo4701a() {
        int i = 0;
        int a = super.mo4701a();
        if (this.f26632a != null) {
            a += wt.m25890b(1, this.f26632a.longValue());
        }
        if (this.f26633b != null) {
            a += wt.m25889b(2, this.f26633b.intValue());
        }
        if (this.f26634c != null) {
            this.f26634c.booleanValue();
            a += wt.m25896c(24) + 1;
        }
        if (this.f26635d != null && this.f26635d.length > 0) {
            int i2 = 0;
            while (i < this.f26635d.length) {
                i2 += wt.m25882a(this.f26635d[i]);
                i++;
            }
            a = (a + i2) + (this.f26635d.length * 1);
        }
        if (this.f26636e == null) {
            return a;
        }
        return a + (wt.m25896c(40) + wt.m25894b(this.f26636e.longValue()));
    }
}
