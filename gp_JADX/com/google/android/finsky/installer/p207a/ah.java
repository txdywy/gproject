package com.google.android.finsky.installer.p207a;

import android.content.Context;
import android.content.Intent;
import android.content.Intent.ShortcutIconResource;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build.VERSION;
import android.os.Environment;
import android.os.Parcelable;
import android.support.v4.os.C0327a;
import android.support.v4.p037h.C0308c;
import android.support.v7.widget.eq;
import android.text.TextUtils;
import android.util.Base64;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.accounts.C0986a;
import com.google.android.finsky.api.C1287h;
import com.google.android.finsky.as.C1503a;
import com.google.android.finsky.au.C1518d;
import com.google.android.finsky.au.C1520b;
import com.google.android.finsky.au.C1521c;
import com.google.android.finsky.au.C1523f;
import com.google.android.finsky.au.C1524g;
import com.google.android.finsky.au.C1525h;
import com.google.android.finsky.au.C1526i;
import com.google.android.finsky.aw.C1531a;
import com.google.android.finsky.aw.C1532b;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.bn.C2127b;
import com.google.android.finsky.bn.C2129c;
import com.google.android.finsky.bn.C2131e;
import com.google.android.finsky.bo.C2153a;
import com.google.android.finsky.by.C2206c;
import com.google.android.finsky.ce.C2266a;
import com.google.android.finsky.cj.C2285b;
import com.google.android.finsky.cj.C2286c;
import com.google.android.finsky.cm.C2296c;
import com.google.android.finsky.cn.C2320a;
import com.google.android.finsky.cn.C2322b;
import com.google.android.finsky.cv.p177a.es;
import com.google.android.finsky.db.C2537a;
import com.google.android.finsky.dk.C2830g;
import com.google.android.finsky.download.C2839b;
import com.google.android.finsky.download.C2841d;
import com.google.android.finsky.download.C2850m;
import com.google.android.finsky.dt.C2888b;
import com.google.android.finsky.dw.C2909c;
import com.google.android.finsky.installer.C3281b;
import com.google.android.finsky.installer.C3283a;
import com.google.android.finsky.installer.C3322j;
import com.google.android.finsky.installqueue.C3371p;
import com.google.android.finsky.instantappscompatibility.C3600b;
import com.google.android.finsky.notification.ab;
import com.google.android.finsky.p107l.C3646a;
import com.google.android.finsky.p107l.C3647b;
import com.google.android.finsky.p107l.C3654j;
import com.google.android.finsky.p111d.C1463g;
import com.google.android.finsky.p111d.C2471a;
import com.google.android.finsky.p111d.C2474c;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.p178a.C2470a;
import com.google.android.finsky.p189e.C2947b;
import com.google.android.finsky.p189e.C2948c;
import com.google.android.finsky.p189e.C2950e;
import com.google.android.finsky.p189e.C2951f;
import com.google.android.finsky.p189e.C2952g;
import com.google.android.finsky.p189e.C2953h;
import com.google.android.finsky.p189e.C2956k;
import com.google.android.finsky.p198f.C3027b;
import com.google.android.finsky.packagemanager.C3849a;
import com.google.android.finsky.providers.C1467c;
import com.google.android.finsky.utils.C4671b;
import com.google.android.finsky.utils.C4688t;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.an;
import com.google.android.finsky.utils.bb;
import com.google.android.finsky.volley.C4774e;
import com.google.wireless.android.a.a.a.a.au;
import com.google.wireless.android.a.a.a.a.t;
import com.google.wireless.android.finsky.b.a;
import com.google.wireless.android.finsky.b.ae;
import com.google.wireless.android.finsky.b.d;
import com.google.wireless.android.finsky.b.e;
import com.google.wireless.android.finsky.b.f;
import com.google.wireless.android.finsky.b.l;
import com.squareup.haha.perflib.HprofParser;
import com.squareup.haha.perflib.io.MemoryMappedFileBuffer;
import com.squareup.leakcanary.C7582R;
import java.io.File;
import java.net.HttpCookie;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;

final class ah {
    public static final String[] f16867a = new String[]{"1", "2", "3"};
    public static final C3371p ai = new C3371p(0, 0, 0, 0);
    public static final C3371p aj = new C3371p(3, 0, 0, 0);
    public static final String[] f16868b = new String[]{"1", "2", "3", "4", "5"};
    public static final String[] f16869c = new String[]{"1", "2"};
    public final C2948c f16870A;
    public final C2950e f16871B;
    public final C2952g f16872C;
    public final C3299r f16873D;
    public final C2153a f16874E;
    public final C1463g f16875F;
    public final C2888b f16876G;
    public final C2830g f16877H;
    public final String f16878I;
    public final az f16879J;
    public long f16880K;
    public long f16881L;
    public long f16882M;
    public long f16883N;
    public long f16884O;
    public int f16885P;
    public boolean f16886Q;
    public boolean f16887R;
    public boolean f16888S;
    public boolean f16889T;
    public boolean f16890U;
    public boolean f16891V;
    public boolean f16892W;
    public t f16893X;
    public String f16894Y;
    public C2285b f16895Z;
    public Intent aa;
    public C3281b ab;
    public C3283a ac;
    public boolean ad;
    public List ae = new ArrayList();
    public List af = new ArrayList();
    public String ag = null;
    public C1518d ah = null;
    public final C3646a f16896d;
    public final C2206c f16897e;
    public final C2850m f16898f;
    public final ab f16899g;
    public final C2127b f16900h;
    public final C3322j f16901i;
    public final C2266a f16902j;
    public final C2296c f16903k;
    public final C2909c f16904l;
    public final C1467c f16905m;
    public final C2495w f16906n;
    public final C3600b f16907o;
    public final C2471a f16908p;
    public final C3849a f16909q;
    public final C1531a f16910r;
    public final C1461c f16911s;
    public final Context f16912t;
    public final C4774e f16913u;
    public final C3027b f16914v;
    public final C2320a f16915w;
    public final C0986a f16916x;
    public final C1287h f16917y;
    public final C2537a f16918z;

    public ah(String str, az azVar, Context context, C3646a c3646a, C2206c c2206c, C2850m c2850m, ab abVar, C3322j c3322j, C2266a c2266a, C2296c c2296c, C2909c c2909c, C1467c c1467c, C2471a c2471a, C3849a c3849a, C3600b c3600b, C1531a c1531a, C1461c c1461c, C4774e c4774e, C3027b c3027b, C2320a c2320a, C0986a c0986a, C1287h c1287h, C2537a c2537a, C2948c c2948c, C2950e c2950e, C2952g c2952g, C3299r c3299r, C2153a c2153a, C1463g c1463g, C2888b c2888b, C3281b c3281b, C2830g c2830g) {
        this.f16878I = str;
        this.f16879J = azVar;
        this.f16896d = c3646a;
        this.f16897e = c2206c;
        this.f16898f = c2850m;
        this.f16899g = abVar;
        this.f16900h = c3646a.f18022b;
        this.f16901i = c3322j;
        this.f16902j = c2266a;
        this.f16903k = c2296c;
        this.f16904l = c2909c;
        this.f16905m = c1467c;
        this.f16908p = c2471a;
        this.f16909q = c3849a;
        this.f16907o = c3600b;
        this.f16910r = c1531a;
        this.f16877H = c2830g;
        if (c1461c.dj().mo2294a(12619996)) {
            this.f16906n = this.f16908p.m13183a(this.f16900h.mo2657a(str).m11120d());
        } else {
            this.f16906n = this.f16908p.m13184a(null);
        }
        this.f16911s = c1461c;
        this.f16912t = context;
        this.f16913u = c4774e;
        this.f16914v = c3027b;
        this.f16915w = c2320a;
        this.f16916x = c0986a;
        this.f16917y = c1287h;
        this.f16918z = c2537a;
        this.f16870A = c2948c;
        this.f16871B = c2950e;
        this.f16872C = c2952g;
        this.f16873D = c3299r;
        this.f16874E = c2153a;
        this.f16875F = c1463g;
        this.f16876G = c2888b;
        this.f16892W = this.f16877H.m14978f();
        this.ab = c3281b;
    }

