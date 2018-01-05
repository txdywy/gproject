package com.google.android.finsky.api.a;

import a.a;
import android.accounts.Account;
import android.content.Context;
import android.net.Uri;
import android.net.Uri$Builder;
import android.os.Build;
import android.support.v4.h.p;
import android.text.TextUtils;
import android.util.Base64;
import com.android.volley.a;
import com.android.volley.n;
import com.android.volley.r;
import com.android.volley.w;
import com.android.volley.x;
import com.android.volley.z;
import com.google.android.finsky.api.VoucherParams;
import com.google.android.finsky.api.d;
import com.google.android.finsky.api.f;
import com.google.android.finsky.api.g;
import com.google.android.finsky.api.j;
import com.google.android.finsky.api.l;
import com.google.android.finsky.api.p;
import com.google.android.finsky.api.v;
import com.google.android.finsky.api.w;
import com.google.android.finsky.ba.c;
import com.google.android.finsky.ba.e;
import com.google.android.finsky.c.a;
import com.google.android.finsky.cn.a;
import com.google.android.finsky.ct.a;
import com.google.android.finsky.cv.a.ax;
import com.google.android.finsky.cv.a.ip;
import com.google.android.finsky.cv.a.jd;
import com.google.android.finsky.cv.a.jn;
import com.google.android.finsky.cv.a.jo;
import com.google.android.finsky.cv.a.kd;
import com.google.android.finsky.cv.a.lb;
import com.google.android.finsky.cv.a.lc;
import com.google.android.finsky.cv.a.lg;
import com.google.android.finsky.cv.a.n;
import com.google.android.finsky.dg.a;
import com.google.android.finsky.dx.a;
import com.google.android.finsky.providers.d;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.play.utils.b.a;
import com.google.protobuf.nano.i;
import com.google.wireless.android.b.a.a;
import com.google.wireless.android.b.a.b;
import com.google.wireless.android.finsky.a.a.bc;
import com.google.wireless.android.finsky.a.a.bd;
import com.google.wireless.android.finsky.dfe.a.a.b;
import com.google.wireless.android.finsky.dfe.a.a.f;
import com.google.wireless.android.finsky.dfe.a.a.g;
import com.google.wireless.android.finsky.dfe.a.a.h;
import com.google.wireless.android.finsky.dfe.a.a.i;
import com.google.wireless.android.finsky.dfe.a.a.j;
import com.google.wireless.android.finsky.dfe.a.a.l;
import com.google.wireless.android.finsky.dfe.a.a.m;
import com.google.wireless.android.finsky.dfe.a.a.p;
import com.google.wireless.android.finsky.dfe.a.a.q;
import com.google.wireless.android.finsky.dfe.b.b.a.b;
import com.google.wireless.android.finsky.dfe.b.b.a.c;
import com.google.wireless.android.finsky.dfe.c.a.ac;
import com.google.wireless.android.finsky.dfe.c.a.ae;
import com.google.wireless.android.finsky.dfe.c.a.al;
import com.google.wireless.android.finsky.dfe.c.a.ao;
import com.google.wireless.android.finsky.dfe.c.a.ap;
import com.google.wireless.android.finsky.dfe.c.a.as;
import com.google.wireless.android.finsky.dfe.c.a.at;
import com.google.wireless.android.finsky.dfe.c.a.bc;
import com.google.wireless.android.finsky.dfe.c.a.be;
import com.google.wireless.android.finsky.dfe.c.a.dt;
import com.google.wireless.android.finsky.dfe.c.a.dy;
import com.google.wireless.android.finsky.dfe.c.a.dz;
import com.google.wireless.android.finsky.dfe.c.a.l;
import com.google.wireless.android.finsky.dfe.d.a.a;
import com.google.wireless.android.finsky.dfe.d.a.b;
import com.google.wireless.android.finsky.dfe.d.a.c;
import com.google.wireless.android.finsky.dfe.e.a.b;
import com.google.wireless.android.finsky.dfe.e.a.c;
import com.google.wireless.android.finsky.dfe.e.a.d;
import com.google.wireless.android.finsky.dfe.e.a.e;
import com.google.wireless.android.finsky.dfe.g.a.an;
import com.google.wireless.android.finsky.dfe.h.a.aa;
import com.google.wireless.android.finsky.dfe.h.a.ab;
import com.google.wireless.android.finsky.dfe.h.a.af;
import com.google.wireless.android.finsky.dfe.h.a.ag;
import com.google.wireless.android.finsky.dfe.h.a.aj;
import com.google.wireless.android.finsky.dfe.h.a.am;
import com.google.wireless.android.finsky.dfe.h.a.an;
import com.google.wireless.android.finsky.dfe.h.a.ao;
import com.google.wireless.android.finsky.dfe.h.a.aq;
import com.google.wireless.android.finsky.dfe.h.a.ar;
import com.google.wireless.android.finsky.dfe.h.a.e;
import com.google.wireless.android.finsky.dfe.h.a.f;
import com.google.wireless.android.finsky.dfe.h.a.h;
import com.google.wireless.android.finsky.dfe.h.a.i;
import com.google.wireless.android.finsky.dfe.h.a.l;
import com.google.wireless.android.finsky.dfe.h.a.n;
import com.google.wireless.android.finsky.dfe.h.a.p;
import com.google.wireless.android.finsky.dfe.h.a.w;
import com.google.wireless.android.finsky.dfe.h.a.z;
import com.google.wireless.android.finsky.dfe.j.a.a;
import com.google.wireless.android.finsky.dfe.j.a.b;
import com.google.wireless.android.finsky.dfe.k.a.a;
import com.google.wireless.android.finsky.dfe.nano.ContentFilters$ContentFilterSettingsResponse;
import com.google.wireless.android.finsky.dfe.nano.a;
import com.google.wireless.android.finsky.dfe.nano.ak;
import com.google.wireless.android.finsky.dfe.nano.ap;
import com.google.wireless.android.finsky.dfe.nano.aq;
import com.google.wireless.android.finsky.dfe.nano.au;
import com.google.wireless.android.finsky.dfe.nano.aw;
import com.google.wireless.android.finsky.dfe.nano.ax;
import com.google.wireless.android.finsky.dfe.nano.b;
import com.google.wireless.android.finsky.dfe.nano.ba;
import com.google.wireless.android.finsky.dfe.nano.bc;
import com.google.wireless.android.finsky.dfe.nano.bj;
import com.google.wireless.android.finsky.dfe.nano.bl;
import com.google.wireless.android.finsky.dfe.nano.br;
import com.google.wireless.android.finsky.dfe.nano.bs;
import com.google.wireless.android.finsky.dfe.nano.bv;
import com.google.wireless.android.finsky.dfe.nano.bw;
import com.google.wireless.android.finsky.dfe.nano.bx;
import com.google.wireless.android.finsky.dfe.nano.by;
import com.google.wireless.android.finsky.dfe.nano.ca;
import com.google.wireless.android.finsky.dfe.nano.cj;
import com.google.wireless.android.finsky.dfe.nano.ck;
import com.google.wireless.android.finsky.dfe.nano.cl;
import com.google.wireless.android.finsky.dfe.nano.co;
import com.google.wireless.android.finsky.dfe.nano.cq;
import com.google.wireless.android.finsky.dfe.nano.cs;
import com.google.wireless.android.finsky.dfe.nano.cu;
import com.google.wireless.android.finsky.dfe.nano.cv;
import com.google.wireless.android.finsky.dfe.nano.cw;
import com.google.wireless.android.finsky.dfe.nano.cz;
import com.google.wireless.android.finsky.dfe.nano.da;
import com.google.wireless.android.finsky.dfe.nano.dd;
import com.google.wireless.android.finsky.dfe.nano.de;
import com.google.wireless.android.finsky.dfe.nano.dm;
import com.google.wireless.android.finsky.dfe.nano.do;
import com.google.wireless.android.finsky.dfe.nano.dp;
import com.google.wireless.android.finsky.dfe.nano.dq;
import com.google.wireless.android.finsky.dfe.nano.dr;
import com.google.wireless.android.finsky.dfe.nano.ds;
import com.google.wireless.android.finsky.dfe.nano.ea;
import com.google.wireless.android.finsky.dfe.nano.eg;
import com.google.wireless.android.finsky.dfe.nano.ek;
import com.google.wireless.android.finsky.dfe.nano.el;
import com.google.wireless.android.finsky.dfe.nano.et;
import com.google.wireless.android.finsky.dfe.nano.ex;
import com.google.wireless.android.finsky.dfe.nano.ey;
import com.google.wireless.android.finsky.dfe.nano.ez;
import com.google.wireless.android.finsky.dfe.nano.fa;
import com.google.wireless.android.finsky.dfe.nano.fg;
import com.google.wireless.android.finsky.dfe.nano.fh;
import com.google.wireless.android.finsky.dfe.nano.fi;
import com.google.wireless.android.finsky.dfe.nano.fl;
import com.google.wireless.android.finsky.dfe.nano.fq;
import com.google.wireless.android.finsky.dfe.nano.fr;
import com.google.wireless.android.finsky.dfe.nano.ft;
import com.google.wireless.android.finsky.dfe.nano.fv;
import com.google.wireless.android.finsky.dfe.nano.fw;
import com.google.wireless.android.finsky.dfe.nano.ga;
import com.google.wireless.android.finsky.dfe.nano.gb;
import com.google.wireless.android.finsky.dfe.nano.gf;
import com.google.wireless.android.finsky.dfe.nano.gg;
import com.google.wireless.android.finsky.dfe.nano.gp;
import com.google.wireless.android.finsky.dfe.nano.gq;
import com.google.wireless.android.finsky.dfe.nano.gr;
import com.google.wireless.android.finsky.dfe.nano.gt;
import com.google.wireless.android.finsky.dfe.nano.gu;
import com.google.wireless.android.finsky.dfe.nano.gv;
import com.google.wireless.android.finsky.dfe.nano.y;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map$Entry;
import java.util.Set;

public final class com.google.android.finsky.api.a.d implements com.google.android.finsky.api.c, com.google.android.finsky.api.p
{

    public static final int A;
    public static final boolean a;
    public static final boolean b;
    public static final int c;
    public static final int d;
    public static final int e;
    public static final int f;
    public static final float g;
    public static final int h;
    public static final int i;
    public static final float j;
    public static final int k;
    public static final int l;
    public static final int m;
    public static final float n;
    public static final int o;
    public static final int p;
    public static final float q;
    public static final int r;
    public static final int s;
    public static final float t;
    public static final int u;
    public static final int v;
    public static final float w;
    public static final int x;
    public static final int y;
    public static final float z;
    public com.google.android.finsky.api.a.cr B;
    public com.google.android.finsky.cn.a C;
    public com.google.android.finsky.dx.a D;
    public com.google.android.finsky.ba.c E;
    public a.a F;
    public Context G;
    public com.google.android.finsky.api.l H;
    public com.google.android.finsky.ct.a I;
    public com.google.android.finsky.dg.a J;
    public final com.google.android.finsky.api.a.b K;
    public List L;
    public final boolean M;

