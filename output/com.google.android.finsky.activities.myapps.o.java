package com.google.android.finsky.activities.myapps;

import android.content.Context;
import android.support.v4.view.ai;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.em;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.android.volley.VolleyError;
import com.google.android.finsky.api.c;
import com.google.android.finsky.api.m;
import com.google.android.finsky.aq.a;
import com.google.android.finsky.ba.d;
import com.google.android.finsky.bg.k;
import com.google.android.finsky.bg.p;
import com.google.android.finsky.cv.a.cv;
import com.google.android.finsky.d.a;
import com.google.android.finsky.d.ag;
import com.google.android.finsky.d.ai;
import com.google.android.finsky.d.j;
import com.google.android.finsky.d.o;
import com.google.android.finsky.d.t;
import com.google.android.finsky.d.w;
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
import com.google.android.finsky.frameworkviews.ah;
import com.google.android.finsky.headerlistlayout.FinskyHeaderListLayout;
import com.google.android.finsky.layoutswitcher.ErrorIndicatorWithNotifyLayout;
import com.google.android.finsky.layoutswitcher.a;
import com.google.android.finsky.layoutswitcher.d;
import com.google.android.finsky.m;
import com.google.android.finsky.navigationmanager.a;
import com.google.android.finsky.pagesystem.f;
import com.google.android.finsky.recyclerview.PlayRecyclerView;
import com.google.android.finsky.recyclerview.a;
import com.google.android.finsky.stream.a.b;
import com.google.android.finsky.stream.a.d;
import com.google.android.finsky.stream.base.n;
import com.google.android.finsky.stream.base.s;
import com.google.android.finsky.stream.base.view.g;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.ac;
import com.google.android.libraries.performance.primes.cm;
import com.google.android.play.headerlist.PlayHeaderListLayout;
import com.google.wireless.android.a.a.a.a.ce;
import java.util.List;

public final class com.google.android.finsky.activities.myapps.o implements View$OnClickListener, com.android.volley.w, com.google.android.finsky.activities.gt, com.google.android.finsky.d.y, com.google.android.finsky.dfemodel.w
{

    public final Context a;
    public final LayoutInflater b;
    public final com.google.android.finsky.api.c c;
    public final DfeToc d;
    public final com.google.android.finsky.frameworkviews.ah e;
    public final com.google.android.finsky.navigationmanager.a f;
    public final com.google.android.finsky.d.w g;
    public final com.google.android.finsky.d.ai h;
    public final com.google.android.finsky.d.a i;
    public boolean j;
    public FinskyHeaderListLayout k;
    public PlayRecyclerView l;
    public ScrubberView m;
    public com.google.android.finsky.stream.base.n n;
    public ViewGroup o;
    public com.google.android.finsky.utils.ac p;
    public com.google.android.finsky.dfemodel.j q;
    public com.google.android.finsky.dfemodel.u r;
    public VolleyError s;
    public com.google.android.finsky.stream.a.b t;
    public String u;
    public com.google.android.finsky.pagesystem.f v;
    public com.google.android.finsky.d.ag w;
    public com.google.android.finsky.bg.p x;
    public boolean y;
    public final boolean z;

    o(Context p0, String p1, com.google.android.finsky.api.c p2, com.google.android.finsky.dfemodel.u p3, DfeToc p4, com.google.android.finsky.navigationmanager.a p5, com.google.android.finsky.frameworkviews.ah p6, FinskyHeaderListLayout p7, boolean p8, com.google.android.finsky.d.ai p9, com.google.android.finsky.d.w p10, com.google.android.finsky.pagesystem.f p11) {
        this.i = com.google.android.finsky.m.a.aR();
        com.google.android.finsky.m.a.aO();
        this.j = 0;
        this.p = 0;
        this.a = p0;
        this.b = LayoutInflater.from(p0);
        this.c = p2;
        this.d = p4;
        this.e = p6;
        this.f = p5;
        this.g = p10;
        this.u = p1;
        this.h = p9;
        this.v = p11;
        this.r = p3;
        if (this.r != 0)
            this.q = (com.google.android.finsky.dfemodel.j)this.r.a;
        this.k = p7;
        this.z = p8;
    }

    private final void a(int p0) {
        v0 = (MyAppsEmptyView)this.a().findViewById(2131755302);
        if (v0 != 0) {
            v0.a(this.d, this.f, 1, p0, this.i.a(0));
            v1 = this.o.findViewById(2131756291);
            if ((PlayRecyclerView)v1 != 0)
                ((PlayRecyclerView)v1).setEmptyView(v0);
        }
    }

    private final void f() {
        if (this.q == 0) {
            this.q = com.google.android.finsky.dfemodel.l.a(this.c, this.u);
            this.r = com.google.android.finsky.dfemodel.l.a(this.q);
        }
        this.q.a(this);
        this.q.a(this);
        this.q.n();
    }

    private final boolean g() {
        if (this.q != 0 && this.q.a())
            v0 = 1;
        else
            v0 = 0;
        return v0;
    }

    private final void h() {
        v1 = this.a();
        v2 = v1.findViewById(2131756116);
        v3 = v1.findViewById(2131756064);
        v0 = (ErrorIndicatorWithNotifyLayout)v1.findViewById(2131756336);
        v1 = (PlayRecyclerView)v1.findViewById(2131756291);
        if (this.s != 0) {
            com.google.android.finsky.layoutswitcher.a.a(v3, v0, this, com.google.android.finsky.m.a.u().a(), com.google.android.finsky.api.m.a(com.google.android.finsky.m.a.b, this.s));
            v2.setVisibility(8);
            v1.setVisibility(8);
        }
        else if (this.g()) {
            v1.setVisibility(0);
            v3.setVisibility(8);
            v0.setVisibility(8);
            v2.setVisibility(8);
        }
        else {
            v2.setVisibility(0);
            v3.setVisibility(8);
            v0.setVisibility(8);
            v1.setVisibility(8);
        }
    }

