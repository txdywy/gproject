package com.google.android.finsky.activities;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build$VERSION;
import android.support.v4.view.b.b;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.ff;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LayoutAnimationController;
import android.widget.TextView;
import com.android.volley.VolleyError;
import com.google.android.finsky.adapters.j;
import com.google.android.finsky.adapters.m;
import com.google.android.finsky.api.c;
import com.google.android.finsky.api.m;
import com.google.android.finsky.aq.a;
import com.google.android.finsky.ba.c;
import com.google.android.finsky.ba.d;
import com.google.android.finsky.ba.e;
import com.google.android.finsky.be.f;
import com.google.android.finsky.be.g;
import com.google.android.finsky.bg.k;
import com.google.android.finsky.bg.l;
import com.google.android.finsky.cv.a.bd;
import com.google.android.finsky.cv.a.cv;
import com.google.android.finsky.cv.a.dd;
import com.google.android.finsky.cv.a.ko;
import com.google.android.finsky.d.ad;
import com.google.android.finsky.d.ag;
import com.google.android.finsky.d.ai;
import com.google.android.finsky.d.al;
import com.google.android.finsky.d.j;
import com.google.android.finsky.d.o;
import com.google.android.finsky.d.t;
import com.google.android.finsky.d.w;
import com.google.android.finsky.detailscomponents.g;
import com.google.android.finsky.dfemodel.DfeToc;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.dfemodel.a;
import com.google.android.finsky.dfemodel.j;
import com.google.android.finsky.dfemodel.k;
import com.google.android.finsky.dfemodel.l;
import com.google.android.finsky.dfemodel.u;
import com.google.android.finsky.dfemodel.x;
import com.google.android.finsky.fastscroll.ScrubberView;
import com.google.android.finsky.fastscroll.n;
import com.google.android.finsky.frameworkviews.SpacerHeightAwareFrameLayout;
import com.google.android.finsky.frameworkviews.ah;
import com.google.android.finsky.frameworkviews.d;
import com.google.android.finsky.headerlistlayout.FinskyHeaderListLayout;
import com.google.android.finsky.layoutswitcher.e;
import com.google.android.finsky.m;
import com.google.android.finsky.navigationmanager.a;
import com.google.android.finsky.nestedrecyclerviews.NestedParentRecyclerView;
import com.google.android.finsky.pagesystem.f;
import com.google.android.finsky.pagesystem.g;
import com.google.android.finsky.playcard.l;
import com.google.android.finsky.recyclerview.PlayRecyclerView;
import com.google.android.finsky.recyclerview.a;
import com.google.android.finsky.stream.a.b;
import com.google.android.finsky.stream.a.d;
import com.google.android.finsky.stream.base.n;
import com.google.android.finsky.stream.base.view.g;
import com.google.android.finsky.utils.ac;
import com.google.android.finsky.utils.p;
import com.google.android.finsky.y.a;
import com.google.android.libraries.performance.primes.cm;
import com.google.android.play.image.FifeImageView;
import com.google.android.play.image.w;
import com.google.wireless.android.a.a.a.a.ce;
import com.google.wireless.android.finsky.dfe.nano.ab;
import java.util.List;

public final class com.google.android.finsky.activities.ek implements com.android.volley.w, com.google.android.finsky.activities.gt, com.google.android.finsky.d.ad, com.google.android.finsky.dfemodel.w, com.google.android.finsky.layoutswitcher.h, com.google.android.finsky.nestedrecyclerviews.a.m
{