    static {
        com.google.android.finsky.api.a.d.a = ((Boolean)com.google.android.finsky.api.f.c.b()).booleanValue();
        com.google.android.finsky.api.a.d.b = ((Boolean)com.google.android.finsky.api.f.d.b()).booleanValue();
        com.google.android.finsky.api.a.d.c = ((Integer)com.google.android.finsky.api.f.l.b()).intValue();
        com.google.android.finsky.api.a.d.d = ((Integer)com.google.android.finsky.api.f.m.b()).intValue();
        com.google.android.finsky.api.a.d.e = ((Integer)com.google.android.finsky.api.f.n.b()).intValue();
        com.google.android.finsky.api.a.d.f = ((Integer)com.google.android.finsky.api.f.o.b()).intValue();
        com.google.android.finsky.api.a.d.g = ((Float)com.google.android.finsky.api.f.p.b()).floatValue();
        com.google.android.finsky.api.a.d.h = ((Integer)com.google.android.finsky.api.f.q.b()).intValue();
        com.google.android.finsky.api.a.d.i = ((Integer)com.google.android.finsky.api.f.r.b()).intValue();
        com.google.android.finsky.api.a.d.j = ((Float)com.google.android.finsky.api.f.s.b()).floatValue();
        com.google.android.finsky.api.a.d.k = ((Integer)com.google.android.finsky.api.f.F.b()).intValue();
        com.google.android.finsky.api.a.d.l = ((Integer)com.google.android.finsky.api.f.t.b()).intValue();
        com.google.android.finsky.api.a.d.m = ((Integer)com.google.android.finsky.api.f.u.b()).intValue();
        com.google.android.finsky.api.a.d.n = ((Float)com.google.android.finsky.api.f.v.b()).floatValue();
        com.google.android.finsky.api.a.d.o = ((Integer)com.google.android.finsky.api.f.w.b()).intValue();
        com.google.android.finsky.api.a.d.p = ((Integer)com.google.android.finsky.api.f.x.b()).intValue();
        com.google.android.finsky.api.a.d.q = ((Float)com.google.android.finsky.api.f.y.b()).floatValue();
        com.google.android.finsky.api.a.d.r = ((Integer)com.google.android.finsky.api.f.z.b()).intValue();
        com.google.android.finsky.api.a.d.s = ((Integer)com.google.android.finsky.api.f.A.b()).intValue();
        com.google.android.finsky.api.a.d.t = ((Float)com.google.android.finsky.api.f.B.b()).floatValue();
        com.google.android.finsky.api.a.d.u = ((Integer)com.google.android.finsky.api.f.C.b()).intValue();
        com.google.android.finsky.api.a.d.v = ((Integer)com.google.android.finsky.api.f.D.b()).intValue();
        com.google.android.finsky.api.a.d.w = ((Float)com.google.android.finsky.api.f.E.b()).floatValue();
        com.google.android.finsky.api.a.d.x = ((Integer)com.google.android.finsky.api.f.S.b()).intValue();
        com.google.android.finsky.api.a.d.y = ((Integer)com.google.android.finsky.api.f.T.b()).intValue();
        com.google.android.finsky.api.a.d.z = ((Float)com.google.android.finsky.api.f.U.b()).floatValue();
        com.google.android.finsky.api.a.d.A = ((Integer)com.google.android.finsky.api.f.G.b()).intValue();
    }

    d(com.google.android.finsky.api.a.b p0) {
        ((com.google.android.finsky.api.a.a)com.google.android.finsky.providers.d.a(com.google.android.finsky.api.a.a)).a(this);
        this.K = p0;
        this.L = new ArrayList();
        if (p0.g != 0 && p0.g.a(12636874))
            v0 = 1;
        else
            v0 = 0;
        this.M = v0;
    }

    private static void a(com.google.android.finsky.api.a.co p0, com.google.wireless.android.finsky.dfe.c.a.al p1) {
        p0.a("pcap", String.valueOf(p1.b));
        if (p1.a & 2)
            v0 = 1;
        else
            v0 = 0;
        if (v0 != 0)
            p0.a("pclats", String.valueOf(p1.c));
    }

    private final void a(com.google.android.finsky.api.a.cp p0) {
        if (!this.E.dj().a(12639041))
            p0.F = 1;
    }

    private static void a(com.google.android.finsky.api.a.cp p0, Collection p1) {
        if (p1 != 0 && !p1.isEmpty() && ((Boolean)com.google.android.finsky.api.f.K.b()).booleanValue()) {
            if (p0.z == 0)
                p0.z = new HashMap();
            p0.z.put("X-DFE-Client-Has-Vouchers", "true");
            if (!TextUtils.isEmpty(0)) {
                if (p0.A == 0)
                    p0.A = new StringBuilder();
                p0.A.append("/").append("X-DFE-Client-Has-Vouchers").append("=").append(0);
            }
            if (p1.size() <= ((Integer)com.google.android.finsky.api.f.L.b()).intValue()) {
                v1 = new StringBuilder();
                v2 = p1.iterator();
                while (v2.hasNext()) {
                    if (v1.length() > 0)
                        v1.append(44);
                    v1.append(Uri.encode((String)v2.next()));
                }
                if (p0.z == 0)
                    p0.z = new HashMap();
                p0.z.put("X-DFE-Vouchers-Backend-Docids-CSV", v1.toString());
                if (!TextUtils.isEmpty(0)) {
                    if (p0.A == 0)
                        p0.A = new StringBuilder();
                    p0.A.append("/").append("X-DFE-Vouchers-Backend-Docids-CSV").append("=").append(0);
                }
            }
        }
    }

    private final com.google.android.finsky.api.a.cp b(String p0, boolean p1, boolean p2, String p3, Collection p4, com.android.volley.x p5, com.android.volley.w p6) {
        v1 = this.B.a(p0, this.K, this.k(), p5, p6, this);
        if (!TextUtils.isEmpty(p3) && this.E.dj().a(12620398)) {
            v0 = this.C.g(p3);
            if (v0 != -1) {
                if (v1.z == 0)
                    v1.z = new HashMap();
                v1.z.put("X-App-Version-Code", Integer.toString(v0));
                if (!TextUtils.isEmpty(0)) {
                    if (v1.A == 0)
                        v1.A = new StringBuilder();
                    v1.A.append("/").append("X-App-Version-Code").append("=").append(0);
                }
            }
        }
        if (p1 != 0) {
            if (v1.z == 0)
                v1.z = new HashMap();
            v1.z.put("X-DFE-No-Prefetch", "true");
            if (!TextUtils.isEmpty(0)) {
                if (v1.A == 0)
                    v1.A = new StringBuilder();
                v1.A.append("/").append("X-DFE-No-Prefetch").append("=").append(0);
            }
        }
        if (p2 != 0 || this.E.dj().a(12631400))
            v0 = 1;
        else
            v0 = 0;
        v1.F = v0;
        com.google.android.finsky.api.a.d.a(v1, p4);
        return v1;
    }

    private final void b(com.google.android.finsky.api.a.cp p0) {
        if (com.google.android.finsky.api.a.d.a != 0) {
            if (this.K.u == 0)
                v0 = 0;
            else
                v0 = this.K.u.c();
            if (!TextUtils.isEmpty(v0)) {
                if (p0.z == 0)
                    p0.z = new HashMap();
                p0.z.put("X-Public-Android-Id", v0);
                if (!TextUtils.isEmpty(0)) {
                    if (p0.A == 0)
                        p0.A = new StringBuilder();
                    p0.A.append("/").append("X-Public-Android-Id").append("=").append(0);
                }
            }
        }
        if (com.google.android.finsky.api.a.d.b != 0)
            p0.s();
    }

    private final com.google.android.finsky.api.j c(com.google.android.finsky.api.a.cp p0) {
        p0.G = new com.google.android.finsky.api.a.cw(this.K.f);
        return (com.google.android.finsky.api.j)((com.android.volley.r)this.F.a()).a(p0);
    }

    private final com.google.android.finsky.api.a.cp e(String p0, boolean p1, com.android.volley.x p2, com.android.volley.w p3) {
        v0 = this.B.a(p0, this.K, this.m(), p2, p3, this);
        if (p1 != 0)
            v0.s();
        this.a(v0);
        return v0;
    }

    private final com.google.android.finsky.api.a.cz g() {
        if (this.M != 0)
            v0 = new com.google.android.finsky.api.a.z();
        else
            v0 = new com.google.android.finsky.api.a.cy(com.google.wireless.android.finsky.dfe.c.a.ae);
        return v0;
    }

    private final com.google.android.finsky.api.a.cz h() {
        if (this.M != 0)
            v0 = new com.google.android.finsky.api.a.h();
        else
            v0 = new com.google.android.finsky.api.a.cy(com.google.wireless.android.finsky.dfe.nano.au);
        return v0;
    }

    private final com.google.android.finsky.api.a.cz i() {
        if (this.M != 0)
            v0 = new com.google.android.finsky.api.a.o();
        else
            v0 = new com.google.android.finsky.api.a.cy(ContentFilters$ContentFilterSettingsResponse);
        return v0;
    }

    private final com.google.android.finsky.api.a.cz j() {
        if (this.M != 0)
            v0 = new com.google.android.finsky.api.a.u();
        else
            v0 = new com.google.android.finsky.api.a.cy(com.google.wireless.android.finsky.dfe.nano.bs);
        return v0;
    }

    private final com.google.android.finsky.api.a.cz k() {
        if (this.M != 0)
            v0 = new com.google.android.finsky.api.a.v();
        else
            v0 = new com.google.android.finsky.api.a.cy(com.google.wireless.android.finsky.dfe.nano.by);
        return v0;
    }

    private final com.google.android.finsky.api.a.cz l() {
        if (this.M != 0)
            v0 = new com.google.android.finsky.api.a.ak();
        else
            v0 = new com.google.android.finsky.api.a.cy(com.google.wireless.android.finsky.dfe.nano.co);
        return v0;
    }

    private final com.google.android.finsky.api.a.cz m() {
        if (this.M != 0)
            v0 = new com.google.android.finsky.api.a.ar();
        else
            v0 = new com.google.android.finsky.api.a.cy(com.google.wireless.android.finsky.dfe.nano.cw);
        return v0;
    }

    private final com.google.android.finsky.api.a.cz n() {
        if (this.M != 0)
            v0 = new com.google.android.finsky.api.a.aw();
        else
            v0 = new com.google.android.finsky.api.a.cy(com.google.wireless.android.finsky.dfe.nano.dp);
        return v0;
    }

    private final com.google.android.finsky.api.a.cz o() {
        if (this.M != 0)
            v0 = new com.google.android.finsky.api.a.az();
        else
            v0 = new com.google.android.finsky.api.a.cy(com.google.wireless.android.finsky.dfe.a.a.m);
        return v0;
    }

    private final com.google.android.finsky.api.a.cz p() {
        if (this.M != 0)
            v0 = new com.google.android.finsky.api.a.ba();
        else
            v0 = new com.google.android.finsky.api.a.cy(com.google.wireless.android.finsky.dfe.nano.ea);
        return v0;
    }

    private final com.google.android.finsky.api.a.cz q() {
        if (this.M != 0)
            v0 = new com.google.android.finsky.api.a.bj();
        else
            v0 = new com.google.android.finsky.api.a.cy(com.google.wireless.android.finsky.dfe.nano.ft);
        return v0;
    }

    private final com.google.android.finsky.api.a.cz r() {
        if (this.M != 0)
            v0 = new com.google.android.finsky.api.a.bt();
        else
            v0 = new com.google.android.finsky.api.a.cy(com.google.wireless.android.finsky.dfe.g.a.an);
        return v0;
    }

    private final com.google.android.finsky.api.a.cz s() {
        if (this.M != 0)
            v0 = new com.google.android.finsky.api.a.bv();
        else
            v0 = new com.google.android.finsky.api.a.cy(com.google.wireless.android.finsky.dfe.nano.gp);
        return v0;
    }

    private final com.google.android.finsky.api.a.cz t() {
        if (this.M != 0)
            v0 = new com.google.android.finsky.api.a.cf();
        else
            v0 = new com.google.android.finsky.api.a.cy(com.google.wireless.android.finsky.dfe.a.a.g);
        return v0;
    }

    private final com.google.android.finsky.api.a.cx u() {
        return new com.google.android.finsky.api.a.cx(com.google.android.finsky.api.a.d.d, 0, 0, this.K);
    }

    private final com.google.android.finsky.api.a.cx v() {
        return new com.google.android.finsky.api.a.cx(com.google.android.finsky.api.a.d.c, 0, 0, this.K);
    }

    private final com.android.volley.z w() {
        v0 = this.E.dj();
        if (v0.a(12602810))
            v0 = new com.google.android.finsky.api.a.da(2500, this.K);
        else if (v0.a(12602812))
            v0 = new com.google.android.finsky.api.a.da(3500, this.K);
        else if (v0.a(12602814))
            v0 = new com.google.android.finsky.api.a.da(5000, this.K);
        else if (v0.a(12602816))
            v0 = new com.google.android.finsky.api.a.da(7000, this.K);
        else
            v0 = this.v();
        return v0;
    }

    private final com.google.android.finsky.api.a.cx x() {
        return new com.google.android.finsky.api.a.cx(com.google.android.finsky.api.a.d.u, com.google.android.finsky.api.a.d.v, com.google.android.finsky.api.a.d.w, this.K);
    }

    private final String y() {
        if (this.J != 0 && this.J.a())
            v0 = "deferred";
        else
            v0 = "setup_wizard";
        return v0;
    }

    private final boolean z() {
        return this.E.dj().a(12642050);
    }

    public final com.android.volley.a a() {
        return this.K.i;
    }

