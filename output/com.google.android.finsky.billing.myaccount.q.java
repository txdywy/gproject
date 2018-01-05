package com.google.android.finsky.billing.myaccount;

import android.accounts.Account;
import android.app.Activity;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v4.app.ab;
import android.support.v4.app.aw;
import android.support.v4.app.u;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.bx;
import android.support.v7.widget.em;
import android.support.v7.widget.en;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.finsky.a.c;
import com.google.android.finsky.accounts.c;
import com.google.android.finsky.api.c;
import com.google.android.finsky.api.m;
import com.google.android.finsky.ba.c;
import com.google.android.finsky.ba.e;
import com.google.android.finsky.bb.b;
import com.google.android.finsky.bg.l;
import com.google.android.finsky.billing.common.q;
import com.google.android.finsky.billing.common.s;
import com.google.android.finsky.billing.profile.m;
import com.google.android.finsky.d.ad;
import com.google.android.finsky.d.d;
import com.google.android.finsky.d.j;
import com.google.android.finsky.d.o;
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
import com.google.wireless.android.finsky.dfe.nano.u;

public final class com.google.android.finsky.billing.myaccount.q extends com.google.android.finsky.pagesystem.b implements View$OnClickListener, com.google.android.finsky.billing.common.t
{

    public boolean a;
    public com.google.android.finsky.d.ad ag;
    public com.google.android.finsky.d.ad ah;
    public int ai;
    public com.google.android.finsky.billing.profile.m aj;
    public int ak;
    public com.google.wireless.android.finsky.dfe.nano.u al;
    public PlayRecyclerView am;
    public FloatingActionButton an;
    public com.google.android.finsky.billing.myaccount.l ao;
    public com.google.android.finsky.accounts.c b;
    public com.google.android.finsky.bb.b c;
    public com.google.android.finsky.bg.l e;
    public com.google.android.finsky.billing.common.q f;
    public final com.google.wireless.android.a.a.a.a.ce h;
    public com.google.android.finsky.ba.c n_;

    q() {
        com.google.android.finsky.pagesystem.b();
        this.h = com.google.android.finsky.d.j.a(19);
        this.ak = -1;
    }

    private final boolean aj() {
        if (this.al != 0)
            v0 = 1;
        else
            v0 = 0;
        return v0;
    }

    private final void ao() {
        if (this.a != 0)
            this.ai = 2;
        else
            this.ai = 0;
        this.ac();
        if (this.aj())
            this.cg_();
    }

    private final void ap() {
        this.ai = 1;
        this.ac();
        if (this.aj())
            this.aq();
    }

    private final void aq() {
        if (this.al.d == 0 || this.al.d.length == 0)
            throw new IllegalArgumentException("No creatable instruments to show.");
        this.ao.w = 0;
        this.ao.x = 0;
        this.ao.b();
        this.ao.a(2, this.al.d);
        this.ao.a.b();
        this.O_();
        this.an.b(0, 1);
    }

    private final boolean ar() {
        if (!this.aj())
            throw new IllegalStateException("Cannot check for existing instruments without a billing profile.");
        if (this.al.b != 0 && this.al.b.length > 0)
            v0 = 1;
        else
            v0 = 0;
        return v0;
    }

    protected final int Z() {
        return 2130968962;
    }

    public final View a(LayoutInflater p0, ViewGroup p1, Bundle p2) {
        ((FinskyHeaderListLayout)this.bt).a(new com.google.android.finsky.billing.myaccount.r(((FinskyHeaderListLayout)this.bt).getContext()));
        this.am = (PlayRecyclerView)this.bt.findViewById(2131755301);
        this.am.setSaveEnabled(0);
        if (this.a != 0)
            this.am.setBackgroundResource(17170445);
        this.am.setLayoutManager(new LinearLayoutManager());
        this.am.setAdapter(new com.google.android.finsky.recyclerview.a());
        this.am.setItemAnimator(new android.support.v7.widget.bx());
        this.an = (FloatingActionButton)this.bt.findViewById(2131755310);
        if (this.a != 0)
            this.an.setVisibility(8);
        else
            this.an.setOnClickListener(this);
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
  6:    if (p0.ag != this.ak) goto 13;
 10:    if (p0.l == 1) goto 13;
 12:    return;
 15:    this.ak = p0.ag;
 19:    switch (p0.l) {
            case 0:
 19:            goto 51;
            case 1:
 19:            goto 62;
            case 2:
 19:            goto 72;
            case 3:
 19:            goto 82;
            case 4:
 19:            goto 55;
            case 5:
 19:            goto 55;
            case 6:
 19:            goto 55;
            default:
        }
 47:    FinskyLog.c(28 + "Unhandled state: " + p0.l, new Object[0]);
 50:    goto 12;
 51:    this.aa();
 54:    goto 12;
 55:    this.aa();
 58:    this.ao();
 61:    goto 12;
 62:    this.au();
 68:    this.an.b(0, 1);
 71:    goto 12;
 76:    this.al = this.aj.al;
 78:    this.cg_();
 81:    goto 12;
 84:    switch (p0.af) {
            case 1:
134:            this.a(Html.fromHtml(this.aj.am).toString());
152:            break;
            case 2:
148:            this.a(com.google.android.finsky.api.m.a(this.bn, this.aj.an));
152:            break;
            default:
 90:            v1 = new Object[2];
 98:            v1[0] = Integer.valueOf(p0.l);
106:            v1[1] = Integer.valueOf(p0.af);
108:            FinskyLog.c("Unhandled state: %s substate: %s", v1);
118:            this.a(this.c(2131952119));
152:            break;
        }
    }