    public static final boolean a;
    public boolean A;
    public final int B;
    public final com.google.android.finsky.activities.gm C;
    public com.google.android.finsky.activities.eo D;
    public boolean E;
    public final boolean F;
    public com.google.android.finsky.pagesystem.f G;
    public com.google.android.finsky.d.ag H;
    public boolean I;
    public final FinskyHeaderListLayout J;
    public ScrubberView K;
    public byte[] L;
    public com.google.android.finsky.d.al M;
    public final boolean N;
    public final boolean O;
    public final android.support.v7.widget.ff P;
    public final int b;
    public final com.google.android.finsky.dfemodel.u c;
    public final LayoutInflater d;
    public final com.google.android.finsky.frameworkviews.ah e;
    public final com.google.android.finsky.ba.c f;
    public final com.google.android.finsky.d.w g;
    public final com.google.android.finsky.d.t h;
    public com.google.android.finsky.be.f i;
    public ViewGroup j;
    public com.google.android.finsky.layoutswitcher.e k;
    public com.google.android.finsky.utils.ac l;
    public boolean m;
    public Document n;
    public boolean o;
    public com.google.android.finsky.dfemodel.j p;
    public final DfeToc q;
    public final com.google.android.finsky.api.c r;
    public final com.google.android.finsky.navigationmanager.a s;
    public final com.google.android.finsky.pagesystem.g t;
    public final com.google.android.finsky.y.a u;
    public final com.google.android.finsky.detailscomponents.g v;
    public final ag[] w;
    public final int x;
    public com.google.wireless.android.a.a.a.a.ce y;
    public com.google.android.finsky.d.ai z;

    static {
        if (Build$VERSION.SDK_INT >= 16)
            v0 = 1;
        else
            v0 = 0;
        com.google.android.finsky.activities.ek.a = v0;
    }

    ek(Context p0, com.google.android.finsky.ba.c p1, com.google.android.finsky.bg.k p2, com.google.android.finsky.navigationmanager.a p3, com.google.android.play.image.w p4, com.google.android.finsky.api.c p5, LayoutInflater p6, com.google.android.finsky.activities.gl p7, DfeToc p8, com.google.android.finsky.y.a p9, com.google.android.finsky.detailscomponents.g p10, boolean p11, int p12, com.google.android.finsky.activities.gm p13, com.google.android.finsky.frameworkviews.ah p14, com.google.android.finsky.d.w p15, com.google.android.finsky.dfemodel.j p16, boolean p17, com.google.android.finsky.pagesystem.f p18, android.support.v7.widget.ff p19, FinskyHeaderListLayout p20, boolean p21, com.google.android.finsky.pagesystem.g p22, com.google.android.finsky.activities.eo p23, com.google.android.finsky.d.al p24) {
        this.h = com.google.android.finsky.m.a.aP();
        this.m = 0;
        this.y = com.google.android.finsky.d.j.a(408);
        v3 = p0.getResources();
        this.d = p6;
        this.f = p1;
        this.c = p7.b;
        this.w = p7.a.e;
        this.z = p7.f;
        this.g = p15;
        this.b = v3.getInteger(2131820575);
        this.F = p17;
        this.G = p18;
        this.t = p22;
        this.J = p20;
        this.L = p7.a.d;
        this.M = p24;
        this.N = this.f.dj().a(12637322);
        this.O = this.f.dj().a(12644322);
        this.P = p19;
        this.c.a.a(this);
        this.c.a.a(this);
        this.A = p11;
        if (p3.g() == 1)
            v2 = 1;
        else
            v2 = 0;
        this.E = v2;
        this.a(this.c.a);
        this.q = p8;
        this.s = p3;
        this.r = p5;
        this.u = p9;
        this.v = p10;
        this.B = p12;
        this.C = p13;
        this.e = p14;
        this.p = p16;
        if (this.p != 0) {
            this.p.n();
            this.p.a(this);
            this.p.a(this);
        }
        this.D = p23;
        this.i = new com.google.android.finsky.be.f(this.u, this.v, this.g, p19);
        if (this.i.l != p0) {
            this.i.l = p0;
            this.i.m = this.s;
            this.i.n = p4;
            this.i.o = 0;
        }
        this.I = p21;
        this.x = p2.a(v3);
    }

    private final void a(com.google.android.finsky.dfemodel.a p0) {
        if (this.N != 0)
            this.M.a(1741, this.L, 0);
        p0.n();
    }

