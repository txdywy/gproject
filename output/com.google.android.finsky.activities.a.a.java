package com.google.android.finsky.activities.a;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.a.a.f;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.finsky.a.c;
import com.google.android.finsky.adapters.ad;
import com.google.android.finsky.adapters.m;
import com.google.android.finsky.api.c;
import com.google.android.finsky.ba.e;
import com.google.android.finsky.bg.k;
import com.google.android.finsky.by.a;
import com.google.android.finsky.by.c;
import com.google.android.finsky.cv.a.cv;
import com.google.android.finsky.d.j;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.dfemodel.a;
import com.google.android.finsky.dfemodel.j;
import com.google.android.finsky.dfemodel.k;
import com.google.android.finsky.dfemodel.l;
import com.google.android.finsky.dfemodel.u;
import com.google.android.finsky.dfemodel.x;
import com.google.android.finsky.ee.a;
import com.google.android.finsky.headerlistlayout.FinskyHeaderListLayout;
import com.google.android.finsky.headerlistlayout.i;
import com.google.android.finsky.layoutswitcher.e;
import com.google.android.finsky.m;
import com.google.android.finsky.pagesystem.ContentFrame;
import com.google.android.finsky.pagesystem.b;
import com.google.android.finsky.pagesystem.e;
import com.google.android.finsky.recyclerview.PlayRecyclerView;
import com.google.android.finsky.recyclerview.a;
import com.google.android.finsky.stream.a.b;
import com.google.android.finsky.stream.a.d;
import com.google.android.finsky.stream.base.n;
import com.google.android.finsky.stream.base.view.g;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.ac;
import com.google.android.play.headerlist.PlayHeaderListLayout;
import com.google.wireless.android.a.a.a.a.ce;

public final class com.google.android.finsky.activities.a.a extends com.google.android.finsky.pagesystem.b
{

    public String a;
    public boolean ag;
    public Bundle ah;
    public com.google.android.finsky.utils.ac ai;
    public long aj;
    public com.google.wireless.android.a.a.a.a.ce ak;
    public boolean al;
    public com.google.android.finsky.ee.a am;
    public com.google.android.finsky.dfemodel.u an;
    public PlayRecyclerView c;
    public com.google.android.finsky.adapters.ad e;
    public com.google.android.finsky.stream.base.n f;
    public com.google.android.finsky.stream.a.b g;
    public com.google.android.finsky.dfemodel.j h;
    public com.google.android.finsky.by.c u_;

    a() {
        com.google.android.finsky.pagesystem.b();
        com.google.android.finsky.m.a.aO();
        this.ah = new Bundle();
        this.ak = com.google.android.finsky.d.j.a(5);
    }

    private final void aj() {
        if (this.h != 0) {
            this.h.b(this);
            this.h.b(this);
            this.h = 0;
        }
    }

