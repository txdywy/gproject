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
import android.view.animation.Animation.AnimationListener;
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
import com.google.android.finsky.p111d.al;
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

final class C3233i implements AnimationListener, C0657w, ad, C1031w, C3229s, C1062m {
    public static final boolean f16636a = (VERSION.SDK_INT >= 16);
    public final boolean f16637A;
    public final C2495w f16638B;
    public final C2492t f16639C = C1473m.f7980a.aP();
    public final C1044f f16640D;
    public final ai f16641E;
    public final ce f16642F = C2482j.m13283a(408);
    public final byte[] f16643G;
    public final byte[] f16644H;
    public final al f16645I;
    public final boolean f16646J;
    public ag f16647K;
    public C3235t f16648b;
    public final com.google.wireless.android.finsky.dfe.nano.ag[] f16649c;
    public final String f16650d;
    public final C1254c f16651e;
    public C2730u f16652f;
    public ac f16653g;
    public boolean f16654h = true;
    public boolean f16655i;
    public final int f16656j;
    public final C3748a f16657k;
    public final int f16658l;
    public final ah f16659m;
    public final boolean f16660n;
    public final FinskyHeaderListLayout f16661o;
    public final LayoutInflater f16662p;
    public Context f16663q;
    public NestedParentRecyclerView f16664r;
    public ew f16665s;
    public ff f16666t;
    public ScrubberView f16667u;
    public ViewGroup f16668v;
    public C4279n f16669w;
    public LayoutAnimationController f16670x;
    public C4234b f16671y;
    public C3984a f16672z;

    C3233i(int i, Context context, C3748a c3748a, int i2, ah ahVar, LayoutInflater layoutInflater, ff ffVar, FinskyHeaderListLayout finskyHeaderListLayout, boolean z, C1254c c1254c, String str, com.google.wireless.android.finsky.dfe.nano.ag[] agVarArr, boolean z2, ai aiVar, C2495w c2495w, C1044f c1044f, al alVar, byte[] bArr, byte[] bArr2) {
        this.f16656j = i;
        this.f16663q = context;
        this.f16657k = c3748a;
        this.f16658l = i2;
        this.f16659m = ahVar;
        this.f16662p = layoutInflater;
        this.f16641E = aiVar;
        this.f16666t = ffVar;
        this.f16661o = finskyHeaderListLayout;
        this.f16660n = z;
        this.f16651e = c1254c;
        this.f16650d = str;
        this.f16649c = agVarArr;
        this.f16637A = z2;
        this.f16638B = c2495w;
        this.f16640D = c1044f;
        this.f16645I = alVar;
        this.f16643G = bArr;
        this.f16644H = bArr2;
        this.f16646J = C1473m.f7980a.dj().mo2294a(12637322);
    }

    public final void mo3388a(C3235t c3235t) {
        this.f16648b = c3235t;
    }

    public final void mo3389a(ac acVar) {
        this.f16653g = acVar;
        if (this.f16653g != null && this.f16653g.m21689a("Ia2StreamSubNavPage.MultiDfeList")) {
            C2730u c2730u = (C2730u) this.f16653g.m21690b("Ia2StreamSubNavPage.MultiDfeList");
            if (c2730u != null) {
                if (this.f16652f != null) {
                    m16316b(false);
                }
                this.f16652f = c2730u;
                m16316b(true);
            }
        }
    }

    public final void mo3386a() {
        boolean z = true;
        if (!mo3393c()) {
            if (this.f16652f == null) {
                C1473m.f7980a.aO();
                this.f16652f = C2721l.m14735a(C2721l.m14731a(this.f16651e, this.f16650d));
            }
            m16316b(true);
            if (this.f16646J) {
                this.f16645I.mo1384a(1741, this.f16643G, this.f16644H);
            }
            if (this.f16652f == null || this.f16652f.f14950a == null || mo3393c() || !this.f16652f.f14950a.m14703r()) {
                z = false;
            }
            if (!z) {
                this.f16652f.f14950a.m14699n();
            }
        } else if (this.f16648b != null) {
            this.f16648b.mo3394a(this.f16656j);
        }
    }

