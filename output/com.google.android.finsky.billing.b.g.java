package com.google.android.finsky.billing.b;

import android.accounts.Account;
import android.app.LoaderManager;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.h.p;
import android.text.TextUtils;
import com.google.android.finsky.aa.a;
import com.google.android.finsky.aa.m;
import com.google.android.finsky.aa.n;
import com.google.android.finsky.api.f;
import com.google.android.finsky.billing.a.h;
import com.google.android.finsky.billing.c.a;
import com.google.android.finsky.billing.common.PurchaseParams;
import com.google.android.finsky.by.c;
import com.google.android.finsky.by.o;
import com.google.android.finsky.cv.a.ax;
import com.google.android.finsky.cv.a.bl;
import com.google.android.finsky.cv.a.lg;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.dfemodel.v;
import com.google.android.finsky.dialogbuilder.b;
import com.google.android.finsky.dialogbuilder.b.a;
import com.google.android.finsky.dialogbuilder.b.b;
import com.google.android.finsky.dialogbuilder.b.h;
import com.google.android.finsky.dialogbuilder.h;
import com.google.android.finsky.providers.d;
import com.google.android.finsky.utils.ParcelableProto;
import com.google.android.finsky.utils.ab;
import com.google.android.play.dfe.api.DfeResponseVerifier;
import com.google.android.play.dfe.api.DfeResponseVerifier$DfeResponseVerifierException;
import com.google.android.play.utils.b.a;
import com.google.wireless.android.finsky.dfe.c.a.ab;
import com.google.wireless.android.finsky.dfe.c.a.ac;
import com.google.wireless.android.finsky.dfe.c.a.ae;
import com.google.wireless.android.finsky.dfe.c.a.af;
import com.google.wireless.android.finsky.dfe.c.a.bl;
import com.google.wireless.android.finsky.dfe.c.a.bm;
import com.google.wireless.android.finsky.dfe.c.a.bt;
import com.google.wireless.android.finsky.dfe.c.a.co;
import com.google.wireless.android.finsky.dfe.c.a.cw;
import com.google.wireless.android.finsky.dfe.c.a.cz;
import com.google.wireless.android.finsky.dfe.c.a.db;
import com.google.wireless.android.finsky.dfe.c.a.dt;
import com.google.wireless.android.finsky.dfe.c.a.e;
import com.google.wireless.android.finsky.dfe.c.a.eb;
import com.google.wireless.android.finsky.dfe.c.a.ee;
import com.google.wireless.android.finsky.dfe.c.a.v;
import com.google.wireless.android.finsky.dfe.c.a.w;
import com.google.wireless.android.finsky.dfe.nano.ez;

public final class com.google.android.finsky.billing.b.g implements com.google.android.finsky.dialogbuilder.f, com.google.android.finsky.dialogbuilder.i
{

    public final com.google.wireless.android.finsky.dfe.c.a.dt A;
    public final Runnable B;
    public Handler C;
    public com.google.wireless.android.finsky.dfe.c.a.bt D;
    public com.google.wireless.android.finsky.dfe.c.a.db E;
    public com.google.wireless.android.finsky.dfe.c.a.ab F;
    public com.google.android.finsky.billing.b.i G;
    public com.google.android.finsky.dialogbuilder.b H;
    public com.google.android.finsky.by.c a;
    public com.google.android.finsky.by.o b;
    public com.google.android.finsky.billing.a.h c;
    public final com.google.android.finsky.billing.b.m d;
    public final LoaderManager e;
    public final Document f;
    public final com.google.android.finsky.billing.b.a g;
    public final com.google.android.finsky.billing.b.n h;
    public final com.google.android.finsky.billing.c.a i;
    public final com.google.android.finsky.billing.b.f j;
    public final com.google.android.finsky.billing.b.c k;
    public final com.google.android.finsky.billing.b.d l;
    public final com.google.android.finsky.dialogbuilder.b.b m;
    public final String n;
    public final com.google.android.finsky.dialogbuilder.b.a o;
    public final com.google.android.finsky.dialogbuilder.b.h p;
    public final Account q;
    public final com.google.wireless.android.finsky.dfe.c.a.eb r;
    public final boolean s;
    public final String t;
    public com.google.wireless.android.finsky.dfe.c.a.w u;
    public String v;
    public String w;
    public Boolean x;
    public final Boolean y;
    public com.google.wireless.android.finsky.dfe.nano.ez z;