    protected final void aa() {
        this.al = 0;
        this.aj.a(this.aj.W(), 0, 0, this.bw);
    }

    public final void ac() {
  2:    switch (this.ai) {
            case 0:
 43:            this.bm.c(this.c(2131952751));
 50:            this.bm.a(0, 1);
 55:            this.bm.z();
 58:            return;
            case 1:
 72:            break;
            case 2:
 43:            this.bm.c(this.c(2131952751));
 50:            this.bm.a(0, 1);
 55:            this.bm.z();
 58:            return;
            default:
 33:            throw new IllegalStateException(31 + "Unknown view state: " + this.ai);
        }
 68:    this.bm.c(this.c(2131951666));
 71:    goto 46;
    }

    protected final int ak() {
        return 3;
    }

    public final com.google.android.finsky.d.ad al() {
        switch (this.ai) {
            case 0:
                this = this.ag;
                break;
            case 1:
                this = this.ah;
                break;
            case 2:
                break;
            default:
                throw new IllegalStateException(31 + "Unknown view state: " + this.ai);
        }
        return this;
    }

    public final boolean am() {
        v0 = 1;
        if (this.ai == 1 && this.aj() && this.ar()) {
            this.bw.b(new com.google.android.finsky.d.d(this.ah).a(600));
            this.ao();
        }
        else
            v0 = super.am();
        return v0;
    }

    public final void b(Bundle p0) {
        super.b(p0);
        this.L = 1;
        this.a = this.n_.dj().a(12622358);
        this.ag = new com.google.android.finsky.d.o(2621, this);
        this.ah = new com.google.android.finsky.d.o(2622, this);
        if (this.a != 0)
            this.ai = 2;
        else
            this.ai = 0;
        v0 = this.h().H_();
        v1 = v0.a("billing_profile_sidecar");
        if (v1 != 0)
            v0.a().a(v1).c();
    }

    protected final void cg_() {
        if (this.ao == 0) {
            this.ao = new com.google.android.finsky.billing.myaccount.l(this.bn, this.aj, this.b, this.c, this.e, this.n_, this.ag, this.ah, this.bw);
            this.am.setAdapter(this.ao);
        }
        switch (this.ai) {
            case 0:
                if (this.ar()) {
                    if (this.al.b == 0 || this.al.b.length == 0)
                        throw new IllegalArgumentException("No existing instruments to show.");
                    this.ao.a(this.al.b);
                    this.O_();
                    this.an.a(0, 1);
                    this.ag.a(new com.google.android.finsky.d.o(2624, this.ag));
                }
                else
                    this.ap();
                break;
            case 1:
                this.aq();
                break;
            case 2:
                this.ao.a(this.al.b, this.al.d);
                this.O_();
                break;
            default:
                throw new IllegalStateException(31 + "Unknown view state: " + this.ai);
        }
    }

    public final void d() {
        if (this.aj != 0)
            this.aj.a(0);
        this.am = 0;
        this.an = 0;
        this.ao = 0;
        super.d();
    }

    public final void d(Bundle p0) {
        super.d(p0);
        this.ac();
        if (this.aj == 0) {
            v0 = this.bo.b();
            this.aj = com.google.android.finsky.billing.profile.m.a(v0, 0, 0, this.f.a(v0.name, 5, 0, this.bw), 4, 0);
            this.h().H_().a().a(this.aj, "billing_profile_sidecar").c();
        }
        this.aj.a(this);
        if (this.aj())
            this.cg_();
        this.bq.a();
    }

    public final com.google.wireless.android.a.a.a.a.ce getPlayStoreUiElement() {
        return this.h;
    }

    public final void n_() {
        this.bw.b(new com.google.android.finsky.d.d(this).a(2628));
        super.n_();
    }

    public final void onClick(View p0) {
        if (p0 == this.an) {
            this.bw.b(new com.google.android.finsky.d.d(this.ag).a(2624));
            this.ap();
        }
        else {
            v0 = String.valueOf(p0);
            FinskyLog.e((String.valueOf(v0).length() + 32) + "Click received on unknown view: " + v0, new Object[0]);
        }
    }

}