    public final void mo3387a(int i) {
        if (i == 1) {
            this.f16638B.m13379b(new C2475d(this.f16641E));
        }
        C2482j.m13305c(this.f16641E);
        this.f16641E.m13206a(true);
        ce playStoreUiElement = this.f16641E.getPlayStoreUiElement();
        if (playStoreUiElement != null && playStoreUiElement.f.length == 0) {
            C2482j.m13290a(this.f16664r);
        }
        this.f16654h = true;
    }

    public final void mo3391b(int i) {
        if (i == 2) {
            this.f16638B.m13379b(new C2475d(this.f16641E).m13256a(600));
        }
        this.f16641E.m13206a(false);
    }

    public final ViewGroup mo3385a(boolean z) {
        m16316b(true);
        if (this.f16664r == null) {
            if (this.f16660n) {
                this.f16668v = (ViewGroup) this.f16662p.inflate(C7582R.layout.ia2_play_recycler_view_with_scrubber, null);
                this.f16664r = (NestedParentRecyclerView) this.f16668v.findViewById(C7582R.id.tab_recycler_view);
            } else {
                this.f16664r = (NestedParentRecyclerView) this.f16662p.inflate(C7582R.layout.ia2_play_recycler_view, null);
                this.f16668v = this.f16664r;
            }
            this.f16664r.getContext();
            this.f16665s = new LinearLayoutManager();
            this.f16672z = new C3984a();
            this.f16664r.setAdapter(this.f16672z);
            this.f16664r.setLayoutManager(this.f16665s);
            int a = C1473m.f7980a.av().m9275a(this.f16663q.getResources());
            this.f16664r.m278a(new C4297g(a, a));
            if (C1473m.f7980a.bT().m11023b() == 4) {
                this.f16664r.setParentChildScrollOffset(this.f16664r.getResources().getDimensionPixelSize(C7582R.dimen.ia2_subnav_height));
            }
            if (C1473m.f7980a.ay().m9025d()) {
                if (this.f16647K == null) {
                    this.f16647K = new ag(cm.f29878b, C1473m.f7980a.cv(), this.f16638B, 1);
                }
                this.f16664r.mo2951a(this.f16647K);
            }
        }
        if (f16636a && z) {
            if (this.f16670x == null) {
                this.f16670x = new LayoutAnimationController(AnimationUtils.loadAnimation(this.f16664r.getContext(), C7582R.anim.ia2_sub_nav_page_fade_in));
                this.f16670x.setDelay(0.1f);
            }
            this.f16664r.setLayoutAnimation(this.f16670x);
            this.f16664r.setLayoutAnimationListener(this);
        } else {
            C3234j c3234j = new C3234j(this, this.f16664r);
        }
        if (this.f16669w == null) {
            this.f16669w = new C4279n();
            this.f16671y = C1473m.f7980a.co().m19665a(this.f16652f, this.f16669w, this.f16664r, this.f16663q, this.f16657k, this, this.f16638B, this.f16658l, this.f16649c, this.f16659m, null, false, null, false, false, null, this.f16666t, false);
        }
        if (this.f16653g != null) {
            this.f16669w.m19845a(this.f16653g);
        }
        C2482j.m13285a(this.f16642F, this.f16652f.f14950a.f14908a.f14885a.f12087D);
        if (this.f16660n && this.f16667u == null) {
            this.f16667u = (ScrubberView) this.f16668v.findViewById(C7582R.id.scrubber_view);
            C3117g configurator = this.f16667u.getConfigurator();
            configurator.f16075d = this.f16664r;
            configurator.f16076e = this.f16661o;
            configurator.m15964a();
            this.f16661o.m16073a(configurator);
            if (this.f16653g != null) {
                configurator.m15968b(this.f16653g);
            }
            this.f16664r.m17909a((C1062m) this);
        }
        this.f16653g = null;
        this.f16654h = false;
        return this.f16668v;
    }

