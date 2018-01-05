package com.google.android.finsky.activities;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.net.Uri$Builder;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.transition.Fade;
import android.transition.Transition;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.android.volley.VolleyError;
import com.google.android.finsky.a.c;
import com.google.android.finsky.adapters.CardRecyclerViewAdapter;
import com.google.android.finsky.adapters.m;
import com.google.android.finsky.api.c;
import com.google.android.finsky.api.l;
import com.google.android.finsky.as.a;
import com.google.android.finsky.ba.c;
import com.google.android.finsky.ba.d;
import com.google.android.finsky.ba.e;
import com.google.android.finsky.bg.a;
import com.google.android.finsky.bg.k;
import com.google.android.finsky.bg.p;
import com.google.android.finsky.ct.a;
import com.google.android.finsky.cv.a.cv;
import com.google.android.finsky.d.ad;
import com.google.android.finsky.d.ag;
import com.google.android.finsky.d.c;
import com.google.android.finsky.d.j;
import com.google.android.finsky.d.o;
import com.google.android.finsky.d.p;
import com.google.android.finsky.d.t;
import com.google.android.finsky.d.w;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.dfemodel.a;
import com.google.android.finsky.dfemodel.j;
import com.google.android.finsky.dfemodel.k;
import com.google.android.finsky.dfemodel.l;
import com.google.android.finsky.dfemodel.o;
import com.google.android.finsky.dfemodel.x;
import com.google.android.finsky.fastscroll.ScrubberView;
import com.google.android.finsky.fastscroll.n;
import com.google.android.finsky.headerlistlayout.FinskyHeaderListLayout;
import com.google.android.finsky.headerlistlayout.i;
import com.google.android.finsky.layout.actionbar.a;
import com.google.android.finsky.layoutswitcher.e;
import com.google.android.finsky.m;
import com.google.android.finsky.pagesystem.ContentFrame;
import com.google.android.finsky.pagesystem.b;
import com.google.android.finsky.pagesystem.e;
import com.google.android.finsky.recyclerview.PlayRecyclerView;
import com.google.android.finsky.search.d;
import com.google.android.finsky.stream.a.b;
import com.google.android.finsky.stream.a.d;
import com.google.android.finsky.stream.base.n;
import com.google.android.finsky.stream.base.view.g;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.ac;
import com.google.android.finsky.y.a;
import com.google.android.libraries.performance.primes.cm;
import com.google.android.play.headerlist.PlayHeaderListLayout;
import com.google.wireless.android.a.a.a.a.cb;
import com.google.wireless.android.a.a.a.a.ce;
import com.google.wireless.android.finsky.dfe.nano.ga;

public final class com.google.android.finsky.activities.ge extends com.google.android.finsky.pagesystem.b
{

    public com.google.android.finsky.dfemodel.o a;
    public String ag;
    public String ah;
    public int ai;
    public int aj;
    public int ak;
    public boolean al;
    public boolean am;
    public boolean an;
    public boolean ao;
    public boolean ap;
    public ScrubberView aq;
    public Button ar;
    public com.google.android.finsky.d.ad as;
    public Bundle at;
    public com.google.android.finsky.utils.ac au;
    public com.google.wireless.android.a.a.a.a.ce av;
    public com.google.android.finsky.bg.p aw;
    public com.google.android.finsky.d.ag ax;
    public PlayRecyclerView c;
    public CardRecyclerViewAdapter e;
    public com.google.android.finsky.stream.base.n f;
    public com.google.android.finsky.stream.a.b g;
    public com.google.android.finsky.y.a h;
    public com.google.android.finsky.ba.c n_;
    public com.google.android.finsky.dfemodel.j q_;

    ge() {
        com.google.android.finsky.pagesystem.b();
        this.am = 0;
        this.at = new Bundle();
        this.av = com.google.android.finsky.d.j.a(3);
    }

    private final String a(String p0) {
        if (this.ao != 0) {
            v0 = Uri.parse(p0).buildUpon();
            v0.appendQueryParameter("fss", Boolean.toString(this.ao));
            p0 = v0.build().toString();
        }
        return p0;
    }

