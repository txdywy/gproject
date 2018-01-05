package com.google.android.gms.internal;

import com.squareup.haha.perflib.HprofParser;

public final class cj extends wu {
    public static volatile cj[] f26605a;
    public Long f26606b;
    public Long f26607c;
    public Long f26608d;
    public Long f26609e;
    public Long f26610f;
    public Long f26611g;
    public Integer f26612h;
    public Long f26613i;
    public Long f26614j;
    public Long f26615k;
    public Integer f26616l;
    public Long f26617m;
    public Long f26618n;
    public Long f26619o;
    public Long f26620p;
    public Long f26621q;
    public Long f26622r;
    public Long f26623s;
    public Long f26624t;
    public Long f26625u;
    public Long f26626v;

    public cj() {
        this.f26606b = null;
        this.f26607c = null;
        this.f26608d = null;
        this.f26609e = null;
        this.f26610f = null;
        this.f26611g = null;
        this.f26613i = null;
        this.f26614j = null;
        this.f26615k = null;
        this.f26617m = null;
        this.f26618n = null;
        this.f26619o = null;
        this.f26620p = null;
        this.f26621q = null;
        this.f26622r = null;
        this.f26623s = null;
        this.f26624t = null;
        this.f26625u = null;
        this.f26626v = null;
        this.ai = -1;
    }

    public static cj[] m24248b() {
        if (f26605a == null) {
            synchronized (wy.f27652b) {
                if (f26605a == null) {
                    f26605a = new cj[0];
                }
            }
        }
        return f26605a;
    }

    protected final int mo4701a() {
        int a = super.mo4701a();
        if (this.f26606b != null) {
            a += wt.m25890b(1, this.f26606b.longValue());
        }
        if (this.f26607c != null) {
            a += wt.m25890b(2, this.f26607c.longValue());
        }
        if (this.f26608d != null) {
            a += wt.m25890b(3, this.f26608d.longValue());
        }
        if (this.f26609e != null) {
            a += wt.m25890b(4, this.f26609e.longValue());
        }
        if (this.f26610f != null) {
            a += wt.m25890b(5, this.f26610f.longValue());
        }
        if (this.f26611g != null) {
            a += wt.m25890b(6, this.f26611g.longValue());
        }
        if (this.f26612h != null) {
            a += wt.m25889b(7, this.f26612h.intValue());
        }
        if (this.f26613i != null) {
            a += wt.m25890b(8, this.f26613i.longValue());
        }
        if (this.f26614j != null) {
            a += wt.m25890b(9, this.f26614j.longValue());
        }
        if (this.f26615k != null) {
            a += wt.m25890b(10, this.f26615k.longValue());
        }
        if (this.f26616l != null) {
            a += wt.m25889b(11, this.f26616l.intValue());
        }
        if (this.f26617m != null) {
            a += wt.m25890b(12, this.f26617m.longValue());
        }
        if (this.f26618n != null) {
            a += wt.m25890b(13, this.f26618n.longValue());
        }
        if (this.f26619o != null) {
            a += wt.m25890b(14, this.f26619o.longValue());
        }
        if (this.f26620p != null) {
            a += wt.m25890b(15, this.f26620p.longValue());
        }
        if (this.f26621q != null) {
            a += wt.m25890b(16, this.f26621q.longValue());
        }
        if (this.f26622r != null) {
            a += wt.m25890b(17, this.f26622r.longValue());
        }
        if (this.f26623s != null) {
            a += wt.m25890b(18, this.f26623s.longValue());
        }
        if (this.f26624t != null) {
            a += wt.m25890b(19, this.f26624t.longValue());
        }
        if (this.f26625u != null) {
            a += wt.m25890b(20, this.f26625u.longValue());
        }
        return this.f26626v != null ? a + wt.m25890b(21, this.f26626v.longValue()) : a;
    }