    private final void a(PlayRecyclerView p0, boolean p1) {
        if (this.E != 0)
            new com.google.android.finsky.activities.en(this, p0, p1);
    }

    private final void b(int p0) {
        ((SpacerHeightAwareFrameLayout)this.j.findViewById(p0)).setSpacerHeightProvider(this.e);
    }

    private final void e() {
  4:    if (this.j == 0)
  6:        return;
 17:    if (this.c.a.h()) {
 34:        if (this.f.dj().a(12636210))
 40:            this.a(1705);
 47:        if (this.m == 0)
 66:            this.k.a(1, com.google.android.finsky.api.m.a(com.google.android.finsky.m.a.b, this.c.a.g()));
 69:        return;
        }
 74:    if (this.A != 0) {
974:        this.k.a(0, 0);
977:        return;
        }
 80:    if (!this.c.a.a()) {
974:        this.k.a(0, 0);
977:        return;
        }
 86:    if (this.p != 0 && (!this.p.a())) {
974:        this.k.a(0, 0);
977:        return;
        }
102:    if (this.n == 0)
108:        this.n = this.c.a.a;
114:    if (this.n != 0)
128:        com.google.android.finsky.d.j.a(this.y, this.n.a.D);
135:    this.k.a();
142:    if (this.m != 0) {
507:        if (this.f.dj().a(12632600) && !this.f.dj().a(12641966))
537:            this.j.post(new com.google.android.finsky.activities.el(this));
540:        return;
        }
152:    this.i.a(this.c);
201:    this.i.a = this.j;
205:    this.i.k = this.C;
218:    this.i.e = (PlayRecyclerView)this.j.findViewById(2131755428);
229:    this.i.e.setLayoutManager(new LinearLayoutManager());
232:    if (this.n == 0) goto 267;
238:    if (this.n.a() != 0) goto 549;
240:    if (this.w != 0) {
243:        if (this.w.length == 0 && (this.i.o == 0 || ((com.google.android.finsky.dfemodel.j)((com.google.android.finsky.dfemodel.u)this.i.o).a).m() == 0)) {
274:            v5 = this.i.a.findViewById(2131755302);
278:            if (v5 != 0) {
287:                v2 = (FifeImageView)v5.findViewById(2131755779);
289:                if (this.n != 0 && this.n.d(4)) {
308:                    v3 = (com.google.android.finsky.cv.a.bd)this.n.c(4).get(0);
320:                    com.google.android.finsky.m.a.ar().a(v2, v3.f, v3.i);
324:                    v2.setVisibility(0);
                    }
                    else
544:                    v2.setVisibility(8);
327:                if (this.n != 0 && this.n.aS()) {
341:                    v3 = this.n.bg().k.b;
347:                    if (!TextUtils.isEmpty(v3))
362:                        ((TextView)v5.findViewById(2131755780)).setText(com.google.android.finsky.utils.p.a(v3));
                    }
369:                this.i.e.setEmptyView(v5);
                }
            }
            else {
553:            if (this.i.f != 0)
560:                this.i.e.setEmptyView(0);
                else
721:                this.i.e.setEmptyView(this.i.a.findViewById(2131755302));
573:            if (this.n.a() > 0 && this.n.a(0).aC())
586:                v2 = 1;
                else
726:                v2 = 0;
587:            if (v2 == 0 || com.google.android.finsky.m.a.dj().a(12637756))
598:                v2 = 1;
                else
729:                v2 = 0;
599:            if (v2 != 0) {
608:                this.i.c = new com.google.android.finsky.stream.base.n();
666:                this.i.d = com.google.android.finsky.m.a.co().a((com.google.android.finsky.dfemodel.u)this.i.o, this.i.c, this.i.e, this.i.l, this.i.m, this, this.i.i, this.B, this.w, this.e, 0, 0, this.p, 0, 0, 0, this.i.j, 0);
676:                this.i.e.setAdapter(this.i.c);
683:                if (this.i.k != 0)
690:                    this.i.k.a(0);
693:                if (this.l != 0)
701:                    this.i.c.a(this.l);
                }
                else {
764:                com.google.android.finsky.m.a.aO();
773:                this.i.a(com.google.android.finsky.dfemodel.l.a(((com.google.android.finsky.dfemodel.u)this.i.o).a(((com.google.android.finsky.dfemodel.u)this.i.o).a(0).a.c)));
787:                this.i.e.getRecycledViewPool().a(6, 20);
791:                this.i.e.setScrollingTouchSlop(1);
806:                this.i.e.a(new com.google.android.finsky.frameworkviews.d(this.i.e.getContext(), 2131558657));
814:                this.i.e.a(new com.google.android.finsky.playcard.l());
821:                if (this.i.b != 0)
827:                    this.i.b.h();
830:                if (this.l != 0)
832:                    v9 = 1;
                    else
918:                    v9 = 0;
869:                this.i.b = new com.google.android.finsky.adapters.j(this.i.l, this.i.m, this.i.n, this.i.g, this.n.a(0), (com.google.android.finsky.dfemodel.u)this.i.o, v9, this, this.g, this.i.h);
879:                this.i.e.setAdapter(this.i.b);
886:                if (this.i.k != 0)
896:                    this.i.k.a(this.i.b);
899:                if (this.l != 0)
913:                    this.i.b.b(this.i.e, this.l.c);
                }
            }
        }
383:    v2 = (PlayRecyclerView)this.j.findViewById(2131755428);
389:    if (this.l != 0) goto 940;
393:    if (com.google.android.finsky.activities.ek.a == 0) goto 920;
399:    if (this.O != 0) {
405:        if (this.o != 0 && !com.google.android.finsky.m.a.M().a()) {
426:            v3 = AnimationUtils.loadAnimation(v2.getContext(), 2131034151);
435:            v3.setInterpolator(new android.support.v4.view.b.b());
443:            v3.setDuration((long)this.b);
448:            v4 = new LayoutAnimationController(v3);
454:            v4.setDelay(1036831949);
457:            v2.setLayoutAnimation(v4);
464:            if (this.o != 0 && this.E != 0)
479:                v3.setAnimationListener(new com.google.android.finsky.activities.em(this));
            }
924:        else if (this.O != 0 || this.o != 0)
935:            this.a(v2, 1);
        }
485:    this.l = 0;
490:    this.m = 1;
507:    if (this.f.dj().a(12632600) && !this.f.dj().a(12641966))
537:        this.j.post(new com.google.android.finsky.activities.el(this));
540:    return;
944:    if (this.o != 0)
963:        this.a(v2, this.f.dj().a(12641817));
966:    goto 482;
    }