    private final void aj() {
        if (this.a != 0) {
            this.a.a(this);
            this.a.a(this);
        }
        if (this.q_ != 0) {
            this.q_.a(this);
            this.a.a(this);
        }
    }

    private final void ao() {
        if (!this.ap())
            FinskyLog.e("RecyclerView null, ignoring.", new Object[0]);
        else {
            if (this.e == 0 && this.f == 0) {
                if (this.a.d == 0 || this.a.d.e.length == 0)
                    v1 = 0;
                else
                    v1 = this.a.d.e;
                com.google.android.finsky.d.j.a(this.av, v1);
                if (this.q_.a != 0)
                    v1 = this.q_.a.a.D;
                else
                    v1 = 0;
                v7 = new com.google.android.finsky.d.o(408, v1, this);
                this.a(v7);
                com.google.android.finsky.m.a.aO();
                this.f = new com.google.android.finsky.stream.base.n();
                this.g = com.google.android.finsky.m.a.co().a(com.google.android.finsky.dfemodel.l.a(this.q_), this.f, this.c, this.bn, this.bp, v7, this.bw, 2, 0, 0, this.a, this.ao, 0, 0, 0, 0, 0, 0);
                this.q_.b(this);
                this.q_.b(this);
                if (this.au != 0) {
                    if (this.ap != 0)
                        this.aq.getConfigurator().b(this.au);
                    this.f.a(this.au);
                }
            }
            this.c.setEmptyView(this.bt.findViewById(2131755302));
        }
    }

    private final boolean ap() {
        if (this.a != 0 && this.a.a() && this.q_ != 0 && this.q_.a())
            v0 = 1;
        else
            v0 = 0;
        return v0;
    }

    protected final int Z() {
        return 2130968962;
    }

    public final View a(LayoutInflater p0, ViewGroup p1, Bundle p2) {
        ((FinskyHeaderListLayout)this.bt).a(new com.google.android.finsky.activities.gf(this, ((FinskyHeaderListLayout)this.bt).getContext()));
        this.c = (PlayRecyclerView)this.bt.findViewById(2131756676);
        if (this.ap != 0) {
            this.aq = (ScrubberView)this.bt.findViewById(2131756678);
            v2 = this.aq.getConfigurator();
            v2.d = this.c;
            v2.e = (FinskyHeaderListLayout)this.bt;
            v2.a();
        }
        if (this.i().getBoolean(2131492898) && this.n_.dj().a(12638742))
            v1 = com.google.android.finsky.bg.k.b(this.i());
        else
            v1 = com.google.android.finsky.m.a.av().a(this.i());
        this.c.a(new com.google.android.finsky.stream.base.view.g(v1, v1));
        return (ContentFrame)super.a(p0, p1, p2);
    }

    protected final com.google.android.finsky.layoutswitcher.e a(ContentFrame p0) {
        return new com.google.android.finsky.headerlistlayout.i(p0, this, 0);
    }

    public final void a(VolleyError p0) {
        com.google.android.finsky.search.d.a(523, p0, this.bw);
        super.a(p0);
    }

    protected final void aa() {
        if (this.a == 0) {
            this.a = new com.google.android.finsky.dfemodel.o(this.bo, this.ag, this.ah);
            if (this.an == 0) {
                if (this.n_.dj().a(12634278)) {
                    v0 = new com.google.android.finsky.d.c(550);
                    v0.a(this.ag, this.ah, this.ai, this.aj);
                    this.bw.a(v0.a, 0);
                }
                else {
                    v0 = com.google.android.finsky.d.j.h();
                    if (this.ag != 0) {
                        if (this.ag == 0)
                            throw new NullPointerException();
                        v0.a = v0.a | 1;
                        v0.b = this.ag;
                    }
                    if (this.ah != 0) {
                        if (this.ah == 0)
                            throw new NullPointerException();
                        v0.a = v0.a | 2;
                        v0.c = this.ah;
                    }
                    this.bw.a(v0);
                }
                this.an = 1;
            }
        }
        if (!this.a.a()) {
            this.aj();
            this.a.a.b(this.a.c, this.a, this.a);
            this.k(1718);
        }
        else {
            if (this.q_ == 0) {
                com.google.android.finsky.m.a.aO();
                this.q_ = com.google.android.finsky.dfemodel.l.a(this.bo, this.a.d.b);
            }
            this.q_.n();
            this.aj();
        }
    }