    private final void ao() {
        if (this.c == 0)
            FinskyLog.c("Recycler view null, ignoring.", new Object[0]);
        else {
            if (this.ah != 0 && this.ah.containsKey("CardRecyclerViewAdapter.itemEntriesList"))
                v20 = 1;
            else
                v20 = 0;
            if (this.e == 0 && this.f == 0) {
                com.google.android.finsky.d.j.a(this.ak, this.h.a.a.D);
                if (this.al != 0) {
                    this.f = new com.google.android.finsky.stream.base.n();
                    if (this.an == 0)
                        this.an = com.google.android.finsky.dfemodel.l.a(this.h);
                    this.g = com.google.android.finsky.m.a.co().a(this.an, this.f, this.c, this.bn, this.bp, this, this.bw, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
                    this.h.b(this);
                    this.h.b(this);
                    if (this.ai != 0)
                        this.f.a(this.ai);
                }
                else {
                    this.e = new com.google.android.finsky.adapters.ad(this.bn, this.bp, this.bD, com.google.android.finsky.m.a.h(com.google.android.finsky.m.a.cZ()), com.google.android.finsky.dfemodel.l.a(this.h), this, v20, this.bw);
                    this.am.a(this.e);
                }
            }
            if (this.al == 0) {
                if (this.ag == 0) {
                    this.ag = 1;
                    this.c.setAdapter(this.e);
                    if (v20 != 0) {
                        this.e.b(this.c, this.ah);
                        this.ah.clear();
                    }
                    this.c.setEmptyView(this.bt.findViewById(2131755302));
                }
                else
                    this.e.a(this.h);
            }
        }
    }

    protected final int Z() {
        return 2130968962;
    }

    public final View a(LayoutInflater p0, ViewGroup p1, Bundle p2) {
        ((FinskyHeaderListLayout)this.bt).a(new com.google.android.finsky.activities.a.b(((FinskyHeaderListLayout)this.bt).getContext()));
        return (ContentFrame)super.a(p0, p1, p2);
    }

    protected final com.google.android.finsky.layoutswitcher.e a(ContentFrame p0) {
        return new com.google.android.finsky.headerlistlayout.i(p0, this, 0);
    }

    protected final void aa() {
        v0 = 0;
        this.aj();
        if (!com.google.android.finsky.m.a.dj().a(12610398))
            v0 = 1;
        this.h = com.google.android.finsky.dfemodel.l.a(this.bo, this.bo.a(0, "u-wl", 7, this.u_.a(com.google.android.finsky.m.a.cY()).f("u-wl")), 1, v0);
        this.h.a(this);
        this.h.a(this);
        this.h.n();
        this.aj = System.currentTimeMillis();
    }

    public final int ab() {
        return 0;
    }

    public final void ac() {
        this.bm.c(this.a);
        this.bm.a(0, 1);
        this.bm.z();
    }

    protected final int ak() {
        return 3;
    }

    public final void b(Bundle p0) {
        super.b(p0);
        this.L = 1;
        this.u_ = com.google.android.finsky.m.a.ah();
        this.am = com.google.android.finsky.m.a.bd();
        this.al = com.google.android.finsky.m.a.dj().a(12610398);
    }

    protected final void cg_() {
    }

    public final void d() {
        if (this.c != 0 && this.c.getVisibility() == 0 && this.e != 0)
            this.e.a(this.c, this.ah);
        if (this.f != 0) {
            this.ai = new com.google.android.finsky.utils.ac();
            this.f.b(this.ai);
            this.f = 0;
        }
        if (this.g != 0) {
            this.g.d();
            this.g = 0;
        }
        this.c = 0;
        if (this.e != 0) {
            this.e.h();
            this.am.b(this.e);
            this.e = 0;
            this.ag = 0;
        }
        if (this.bt instanceof PlayHeaderListLayout)
            ((PlayHeaderListLayout)this.bt).f();
        if (this.h != 0) {
            this.h.b(this);
            this.h.b(this);
        }
        com.google.android.finsky.dfemodel.x.a(this.h);
        super.d();
    }

    public final void d(Bundle p0) {
        super.d(p0);
        this.a = this.bn.getString(2131952492);
        this.c = (PlayRecyclerView)this.bt.findViewById(2131755428);
        this.c.setVisibility(0);
        this.c.setSaveEnabled(0);
        if (this.al == 0)
            this.c.setLayoutManager(new LinearLayoutManager());
        else {
            v0 = this.bt.findViewById(2131755302);
            v0.setBackgroundColor(android.support.v4.a.a.f.b(this.i(), 2131558777, 0));
            this.c.setEmptyView(v0);
            this.c.setLoadingView(this.bt.findViewById(2131755388));
        }
        this.c.setAdapter(new com.google.android.finsky.recyclerview.a());
        v0 = com.google.android.finsky.m.a.av().a(this.bn.getResources());
        this.c.a(new com.google.android.finsky.stream.base.view.g(v0, v0));
        this.ac();
        if (this.aj < this.am.g)
            v0 = 1;
        else
            v0 = 0;
        if (v0 != 0) {
            this.aj();
            if (this.al != 0) {
                this.ai = 0;
                this.an = 0;
            }
            else
                this.ah.clear();
        }
        if (this.h == 0)
            v0 = 0;
        else
            v0 = this.h.a();
        if (v0 == 0) {
            this.aa();
            if (this.al != 0)
                this.O_();
            else
                this.au();
        }
        else {
            if (this.h != 0 && this.al == 0) {
                this.h.a(this);
                this.h.a(this);
            }
            this.ao();
        }
        this.bq.a();
    }

    public final com.google.wireless.android.a.a.a.a.ce getPlayStoreUiElement() {
        return this.ak;
    }

    public final void m_() {
        super.m_();
        this.ao();
    }

}