    final void m16430a(C3647b c3647b) {
        boolean z;
        boolean z2 = true;
        C2129c c2129c = c3647b.f18029d;
        this.f16891V = c3647b.f18028c != null;
        this.f16894Y = c2129c.f10818l;
        ah.m16416a("populateFields", this.f16878I, this.f16894Y, c2129c);
        int i = c2129c.f10819m;
        if ((i & 16) == 0) {
            z = true;
        } else {
            z = false;
        }
        this.f16887R = z;
        if ((i & 1) == 0) {
            z = true;
        } else {
            z = false;
        }
        this.f16888S = z;
        if ((i & 128) == 0) {
            z = true;
        } else {
            z = false;
        }
        this.f16889T = z;
        if ((16777216 & i) != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f16890U = z;
        this.f16893X = new t();
        this.f16893X.a(c2129c.f10809c);
        if (c3647b.f18028c != null) {
            this.f16893X.b(c3647b.f18028c.f11419d);
            this.f16893X.a(c3647b.f18028c.f11422g);
        }
        if ((i & eq.FLAG_APPEARED_IN_PRE_LAYOUT) != 0) {
            this.f16893X.f();
        }
        if ((i & 512) != 0) {
            m16432a(c2129c.f10811e.h);
        }
        if ((i & 4) != 0) {
            this.f16893X.c(true);
        }
        if (!((Boolean) C0955b.jx.m28964b()).booleanValue()) {
            t tVar = this.f16893X;
            ByteBuffer allocate = ByteBuffer.allocate(16);
            UUID randomUUID = UUID.randomUUID();
            allocate.putLong(randomUUID.getMostSignificantBits());
            allocate.putLong(randomUUID.getLeastSignificantBits());
            String encodeToString = Base64.encodeToString(allocate.array(), 11);
            if (encodeToString == null) {
                throw new NullPointerException();
            }
            tVar.a |= 1048576;
            tVar.w = encodeToString;
        }
        this.aa = c2129c.f10803J;
        if ((c2129c.f10819m & 67108864) == 0) {
            z2 = false;
        }
        this.ad = z2;
    }

    final void m16426a(C2129c c2129c) {
        this.af.clear();
        for (Object add : c2129c.m11117a()) {
            this.af.add(add);
        }
        this.f16882M = c2129c.f10831y;
        this.ag = c2129c.f10828v;
        if (!TextUtils.isEmpty(this.ag)) {
            m16437a(this.ag, c2129c.f10811e);
        }
        m16420m();
    }

    private final void m16420m() {
        if (m16451k()) {
            t tVar = this.f16893X;
            tVar.h = "";
            tVar.a &= -65;
        }
        if (this.f16878I.equals(this.ag) || this.ae.size() < 2) {
            this.f16893X.d(1);
        } else if ("..obb_main".equals(this.ag) || "..obb_patch".equals(this.ag)) {
            this.f16893X.d(2);
        } else if (m16451k() && this.ag != null && this.ag.startsWith("..split.")) {
            this.f16893X.d(3);
            tVar = this.f16893X;
            String substring = this.ag.substring(8);
            if (substring == null) {
                throw new NullPointerException();
            }
            tVar.a |= 64;
            tVar.h = substring;
        } else {
            tVar = this.f16893X;
            tVar.a &= -2049;
            tVar.m = 0;
        }
        this.f16893X.h();
        this.f16893X.g();
        this.f16893X.i();
        this.f16893X.e();
    }

    public static void m16416a(String str, String str2, String str3, C2129c c2129c) {
        if (TextUtils.isEmpty(str3)) {
            if (c2129c == null) {
                FinskyLog.m21667d("b/11413796 - installerData is null", new Object[0]);
            } else {
                FinskyLog.m21667d("b/11413796 - acct:  %s", FinskyLog.m21655a(c2129c.f10815i));
                FinskyLog.m21667d("b/11413796 - vers:  %d", Integer.valueOf(c2129c.f10809c));
                FinskyLog.m21667d("b/11413796 - uri:   %s", c2129c.f10814h);
                FinskyLog.m21667d("b/11413796 - flags: %d", Integer.valueOf(c2129c.f10819m));
                FinskyLog.m21667d("b/11413796 - state: %d", Integer.valueOf(c2129c.f10813g));
                FinskyLog.m21667d("b/11413796 - pkg:   %s", c2129c.f10807a);
                String str4 = "b/11413796 - data?  %b";
                Object[] objArr = new Object[1];
                objArr[0] = Boolean.valueOf(c2129c.f10811e != null);
                FinskyLog.m21667d(str4, objArr);
            }
            if (str3 == null) {
                FinskyLog.m21669e("b/11413796 - %s for %s (null title)", str, str2);
            } else {
                FinskyLog.m21669e("b/11413796 - %s for %s (empty title)", str, str2);
            }
        }
    }

    final void m16425a(int i, String str) {
        if (this.f16888S) {
            this.f16899g.mo3785a(this.f16894Y, this.f16878I, i, str, this.f16891V, this.f16906n.m13365a());
        }
    }

    public final void m16435a(boolean z) {
        C3647b a = this.f16896d.m17243a(this.f16878I);
        if (a == null || a.f18029d == null || a.f18029d.f10813g < 50) {
            m16431a(a, true);
            if (z) {
                m16423a(2, 0);
            }
            this.f16874E.m11221a(this.f16878I, new C2474c(156).m13236a(this.f16878I).m13231a(this.f16893X).f13342a);
            return;
        }
        FinskyLog.m21659a("Cannot cancel installing %s (adid: %s , isid: %s) - too late", this.f16878I, this.ag, m16445e());
    }

    final void m16421a() {
        m16431a(this.f16896d.m17243a(this.f16878I), false);
        this.f16874E.m11221a(this.f16878I, new C2474c(157).m13236a(this.f16878I).m13231a(this.f16893X).f13342a);
    }

    final void m16431a(C3647b c3647b, boolean z) {
        FinskyLog.m21659a("Cancel running installation of %s (%s)", this.f16878I, this.ag);
        C2839b a = this.f16898f.mo3171a(this.f16878I, null);
        if (a != null) {
            this.f16898f.mo3180c(a);
        }
        this.f16903k.mo2841a(this.f16878I);
        this.f16879J.mo3406a(c3647b, z);
        m16447g();
        if (!(this.f16895Z != null || c3647b == null || c3647b.f18029d == null)) {
            this.f16895Z = new C2285b(c3647b.f18029d);
        }
        if (this.f16895Z != null) {
            if (this.f16895Z.f11304c != null) {
                this.f16895Z.f11304c.m11775f();
                if (!this.f16891V) {
                    this.f16895Z.f11304c.m11776g();
                }
            }
            if (this.f16895Z.f11305d != null) {
                this.f16895Z.f11305d.m11775f();
                if (!this.f16891V) {
                    this.f16895Z.f11305d.m11776g();
                }
            }
        }
        this.f16879J.mo3405a(this);
    }

    public final C3371p m16438b() {
        int i = 0;
        C3647b a = this.f16896d.m17243a(this.f16878I);
        if (!(a == null || a.f18029d == null)) {
            switch (a.f18029d.f10813g) {
                case 0:
                case 70:
                case 80:
                    break;
                case 52:
                case 55:
                case 57:
                case 60:
                    i = 3;
                    break;
                default:
                    i = 2;
                    break;
            }
        }
        switch (i) {
            case 0:
                return ai;
            case 3:
                return aj;
            default:
                return new C3371p(2, m16448h(), this.f16884O, this.f16885P);
        }
    }

    final void m16443c() {
        while (true) {
            C3647b a = this.f16896d.m17243a(this.f16878I);
            if (a == null || a.f18029d == null) {
                FinskyLog.m21669e("Unexpected missing installer data for %s (adid: %s , isid: %s)", this.f16878I, this.ag, m16445e());
                m16435a(true);
            } else {
                C2129c c2129c = a.f18029d;
                Object obj;
                int i;
                int a2;
                int i2;
                int a3;
                switch (c2129c.f10813g) {
                    case 0:
                        if (m16450j()) {
                            obj = (c2129c.f10819m & eq.FLAG_MOVED) != 0 ? 1 : null;
                            if (!(obj == null || this.ac == null)) {
                                this.ac.mo3420g();
                                this.ac = null;
                            }
                            if (obj == null && this.ac == null) {
                                bb.m21792a(new aq(this), new Void[0]);
                                return;
                            }
                        }
                        i = c2129c.f10809c;
                        if (!this.f16911s.dj().mo2294a(12625103)) {
                            a2 = this.f16907o.m17193a(a.f18026a, this.f16904l.f15463a.mo3194c());
                            if (a2 != -1) {
                                this.f16900h.mo2675d(this.f16878I, c2129c.f10819m | 33554432);
                                i2 = c2129c.f10804K;
                                a3 = this.f16907o.m17192a(this.f16878I);
                                if (a2 > i || i2 < a3) {
                                    m16439b(37, null);
                                    continue;
                                }
                            }
                        }
                        C2322b c2322b = a.f18028c;
                        if (c2322b != null) {
                            a2 = c2322b.f11419d;
                        } else {
                            a2 = -1;
                        }
                        if (new C3654j(this.f16911s).m17261a(c2129c).m17262a(c2322b).m17269e()) {
                            if (a2 > i) {
                                this.f16896d.f18022b.mo2669b(this.f16878I, a2);
                            }
                            m16439b(70, null);
                            break;
                        }
                        a2 = m16417b(a);
                        if (a2 >= i) {
                            if (a2 > i) {
                                this.f16896d.f18022b.mo2669b(this.f16878I, a2);
                            }
                            this.f16900h.mo2675d(this.f16878I, c2129c.f10819m | 32);
                            m16439b(60, null);
                            break;
                        }
                        if (c2129c.f10811e == null) {
                            obj = null;
                        } else {
                            long j = c2129c.f10812f;
                            if (j == 0 || j + ((Long) C0955b.ba.m28964b()).longValue() >= System.currentTimeMillis()) {
                                obj = 1;
                            } else {
                                this.f16900h.mo2665a(this.f16878I, null, 0);
                                a2 = c2129c.f10819m;
                                i = a2 & -4613;
                                if (i != a2) {
                                    this.f16900h.mo2675d(this.f16878I, i);
                                }
                                obj = null;
                            }
                        }
                        if (obj == null) {
                            ah.m16416a("requestDeliveryData", this.f16878I, this.f16894Y, a.f18029d);
                            bb.m21792a(new ar(this, a), new Void[0]);
                            return;
                        }
                        break;
                    case 10:
                        break;
                    case 20:
                    case 30:
                    case 40:
                        break;
                    case 25:
                    case 35:
                    case 45:
                        return;
                    case 37:
                        if (!this.f16909q.mo3824a(a.f18026a, false, new ap(this, a))) {
                            m16439b(80, null);
                            m16423a(5, 981);
                            return;
                        }
                        return;
                    case 50:
                        String str;
                        C2956k aoVar;
                        C2129c c2129c2 = a.f18029d;
                        if ((c2129c2.f10819m & 4) == 0) {
                            obj = null;
                        } else if (this.ah.mo2274a()) {
                            Uri parse = Uri.parse(c2129c2.f10814h);
                            m16424a(55, parse);
                            FinskyLog.m21659a("Prepare to patch %s (adid: %s , isid: %s) from %s format %d", this.f16878I, this.ag, m16445e(), str, Integer.valueOf(this.ah.f8214l.f));
                            aoVar = new ao(this, parse);
                            boolean z = true;
                            if (m16450j()) {
                                z = this.ac == null;
                            }
                            C2952g c2952g = this.f16872C;
                            AsyncTask c2953h = new C2953h(c2952g, this.ah, this.f16893X, z, Uri.parse(c2129c2.f10814h), aoVar);
                            if (c2952g.f15591c.dj().mo2294a(12638120)) {
                                bb.m21794b(c2953h, new Void[0]);
                            } else {
                                bb.m21792a(c2953h, new Void[0]);
                            }
                            obj = 1;
                        } else {
                            FinskyLog.m21669e("Can't patch downloads (yet) for %s (adid: %s , isid: %s)", this.f16878I, this.ag, m16445e());
                            obj = null;
                        }
                        if (obj == null) {
                            C2129c c2129c3 = a.f18029d;
                            i2 = c2129c3.f10819m;
                            boolean z2 = (i2 & 512) != 0;
                            boolean z3 = (i2 & eq.FLAG_APPEARED_IN_PRE_LAYOUT) != 0;
                            if (z2 || this.ah.mo2279a(z3)) {
                                Uri parse2 = Uri.parse(c2129c3.f10814h);
                                FinskyLog.m21659a("Prepare to copy %s (adid: %s , isid: %s) from %s (expect %d bytes, isCompressed: %b)", this.f16878I, this.ag, m16445e(), parse2, Long.valueOf(this.ah.f8209g), Boolean.valueOf(z2));
                                m16424a(52, parse2);
                                C2956k anVar = new an(this, parse2, z2, z3);
                                if (z2) {
                                    this.f16870A.m15329a(this.ah, this.f16893X, parse2, true, anVar);
                                } else {
                                    this.f16870A.m15329a(this.ah, this.f16893X, parse2, false, anVar);
                                }
                                obj = 1;
                            } else {
                                obj = null;
                            }
                            if (obj != null) {
                                return;
                            }
                            if (this.ah.mo2285j()) {
                                str = a.f18029d.f10814h;
                                Uri parse3 = Uri.parse(str);
                                m16439b(57, str);
                                FinskyLog.m21659a("Prepare to verify %s (adid: %s , isid: %s) from %s", this.f16878I, this.ag, m16445e(), parse3);
                                aoVar = new am(this, parse3);
                                C2950e c2950e = this.f16871B;
                                C1518d c1518d = this.ah;
                                t tVar = this.f16893X;
                                String a4 = C2947b.m15326a(c1518d, c2950e.f15582c.dj());
                                tVar.b(a4);
                                bb.m21792a(new C2951f(c2950e, parse3, c1518d, tVar, a4, aoVar), new Void[0]);
                                return;
                            }
                            m16449i();
                            return;
                        }
                        return;
                    case 60:
                        c2129c = a.f18029d;
                        if ((c2129c.f10819m & 32) == 0) {
                            obj = null;
                        } else {
                            new al(this, a, ah.m16412a(c2129c.m11120d(), c2129c.f10832z != null ? c2129c.f10832z.f13153B : null)).execute(new Void[0]);
                            m16439b(60, null);
                            m16423a(4, 0);
                            obj = 1;
                        }
                        if (obj == null) {
                            String str2;
                            boolean z4;
                            C2129c c2129c4 = a.f18029d;
                            if (this.f16895Z != null) {
                                if (!(this.f16895Z.f11304c == null || this.f16895Z.f11304c.m11773d())) {
                                    FinskyLog.m21667d("Can't find main obb file for %s (isid: %s)", this.f16878I, m16445e());
                                    m16435a(false);
                                    m16433a(this.f16878I, 911);
                                }
                                if (!(this.f16895Z.f11305d == null || this.f16895Z.f11305d.m11773d())) {
                                    FinskyLog.m21667d("Can't find patch obb file for %s (isid: %s)", this.f16878I, m16445e());
                                    m16435a(false);
                                    m16433a(this.f16878I, 912);
                                }
                            }
                            if (m16450j() && this.ac != null && this.ac.mo3416c() == c2129c4.f10809c) {
                                str2 = this.ac.mo3414a().toString();
                            } else {
                                str2 = c2129c4.f10814h;
                            }
                            this.f16891V = a.f18028c != null;
                            if (VERSION.SDK_INT < ((Integer) C0955b.bg.m28964b()).intValue() || VERSION.SDK_INT > ((Integer) C0955b.bh.m28964b()).intValue() || !m16418b(this.f16878I)) {
                                z4 = false;
                            } else {
                                z4 = true;
                            }
                            this.f16874E.m11221a(this.f16878I, new C2474c(106).m13236a(this.f16878I).m13231a(this.f16893X).f13342a);
                            t tVar2 = this.f16893X;
                            tVar2.s = 0;
                            tVar2.a &= -65537;
                            tVar2 = this.f16893X;
                            tVar2.t = 0;
                            tVar2.a &= -131073;
                            m16422a(0);
                            FinskyLog.m21659a("Begin install of %s (isid: %s)", this.f16878I, m16445e());
                            if (this.f16887R) {
                                this.f16899g.mo3796a(this.f16894Y, this.f16878I, this.f16891V, "rapid_auto_update".equals(c2129c4.f10801H), this.aa, this.f16906n.m13365a());
                            }
                            a2 = -1;
                            if (!this.f16911s.dj().mo2294a(12633855)) {
                                a2 = this.f16907o.m17193a(this.f16878I, this.f16904l.f15463a.mo3194c());
                            }
                            this.f16903k.mo2850a(this.f16878I, z4, new ak(this, a2, str2));
                            m16439b(60, str2);
                            m16423a(4, 0);
                            return;
                        }
                        return;
                    case 70:
                        this.f16899g.mo3800b();
                        if (this.ac != null) {
                            this.ac.mo3420g();
                        }
                        a2 = -1;
                        if (a.f18028c != null) {
                            a2 = a.f18028c.f11419d;
                        }
                        if (a2 != a.f18029d.f10809c) {
                            m16431a(a, true);
                            m16423a(5, 910);
                            return;
                        }
                        if (this.f16895Z != null) {
                            if (this.f16895Z.f11304c != null && !this.f16895Z.f11304c.m11774e()) {
                                FinskyLog.m21667d("Lost main obb file for %s", this.f16878I);
                                m16431a(a, true);
                                m16433a(this.f16878I, 911);
                                return;
                            } else if (this.f16895Z.f11305d == null || this.f16895Z.f11305d.m11774e()) {
                                C2285b c2285b = this.f16895Z;
                                File file = null;
                                if (c2285b.f11304c != null && c2285b.f11304c.f11300e == 3) {
                                    file = c2285b.f11304c.m11771b();
                                }
                                File file2 = null;
                                if (c2285b.f11305d != null && c2285b.f11305d.f11300e == 3) {
                                    file2 = c2285b.f11305d.m11771b();
                                }
                                File[] listFiles = C2286c.m11779a(c2285b.f11302a.f10807a).listFiles();
                                if (listFiles != null) {
                                    for (File file3 : listFiles) {
                                        if ((file == null || !file.equals(file3)) && (r1 == null || !r1.equals(file3))) {
                                            FinskyLog.m21659a("OBB cleanup %s", file3);
                                            file3.delete();
                                        }
                                    }
                                }
                            } else {
                                FinskyLog.m21667d("Lost patch obb file for %s", this.f16878I);
                                m16431a(a, true);
                                m16423a(5, 912);
                                m16425a(912, null);
                                return;
                            }
                        }
                        m16447g();
                        m16439b(80, null);
                        m16423a(6, 0);
                        C2131e a5 = new C2131e(this.f16878I).m11160a(0);
                        if (this.f16891V) {
                            a5.f10834a.put("last_update_timestamp_ms", Long.valueOf(System.currentTimeMillis()));
                        }
                        this.f16900h.mo2660a(a5);
                        C2129c c2129c5 = a.f18029d;
                        ah.m16416a("cleanup", this.f16878I, c2129c5.f10818l, c2129c5);
                        if (this.f16889T) {
                            this.f16899g.mo3795a(c2129c5.f10818l, this.f16878I, c2129c5.f10820n, this.f16891V, this.ad, this.f16906n.m13365a());
                            break;
                        }
                        continue;
                    case 80:
                        this.f16879J.mo3406a(a, true);
                        this.f16879J.mo3405a(this);
                        return;
                    default:
                        FinskyLog.m21669e("Bad state %d for %s (adid: %s , isid: %s)", Integer.valueOf(c2129c.f10813g), this.f16878I, this.ag, m16445e());
                        m16435a(true);
                        return;
                }
                m16429a(c2129c, false);
                m16426a(c2129c);
                m16440b(c2129c);
                return;
            }
        }
        FinskyLog.m21669e("Unexpected missing installer data for %s (adid: %s , isid: %s)", this.f16878I, this.ag, m16445e());
        m16435a(true);
    }

    private final int m16417b(C3647b c3647b) {
        int i = -1;
        if (this.f16905m.ds() && c3647b.f18028c == null) {
            try {
                PackageInfo packageInfo = this.f16912t.getPackageManager().getPackageInfo(this.f16878I, 4202496);
                if ((packageInfo.applicationInfo.flags & 8388608) == 0) {
                    FinskyLog.m21659a("Found %s version %d installed for another user", this.f16878I, Integer.valueOf(packageInfo.versionCode));
                    i = packageInfo.versionCode;
                }
            } catch (NameNotFoundException e) {
            }
        }
        return i;
    }

    final String m16444d() {
        int i = 0;
        String str = null;
        if (this.f16905m.ds()) {
            try {
                PackageInfo packageInfo = this.f16912t.getPackageManager().getPackageInfo(this.f16878I, 4202560);
                if ((packageInfo.applicationInfo.flags & 8388608) == 0) {
                    String str2 = "Found %s with %d signatures installed for another user or hidden";
                    Object[] objArr = new Object[2];
                    objArr[0] = this.f16878I;
                    if (packageInfo.signatures != null) {
                        i = packageInfo.signatures.length;
                    }
                    objArr[1] = Integer.valueOf(i);
                    FinskyLog.m21659a(str2, objArr);
                    if (!(packageInfo.signatures == null || packageInfo.signatures.length == 0)) {
                        str = C4688t.m21838a(packageInfo.signatures[0].toByteArray());
                    }
                }
            } catch (NameNotFoundException e) {
            }
        }
        return str;
    }

    final void m16429a(C2129c c2129c, boolean z) {
        int i;
        int i2;
        this.ae.clear();
        this.f16880K = 0;
        C3654j a = new C3654j(this.f16911s).m17261a(c2129c).m17262a(this.f16896d.m17243a(this.f16878I).f18028c);
        a aVar = c2129c.f10811e;
        if (m16451k() && a.m17268d()) {
            C0308c c0308c = new C0308c(a.m17267c());
            for (ae aeVar : aVar.r) {
                if (c0308c.contains(aeVar.c)) {
                    this.ae.add(ah.m16414a(aeVar.c));
                    this.f16880K = aeVar.d + this.f16880K;
                }
            }
        } else {
            this.ae.add(this.f16878I);
            this.f16880K += aVar.b;
            this.f16895Z = new C2285b(c2129c);
            List list = this.ae;
            C2285b c2285b = this.f16895Z;
            Collection arrayList = new ArrayList();
            if (c2285b.f11304c != null && c2285b.f11304c.f11300e == 4) {
                arrayList.add("..obb_main");
            }
            if (c2285b.f11305d != null && c2285b.f11305d.f11300e == 4) {
                arrayList.add("..obb_patch");
            }
            list.addAll(arrayList);
            if (m16451k()) {
                for (ae aeVar2 : aVar.r) {
                    this.ae.add(ah.m16414a(aeVar2.c));
                    this.f16880K += aeVar2.d;
                }
            }
        }
        FinskyLog.m21659a("Required downloads: %s", this.ae);
        this.f16884O = this.f16910r.m8957a(c2129c.f10811e, this.f16878I, c2129c.f10809c);
        this.f16881L = 0;
        int i3 = c2129c.f10819m;
        if ((i3 & eq.FLAG_MOVED) != 0) {
            this.f16886Q = false;
        } else {
            this.f16886Q = (i3 & 2) != 0;
            if (z && !this.f16886Q) {
                this.f16886Q = this.f16884O < this.f16902j.f11252e;
                if (this.f16886Q) {
                    this.f16879J.mo3407a(this.f16878I);
                }
            }
        }
        String str = c2129c.f10818l;
        ah.m16416a("processDeliveryData", this.f16878I, str, c2129c);
        if (((c2129c.f10811e.a & eq.FLAG_MOVED) != 0 ? 1 : null) != null) {
            i = c2129c.f10811e.s;
        } else {
            i = 0;
        }
        C2470a c = c2129c.m11119c();
        es esVar = c2129c.f10832z != null ? c2129c.f10832z.f13153B : null;
        int a2 = ah.m16412a(c, esVar);
        C2296c c2296c = this.f16903k;
        String str2 = this.f16878I;
        long j = this.f16880K;
        i = C3298q.m16526a(i);
        boolean d = a.m17268d();
        if (C4671b.m21787d() && d) {
            i2 = 2;
        } else {
            i2 = 1;
        }
        c2296c.mo2843a(str2, j, str, i, a2, esVar, i2);
    }

    private static String m16414a(String str) {
        String str2 = "..split.";
        String valueOf = String.valueOf(str);
        return valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2);
    }

