package com.google.android.finsky.billing.gifting;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.android.volley.VolleyError;
import com.google.android.finsky.a.c;
import com.google.android.finsky.api.c;
import com.google.android.finsky.api.j;
import com.google.android.finsky.bg.k;
import com.google.android.finsky.d.c;
import com.google.android.finsky.d.j;
import com.google.android.finsky.d.w;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.headerlistlayout.FinskyHeaderListLayout;
import com.google.android.finsky.navigationmanager.a;
import com.google.android.finsky.pagesystem.b;
import com.google.android.finsky.pagesystem.e;
import com.google.android.finsky.playcard.ac;
import com.google.android.finsky.providers.d;
import com.google.android.finsky.recyclerview.PlayRecyclerView;
import com.google.android.finsky.recyclerview.a;
import com.google.android.play.headerlist.PlayHeaderListLayout;
import com.google.wireless.android.a.a.a.a.ce;
import com.google.wireless.android.finsky.dfe.nano.ds;

public final class com.google.android.finsky.billing.gifting.f extends com.google.android.finsky.pagesystem.b implements com.android.volley.x, com.google.android.finsky.billing.gifting.i
{

    public final com.google.wireless.android.a.a.a.a.ce a;
    public PlayRecyclerView ag;
    public com.google.android.finsky.playcard.ac c;
    public com.google.android.finsky.api.j e;
    public com.google.wireless.android.finsky.dfe.nano.ds f;
    public com.google.android.finsky.billing.gifting.e g;
    public FinskyHeaderListLayout h;
    public com.google.android.finsky.bg.k w_;

    f() {
        com.google.android.finsky.pagesystem.b();
        this.a = com.google.android.finsky.d.j.a(16);
    }

    private final boolean aj() {
        if (this.f != 0)
            v0 = 1;
        else
            v0 = 0;
        return v0;
    }

    protected final int Z() {
        return 2130968962;
    }

    public final View a(LayoutInflater p0, ViewGroup p1, Bundle p2) {
        this.h = (FinskyHeaderListLayout)this.bt;
        this.h.a(new com.google.android.finsky.billing.gifting.g(this, this.h.getContext()));
        return super.a(p0, p1, p2);
    }

    public final void a(Activity p0) {
        ((com.google.android.finsky.billing.gifting.a)com.google.android.finsky.providers.d.a(com.google.android.finsky.billing.gifting.a)).a(this);
        super.a(p0);
    }

    public final void a(VolleyError p0) {
        super.a(p0);
        this.bw.a(new com.google.android.finsky.d.c(1201).a(this.e.b()).a(p0));
        this.m();
    }

    public final void a(Document p0, String p1) {
        this.m();
        this.bp.a(this.bo.b(), p0, p1, 1);
    }

    protected final void aa() {
        this.e = this.bo.g(this, this);
        this.bw.a(new com.google.android.finsky.d.c(1200));
    }

    public final void ac() {
        if (this.aj())
            v0 = this.f.b;
        else
            v0 = 0;
        this.bm.c(v0);
        this.bm.a(0, 1);
        this.bm.z();
    }

    protected final int ak() {
        return 2;
    }

    public final void b(Bundle p0) {
        super.b(p0);
        this.L = 1;
    }

    public final void b_(Object p0) {
        this.f = (com.google.wireless.android.finsky.dfe.nano.ds)p0;
        this.m_();
        this.bw.a(new com.google.android.finsky.d.c(1201).a(this.e.b()));
    }

    protected final void cg_() {
        this.ac();
        if (this.g == 0) {
            v6 = this.c.a(this.i());
            if (!(this.f.f.length % v6))
                v0 = 0;
            else
                v0 = 1;
            this.g = new com.google.android.finsky.billing.gifting.e(this.i(), this.p(), this, this, this.f, v6, this.f.f.length / v6 + v0, this.bw, this.w_);
        }
        this.ag.setAdapter(this.g);
    }

    public final void d() {
        if (this.h != 0)
            this.h.f();
        this.g = 0;
        this.h = 0;
        this.ag = 0;
        super.d();
    }

    public final void d(Bundle p0) {
        super.d(p0);
        this.ag = (PlayRecyclerView)this.h.getCurrentListView();
        this.ag.setLayoutManager(new LinearLayoutManager());
        this.ag.setAdapter(new com.google.android.finsky.recyclerview.a());
        if (!this.aj()) {
            this.aa();
            this.au();
        }
        else
            this.cg_();
        this.bq.a();
    }

    public final com.google.wireless.android.a.a.a.a.ce getPlayStoreUiElement() {
        return this.a;
    }

}