    public final com.android.volley.n a(int p0, String p1, String p2, String p3, com.google.wireless.android.finsky.dfe.nano.ex p4, com.android.volley.x p5, com.android.volley.w p6) {
        v1 = com.google.android.finsky.api.g.Q.buildUpon().appendQueryParameter("bav", Integer.toString(p0)).appendQueryParameter("shpn", p1).appendQueryParameter("iabt", p2);
        if (!TextUtils.isEmpty(p3))
            v1.appendQueryParameter("ctntkn", p3);
        if (p4 != 0)
            v1.appendQueryParameter("iabx", Base64.encodeToString(com.google.protobuf.nano.i.a(p4), 10));
        if (this.M != 0)
            v3 = new com.google.android.finsky.api.a.an();
        else
            v3 = new com.google.android.finsky.api.a.cy(com.google.wireless.android.finsky.dfe.nano.ey);
        return this.c(this.B.a(v1.toString(), this.K, v3, p5, p6, this));
    }

    public final com.android.volley.n a(int p0, boolean p1, com.android.volley.x p2, com.android.volley.w p3) {
        if (this.M != 0)
            v3 = new com.google.android.finsky.api.a.f();
        else
            v3 = new com.google.android.finsky.api.a.cy(com.google.wireless.android.finsky.dfe.h.a.aj);
        v1 = this.B.c(com.google.android.finsky.api.g.ah.toString(), this.K, v3, p2, p3, this);
        if (p0 != 0)
            v1.a("c", Integer.toString(p0));
        if (p1 != 0)
            v0 = "1";
        else
            v0 = "0";
        v1.a("sl", v0);
        return ((com.android.volley.r)this.F.a()).a(v1);
    }

    public final com.android.volley.n a(long p0, com.android.volley.x p2, com.android.volley.w p3) {
        v1 = com.google.android.finsky.api.g.z.buildUpon();
        v1.appendQueryParameter("raid", Long.toString(p0));
        if (this.M != 0)
            v3 = new com.google.android.finsky.api.a.ad();
        else
            v3 = new com.google.android.finsky.api.a.cy(com.google.wireless.android.finsky.dfe.nano.fr);
        v1 = this.B.a(v1.toString(), this.K, v3, p2, p3, this);
        v1.C = 1;
        v1.m = new com.google.android.finsky.api.a.cx(com.google.android.finsky.api.a.d.h, com.google.android.finsky.api.a.d.i, com.google.android.finsky.api.a.d.j, this.K);
        return ((com.android.volley.r)this.F.a()).a(v1);
    }

    public final com.android.volley.n a(long p0, String p2, com.android.volley.x p3, com.android.volley.w p4) {
        v1 = com.google.android.finsky.api.g.am.buildUpon();
        if (!TextUtils.isEmpty(p2))
            v1.appendQueryParameter("consistency_token", p2);
        v1.appendQueryParameter("t", Long.toString(p0));
        if (this.M != 0)
            v3 = new com.google.android.finsky.api.a.ai();
        else
            v3 = new com.google.android.finsky.api.a.cy(com.google.wireless.android.finsky.dfe.h.a.aa);
        return ((com.android.volley.r)this.F.a()).a(this.B.a(v1.build().toString(), this.K, v3, p3, p4, this));
    }

    public final com.android.volley.n a(com.android.volley.x p0, com.android.volley.w p1) {
        v2 = com.google.android.finsky.api.g.c.buildUpon();
        if (this.K.a() == 0)
            v2.appendQueryParameter("ex", "1");
        if (this.M != 0)
            v4 = new com.google.android.finsky.api.a.bo();
        else
            v4 = new com.google.android.finsky.api.a.cy(com.google.wireless.android.finsky.dfe.nano.gb);
        v1 = this.B.a(com.google.android.finsky.api.g.a, v2.toString(), this.K, v4, p0, p1, this);
        v1.i = 0;
        return ((com.android.volley.r)this.F.a()).a(v1);
    }

    public final com.android.volley.n a(com.android.volley.x p0, com.android.volley.w p1, boolean p2, boolean p3) {
        v1 = com.google.android.finsky.api.g.X.buildUpon();
        if (p2 != 0)
            v1.appendQueryParameter("at", Boolean.TRUE.toString());
        if (p3 != 0)
            v1.appendQueryParameter("fcfo", "1");
        return ((com.android.volley.r)this.F.a()).a(this.B.a(v1.build().toString(), this.K, this.i(), p0, p1, this));
    }

    public final com.android.volley.n a(com.google.android.finsky.cv.a.lg p0, int p1, com.android.volley.x p2, com.android.volley.w p3) {
        v1 = com.google.android.finsky.api.g.ab.buildUpon();
        if (p1 != 7)
            v1.appendQueryParameter("ddt", String.valueOf(p1));
        if (this.M != 0)
            v3 = new com.google.android.finsky.api.a.am();
        else
            v3 = new com.google.android.finsky.api.a.cy(com.google.wireless.android.finsky.dfe.nano.cq);
        v1 = this.B.a(v1.build().toString(), this.K, v3, p2, p3, this);
        v1.D = 1;
        v1.C = 1;
        v1.B = p0;
        return ((com.android.volley.r)this.F.a()).a(v1);
    }

    public final com.android.volley.n a(com.google.wireless.android.b.a.b p0, com.android.volley.x p1, com.android.volley.w p2) {
        v2 = new com.google.wireless.android.finsky.dfe.nano.cj();
        if (p0 != 0)
            v2.a = p0;
        if (this.M != 0)
            v4 = new com.google.android.finsky.api.a.x();
        else
            v4 = new com.google.android.finsky.api.a.cy(com.google.wireless.android.finsky.dfe.nano.ck);
        v1 = this.B.a(com.google.android.finsky.api.g.T.toString(), v2, this.K, v4, p1, p2, this);
        v1.m = this.x();
        v1.F = 0;
        if (v1.z == 0)
            v1.z = new HashMap();
        v1.z.put("X-DFE-Setup-Flow-Type", this.y());
        if (!TextUtils.isEmpty(0)) {
            if (v1.A == 0)
                v1.A = new StringBuilder();
            v1.A.append("/").append("X-DFE-Setup-Flow-Type").append("=").append(0);
        }
        return ((com.android.volley.r)this.F.a()).a(v1);
    }

    public final com.android.volley.n a(com.google.wireless.android.b.a.b p0, String p1, com.google.wireless.android.b.a.a p2, com.google.wireless.android.finsky.dfe.nano.gt p3, com.google.wireless.android.finsky.dfe.e.a.e p4, com.android.volley.x p5, com.android.volley.w p6) {
        v2 = new com.google.wireless.android.finsky.dfe.nano.gu();
        if (p0 != 0)
            v2.b = p0;
        if (p1 != 0) {
            if (p1 == 0)
                throw new NullPointerException();
            v2.a = v2.a | 1;
            v2.d = p1;
        }
        v2.c = p2;
        v2.e = p3;
        v2.f = p4;
        if (this.M != 0)
            v4 = new com.google.android.finsky.api.a.cd();
        else
            v4 = new com.google.android.finsky.api.a.cy(com.google.wireless.android.finsky.dfe.nano.gv);
        v1 = this.B.a(com.google.android.finsky.api.g.R.toString(), v2, this.K, v4, p5, p6, this);
        v1.m = this.v();
        return ((com.android.volley.r)this.F.a()).a(v1);
    }

    public final com.android.volley.n a(com.google.wireless.android.finsky.a.a.bc p0, com.android.volley.x p1, com.android.volley.w p2) {
        if (this.M != 0)
            v4 = new com.google.android.finsky.api.a.cb();
        else
            v4 = new com.google.android.finsky.api.a.cy(com.google.wireless.android.finsky.a.a.bd);
        v0 = this.B.a(com.google.android.finsky.api.g.l.toString(), p0, this.K, v4, p1, p2, this);
        v0.m = this.v();
        return this.c(v0);
    }

    public final com.android.volley.n a(com.google.wireless.android.finsky.dfe.b.b.a.b p0, com.android.volley.x p1, com.android.volley.w p2) {
        if (this.M != 0)
            v4 = new com.google.android.finsky.api.a.cg();
        else
            v4 = new com.google.android.finsky.api.a.cy(com.google.wireless.android.finsky.dfe.b.b.a.c);
        v1 = this.B.a(com.google.android.finsky.api.g.aB.toString(), p0, this.K, v4, p1, p2, this);
        v1.i = 0;
        return ((com.android.volley.r)this.F.a()).a(v1);
    }

    public final com.android.volley.n a(com.google.wireless.android.finsky.dfe.c.a.ao p0, com.android.volley.x p1, com.android.volley.w p2) {
        if (this.M != 0)
            v4 = new com.google.android.finsky.api.a.bq();
        else
            v4 = new com.google.android.finsky.api.a.cy(com.google.wireless.android.finsky.dfe.c.a.ap);
        v1 = this.B.a(com.google.android.finsky.api.g.H.toString(), p0, this.K, v4, p1, p2, this);
        v1.m = this.w();
        v1.i = 0;
        v1.F = 0;
        return ((com.android.volley.r)this.F.a()).a(v1);
    }

    public final com.android.volley.n a(com.google.wireless.android.finsky.dfe.c.a.as p0, com.android.volley.x p1, com.android.volley.w p2) {
        if (this.M != 0)
            v4 = new com.google.android.finsky.api.a.bz();
        else
            v4 = new com.google.android.finsky.api.a.cy(com.google.wireless.android.finsky.dfe.c.a.at);
        v0 = this.B.a(com.google.android.finsky.api.g.k.toString(), p0, this.K, v4, p1, p2, this);
        v0.m = this.v();
        return this.c(v0);
    }

    public final com.android.volley.n a(com.google.wireless.android.finsky.dfe.c.a.bc p0, com.android.volley.x p1, com.android.volley.w p2) {
        if (this.M != 0)
            v4 = new com.google.android.finsky.api.a.s();
        else
            v4 = new com.google.android.finsky.api.a.cy(com.google.wireless.android.finsky.dfe.c.a.be);
        return ((com.android.volley.r)this.F.a()).a(this.B.a(com.google.android.finsky.api.g.az.toString(), p0, this.K, v4, p1, p2, this));
    }

    public final com.android.volley.n a(com.google.wireless.android.finsky.dfe.c.a.dy p0, com.android.volley.x p1, com.android.volley.w p2) {
        if (this.M != 0)
            v4 = new com.google.android.finsky.api.a.be();
        else
            v4 = new com.google.android.finsky.api.a.cy(com.google.wireless.android.finsky.dfe.c.a.dz);
        v0 = this.B.a(com.google.android.finsky.api.g.m.toString(), p0, this.K, v4, p1, p2, this);
        v0.m = this.v();
        return this.c(v0);
    }

    public final com.android.volley.n a(com.google.wireless.android.finsky.dfe.e.a.d p0, e[] p1, com.android.volley.x p2, com.android.volley.w p3) {
        v2 = new com.google.wireless.android.finsky.dfe.e.a.b();
        v2.a = p0;
        if (p1 != 0)
            v2.b = p1;
        if (this.M != 0)
            v4 = new com.google.android.finsky.api.a.ce();
        else
            v4 = new com.google.android.finsky.api.a.cy(com.google.wireless.android.finsky.dfe.e.a.c);
        v1 = this.B.a(com.google.android.finsky.api.g.S.toString(), v2, this.K, v4, p2, p3, this);
        v1.m = this.v();
        return ((com.android.volley.r)this.F.a()).a(v1);
    }

    public final com.android.volley.n a(com.google.wireless.android.finsky.dfe.h.a.aq p0, com.android.volley.x p1, com.android.volley.w p2) {
        if (this.M != 0)
            v3 = new com.google.android.finsky.api.a.by();
        else
            v3 = new com.google.android.finsky.api.a.cy(com.google.wireless.android.finsky.dfe.h.a.ar);
        v1 = this.B.c(com.google.android.finsky.api.g.al.toString(), this.K, v3, p1, p2, this);
        v1.a("urer", Base64.encodeToString(com.google.protobuf.nano.i.a(p0), 10));
        return ((com.android.volley.r)this.F.a()).a(v1);
    }

    public final com.android.volley.n a(com.google.wireless.android.finsky.dfe.h.a.h p0, com.android.volley.x p1, com.android.volley.w p2) {
        if (this.M != 0)
            v4 = new com.google.android.finsky.api.a.y();
        else
            v4 = new com.google.android.finsky.api.a.cy(com.google.wireless.android.finsky.dfe.h.a.i);
        v1 = this.B.a(com.google.android.finsky.api.g.w.toString(), p0, this.K, v4, p1, p2, this);
        v1.m = this.v();
        return ((com.android.volley.r)this.F.a()).a(v1);
    }

