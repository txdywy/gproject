package com.google.android.finsky.api.p125a;

import android.accounts.Account;
import android.content.Context;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Build;
import android.support.v4.p037h.C0320p;
import android.support.v7.widget.eq;
import android.text.TextUtils;
import android.util.Base64;
import com.android.volley.C0656n;
import com.android.volley.C0657w;
import com.android.volley.C0659a;
import com.android.volley.C0660x;
import com.android.volley.C0689z;
import com.android.volley.C0700r;
import com.google.android.finsky.api.C1228w;
import com.google.android.finsky.api.C1253j;
import com.google.android.finsky.api.C1254c;
import com.google.android.finsky.api.C1255p;
import com.google.android.finsky.api.C1283d;
import com.google.android.finsky.api.C1285f;
import com.google.android.finsky.api.C1286g;
import com.google.android.finsky.api.C1289l;
import com.google.android.finsky.api.C1299v;
import com.google.android.finsky.api.VoucherParams;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.ba.C1552e;
import com.google.android.finsky.cn.C2320a;
import com.google.android.finsky.ct.C2412a;
import com.google.android.finsky.cv.p177a.C2441n;
import com.google.android.finsky.cv.p177a.ax;
import com.google.android.finsky.cv.p177a.gk;
import com.google.android.finsky.cv.p177a.ip;
import com.google.android.finsky.cv.p177a.jd;
import com.google.android.finsky.cv.p177a.jn;
import com.google.android.finsky.cv.p177a.jo;
import com.google.android.finsky.cv.p177a.kd;
import com.google.android.finsky.cv.p177a.lb;
import com.google.android.finsky.cv.p177a.lc;
import com.google.android.finsky.cv.p177a.lg;
import com.google.android.finsky.dg.C2734a;
import com.google.android.finsky.dx.C2910a;
import com.google.android.finsky.providers.C3947d;
import com.google.android.finsky.utils.FinskyLog;
import com.google.protobuf.nano.C0757i;
import com.google.wireless.android.finsky.a.a.bc;
import com.google.wireless.android.finsky.a.a.bd;
import com.google.wireless.android.finsky.dfe.a.a.b;
import com.google.wireless.android.finsky.dfe.a.a.g;
import com.google.wireless.android.finsky.dfe.a.a.j;
import com.google.wireless.android.finsky.dfe.a.a.m;
import com.google.wireless.android.finsky.dfe.a.a.q;
import com.google.wireless.android.finsky.dfe.c.a.ac;
import com.google.wireless.android.finsky.dfe.c.a.ae;
import com.google.wireless.android.finsky.dfe.c.a.al;
import com.google.wireless.android.finsky.dfe.c.a.ao;
import com.google.wireless.android.finsky.dfe.c.a.ap;
import com.google.wireless.android.finsky.dfe.c.a.as;
import com.google.wireless.android.finsky.dfe.c.a.at;
import com.google.wireless.android.finsky.dfe.c.a.be;
import com.google.wireless.android.finsky.dfe.c.a.dt;
import com.google.wireless.android.finsky.dfe.c.a.dy;
import com.google.wireless.android.finsky.dfe.c.a.dz;
import com.google.wireless.android.finsky.dfe.d.a.c;
import com.google.wireless.android.finsky.dfe.e.a.d;
import com.google.wireless.android.finsky.dfe.e.a.e;
import com.google.wireless.android.finsky.dfe.g.a.an;
import com.google.wireless.android.finsky.dfe.h.a.aa;
import com.google.wireless.android.finsky.dfe.h.a.ab;
import com.google.wireless.android.finsky.dfe.h.a.af;
import com.google.wireless.android.finsky.dfe.h.a.ag;
import com.google.wireless.android.finsky.dfe.h.a.aj;
import com.google.wireless.android.finsky.dfe.h.a.am;
import com.google.wireless.android.finsky.dfe.h.a.ar;
import com.google.wireless.android.finsky.dfe.h.a.f;
import com.google.wireless.android.finsky.dfe.h.a.h;
import com.google.wireless.android.finsky.dfe.h.a.i;
import com.google.wireless.android.finsky.dfe.h.a.l;
import com.google.wireless.android.finsky.dfe.h.a.n;
import com.google.wireless.android.finsky.dfe.h.a.p;
import com.google.wireless.android.finsky.dfe.h.a.w;
import com.google.wireless.android.finsky.dfe.h.a.z;
import com.google.wireless.android.finsky.dfe.nano.ContentFilters.ContentFilterSettingsResponse;
import com.google.wireless.android.finsky.dfe.nano.a;
import com.google.wireless.android.finsky.dfe.nano.ak;
import com.google.wireless.android.finsky.dfe.nano.aq;
import com.google.wireless.android.finsky.dfe.nano.au;
import com.google.wireless.android.finsky.dfe.nano.aw;
import com.google.wireless.android.finsky.dfe.nano.ba;
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
import com.google.wireless.android.finsky.dfe.nano.ew;
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
import com.google.wireless.android.p360b.p361a.C6333b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import p002a.C0002a;

public final class C1256d implements C1254c, C1255p {
    public static final int f7524A = ((Integer) C1285f.f7589G.m28964b()).intValue();
    public static final boolean f7525a = ((Boolean) C1285f.f7606c.m28964b()).booleanValue();
    public static final boolean f7526b = ((Boolean) C1285f.f7607d.m28964b()).booleanValue();
    public static final int f7527c = ((Integer) C1285f.f7615l.m28964b()).intValue();
    public static final int f7528d = ((Integer) C1285f.f7616m.m28964b()).intValue();
    public static final int f7529e = ((Integer) C1285f.f7617n.m28964b()).intValue();
    public static final int f7530f = ((Integer) C1285f.f7618o.m28964b()).intValue();
    public static final float f7531g = ((Float) C1285f.f7619p.m28964b()).floatValue();
    public static final int f7532h = ((Integer) C1285f.f7620q.m28964b()).intValue();
    public static final int f7533i = ((Integer) C1285f.f7621r.m28964b()).intValue();
    public static final float f7534j = ((Float) C1285f.f7622s.m28964b()).floatValue();
    public static final int f7535k = ((Integer) C1285f.f7588F.m28964b()).intValue();
    public static final int f7536l = ((Integer) C1285f.f7623t.m28964b()).intValue();
    public static final int f7537m = ((Integer) C1285f.f7624u.m28964b()).intValue();
    public static final float f7538n = ((Float) C1285f.f7625v.m28964b()).floatValue();
    public static final int f7539o = ((Integer) C1285f.f7626w.m28964b()).intValue();
    public static final int f7540p = ((Integer) C1285f.f7627x.m28964b()).intValue();
    public static final float f7541q = ((Float) C1285f.f7628y.m28964b()).floatValue();
    public static final int f7542r = ((Integer) C1285f.f7629z.m28964b()).intValue();
    public static final int f7543s = ((Integer) C1285f.f7583A.m28964b()).intValue();
    public static final float f7544t = ((Float) C1285f.f7584B.m28964b()).floatValue();
    public static final int f7545u = ((Integer) C1285f.f7585C.m28964b()).intValue();
    public static final int f7546v = ((Integer) C1285f.f7586D.m28964b()).intValue();
    public static final float f7547w = ((Float) C1285f.f7587E.m28964b()).floatValue();
    public static final int f7548x = ((Integer) C1285f.f7601S.m28964b()).intValue();
    public static final int f7549y = ((Integer) C1285f.f7602T.m28964b()).intValue();
    public static final float f7550z = ((Float) C1285f.f7603U.m28964b()).floatValue();
    public cr f7551B;
    public C2320a f7552C;
    public C2910a f7553D;
    public C1461c f7554E;
    public C0002a f7555F;
    public Context f7556G;
    public C1289l f7557H;
    public C2412a f7558I;
    public C2734a f7559J;
    public final C1251b f7560K;
    public List f7561L = new ArrayList();
    public final boolean f7562M;

    public C1256d(C1251b c1251b) {
        ((C1250a) C3947d.m18649a(C1250a.class)).mo1706a(this);
        this.f7560K = c1251b;
        C1552e c1552e = c1251b.f7428g;
        boolean z = c1552e != null && c1552e.mo2294a(12636874);
        this.f7562M = z;
    }

    private final cz m7516g() {
        if (this.f7562M) {
            return new C1278z();
        }
        return new cy(ae.class);
    }

    private final cz m7517h() {
        if (this.f7562M) {
            return new C1260h();
        }
        return new cy(au.class);
    }

    private final cz m7518i() {
        if (this.f7562M) {
            return new C1267o();
        }
        return new cy(ContentFilterSettingsResponse.class);
    }

    private final cz m7519j() {
        if (this.f7562M) {
            return new C1273u();
        }
        return new cy(bs.class);
    }

    private final cz m7520k() {
        if (this.f7562M) {
            return new C1274v();
        }
        return new cy(by.class);
    }

    private final cz m7521l() {
        if (this.f7562M) {
            return new ak();
        }
        return new cy(co.class);
    }

    private final cz m7522m() {
        if (this.f7562M) {
            return new ar();
        }
        return new cy(cw.class);
    }

    private final cz m7523n() {
        if (this.f7562M) {
            return new aw();
        }
        return new cy(dp.class);
    }

    private final cz m7524o() {
        if (this.f7562M) {
            return new az();
        }
        return new cy(m.class);
    }

    private final cz m7525p() {
        if (this.f7562M) {
            return new ba();
        }
        return new cy(ea.class);
    }

    private final cz m7526q() {
        if (this.f7562M) {
            return new bj();
        }
        return new cy(ft.class);
    }

    private final cz m7527r() {
        if (this.f7562M) {
            return new bt();
        }
        return new cy(an.class);
    }

    private final cz m7528s() {
        if (this.f7562M) {
            return new bv();
        }
        return new cy(gp.class);
    }

    private final cz m7529t() {
        if (this.f7562M) {
            return new cf();
        }
        return new cy(g.class);
    }

    private final void m7510a(cp cpVar) {
        if (!this.f7554E.dj().mo2294a(12639041)) {
            cpVar.f7466F = true;
        }
    }

    public final Account mo1620b() {
        return this.f7560K.m7284a();
    }

    public final String mo1636c() {
        return this.f7560K.m7287b();
    }

    public final C0656n mo1607a(boolean z, boolean z2, boolean z3, C0660x c0660x, C0657w c0657w) {
        C1552e c1552e = this.f7560K.f7428g;
        Builder buildUpon = C1286g.f7657b.buildUpon();
        if (c1552e != null && z3 && c1552e.mo2294a(12620349)) {
            buildUpon.appendQueryParameter("nocache_isui", Boolean.toString(z3));
        }
        if (z2) {
            buildUpon.appendQueryParameter("nocache_spls", Boolean.toString(z2));
        }
        C0656n a = this.f7551B.m7370a(C1286g.f7656a, buildUpon.build().toString(), this.f7560K, m7528s(), c0660x, c0657w, (C1255p) this);
        a.f7489v = z;
        m7510a((cp) a);
        if (c1552e == null || !c1552e.mo2294a(12603108)) {
            a.f7463C = true;
        }
        a.f7464D = true;
        if (z2) {
            a.f4034i = false;
        }
        return ((C0700r) this.f7555F.mo1a()).m4510a(a);
    }

    public final void mo1642d() {
        ((C0700r) this.f7555F.mo1a()).m4510a(new cn(this.f7560K.f7430i, this.f7551B.m7370a(C1286g.f7656a, C1286g.f7657b.toString(), this.f7560K, m7528s(), null, null, (C1255p) this).mo1546e()));
    }

