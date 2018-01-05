package com.google.android.finsky.ia2;

import android.content.Context;
import android.os.Build.VERSION;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.ew;
import android.support.v7.widget.ff;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LayoutAnimationController;
import com.android.volley.C0657w;
import com.android.volley.VolleyError;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.api.C1254c;
import com.google.android.finsky.api.C1290m;
import com.google.android.finsky.dfemodel.C1031w;
import com.google.android.finsky.dfemodel.C2335k;
import com.google.android.finsky.dfemodel.C2721l;
import com.google.android.finsky.dfemodel.C2730u;
import com.google.android.finsky.fastscroll.ScrubberView;
import com.google.android.finsky.frameworkviews.ah;
import com.google.android.finsky.headerlistlayout.C3117g;
import com.google.android.finsky.headerlistlayout.FinskyHeaderListLayout;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.nestedrecyclerviews.NestedParentRecyclerView;
import com.google.android.finsky.nestedrecyclerviews.p115a.C1062m;
import com.google.android.finsky.p111d.C2475d;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.p111d.C2492t;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.p111d.ag;
import com.google.android.finsky.p111d.ai;
import com.google.android.finsky.p111d.ak;
import com.google.android.finsky.p111d.al;
import com.google.android.finsky.pagesystem.C1041g;
import com.google.android.finsky.pagesystem.C1044f;
import com.google.android.finsky.recyclerview.C3984a;
import com.google.android.finsky.stream.base.C4279n;
import com.google.android.finsky.stream.base.view.C4297g;
import com.google.android.finsky.stream.p248a.C4234b;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.ac;
import com.google.android.libraries.performance.primes.cm;
import com.google.wireless.android.a.a.a.a.ce;
import com.squareup.leakcanary.C7582R;

public final class C3230f implements C0657w, ad, C1031w, C3229s, C1062m {
    public static final boolean f16592a = (VERSION.SDK_INT >= 16);
    public C3984a f16593A;
    public final boolean f16594B;
    public final C2495w f16595C;
    public final C2492t f16596D = C1473m.f7980a.aP();
    public C1044f f16597E;
    public ai f16598F;
    public ce f16599G = C2482j.m13283a(408);
    public ag f16600H;
    public final byte[] f16601I;
    public final byte[] f16602J;
    public final ak f16603K;
    public final al f16604L;
    public final boolean f16605M;
    public C1041g f16606N;
    public com.google.wireless.android.finsky.dfe.nano.ag[] f16607b;
    public C2730u f16608c;
    public final String f16609d;
    public C1254c f16610e;
    public ac f16611f;
    public boolean f16612g = true;
    public boolean f16613h;
    public final int f16614i;
    public final C3748a f16615j;
    public final int f16616k;
    public final ah f16617l;
    public Context f16618m;
    public NestedParentRecyclerView f16619n;
    public ew f16620o;
    public ff f16621p;
    public final boolean f16622q;
    public final FinskyHeaderListLayout f16623r;
    public ScrubberView f16624s;
    public ViewGroup f16625t;
    public C4279n f16626u;
    public Animation f16627v;
    public LayoutAnimationController f16628w;
    public C4234b f16629x;
    public C3235t f16630y;
    public LayoutInflater f16631z;

    public C3230f(int i, Context context, C3748a c3748a, int i2, ah ahVar, LayoutInflater layoutInflater, ff ffVar, FinskyHeaderListLayout finskyHeaderListLayout, boolean z, C1254c c1254c, String str, com.google.wireless.android.finsky.dfe.nano.ag[] agVarArr, boolean z2, ai aiVar, C2495w c2495w, ak akVar, C1044f c1044f, al alVar, byte[] bArr, byte[] bArr2, C1041g c1041g) {
        this.f16614i = i;
        this.f16618m = context;
        this.f16615j = c3748a;
        this.f16616k = i2;
        this.f16617l = ahVar;
        this.f16631z = layoutInflater;
        this.f16598F = aiVar;
        this.f16621p = ffVar;
        this.f16623r = finskyHeaderListLayout;
        this.f16622q = z;
        this.f16610e = c1254c;
        this.f16609d = str;
        this.f16607b = agVarArr;
        this.f16594B = z2;
        this.f16595C = c2495w;
        this.f16597E = c1044f;
        this.f16604L = alVar;
        this.f16603K = akVar;
        this.f16601I = bArr;
        this.f16602J = bArr2;
        this.f16605M = C1473m.f7980a.dj().mo2294a(12637322);
        C1473m.f7980a.dj().mo2294a(12644322);
        this.f16606N = c1041g;
    }