    public final com.android.volley.n a(com.google.wireless.android.finsky.dfe.j.a.a p0, com.android.volley.x p1, com.android.volley.w p2) {
        if (this.M != 0)
            v4 = new com.google.android.finsky.api.a.al();
        else
            v4 = new com.google.android.finsky.api.a.cy(com.google.wireless.android.finsky.dfe.j.a.b);
        v1 = this.B.a(com.google.android.finsky.api.g.aw.toString(), p0, this.K, v4, p1, p2, this);
        v1.i = 0;
        return ((com.android.volley.r)this.F.a()).a(v1);
    }

    public final com.android.volley.n a(com.google.wireless.android.finsky.dfe.nano.cl p0, com.android.volley.x p1, com.android.volley.w p2) {
        if (this.M != 0)
            v3 = new com.google.android.finsky.api.a.bw();
        else
            v3 = new com.google.android.finsky.api.a.cy(com.google.wireless.android.finsky.dfe.nano.bc);
        return ((com.android.volley.r)this.F.a()).a(this.B.c(com.google.android.finsky.api.g.ay.buildUpon().appendQueryParameter("ce", p0.b).toString(), this.K, v3, p1, p2, this));
    }

    public final com.android.volley.n a(com.google.wireless.android.finsky.dfe.nano.cu p0, com.android.volley.x p1, com.android.volley.w p2) {
        if (this.M != 0)
            v4 = new com.google.android.finsky.api.a.ap();
        else
            v4 = new com.google.android.finsky.api.a.cy(com.google.wireless.android.finsky.dfe.nano.cv);
        v0 = this.B.a(com.google.android.finsky.api.g.L.toString(), p0, this.K, v4, p1, p2, this);
        v0.m = new com.google.android.finsky.api.a.cx(com.google.android.finsky.api.a.d.r, com.google.android.finsky.api.a.d.s, com.google.android.finsky.api.a.d.t, this.K);
        return this.c(v0);
    }

    public final com.android.volley.n a(com.google.wireless.android.finsky.dfe.nano.cz p0, com.android.volley.x p1, com.android.volley.w p2) {
        if (this.M != 0)
            v4 = new com.google.android.finsky.api.a.as();
        else
            v4 = new com.google.android.finsky.api.a.cy(com.google.wireless.android.finsky.dfe.nano.da);
        return ((com.android.volley.r)this.F.a()).a(this.B.a(com.google.android.finsky.api.g.C.toString(), p0, this.K, v4, p1, p2, this));
    }

    public final com.android.volley.n a(com.google.wireless.android.finsky.dfe.nano.dd p0, com.android.volley.x p1, com.android.volley.w p2) {
        if (this.M != 0)
            v4 = new com.google.android.finsky.api.a.at();
        else
            v4 = new com.google.android.finsky.api.a.cy(com.google.wireless.android.finsky.dfe.nano.de);
        v1 = this.B.a(com.google.android.finsky.api.g.ap.toString(), p0, this.K, v4, p1, p2, this);
        v1.m = new com.google.android.finsky.api.a.cx(com.google.android.finsky.api.a.d.x, com.google.android.finsky.api.a.d.y, com.google.android.finsky.api.a.d.z, this.K);
        return (com.google.android.finsky.api.j)((com.android.volley.r)this.F.a()).a(v1);
    }

    public final com.android.volley.n a(com.google.wireless.android.finsky.dfe.nano.ek p0, com.android.volley.x p1, com.android.volley.w p2) {
        if (this.M != 0)
            v4 = new com.google.android.finsky.api.a.bg();
        else
            v4 = new com.google.android.finsky.api.a.cy(com.google.wireless.android.finsky.dfe.nano.el);
        v0 = this.B.a(com.google.android.finsky.api.g.W.toString(), p0, this.K, v4, p1, p2, this);
        v0.m = this.v();
        this.b(v0);
        return this.c(v0);
    }

    public final com.android.volley.n a(com.google.wireless.android.finsky.dfe.nano.gf p0, com.android.volley.x p1, com.android.volley.w p2) {
        if (this.M != 0)
            v4 = new com.google.android.finsky.api.a.bs();
        else
            v4 = new com.google.android.finsky.api.a.cy(com.google.wireless.android.finsky.dfe.nano.gg);
        v1 = this.B.a(com.google.android.finsky.api.g.J.toString(), p0, this.K, v4, p1, p2, new com.google.android.finsky.api.a.ci(p0), this);
        v1.i = 1;
        v1.m = new com.google.android.finsky.api.a.cx(com.google.android.finsky.api.a.d.o, com.google.android.finsky.api.a.d.p, com.google.android.finsky.api.a.d.q, this.K);
        v1.F = 0;
        return ((com.android.volley.r)this.F.a()).a(v1);
    }

    public final com.android.volley.n a(com.google.wireless.android.finsky.dfe.nano.gq p0, com.google.android.finsky.cv.a.lg p1, com.android.volley.x p2, com.android.volley.w p3) {
        if (this.M != 0)
            v4 = new com.google.android.finsky.api.a.cc();
        else
            v4 = new com.google.android.finsky.api.a.cy(com.google.wireless.android.finsky.dfe.nano.gr);
        v1 = this.B.a(com.google.android.finsky.api.g.aa.toString(), p0, this.K, v4, new com.google.android.finsky.api.a.cl(this, p2), p3, this);
        v1.B = p1;
        return ((com.android.volley.r)this.F.a()).a(v1);
    }

    public final com.android.volley.n a(String p0, int p1, int p2, int p3, boolean p4, com.android.volley.x p5, com.android.volley.w p6, com.google.android.finsky.api.w p7) {
        v1 = com.google.android.finsky.api.g.e.buildUpon().appendQueryParameter("q", p0).appendQueryParameter("c", Integer.toString(p1)).appendQueryParameter("ssis", Integer.toString(p3));
        if (p2 != 0)
            v1.appendQueryParameter("sb", Integer.toString(p2));
        v1.appendQueryParameter("sst", Integer.toString(2));
        if (p4 != 0)
            v1.appendQueryParameter("sst", Integer.toString(3));
        if (this.M != 0)
            v3 = new com.google.android.finsky.api.a.bn();
        else
            v3 = new com.google.android.finsky.api.a.cy(com.google.android.finsky.cv.a.jd);
        return ((com.android.volley.r)this.F.a()).a(this.B.a(v1.toString(), this.K, v3, p5, p6, p7, this));
    }

    public final com.android.volley.n a(String p0, int p1, com.google.android.finsky.cv.a.n p2, Map p3, com.android.volley.x p4, com.android.volley.w p5) {
        if (this.M != 0)
            v3 = new com.google.android.finsky.api.a.g();
        else
            v3 = new com.google.android.finsky.api.a.cy(com.google.wireless.android.finsky.dfe.nano.ak);
        v2 = this.B.c(com.google.android.finsky.api.g.q.toString(), this.K, v3, p4, p5, this);
        v2.m = this.v();
        v2.a("doc", p0);
        v2.a("ot", Integer.toString(p1));
        if (p2 != 0)
            v2.a("vc", String.valueOf(p2.c));
        if (p3 != 0) {
            v3 = p3.entrySet().iterator();
            while (v3.hasNext()) {
                v0 = (Map$Entry)v3.next();
                v2.a((String)v0.getKey(), (String)v0.getValue());
            }
        }
        this.b(v2);
        if (this.E.dj().a(12623395))
            v2.c(p0);
        return this.c(v2);
    }

    public final com.android.volley.n a(String p0, int p1, String p2, int p3, com.android.volley.x p4, com.android.volley.w p5, com.google.android.finsky.api.w p6) {
        if (this.M != 0)
            v3 = new com.google.android.finsky.api.a.aj();
        else
            v3 = new com.google.android.finsky.api.a.cy(com.google.wireless.android.finsky.dfe.a.a.b);
        return ((com.android.volley.r)this.F.a()).a(this.B.a(com.google.android.finsky.api.g.f.buildUpon().appendQueryParameter("q", p0).appendQueryParameter("n", Integer.toString(p1)).appendQueryParameter("cpn", p2).appendQueryParameter("cpv", Integer.toString(p3)).toString(), this.K, v3, p4, p5, p6, this));
    }

    public final com.android.volley.n a(String p0, int p1, String p2, com.android.volley.x p3, com.android.volley.w p4) {
        if (this.M != 0)
            v3 = new com.google.android.finsky.api.a.ab();
        else
            v3 = new com.google.android.finsky.api.a.cy(com.google.wireless.android.finsky.dfe.nano.bl);
        v1 = this.B.c(com.google.android.finsky.api.g.D.toString(), this.K, v3, p3, p4, this);
        v1.a("doc", p0);
        v1.a("cft", Integer.toString(p1));
        if (!TextUtils.isEmpty(p2))
            v1.a("content", p2);
        return ((com.android.volley.r)this.F.a()).a(v1);
    }

    public final com.android.volley.n a(String p0, int p1, List p2, int[] p3, int[] p4, com.android.volley.x p5, com.android.volley.w p6) {
        v2 = new com.google.wireless.android.finsky.dfe.nano.dq();
        if (p0 == 0)
            throw new NullPointerException();
        v2.a = v2.a | 1;
        v2.b = p0;
        v2.a = v2.a | 2;
        v2.c = p1;
        v4 = p2.size();
        v2.d = new fh[v4];
        v3 = 0;
        while (v3 < v4) {
            v2.d[v3] = (com.google.wireless.android.finsky.dfe.nano.fh)p2.get(v3);
            v3 = v3 + 1;
        }
        v2.e = new int[p3.length];
        v0 = 0;
        while (v0 < p3.length) {
            v2.e[v0] = p3[v0];
            v0 = v0 + 1;
        }
        v2.f = new int[p4.length];
        v0 = 0;
        while (v0 < p4.length) {
            v2.f[v0] = p4[v0];
            v0 = v0 + 1;
        }
        if (this.M != 0)
            v4 = new com.google.android.finsky.api.a.ax();
        else
            v4 = new com.google.android.finsky.api.a.cy(com.google.wireless.android.finsky.dfe.nano.dr);
        v1 = this.B.a(com.google.android.finsky.api.g.N.toString(), v2, this.K, v4, p5, p6, this);
        v1.a("doc", p0);
        return ((com.android.volley.r)this.F.a()).a(v1);
    }

    public final com.android.volley.n a(String p0, int p1, boolean p2, com.android.volley.x p3, com.android.volley.w p4) {
        if (this.M != 0)
            v3 = new com.google.android.finsky.api.a.w();
        else
            v3 = new com.google.android.finsky.api.a.cy(com.google.wireless.android.finsky.dfe.h.a.f);
        v1 = this.B.c(com.google.android.finsky.api.g.ac.toString(), this.K, v3, p3, p4, this);
        v1.m = this.v();
        v1.a("doc", p0);
        v1.a("ot", Integer.toString(p1));
        if (p2 != 0)
            v0 = "1";
        else
            v0 = "0";
        v1.a("sd", v0);
        return this.c(v1);
    }

    public final com.android.volley.n a(String p0, com.android.volley.x p1, com.android.volley.w p2) {
        if (this.M != 0)
            v3 = new com.google.android.finsky.api.a.bf();
        else
            v3 = new com.google.android.finsky.api.a.cy(com.google.wireless.android.finsky.dfe.nano.y);
        v1 = this.B.a(p0, this.K, v3, p1, p2, this);
        this.a(v1);
        return ((com.android.volley.r)this.F.a()).a(v1);
    }

    public final com.android.volley.n a(String p0, com.google.android.finsky.cv.a.ax p1, com.android.volley.x p2, com.android.volley.w p3) {
        if (this.M != 0)
            v3 = new com.google.android.finsky.api.a.bl();
        else
            v3 = new com.google.android.finsky.api.a.cy(com.google.wireless.android.finsky.dfe.nano.fw);
        v0 = this.B.c(com.google.android.finsky.api.g.v.toString(), this.K, v3, p2, p3, this);
        v0.m = this.v();
        v0.a("doc", p0);
        if (p1 != 0)
            v0.a("fdid", Base64.encodeToString(com.google.protobuf.nano.i.a(p1), 10));
        v0.a("ot", Integer.toString(1));
        return this.c(v0);
    }