    public final int ab() {
        if (this.q_ != 0 && this.q_.c()) {
            if (this.q_.c())
                v0 = this.q_.a.a.f;
            else
                v0 = 0;
        }
        else
            v0 = this.aj;
        return v0;
    }

    public final void ac() {
        v2 = this.ab();
        if (v2 == 3 && this.ag.startsWith("pub:")) {
            v4 = new Object[1];
            v4[0] = this.ag.replaceFirst("pub:", "");
            this.bm.c(this.bn.getResources().getString(2131951711, v4));
        }
        else {
            v3 = this.i();
            if (v3.getBoolean(2131492903))
                v0 = 2131953096;
            else
                v0 = 2131953095;
            v5 = new Object[1];
            v5[0] = this.ag;
            this.bm.c(v3.getString(v0, v5));
        }
        this.bm.a(v2, this.ad(), 1);
        this.bm.c(2);
        ((MainActivity)this.bm).U.b(this.ag);
    }

    public final int ad() {
        if (this.q_ != 0 && this.q_.e())
            v0 = this.q_.d();
        else
            v0 = this.ak;
        return v0;
    }

    protected final Transition ae() {
        return new Fade().setDuration(400);
    }

    public final int af() {
        return this.i().getColor(2131558767);
    }

    public final void b(Bundle p0) {
        super.b(p0);
        this.i(4);
        this.n_ = com.google.android.finsky.m.a.aN();
        if (this.n_.dj().a(12638373) && com.google.android.finsky.m.a.P().h != 0)
            v0 = 1;
        else
            v0 = 0;
        this.ap = v0;
        this.al = this.n_.dj().a(12607553);
        this.h = com.google.android.finsky.m.a.h(com.google.android.finsky.m.a.cZ());
        this.ao = this.h.e;
        this.ag = this.q.getString("SearchFragment.query");
        this.ah = this.a(this.q.getString("SearchFragment.searchUrl"));
        this.ai = this.q.getInt("SearchFragment.searchTrigger");
        this.aj = this.q.getInt("SearchFragment.backendId");
        this.ak = this.q.getInt("SearchFragment.searchBehaviorId");
        com.google.android.finsky.m.a.H().a(this.h(), 0);
        this.L = 1;
    }

    protected final void cg_() {
        this.ao();
        if (this.ap()) {
            this.k(1719);
            if (this.aw == 0 && com.google.android.finsky.m.a.aP().b())
                this.aw = new com.google.android.finsky.activities.gg(this, this.c);
        }
        this.ac();
    }

    public final void d() {
        if (this.e != 0 && this.c != 0 && this.c.getVisibility() == 0)
            this.e.a(this.c, this.at);
        if (this.ap != 0 || this.f != 0) {
            this.au = new com.google.android.finsky.utils.ac();
            if (this.ap != 0) {
                this.aq.getConfigurator().a(this.au).b();
                this.aq = 0;
            }
            if (this.f != 0) {
                this.f.b(this.au);
                this.f = 0;
            }
        }
        if (this.g != 0) {
            this.g.d();
            this.g = 0;
        }
        if (this.ax != 0) {
            this.c.b(this.ax);
            this.ax = 0;
        }
        if (this.c != 0) {
            this.c.setRecyclerListener(0);
            this.c = 0;
        }
        if (this.e != 0) {
            this.e.h();
            this.e = 0;
        }
        this.ar = 0;
        ((MainActivity)this.bm).U.b("");
        if (this.bt instanceof PlayHeaderListLayout)
            ((PlayHeaderListLayout)this.bt).f();
        if (this.a != 0) {
            this.a.b(this);
            this.a.b(this);
        }
        if (this.q_ != 0) {
            this.q_.b(this);
            this.q_.b(this);
        }
        com.google.android.finsky.dfemodel.x.a(this.q_);
        super.d();
    }