    final void m16440b(C2129c c2129c) {
        if (c2129c.f10813g > 40) {
            FinskyLog.m21667d("Unexpected download start states for %s (adid: %s , isid: %s): %d %d", this.f16878I, this.ag, m16445e(), Integer.valueOf(c2129c.f10813g), Integer.valueOf(c2129c.f10813g));
            m16435a(false);
            m16433a(this.f16878I, 902);
            return;
        }
        boolean z;
        m16439b(40, null);
        if (this.af.isEmpty()) {
            int i;
            long j;
            C3299r c3299r = this.f16873D;
            C3647b a = this.f16896d.m17243a(this.f16878I);
            a aVar = a.f18029d.f10811e;
            long j2 = aVar.b;
            if (c3299r.f17056a.dj().mo2294a(12640074)) {
                ae[] aeVarArr = aVar.r;
                i = 0;
                while (i < aeVarArr.length) {
                    j = aeVarArr[i].d + j2;
                    i++;
                    j2 = j;
                }
            }
            if (Environment.isExternalStorageEmulated()) {
                if (a == null || a.f18028c == null) {
                    i = -1;
                } else {
                    i = a.f18028c.f11419d;
                }
                for (e eVar : aVar.j) {
                    if (i < eVar.d) {
                        j2 += eVar.e;
                    }
                }
            }
            long j3 = j2;
            if (this.f16901i.m16694a(j3, Environment.getDataDirectory())) {
                z = false;
            } else {
                C3299r c3299r2 = this.f16873D;
                C3647b a2 = this.f16896d.m17243a(this.f16878I);
                if (VERSION.SDK_INT < 21) {
                    z = false;
                } else {
                    if (c3299r2.f17056a.dj().mo2294a(12618917)) {
                        j = an.f24044g.mo4319a(400);
                    } else if (c3299r2.f17056a.dj().mo2294a(12618916)) {
                        j = an.f24044g.mo4319a(300);
                    } else if (c3299r2.f17056a.dj().mo2294a(12618915)) {
                        j = an.f24044g.mo4319a(200);
                    } else {
                        j = -1;
                    }
                    if (j <= 0) {
                        z = false;
                    } else if (a2 == null) {
                        z = false;
                    } else if (a2.f18028c == null) {
                        z = false;
                    } else if (a2.f18029d == null) {
                        z = false;
                    } else {
                        int i2;
                        if ((a2.f18029d.f10819m & 2097152) != 0) {
                            i2 = 1;
                        } else {
                            z = false;
                        }
                        if (i2 == 0) {
                            z = false;
                        } else {
                            z = C3299r.m16529a(j3, j);
                        }
                    }
                }
                if (z) {
                    this.f16874E.m11221a(this.f16878I, new C2474c(171).m13236a(this.f16878I).m13228a(C2830g.m14965a(false)).m13231a(this.f16893X).f13342a);
                    z = false;
                } else {
                    if (this.f16911s.dj().mo2294a(12644772) && this.f16890U) {
                        C3299r c3299r3 = this.f16873D;
                        j = ((Long) C0955b.hS.m28964b()).longValue();
                        if (C4671b.m21787d()) {
                            j2 = c3299r3.m16532b(j);
                        } else {
                            j2 = c3299r3.m16532b(0);
                        }
                        if (j2 <= 0) {
                            z = false;
                        } else {
                            z = C3299r.m16529a(j3, j2);
                        }
                        if (z) {
                            this.f16874E.m11221a(this.f16878I, new C2474c(HprofParser.ROOT_PRIMITIVE_ARRAY_NODATA).m13236a(this.f16878I).m13228a(C2830g.m14965a(false)).f13342a);
                            z = false;
                        }
                    }
                    FinskyLog.m21667d("Cancel download of %s because insufficient free space (isid: %s)", this.f16878I, m16445e());
                    m16435a(false);
                    m16423a(3, 908);
                    this.f16874E.m11221a(this.f16878I, new C2474c(112).m13236a(this.f16878I).m13210a(908).m13228a(C2830g.m14965a(false)).m13231a(this.f16893X).f13342a);
                    if (this.f16876G != null && (this.f16888S || this.f16911s.dj().mo2294a(12613802))) {
                        this.f16876G.mo4281a(c2129c.f10818l, this.f16878I);
                    } else if (this.f16888S) {
                        this.f16899g.mo3786a(c2129c.f10818l, this.f16878I, this.f16906n.m13365a());
                    }
                    z = true;
                }
            }
            if (z) {
                return;
            }
        }
        String a3;
        if (c2129c.f10811e.i != null) {
            FinskyLog.m21669e("Server sent encryption params for %s", c2129c.f10807a);
            m16435a(false);
            m16433a(a3, 913);
        } else if (m16436a(null, c2129c)) {
            z = (!m16450j() || this.ac == null || this.ah.mo2277d()) ? false : this.ac.mo3415b().equals(this.ah.mo2275b()) || ((this.ac.mo3419f().mo3421a() > 0 && this.ac.mo3419f().mo3423c().equals(this.ah.mo2275b())) || (this.ac.mo3419f().mo3422b() > 0 && this.ac.mo3419f().mo3424d().equals(this.ah.mo2275b())));
            if (z) {
                if (this.ah.mo2284i() == null) {
                    a3 = this.ac.mo3414a();
                } else if (this.ah.mo2284i().f11296a) {
                    a3 = this.ac.mo3419f().mo3426f();
                } else {
                    a3 = this.ac.mo3419f().mo3425e();
                }
                m16439b(50, a3);
                m16443c();
            } else if (this.ah.mo2277d()) {
                if (this.ah.mo2282g()) {
                    if (C2830g.m14966a()) {
                        z = false;
                    } else {
                        FinskyLog.m21667d("Cancel download of %s because no external storage for OBB (isid: %s)", this.f16878I, m16445e());
                        m16435a(false);
                        m16423a(3, 901);
                        this.f16874E.m11221a(this.f16878I, new C2474c(112).m13236a(this.f16878I).m13210a(901).m13228a(C2830g.m14965a(false)).m13231a(this.f16893X).f13342a);
                        if (this.f16888S) {
                            this.f16899g.mo3810d(c2129c.f10818l, this.f16878I, this.f16906n.m13365a());
                        }
                        z = true;
                    }
                    if (z) {
                        return;
                    }
                }
                m16427a(c2129c, new av(this));
            } else {
                m16449i();
            }
        } else {
            m16439b(60, null);
            m16443c();
        }
    }