    public final com.android.volley.n a(String p0, com.google.wireless.android.finsky.dfe.a.a.l p1, com.android.volley.x p2, com.android.volley.w p3) {
        v1 = this.B.a(p0, p1, this.K, this.o(), p2, p3, this);
        v1.i = 0;
        return ((com.android.volley.r)this.F.a()).a(v1);
    }

    public final com.android.volley.n a(String p0, com.google.wireless.android.finsky.dfe.h.a.l p1, com.android.volley.x p2, com.android.volley.w p3) {
        if (this.M != 0)
            v4 = new com.google.android.finsky.api.a.aa();
        else
            v4 = new com.google.android.finsky.api.a.cy(com.google.wireless.android.finsky.dfe.h.a.n);
        return ((com.android.volley.r)this.F.a()).a(this.B.a(p0, p1, this.K, v4, p2, p3, this));
    }

    public final com.android.volley.n a(String p0, Boolean p1, Boolean p2, com.android.volley.x p3, com.android.volley.w p4) {
        if (this.M != 0)
            v3 = new com.google.android.finsky.api.a.e();
        else
            v3 = new com.google.android.finsky.api.a.cy(com.google.wireless.android.finsky.dfe.nano.a);
        v1 = this.B.c(com.google.android.finsky.api.g.F.toString(), this.K, v3, p3, p4, this);
        v1.a("tost", p0);
        if (p1 != 0)
            v1.a("toscme", p1.toString());
        if (p2 != 0)
            v1.a("tosaia", p2.toString());
        return ((com.android.volley.r)this.F.a()).a(v1);
    }

    public final com.android.volley.n a(String p0, Integer p1, Integer p2, Integer p3, Integer p4, Long p5, String[] p6, String[] p7, String p8, String p9, String p10, String[] p11, com.android.volley.x p12, com.android.volley.w p13) {
        v2 = com.google.android.finsky.api.g.U.buildUpon().appendQueryParameter("doc", p0).appendQueryParameter("ot", Integer.toString(1));
        if (p1 != 0)
            v2.appendQueryParameter("vc", p1.toString());
        if (p2 != 0) {
            v2.appendQueryParameter("bvc", p2.toString());
            if (p6 != 0) {
                v1 = 0;
                while (v1 < p6.length) {
                    v2.appendQueryParameter("pf", p6[v1]);
                    v1 = v1 + 1;
                }
            }
        }
        if (p3 != 0)
            v2.appendQueryParameter("da", p3.toString());
        if (p4 != 0)
            v2.appendQueryParameter("bda", p4.toString());
        if (p5 != 0)
            v2.appendQueryParameter("bf", p5.toString());
        if (p7 != 0) {
            v1 = 0;
            while (v1 < p7.length) {
                v2.appendQueryParameter("fdcf", p7[v1]);
                v1 = v1 + 1;
            }
        }
        if (!TextUtils.isEmpty(p8))
            v2.appendQueryParameter("shh", p8);
        if (!TextUtils.isEmpty(p9))
            v2.appendQueryParameter("ch", p9);
        if (!TextUtils.isEmpty(p10))
            v2.appendQueryParameter("dtok", p10);
        if (this.z() && p11 != 0) {
            v1 = 0;
            while (v1 < p11.length) {
                v2.appendQueryParameter("mn", p11[v1]);
                v1 = v1 + 1;
            }
        }
        v2 = this.B.a(v2.build().toString(), this.K, this.j(), p12, p13, this);
        v2.m = this.x();
        v2.i = 0;
        v2.C = 1;
        v2.F = 1;
        if (v2.z == 0)
            v2.z = new HashMap();
        v2.z.put("X-DFE-Setup-Flow-Type", this.y());
        if (!TextUtils.isEmpty(0)) {
            if (v2.A == 0)
                v2.A = new StringBuilder();
            v2.A.append("/").append("X-DFE-Setup-Flow-Type").append("=").append(0);
        }
        return ((com.android.volley.r)this.F.a()).a(v2);
    }

    public final com.android.volley.n a(String p0, String p1, int p2, com.android.volley.x p3, com.android.volley.w p4) {
        v1 = this.B.a(com.google.android.finsky.api.g.p.buildUpon().appendQueryParameter("doc", p0).appendQueryParameter("revId", p1).appendQueryParameter("rating", Integer.toString(p2)).build().toString(), this.K, this.q(), p3, p4, this);
        v1.i = 0;
        v1.C = 1;
        v1.F = 1;
        return ((com.android.volley.r)this.F.a()).a(v1);
    }

    public final com.android.volley.n a(String p0, String p1, com.android.volley.x p2, com.android.volley.w p3) {
        if (this.M != 0)
            v3 = new com.google.android.finsky.api.a.m();
        else
            v3 = new com.google.android.finsky.api.a.cy(com.google.wireless.android.finsky.dfe.nano.ax);
        v0 = this.B.c(com.google.android.finsky.api.g.P.toString(), this.K, v3, p2, p3, this);
        v0.m = this.v();
        v0.a("pt", p0);
        v0.a("ot", Integer.toString(1));
        v0.a("shpn", p1);
        return this.c(v0);
    }

    public final com.android.volley.n a(String p0, String p1, com.android.volley.x p2, com.android.volley.w p3, com.google.android.finsky.api.w p4) {
        v1 = com.google.android.finsky.api.g.K.buildUpon().appendQueryParameter("url", p0);
        if (!TextUtils.isEmpty(p1))
            v1.appendQueryParameter("ref", p1);
        if (this.M != 0)
            v3 = new com.google.android.finsky.api.a.bh();
        else
            v3 = new com.google.android.finsky.api.a.cy(com.google.android.finsky.cv.a.ip);
        v1 = this.B.a(v1.toString(), this.K, v3, p2, p3, p4, this);
        this.b(v1);
        v1.s();
        if (this.E.dj().a(12631400))
            v1.F = 1;
        return ((com.android.volley.r)this.F.a()).a(v1);
    }

    public final com.android.volley.n a(String p0, String p1, String p2, int p3, com.google.android.finsky.cv.a.kd p4, boolean p5, boolean p6, com.android.volley.x p7, com.android.volley.w p8) {
        return ((com.android.volley.r)this.F.a()).a(this.B.a(com.google.android.finsky.api.g.n.buildUpon().appendQueryParameter("doc", p0).appendQueryParameter("title", p1).appendQueryParameter("content", p2).appendQueryParameter("rating", Integer.toString(p3)).appendQueryParameter("ipr", Boolean.toString(p5)).appendQueryParameter("itpr", Boolean.toString(p6)).toString(), p4, this.K, this.q(), p7, p8, this));
    }

    public final com.android.volley.n a(String p0, String p1, String p2, com.android.volley.x p3, com.android.volley.w p4) {
        v1 = this.B.c(p0, this.K, this.h(), p3, p4, this);
        v1.a(p1, p2);
        v1.m = this.u();
        return ((com.android.volley.r)this.F.a()).a(v1);
    }

    public final com.android.volley.n a(String p0, Map p1, com.android.volley.x p2, com.android.volley.w p3) {
        if (this.M != 0)
            v3 = new com.google.android.finsky.api.a.au();
        else
            v3 = new com.google.android.finsky.api.a.cy(com.google.wireless.android.finsky.dfe.nano.ap);
        v2 = this.B.c(com.google.android.finsky.api.g.B.toString(), this.K, v3, p2, p3, this);
        v2.m = this.v();
        if (p0 != 0)
            v2.a("pct", p0);
        if (p1 != 0) {
            v3 = p1.entrySet().iterator();
            while (v3.hasNext()) {
                v0 = (Map$Entry)v3.next();
                v2.a((String)v0.getKey(), (String)v0.getValue());
            }
        }
        return ((com.android.volley.r)this.F.a()).a(v2);
        return ((com.android.volley.r)this.F.a()).a(v2);
    }

    public final com.android.volley.n a(String p0, boolean p1, int p2, int p3, int p4, com.android.volley.x p5, com.android.volley.w p6) {
        v0 = Uri.parse(p0).buildUpon();
        if (p1 != 0)
            v0.appendQueryParameter("dfil", "1");
        if (p2 > 0)
            v0.appendQueryParameter("vc", Integer.toString(p2));
        if (p3 > 0)
            v0.appendQueryParameter("rating", Integer.toString(p3));
        if (p4 >= 0)
            v0.appendQueryParameter("sort", Integer.toString(p4));
        return ((com.android.volley.r)this.F.a()).a(this.B.a(v0.toString(), this.K, this.q(), p5, p6, this));
    }

    public final com.android.volley.n a(String p0, boolean p1, com.android.volley.x p2, com.android.volley.w p3) {
        return ((com.android.volley.r)this.F.a()).a(this.e(p0, p1, p2, p3));
    }

    public final com.android.volley.n a(String p0, boolean p1, Collection p2, com.android.volley.x p3, com.android.volley.w p4) {
        v1 = this.e(p0, p1, p3, p4);
        com.google.android.finsky.api.a.d.a(v1, p2);
        return ((com.android.volley.r)this.F.a()).a(v1);
    }

    public final com.android.volley.n a(String p0, boolean p1, boolean p2, String p3, Collection p4, com.android.volley.x p5, com.android.volley.w p6) {
        v1 = this.b(p0, p1, p2, p3, p4, p5, p6);
        v1.s();
        return ((com.android.volley.r)this.F.a()).a(v1);
    }

    public final com.android.volley.n a(String p0, byte[] p1, Integer p2, Integer p3, Integer p4, Integer p5, Long p6, String[] p7, String[] p8, String p9, String p10, boolean p11, String p12, String p13, String[] p14, com.android.volley.x p15, com.android.volley.w p16) {
        v3 = com.google.android.finsky.api.g.M.buildUpon().appendQueryParameter("doc", p0).appendQueryParameter("ot", Integer.toString(1));
        if (p1 != 0)
            v3.appendQueryParameter("st", Base64.encodeToString(p1, 10));
        if (p2 != 0)
            v3.appendQueryParameter("vc", p2.toString());
        if (p3 != 0) {
            v3.appendQueryParameter("bvc", p3.toString());
            if (p7 != 0) {
                v1 = 0;
                while (v1 < p7.length) {
                    v3.appendQueryParameter("pf", p7[v1]);
                    v1 = v1 + 1;
                }
            }
        }
        if (p4 != 0)
            v3.appendQueryParameter("da", p4.toString());
        if (p5 != 0)
            v3.appendQueryParameter("bda", p5.toString());
        if (p6 != 0)
            v3.appendQueryParameter("bf", p6.toString());
        if (p8 != 0) {
            v1 = 0;
            while (v1 < p8.length) {
                v3.appendQueryParameter("fdcf", p8[v1]);
                v1 = v1 + 1;
            }
        }
        if (!TextUtils.isEmpty(p9))
            v3.appendQueryParameter("shh", p9);
        if (!TextUtils.isEmpty(p10))
            v3.appendQueryParameter("ch", p10);
        if (!TextUtils.isEmpty(p12))
            v3.appendQueryParameter("dtok", p12);
        if (p11 != 0)
            v3.appendQueryParameter("isbg", "1");
        if (!TextUtils.isEmpty(p13))
            v3.appendQueryParameter("isid", p13);
        if (this.z() && p14 != 0) {
            v1 = 0;
            while (v1 < p14.length) {
                v3.appendQueryParameter("mn", p14[v1]);
                v1 = v1 + 1;
            }
        }
        v2 = this.B.a(com.google.android.finsky.api.g.a, v3.build().toString(), this.K, this.j(), p15, p16, this);
        v2.i = 0;
        v2.C = 1;
        v2.F = 1;
        return ((com.android.volley.r)this.F.a()).a(v2);
    }

    public final com.android.volley.n a(String p0, g[] p1, int[] p2, boolean p3, com.android.volley.x p4, com.android.volley.w p5) {
        v1 = com.google.android.finsky.api.g.X.buildUpon();
        if (p0 != 0)
            v1.appendQueryParameter("ogi", p0);
        v2 = new com.google.wireless.android.finsky.dfe.nano.bj();
        if (p3 != 0) {
            v2.a = v2.a | 1;
            v2.b = 1;
        }
        else {
            v2.c = p1;
            v2.d = p2;
        }
        return ((com.android.volley.r)this.F.a()).a(this.B.a(v1.build().toString(), v2, this.K, this.i(), p4, p5, this));
    }