    public final View a() {
        if (this.j == 0) {
            if (!this.f.dj().a(12633494)) {
                if (this.I != 0) {
                    if (com.google.android.finsky.m.a.dj().a(12638391))
                        v0 = 2130969129;
                    else
                        v0 = 2130969128;
                }
                else
                    v0 = 2130969127;
                this.j = (ViewGroup)this.d.inflate(v0, 0);
            }
            else
                this.j = (ViewGroup)this.d.inflate(2130969328, 0);
            this.b(2131756116);
            this.b(2131756064);
            this.b(2131756336);
            this.k = new com.google.android.finsky.layoutswitcher.e(this.j, 2131756047, 2131756116, this, 0);
            v0 = (PlayRecyclerView)this.j.findViewById(2131755428);
            v0.getContext();
            v0.setLayoutManager(new LinearLayoutManager());
            v0.setAdapter(new com.google.android.finsky.recyclerview.a());
            if (this.f.dj().a(12642058))
                v0.setRecycledViewPool(this.P);
            v0.a(new com.google.android.finsky.stream.base.view.g(this.x, this.x));
            if (com.google.android.finsky.m.a.ay().d() && this.E != 0) {
                if (this.H == 0)
                    this.H = new com.google.android.finsky.d.ag(com.google.android.libraries.performance.primes.cm.b, com.google.android.finsky.m.a.cv(), this.g, 1);
                v0.a(this.H);
            }
            if (this.I != 0) {
                this.K = (ScrubberView)this.j.findViewById(2131755429);
                v1 = this.K.getConfigurator();
                v1.d = v0;
                v1.e = this.J;
                v1.a();
                this.J.a(v1);
                if (this.l != 0)
                    v1.b(this.l);
                if (v0 instanceof NestedParentRecyclerView)
                    ((NestedParentRecyclerView)v0).a(this);
            }
            this.e();
        }
        return this.j;
    }