    public final /* synthetic */ wz mo4705a(ws wsVar) {
        while (true) {
            int a = wsVar.m25865a();
            int j;
            int e;
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f26606b = Long.valueOf(wsVar.m25877f());
                    continue;
                case 16:
                    this.f26607c = Long.valueOf(wsVar.m25877f());
                    continue;
                case 24:
                    this.f26608d = Long.valueOf(wsVar.m25877f());
                    continue;
                case 32:
                    this.f26609e = Long.valueOf(wsVar.m25877f());
                    continue;
                case 40:
                    this.f26610f = Long.valueOf(wsVar.m25877f());
                    continue;
                case 48:
                    this.f26611g = Long.valueOf(wsVar.m25877f());
                    continue;
                case 56:
                    j = wsVar.m25881j();
                    e = wsVar.m25875e();
                    switch (e) {
                        case 0:
                        case 1:
                        case 2:
                        case 1000:
                            this.f26612h = Integer.valueOf(e);
                            break;
                        default:
                            wsVar.m25876e(j);
                            m24220a(wsVar, a);
                            continue;
                    }
                case 64:
                    this.f26613i = Long.valueOf(wsVar.m25877f());
                    continue;
                case 72:
                    this.f26614j = Long.valueOf(wsVar.m25877f());
                    continue;
                case 80:
                    this.f26615k = Long.valueOf(wsVar.m25877f());
                    continue;
                case 88:
                    j = wsVar.m25881j();
                    e = wsVar.m25875e();
                    switch (e) {
                        case 0:
                        case 1:
                        case 2:
                        case 1000:
                            this.f26616l = Integer.valueOf(e);
                            break;
                        default:
                            wsVar.m25876e(j);
                            m24220a(wsVar, a);
                            continue;
                    }
                case 96:
                    this.f26617m = Long.valueOf(wsVar.m25877f());
                    continue;
                case 104:
                    this.f26618n = Long.valueOf(wsVar.m25877f());
                    continue;
                case 112:
                    this.f26619o = Long.valueOf(wsVar.m25877f());
                    continue;
                case 120:
                    this.f26620p = Long.valueOf(wsVar.m25877f());
                    continue;
                case 128:
                    this.f26621q = Long.valueOf(wsVar.m25877f());
                    continue;
                case 136:
                    this.f26622r = Long.valueOf(wsVar.m25877f());
                    continue;
                case HprofParser.ROOT_UNREACHABLE /*144*/:
                    this.f26623s = Long.valueOf(wsVar.m25877f());
                    continue;
                case 152:
                    this.f26624t = Long.valueOf(wsVar.m25877f());
                    continue;
                case 160:
                    this.f26625u = Long.valueOf(wsVar.m25877f());
                    continue;
                case 168:
                    this.f26626v = Long.valueOf(wsVar.m25877f());
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
        if (this.f26606b != null) {
            wtVar.m25902a(1, this.f26606b.longValue());
        }
        if (this.f26607c != null) {
            wtVar.m25902a(2, this.f26607c.longValue());
        }
        if (this.f26608d != null) {
            wtVar.m25902a(3, this.f26608d.longValue());
        }
        if (this.f26609e != null) {
            wtVar.m25902a(4, this.f26609e.longValue());
        }
        if (this.f26610f != null) {
            wtVar.m25902a(5, this.f26610f.longValue());
        }
        if (this.f26611g != null) {
            wtVar.m25902a(6, this.f26611g.longValue());
        }
        if (this.f26612h != null) {
            wtVar.m25901a(7, this.f26612h.intValue());
        }
        if (this.f26613i != null) {
            wtVar.m25902a(8, this.f26613i.longValue());
        }
        if (this.f26614j != null) {
            wtVar.m25902a(9, this.f26614j.longValue());
        }
        if (this.f26615k != null) {
            wtVar.m25902a(10, this.f26615k.longValue());
        }
        if (this.f26616l != null) {
            wtVar.m25901a(11, this.f26616l.intValue());
        }
        if (this.f26617m != null) {
            wtVar.m25902a(12, this.f26617m.longValue());
        }
        if (this.f26618n != null) {
            wtVar.m25902a(13, this.f26618n.longValue());
        }
        if (this.f26619o != null) {
            wtVar.m25902a(14, this.f26619o.longValue());
        }
        if (this.f26620p != null) {
            wtVar.m25902a(15, this.f26620p.longValue());
        }
        if (this.f26621q != null) {
            wtVar.m25902a(16, this.f26621q.longValue());
        }
        if (this.f26622r != null) {
            wtVar.m25902a(17, this.f26622r.longValue());
        }
        if (this.f26623s != null) {
            wtVar.m25902a(18, this.f26623s.longValue());
        }
        if (this.f26624t != null) {
            wtVar.m25902a(19, this.f26624t.longValue());
        }
        if (this.f26625u != null) {
            wtVar.m25902a(20, this.f26625u.longValue());
        }
        if (this.f26626v != null) {
            wtVar.m25902a(21, this.f26626v.longValue());
        }
        super.mo4702a(wtVar);
    }
}