    public final void mo3389a(ac acVar) {
        this.f16611f = acVar;
        if (this.f16611f != null && this.f16611f.m21689a("Ia2StreamSubNavPage.MultiDfeList")) {
            C2730u c2730u = (C2730u) this.f16611f.m21690b("Ia2StreamSubNavPage.MultiDfeList");
            if (c2730u != null) {
                if (this.f16608c != null) {
                    m16302b(false);
                }
                this.f16608c = c2730u;
                m16302b(true);
            }
        }
    }

    public final void mo3388a(C3235t c3235t) {
        this.f16630y = c3235t;
    }

    public final void mo3386a() {
        boolean z = true;
        if (mo3393c()) {
            this.f16630y.mo3394a(this.f16614i);
            return;
        }
        if (this.f16608c == null) {
            C1473m.f7980a.aO();
            this.f16608c = C2721l.m14735a(C2721l.m14731a(this.f16610e, this.f16609d));
        }
        if (this.f16605M) {
            this.f16604L.mo1384a(1741, this.f16601I, this.f16602J);
        }
        m16302b(true);
        if (this.f16608c == null || this.f16608c.f14950a == null || mo3393c() || !this.f16608c.f14950a.m14703r()) {
            z = false;
        }
        if (!z) {
            this.f16608c.f14950a.m14699n();
        }
    }

    public final void mo3387a(int i) {
        if (i == 1) {
            this.f16595C.m13379b(new C2475d(this.f16598F));
        }
        C2482j.m13305c(this.f16598F);
        this.f16598F.m13206a(true);
        if (this.f16598F.getPlayStoreUiElement().f.length == 0) {
            C2482j.m13290a(this.f16619n);
        }
        this.f16612g = true;
    }

    public final void mo3391b(int i) {
        if (i == 2) {
            this.f16595C.m13379b(new C2475d(this.f16598F).m13256a(600));
        }
        this.f16598F.m13206a(false);
    }

    public final ViewGroup mo3385a(boolean z) {
        m16302b(true);
        if (this.f16619n == null) {
            if (this.f16622q) {
                this.f16625t = (ViewGroup) this.f16631z.inflate(C7582R.layout.ia2_play_recycler_view_with_scrubber, null);
                this.f16619n = (NestedParentRecyclerView) this.f16625t.findViewById(C7582R.id.tab_recycler_view);
            } else {
                this.f16619n = (NestedParentRecyclerView) this.f16631z.inflate(C7582R.layout.ia2_play_recycler_view, null);
                this.f16625t = this.f16619n;
            }
            this.f16619n.getContext();
            this.f16620o = new LinearLayoutManager();
            this.f16593A = new C3984a();
            this.f16619n.setAdapter(this.f16593A);
            this.f16619n.setLayoutManager(this.f16620o);
            int a = C1473m.f7980a.av().m9275a(this.f16618m.getResources());
            this.f16619n.m278a(new C4297g(a, a));
            if (C1473m.f7980a.bT().m11023b() == 4) {
                this.f16619n.setParentChildScrollOffset(this.f16619n.getResources().getDimensionPixelSize(C7582R.dimen.ia2_subnav_height));
            }
            if (C1473m.f7980a.ay().m9025d()) {
                if (this.f16600H == null) {
                    this.f16600H = new ag(cm.f29878b, C1473m.f7980a.cv(), this.f16595C, 1);
                }
                this.f16619n.mo2951a(this.f16600H);
            }
        }
        if (this.f16626u == null) {
            this.f16626u = new C4279n();
            this.f16629x = C1473m.f7980a.co().m19665a(this.f16608c, this.f16626u, this.f16619n, this.f16618m, this.f16615j, this, this.f16595C, this.f16616k, this.f16607b, this.f16617l, null, false, null, false, false, null, this.f16621p, false);
        }
        if (this.f16611f != null) {
            this.f16626u.m19845a(this.f16611f);
        }
        if (f16592a && z) {
            if (this.f16627v == null || this.f16628w == null) {
                this.f16627v = AnimationUtils.loadAnimation(this.f16619n.getContext(), C7582R.anim.ia2_sub_nav_page_fade_in);
                this.f16628w = new LayoutAnimationController(this.f16627v);
                this.f16628w.setDelay(0.1f);
            }
            this.f16619n.setLayoutAnimation(this.f16628w);
            this.f16627v.setAnimationListener(new C3231g(this));
        } else {
            C3232h c3232h = new C3232h(this, this.f16619n);
        }
        C2482j.m13285a(this.f16599G, this.f16608c.f14950a.f14908a.f14885a.f12087D);
        if (this.f16622q && this.f16624s == null) {
            this.f16624s = (ScrubberView) this.f16625t.findViewById(C7582R.id.scrubber_view);
            C3117g configurator = this.f16624s.getConfigurator();
            configurator.f16075d = this.f16619n;
            configurator.f16076e = this.f16623r;
            configurator.m15964a();
            this.f16623r.m16073a(configurator);
            if (this.f16611f != null) {
                configurator.m15968b(this.f16611f);
            }
            this.f16619n.m17909a((C1062m) this);
        }
        this.f16611f = null;
        this.f16612g = false;
        return this.f16625t;
    }