    g(LoaderManager p0, com.google.android.finsky.billing.b.m p1, PurchaseParams p2, Document p3, com.google.android.finsky.dialogbuilder.b.h p4, com.google.android.finsky.billing.b.a p5, com.google.android.finsky.billing.b.n p6, com.google.android.finsky.billing.c.a p7, com.google.android.finsky.billing.b.f p8, com.google.android.finsky.billing.b.d p9, com.google.android.finsky.dialogbuilder.b.a p10, com.google.android.finsky.dialogbuilder.b.b p11, String p12, Handler p13, Account p14, Bundle p15, com.google.wireless.android.finsky.dfe.c.a.eb p16, String p17, com.google.android.finsky.billing.b.c p18, boolean p19) {
        this.A = new com.google.wireless.android.finsky.dfe.c.a.dt();
        this.B = new com.google.android.finsky.billing.b.h(this);
        ((com.google.android.finsky.billing.b.e)com.google.android.finsky.providers.d.a(com.google.android.finsky.billing.b.e)).a(this);
        this.e = p0;
        p1.l = this;
        this.d = p1;
        this.p = p4;
        this.g = p5;
        this.h = p6;
        this.i = p7;
        this.j = p8;
        this.l = p9;
        this.o = p10;
        this.m = p11;
        this.k = p18;
        this.u = com.google.android.finsky.billing.b.g.a(p2);
        this.f = p3;
        if (p2 != 0) {
            this.z = p2.n;
            this.w = p2.k;
            this.x = Boolean.valueOf(p2.o);
            this.v = p2.b;
            this.y = Boolean.valueOf(p2.s);
        }
        else {
            this.z = 0;
            this.w = 0;
            this.x = Boolean.valueOf(0);
            this.v = 0;
            this.y = Boolean.valueOf(0);
        }
        this.n = p12;
        this.q = p14;
        this.C = p13;
        this.r = p16;
        this.s = p19;
        this.t = p17;
        this.A.a = this.A.a | 1;
        this.A.b = ((Integer)com.google.android.finsky.api.f.i.b()).intValue();
        this.A.a = this.A.a | 2;
        this.A.c = ((Integer)com.google.android.finsky.api.f.j.b()).intValue();
        this.A.a = this.A.a | 4;
        this.A.d = ((Float)com.google.android.finsky.api.f.k.b()).floatValue();
        if (p15 != 0) {
            if (p15.containsKey("AcquireRequestModel.showAction"))
                this.E = (com.google.wireless.android.finsky.dfe.c.a.db)ParcelableProto.a(p15, "AcquireRequestModel.showAction");
            if (p15.containsKey("AcquireRequestModel.completeAction"))
                this.a((com.google.wireless.android.finsky.dfe.c.a.bt)ParcelableProto.a(p15, "AcquireRequestModel.completeAction"));
        }
    }

    private static com.google.wireless.android.finsky.dfe.c.a.w a(PurchaseParams p0) {
  1:    if (p0 == 0) {
  5:        v0 = new com.google.wireless.android.finsky.dfe.c.a.w();
  8:        return v0;
        }
 11:    v0 = new com.google.wireless.android.finsky.dfe.c.a.w();
 16:    v0.c = p0.a;
 22:    if (p0.a()) {
 26:        v0.d = p0.d;
 32:        v0.b = v0.b | 1;
        }
 36:    if (p0.e != 0) {
 40:        if (p0.e == 0)
 47:            throw new NullPointerException();
 52:        v0.b = v0.b | 2;
 54:        v0.e = p0.e;
        }
 58:    if (p0.f != 0) {
 66:        switch (p0.f.ordinal()) {
                case 0:
 88:                v0.b(1);
159:                break;
                case 1:
131:                v0.b(2);
159:                break;
                case 2:
136:                v0.b(3);
159:                break;
                case 3:
141:                v0.b(4);
159:                break;
                case 4:
146:                v0.b(5);
159:                break;
                default:
 73:                v2 = new Object[1];
 78:                v2[0] = p0.f;
 87:                throw new IllegalArgumentException(String.format("Unexpected OfferFilter: %s", v2));
            }
        }
 93:    v0.a(p0.l);
102:    v0.b = v0.b | 16;
104:    v0.h = p0.p;
112:    v0.b = v0.b | 32;
114:    v0.i = p0.q;
118:    if (p0.r == 0)
  8:        return v0;
122:    if (p0.r == 0)
129:        throw new NullPointerException();
123:    goto 150;
154:    v0.b = v0.b | 64;
156:    v0.j = p0.r;
158:    return v0;
    }

