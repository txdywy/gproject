package com.google.android.finsky.activities;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.ab;
import android.support.v4.app.p;
import android.support.v4.app.u;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.android.volley.VolleyError;
import com.google.android.finsky.adapters.u;
import com.google.android.finsky.cv.a.cv;
import com.google.android.finsky.d.d;
import com.google.android.finsky.d.j;
import com.google.android.finsky.d.w;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.dfemodel.i;
import com.google.android.finsky.dfemodel.k;
import com.google.android.finsky.dfemodel.l;
import com.google.android.finsky.dfemodel.m;
import com.google.android.finsky.dfemodel.n;
import com.google.android.finsky.dfemodel.x;
import com.google.android.finsky.m;
import com.google.android.finsky.pagesystem.b;
import com.google.android.finsky.pagesystem.e;
import com.google.android.finsky.ratereview.p;
import com.google.android.finsky.ratereview.q;
import com.google.android.finsky.recyclerview.PlayRecyclerView;
import com.google.android.finsky.recyclerview.e;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.ak;
import com.google.wireless.android.a.a.a.a.ce;

public final class com.google.android.finsky.activities.ga extends com.google.android.finsky.pagesystem.b implements com.google.android.finsky.activities.fz, com.google.android.finsky.activities.gd, com.google.android.finsky.adapters.x, com.google.android.finsky.ratereview.o
{

    public com.google.wireless.android.a.a.a.a.ce a;
    public boolean ag;
    public PlayRecyclerView ah;
    public com.google.android.finsky.adapters.u ai;
    public com.google.android.finsky.ratereview.q c;
    public Document f;
    public boolean g;
    public boolean h;
    public com.google.android.finsky.dfemodel.n o_;
    public String p_;

    ga() {
        com.google.android.finsky.pagesystem.b();
        com.google.android.finsky.m.a.aO();
        this.a = com.google.android.finsky.d.j.a(302);
    }

    private final boolean aj() {
        if (this.o_ != 0 && this.o_.a())
            v0 = 1;
        else
            v0 = 0;
        return v0;
    }

    public final void I_() {
        if (this.o_ != 0 && this.B.a("filter_options_dialog") == 0) {
            v3 = new com.google.android.finsky.activities.fw();
            v4 = new Bundle();
            v4.putBoolean("filterByVersion", this.o_.b);
            v4.putBoolean("filterByDevice", this.o_.c);
            v3.f(v4);
            v3.a(this, 0);
            v3.a(this.B, "filter_options_dialog");
        }
    }

    public final void J_() {
        if (this.o_ != 0 && this.B.a("sorting_dialog") == 0) {
            v2 = new com.google.android.finsky.activities.gb();
            v3 = new Bundle();
            v3.putInt("sorting_type", com.google.android.finsky.utils.ak.a(this.o_));
            v2.f(v3);
            v2.a(this, 0);
            v2.a(this.B, "sorting_dialog");
        }
    }

    protected final int Z() {
        return 2130968960;
    }

    public final View a(LayoutInflater p0, ViewGroup p1, Bundle p2) {
        this.ah = (PlayRecyclerView)this.bt.findViewById(2131756031);
        this.ah.getContext();
        this.ah.setLayoutManager(new LinearLayoutManager());
        if (this.aj())
            this.m_();
        return super.a(p0, p1, p2);
    }

    public final void a(VolleyError p0) {
        super.a(p0);
        if (this.ah != 0 && this.ai != 0)
            this.ai.e(2);
    }

    public final void a(String p0, String p1, com.google.android.finsky.ratereview.p p2) {
  0:    v0 = this.h();
  4:    if (v0 != 0)
  7:        v0.setResult(-1);
 16:    if (!this.c.c(p0, p1, p2)) goto 19;
 18:    return;
 23:    switch (p2.ordinal()) {
            case 0:
 23:            goto 42;
            case 1:
 23:            goto 72;
            case 2:
 23:            goto 75;
            case 3:
 23:            goto 78;
            default:
        }
 29:    v1 = new Object[1];
 36:    v1[0] = p2.toString();
 38:    FinskyLog.e("Unknown review rating selected in reviews samples section: %s", v1);
 41:    goto 18;
 42:    v0 = 1212;
 55:    this.bw.b(new com.google.android.finsky.d.d(this).a(v0));
 68:    new com.google.android.finsky.dfemodel.m(com.google.android.finsky.m.a.ap(), p0, p1, p2.e);
 71:    goto 18;
 72:    v0 = 1213;
 74:    goto 44;
 75:    v0 = 1214;
 77:    goto 44;
 78:    v0 = 1217;
 80:    goto 44;
    }

    public final void a(boolean p0, boolean p1) {
        this.h = p0;
        this.ag = p1;
        this.o_.a(p0, p1);
        this.o_.b();
    }

    protected final void aa() {
        this.o_.n();
    }

    public final void ac() {
        this.bm.a(this.f.a.f, 0);
        this.bm.c(this.f.a.g);
        this.bm.z();
    }

    public final void b(int p0) {
        this.o_.f = p0;
        this.o_.b();
    }

    public final void b(Bundle p0) {
        super.b(p0);
        this.f = (Document)this.q.getParcelable("finsky.ReviewsFragment.document");
        this.p_ = this.q.getString("finsky.ReviewsFragment.reviewsUrl");
        this.g = this.q.getBoolean("finsky.ReviewsFragment.isRottenTomatoesReviews");
        this.L = 1;
    }

    protected final void cg_() {
        this.ac();
    }

    public final void d() {
        if (this.o_ != 0) {
            this.o_.b(this);
            this.o_.b(this);
        }
        if (this.ai != 0) {
            this.ai.d.b(this.ai);
            this.ai.d.b(this.ai);
        }
        this.ai = 0;
        this.ah = 0;
        super.d();
    }

    public final void d(Bundle p0) {
        super.d(p0);
        if (this.g != 0)
            v0 = -1;
        else
            v0 = 4;
        new com.google.android.finsky.dfemodel.i(this.bo, this.f.a.w);
        this.c = com.google.android.finsky.m.a.i(com.google.android.finsky.m.a.cZ());
        if (this.o_ == 0) {
            this.o_ = com.google.android.finsky.dfemodel.l.a(this.bo, this.p_, this.f.h(), 1);
            this.o_.a(this);
            this.o_.a(this);
            this.o_.f = v0;
        }
        this.o_.a(this.h, this.ag);
        this.ai = new com.google.android.finsky.adapters.u(this.h(), this.f, this.o_, this.g, this.k_, this, this.bp, this, this, this.bw);
        this.ah.setAdapter(this.ai);
        if (!this.aj()) {
            this.au();
            this.aa();
        }
    }

    public final com.google.wireless.android.a.a.a.a.ce getPlayStoreUiElement() {
        return this.a;
    }

    public final void m_() {
        com.google.android.finsky.d.j.a(this.a, this.f.a.D);
        this.o_.b(this);
        this.o_.b(this);
        this.o_.l = 0;
        if (this.ah != 0)
            this.ah.setEmptyView(this.bt.findViewById(2131755302));
        super.m_();
    }

}