    public final com.android.volley.n a(Collection p0, String p1, com.android.volley.x p2, com.android.volley.w p3) {
        v2 = new com.google.wireless.android.finsky.dfe.nano.do();
        v2.a(p1);
        v2.c = (String[])p0.toArray(new String[p0.size()]);
        return this.c(this.B.a(com.google.android.finsky.api.g.O.toString(), v2, this.K, this.n(), p2, p3, this));
    }

    public final com.android.volley.n a(List p0, com.android.volley.x p1, com.android.volley.w p2) {
        v1 = com.google.android.finsky.api.g.E.buildUpon();
        v2 = p0.iterator();
        while (v2.hasNext())
            v1.appendQueryParameter("nid", (String)v2.next());
        if (this.M != 0)
            v3 = new com.google.android.finsky.api.a.p();
        else
            v3 = new com.google.android.finsky.api.a.cy(com.google.wireless.android.finsky.dfe.nano.b);
        return ((com.android.volley.r)this.F.a()).a(this.B.a(v1.toString(), this.K, v3, p1, p2, this));
    }

    public final com.android.volley.n a(List p0, com.android.volley.x p1, com.android.volley.w p2, com.google.android.finsky.api.v p3) {
        v2 = new com.google.wireless.android.finsky.dfe.d.a.b();
        v2.a = new a[p0.size()];
        v1 = 0;
        while (v1 < p0.size()) {
            v3 = new com.google.wireless.android.finsky.dfe.d.a.a();
            v0 = (String)p0.get(v1);
            if (v0 == 0)
                throw new NullPointerException();
            v3.b = v3.b | 1;
            v3.c = v0;
            v2.a[v1] = v3;
            v1 = v1 + 1;
        }
        if (this.M != 0)
            v4 = new com.google.android.finsky.api.a.ca();
        else
            v4 = new com.google.android.finsky.api.a.cy(com.google.wireless.android.finsky.dfe.d.a.c);
        v1 = this.B.a(com.google.android.finsky.api.g.au.toString(), v2, this.K, v4, p1, p2, this);
        v1.P = p3;
        return ((com.android.volley.r)this.F.a()).a(v1);
    }

    public final com.android.volley.n a(List p0, boolean p1, com.android.volley.x p2, com.android.volley.w p3) {
        return this.a(p0, p1, 0, p2, p3);
    }

    public final com.android.volley.n a(List p0, boolean p1, boolean p2, com.android.volley.x p3, com.android.volley.w p4) {
        v2 = new com.google.wireless.android.finsky.dfe.nano.bv();
        Collections.sort(p0, com.google.android.finsky.api.d.a);
        v4 = p0.size();
        v2.b = new bw[v4];
        v1 = 0;
        while (v1 < v4) {
            v0 = (com.google.android.finsky.api.d)p0.get(v1);
            v2.b[v1] = new com.google.wireless.android.finsky.dfe.nano.bw();
            if (v0.b == 0)
                throw new NullPointerException();
            v2.b[v1].c = v2.b[v1].c | 1;
            v2.b[v1].d = v0.b;
            if (!this.E.dj().a(12633232)) {
                if (v0.h != 0) {
                    v2.b[v1].a = -1;
                    v2.b[v1].a = 0;
                    v2.b[v1].j = new com.google.wireless.android.finsky.dfe.nano.ca();
                }
            }
            if (v0.c != 0) {
                v2.b[v1].c = v2.b[v1].c | 2;
                v2.b[v1].e = v0.c.intValue();
            }
            if (v0.d != 0) {
                v2.b[v1].c = v2.b[v1].c | 8;
                v2.b[v1].g = v0.d.intValue();
            }
            if (v0.e != 0) {
                v2.b[v1].c = v2.b[v1].c | 16;
                v2.b[v1].h = v0.e.longValue();
            }
            if (v0.g != 0) {
                v2.b[v1].c = v2.b[v1].c | 4;
                v2.b[v1].f = v0.g.booleanValue();
            }
            if (v0.f != 0)
                v2.b[v1].i = v0.f;
            v1 = v1 + 1;
        }
        if (p2 != 0) {
            v2.a = v2.a | 2;
            v2.d = 1;
        }
        v1 = com.google.android.finsky.api.g.I.buildUpon();
        if (p1 != 0)
            v1.appendQueryParameter("au", "1");
        if (this.M != 0)
            v4 = new com.google.android.finsky.api.a.cm();
        else
            v4 = new com.google.android.finsky.api.a.cy(com.google.wireless.android.finsky.dfe.nano.bx);
        v1 = this.B.a(v1.build().toString(), v2, this.K, v4, p3, p4, new com.google.android.finsky.api.a.ch(this, v2), this);
        v1.i = 1;
        v1.m = new com.google.android.finsky.api.a.cx(com.google.android.finsky.api.a.d.l, com.google.android.finsky.api.a.d.m, com.google.android.finsky.api.a.d.n, this.K);
        v1.F = 0;
        return ((com.android.volley.r)this.F.a()).a(v1);
    }

    public final com.android.volley.n a(boolean p0, boolean p1, boolean p2, com.android.volley.x p3, com.android.volley.w p4) {
        v0 = com.google.android.finsky.api.g.b.buildUpon();
        if (this.K.g != 0 && p2 != 0 && this.K.g.a(12620349))
            v0.appendQueryParameter("nocache_isui", Boolean.toString(p2));
        if (p1 != 0)
            v0.appendQueryParameter("nocache_spls", Boolean.toString(p1));
        v1 = this.B.a(com.google.android.finsky.api.g.a, v0.build().toString(), this.K, this.s(), p3, p4, this);
        v1.v = p0;
        this.a(v1);
        if (this.K.g == 0 || !this.K.g.a(12603108))
            v1.C = 1;
        v1.D = 1;
        if (p1 != 0)
            v1.i = 0;
        return ((com.android.volley.r)this.F.a()).a(v1);
    }

    public final com.android.volley.n a(ak[] p0, com.android.volley.x p1, com.android.volley.w p2) {
        v2 = new com.google.wireless.android.finsky.dfe.h.a.an();
        v2.a = p0;
        if (this.M != 0)
            v4 = new com.google.android.finsky.api.a.bx();
        else
            v4 = new com.google.android.finsky.api.a.cy(com.google.wireless.android.finsky.dfe.h.a.ao);
        return ((com.android.volley.r)this.F.a()).a(this.B.a(com.google.android.finsky.api.g.ad.toString(), v2, this.K, v4, p1, p2, this));
    }

    public final com.google.android.finsky.api.j a(com.google.android.finsky.cv.a.jn p0, com.android.volley.x p1, com.android.volley.w p2) {
        if (this.M != 0)
            v4 = new com.google.android.finsky.api.a.bp();
        else
            v4 = new com.google.android.finsky.api.a.cy(com.google.android.finsky.cv.a.jo);
        return this.c(this.B.a(com.google.android.finsky.api.g.ao.toString(), p0, this.K, v4, p1, p2, this));
    }

    public final com.google.android.finsky.api.j a(com.google.wireless.android.finsky.dfe.a.a.i p0, int p1, com.android.volley.x p2, com.android.volley.w p3) {
        if (this.M != 0)
            v4 = new com.google.android.finsky.api.a.q();
        else
            v4 = new com.google.android.finsky.api.a.cy(com.google.wireless.android.finsky.dfe.a.a.j);
        v1 = this.B.a(com.google.android.finsky.api.g.ar.toString(), p0, this.K, v4, p2, p3, this);
        if (v1.z == 0)
            v1.z = new HashMap();
        v1.z.put("X-Account-Ordinal", String.valueOf(p1));
        if (!TextUtils.isEmpty(0)) {
            if (v1.A == 0)
                v1.A = new StringBuilder();
            v1.A.append("/").append("X-Account-Ordinal").append("=").append(0);
        }
        v1.s();
        v1.F = 1;
        if (this.E.dj().a(12623396)) {
            this.I.a(this.G, 0);
            v1.c("");
        }
        return (com.google.android.finsky.api.j)((com.android.volley.r)this.F.a()).a(v1);
    }

    public final com.google.android.finsky.api.j a(com.google.wireless.android.finsky.dfe.c.a.ac p0, com.google.android.finsky.cv.a.lg p1, String p2, com.google.wireless.android.finsky.dfe.c.a.dt p3, android.support.v4.h.p p4, com.android.volley.x p5, com.android.volley.w p6) {
        v7 = new com.google.android.finsky.api.a.cj(p0);
        if (p4 == 0) {
            if (p0.n != 0)
                v1 = com.google.android.finsky.api.g.t;
            else
                v1 = com.google.android.finsky.api.g.u;
            v1 = this.B.a(v1.toString(), p0, this.K, this.g(), p5, p6, v7, this);
        }
        else {
            v2 = this.B.a(com.google.android.finsky.api.g.u.buildUpon().appendQueryParameter("s7e_mode", "proto").build().toString(), p0, this.K, this.g(), p5, p6, v7, this);
            if (v2.z == 0)
                v2.z = new HashMap();
            v2.z.put((String)p4.a, (String)p4.b);
            if (!TextUtils.isEmpty(0)) {
                if (v2.A == 0)
                    v2.A = new StringBuilder();
                v2.A.append("/").append((String)p4.a).append("=").append(0);
            }
            v1 = v2;
        }
        if (p0.i != 0)
            v0 = p0.i.l | p0.n;
        else
            v0 = p0.n;
        if (v0 == 0)
            v0 = 1;
        else
            v0 = 0;
        v1.i = v0;
        if (p3 == 0)
            v1.m = this.v();
        else
            v1.m = new com.google.android.finsky.api.a.cx(p3.b, p3.c, p3.d, this.K);
        this.b(v1);
        if (p0.n != 0 && p2 != 0 && this.E.dj().a(12623395))
            v1.c(p2);
        if (p1 != 0)
            v1.B = p1;
        if (p0.a & 4096)
            v0 = 1;
        else
            v0 = 0;
        if (v0 != 0)
            v0 = (com.google.android.finsky.api.j)((com.android.volley.r)this.F.a()).a(v1);
        else
            v0 = this.c(v1);
        return v0;
    }

    public final com.google.android.finsky.api.j a(String p0, int p1, long p2, com.android.volley.x p4, com.android.volley.w p5) {
        v1 = com.google.android.finsky.api.g.aq.buildUpon();
        v1.appendQueryParameter("pkgn", p0);
        v1.appendQueryParameter("vc", String.valueOf(p1));
        v1.appendQueryParameter("nnc", String.valueOf(p2));
        if (this.M != 0)
            v3 = new com.google.android.finsky.api.a.j();
        else
            v3 = new com.google.android.finsky.api.a.cy(com.google.wireless.android.finsky.dfe.a.a.h);
        return (com.google.android.finsky.api.j)((com.android.volley.r)this.F.a()).a(this.B.a(v1.build().toString(), this.K, v3, p4, p5, this));
    }