    public final C0656n mo1556a(C0660x c0660x, C0657w c0657w) {
        cz boVar;
        Builder buildUpon = C1286g.f7658c.buildUpon();
        if (this.f7560K.m7284a() == null) {
            buildUpon.appendQueryParameter("ex", "1");
        }
        cr crVar = this.f7551B;
        Uri uri = C1286g.f7656a;
        String builder = buildUpon.toString();
        C1251b c1251b = this.f7560K;
        if (this.f7562M) {
            boVar = new bo();
        } else {
            boVar = new cy(gb.class);
        }
        C0656n a = crVar.m7370a(uri, builder, c1251b, boVar, c0660x, c0657w, (C1255p) this);
        a.f4034i = false;
        return ((C0700r) this.f7555F.mo1a()).m4510a(a);
    }

    public final C0656n mo1584a(String str, C0660x c0660x, C0657w c0657w) {
        cz bfVar;
        cr crVar = this.f7551B;
        C1251b c1251b = this.f7560K;
        if (this.f7562M) {
            bfVar = new bf();
        } else {
            bfVar = new cy(y.class);
        }
        C0656n a = crVar.m7371a(str, c1251b, bfVar, c0660x, c0657w, this);
        m7510a((cp) a);
        return ((C0700r) this.f7555F.mo1a()).m4510a(a);
    }

    public final C0656n mo1581a(String str, int i, String str2, C0660x c0660x, C0657w c0657w) {
        cz abVar;
        cr crVar = this.f7551B;
        String uri = C1286g.f7633D.toString();
        C1251b c1251b = this.f7560K;
        if (this.f7562M) {
            abVar = new ab();
        } else {
            abVar = new cy(bl.class);
        }
        C0656n c = crVar.m7376c(uri, c1251b, abVar, c0660x, c0657w, this);
        c.m7368a("doc", str);
        c.m7368a("cft", Integer.toString(i));
        if (!TextUtils.isEmpty(str2)) {
            c.m7368a("content", str2);
        }
        return ((C0700r) this.f7555F.mo1a()).m4510a(c);
    }

    public final C0656n mo1597a(String str, boolean z, C0660x c0660x, C0657w c0657w) {
        return ((C0700r) this.f7555F.mo1a()).m4510a(m7515e(str, z, c0660x, c0657w));
    }

    public final C0656n mo1598a(String str, boolean z, Collection collection, C0660x c0660x, C0657w c0657w) {
        C0656n e = m7515e(str, z, c0660x, c0657w);
        C1256d.m7511a((cp) e, collection);
        return ((C0700r) this.f7555F.mo1a()).m4510a(e);
    }

    private final cp m7515e(String str, boolean z, C0660x c0660x, C0657w c0657w) {
        cp a = this.f7551B.m7371a(str, this.f7560K, m7522m(), c0660x, c0657w, this);
        if (z) {
            a.m7367s();
        }
        m7510a(a);
        return a;
    }

    public final C0656n mo1623b(String str, C0660x c0660x, C0657w c0657w) {
        cz bmVar;
        cr crVar = this.f7551B;
        C1251b c1251b = this.f7560K;
        if (this.f7562M) {
            bmVar = new bm();
        } else {
            bmVar = new cy(ga.class);
        }
        C0656n a = crVar.m7371a(str, c1251b, bmVar, c0660x, c0657w, this);
        a.m7367s();
        m7510a((cp) a);
        return ((C0700r) this.f7555F.mo1a()).m4510a(a);
    }

    public final C0656n mo1578a(String str, int i, int i2, int i3, boolean z, C0660x c0660x, C0657w c0657w, C1228w c1228w) {
        cz bnVar;
        Builder appendQueryParameter = C1286g.f7660e.buildUpon().appendQueryParameter("q", str).appendQueryParameter("c", Integer.toString(i)).appendQueryParameter("ssis", Integer.toString(i3));
        if (i2 != 0) {
            appendQueryParameter.appendQueryParameter("sb", Integer.toString(i2));
        }
        appendQueryParameter.appendQueryParameter("sst", Integer.toString(2));
        if (z) {
            appendQueryParameter.appendQueryParameter("sst", Integer.toString(3));
        }
        cr crVar = this.f7551B;
        String builder = appendQueryParameter.toString();
        C1251b c1251b = this.f7560K;
        if (this.f7562M) {
            bnVar = new bn();
        } else {
            bnVar = new cy(jd.class);
        }
        return ((C0700r) this.f7555F.mo1a()).m4510a(crVar.m7372a(builder, c1251b, bnVar, c0660x, c0657w, c1228w, (C1255p) this));
    }

    public final C0656n mo1580a(String str, int i, String str2, int i2, C0660x c0660x, C0657w c0657w, C1228w c1228w) {
        cz ajVar;
        Builder appendQueryParameter = C1286g.f7661f.buildUpon().appendQueryParameter("q", str).appendQueryParameter("n", Integer.toString(i)).appendQueryParameter("cpn", str2).appendQueryParameter("cpv", Integer.toString(i2));
        cr crVar = this.f7551B;
        String builder = appendQueryParameter.toString();
        C1251b c1251b = this.f7560K;
        if (this.f7562M) {
            ajVar = new aj();
        } else {
            ajVar = new cy(b.class);
        }
        return ((C0700r) this.f7555F.mo1a()).m4510a(crVar.m7372a(builder, c1251b, ajVar, c0660x, c0657w, c1228w, (C1255p) this));
    }

    public final C0656n mo1649f(String str, C0660x c0660x, C0657w c0657w) {
        cz c1272t;
        Builder buildUpon = C1286g.f7662g.buildUpon();
        if (str != null) {
            buildUpon.appendQueryParameter("playCountryOverride", str);
        }
        cr crVar = this.f7551B;
        String builder = buildUpon.toString();
        C1251b c1251b = this.f7560K;
        if (this.f7562M) {
            c1272t = new C1272t();
        } else {
            c1272t = new cy(br.class);
        }
        return ((C0700r) this.f7555F.mo1a()).m4510a(crVar.m7371a(builder, c1251b, c1272t, c0660x, c0657w, this));
    }

    public final C0656n mo1583a(String str, int i, boolean z, C0660x c0660x, C0657w c0657w) {
        cz c1275w;
        cr crVar = this.f7551B;
        String uri = C1286g.ac.toString();
        C1251b c1251b = this.f7560K;
        if (this.f7562M) {
            c1275w = new C1275w();
        } else {
            c1275w = new cy(f.class);
        }
        cp c = crVar.m7376c(uri, c1251b, c1275w, c0660x, c0657w, this);
        c.f4038m = m7531v();
        c.m7368a("doc", str);
        c.m7368a("ot", Integer.toString(i));
        c.m7368a("sd", z ? "1" : "0");
        return m7514c(c);
    }

    public final C0656n mo1593a(String str, String str2, String str3, int i, kd kdVar, boolean z, boolean z2, C0660x c0660x, C0657w c0657w) {
        return ((C0700r) this.f7555F.mo1a()).m4510a(this.f7551B.m7374a(C1286g.f7669n.buildUpon().appendQueryParameter("doc", str).appendQueryParameter("title", str2).appendQueryParameter("content", str3).appendQueryParameter("rating", Integer.toString(i)).appendQueryParameter("ipr", Boolean.toString(z)).appendQueryParameter("itpr", Boolean.toString(z2)).toString(), (C0757i) kdVar, this.f7560K, m7526q(), c0660x, c0657w, (C1255p) this));
    }

    public final C0656n mo1627b(String str, boolean z, C0660x c0660x, C0657w c0657w) {
        C0656n c = this.f7551B.m7376c(C1286g.f7670o.toString(), this.f7560K, m7526q(), c0660x, c0657w, this);
        c.m7368a("doc", str);
        c.m7368a("itpr", Boolean.toString(z));
        return ((C0700r) this.f7555F.mo1a()).m4510a(c);
    }

    public final C0656n mo1590a(String str, String str2, int i, C0660x c0660x, C0657w c0657w) {
        C0656n a = this.f7551B.m7371a(C1286g.f7671p.buildUpon().appendQueryParameter("doc", str).appendQueryParameter("revId", str2).appendQueryParameter("rating", Integer.toString(i)).build().toString(), this.f7560K, m7526q(), c0660x, c0657w, this);
        a.f4034i = false;
        a.f7463C = true;
        a.f7466F = true;
        return ((C0700r) this.f7555F.mo1a()).m4510a(a);
    }

    public final C0656n mo1632c(String str, C0660x c0660x, C0657w c0657w) {
        return ((C0700r) this.f7555F.mo1a()).m4510a(this.f7551B.m7371a(str, this.f7560K, m7526q(), c0660x, c0657w, this));
    }

    public final C0656n mo1596a(String str, boolean z, int i, int i2, int i3, C0660x c0660x, C0657w c0657w) {
        Builder buildUpon = Uri.parse(str).buildUpon();
        if (z) {
            buildUpon.appendQueryParameter("dfil", "1");
        }
        if (i > 0) {
            buildUpon.appendQueryParameter("vc", Integer.toString(i));
        }
        if (i2 > 0) {
            buildUpon.appendQueryParameter("rating", Integer.toString(i2));
        }
        if (i3 >= 0) {
            buildUpon.appendQueryParameter("sort", Integer.toString(i3));
        }
        return ((C0700r) this.f7555F.mo1a()).m4510a(this.f7551B.m7371a(buildUpon.toString(), this.f7560K, m7526q(), c0660x, c0657w, this));
    }

    public final C0656n mo1639d(String str, C0660x c0660x, C0657w c0657w) {
        cz bkVar;
        cr crVar = this.f7551B;
        C1251b c1251b = this.f7560K;
        if (this.f7562M) {
            bkVar = new bk();
        } else {
            bkVar = new cy(fv.class);
        }
        return ((C0700r) this.f7555F.mo1a()).m4510a(crVar.m7371a(str, c1251b, bkVar, c0660x, c0657w, this));
    }

    public final C0656n mo1645e(String str, C0660x c0660x, C0657w c0657w) {
        return ((C0700r) this.f7555F.mo1a()).m4510a(this.f7551B.m7371a(str, this.f7560K, m7521l(), c0660x, c0657w, this));
    }

    public final C0656n mo1603a(List list, C0660x c0660x, C0657w c0657w) {
        cz c1268p;
        Builder buildUpon = C1286g.f7634E.buildUpon();
        for (String appendQueryParameter : list) {
            buildUpon.appendQueryParameter("nid", appendQueryParameter);
        }
        cr crVar = this.f7551B;
        String builder = buildUpon.toString();
        C1251b c1251b = this.f7560K;
        if (this.f7562M) {
            c1268p = new C1268p();
        } else {
            c1268p = new cy(com.google.wireless.android.finsky.dfe.nano.b.class);
        }
        return ((C0700r) this.f7555F.mo1a()).m4510a(crVar.m7371a(builder, c1251b, c1268p, c0660x, c0657w, this));
    }

    public final C0656n mo1588a(String str, Boolean bool, Boolean bool2, C0660x c0660x, C0657w c0657w) {
        cz c1257e;
        cr crVar = this.f7551B;
        String uri = C1286g.f7635F.toString();
        C1251b c1251b = this.f7560K;
        if (this.f7562M) {
            c1257e = new C1257e();
        } else {
            c1257e = new cy(a.class);
        }
        C0656n c = crVar.m7376c(uri, c1251b, c1257e, c0660x, c0657w, this);
        c.m7368a("tost", str);
        if (bool != null) {
            c.m7368a("toscme", bool.toString());
        }
        if (bool2 != null) {
            c.m7368a("tosaia", bool2.toString());
        }
        return ((C0700r) this.f7555F.mo1a()).m4510a(c);
    }

    public final C0656n mo1599a(String str, boolean z, boolean z2, String str2, Collection collection, C0660x c0660x, C0657w c0657w) {
        C0656n b = m7512b(str, z, z2, str2, collection, c0660x, c0657w);
        b.m7367s();
        return ((C0700r) this.f7555F.mo1a()).m4510a(b);
    }

