package com.google.android.finsky.billing.myaccount;

import android.accounts.Account;
import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.ab;
import android.support.v4.app.aw;
import android.support.v4.app.u;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.bx;
import android.support.v7.widget.ci;
import android.support.v7.widget.em;
import android.support.v7.widget.en;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.finsky.a.c;
import com.google.android.finsky.api.c;
import com.google.android.finsky.api.m;
import com.google.android.finsky.bg.l;
import com.google.android.finsky.billing.common.s;
import com.google.android.finsky.d.j;
import com.google.android.finsky.d.w;
import com.google.android.finsky.headerlistlayout.FinskyHeaderListLayout;
import com.google.android.finsky.headerlistlayout.i;
import com.google.android.finsky.layoutswitcher.e;
import com.google.android.finsky.pagesystem.ContentFrame;
import com.google.android.finsky.pagesystem.b;
import com.google.android.finsky.pagesystem.e;
import com.google.android.finsky.providers.d;
import com.google.android.finsky.recyclerview.PlayRecyclerView;
import com.google.android.finsky.recyclerview.a;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.play.headerlist.PlayHeaderListLayout;
import com.google.wireless.android.a.a.a.a.ce;
import com.google.wireless.android.finsky.dfe.c.a.ba;
import com.google.wireless.android.finsky.dfe.c.a.be;
import com.google.wireless.android.finsky.dfe.c.a.bf;
import java.util.Stack;

public final class com.google.android.finsky.billing.myaccount.ad extends com.google.android.finsky.pagesystem.b implements com.google.android.finsky.billing.common.t
{

    public final com.google.wireless.android.a.a.a.a.ce a;
    public com.google.android.finsky.bg.l b;
    public com.google.android.finsky.billing.myaccount.w c;
    public PlayRecyclerView e;
    public com.google.android.finsky.billing.myaccount.af f;
    public bh[] h;

    ad() {
        com.google.android.finsky.pagesystem.b();
        this.a = com.google.android.finsky.d.j.a(28);
        this.h = 0;
    }

    protected final int Z() {
        return 2130968962;
    }

    public final View a(LayoutInflater p0, ViewGroup p1, Bundle p2) {
        ((FinskyHeaderListLayout)this.bt).a(new com.google.android.finsky.billing.myaccount.ae(((FinskyHeaderListLayout)this.bt).getContext()));
        this.e = (PlayRecyclerView)this.bt.findViewById(2131755301);
        this.e.setSaveEnabled(0);
        this.e.setBackgroundResource(2131558698);
        this.e.setLayoutManager(new LinearLayoutManager());
        this.e.setAdapter(new com.google.android.finsky.recyclerview.a());
        this.e.setItemAnimator(new android.support.v7.widget.bx());
        this.e.a(new android.support.v7.widget.ci(this.g()));
        return super.a(p0, p1, p2);
    }

    protected final com.google.android.finsky.layoutswitcher.e a(ContentFrame p0) {
        return new com.google.android.finsky.headerlistlayout.i(p0, this);
    }

    public final void a(Activity p0) {
        ((com.google.android.finsky.billing.myaccount.s)com.google.android.finsky.providers.d.a(com.google.android.finsky.billing.myaccount.s)).a(this);
        super.a(p0);
    }

    public final void a(com.google.android.finsky.billing.common.s p0) {
  0:    v0 = 0;
  3:    switch (p0.l) {
            case 0:
  3:            goto 33;
            case 1:
  3:            goto 37;
            case 2:
  3:            goto 41;
            case 3:
  3:            goto 85;
            default:
        }
  9:    v2 = new Object[1];
 17:    v2[0] = Integer.valueOf(p0.l);
 19:    FinskyLog.c("Unhandled state: %s", v2);
 29:    this.a(this.c(2131952119));
 32:    return;
 33:    this.aa();
 36:    goto 32;
 37:    this.au();
 40:    goto 32;
 45:    if (this.f.ak == 0) goto 83;
 52:    if (v0 >= this.f.ak.a.length) goto 83;
 68:    if (!this.f.ak.a[v0].c.equals(this.f.al.peek())) goto 80;
 70:    v0 = this.f.ak.a[v0].d;
 74:    this.h = v0.a;
 76:    this.cg_();
 79:    return;
 80:    v0 = v0 + 1;
 82:    goto 52;
 83:    v0 = 0;
 84:    goto 72;
 95:    this.a(com.google.android.finsky.api.m.a(this.bn, this.f.aj));
    }

    protected final void aa() {
        this.h = 0;
        this.f.a(0);
    }

    public final void ac() {
        this.bm.c(this.c(2131951655));
        this.bm.a(0, 1);
        this.bm.z();
    }

    public final boolean am() {
        v0 = 1;
        v1 = 0;
        if (!this.f.al.empty())
            this.f.al.pop();
        if (!this.f.al.empty()) {
            this.f.b(2, 0);
            v1 = 1;
        }
        if (v1 == 0)
            v0 = super.am();
        return v0;
    }

    public final void b(Bundle p0) {
        super.b(p0);
        this.L = 1;
        v0 = this.h().H_();
        v1 = v0.a("country_profile_sidecar");
        if (v1 != 0)
            v0.a().a(v1).c();
    }

    protected final void cg_() {
        v0 = 0;
        if (this.c == 0)
            this.c = new com.google.android.finsky.billing.myaccount.w(this.g(), this.b, this.bw, this);
        this.e.setAdapter(this.c);
        this.c.i = this.f;
        if (this.h != 0) {
            this.c.j = new ab[this.h.length + 1];
            this.c.j[0] = new com.google.android.finsky.billing.myaccount.ab();
            while (v0 < this.h.length) {
                this.c.j[v0 + 1] = new com.google.android.finsky.billing.myaccount.ab(this.h[v0]);
                v0 = v0 + 1;
            }
            this.c.a.b();
            this.O_();
        }
        else
            this.au();
    }

    public final void d() {
        super.d();
        this.f.a(0);
        this.e = 0;
        this.c = 0;
    }

    public final void d(Bundle p0) {
        super.d(p0);
        this.ac();
        if (this.f == 0) {
            v2 = new Bundle();
            v2.putString("authAccount", this.bo.b().name);
            this.bw.a(v2);
            v0 = new com.google.android.finsky.billing.myaccount.af();
            v0.f(v2);
            this.f = v0;
            this.h().H_().a().a(this.f, "country_profile_sidecar").c();
        }
        this.f.a(this);
        this.cg_();
        this.bq.a();
    }

    public final com.google.wireless.android.a.a.a.a.ce getPlayStoreUiElement() {
        return this.a;
    }

}