    public final com.google.android.finsky.api.j a(String p0, com.google.android.finsky.cv.a.ax p1, int p2, String p3, com.google.wireless.android.finsky.dfe.nano.ez p4, com.google.wireless.android.finsky.dfe.c.a.al p5, String p6, int p7, VoucherParams p8, int p9, int p10, Map p11, com.android.volley.x p12, com.android.volley.w p13) {
        if (this.M != 0)
            v4 = new com.google.android.finsky.api.a.bc();
        else
            v4 = new com.google.android.finsky.api.a.cy(com.google.wireless.android.finsky.dfe.nano.fa);
        v3 = this.B.c(com.google.android.finsky.api.g.r.toString(), this.K, v4, p12, p13, this);
        v3.m = this.w();
        v3.a("doc", p0);
        if (p1 != 0)
            v3.a("fdid", Base64.encodeToString(com.google.protobuf.nano.i.a(p1), 10));
        if (TextUtils.isEmpty(p3))
            v3.a("ot", Integer.toString(p2));
        else
            v3.a("oi", p3);
        if (p6 != 0)
            v3.a("ii", p6);
        v3.a("chv", String.valueOf(p8.c));
        v3.a("aav", String.valueOf(p8.b));
        if (!TextUtils.isEmpty(p8.a))
            v3.a("usvid", p8.a);
        if (p9 > 0)
            v3.a("vc", String.valueOf(p9));
        if (p10 != 0)
            v3.a("apvc", String.valueOf(p10));
        if (p7 != 0)
            v3.a("ipt", String.valueOf(p7));
        if (p4 != 0) {
            if (p4.a & 1)
                v1 = 1;
            else
                v1 = 0;
            if (v1 != 0)
                v3.a("bav", Integer.toString(p4.b));
            if (!TextUtils.isEmpty(p4.c))
                v3.a("shpn", p4.c);
            if (!TextUtils.isEmpty(p4.e))
                v3.a("shh", p4.e);
            if (p4.a & 4)
                v1 = 1;
            else
                v1 = 0;
            if (v1 != 0)
                v3.a("shvc", Integer.toString(p4.d));
            if (!TextUtils.isEmpty(p4.f))
                v3.a("payload", p4.f);
            if (p4.g != 0) {
                v1 = 0;
                while (v1 < p4.g.length) {
                    v3.a("odid", p4.g[v1]);
                    v1 = v1 + 1;
                }
            }
            if (p4.h != 0 && p4.h.length > 0) {
                v2 = new com.google.wireless.android.finsky.dfe.nano.ex();
                v2.a = p4.h;
                v3.a("iabx", Base64.encodeToString(com.google.protobuf.nano.i.a(v2), 10));
            }
            if (p4.a & 32)
                v1 = 1;
            else
                v1 = 0;
            if (v1 != 0)
                v3.a("iapc", Integer.toString(p4.i));
            if (p4.a & 64)
                v1 = 1;
            else
                v1 = 0;
            if (v1 != 0)
                v3.a("ipn", p4.j);
            if (p4.a & 128)
                v1 = 1;
            else
                v1 = 0;
            if (v1 != 0)
                v3.a("iad", Boolean.toString(p4.k));
            if (p4.a & 256)
                v1 = 1;
            else
                v1 = 0;
            if (v1 != 0)
                v3.a("isa", Boolean.toString(p4.l));
            if (p4.a & 512)
                v1 = 1;
            else
                v1 = 0;
            if (v1 != 0)
                v3.a("iia", Boolean.toString(p4.m));
        }
        com.google.android.finsky.api.a.d.a(v3, p5);
        if (p11 != 0) {
            v4 = p11.entrySet().iterator();
            while (v4.hasNext()) {
                v1 = (Map$Entry)v4.next();
                v3.a((String)v1.getKey(), (String)v1.getValue());
            }
        }
        return (com.google.android.finsky.api.j)((com.android.volley.r)this.F.a()).a(v3);
        return (com.google.android.finsky.api.j)((com.android.volley.r)this.F.a()).a(v3);
    }

    public final com.google.android.finsky.api.j a(String p0, String p1, Collection p2) {
        return this.b(p0, 0, 0, p1, p2, 0, 0);
    }

    public final com.google.android.finsky.api.j a(String p0, Map p1, com.google.wireless.android.finsky.dfe.c.a.al p2, boolean p3, com.google.android.finsky.cv.a.lg p4, com.android.volley.x p5, com.android.volley.w p6) {
        v1 = com.google.android.finsky.api.g.s;
        if (p3 != 0) {
            v2 = v1.buildUpon();
            v2.appendQueryParameter("s7e_suffix", (String)com.google.android.finsky.api.f.O.b());
            v0 = v1.getQueryParameterNames();
            if (v0.size() > 0) {
                v3 = v0.iterator();
                while (v3.hasNext()) {
                    v0 = (String)v3.next();
                    v2.appendQueryParameter(v0, v1.getQueryParameter(v0));
                }
            }
            v1 = v2.build();
        }
        if (this.M != 0)
            v3 = new com.google.android.finsky.api.a.l();
        else
            v3 = new com.google.android.finsky.api.a.cy(com.google.wireless.android.finsky.dfe.nano.et);
        v2 = this.B.c(v1.toString(), this.K, v3, p5, p6, this);
        v2.a("pct", p0);
        v2.m = this.v();
        if (p1 != 0) {
            v3 = p1.entrySet().iterator();
            while (v3.hasNext()) {
                v0 = (Map$Entry)v3.next();
                v2.a((String)v0.getKey(), (String)v0.getValue());
            }
        }
        com.google.android.finsky.api.a.d.a(v2, p2);
        v2.B = p4;
        this.b(v2);
        return this.c(v2);
    }

    public final String a(int p0, String p1, int p2, byte[] p3) {
        v0 = com.google.android.finsky.api.g.G.buildUpon().appendQueryParameter("c", Integer.toString(p0)).appendQueryParameter("dt", Integer.toString(p2)).appendQueryParameter("libid", p1);
        if (p3 != 0)
            v0.appendQueryParameter("st", Base64.encodeToString(p3, 10));
        return v0.toString();
    }

    public final void a(com.google.android.finsky.api.p p0) {
        if (!this.L.contains(p0))
            this.L.add(p0);
    }

    public final void a(String p0) {
        this.K.b(p0);
    }

    public final void a(String p0, com.google.wireless.android.finsky.dfe.nano.fl p1) {
        v1 = this.L.size() - 1;
        while (v1 >= 0) {
            ((com.google.android.finsky.api.p)this.L.get(v1)).a(p0, p1);
            v1 = v1 - 1;
        }
    }

    public final Account b() {
        return this.K.a();
    }

    public final com.android.volley.n b(com.android.volley.x p0, com.android.volley.w p1) {
        if (this.M != 0)
            v3 = new com.google.android.finsky.api.a.i();
        else
            v3 = new com.google.android.finsky.api.a.cy(com.google.wireless.android.finsky.dfe.nano.aq);
        return ((com.android.volley.r)this.F.a()).a(this.B.c(com.google.android.finsky.api.g.x.toString(), this.K, v3, p0, p1, this));
    }

    public final com.android.volley.n b(String p0, int p1, String p2, com.android.volley.x p3, com.android.volley.w p4) {
        if (this.M != 0)
            v3 = new com.google.android.finsky.api.a.r();
        else
            v3 = new com.google.android.finsky.api.a.cy(com.google.wireless.android.finsky.dfe.h.a.e);
        v1 = this.B.c(com.google.android.finsky.api.g.aj.toString(), this.K, v3, p3, p4, this);
        if (!TextUtils.isEmpty(p2))
            v1.a("consistency_token", p2);
        v1.a("doc", p0);
        v1.a("ot", String.valueOf(p1));
        return ((com.android.volley.r)this.F.a()).a(v1);
    }

    public final com.android.volley.n b(String p0, com.android.volley.x p1, com.android.volley.w p2) {
        if (this.M != 0)
            v3 = new com.google.android.finsky.api.a.bm();
        else
            v3 = new com.google.android.finsky.api.a.cy(com.google.wireless.android.finsky.dfe.nano.ga);
        v1 = this.B.a(p0, this.K, v3, p1, p2, this);
        v1.s();
        this.a(v1);
        return ((com.android.volley.r)this.F.a()).a(v1);
    }

    public final com.android.volley.n b(String p0, String p1, int p2, com.android.volley.x p3, com.android.volley.w p4) {
        v0 = new com.google.wireless.android.finsky.dfe.h.a.p();
        v0.a = v0.a | 4;
        v0.d = p2;
        if (p1 == 0)
            throw new NullPointerException();
        v0.a = v0.a | 1;
        v0.b = p1;
        if (p0 == 0)
            throw new NullPointerException();
        v0.a = v0.a | 2;
        v0.c = p0;
        v2 = new com.google.wireless.android.finsky.dfe.h.a.af();
        v2.a = v0;
        if (this.M != 0)
            v4 = new com.google.android.finsky.api.a.br();
        else
            v4 = new com.google.android.finsky.api.a.cy(com.google.wireless.android.finsky.dfe.h.a.ag);
        return ((com.android.volley.r)this.F.a()).a(this.B.a(com.google.android.finsky.api.g.af.toString(), v2, this.K, v4, p3, p4, this));
    }

    public final com.android.volley.n b(String p0, String p1, com.android.volley.x p2, com.android.volley.w p3) {
        v1 = this.B.c(com.google.android.finsky.api.g.Z.toString(), this.K, this.p(), p2, p3, this);
        v1.a("doc", p0);
        v1.a("referrer", p1);
        v1.m = new com.google.android.finsky.api.a.cx(com.google.android.finsky.api.a.d.k, 0, 0, this.K);
        v1.s();
        return ((com.android.volley.r)this.F.a()).a(v1);
    }

    public final com.android.volley.n b(String p0, Map p1, com.android.volley.x p2, com.android.volley.w p3) {
        v2 = this.B.c(p0, this.K, this.h(), p2, p3, this);
        v3 = p1.entrySet().iterator();
        while (v3.hasNext()) {
            v0 = (Map$Entry)v3.next();
            v2.a((String)v0.getKey(), (String)v0.getValue());
        }
        v2.m = this.u();
        return ((com.android.volley.r)this.F.a()).a(v2);
    }

    public final com.android.volley.n b(String p0, boolean p1, com.android.volley.x p2, com.android.volley.w p3) {
        v1 = this.B.c(com.google.android.finsky.api.g.o.toString(), this.K, this.q(), p2, p3, this);
        v1.a("doc", p0);
        v1.a("itpr", Boolean.toString(p1));
        return ((com.android.volley.r)this.F.a()).a(v1);
    }

    public final com.android.volley.n b(Collection p0, String p1, com.android.volley.x p2, com.android.volley.w p3) {
        v2 = new com.google.wireless.android.finsky.dfe.nano.do();
        v2.a(p1);
        v2.d = (String[])p0.toArray(new String[p0.size()]);
        return this.c(this.B.a(com.google.android.finsky.api.g.O.toString(), v2, this.K, this.n(), p2, p3, this));
    }

    public final com.android.volley.n b(List p0, com.android.volley.x p1, com.android.volley.w p2) {
        v2 = new com.google.android.finsky.cv.a.lb();
        v2.a = (gk[])p0.toArray(new gk[p0.size()]);
        v1 = this.B.a(com.google.android.finsky.api.g.aC.toString(), v2, this.K, new com.google.android.finsky.api.a.cy(com.google.android.finsky.cv.a.lc), p1, p2, this);
        v1.i = 0;
        return ((com.android.volley.r)this.F.a()).a(v1);
    }

    public final void b(String p0) {
        ((com.android.volley.r)this.F.a()).a(new com.google.android.finsky.api.a.cn(this.K.i, this.B.a(p0, this.K, this.l(), 0, 0, this).e()));
    }

    public final com.android.volley.n c(com.android.volley.x p0, com.android.volley.w p1) {
        if (this.M != 0)
            v3 = new com.google.android.finsky.api.a.ac();
        else
            v3 = new com.google.android.finsky.api.a.cy(com.google.wireless.android.finsky.dfe.nano.fq);
        v1 = this.B.a(com.google.android.finsky.api.g.y.toString(), this.K, v3, p0, p1, this);
        v1.C = 1;
        v1.m = new com.google.android.finsky.api.a.cx(com.google.android.finsky.api.a.d.e, com.google.android.finsky.api.a.d.f, com.google.android.finsky.api.a.d.g, this.K);
        return ((com.android.volley.r)this.F.a()).a(v1);
    }

    public final com.android.volley.n c(String p0, com.android.volley.x p1, com.android.volley.w p2) {
        return ((com.android.volley.r)this.F.a()).a(this.B.a(p0, this.K, this.q(), p1, p2, this));
    }

    public final com.android.volley.n c(String p0, String p1, com.android.volley.x p2, com.android.volley.w p3) {
        v1 = com.google.android.finsky.api.g.ak.buildUpon();
        if (!TextUtils.isEmpty(p1))
            v1.appendQueryParameter("consistency_token", p1);
        v1.appendQueryParameter("ref", p0);
        if (this.M != 0)
            v3 = new com.google.android.finsky.api.a.aq();
        else
            v3 = new com.google.android.finsky.api.a.cy(com.google.wireless.android.finsky.dfe.h.a.ab);
        return ((com.android.volley.r)this.F.a()).a(this.B.a(v1.build().toString(), this.K, v3, p2, p3, this));
    }

    public final com.android.volley.n c(String p0, boolean p1, com.android.volley.x p2, com.android.volley.w p3) {
        v1 = com.google.android.finsky.api.g.ai.buildUpon();
        v1.appendQueryParameter("st", p0);
        if (p1 != 0)
            v1.appendQueryParameter("bsp", "1");
        if (this.M != 0)
            v3 = new com.google.android.finsky.api.a.af();
        else
            v3 = new com.google.android.finsky.api.a.cy(com.google.wireless.android.finsky.dfe.h.a.z);
        return ((com.android.volley.r)this.F.a()).a(this.B.a(v1.build().toString(), this.K, v3, p2, p3, this));
    }