    private final cp m7512b(String str, boolean z, boolean z2, String str2, Collection collection, C0660x c0660x, C0657w c0657w) {
        String str3;
        cp a = this.f7551B.m7371a(str, this.f7560K, m7520k(), c0660x, c0657w, this);
        if (!TextUtils.isEmpty(str2) && this.f7554E.dj().mo2294a(12620398)) {
            int g = this.f7552C.mo2859g(str2);
            if (g != -1) {
                str3 = "X-App-Version-Code";
                String num = Integer.toString(g);
                if (a.f7493z == null) {
                    a.f7493z = new HashMap();
                }
                a.f7493z.put(str3, num);
                if (!TextUtils.isEmpty(null)) {
                    if (a.f7461A == null) {
                        a.f7461A = new StringBuilder();
                    }
                    a.f7461A.append("/").append(str3).append("=").append(null);
                }
            }
        }
        if (z) {
            num = "X-DFE-No-Prefetch";
            str3 = "true";
            if (a.f7493z == null) {
                a.f7493z = new HashMap();
            }
            a.f7493z.put(num, str3);
            if (!TextUtils.isEmpty(null)) {
                if (a.f7461A == null) {
                    a.f7461A = new StringBuilder();
                }
                a.f7461A.append("/").append(num).append("=").append(null);
            }
        }
        boolean z3 = z2 || this.f7554E.dj().mo2294a(12631400);
        a.f7466F = z3;
        C1256d.m7511a(a, collection);
        return a;
    }

    private static void m7511a(cp cpVar, Collection collection) {
        if (collection != null && !collection.isEmpty() && ((Boolean) C1285f.f7593K.m28964b()).booleanValue()) {
            String str = "X-DFE-Client-Has-Vouchers";
            String str2 = "true";
            if (cpVar.f7493z == null) {
                cpVar.f7493z = new HashMap();
            }
            cpVar.f7493z.put(str, str2);
            if (!TextUtils.isEmpty(null)) {
                if (cpVar.f7461A == null) {
                    cpVar.f7461A = new StringBuilder();
                }
                cpVar.f7461A.append("/").append(str).append("=").append(null);
            }
            if (collection.size() <= ((Integer) C1285f.f7594L.m28964b()).intValue()) {
                StringBuilder stringBuilder = new StringBuilder();
                for (String str3 : collection) {
                    if (stringBuilder.length() > 0) {
                        stringBuilder.append(',');
                    }
                    stringBuilder.append(Uri.encode(str3));
                }
                str3 = "X-DFE-Vouchers-Backend-Docids-CSV";
                str2 = stringBuilder.toString();
                if (cpVar.f7493z == null) {
                    cpVar.f7493z = new HashMap();
                }
                cpVar.f7493z.put(str3, str2);
                if (!TextUtils.isEmpty(null)) {
                    if (cpVar.f7461A == null) {
                        cpVar.f7461A = new StringBuilder();
                    }
                    cpVar.f7461A.append("/").append(str3).append("=").append(null);
                }
            }
        }
    }

    public final C0656n mo1605a(List list, boolean z, C0660x c0660x, C0657w c0657w) {
        return mo1606a(list, z, false, c0660x, c0657w);
    }

    public final C0656n mo1606a(List list, boolean z, boolean z2, C0660x c0660x, C0657w c0657w) {
        cz cmVar;
        C0757i bvVar = new bv();
        boolean a = this.f7554E.dj().mo2294a(12633232);
        Collections.sort(list, C1283d.f7575a);
        int size = list.size();
        bvVar.b = new bw[size];
        for (int i = 0; i < size; i++) {
            C1283d c1283d = (C1283d) list.get(i);
            bvVar.b[i] = new bw();
            bw bwVar = bvVar.b[i];
            String str = c1283d.f7576b;
            if (str == null) {
                throw new NullPointerException();
            }
            bwVar.c |= 1;
            bwVar.d = str;
            if (!a && c1283d.f7582h) {
                bwVar = bvVar.b[i];
                ca caVar = new ca();
                bwVar.a = -1;
                bwVar.a = 0;
                bwVar.j = caVar;
            }
            if (c1283d.f7577c != null) {
                bwVar = bvVar.b[i];
                int intValue = c1283d.f7577c.intValue();
                bwVar.c |= 2;
                bwVar.e = intValue;
            }
            if (c1283d.f7578d != null) {
                bwVar = bvVar.b[i];
                intValue = c1283d.f7578d.intValue();
                bwVar.c |= 8;
                bwVar.g = intValue;
            }
            if (c1283d.f7579e != null) {
                bwVar = bvVar.b[i];
                long longValue = c1283d.f7579e.longValue();
                bwVar.c |= 16;
                bwVar.h = longValue;
            }
            if (c1283d.f7581g != null) {
                bwVar = bvVar.b[i];
                boolean booleanValue = c1283d.f7581g.booleanValue();
                bwVar.c |= 4;
                bwVar.f = booleanValue;
            }
            if (c1283d.f7580f != null) {
                bvVar.b[i].i = c1283d.f7580f;
            }
        }
        if (z2) {
            bvVar.a |= 2;
            bvVar.d = true;
        }
        Builder buildUpon = C1286g.f7638I.buildUpon();
        if (z) {
            buildUpon.appendQueryParameter("au", "1");
        }
        cr crVar = this.f7551B;
        String uri = buildUpon.build().toString();
        C1251b c1251b = this.f7560K;
        if (this.f7562M) {
            cmVar = new cm();
        } else {
            cmVar = new cy(bx.class);
        }
        C0656n a2 = crVar.m7373a(uri, bvVar, c1251b, cmVar, c0660x, c0657w, new ch(this, bvVar), this);
        a2.f4034i = true;
        a2.f4038m = new cx(f7536l, f7537m, f7538n, this.f7560K);
        a2.f7466F = false;
        return ((C0700r) this.f7555F.mo1a()).m4510a(a2);
    }

    public final C0656n mo1576a(gf gfVar, C0660x c0660x, C0657w c0657w) {
        cz bsVar;
        cr crVar = this.f7551B;
        String uri = C1286g.f7639J.toString();
        C1251b c1251b = this.f7560K;
        if (this.f7562M) {
            bsVar = new bs();
        } else {
            bsVar = new cy(gg.class);
        }
        C0656n a = crVar.m7373a(uri, gfVar, c1251b, bsVar, c0660x, c0657w, new ci(gfVar), this);
        a.f4034i = true;
        a.f4038m = new cx(f7539o, f7540p, f7541q, this.f7560K);
        a.f7466F = false;
        return ((C0700r) this.f7555F.mo1a()).m4510a(a);
    }

    public final C0656n mo1563a(ao aoVar, C0660x c0660x, C0657w c0657w) {
        cz bqVar;
        cr crVar = this.f7551B;
        String uri = C1286g.f7637H.toString();
        C1251b c1251b = this.f7560K;
        if (this.f7562M) {
            bqVar = new bq();
        } else {
            bqVar = new cy(ap.class);
        }
        C0656n a = crVar.m7374a(uri, (C0757i) aoVar, c1251b, bqVar, c0660x, c0657w, (C1255p) this);
        a.f4038m = m7532w();
        a.f4034i = false;
        a.f7466F = false;
        return ((C0700r) this.f7555F.mo1a()).m4510a(a);
    }

    public final C0656n mo1564a(as asVar, C0660x c0660x, C0657w c0657w) {
        cz bzVar;
        cr crVar = this.f7551B;
        String uri = C1286g.f7666k.toString();
        C1251b c1251b = this.f7560K;
        if (this.f7562M) {
            bzVar = new bz();
        } else {
            bzVar = new cy(at.class);
        }
        cp a = crVar.m7374a(uri, (C0757i) asVar, c1251b, bzVar, c0660x, c0657w, (C1255p) this);
        a.f4038m = m7531v();
        return m7514c(a);
    }

    public final C0656n mo1561a(bc bcVar, C0660x c0660x, C0657w c0657w) {
        cz cbVar;
        cr crVar = this.f7551B;
        String uri = C1286g.f7667l.toString();
        C1251b c1251b = this.f7560K;
        if (this.f7562M) {
            cbVar = new cb();
        } else {
            cbVar = new cy(bd.class);
        }
        cp a = crVar.m7374a(uri, (C0757i) bcVar, c1251b, cbVar, c0660x, c0657w, (C1255p) this);
        a.f4038m = m7531v();
        return m7514c(a);
    }

    public final C0656n mo1566a(dy dyVar, C0660x c0660x, C0657w c0657w) {
        cz beVar;
        cr crVar = this.f7551B;
        String uri = C1286g.f7668m.toString();
        C1251b c1251b = this.f7560K;
        if (this.f7562M) {
            beVar = new be();
        } else {
            beVar = new cy(dz.class);
        }
        cp a = crVar.m7374a(uri, (C0757i) dyVar, c1251b, beVar, c0660x, c0657w, (C1255p) this);
        a.f4038m = m7531v();
        return m7514c(a);
    }

    public final C0656n mo1579a(String str, int i, C2441n c2441n, Map map, C0660x c0660x, C0657w c0657w) {
        cz c1259g;
        cr crVar = this.f7551B;
        String uri = C1286g.f7672q.toString();
        C1251b c1251b = this.f7560K;
        if (this.f7562M) {
            c1259g = new C1259g();
        } else {
            c1259g = new cy(ak.class);
        }
        cp c = crVar.m7376c(uri, c1251b, c1259g, c0660x, c0657w, this);
        c.f4038m = m7531v();
        c.m7368a("doc", str);
        c.m7368a("ot", Integer.toString(i));
        if (c2441n != null) {
            c.m7368a("vc", String.valueOf(c2441n.f13163c));
        }
        if (map != null) {
            for (Entry entry : map.entrySet()) {
                c.m7368a((String) entry.getKey(), (String) entry.getValue());
            }
        }
        m7513b(c);
        if (this.f7554E.dj().mo2294a(12623395)) {
            c.m7361c(str);
        }
        return m7514c(c);
    }

    private final void m7513b(cp cpVar) {
        if (f7525a) {
            C1251b c1251b = this.f7560K;
            CharSequence c = c1251b.f7442u == null ? null : c1251b.f7442u.mo2831c();
            if (!TextUtils.isEmpty(c)) {
                String str = "X-Public-Android-Id";
                if (cpVar.f7493z == null) {
                    cpVar.f7493z = new HashMap();
                }
                cpVar.f7493z.put(str, c);
                if (!TextUtils.isEmpty(null)) {
                    if (cpVar.f7461A == null) {
                        cpVar.f7461A = new StringBuilder();
                    }
                    cpVar.f7461A.append("/").append(str).append("=").append(null);
                }
            }
        }
        if (f7526b) {
            cpVar.m7367s();
        }
    }