    public final int a() {
        if (this.G == 0)
            throw new IllegalStateException("Listener never set");
        if (this.G.s != 0)
            v0 = 1;
        else if (this.G.x == 0)
            v0 = 0;
        else
            v0 = 2;
        return v0;
    }

    public final com.google.wireless.android.finsky.dfe.c.a.bl a(boolean p0) {
  0:    v0 = 0;
  5:    if (this.m.b == 0) {
 44:        v0 = this.m.a;
 46:        return v0;
        }
 11:    if (this.m.b.e != 0)
 13:        return v0;
 14:    if (p0 == 0) goto 33;
 20:    if (this.m.b.d == 0) {
 26:        if (this.m.b.c != 0)
 30:            v0 = this.m.b.c;
 37:        else if (this.m.b.b != 0)
 41:            v0 = this.m.b.b;
            else
 44:            v0 = this.m.a;
        }
 32:    return v0;
    }

    public final com.google.wireless.android.finsky.dfe.c.a.cz a(com.google.wireless.android.finsky.dfe.c.a.db p0) {
        this.E = p0;
        if (p0.d != 0) {
            this.l.a(p0.d);
            this.l.a(p0.d, new com.google.wireless.android.finsky.dfe.c.a.ee(), 0, 0);
        }
        return this.b();
    }

    public final void a(com.google.android.finsky.dialogbuilder.h p0) {
        this.G = (com.google.android.finsky.billing.b.i)this.e.initLoader(0, 0, this.d);
        this.G.B = this.c;
        this.d.m = p0;
    }

    public final void a(com.google.wireless.android.finsky.dfe.c.a.bt p0) {
        this.D = p0;
        this.C.postDelayed(this.B, (long)p0.d);
    }