    public final com.android.volley.n c(Collection p0, String p1, com.android.volley.x p2, com.android.volley.w p3) {
        v2 = new com.google.wireless.android.finsky.dfe.nano.do();
        v2.a(p1);
        v2.e = (String[])p0.toArray(new String[p0.size()]);
        return this.c(this.B.a(com.google.android.finsky.api.g.O.toString(), v2, this.K, this.n(), p2, p3, this));
    }

    public final String c() {
        return this.K.b();
    }

    public final void c(String p0) {
        ((com.android.volley.r)this.F.a()).a(new com.google.android.finsky.api.a.cn(this.K.i, this.B.a(p0, this.K, this.q(), 0, 0, this).e()));
    }

    public final com.android.volley.n d(com.android.volley.x p0, com.android.volley.w p1) {
        if (this.M != 0)
            v3 = new com.google.android.finsky.api.a.k();
        else
            v3 = new com.google.android.finsky.api.a.cy(com.google.wireless.android.finsky.dfe.nano.aw);
        v1 = this.B.c(com.google.android.finsky.api.g.A.toString(), this.K, v3, p0, p1, this);
        v1.m = this.v();
        return ((com.android.volley.r)this.F.a()).a(v1);
    }

    public final com.android.volley.n d(String p0, com.android.volley.x p1, com.android.volley.w p2) {
        if (this.M != 0)
            v3 = new com.google.android.finsky.api.a.bk();
        else
            v3 = new com.google.android.finsky.api.a.cy(com.google.wireless.android.finsky.dfe.nano.fv);
        return ((com.android.volley.r)this.F.a()).a(this.B.a(p0, this.K, v3, p1, p2, this));
    }

    public final com.android.volley.n d(String p0, String p1, com.android.volley.x p2, com.android.volley.w p3) {
        if (this.M != 0)
            v3 = new com.google.android.finsky.api.a.bi();
        else
            v3 = new com.google.android.finsky.api.a.cy(com.google.wireless.android.finsky.dfe.nano.fi);
        return ((com.android.volley.r)this.F.a()).a(this.B.a(com.google.android.finsky.api.g.av.buildUpon().appendQueryParameter("doc", p0).appendQueryParameter("wamToken", p1).toString(), this.K, v3, p2, p3, this));
    }

    public final com.android.volley.n d(String p0, boolean p1, com.android.volley.x p2, com.android.volley.w p3) {
        v2 = new com.google.wireless.android.finsky.dfe.a.a.p();
        if (p0 == 0)
            throw new NullPointerException();
        v2.a = v2.a | 1;
        v2.b = p0;
        v2.a = v2.a | 2;
        v2.c = p1;
        if (this.M != 0)
            v4 = new com.google.android.finsky.api.a.bu();
        else
            v4 = new com.google.android.finsky.api.a.cy(com.google.wireless.android.finsky.dfe.a.a.q);
        v0 = this.B.a(com.google.android.finsky.api.g.as.toString(), v2, this.K, v4, p2, p3, this);
        v0.m = new com.google.android.finsky.api.a.cx(com.google.android.finsky.api.a.d.A, this.K);
        return this.c(v0);
    }

    public final void d() {
        ((com.android.volley.r)this.F.a()).a(new com.google.android.finsky.api.a.cn(this.K.i, this.B.a(com.google.android.finsky.api.g.a, com.google.android.finsky.api.g.b.toString(), this.K, this.s(), 0, 0, this).e()));
    }

    public final void d(String p0) {
        ((com.android.volley.r)this.F.a()).a(new com.google.android.finsky.api.a.cn(this.K.i, this.B.a(p0, this.K, this.k(), 0, 0, this).e()));
    }

    public final com.android.volley.n e(com.android.volley.x p0, com.android.volley.w p1) {
        v1 = this.B.c(com.google.android.finsky.api.g.Y.toString(), this.K, this.h(), p0, p1, this);
        v1.m = this.u();
        return ((com.android.volley.r)this.F.a()).a(v1);
    }

    public final com.android.volley.n e(String p0, com.android.volley.x p1, com.android.volley.w p2) {
        return ((com.android.volley.r)this.F.a()).a(this.B.a(p0, this.K, this.l(), p1, p2, this));
    }

    public final String e() {
        return this.K.k;
    }

    public final void e(String p0) {
        ((com.android.volley.r)this.F.a()).a(new com.google.android.finsky.api.a.cn(this.K.i, this.B.a(p0, this.K, this.m(), 0, 0, this).e()));
    }

    public final com.android.volley.n f(com.android.volley.x p0, com.android.volley.w p1) {
        if (this.M != 0)
            v3 = new com.google.android.finsky.api.a.ag();
        else
            v3 = new com.google.android.finsky.api.a.cy(com.google.wireless.android.finsky.dfe.h.a.am);
        return ((com.android.volley.r)this.F.a()).a(this.B.a(com.google.android.finsky.api.g.ae.toString(), this.K, v3, p0, p1, this));
    }

    public final com.android.volley.n f(String p0, com.android.volley.x p1, com.android.volley.w p2) {
        v1 = com.google.android.finsky.api.g.g.buildUpon();
        if (p0 != 0)
            v1.appendQueryParameter("playCountryOverride", p0);
        if (this.M != 0)
            v3 = new com.google.android.finsky.api.a.t();
        else
            v3 = new com.google.android.finsky.api.a.cy(com.google.wireless.android.finsky.dfe.nano.br);
        return ((com.android.volley.r)this.F.a()).a(this.B.a(v1.toString(), this.K, v3, p1, p2, this));
    }

    public final String f() {
        return this.K.l;
    }

    public final void f(String p0) {
        ((com.android.volley.r)this.F.a()).a(new com.google.android.finsky.api.a.cn(((com.android.volley.r)this.F.a()).e, this.B.b(p0, this.K, this.r(), 0, 0, this).e()));
    }

    public final com.android.volley.n g(String p0, com.android.volley.x p1, com.android.volley.w p2) {
        if (this.M != 0)
            v3 = new com.google.android.finsky.api.a.bd();
        else
            v3 = new com.google.android.finsky.api.a.cy(com.google.wireless.android.finsky.dfe.nano.fg);
        return ((com.android.volley.r)this.F.a()).a(this.B.a(p0, this.K, v3, p1, p2, this));
    }

    public final com.google.android.finsky.api.j g(com.android.volley.x p0, com.android.volley.w p1) {
        if (this.M != 0)
            v3 = new com.google.android.finsky.api.a.ay();
        else
            v3 = new com.google.android.finsky.api.a.cy(com.google.wireless.android.finsky.dfe.nano.ds);
        return (com.google.android.finsky.api.j)((com.android.volley.r)this.F.a()).a(this.B.a(com.google.android.finsky.api.g.an.toString(), this.K, v3, p0, p1, this));
    }

    public final com.android.volley.n h(com.android.volley.x p0, com.android.volley.w p1) {
        if (this.M != 0)
            v3 = new com.google.android.finsky.api.a.n();
        else
            v3 = new com.google.android.finsky.api.a.cy(com.google.wireless.android.finsky.dfe.nano.ba);
        v1 = this.B.a(com.google.android.finsky.api.g.ax.toString(), this.K, v3, p0, p1, this);
        v1.i = 0;
        return ((com.android.volley.r)this.F.a()).a(v1);
    }

    public final com.android.volley.n h(String p0, com.android.volley.x p1, com.android.volley.w p2) {
        v1 = this.B.c(p0, this.K, this.h(), p1, p2, this);
        v1.m = this.u();
        return ((com.android.volley.r)this.F.a()).a(v1);
    }

    public final com.android.volley.n i(String p0, com.android.volley.x p1, com.android.volley.w p2) {
        v1 = com.google.android.finsky.api.g.V.buildUpon().appendQueryParameter("doc", p0);
        if (!this.K.h())
            v1.appendQueryParameter("build_fingerprint", Build.FINGERPRINT);
        if (this.M != 0)
            v3 = new com.google.android.finsky.api.a.bb();
        else
            v3 = new com.google.android.finsky.api.a.cy(com.google.wireless.android.finsky.dfe.nano.eg);
        v1 = this.B.a(v1.build().toString(), this.K, v3, p1, p2, this);
        v1.m = new com.google.android.finsky.api.a.cx(((Integer)com.google.android.finsky.api.f.P.b()).intValue(), ((Integer)com.google.android.finsky.api.f.Q.b()).intValue(), ((Float)com.google.android.finsky.api.f.R.b()).floatValue(), this.K);
        v1.C = 1;
        v1.D = 1;
        v1.E = 1;
        return ((com.android.volley.r)this.F.a()).a(v1);
    }

    public final com.android.volley.n j(String p0, com.android.volley.x p1, com.android.volley.w p2) {
        v1 = this.B.c(com.google.android.finsky.api.g.Z.toString(), this.K, this.p(), p1, p2, this);
        v1.a("url", p0);
        v1.m = new com.google.android.finsky.api.a.cx(com.google.android.finsky.api.a.d.k, 0, 0, this.K);
        v1.s();
        return ((com.android.volley.r)this.F.a()).a(v1);
    }

    public final com.android.volley.n k(String p0, com.android.volley.x p1, com.android.volley.w p2) {
        v1 = com.google.android.finsky.api.g.ag.buildUpon();
        v1.appendQueryParameter("ogi", p0);
        if (this.M != 0)
            v3 = new com.google.android.finsky.api.a.ae();
        else
            v3 = new com.google.android.finsky.api.a.cy(com.google.wireless.android.finsky.dfe.h.a.w);
        return ((com.android.volley.r)this.F.a()).a(this.B.a(v1.build().toString(), this.K, v3, p1, p2, this));
    }

    public final com.android.volley.n l(String p0, com.android.volley.x p1, com.android.volley.w p2) {
        if (this.M != 0)
            v3 = new com.google.android.finsky.api.a.ah();
        else
            v3 = new com.google.android.finsky.api.a.cy(com.google.wireless.android.finsky.dfe.k.a.a);
        return ((com.android.volley.r)this.F.a()).a(this.B.a(p0, this.K, v3, p1, p2, this));
    }

    public final com.google.android.finsky.api.j m(String p0, com.android.volley.x p1, com.android.volley.w p2) {
        v1 = this.B.b(p0, this.K, this.r(), p1, p2, this);
        ((com.android.volley.r)this.F.a()).a(v1);
        return v1;
    }

    public final com.android.volley.n n(String p0, com.android.volley.x p1, com.android.volley.w p2) {
        if (this.M != 0)
            v3 = new com.google.android.finsky.api.a.av();
        else
            v3 = new com.google.android.finsky.api.a.cy(com.google.wireless.android.finsky.dfe.nano.dm);
        return ((com.android.volley.r)this.F.a()).a(this.B.a(p0, this.K, v3, p1, p2, this));
    }

    public final com.android.volley.n o(String p0, com.android.volley.x p1, com.android.volley.w p2) {
        if (this.M != 0)
            v3 = new com.google.android.finsky.api.a.ao();
        else
            v3 = new com.google.android.finsky.api.a.cy(com.google.wireless.android.finsky.dfe.nano.cs);
        return ((com.android.volley.r)this.F.a()).a(this.B.a(p0, this.K, v3, p1, p2, this));
    }

    public final com.android.volley.n p(String p0, com.android.volley.x p1, com.android.volley.w p2) {
        return ((com.android.volley.r)this.F.a()).a(this.B.a(p0, this.K, this.o(), p1, p2, this));
    }

    public final com.android.volley.n q(String p0, com.android.volley.x p1, com.android.volley.w p2) {
        v2 = new com.google.wireless.android.finsky.dfe.a.a.f();
        v2.a(p0);
        v2.a(0);
        v0 = this.B.a(com.google.android.finsky.api.g.aA.toString(), v2, this.K, this.t(), p1, p2, this);
        v0.i = 0;
        return this.c(v0);
    }

    public final com.android.volley.n r(String p0, com.android.volley.x p1, com.android.volley.w p2) {
        v2 = new com.google.wireless.android.finsky.dfe.a.a.f();
        v2.a(p0);
        v2.a(1);
        v0 = this.B.a(com.google.android.finsky.api.g.aA.toString(), v2, this.K, this.t(), p1, p2, this);
        v0.i = 0;
        return this.c(v0);
    }

    public final String toString() {
        v0 = FinskyLog.a(this.K.b());
        return (String.valueOf(v0).length() + 15) + "DfeApiImpl { " + v0 + " }";
    }

}