    public final C1253j mo1613a(String str, ax axVar, int i, String str2, ez ezVar, al alVar, String str3, int i2, VoucherParams voucherParams, int i3, int i4, Map map, C0660x c0660x, C0657w c0657w) {
        cz bcVar;
        cr crVar = this.f7551B;
        String uri = C1286g.f7673r.toString();
        C1251b c1251b = this.f7560K;
        if (this.f7562M) {
            bcVar = new bc();
        } else {
            bcVar = new cy(fa.class);
        }
        C0656n c = crVar.m7376c(uri, c1251b, bcVar, c0660x, c0657w, this);
        c.f4038m = m7532w();
        c.m7368a("doc", str);
        if (axVar != null) {
            c.m7368a("fdid", Base64.encodeToString(C0757i.m4909a((C0757i) axVar), 10));
        }
        if (TextUtils.isEmpty(str2)) {
            c.m7368a("ot", Integer.toString(i));
        } else {
            c.m7368a("oi", str2);
        }
        if (str3 != null) {
            c.m7368a("ii", str3);
        }
        c.m7368a("chv", String.valueOf(voucherParams.f7421c));
        c.m7368a("aav", String.valueOf(voucherParams.f7420b));
        if (!TextUtils.isEmpty(voucherParams.f7419a)) {
            c.m7368a("usvid", voucherParams.f7419a);
        }
        if (i3 > 0) {
            c.m7368a("vc", String.valueOf(i3));
        }
        if (i4 != 0) {
            c.m7368a("apvc", String.valueOf(i4));
        }
        if (i2 != 0) {
            c.m7368a("ipt", String.valueOf(i2));
        }
        if (ezVar != null) {
            if (((ezVar.a & 1) != 0 ? 1 : null) != null) {
                c.m7368a("bav", Integer.toString(ezVar.b));
            }
            if (!TextUtils.isEmpty(ezVar.c)) {
                c.m7368a("shpn", ezVar.c);
            }
            if (!TextUtils.isEmpty(ezVar.e)) {
                c.m7368a("shh", ezVar.e);
            }
            if (((ezVar.a & 4) != 0 ? 1 : null) != null) {
                c.m7368a("shvc", Integer.toString(ezVar.d));
            }
            if (!TextUtils.isEmpty(ezVar.f)) {
                c.m7368a("payload", ezVar.f);
            }
            if (ezVar.g != null) {
                for (String a : ezVar.g) {
                    c.m7368a("odid", a);
                }
            }
            ew[] ewVarArr = ezVar.h;
            if (ewVarArr != null && ewVarArr.length > 0) {
                C0757i exVar = new ex();
                exVar.a = ewVarArr;
                c.m7368a("iabx", Base64.encodeToString(C0757i.m4909a(exVar), 10));
            }
            if (((ezVar.a & 32) != 0 ? 1 : null) != null) {
                c.m7368a("iapc", Integer.toString(ezVar.i));
            }
            if (((ezVar.a & 64) != 0 ? 1 : null) != null) {
                c.m7368a("ipn", ezVar.j);
            }
            if (((ezVar.a & 128) != 0 ? 1 : null) != null) {
                c.m7368a("iad", Boolean.toString(ezVar.k));
            }
            if (((ezVar.a & 256) != 0 ? 1 : null) != null) {
                c.m7368a("isa", Boolean.toString(ezVar.l));
            }
            if (((ezVar.a & 512) != 0 ? 1 : null) != null) {
                c.m7368a("iia", Boolean.toString(ezVar.m));
            }
        }
        C1256d.m7509a((co) c, alVar);
        if (map != null) {
            for (Entry entry : map.entrySet()) {
                c.m7368a((String) entry.getKey(), (String) entry.getValue());
            }
        }
        return (C1253j) ((C0700r) this.f7555F.mo1a()).m4510a(c);
    }

    public final C1253j mo1615a(String str, Map map, al alVar, boolean z, lg lgVar, C0660x c0660x, C0657w c0657w) {
        cz c1264l;
        Uri uri = C1286g.f7674s;
        if (z) {
            Builder buildUpon = uri.buildUpon();
            buildUpon.appendQueryParameter("s7e_suffix", (String) C1285f.f7597O.m28964b());
            Set<String> queryParameterNames = uri.getQueryParameterNames();
            if (queryParameterNames.size() > 0) {
                for (String str2 : queryParameterNames) {
                    buildUpon.appendQueryParameter(str2, uri.getQueryParameter(str2));
                }
            }
            uri = buildUpon.build();
        }
        cr crVar = this.f7551B;
        String uri2 = uri.toString();
        C1251b c1251b = this.f7560K;
        if (this.f7562M) {
            c1264l = new C1264l();
        } else {
            c1264l = new cy(et.class);
        }
        cp c = crVar.m7376c(uri2, c1251b, c1264l, c0660x, c0657w, this);
        c.m7368a("pct", str);
        c.f4038m = m7531v();
        if (map != null) {
            for (Entry entry : map.entrySet()) {
                c.m7368a((String) entry.getKey(), (String) entry.getValue());
            }
        }
        C1256d.m7509a((co) c, alVar);
        c.f7462B = lgVar;
        m7513b(c);
        return m7514c(c);
    }