    public final void mo3392b(ac acVar) {
        if (this.f16622q && this.f16624s != null) {
            C3117g configurator = this.f16624s.getConfigurator();
            this.f16623r.m16076b(configurator);
            this.f16619n.m17910b(this);
            configurator.m15963a(acVar).m15967b();
            this.f16624s = null;
        }
        if (this.f16626u != null) {
            this.f16626u.m19859b(acVar);
            this.f16626u = null;
            this.f16619n.setAdapter(this.f16593A);
        }
        if (this.f16600H != null) {
            this.f16619n.mo2952b(this.f16600H);
            this.f16600H = null;
        }
        this.f16619n = null;
        this.f16620o = null;
        this.f16593A = null;
        m16302b(false);
        if (this.f16608c != null) {
            acVar.m21688a("Ia2StreamSubNavPage.MultiDfeList", this.f16608c);
        }
        if (this.f16629x != null) {
            this.f16629x.m19660d();
            this.f16629x = null;
        }
        this.f16630y = null;
    }

    public final void mo3390b() {
        this.f16604L.mo1385a(1737, this.f16601I, this.f16602J, true);
        mo3386a();
    }

    public final boolean mo3393c() {
        return this.f16608c != null && this.f16608c.f14950a.mo2861a() && this.f16608c.f14950a.m14698m() > 0;
    }

    final void m16314c(int i) {
        if (!this.f16596D.m13357b() || !this.f16594B || this.f16614i != 0) {
            return;
        }
        if (i == 1719) {
            this.f16597E.mo1294k(i);
        } else {
            this.f16597E.mo1293j(i);
        }
    }

    private final void m16302b(boolean z) {
        if (this.f16608c != null && z != this.f16613h) {
            C2335k c2335k = this.f16608c.f14950a;
            if (z) {
                c2335k.m11918a((C1031w) this);
                c2335k.m11917a((C0657w) this);
            } else {
                c2335k.m11922b((C1031w) this);
                c2335k.m11921b((C0657w) this);
            }
            this.f16613h = z;
        }
    }

    public final void m_() {
        if (this.f16605M) {
            this.f16604L.mo1384a(1742, this.f16601I, this.f16602J);
        }
        if (C1473m.f7980a.dj().mo2294a(12636210)) {
            m16314c(1719);
        }
        if (this.f16630y != null && this.f16612g) {
            this.f16630y.mo3394a(this.f16614i);
        }
    }

    public final void mo1062a(VolleyError volleyError) {
        FinskyLog.m21667d("Volley error while fetching sub nav DFE: %s", C1290m.m7702a(C1473m.f7980a.f7981b, volleyError));
        if (C1473m.f7980a.dj().mo2294a(12636210)) {
            m16314c(1705);
        }
        if (this.f16630y != null && this.f16612g) {
            this.f16630y.mo3395a(this.f16614i, r0);
        }
    }

    public final ce getPlayStoreUiElement() {
        return this.f16599G;
    }

    public final ad getParentNode() {
        return this.f16598F;
    }

    public final void mo1219a(ad adVar) {
        C2482j.m13291a((ad) this, adVar);
    }

    public final void mo1356a(RecyclerView recyclerView) {
        if (this.f16624s != null) {
            this.f16624s.getConfigurator().m15965a(recyclerView);
        }
    }
}