    public final View a() {
        if (this.o == 0) {
            if (this.z != 0)
                v0 = 2130969122;
            else
                v0 = 2130969121;
            this.o = (ViewGroup)this.b.inflate(v0, 0);
            this.l = (PlayRecyclerView)this.o.findViewById(2131756291);
            android.support.v4.view.ai.a(this.l, 0, this.l.getPaddingTop(), 0, this.l.getPaddingBottom());
            this.l.setSaveEnabled(0);
            this.l.setAdapter(new com.google.android.finsky.recyclerview.a());
            v0 = com.google.android.finsky.m.a.av().a(this.a.getResources());
            this.l.a(new com.google.android.finsky.stream.base.view.g(v0, v0));
            if (com.google.android.finsky.m.a.ay().d()) {
                if (this.w == 0)
                    this.w = new com.google.android.finsky.d.ag(com.google.android.libraries.performance.primes.cm.b, com.google.android.finsky.m.a.cv(), this.g, 3);
                this.l.a(this.w);
            }
            if (this.z != 0) {
                this.m = (ScrubberView)this.o.findViewById(2131755429);
                v0 = this.m.getConfigurator();
                v0.d = this.l;
                v0.e = this.k;
                v0.a();
            }
        }
        return this.o;
    }

    public final void a(VolleyError p0) {
        this.s = p0;
        this.h();
    }

    public final void a(com.google.android.finsky.utils.ac p0) {
        this.p = p0;
    }

    public final void a(boolean p0) {
        this.j = p0;
        this.h.a(1);
    }

    public final com.google.android.finsky.utils.ac b() {
        if (this.z != 0) {
            this.m.getConfigurator().b();
            this.m = 0;
        }
        v1 = new com.google.android.finsky.utils.ac();
        if (this.n != 0 && this.n.a() > 0) {
            this.n.b(v1);
            this.n = 0;
        }
        if (this.t != 0) {
            this.t.d();
            this.t = 0;
        }
        if (this.w != 0) {
            this.l.b(this.w);
            this.w = 0;
        }
        this.l = 0;
        if (this.o instanceof PlayHeaderListLayout)
            ((PlayHeaderListLayout)this.o).f();
        if (this.q != 0) {
            this.q.b(this);
            this.q.b(this);
        }
        com.google.android.finsky.dfemodel.x.a(this.q);
        return v1;
    }

    final void c() {
        this.f();
        if (this.g())
            this.m_();
    }

    public final void d() {
        if (!this.g()) {
            this.y = 1;
            return;
        }
        if (this.n == 0)
            this.y = 1;
        else {
            v1 = new Object[1];
            v1[0] = Integer.valueOf(this.h.getPlayStoreUiElement().c);
            FinskyLog.b("Attempting to trigger UpdateAll on MyApps tab %d", v1);
            v1 = 0;
            while (v1 < this.n.d.size()) {
                v0 = (com.google.android.finsky.stream.base.s)this.n.d.get(v1);
                if (v0 instanceof com.google.android.finsky.activities.myapps.q) {
                    ((com.google.android.finsky.activities.myapps.q)v0).cb_();
                    this.y = 0;
                    return;
                }
                v1 = v1 + 1;
            }
            v1 = new Object[1];
            v1[0] = Integer.valueOf(this.h.getPlayStoreUiElement().c);
            FinskyLog.b("Couldn't find MyAppsUpdatesClusterController on MyApps tab %d", v1);
        }
    }

    public final void e() {
        if (this.v != 0) {
            if (this.j != 0) {
                this.v.k(1719);
                if (this.x == 0 && this.l != 0 && com.google.android.finsky.m.a.aP().b())
                    this.x = new com.google.android.finsky.activities.myapps.p(this, this.l);
            }
            else {
                this.v.j(1706);
                this.v = 0;
            }
        }
    }

    public final void m_() {
        if (this.q.a()) {
            this.s = 0;
            if (this.l == 0)
                FinskyLog.c("Recycler view null, ignoring.", new Object[0]);
            else {
                if (this.n == 0) {
                    this.n = new com.google.android.finsky.stream.base.n();
                    com.google.android.finsky.m.a.h(com.google.android.finsky.m.a.cZ());
                    if (this.v == 0)
                        v17 = 0;
                    else
                        v17 = this;
                    this.t = com.google.android.finsky.m.a.co().a(this.r, this.n, this.l, this.a, this.f, this.h, this.g, 0, 0, this.e, 0, 0, 0, 0, 0, v17, 0, 0);
                    this.q.b(this);
                    this.q.b(this);
                    if (this.p != 0)
                        this.n.a(this.p);
                }
                if (com.google.android.finsky.m.a.M().a())
                    this.a(2131953509);
                else
                    this.a(2131952110);
            }
            this.h();
            if (this.q.a != 0)
                com.google.android.finsky.d.j.a(this.h.getPlayStoreUiElement(), this.q.a.a.D);
            if (this.y != 0)
                this.d();
        }
    }

    public final void onClick(View p0) {
        if (this.q != 0 && this.q.h()) {
            this.s = 0;
            this.q.ac_();
            this.q.q();
        }
        else {
            if (this.q != 0) {
                this.q.b(this);
                this.q.b(this);
                this.q = 0;
            }
            this.f();
        }
    }

}