    public final void a(com.google.wireless.android.finsky.dfe.c.a.cw p0) {
        v1 = 0;
        v3 = 1;
        if (this.G == 0)
            throw new IllegalStateException("Listener never set");
        this.E = 0;
        v5 = new com.google.wireless.android.finsky.dfe.c.a.ac();
        if (p0 != 0) {
            if (p0.a & 1)
                v0 = 1;
            else
                v0 = 0;
            if (v0 != 0)
                this.o.a(p0.b);
            if (p0.d != 0)
                v0 = p0.d;
            else
                v0 = 0;
            if (p0.f != 0) {
                v5.a = v5.a | 16384;
                v5.x = 1;
            }
            this.m.b = p0.c;
        }
        else
            v0 = 0;
        if (this.G.x != 0) {
            if (this.G.x.a & 1)
                v2 = 1;
            else
                v2 = 0;
            if (v2 != 0) {
                if (this.G.x.e == 0)
                    throw new NullPointerException();
                v5.a = v5.a | 1;
                v5.d = this.G.x.e;
            }
        }
        if (this.k.a != 0) {
            this.z = this.k.a.n;
            this.w = this.k.a.k;
            this.x = Boolean.valueOf(this.k.a.o);
            this.v = this.k.a.b;
            this.u = com.google.android.finsky.billing.b.g.a(this.k.a);
        }
        v5.b = this.u;
        v5.q = this.r;
        v5.a = v5.a | 8192;
        v5.w = this.s;
        v5.c = this.z;
        v5.a(this.n);
        if (this.t == 0)
            throw new NullPointerException();
        v5.a = v5.a | 512;
        v5.s = this.t;
        v5.a = v5.a | 2048;
        v5.u = this.y.booleanValue();
        if (this.w != 0) {
            if (this.w == 0)
                throw new NullPointerException();
            v5.a = v5.a | 4;
            v5.g = this.w;
        }
        if (this.x.booleanValue()) {
            v5.h = 1;
            v5.a = v5.a | 8;
        }
        if (this.f != 0 && ((this.u.f()) || this.u.e())) {
            v2 = this.f.a(this.u.e, this.u.d);
            if (v2 != 0) {
                if (v2.n == 0)
                    v2 = 1;
                else
                    v2 = 0;
                v5.a = v5.a | 32;
                v5.n = v2;
            }
        }
        if (v0 == 0) {
            if (v5.n != 0)
                v0 = new com.google.wireless.android.finsky.dfe.c.a.co().a(300).b(301);
            else if ((this.u.f()) || (this.u.e()) || v5.d())
                v0 = new com.google.wireless.android.finsky.dfe.c.a.co().a(302).b(303);
        }
        this.G.A = v0;
        v5.i = this.i.a();
        v5.j = this.p.a();
        this.p.b();
        v5.e = this.o.a();
        v5.k = this.j.e;
        if (this.g != 0) {
            if (this.g.a == 0 || this.g.a.a.c != 1)
                v0 = 0;
            else {
                v0 = new com.google.wireless.android.finsky.dfe.c.a.e();
                v0.a = v0.a | 1;
                v0.b = this.g.a.g;
                v0.a = v0.a | 2;
                v0.c = this.g.a.j;
            }
            v5.m = v0;
        }
        if (this.u.c != 0) {
            v0 = this.a.a(this.q);
            if (v0 != 0) {
                v5.a = v5.a | 128;
                v5.p = this.b.a(this.u.c, v0);
            }
        }
        if (p0 != 0) {
            if (!(p0.a & 2))
                v3 = 0;
            if (v3 != 0) {
                if (p0.g == 0)
                    throw new NullPointerException();
                v5.a = v5.a | 256;
                v5.r = p0.g;
            }
        }
        v0 = (String)com.google.android.finsky.aa.a.at.b(this.q.name).a();
        if (TextUtils.isEmpty(v0))
            v0 = 0;
        else {
            v2 = new com.google.android.finsky.cv.a.lg();
            com.google.android.finsky.utils.ab.a(v0, v2);
            v0 = v2;
        }
        if (p0 == 0 || p0.e == 0)
            v2 = this.A;
        else
            v2 = p0.e;
        if (this.j.e != 0)
            v1 = new android.support.v4.h.p(this.j.c.i, this.j.c.j);
        this.G.cancelLoad();
        this.G.n = v5;
        if (this.G.b == 0) {
            this.G.o = v0;
            this.G.p = this.v;
            this.G.q = v2;
            this.G.r = v1;
            this.G.u = 0;
            this.G.forceLoad();
            return;
        }
        try {
            v7 = this.G.b.a();
            if (v7 != 0) {
                try {
                    this.G.n.a = this.G.n.a | 4096;
                    this.G.n.v = v7;
                }
                catch (DfeResponseVerifier$DfeResponseVerifierException ex) {
                    throw new RuntimeException(ex);
                }
                this.G.o = v0;
                this.G.p = this.v;
                this.G.q = v2;
                this.G.r = v1;
                this.G.u = 0;
                this.G.forceLoad();
                return;
            }
            throw new NullPointerException();
        }
        catch (DfeResponseVerifier$DfeResponseVerifierException ex) {
            throw new RuntimeException(ex);
        }
    }

    public final com.google.wireless.android.finsky.dfe.c.a.cz b() {
        if (this.E != 0)
            v2 = this.E.b;
        else
            v2 = 0;
        if (v2 == 0) {
            v0 = 0;
            return v0;
        }
        if (this.G.x == 0) {
            v0 = 0;
            return v0;
        }
        if (this.G.s != 0 && !this.G.a())
            v0 = 0;
        else {
            v0 = 0;
            while (v0 < this.G.x.b.length) {
                if (v2.equals(this.G.x.b[v0].c)) {
                    v0 = this.G.x.b[v0].d;
                    this.m.b = v0.c;
                    return v0;
                }
                v0 = v0 + 1;
            }
            v0 = 0;
        }
        return v0;
    }

    public final com.google.wireless.android.finsky.dfe.c.a.db c() {
        return this.E;
    }

    public final com.google.wireless.android.finsky.dfe.c.a.bl d() {
        if (this.G.x == 0)
            v0 = 0;
        else
            v0 = this.G.x.h;
        return v0;
    }

    public final void e() {
        if (this.G != 0)
            this.G.cancelLoad();
    }

    public final void f() {
        if (this.F != 0) {
            if (this.G.t != 0)
                this.H.a(this.F.c);
            else
                this.H.a(this.F.a);
            this.F = 0;
        }
    }

    public final void g() {
        if (this.a() == 2)
            this.f();
    }

}