    public final void d(Bundle p0) {
        super.d(p0);
        if (this.q_ != 0 && this.q_.c()) {
            if (this.q_.c())
                v0 = this.q_.a.a.f;
            else
                v0 = 0;
            this.bm.a(v0, this.q_.d(), 1);
        }
        this.c.setVisibility(0);
        this.c.setSaveEnabled(0);
        this.c.setLayoutManager(new LinearLayoutManager());
        if (com.google.android.finsky.m.a.ay().d()) {
            if (this.ax == 0)
                this.ax = new com.google.android.finsky.d.ag(com.google.android.libraries.performance.primes.cm.b, com.google.android.finsky.m.a.cv(), this.bw, 4);
            this.c.a(this.ax);
        }
        this.ac();
        v0 = (TextView)this.bt.findViewById(2131755780);
        if (this.ao != 0) {
            v4 = new Object[1];
            v4[0] = this.ag;
            v0.setText(this.i().getString(2131952622, v4));
        }
        else {
            v4 = new Object[1];
            v4[0] = this.ag;
            v0.setText(this.i().getString(2131952629, v4));
        }
        if (!this.ap()) {
            this.au();
            this.aa();
            this.ac();
        }
        else {
            this.aj();
            this.ao();
        }
        this.bq.a();
        this.ar = (Button)this.bt.findViewById(2131756677);
        this.ar.setOnClickListener(new com.google.android.finsky.activities.gh(this));
        if (this.ao != 0)
            this.h.e = this.ao;
        if (this.ar != 0) {
            if (this.ao != 0) {
                this.ar.setVisibility(0);
                if (this.as == 0) {
                    this.as = new com.google.android.finsky.d.o(298, this);
                    this.bw.a(new com.google.android.finsky.d.p().b(this.as));
                }
            }
            else
                this.ar.setVisibility(8);
        }
    }

    public final com.google.wireless.android.a.a.a.a.ce getPlayStoreUiElement() {
        return this.av;
    }

    public final void m_() {
        if (!this.ap())
            this.aa();
        else {
            if (this.q_.a != 0 && this.q_.a.a() != 0) {
                this.bw.a(new com.google.android.finsky.d.c(523));
                super.m_();
                return;
            }
            if (this.am != 0) {
                v4 = new Object[1];
                v4[0] = this.ag;
                com.google.android.finsky.bg.a.a(this.bn, this.i().getString(2131952629, v4), this.c, 0);
                this.bw.a(new com.google.android.finsky.d.c(523));
                super.m_();
                return;
            }
            if (this.al != 0) {
                v4 = new Object[1];
                v4[0] = this.ag;
                com.google.android.finsky.bg.a.a(this.bn, this.i().getString(2131952629, v4), this.c, 0);
                this.bw.a(new com.google.android.finsky.d.c(523));
                super.m_();
                return;
            }
            v3 = this.a(com.google.android.finsky.api.l.a(this.ag, 0, 0));
            if (v3.equals(this.ah)) {
                v4 = new Object[1];
                v4[0] = this.ag;
                com.google.android.finsky.bg.a.a(this.bn, this.i().getString(2131952629, v4), this.c, 0);
                this.bw.a(new com.google.android.finsky.d.c(523));
                super.m_();
                return;
            }
            if (this.q_.c())
                v0 = this.q_.a.a.f;
            else
                v0 = 0;
            switch (v0) {
                case 1:
                    v0 = 2131952631;
                    break;
                case 2:
                    v0 = 2131952633;
                    break;
                case 3:
                    v0 = 2131952630;
                    break;
                case 4:
                    v0 = 2131952632;
                    break;
                case 5:
                    v0 = 2131952629;
                    break;
                case 6:
                    v0 = 2131952634;
                    break;
                default:
                    v0 = 2131952629;
                    break;
            }
            v2 = new Object[1];
            v2[0] = this.ag;
            com.google.android.finsky.bg.a.a(this.bn, this.i().getString(v0, v2), this.c, 0);
            this.am = 1;
            this.ah = v3;
            this.a.b(this);
            this.a.b(this);
            this.a = 0;
            this.q_.b(this);
            this.q_.b(this);
            this.q_ = 0;
            this.an = 0;
            this.aa();
        }
    }

    public final void p_() {
    }

    public final void q_() {
    }

}