    public final C1253j mo1611a(ac acVar, lg lgVar, String str, dt dtVar, C0320p c0320p, C0660x c0660x, C0657w c0657w) {
        cp a;
        int i;
        dc cjVar = new cj(acVar);
        if (c0320p == null) {
            Uri uri;
            if (acVar.n) {
                uri = C1286g.f7675t;
            } else {
                uri = C1286g.f7676u;
            }
            a = this.f7551B.m7373a(uri.toString(), acVar, this.f7560K, m7516g(), c0660x, c0657w, cjVar, this);
        } else {
            C0656n a2 = this.f7551B.m7373a(C1286g.f7676u.buildUpon().appendQueryParameter("s7e_mode", "proto").build().toString(), acVar, this.f7560K, m7516g(), c0660x, c0657w, cjVar, this);
            String str2 = (String) c0320p.f1762a;
            String str3 = (String) c0320p.f1763b;
            if (a2.f7493z == null) {
                a2.f7493z = new HashMap();
            }
            a2.f7493z.put(str2, str3);
            if (!TextUtils.isEmpty(null)) {
                if (a2.f7461A == null) {
                    a2.f7461A = new StringBuilder();
                }
                a2.f7461A.append("/").append(str2).append("=").append(null);
            }
            C0656n c0656n = a2;
        }
        boolean z = acVar.n;
        if (acVar.i != null) {
            i = acVar.i.l | z;
        } else {
            boolean z2 = z;
        }
        a.f4034i = i == 0;
        if (dtVar == null) {
            a.f4038m = m7531v();
        } else {
            a.f4038m = new cx(dtVar.b, dtVar.c, dtVar.d, this.f7560K);
        }
        m7513b(a);
        if (z && str != null && this.f7554E.dj().mo2294a(12623395)) {
            a.m7361c(str);
        }
        if (lgVar != null) {
            a.f7462B = lgVar;
        }
        if (((acVar.a & eq.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? 1 : null) != null) {
            return (C1253j) ((C0700r) this.f7555F.mo1a()).m4510a((C0656n) a);
        }
        return m7514c(a);
    }

    public final C0656n mo1585a(String str, ax axVar, C0660x c0660x, C0657w c0657w) {
        cz blVar;
        cr crVar = this.f7551B;
        String uri = C1286g.f7677v.toString();
        C1251b c1251b = this.f7560K;
        if (this.f7562M) {
            blVar = new bl();
        } else {
            blVar = new cy(fw.class);
        }
        cp c = crVar.m7376c(uri, c1251b, blVar, c0660x, c0657w, this);
        c.f4038m = m7531v();
        c.m7368a("doc", str);
        if (axVar != null) {
            c.m7368a("fdid", Base64.encodeToString(C0757i.m4909a((C0757i) axVar), 10));
        }
        c.m7368a("ot", Integer.toString(1));
        return m7514c(c);
    }

    public final C0656n mo1569a(h hVar, C0660x c0660x, C0657w c0657w) {
        cz c1277y;
        cr crVar = this.f7551B;
        String uri = C1286g.f7678w.toString();
        C1251b c1251b = this.f7560K;
        if (this.f7562M) {
            c1277y = new C1277y();
        } else {
            c1277y = new cy(i.class);
        }
        C0656n a = crVar.m7374a(uri, (C0757i) hVar, c1251b, c1277y, c0660x, c0657w, (C1255p) this);
        a.f4038m = m7531v();
        return ((C0700r) this.f7555F.mo1a()).m4510a(a);
    }

    public final C0656n mo1621b(C0660x c0660x, C0657w c0657w) {
        cz c1261i;
        cr crVar = this.f7551B;
        String uri = C1286g.f7679x.toString();
        C1251b c1251b = this.f7560K;
        if (this.f7562M) {
            c1261i = new C1261i();
        } else {
            c1261i = new cy(aq.class);
        }
        return ((C0700r) this.f7555F.mo1a()).m4510a(crVar.m7376c(uri, c1251b, c1261i, c0660x, c0657w, this));
    }

    public final C0656n mo1631c(C0660x c0660x, C0657w c0657w) {
        cz acVar;
        cr crVar = this.f7551B;
        String uri = C1286g.f7680y.toString();
        C1251b c1251b = this.f7560K;
        if (this.f7562M) {
            acVar = new ac();
        } else {
            acVar = new cy(fq.class);
        }
        C0656n a = crVar.m7371a(uri, c1251b, acVar, c0660x, c0657w, this);
        a.f7463C = true;
        a.f4038m = new cx(f7529e, f7530f, f7531g, this.f7560K);
        return ((C0700r) this.f7555F.mo1a()).m4510a(a);
    }

    public final C0656n mo1554a(long j, C0660x c0660x, C0657w c0657w) {
        cz adVar;
        Builder buildUpon = C1286g.f7681z.buildUpon();
        buildUpon.appendQueryParameter("raid", Long.toString(j));
        cr crVar = this.f7551B;
        String builder = buildUpon.toString();
        C1251b c1251b = this.f7560K;
        if (this.f7562M) {
            adVar = new ad();
        } else {
            adVar = new cy(fr.class);
        }
        C0656n a = crVar.m7371a(builder, c1251b, adVar, c0660x, c0657w, this);
        a.f7463C = true;
        a.f4038m = new cx(f7532h, f7533i, f7534j, this.f7560K);
        return ((C0700r) this.f7555F.mo1a()).m4510a(a);
    }

    public final C0656n mo1638d(C0660x c0660x, C0657w c0657w) {
        cz c1263k;
        cr crVar = this.f7551B;
        String uri = C1286g.f7630A.toString();
        C1251b c1251b = this.f7560K;
        if (this.f7562M) {
            c1263k = new C1263k();
        } else {
            c1263k = new cy(aw.class);
        }
        C0656n c = crVar.m7376c(uri, c1251b, c1263k, c0660x, c0657w, this);
        c.f4038m = m7531v();
        return ((C0700r) this.f7555F.mo1a()).m4510a(c);
    }

    public final C0656n mo1595a(String str, Map map, C0660x c0660x, C0657w c0657w) {
        cz auVar;
        cr crVar = this.f7551B;
        String uri = C1286g.f7631B.toString();
        C1251b c1251b = this.f7560K;
        if (this.f7562M) {
            auVar = new au();
        } else {
            auVar = new cy(com.google.wireless.android.finsky.dfe.nano.ap.class);
        }
        C0656n c = crVar.m7376c(uri, c1251b, auVar, c0660x, c0657w, this);
        c.f4038m = m7531v();
        if (str != null) {
            c.m7368a("pct", str);
        }
        if (map != null) {
            for (Entry entry : map.entrySet()) {
                c.m7368a((String) entry.getKey(), (String) entry.getValue());
            }
        }
        return ((C0700r) this.f7555F.mo1a()).m4510a(c);
    }

    public final C0656n mo1565a(com.google.wireless.android.finsky.dfe.c.a.bc bcVar, C0660x c0660x, C0657w c0657w) {
        cz c1271s;
        cr crVar = this.f7551B;
        String uri = C1286g.az.toString();
        C1251b c1251b = this.f7560K;
        if (this.f7562M) {
            c1271s = new C1271s();
        } else {
            c1271s = new cy(be.class);
        }
        return ((C0700r) this.f7555F.mo1a()).m4510a(crVar.m7374a(uri, (C0757i) bcVar, c1251b, c1271s, c0660x, c0657w, (C1255p) this));
    }

    public final C0656n mo1573a(cz czVar, C0660x c0660x, C0657w c0657w) {
        cz asVar;
        cr crVar = this.f7551B;
        String uri = C1286g.f7632C.toString();
        C1251b c1251b = this.f7560K;
        if (this.f7562M) {
            asVar = new as();
        } else {
            asVar = new cy(da.class);
        }
        return ((C0700r) this.f7555F.mo1a()).m4510a(crVar.m7374a(uri, (C0757i) czVar, c1251b, asVar, c0660x, c0657w, (C1255p) this));
    }

    public final C0656n mo1572a(cu cuVar, C0660x c0660x, C0657w c0657w) {
        cz apVar;
        cr crVar = this.f7551B;
        String uri = C1286g.f7641L.toString();
        C1251b c1251b = this.f7560K;
        if (this.f7562M) {
            apVar = new ap();
        } else {
            apVar = new cy(cv.class);
        }
        cp a = crVar.m7374a(uri, (C0757i) cuVar, c1251b, apVar, c0660x, c0657w, (C1255p) this);
        a.f4038m = new cx(f7542r, f7543s, f7544t, this.f7560K);
        return m7514c(a);
    }

    public final C0656n mo1600a(String str, byte[] bArr, Integer num, Integer num2, Integer num3, Integer num4, Long l, String[] strArr, String[] strArr2, String str2, String str3, boolean z, String str4, String str5, String[] strArr3, C0660x c0660x, C0657w c0657w) {
        Builder appendQueryParameter = C1286g.f7642M.buildUpon().appendQueryParameter("doc", str).appendQueryParameter("ot", Integer.toString(1));
        if (bArr != null) {
            appendQueryParameter.appendQueryParameter("st", Base64.encodeToString(bArr, 10));
        }
        if (num != null) {
            appendQueryParameter.appendQueryParameter("vc", num.toString());
        }
        if (num2 != null) {
            appendQueryParameter.appendQueryParameter("bvc", num2.toString());
            if (strArr != null) {
                for (String appendQueryParameter2 : strArr) {
                    appendQueryParameter.appendQueryParameter("pf", appendQueryParameter2);
                }
            }
        }
        if (num3 != null) {
            appendQueryParameter.appendQueryParameter("da", num3.toString());
        }
        if (num4 != null) {
            appendQueryParameter.appendQueryParameter("bda", num4.toString());
        }
        if (l != null) {
            appendQueryParameter.appendQueryParameter("bf", l.toString());
        }
        if (strArr2 != null) {
            for (String appendQueryParameter22 : strArr2) {
                appendQueryParameter.appendQueryParameter("fdcf", appendQueryParameter22);
            }
        }
        if (!TextUtils.isEmpty(str2)) {
            appendQueryParameter.appendQueryParameter("shh", str2);
        }
        if (!TextUtils.isEmpty(str3)) {
            appendQueryParameter.appendQueryParameter("ch", str3);
        }
        if (!TextUtils.isEmpty(str4)) {
            appendQueryParameter.appendQueryParameter("dtok", str4);
        }
        if (z) {
            appendQueryParameter.appendQueryParameter("isbg", "1");
        }
        if (!TextUtils.isEmpty(str5)) {
            appendQueryParameter.appendQueryParameter("isid", str5);
        }
        if (m7535z() && strArr3 != null) {
            for (String appendQueryParameter222 : strArr3) {
                appendQueryParameter.appendQueryParameter("mn", appendQueryParameter222);
            }
        }
        C0656n a = this.f7551B.m7370a(C1286g.f7656a, appendQueryParameter.build().toString(), this.f7560K, m7519j(), c0660x, c0657w, (C1255p) this);
        a.f4034i = false;
        a.f7463C = true;
        a.f7466F = true;
        return ((C0700r) this.f7555F.mo1a()).m4510a(a);
    }

    public final C0656n mo1582a(String str, int i, List list, int[] iArr, int[] iArr2, C0660x c0660x, C0657w c0657w) {
        C0757i dqVar = new dq();
        if (str == null) {
            throw new NullPointerException();
        }
        int i2;
        int i3;
        cz axVar;
        dqVar.a |= 1;
        dqVar.b = str;
        dqVar.a |= 2;
        dqVar.c = i;
        int size = list.size();
        dqVar.d = new fh[size];
        for (i2 = 0; i2 < size; i2++) {
            dqVar.d[i2] = (fh) list.get(i2);
        }
        i2 = iArr.length;
        dqVar.e = new int[i2];
        for (i3 = 0; i3 < i2; i3++) {
            dqVar.e[i3] = iArr[i3];
        }
        i2 = iArr2.length;
        dqVar.f = new int[i2];
        for (i3 = 0; i3 < i2; i3++) {
            dqVar.f[i3] = iArr2[i3];
        }
        cr crVar = this.f7551B;
        String uri = C1286g.f7643N.toString();
        C1251b c1251b = this.f7560K;
        if (this.f7562M) {
            axVar = new ax();
        } else {
            axVar = new cy(dr.class);
        }
        C0656n a = crVar.m7374a(uri, dqVar, c1251b, axVar, c0660x, c0657w, (C1255p) this);
        a.m7368a("doc", str);
        return ((C0700r) this.f7555F.mo1a()).m4510a(a);
    }

    public final String mo1616a(int i, String str, int i2, byte[] bArr) {
        Builder appendQueryParameter = C1286g.f7636G.buildUpon().appendQueryParameter("c", Integer.toString(i)).appendQueryParameter("dt", Integer.toString(i2)).appendQueryParameter("libid", str);
        if (bArr != null) {
            appendQueryParameter.appendQueryParameter("st", Base64.encodeToString(bArr, 10));
        }
        return appendQueryParameter.toString();
    }

    public final C0656n mo1592a(String str, String str2, C0660x c0660x, C0657w c0657w, C1228w c1228w) {
        cz bhVar;
        Builder appendQueryParameter = C1286g.f7640K.buildUpon().appendQueryParameter("url", str);
        if (!TextUtils.isEmpty(str2)) {
            appendQueryParameter.appendQueryParameter("ref", str2);
        }
        cr crVar = this.f7551B;
        String builder = appendQueryParameter.toString();
        C1251b c1251b = this.f7560K;
        if (this.f7562M) {
            bhVar = new bh();
        } else {
            bhVar = new cy(ip.class);
        }
        C0656n a = crVar.m7372a(builder, c1251b, bhVar, c0660x, c0657w, c1228w, (C1255p) this);
        m7513b((cp) a);
        a.m7367s();
        if (this.f7554E.dj().mo2294a(12631400)) {
            a.f7466F = true;
        }
        return ((C0700r) this.f7555F.mo1a()).m4510a(a);
    }

    public final C0656n mo1652g(String str, C0660x c0660x, C0657w c0657w) {
        cz bdVar;
        cr crVar = this.f7551B;
        C1251b c1251b = this.f7560K;
        if (this.f7562M) {
            bdVar = new bd();
        } else {
            bdVar = new cy(fg.class);
        }
        return ((C0700r) this.f7555F.mo1a()).m4510a(crVar.m7371a(str, c1251b, bdVar, c0660x, c0657w, this));
    }

    public final C0656n mo1575a(ek ekVar, C0660x c0660x, C0657w c0657w) {
        cz bgVar;
        cr crVar = this.f7551B;
        String uri = C1286g.f7652W.toString();
        C1251b c1251b = this.f7560K;
        if (this.f7562M) {
            bgVar = new bg();
        } else {
            bgVar = new cy(el.class);
        }
        cp a = crVar.m7374a(uri, (C0757i) ekVar, c1251b, bgVar, c0660x, c0657w, (C1255p) this);
        a.f4038m = m7531v();
        m7513b(a);
        return m7514c(a);
    }

    public final C0656n mo1644e(C0660x c0660x, C0657w c0657w) {
        C0656n c = this.f7551B.m7376c(C1286g.f7654Y.toString(), this.f7560K, m7517h(), c0660x, c0657w, this);
        c.f4038m = m7530u();
        return ((C0700r) this.f7555F.mo1a()).m4510a(c);
    }

    public final C0656n mo1626b(String str, Map map, C0660x c0660x, C0657w c0657w) {
        C0656n c = this.f7551B.m7376c(str, this.f7560K, m7517h(), c0660x, c0657w, this);
        for (Entry entry : map.entrySet()) {
            c.m7368a((String) entry.getKey(), (String) entry.getValue());
        }
        c.f4038m = m7530u();
        return ((C0700r) this.f7555F.mo1a()).m4510a(c);
    }

    public final C0656n mo1655h(String str, C0660x c0660x, C0657w c0657w) {
        C0656n c = this.f7551B.m7376c(str, this.f7560K, m7517h(), c0660x, c0657w, this);
        c.f4038m = m7530u();
        return ((C0700r) this.f7555F.mo1a()).m4510a(c);
    }

    public final C0656n mo1594a(String str, String str2, String str3, C0660x c0660x, C0657w c0657w) {
        C0656n c = this.f7551B.m7376c(str, this.f7560K, m7517h(), c0660x, c0657w, this);
        c.m7368a(str2, str3);
        c.f4038m = m7530u();
        return ((C0700r) this.f7555F.mo1a()).m4510a(c);
    }

    public final C0656n mo1625b(String str, String str2, C0660x c0660x, C0657w c0657w) {
        C0656n c = this.f7551B.m7376c(C1286g.f7655Z.toString(), this.f7560K, m7525p(), c0660x, c0657w, this);
        c.m7368a("doc", str);
        c.m7368a("referrer", str2);
        c.f4038m = new cx(f7535k, 0, 0.0f, this.f7560K);
        c.m7367s();
        return ((C0700r) this.f7555F.mo1a()).m4510a(c);
    }

    public final C0656n mo1657j(String str, C0660x c0660x, C0657w c0657w) {
        C0656n c = this.f7551B.m7376c(C1286g.f7655Z.toString(), this.f7560K, m7525p(), c0660x, c0657w, this);
        c.m7368a("url", str);
        c.f4038m = new cx(f7535k, 0, 0.0f, this.f7560K);
        c.m7367s();
        return ((C0700r) this.f7555F.mo1a()).m4510a(c);
    }

    public final C0656n mo1604a(List list, C0660x c0660x, C0657w c0657w, C1299v c1299v) {
        cz caVar;
        C0757i bVar = new com.google.wireless.android.finsky.dfe.d.a.b();
        bVar.a = new com.google.wireless.android.finsky.dfe.d.a.a[list.size()];
        for (int i = 0; i < list.size(); i++) {
            com.google.wireless.android.finsky.dfe.d.a.a aVar = new com.google.wireless.android.finsky.dfe.d.a.a();
            String str = (String) list.get(i);
            if (str == null) {
                throw new NullPointerException();
            }
            aVar.b |= 1;
            aVar.c = str;
            bVar.a[i] = aVar;
        }
        cr crVar = this.f7551B;
        String uri = C1286g.au.toString();
        C1251b c1251b = this.f7560K;
        if (this.f7562M) {
            caVar = new ca();
        } else {
            caVar = new cy(c.class);
        }
        C0656n a = crVar.m7374a(uri, bVar, c1251b, caVar, c0660x, c0657w, (C1255p) this);
        a.f7476P = c1299v;
        return ((C0700r) this.f7555F.mo1a()).m4510a(a);
    }

    private final cx m7530u() {
        return new cx(f7528d, 0, 0.0f, this.f7560K);
    }

    private final cx m7531v() {
        return new cx(f7527c, 0, 0.0f, this.f7560K);
    }

    private final C0689z m7532w() {
        C1552e dj = this.f7554E.dj();
        if (dj.mo2294a(12602810)) {
            return new da(2500, this.f7560K);
        }
        if (dj.mo2294a(12602812)) {
            return new da(3500, this.f7560K);
        }
        if (dj.mo2294a(12602814)) {
            return new da(5000, this.f7560K);
        }
        if (dj.mo2294a(12602816)) {
            return new da(7000, this.f7560K);
        }
        return m7531v();
    }

    private final C1253j m7514c(cp cpVar) {
        cpVar.f7467G = new cw(this.f7560K.f7427f);
        return (C1253j) ((C0700r) this.f7555F.mo1a()).m4510a((C0656n) cpVar);
    }

    public final C0656n mo1602a(Collection collection, String str, C0660x c0660x, C0657w c0657w) {
        C0757i doVar = new do();
        doVar.a(str);
        doVar.c = (String[]) collection.toArray(new String[collection.size()]);
        return m7514c(this.f7551B.m7374a(C1286g.f7644O.toString(), doVar, this.f7560K, m7523n(), c0660x, c0657w, (C1255p) this));
    }

    public final C0656n mo1628b(Collection collection, String str, C0660x c0660x, C0657w c0657w) {
        C0757i doVar = new do();
        doVar.a(str);
        doVar.d = (String[]) collection.toArray(new String[collection.size()]);
        return m7514c(this.f7551B.m7374a(C1286g.f7644O.toString(), doVar, this.f7560K, m7523n(), c0660x, c0657w, (C1255p) this));
    }

    public final C0656n mo1635c(Collection collection, String str, C0660x c0660x, C0657w c0657w) {
        C0757i doVar = new do();
        doVar.a(str);
        doVar.e = (String[]) collection.toArray(new String[collection.size()]);
        return m7514c(this.f7551B.m7374a(C1286g.f7644O.toString(), doVar, this.f7560K, m7523n(), c0660x, c0657w, (C1255p) this));
    }

    public final C0656n mo1591a(String str, String str2, C0660x c0660x, C0657w c0657w) {
        cz c1265m;
        cr crVar = this.f7551B;
        String uri = C1286g.f7645P.toString();
        C1251b c1251b = this.f7560K;
        if (this.f7562M) {
            c1265m = new C1265m();
        } else {
            c1265m = new cy(com.google.wireless.android.finsky.dfe.nano.ax.class);
        }
        cp c = crVar.m7376c(uri, c1251b, c1265m, c0660x, c0657w, this);
        c.f4038m = m7531v();
        c.m7368a("pt", str);
        c.m7368a("ot", Integer.toString(1));
        c.m7368a("shpn", str2);
        return m7514c(c);
    }

    public final C0656n mo1552a(int i, String str, String str2, String str3, ex exVar, C0660x c0660x, C0657w c0657w) {
        cz anVar;
        Builder appendQueryParameter = C1286g.f7646Q.buildUpon().appendQueryParameter("bav", Integer.toString(i)).appendQueryParameter("shpn", str).appendQueryParameter("iabt", str2);
        if (!TextUtils.isEmpty(str3)) {
            appendQueryParameter.appendQueryParameter("ctntkn", str3);
        }
        if (exVar != null) {
            appendQueryParameter.appendQueryParameter("iabx", Base64.encodeToString(C0757i.m4909a((C0757i) exVar), 10));
        }
        cr crVar = this.f7551B;
        String builder = appendQueryParameter.toString();
        C1251b c1251b = this.f7560K;
        if (this.f7562M) {
            anVar = new an();
        } else {
            anVar = new cy(ey.class);
        }
        return m7514c(crVar.m7371a(builder, c1251b, anVar, c0660x, c0657w, this));
    }

    public final void mo1630b(String str) {
        ((C0700r) this.f7555F.mo1a()).m4510a(new cn(this.f7560K.f7430i, this.f7551B.m7371a(str, this.f7560K, m7521l(), null, null, this).mo1546e()));
    }

    public final void mo1637c(String str) {
        ((C0700r) this.f7555F.mo1a()).m4510a(new cn(this.f7560K.f7430i, this.f7551B.m7371a(str, this.f7560K, m7526q(), null, null, this).mo1546e()));
    }

    public final void mo1643d(String str) {
        ((C0700r) this.f7555F.mo1a()).m4510a(new cn(this.f7560K.f7430i, this.f7551B.m7371a(str, this.f7560K, m7520k(), null, null, this).mo1546e()));
    }

    public final void mo1647e(String str) {
        ((C0700r) this.f7555F.mo1a()).m4510a(new cn(this.f7560K.f7430i, this.f7551B.m7371a(str, this.f7560K, m7522m(), null, null, this).mo1546e()));
    }

    public final C0656n mo1560a(C6333b c6333b, String str, com.google.wireless.android.b.a.a aVar, gt gtVar, e eVar, C0660x c0660x, C0657w c0657w) {
        cz cdVar;
        C0757i guVar = new gu();
        if (c6333b != null) {
            guVar.b = c6333b;
        }
        if (str != null) {
            if (str == null) {
                throw new NullPointerException();
            }
            guVar.a |= 1;
            guVar.d = str;
        }
        guVar.c = aVar;
        guVar.e = gtVar;
        guVar.f = eVar;
        String uri = C1286g.f7647R.toString();
        cr crVar = this.f7551B;
        C1251b c1251b = this.f7560K;
        if (this.f7562M) {
            cdVar = new cd();
        } else {
            cdVar = new cy(gv.class);
        }
        C0656n a = crVar.m7374a(uri, guVar, c1251b, cdVar, c0660x, c0657w, (C1255p) this);
        a.f4038m = m7531v();
        return ((C0700r) this.f7555F.mo1a()).m4510a(a);
    }

    public final C0656n mo1567a(d dVar, e[] eVarArr, C0660x c0660x, C0657w c0657w) {
        cz ceVar;
        C0757i bVar = new com.google.wireless.android.finsky.dfe.e.a.b();
        bVar.a = dVar;
        if (eVarArr != null) {
            bVar.b = eVarArr;
        }
        String uri = C1286g.f7648S.toString();
        cr crVar = this.f7551B;
        C1251b c1251b = this.f7560K;
        if (this.f7562M) {
            ceVar = new ce();
        } else {
            ceVar = new cy(com.google.wireless.android.finsky.dfe.e.a.c.class);
        }
        C0656n a = crVar.m7374a(uri, bVar, c1251b, ceVar, c0660x, c0657w, (C1255p) this);
        a.f4038m = m7531v();
        return ((C0700r) this.f7555F.mo1a()).m4510a(a);
    }

    public final C0656n mo1559a(C6333b c6333b, C0660x c0660x, C0657w c0657w) {
        cz c1276x;
        C0757i cjVar = new cj();
        if (c6333b != null) {
            cjVar.a = c6333b;
        }
        String uri = C1286g.f7649T.toString();
        cr crVar = this.f7551B;
        C1251b c1251b = this.f7560K;
        if (this.f7562M) {
            c1276x = new C1276x();
        } else {
            c1276x = new cy(ck.class);
        }
        C0656n a = crVar.m7374a(uri, cjVar, c1251b, c1276x, c0660x, c0657w, (C1255p) this);
        a.f4038m = m7533x();
        a.f7466F = false;
        String str = "X-DFE-Setup-Flow-Type";
        String y = m7534y();
        if (a.f7493z == null) {
            a.f7493z = new HashMap();
        }
        a.f7493z.put(str, y);
        if (!TextUtils.isEmpty(null)) {
            if (a.f7461A == null) {
                a.f7461A = new StringBuilder();
            }
            a.f7461A.append("/").append(str).append("=").append(null);
        }
        return ((C0700r) this.f7555F.mo1a()).m4510a(a);
    }

    public final C0656n mo1589a(String str, Integer num, Integer num2, Integer num3, Integer num4, Long l, String[] strArr, String[] strArr2, String str2, String str3, String str4, String[] strArr3, C0660x c0660x, C0657w c0657w) {
        Builder appendQueryParameter = C1286g.f7650U.buildUpon().appendQueryParameter("doc", str).appendQueryParameter("ot", Integer.toString(1));
        if (num != null) {
            appendQueryParameter.appendQueryParameter("vc", num.toString());
        }
        if (num2 != null) {
            appendQueryParameter.appendQueryParameter("bvc", num2.toString());
            if (strArr != null) {
                for (String appendQueryParameter2 : strArr) {
                    appendQueryParameter.appendQueryParameter("pf", appendQueryParameter2);
                }
            }
        }
        if (num3 != null) {
            appendQueryParameter.appendQueryParameter("da", num3.toString());
        }
        if (num4 != null) {
            appendQueryParameter.appendQueryParameter("bda", num4.toString());
        }
        if (l != null) {
            appendQueryParameter.appendQueryParameter("bf", l.toString());
        }
        if (strArr2 != null) {
            for (String appendQueryParameter22 : strArr2) {
                appendQueryParameter.appendQueryParameter("fdcf", appendQueryParameter22);
            }
        }
        if (!TextUtils.isEmpty(str2)) {
            appendQueryParameter.appendQueryParameter("shh", str2);
        }
        if (!TextUtils.isEmpty(str3)) {
            appendQueryParameter.appendQueryParameter("ch", str3);
        }
        if (!TextUtils.isEmpty(str4)) {
            appendQueryParameter.appendQueryParameter("dtok", str4);
        }
        if (m7535z() && strArr3 != null) {
            for (String appendQueryParameter222 : strArr3) {
                appendQueryParameter.appendQueryParameter("mn", appendQueryParameter222);
            }
        }
        C0656n a = this.f7551B.m7371a(appendQueryParameter.build().toString(), this.f7560K, m7519j(), c0660x, c0657w, this);
        a.f4038m = m7533x();
        a.f4034i = false;
        a.f7463C = true;
        a.f7466F = true;
        String str5 = "X-DFE-Setup-Flow-Type";
        String y = m7534y();
        if (a.f7493z == null) {
            a.f7493z = new HashMap();
        }
        a.f7493z.put(str5, y);
        if (!TextUtils.isEmpty(null)) {
            if (a.f7461A == null) {
                a.f7461A = new StringBuilder();
            }
            a.f7461A.append("/").append(str5).append("=").append(null);
        }
        return ((C0700r) this.f7555F.mo1a()).m4510a(a);
    }

    private final cx m7533x() {
        return new cx(f7545u, f7546v, f7547w, this.f7560K);
    }

    private final String m7534y() {
        if (this.f7559J == null || !this.f7559J.m14775a()) {
            return "setup_wizard";
        }
        return "deferred";
    }

    public final C0656n mo1656i(String str, C0660x c0660x, C0657w c0657w) {
        cz bbVar;
        boolean h = this.f7560K.m7296h();
        Builder appendQueryParameter = C1286g.f7651V.buildUpon().appendQueryParameter("doc", str);
        if (!h) {
            appendQueryParameter.appendQueryParameter("build_fingerprint", Build.FINGERPRINT);
        }
        cr crVar = this.f7551B;
        String uri = appendQueryParameter.build().toString();
        C1251b c1251b = this.f7560K;
        if (this.f7562M) {
            bbVar = new bb();
        } else {
            bbVar = new cy(eg.class);
        }
        C0656n a = crVar.m7371a(uri, c1251b, bbVar, c0660x, c0657w, this);
        a.f4038m = new cx(((Integer) C1285f.f7598P.m28964b()).intValue(), ((Integer) C1285f.f7599Q.m28964b()).intValue(), ((Float) C1285f.f7600R.m28964b()).floatValue(), this.f7560K);
        a.f7463C = true;
        a.f7464D = true;
        a.f7465E = true;
        return ((C0700r) this.f7555F.mo1a()).m4510a(a);
    }

    public final C0656n mo1557a(C0660x c0660x, C0657w c0657w, boolean z, boolean z2) {
        Builder buildUpon = C1286g.f7653X.buildUpon();
        if (z) {
            buildUpon.appendQueryParameter("at", Boolean.TRUE.toString());
        }
        if (z2) {
            buildUpon.appendQueryParameter("fcfo", "1");
        }
        return ((C0700r) this.f7555F.mo1a()).m4510a(this.f7551B.m7371a(buildUpon.build().toString(), this.f7560K, m7518i(), c0660x, c0657w, this));
    }

    public final C0656n mo1601a(String str, com.google.wireless.android.finsky.b.g[] gVarArr, int[] iArr, boolean z, C0660x c0660x, C0657w c0657w) {
        Builder buildUpon = C1286g.f7653X.buildUpon();
        if (str != null) {
            buildUpon.appendQueryParameter("ogi", str);
        }
        C0757i bjVar = new bj();
        if (z) {
            bjVar.a |= 1;
            bjVar.b = true;
        } else {
            bjVar.c = gVarArr;
            bjVar.d = iArr;
        }
        return ((C0700r) this.f7555F.mo1a()).m4510a(this.f7551B.m7374a(buildUpon.build().toString(), bjVar, this.f7560K, m7518i(), c0660x, c0657w, (C1255p) this));
    }

    public final C0656n mo1558a(lg lgVar, int i, C0660x c0660x, C0657w c0657w) {
        cz amVar;
        Builder buildUpon = C1286g.ab.buildUpon();
        if (i != 7) {
            buildUpon.appendQueryParameter("ddt", String.valueOf(i));
        }
        cr crVar = this.f7551B;
        String uri = buildUpon.build().toString();
        C1251b c1251b = this.f7560K;
        if (this.f7562M) {
            amVar = new am();
        } else {
            amVar = new cy(cq.class);
        }
        C0656n a = crVar.m7371a(uri, c1251b, amVar, c0660x, c0657w, this);
        a.f7464D = true;
        a.f7463C = true;
        a.f7462B = lgVar;
        return ((C0700r) this.f7555F.mo1a()).m4510a(a);
    }

    public final C0656n mo1658k(String str, C0660x c0660x, C0657w c0657w) {
        cz aeVar;
        Builder buildUpon = C1286g.ag.buildUpon();
        buildUpon.appendQueryParameter("ogi", str);
        cr crVar = this.f7551B;
        String uri = buildUpon.build().toString();
        C1251b c1251b = this.f7560K;
        if (this.f7562M) {
            aeVar = new ae();
        } else {
            aeVar = new cy(w.class);
        }
        return ((C0700r) this.f7555F.mo1a()).m4510a(crVar.m7371a(uri, c1251b, aeVar, c0660x, c0657w, this));
    }

    public final C0656n mo1624b(String str, String str2, int i, C0660x c0660x, C0657w c0657w) {
        p pVar = new p();
        pVar.a |= 4;
        pVar.d = i;
        if (str2 == null) {
            throw new NullPointerException();
        }
        pVar.a |= 1;
        pVar.b = str2;
        if (str == null) {
            throw new NullPointerException();
        }
        cz brVar;
        pVar.a |= 2;
        pVar.c = str;
        C0757i afVar = new af();
        afVar.a = pVar;
        cr crVar = this.f7551B;
        String uri = C1286g.af.toString();
        C1251b c1251b = this.f7560K;
        if (this.f7562M) {
            brVar = new br();
        } else {
            brVar = new cy(ag.class);
        }
        return ((C0700r) this.f7555F.mo1a()).m4510a(crVar.m7374a(uri, afVar, c1251b, brVar, c0660x, c0657w, (C1255p) this));
    }

    public final C0656n mo1648f(C0660x c0660x, C0657w c0657w) {
        cz agVar;
        cr crVar = this.f7551B;
        String uri = C1286g.ae.toString();
        C1251b c1251b = this.f7560K;
        if (this.f7562M) {
            agVar = new ag();
        } else {
            agVar = new cy(am.class);
        }
        return ((C0700r) this.f7555F.mo1a()).m4510a(crVar.m7371a(uri, c1251b, agVar, c0660x, c0657w, this));
    }

    public final C0656n mo1608a(com.google.wireless.android.finsky.dfe.h.a.ak[] akVarArr, C0660x c0660x, C0657w c0657w) {
        cz bxVar;
        C0757i anVar = new com.google.wireless.android.finsky.dfe.h.a.an();
        anVar.a = akVarArr;
        cr crVar = this.f7551B;
        String uri = C1286g.ad.toString();
        C1251b c1251b = this.f7560K;
        if (this.f7562M) {
            bxVar = new bx();
        } else {
            bxVar = new cy(com.google.wireless.android.finsky.dfe.h.a.ao.class);
        }
        return ((C0700r) this.f7555F.mo1a()).m4510a(crVar.m7374a(uri, anVar, c1251b, bxVar, c0660x, c0657w, (C1255p) this));
    }

    public final C0656n mo1553a(int i, boolean z, C0660x c0660x, C0657w c0657w) {
        cz c1258f;
        cr crVar = this.f7551B;
        String uri = C1286g.ah.toString();
        C1251b c1251b = this.f7560K;
        if (this.f7562M) {
            c1258f = new C1258f();
        } else {
            c1258f = new cy(aj.class);
        }
        C0656n c = crVar.m7376c(uri, c1251b, c1258f, c0660x, c0657w, this);
        if (i != 0) {
            c.m7368a("c", Integer.toString(i));
        }
        c.m7368a("sl", z ? "1" : "0");
        return ((C0700r) this.f7555F.mo1a()).m4510a(c);
    }

    public final C0656n mo1634c(String str, boolean z, C0660x c0660x, C0657w c0657w) {
        cz afVar;
        Builder buildUpon = C1286g.ai.buildUpon();
        buildUpon.appendQueryParameter("st", str);
        if (z) {
            buildUpon.appendQueryParameter("bsp", "1");
        }
        cr crVar = this.f7551B;
        String uri = buildUpon.build().toString();
        C1251b c1251b = this.f7560K;
        if (this.f7562M) {
            afVar = new af();
        } else {
            afVar = new cy(z.class);
        }
        return ((C0700r) this.f7555F.mo1a()).m4510a(crVar.m7371a(uri, c1251b, afVar, c0660x, c0657w, this));
    }

    public final C0656n mo1622b(String str, int i, String str2, C0660x c0660x, C0657w c0657w) {
        cz c1270r;
        cr crVar = this.f7551B;
        String uri = C1286g.aj.toString();
        C1251b c1251b = this.f7560K;
        if (this.f7562M) {
            c1270r = new C1270r();
        } else {
            c1270r = new cy(com.google.wireless.android.finsky.dfe.h.a.e.class);
        }
        C0656n c = crVar.m7376c(uri, c1251b, c1270r, c0660x, c0657w, this);
        if (!TextUtils.isEmpty(str2)) {
            c.m7368a("consistency_token", str2);
        }
        c.m7368a("doc", str);
        c.m7368a("ot", String.valueOf(i));
        return ((C0700r) this.f7555F.mo1a()).m4510a(c);
    }

    public final C0656n mo1633c(String str, String str2, C0660x c0660x, C0657w c0657w) {
        cz aqVar;
        Builder buildUpon = C1286g.ak.buildUpon();
        if (!TextUtils.isEmpty(str2)) {
            buildUpon.appendQueryParameter("consistency_token", str2);
        }
        buildUpon.appendQueryParameter("ref", str);
        cr crVar = this.f7551B;
        String uri = buildUpon.build().toString();
        C1251b c1251b = this.f7560K;
        if (this.f7562M) {
            aqVar = new aq();
        } else {
            aqVar = new cy(ab.class);
        }
        return ((C0700r) this.f7555F.mo1a()).m4510a(crVar.m7371a(uri, c1251b, aqVar, c0660x, c0657w, this));
    }

    public final C0656n mo1568a(com.google.wireless.android.finsky.dfe.h.a.aq aqVar, C0660x c0660x, C0657w c0657w) {
        cz byVar;
        cr crVar = this.f7551B;
        String uri = C1286g.al.toString();
        C1251b c1251b = this.f7560K;
        if (this.f7562M) {
            byVar = new by();
        } else {
            byVar = new cy(ar.class);
        }
        C0656n c = crVar.m7376c(uri, c1251b, byVar, c0660x, c0657w, this);
        c.m7368a("urer", Base64.encodeToString(C0757i.m4909a((C0757i) aqVar), 10));
        return ((C0700r) this.f7555F.mo1a()).m4510a(c);
    }

    public final C0656n mo1555a(long j, String str, C0660x c0660x, C0657w c0657w) {
        cz aiVar;
        Builder buildUpon = C1286g.am.buildUpon();
        if (!TextUtils.isEmpty(str)) {
            buildUpon.appendQueryParameter("consistency_token", str);
        }
        buildUpon.appendQueryParameter("t", Long.toString(j));
        cr crVar = this.f7551B;
        String uri = buildUpon.build().toString();
        C1251b c1251b = this.f7560K;
        if (this.f7562M) {
            aiVar = new ai();
        } else {
            aiVar = new cy(aa.class);
        }
        return ((C0700r) this.f7555F.mo1a()).m4510a(crVar.m7371a(uri, c1251b, aiVar, c0660x, c0657w, this));
    }

    public final C0656n mo1587a(String str, l lVar, C0660x c0660x, C0657w c0657w) {
        cz aaVar;
        cr crVar = this.f7551B;
        C1251b c1251b = this.f7560K;
        if (this.f7562M) {
            aaVar = new aa();
        } else {
            aaVar = new cy(n.class);
        }
        return ((C0700r) this.f7555F.mo1a()).m4510a(crVar.m7374a(str, (C0757i) lVar, c1251b, aaVar, c0660x, c0657w, (C1255p) this));
    }

    public final C0656n mo1659l(String str, C0660x c0660x, C0657w c0657w) {
        cz ahVar;
        cr crVar = this.f7551B;
        C1251b c1251b = this.f7560K;
        if (this.f7562M) {
            ahVar = new ah();
        } else {
            ahVar = new cy(com.google.wireless.android.finsky.dfe.k.a.a.class);
        }
        return ((C0700r) this.f7555F.mo1a()).m4510a(crVar.m7371a(str, c1251b, ahVar, c0660x, c0657w, this));
    }

    public final C0656n mo1577a(gq gqVar, lg lgVar, C0660x c0660x, C0657w c0657w) {
        cz ccVar;
        C0660x clVar = new cl(this, c0660x);
        cr crVar = this.f7551B;
        String uri = C1286g.aa.toString();
        C1251b c1251b = this.f7560K;
        if (this.f7562M) {
            ccVar = new cc();
        } else {
            ccVar = new cy(gr.class);
        }
        C0656n a = crVar.m7374a(uri, (C0757i) gqVar, c1251b, ccVar, clVar, c0657w, (C1255p) this);
        a.f7462B = lgVar;
        return ((C0700r) this.f7555F.mo1a()).m4510a(a);
    }

    public final C1253j mo1653g(C0660x c0660x, C0657w c0657w) {
        cz ayVar;
        cr crVar = this.f7551B;
        String uri = C1286g.an.toString();
        C1251b c1251b = this.f7560K;
        if (this.f7562M) {
            ayVar = new ay();
        } else {
            ayVar = new cy(ds.class);
        }
        return (C1253j) ((C0700r) this.f7555F.mo1a()).m4510a(crVar.m7371a(uri, c1251b, ayVar, c0660x, c0657w, this));
    }

    public final C1253j mo1609a(jn jnVar, C0660x c0660x, C0657w c0657w) {
        cz bpVar;
        cr crVar = this.f7551B;
        String uri = C1286g.ao.toString();
        C1251b c1251b = this.f7560K;
        if (this.f7562M) {
            bpVar = new bp();
        } else {
            bpVar = new cy(jo.class);
        }
        return m7514c(crVar.m7374a(uri, (C0757i) jnVar, c1251b, bpVar, c0660x, c0657w, (C1255p) this));
    }

    public final C1253j mo1612a(String str, int i, long j, C0660x c0660x, C0657w c0657w) {
        cz c1262j;
        Builder buildUpon = C1286g.aq.buildUpon();
        buildUpon.appendQueryParameter("pkgn", str);
        buildUpon.appendQueryParameter("vc", String.valueOf(i));
        buildUpon.appendQueryParameter("nnc", String.valueOf(j));
        cr crVar = this.f7551B;
        String uri = buildUpon.build().toString();
        C1251b c1251b = this.f7560K;
        if (this.f7562M) {
            c1262j = new C1262j();
        } else {
            c1262j = new cy(com.google.wireless.android.finsky.dfe.a.a.h.class);
        }
        return (C1253j) ((C0700r) this.f7555F.mo1a()).m4510a(crVar.m7371a(uri, c1251b, c1262j, c0660x, c0657w, this));
    }

    public final C1253j mo1610a(com.google.wireless.android.finsky.dfe.a.a.i iVar, int i, C0660x c0660x, C0657w c0657w) {
        cz c1269q;
        cr crVar = this.f7551B;
        String uri = C1286g.ar.toString();
        C1251b c1251b = this.f7560K;
        if (this.f7562M) {
            c1269q = new C1269q();
        } else {
            c1269q = new cy(j.class);
        }
        C0656n a = crVar.m7374a(uri, (C0757i) iVar, c1251b, c1269q, c0660x, c0657w, (C1255p) this);
        String str = "X-Account-Ordinal";
        String valueOf = String.valueOf(i);
        if (a.f7493z == null) {
            a.f7493z = new HashMap();
        }
        a.f7493z.put(str, valueOf);
        if (!TextUtils.isEmpty(null)) {
            if (a.f7461A == null) {
                a.f7461A = new StringBuilder();
            }
            a.f7461A.append("/").append(str).append("=").append(null);
        }
        a.m7367s();
        a.f7466F = true;
        if (this.f7554E.dj().mo2294a(12623396)) {
            this.f7558I.m12119a(this.f7556G, null);
            a.m7361c("");
        }
        return (C1253j) ((C0700r) this.f7555F.mo1a()).m4510a(a);
    }

    private static void m7509a(co coVar, al alVar) {
        coVar.m7368a("pcap", String.valueOf(alVar.b));
        if (((alVar.a & 2) != 0 ? 1 : null) != null) {
            coVar.m7368a("pclats", String.valueOf(alVar.c));
        }
    }

    public final C0656n mo1641d(String str, boolean z, C0660x c0660x, C0657w c0657w) {
        C0757i pVar = new com.google.wireless.android.finsky.dfe.a.a.p();
        if (str == null) {
            throw new NullPointerException();
        }
        cz buVar;
        pVar.a |= 1;
        pVar.b = str;
        pVar.a |= 2;
        pVar.c = z;
        cr crVar = this.f7551B;
        String uri = C1286g.as.toString();
        C1251b c1251b = this.f7560K;
        if (this.f7562M) {
            buVar = new bu();
        } else {
            buVar = new cy(q.class);
        }
        cp a = crVar.m7374a(uri, pVar, c1251b, buVar, c0660x, c0657w, (C1255p) this);
        a.f4038m = new cx(f7524A, this.f7560K);
        return m7514c(a);
    }

    public final C0659a mo1551a() {
        return this.f7560K.f7430i;
    }

    public final void mo1618a(String str) {
        this.f7560K.m7288b(str);
    }

    public final C1253j mo1660m(String str, C0660x c0660x, C0657w c0657w) {
        C0656n b = this.f7551B.m7375b(str, this.f7560K, m7527r(), c0660x, c0657w, this);
        ((C0700r) this.f7555F.mo1a()).m4510a(b);
        return b;
    }

    public final void mo1651f(String str) {
        ((C0700r) this.f7555F.mo1a()).m4510a(new cn(((C0700r) this.f7555F.mo1a()).f4184e, this.f7551B.m7375b(str, this.f7560K, m7527r(), null, null, this).mo1546e()));
    }

    public final C0656n mo1661n(String str, C0660x c0660x, C0657w c0657w) {
        cz avVar;
        cr crVar = this.f7551B;
        C1251b c1251b = this.f7560K;
        if (this.f7562M) {
            avVar = new av();
        } else {
            avVar = new cy(dm.class);
        }
        return ((C0700r) this.f7555F.mo1a()).m4510a(crVar.m7371a(str, c1251b, avVar, c0660x, c0657w, this));
    }

    public final C0656n mo1662o(String str, C0660x c0660x, C0657w c0657w) {
        cz aoVar;
        cr crVar = this.f7551B;
        C1251b c1251b = this.f7560K;
        if (this.f7562M) {
            aoVar = new ao();
        } else {
            aoVar = new cy(cs.class);
        }
        return ((C0700r) this.f7555F.mo1a()).m4510a(crVar.m7371a(str, c1251b, aoVar, c0660x, c0657w, this));
    }

    public final C0656n mo1663p(String str, C0660x c0660x, C0657w c0657w) {
        return ((C0700r) this.f7555F.mo1a()).m4510a(this.f7551B.m7371a(str, this.f7560K, m7524o(), c0660x, c0657w, this));
    }

    public final C0656n mo1586a(String str, com.google.wireless.android.finsky.dfe.a.a.l lVar, C0660x c0660x, C0657w c0657w) {
        C0656n a = this.f7551B.m7374a(str, (C0757i) lVar, this.f7560K, m7524o(), c0660x, c0657w, (C1255p) this);
        a.f4034i = false;
        return ((C0700r) this.f7555F.mo1a()).m4510a(a);
    }

    public final C0656n mo1640d(String str, String str2, C0660x c0660x, C0657w c0657w) {
        cz biVar;
        Builder appendQueryParameter = C1286g.av.buildUpon().appendQueryParameter("doc", str).appendQueryParameter("wamToken", str2);
        cr crVar = this.f7551B;
        String builder = appendQueryParameter.toString();
        C1251b c1251b = this.f7560K;
        if (this.f7562M) {
            biVar = new bi();
        } else {
            biVar = new cy(fi.class);
        }
        return ((C0700r) this.f7555F.mo1a()).m4510a(crVar.m7371a(builder, c1251b, biVar, c0660x, c0657w, this));
    }

    public final C0656n mo1570a(com.google.wireless.android.finsky.dfe.j.a.a aVar, C0660x c0660x, C0657w c0657w) {
        cz alVar;
        cr crVar = this.f7551B;
        String uri = C1286g.aw.toString();
        C1251b c1251b = this.f7560K;
        if (this.f7562M) {
            alVar = new al();
        } else {
            alVar = new cy(com.google.wireless.android.finsky.dfe.j.a.b.class);
        }
        C0656n a = crVar.m7374a(uri, (C0757i) aVar, c1251b, alVar, c0660x, c0657w, (C1255p) this);
        a.f4034i = false;
        return ((C0700r) this.f7555F.mo1a()).m4510a(a);
    }

    public final String toString() {
        String a = FinskyLog.m21655a(this.f7560K.m7287b());
        return new StringBuilder(String.valueOf(a).length() + 15).append("DfeApiImpl { ").append(a).append(" }").toString();
    }

    public final void mo1617a(C1255p c1255p) {
        if (!this.f7561L.contains(c1255p)) {
            this.f7561L.add(c1255p);
        }
    }

    public final void mo1619a(String str, fl flVar) {
        for (int size = this.f7561L.size() - 1; size >= 0; size--) {
            ((C1255p) this.f7561L.get(size)).mo1619a(str, flVar);
        }
    }

    public final C0656n mo1654h(C0660x c0660x, C0657w c0657w) {
        cz c1266n;
        cr crVar = this.f7551B;
        String uri = C1286g.ax.toString();
        C1251b c1251b = this.f7560K;
        if (this.f7562M) {
            c1266n = new C1266n();
        } else {
            c1266n = new cy(ba.class);
        }
        C0656n a = crVar.m7371a(uri, c1251b, c1266n, c0660x, c0657w, this);
        a.f4034i = false;
        return ((C0700r) this.f7555F.mo1a()).m4510a(a);
    }

    public final C0656n mo1571a(cl clVar, C0660x c0660x, C0657w c0657w) {
        cz bwVar;
        String builder = C1286g.ay.buildUpon().appendQueryParameter("ce", clVar.b).toString();
        cr crVar = this.f7551B;
        C1251b c1251b = this.f7560K;
        if (this.f7562M) {
            bwVar = new bw();
        } else {
            bwVar = new cy(com.google.wireless.android.finsky.dfe.nano.bc.class);
        }
        return ((C0700r) this.f7555F.mo1a()).m4510a(crVar.m7376c(builder, c1251b, bwVar, c0660x, c0657w, this));
    }

    public final C0656n mo1664q(String str, C0660x c0660x, C0657w c0657w) {
        C0757i fVar = new com.google.wireless.android.finsky.dfe.a.a.f();
        fVar.a(str);
        fVar.a(false);
        cp a = this.f7551B.m7374a(C1286g.aA.toString(), fVar, this.f7560K, m7529t(), c0660x, c0657w, (C1255p) this);
        a.f4034i = false;
        return m7514c(a);
    }

    public final C0656n mo1665r(String str, C0660x c0660x, C0657w c0657w) {
        C0757i fVar = new com.google.wireless.android.finsky.dfe.a.a.f();
        fVar.a(str);
        fVar.a(true);
        cp a = this.f7551B.m7374a(C1286g.aA.toString(), fVar, this.f7560K, m7529t(), c0660x, c0657w, (C1255p) this);
        a.f4034i = false;
        return m7514c(a);
    }

    public final C0656n mo1562a(com.google.wireless.android.finsky.dfe.b.b.a.b bVar, C0660x c0660x, C0657w c0657w) {
        cz cgVar;
        cr crVar = this.f7551B;
        String uri = C1286g.aB.toString();
        C1251b c1251b = this.f7560K;
        if (this.f7562M) {
            cgVar = new cg();
        } else {
            cgVar = new cy(com.google.wireless.android.finsky.dfe.b.b.a.c.class);
        }
        C0656n a = crVar.m7374a(uri, (C0757i) bVar, c1251b, cgVar, c0660x, c0657w, (C1255p) this);
        a.f4034i = false;
        return ((C0700r) this.f7555F.mo1a()).m4510a(a);
    }

    public final String mo1646e() {
        return this.f7560K.f7432k;
    }

    public final String mo1650f() {
        return this.f7560K.f7433l;
    }

    public final C0656n mo1629b(List list, C0660x c0660x, C0657w c0657w) {
        C0757i lbVar = new lb();
        lbVar.f13003a = (gk[]) list.toArray(new gk[list.size()]);
        C0656n a = this.f7551B.m7374a(C1286g.aC.toString(), lbVar, this.f7560K, new cy(lc.class), c0660x, c0657w, (C1255p) this);
        a.f4034i = false;
        return ((C0700r) this.f7555F.mo1a()).m4510a(a);
    }

    private final boolean m7535z() {
        return this.f7554E.dj().mo2294a(12642050);
    }

    public final /* synthetic */ C0656n mo1574a(dd ddVar, C0660x c0660x, C0657w c0657w) {
        cz atVar;
        cr crVar = this.f7551B;
        String uri = C1286g.ap.toString();
        C1251b c1251b = this.f7560K;
        if (this.f7562M) {
            atVar = new at();
        } else {
            atVar = new cy(de.class);
        }
        C0656n a = crVar.m7374a(uri, (C0757i) ddVar, c1251b, atVar, c0660x, c0657w, (C1255p) this);
        a.f4038m = new cx(f7548x, f7549y, f7550z, this.f7560K);
        return (C1253j) ((C0700r) this.f7555F.mo1a()).m4510a(a);
    }

    public final /* synthetic */ C1253j mo1614a(String str, String str2, Collection collection) {
        return m7512b(str, false, false, str2, collection, null, null);
    }
}