    final boolean m16437a(String str, a aVar) {
        C1518d c1524g;
        e[] eVarArr;
        int length;
        int i;
        e eVar;
        if ("..obb_main".equals(str)) {
            eVarArr = aVar.j;
            length = eVarArr.length;
            i = 0;
            while (i < length) {
                eVar = eVarArr[i];
                if (eVar.c != 0) {
                    i++;
                } else if (!m16450j() || this.ac == null || this.ac.mo3419f().mo3421a() <= 0) {
                    c1524g = new C1524g(this.f16912t, str, this.f16878I, this.f16895Z.f11304c, eVar);
                } else {
                    c1524g = new C1523f(this.f16912t, str, this.f16878I, this.f16895Z.f11304c, eVar, this.ac.mo3419f().mo3421a(), this.ac.mo3419f().mo3423c(), this.ac.mo3419f().mo3421a() != this.f16895Z.f11304c.f11298c);
                }
            }
            c1524g = null;
        } else if ("..obb_patch".equals(str)) {
            eVarArr = aVar.j;
            length = eVarArr.length;
            i = 0;
            while (i < length) {
                eVar = eVarArr[i];
                if (1 != eVar.c) {
                    i++;
                } else if (!m16450j() || this.ac == null || this.ac.mo3419f().mo3422b() <= 0) {
                    c1524g = new C1524g(this.f16912t, str, this.f16878I, this.f16895Z.f11305d, eVar);
                } else {
                    boolean z;
                    if (this.ac.mo3419f().mo3422b() != this.f16895Z.f11305d.f11298c) {
                        z = true;
                    } else {
                        z = false;
                    }
                    c1524g = new C1523f(this.f16912t, str, this.f16878I, this.f16895Z.f11305d, eVar, this.ac.mo3419f().mo3422b(), this.ac.mo3419f().mo3424d(), z);
                }
            }
            c1524g = null;
        } else if (m16450j() && this.ac != null) {
            boolean z2;
            if (this.ac.mo3416c() != this.f16896d.m17243a(this.f16878I).f18029d.f10809c) {
                z2 = true;
            } else {
                z2 = false;
            }
            c1524g = new C1520b(str, this.f16878I, aVar, this.f16903k, this.ac.mo3415b(), this.ac.mo3416c(), z2);
        } else if (this.f16878I.equals(str)) {
            c1524g = new C1521c(this.f16912t, this.f16896d, this.f16903k, str, this.f16878I, aVar);
        } else {
            if (m16451k()) {
                ae[] aeVarArr = aVar.r;
                int length2 = aeVarArr.length;
                int i2 = 0;
                while (i2 < length2) {
                    ae aeVar = aeVarArr[i2];
                    String str2 = "..split.";
                    String valueOf = String.valueOf(aeVar.c);
                    if (str.equals(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2))) {
                        boolean z3;
                        String str3;
                        C2129c c2129c = this.f16896d.m17243a(this.f16878I).f18029d;
                        if (!(!m16452l() || C0327a.m1721a() || c2129c.f10806M == null)) {
                            if ((c2129c.f10806M.f17131a & eq.FLAG_APPEARED_IN_PRE_LAYOUT) != 0) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            if (z3) {
                                z3 = true;
                                if (z3) {
                                    str3 = null;
                                } else {
                                    str3 = c2129c.f10806M.f17149s;
                                }
                                if (str3 != null) {
                                    c1524g = new C1525h(str, this.f16896d, this.f16903k, this.f16878I, aeVar);
                                } else {
                                    c1524g = new C1526i(str, this.f16896d, this.f16878I, str3, aeVar);
                                }
                            }
                        }
                        z3 = false;
                        if (z3) {
                            str3 = null;
                        } else {
                            str3 = c2129c.f10806M.f17149s;
                        }
                        if (str3 != null) {
                            c1524g = new C1526i(str, this.f16896d, this.f16878I, str3, aeVar);
                        } else {
                            c1524g = new C1525h(str, this.f16896d, this.f16903k, this.f16878I, aeVar);
                        }
                    } else {
                        i2++;
                    }
                }
            }
            c1524g = null;
        }
        this.ah = c1524g;
        if (this.ah != null) {
            return true;
        }
        return false;
    }

    final boolean m16436a(String str, C2129c c2129c) {
        a aVar = c2129c.f10811e;
        if (TextUtils.isEmpty(str)) {
            List arrayList = new ArrayList(this.ae);
            arrayList.removeAll(this.af);
            if (arrayList.isEmpty()) {
                return false;
            }
            str = (String) arrayList.get(0);
        }
        if (m16437a(str, aVar)) {
            this.ag = str;
            this.f16900h.mo2680e(this.f16878I, this.ag);
            m16420m();
            return true;
        }
        FinskyLog.m21669e("Cannot find download id %s for package %s", str, this.f16878I);
        return false;
    }

    final void m16427a(C2129c c2129c, ay ayVar) {
        int i = c2129c.f10819m;
        m16428a(c2129c, new C3288f(i, i & -4613), ayVar);
    }

    final void m16428a(C2129c c2129c, C3288f c3288f, ay ayVar) {
        boolean z;
        if (!c3288f.f17024c) {
            c3288f.f17024c = true;
            if ((c3288f.f17022a & 65536) != 0) {
                z = true;
            } else if (this.ah.mo2282g()) {
                c3288f.f17023b |= eq.FLAG_APPEARED_IN_PRE_LAYOUT;
                z = true;
            } else if ((c3288f.f17022a & 8192) != 0) {
                z = true;
            } else if ((c3288f.f17022a & eq.FLAG_APPEARED_IN_PRE_LAYOUT) != 0) {
                c3288f.f17023b |= eq.FLAG_APPEARED_IN_PRE_LAYOUT;
                z = true;
            } else {
                long j = this.ah.f8209g;
                if (j < ((Long) C0955b.bc.m28964b()).longValue()) {
                    z = true;
                } else {
                    bb.m21792a(new aw(this, j, c3288f, c2129c, ayVar), new Void[0]);
                    z = false;
                }
            }
            if (!z) {
                return;
            }
        }
        if ((c3288f.f17023b & eq.FLAG_APPEARED_IN_PRE_LAYOUT) != 0) {
            this.f16893X.f();
        }
        if (!c3288f.f17025d) {
            c3288f.f17025d = true;
            if ((c3288f.f17022a & 8) == 0) {
                if ((c3288f.f17022a & 4) == 0) {
                    if (this.ah.mo2274a()) {
                        d dVar = this.ah.f8214l;
                        if (dVar != null) {
                            switch (dVar.f) {
                                case 1:
                                case 2:
                                case 3:
                                case 4:
                                case 5:
                                    int i = dVar.b;
                                    int c = this.ah.mo2276c();
                                    if (c == i) {
                                        File b = this.ah.mo2275b();
                                        if (b != null) {
                                            if (!b.exists()) {
                                                m16441b(this.f16878I, 1022, null);
                                                FinskyLog.m21659a("Cannot patch %s (adid: %s , isid: %s), file does not exist %s", this.f16878I, this.ag, m16445e(), b);
                                                z = true;
                                                break;
                                            }
                                            bb.m21792a(new aj(this, c3288f, b, dVar, c2129c, ayVar), new Void[0]);
                                            z = false;
                                            break;
                                        }
                                        m16441b(this.f16878I, 1021, null);
                                        FinskyLog.m21659a("Cannot patch %s (adid: %s , isid: %s), existing version is %d", this.f16878I, this.ag, m16445e(), Integer.valueOf(c));
                                        z = true;
                                        break;
                                    }
                                    int i2;
                                    if (c > 0) {
                                        i2 = 1019;
                                    } else {
                                        i2 = 1020;
                                    }
                                    m16441b(this.f16878I, i2, null);
                                    FinskyLog.m21659a("Cannot patch %s (adid: %s , isid: %s), need version %d but has %d", this.f16878I, this.ag, m16445e(), Integer.valueOf(i), Integer.valueOf(c));
                                    z = true;
                                    break;
                                default:
                                    m16441b(this.f16878I, 1018, null);
                                    FinskyLog.m21669e("Can't download patch %s (adid: %s , isid: %s) because format (%d) is unsupported", this.f16878I, this.ag, m16445e(), Integer.valueOf(dVar.f));
                                    z = true;
                                    break;
                            }
                        }
                        z = true;
                    } else {
                        FinskyLog.m21659a("Download %s (%s) cannot be patched (yet)", this.f16878I, this.ag);
                        z = true;
                    }
                } else {
                    c3288f.f17023b |= 4;
                    z = true;
                }
            } else {
                z = true;
            }
            if (!z) {
                return;
            }
        }
        if ((c3288f.f17023b & 4) != 0) {
            d dVar2 = this.ah.f8214l;
            this.f16893X.c(true);
            this.f16893X.c(dVar2.f);
            if (C2952g.m15336a(this.ah)) {
                this.f16893X.b(true);
            }
            m16415a(dVar2.e, -1, dVar2.g, c3288f, ayVar);
            return;
        }
        if (!c3288f.f17026e) {
            c3288f.f17026e = true;
            if ((c3288f.f17022a & MemoryMappedFileBuffer.DEFAULT_PADDING) != 0) {
                z = true;
            } else if ((c3288f.f17022a & 512) != 0) {
                c3288f.f17023b |= 512;
                z = true;
            } else if (this.ah.f8213k == null) {
                z = true;
            } else {
                bb.m21792a(new ax(this, c3288f, c2129c, ayVar), new Void[0]);
                z = false;
            }
            if (!z) {
                return;
            }
        }
        if ((c3288f.f17023b & 512) != 0) {
            if (this.ah.f8213k == null) {
                FinskyLog.m21667d("FLAGS_APK_IS_COMPRESSED set but compressedDownload is null", new Object[0]);
            } else {
                m16432a(this.ah.f8213k);
                m16415a(this.ah.f8213k.d, -1, this.ah.f8213k.c, c3288f, ayVar);
                return;
            }
        }
        FinskyLog.m21659a("Downloading full file for %s (%s)", this.f16878I, this.ag);
        m16415a(this.ah.f8212j, this.ah.f8209g, this.ah.f8209g, c3288f, ayVar);
    }

    private final void m16415a(String str, long j, long j2, C3288f c3288f, ay ayVar) {
        C2129c a = this.f16900h.mo2657a(this.f16878I);
        int i = a.f10813g;
        Object obj = i == 40 ? 1 : null;
        Object obj2 = (i == 45 || i == 25 || i == 35) ? 1 : null;
        if (obj == null && obj2 == null) {
            FinskyLog.m21659a("Detected cancellation of install of %s (state %d)", this.f16878I, Integer.valueOf(i));
            return;
        }
        C2839b a2;
        int i2 = c3288f.f17023b;
        if (a.f10819m != i2) {
            this.f16900h.mo2675d(this.f16878I, i2);
        }
        Uri uri = null;
        if ((i2 & eq.FLAG_APPEARED_IN_PRE_LAYOUT) != 0) {
            if ((i2 & 4) != 0 || (i2 & 512) != 0 || this.ah.mo2279a(true) || this.ah.mo2283h() == null) {
                uri = Uri.fromFile(new File(this.f16912t.getExternalFilesDir(null), String.valueOf(System.currentTimeMillis())));
            } else {
                uri = Uri.fromFile(this.ah.mo2283h());
            }
        }
        String a3 = this.ah.mo2273a(a.f10818l);
        Set c = m16419c(a);
        boolean a4 = this.f16911s.dj().mo2294a(12628004);
        boolean z = this.f16887R;
        if (!this.f16890U || a4) {
            if ("com.google.android.gms".equals(this.f16878I)) {
                a3 = this.f16912t.getString(C7582R.string.notification_gmscore_updating_download);
            } else if ("rapid_auto_update".equals(a.f10801H)) {
                a3 = this.f16912t.getString(C7582R.string.notification_rapid_update_download, new Object[]{a3});
            }
        } else {
            a3 = this.f16912t.getString(C7582R.string.notification_download_webapk, new Object[]{a3});
            z = true;
        }
        if (this.ah.mo2284i() == null) {
            a2 = C2841d.m15022a(str, a3, this.f16878I, uri, j, j2, !this.f16886Q, !z, c);
        } else {
            a2 = C2841d.m15021a(str, a3, this.f16878I, uri, j, j2, !this.f16886Q, !z);
        }
        ayVar.mo3409a(a2);
    }

    private final Set m16419c(C2129c c2129c) {
        Set hashSet = new HashSet();
        if (!this.f16911s.dj().mo2294a(12639669)) {
            return hashSet;
        }
        for (l lVar : c2129c.f10811e.k) {
            if (!(lVar == null || TextUtils.isEmpty(lVar.b) || TextUtils.isEmpty(lVar.c))) {
                hashSet.add(new HttpCookie(lVar.b, lVar.c));
            }
        }
        return hashSet;
    }

    final String m16445e() {
        if (this.f16893X == null || TextUtils.isEmpty(this.f16893X.w)) {
            return "n/a";
        }
        return this.f16893X.w;
    }

    public final void m16446f() {
        if (!C0327a.m1722b() && !C1503a.m8830a(this.f16912t)) {
            if (this.f16914v.m15626a(this.f16878I).f15831s) {
                PackageManager packageManager = this.f16912t.getPackageManager();
                try {
                    ApplicationInfo applicationInfo = packageManager.getApplicationInfo(this.f16878I, 0);
                    Resources resourcesForApplication = packageManager.getResourcesForApplication(applicationInfo);
                    String resourceName = resourcesForApplication.getResourceName(applicationInfo.icon);
                    Parcelable launchIntentForPackage = packageManager.getLaunchIntentForPackage(this.f16878I);
                    int i = packageManager.getActivityInfo(launchIntentForPackage.getComponent(), 0).labelRes;
                    CharSequence string = i != 0 ? resourcesForApplication.getString(i) : packageManager.getApplicationLabel(applicationInfo);
                    Intent intent = new Intent("com.android.launcher.action.INSTALL_SHORTCUT");
                    intent.putExtra("android.intent.extra.shortcut.NAME", string);
                    intent.putExtra("android.intent.extra.shortcut.INTENT", launchIntentForPackage);
                    Parcelable shortcutIconResource = new ShortcutIconResource();
                    shortcutIconResource.packageName = this.f16878I;
                    shortcutIconResource.resourceName = resourceName;
                    intent.putExtra("android.intent.extra.shortcut.ICON_RESOURCE", shortcutIconResource);
                    intent.putExtra("duplicate", false);
                    this.f16912t.sendBroadcast(intent);
                    FinskyLog.m21659a("Requested shortcut for %s", this.f16878I);
                    return;
                } catch (NotFoundException e) {
                    FinskyLog.m21665c("Unable to load resources for %s", this.f16878I);
                    return;
                } catch (Throwable e2) {
                    FinskyLog.m21663b(e2, "Unable to add shortcut for %s", this.f16878I);
                    return;
                }
            }
            FinskyLog.m21659a("Skip shortcut for non-launchable %s", this.f16878I);
        }
    }

    final void m16447g() {
        File externalFilesDir = this.f16912t.getExternalFilesDir(null);
        if (externalFilesDir != null) {
            File[] listFiles = externalFilesDir.listFiles();
            if (listFiles != null) {
                for (File delete : listFiles) {
                    delete.delete();
                }
            }
        }
    }

    final long m16448h() {
        return this.f16881L + this.f16882M;
    }

    final void m16423a(int i, int i2) {
        this.f16879J.mo3408a(this.f16878I, i, i2);
    }

    final void m16439b(int i, String str) {
        this.f16900h.mo2662a(this.f16878I, i, str);
    }

    final void m16424a(int i, Uri uri) {
        m16439b(i, uri != null ? uri.toString() : null);
    }

    public final String toString() {
        return this.f16878I;
    }

    final void m16434a(String str, int i, Exception exception) {
        C2474c a = new C2474c(149).m13236a(str).m13254g(i).m13238a((Throwable) exception).m13231a(this.f16893X);
        if (i == 1026 || i == 1017) {
            a.m13228a(C2830g.m14965a(false));
        }
        this.f16874E.m11221a(str, a.f13342a);
    }

    final void m16441b(String str, int i, Exception exception) {
        boolean z = this.f16893X.g;
        this.f16893X.c(true);
        m16434a(str, i, exception);
        this.f16893X.c(z);
    }

    final void m16433a(String str, int i) {
        this.f16874E.m11221a(str, new C2474c(104).m13236a(str).m13210a(i).m13238a(null).m13231a(this.f16893X).f13342a);
        m16423a(3, i);
        m16425a(i, null);
    }

    final void m16422a(int i) {
        if (this.f16883N >= 0) {
            long j;
            C3647b a = this.f16896d.m17243a(this.f16878I);
            if (a == null || a.f18029d == null) {
                j = 0;
            } else {
                int i2 = a.f18029d.f10809c;
                C1532b c1532b = (C1532b) this.f16910r.f8266d.get(this.f16878I);
                j = (c1532b == null || c1532b.f8267a != i2) ? 0 : c1532b.f8268b;
            }
            if (j > 0) {
                C2474c a2 = new C2474c(136).m13236a(this.f16878I).m13231a(this.f16893X).m13210a(i);
                long j2 = this.f16883N;
                au auVar = new au();
                auVar.a |= 1;
                auVar.b = j;
                auVar.a |= 2;
                auVar.c = j2;
                a2.f13342a.f31683I = auVar;
                this.f16874E.m11221a(this.f16878I, a2.f13342a);
                this.f16883N = -1;
                this.f16910r.m8960a(this.f16878I);
            }
        }
    }

    final void m16449i() {
        this.af.add(this.ag);
        this.f16900h.mo2668a(this.f16878I, (String[]) this.af.toArray(new String[this.af.size()]));
        this.f16882M += this.f16881L;
        this.f16900h.mo2673c(this.f16878I, this.f16882M);
        this.f16881L = 0;
        C2129c a = this.f16900h.mo2657a(this.f16878I);
        int i = a.f10819m;
        int i2 = i & -13837;
        if (i != i2) {
            this.f16900h.mo2675d(this.f16878I, i2);
        }
        if (!this.f16878I.equals(this.ag)) {
            if (this.f16911s.dj().mo2294a(12619996)) {
                this.f16900h.mo2660a(new C2131e(this.f16878I).m11161a(a.m11119c()));
            } else {
                this.f16900h.mo2679e(this.f16878I, a.f10794A);
            }
        }
        m16439b(40, null);
        m16443c();
    }

    private final boolean m16418b(String str) {
        try {
            ApplicationInfo applicationInfo = this.f16912t.getPackageManager().getApplicationInfo(str, 0);
            Object obj = applicationInfo.sourceDir;
            String str2 = applicationInfo.publicSourceDir;
            if (TextUtils.isEmpty(obj) || !obj.equals(str2)) {
                return true;
            }
            return false;
        } catch (NameNotFoundException e) {
            return false;
        }
    }

    final boolean m16442b(int i, int i2) {
        boolean z = true;
        FinskyLog.m21659a("Retry download of %s (adid: %s , isid: %s) (inhibit %d)", this.f16878I, this.ag, m16445e(), Integer.valueOf(i2));
        C2127b c2127b = this.f16900h;
        int i3 = c2127b.mo2657a(this.f16878I).f10819m;
        if ((i3 & i) == 0) {
            z = false;
        }
        if (z) {
            c2127b.mo2675d(this.f16878I, (i3 | i2) & (i ^ -1));
            if ((i & 4) != 0) {
                this.f16893X.h();
                this.f16893X.g();
                this.f16893X.i();
            }
            if ((i & 512) != 0) {
                this.f16893X.g();
            }
            if ((i & eq.FLAG_APPEARED_IN_PRE_LAYOUT) != 0) {
                this.f16893X.e();
            }
            m16439b(40, null);
            m16443c();
        }
        return z;
    }

    final void m16432a(f fVar) {
        if (fVar == null) {
            FinskyLog.m21667d("setting CompressionFormatLogging but compressedDownload is null", new Object[0]);
            return;
        }
        if (fVar.b == 2) {
            this.f16893X.b(true);
        }
        this.f16893X.f(fVar.b);
    }

    private static int m16412a(C2470a c2470a, es esVar) {
        if (esVar != null && esVar.f12319k != 0) {
            return esVar.f12319k;
        }
        if (c2470a == null || TextUtils.isEmpty(c2470a.f13308d)) {
            return 0;
        }
        String str = c2470a.f13308d;
        int i = -1;
        switch (str.hashCode()) {
            case -1810908213:
                if (str.equals("wear_auto_install")) {
                    i = 2;
                    break;
                }
                break;
            case -284840886:
                if (str.equals("unknown")) {
                    i = 5;
                    break;
                }
                break;
            case 330290102:
                if (str.equals("restore_vpa")) {
                    i = 1;
                    break;
                }
                break;
            case 838565350:
                if (str.equals("device_owner_install")) {
                    i = 4;
                    break;
                }
                break;
            case 1097519758:
                if (str.equals("restore")) {
                    i = 3;
                    break;
                }
                break;
            case 1378851109:
                if (str.equals("early_update")) {
                    i = 0;
                    break;
                }
                break;
        }
        switch (i) {
            case 0:
            case 1:
            case 2:
                return 3;
            case 3:
                return 2;
            case 4:
                return 1;
            case 5:
                return 0;
            default:
                return 4;
        }
    }

    static int m16413a(C2495w c2495w, es esVar) {
        return ah.m16412a(c2495w != null ? c2495w.m13381c() : null, esVar);
    }

    final boolean m16450j() {
        return this.f16911s.dj().mo2294a(12637748) || this.f16911s.dj().mo2294a(12642495);
    }

    final boolean m16451k() {
        return this.f16911s.dj().mo2294a(12640074);
    }

    final boolean m16452l() {
        return this.f16911s.dj().mo2294a(12642050);
    }
}