    public final void mo3392b(ac acVar) {
        if (this.f16660n && this.f16667u != null) {
            C3117g configurator = this.f16667u.getConfigurator();
            this.f16661o.m16076b(configurator);
            this.f16664r.m17910b(this);
            configurator.m15963a(acVar).m15967b();
            this.f16667u = null;
        }
        if (this.f16669w != null) {
            this.f16669w.m19859b(acVar);
            this.f16669w = null;
            this.f16664r.setAdapter(this.f16672z);
        }
        if (this.f16647K != null) {
            this.f16664r.mo2952b(this.f16647K);
            this.f16647K = null;
        }
        if (this.f16664r != null) {
            this.f16664r.setLayoutAnimationListener(null);
            this.f16664r = null;
        }
        this.f16665s = null;
        this.f16672z = null;
        m16316b(false);
        if (this.f16652f != null) {
            acVar.m21688a("Ia2StreamSubNavPage.MultiDfeList", this.f16652f);
        }
        if (this.f16671y != null) {
            this.f16671y.m19660d();
            this.f16671y = null;
        }
        this.f16648b = null;
    }

    public final void mo3390b() {
        this.f16645I.mo1385a(1737, this.f16643G, this.f16644H, true);
        mo3386a();
    }

    public final boolean mo3393c() {
        return this.f16652f != null && this.f16652f.f14950a.mo2861a() && this.f16652f.f14950a.m14698m() > 0;
    }

    public final void m_() {
        if (this.f16646J) {
            this.f16645I.mo1384a(1742, this.f16643G, this.f16644H);
        }
        m16317c(1719);
        if (this.f16648b != null && this.f16654h) {
            this.f16648b.mo3394a(this.f16656j);
        }
    }

    public final void mo1062a(VolleyError volleyError) {
        FinskyLog.m21667d("Volley error while fetching sub nav DFE: %s", C1290m.m7702a(C1473m.f7980a.f7981b, volleyError));
        m16317c(1705);
        if (this.f16648b != null && this.f16654h) {
            this.f16648b.mo3395a(this.f16656j, r0);
        }
    }

    public final ce getPlayStoreUiElement() {
        return this.f16642F;
    }

    public final ad getParentNode() {
        return this.f16641E;
    }

    public final void mo1219a(ad adVar) {
        C2482j.m13291a((ad) this, adVar);
    }

    public final void onAnimationStart(Animation animation) {
    }

    public final void onAnimationEnd(Animation animation) {
        m16332e();
        m16331d();
        if (this.f16648b != null) {
            this.f16648b.mo3396b(this.f16656j);
        }
    }

    public final void onAnimationRepeat(Animation animation) {
    }

    public final void mo1356a(RecyclerView recyclerView) {
        if (this.f16667u != null) {
            this.f16667u.getConfigurator().m15965a(recyclerView);
        }
    }

    private final void m16316b(boolean z) {
        if (this.f16652f != null && z != this.f16655i) {
            C2335k c2335k = this.f16652f.f14950a;
            if (z) {
                c2335k.m11918a((C1031w) this);
                c2335k.m11917a((C0657w) this);
            } else {
                c2335k.m11922b((C1031w) this);
                c2335k.m11921b((C0657w) this);
            }
            this.f16655i = z;
        }
    }

    final void m16331d() {
        if (C1473m.f7980a.dj().mo2294a(12636210)) {
            m16318d(1704);
        } else if (this.f16639C.m13357b()) {
            this.f16640D.mo1293j(1704);
        }
    }

    private final void m16317c(int i) {
        if (C1473m.f7980a.dj().mo2294a(12636210)) {
            m16318d(i);
        }
    }

    private final void m16318d(int i) {
        if (!this.f16639C.m13357b() || !this.f16637A || this.f16656j != 0) {
            return;
        }
        if (i == 1719) {
            this.f16640D.mo1294k(i);
        } else {
            this.f16640D.mo1293j(i);
        }
    }

    final void m16332e() {
        if (this.f16646J) {
            this.f16645I.mo1393b(1738, this.f16643G, this.f16644H, true);
        }
    }
}