    final void a(int p0) {
        if (this.h.b() && this.F != 0) {
            if (p0 == 1719)
                this.G.k(p0);
            else
                this.G.j(p0);
        }
    }

    public final void a(RecyclerView p0) {
        if (this.K != 0)
            this.K.getConfigurator().a(p0);
    }

    public final void a(VolleyError p0) {
        if (this.p != 0 && this.p.h()) {
            this.p.b(this);
            this.p.b(this);
            this.p = 0;
        }
        this.e();
    }

    public final void a(com.google.android.finsky.d.ad p0) {
        com.google.android.finsky.d.j.a(this, p0);
    }

    public final void a(com.google.android.finsky.utils.ac p0) {
        if (p0 != 0)
            this.l = p0;
    }

    public final void a(boolean p0) {
        if (p0 != this.o) {
            if (p0 != 0) {
                if (!this.c.a.a() && !this.c.a.r())
                    this.a(this.c.a);
                com.google.android.finsky.d.j.c(this.z);
                this.z.a(1);
                if (this.z.getPlayStoreUiElement().f.length == 0)
                    com.google.android.finsky.d.j.a(this.j);
            }
            else
                this.z.a(0);
            this.o = p0;
        }
    }

    public final com.google.android.finsky.utils.ac b() {
        if (this.j != 0) {
            v0 = (PlayRecyclerView)this.j.findViewById(2131755428);
            v2 = new com.google.android.finsky.utils.ac();
            if (this.I != 0) {
                v4 = this.K.getConfigurator();
                this.J.b(v4);
                if (v0 instanceof NestedParentRecyclerView)
                    ((NestedParentRecyclerView)v0).b(this);
                v4.a(v2).b();
                this.K = 0;
                this.K = 0;
            }
            if (this.H != 0) {
                v0.b(this.H);
                this.H = 0;
            }
            if (this.i.b != 0) {
                this.i.b.a(v0, v2.c);
                this.i.b.h();
                this.i.b = 0;
            }
            if (this.i.c != 0) {
                this.i.c.b(v2);
                this.i.c = 0;
            }
            if (this.i.d != 0) {
                this.i.d.d();
                this.i.d = 0;
            }
            this.i.a();
            this.i.e = 0;
            v0 = v2;
        }
        else
            v0 = 0;
        this.c.a.b(this);
        this.c.a.b(this);
        this.j = 0;
        this.m = 0;
        if (this.p != 0) {
            this.p.b(this);
            this.p.b(this);
        }
        return v0;
    }

    public final void c() {
        this.A = 0;
        this.e();
    }

    public final com.google.android.finsky.d.ad getParentNode() {
        return this.z;
    }

    public final com.google.wireless.android.a.a.a.a.ce getPlayStoreUiElement() {
        return this.y;
    }

    public final void m_() {
        if (!this.c.a.h() && this.c.a.a() && (this.p == 0 || this.p.a()))
            v0 = 1;
        else
            v0 = 0;
        if (this.N != 0 && v0 != 0)
            this.M.a(1742, this.L, 0);
        if (this.f.dj().a(12636210) && v0 != 0)
            this.a(1719);
        this.e();
    }

    public final void n_() {
        this.c.a.ac_();
        this.c.a.l = 0;
        this.a(this.c.a);
        this.e();
    }

}
