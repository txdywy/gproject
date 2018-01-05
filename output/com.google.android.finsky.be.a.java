package com.google.android.finsky.be;

import android.accounts.Account;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.net.Uri$Builder;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.design.widget.g;
import android.support.v4.app.Fragment;
import android.support.v4.app.u;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.android.volley.VolleyError;
import com.android.volley.n;
import com.google.android.finsky.am.a;
import com.google.android.finsky.am.c;
import com.google.android.finsky.api.c;
import com.google.android.finsky.ba.c;
import com.google.android.finsky.ba.e;
import com.google.android.finsky.bd.a;
import com.google.android.finsky.billing.iab.w;
import com.google.android.finsky.br.a;
import com.google.android.finsky.cv.a.ax;
import com.google.android.finsky.cv.a.ih;
import com.google.android.finsky.cv.a.ip;
import com.google.android.finsky.d.ad;
import com.google.android.finsky.d.c;
import com.google.android.finsky.d.e;
import com.google.android.finsky.d.j;
import com.google.android.finsky.d.o;
import com.google.android.finsky.d.p;
import com.google.android.finsky.d.w;
import com.google.android.finsky.datasync.y;
import com.google.android.finsky.dfemodel.q;
import com.google.android.finsky.externalreferrer.d;
import com.google.android.finsky.m;
import com.google.android.finsky.navigationmanager.a;
import com.google.android.finsky.o;
import com.google.android.finsky.pagesystem.b;
import com.google.android.finsky.pagesystem.e;
import com.google.android.finsky.pagesystem.j;
import com.google.android.finsky.providers.d;
import com.google.android.finsky.utils.FinskyLog;
import com.google.wireless.android.a.a.a.a.ce;

public final class com.google.android.finsky.be.a extends com.google.android.finsky.pagesystem.j implements com.android.volley.x, com.google.android.finsky.api.w
{

    public com.google.android.finsky.datasync.y a;
    public com.google.android.finsky.externalreferrer.d ag;
    public com.android.volley.n ah;
    public com.google.android.finsky.cv.a.ip ai;
    public Uri aj;
    public String ak;
    public String al;
    public boolean am;
    public View an;
    public View ao;
    public boolean ap;
    public com.google.android.finsky.d.ad aq;
    public com.google.android.finsky.d.ad ar;
    public com.google.android.finsky.d.o as;
    public com.google.android.finsky.am.a c;
    public com.google.android.finsky.am.c f;
    public final com.google.wireless.android.a.a.a.a.ce h;

    a() {
        com.google.android.finsky.pagesystem.j();
        this.h = com.google.android.finsky.d.j.a(18);
        this.aq = new com.google.android.finsky.d.o(6380, this.getParentNode());
        this.ar = new com.google.android.finsky.d.o(6381, this.getParentNode());
        this.as = new com.google.android.finsky.d.o(6382, this.aq);
    }

    private static String a(Uri p0) {
        v0 = p0.getQueryParameter("url");
        if (TextUtils.isEmpty(v0))
            v0 = 0;
        return v0;
    }

    private final void a(int p0, byte[] p1) {
        v0 = new com.google.android.finsky.d.e(p0).a(this.bF).c(this.al).d(this.ak).a(p1);
        if (p0 == 1 && (p1 == 0 || p1.length == 0) && this.ai.F != 0)
            v0.b(this.ai.F.b);
        this.bw.a(v0).d().d();
    }

    private final void ao() {
        if (this.ah != 0 && com.google.android.finsky.m.a.dj().a(12643017)) {
            this.ah.f();
            this.ah = 0;
        }
    }

    protected final boolean X() {
        return 1;
    }

    protected final int Z() {
        return 0;
    }

    public final View a(LayoutInflater p0, ViewGroup p1, Bundle p2) {
        v1 = super.a(p0, p1, p2);
        if (this.c.a()) {
            v2 = (FrameLayout)((FrameLayout)v1).findViewById(2131756064);
            v2.removeAllViews();
            v0 = LayoutInflater.from(((FrameLayout)v1).getContext());
            this.ao = v0.inflate(com.google.android.finsky.bd.a.r.intValue(), v2, 0);
            v2.addView(this.ao);
            this.an = v0.inflate(com.google.android.finsky.bd.a.s.intValue(), v2, 0);
            v2.addView(this.an);
            this.an.findViewById(2131755654).setVisibility(0);
            v0 = this.an.findViewById(2131755655);
            ((TextView)v0).setVisibility(0);
            ((TextView)v0).setText(2131952039);
            ((TextView)this.an.findViewById(2131755656)).setText(2131952035);
            this.an.findViewById(2131755657).setVisibility(0);
            if (p2 != 0 && p2.getBoolean("notification_requested", 0))
                v0 = 1;
            else
                v0 = 0;
            this.ap = v0;
        }
        return v1;
    }

    final void a(int p0, VolleyError p1) {
        this.bw.a(new com.google.android.finsky.d.c(p0).d(this.bF).a(p1).e(this.al).a(1)).d().d();
    }

    public final void a(Activity p0) {
        ((com.google.android.finsky.o)com.google.android.finsky.providers.d.a(com.google.android.finsky.o)).a(this);
        super.a(p0);
    }

    public final void a(VolleyError p0) {
        v1 = new Object[1];
        v1[0] = p0;
        FinskyLog.d("Error on resolveLink: %s", v1);
        this.a(1104, p0);
        if (this.h() != 0 && this.c.a() && com.google.android.finsky.am.c.b(p0)) {
            if (this.h() != 0) {
                this.bm.c(this.c(2131951701));
                this.bm.a(0, 0, 0);
                this.bm.z();
                this.a(this.c(com.google.android.finsky.bd.a.u.intValue()));
                if (this.ap == 0) {
                    if (this.an.getVisibility() == 0)
                        Snackbar.a(this.R, this.c(2131952038), 0).a();
                    else {
                        this.an.setVisibility(0);
                        this.an.findViewById(com.google.android.finsky.bd.a.t.intValue()).setOnClickListener(new com.google.android.finsky.be.d(this, this.h().getIntent()));
                        this.bw.a(new com.google.android.finsky.d.p().b(this.aq));
                    }
                }
                else
                    this.aj();
            }
        }
        else
            this.bp.a(this.k_, this.bw);
    }

    protected final void aa() {
        this.k(1718);
        this.a(12, 0);
        this.ao();
        if (com.google.android.finsky.m.a.dj().a(12611365))
            this.ah = this.a.a(this.bF, this.ak, this, this, this, this.bo, this.bw);
        else
            this.ah = this.bo.a(this.bF, this.ak, this, this, this);
        this.bo.j(this.bF, new com.google.android.finsky.be.b(this), new com.google.android.finsky.be.c(this));
        this.au();
    }

    public final void ah_() {
        this.bw.a(new com.google.android.finsky.d.c(1104).d(this.bF).e(this.al).a(2)).d().d();
    }

    final void aj() {
        this.ao.setVisibility(0);
        this.an.setVisibility(8);
        this.bw.a(new com.google.android.finsky.d.p().b(this.ar));
    }

    public final boolean an() {
        if (this.c.a()) {
            this.bp.a(this.k_, this.bw);
            v0 = 1;
        }
        else
            v0 = super.an();
        return v0;
    }

    public final void b(Bundle p0) {
        super.b(p0);
        this.i(5);
        this.aj = Uri.parse(this.bF);
        this.ag = com.google.android.finsky.m.a.E();
        this.al = this.ag.a(this.aj);
        this.ak = this.q.getString("DeepLinkShimFragment.referringPackage");
        this.am = this.q.getBoolean("DeepLinkShimFragment.overrideAccountMissing", 0);
        v0 = this.q.getString("DeepLinkShimFragment.overrideAccount");
        if (TextUtils.isEmpty(v0))
            com.google.android.finsky.m.a.dc();
        else
            com.google.android.finsky.m.a.f(v0);
    }

    public final void b_(Object p0) {
        this.ai = (com.google.android.finsky.cv.a.ip)p0;
        this.bw.a(new com.google.android.finsky.d.c(1104).d(this.bF).e(this.al).a(((com.google.android.finsky.cv.a.ip)p0).G)).d().d();
        this.m_();
    }

    protected final void cg_() {
    }

    public final void d() {
        super.d();
        this.ao();
    }

    public final void d(Bundle p0) {
        super.d(p0);
        this.aa();
    }

    public final void e(Bundle p0) {
        super.e(p0);
        if (this.c.a())
            p0.putBoolean("notification_requested", this.ap);
    }

    public final com.google.wireless.android.a.a.a.a.ce getPlayStoreUiElement() {
        return this.h;
    }

    public final void m_() {
        v5 = 0;
        v2 = 0;
        if (this.n_.dj().a(12631400) && !this.bp.d())
            this.bv = 1;
        else if (this.ai != 0 && this.at()) {
            if (this.c.a())
                this.f.a(this.bw, this.h().getIntent());
            this.bp.t();
            this.k(1719);
            if (this.ai.b.length() > 0) {
                this.a(1, this.ai.G);
                this.ag.a(this.al, this.ak, this.ai.F, "deeplink");
                if (com.google.android.finsky.m.a.dj().a(12629614))
                    this.ai.a(Uri.parse(this.ai.b).buildUpon().appendQueryParameter("nocache_irl", Boolean.toString(1)).build().toString());
                this.bp.a(this.ai.b, this.ai.F, com.google.android.finsky.be.a.a(this.aj), this.q.getString("DeepLinkShimFragment.overrideAccount"), this.bF, this.bw);
            }
            else if (this.ai.c.length() > 0) {
                this.a(14, this.ai.G);
                this.ag.a(this.al, this.ak, this.ai.F, "deeplink");
                this.bp.a(this.ai.c, com.google.android.finsky.be.a.a(this.aj), this.q.getString("DeepLinkShimFragment.overrideAccount"), this.bF);
            }
            else if (this.ai.d.length() > 0) {
                this.a(2, this.ai.G);
                if (this.ai.bo_())
                    v5 = this.ai.J;
                this.bp.a(this.ai.d, 0, 1, -1, v5, this.k_, 0, this.bw);
            }
            else if (this.ai.e.length() > 0) {
                this.a(3, this.ai.G);
                if (this.ai.bo_())
                    v7 = this.ai.J;
                else
                    v7 = 0;
                this.bp.a(this.ai.e, this.ai.I, this.ai.H, v7, 0, 3, this.bw);
            }
            else if (this.ai.f.length() > 0) {
                this.a(8, this.ai.G);
                this.bp.e();
            }
            else if (this.ai.g.length() > 0) {
                this.a(10, this.ai.G);
                this.bp.a(0, this.bw);
            }
            else if (this.ai.n != 0) {
                FinskyLog.a("Direct purchase deprecated.", new Object[0]);
                this.a(4, this.ai.G);
                this.ag.a(this.al, this.ak, this.ai.n.c, "deeplink");
                this.bp.a(this.ai.n.b, com.google.android.finsky.be.a.a(this.aj), this.q.getString("DeepLinkShimFragment.overrideAccount"), this.bF, this.bw);
            }
            else if (this.ai.p.length() > 0) {
                this.a(5, this.ai.G);
                this.bp.a(this.k_, this.ai.p, this.bw);
            }
            else if (this.ai.o != 0) {
                this.bp.a(this.k_, this.bw);
                this.bp.a(this.bo.c(), this.ai.o, this.bw);
            }
            else if (this.ai.q != 0) {
                this.a(6, this.ai.G);
                this.bp.a(this.k_, this.bw);
                this.bp.a(this.bo.c(), this.ai.q, this.bw);
            }
            else if (this.ai.r.length() > 0) {
                this.a(13, this.ai.G);
                this.bp.a(this.bw);
            }
            else if (this.ai.h.length() > 0) {
                this.a(15, this.ai.G);
                this.bp.a(4, this.bw);
            }
            else if (this.ai.i.length() > 0) {
                this.a(16, this.ai.G);
                this.bp.a(1, this.ai.F, this.bw, this.bo.c());
            }
            else if (this.ai.j.length() > 0) {
                this.a(17, this.ai.G);
                this.bp.a(3, this.ai.F, this.bw, this.bo.c());
            }
            else if (this.ai.k.length() > 0) {
                this.a(18, this.ai.G);
                if (this.q.containsKey("DeepLinkShimFragment.overrideAccount") && !TextUtils.isEmpty(this.q.getString("DeepLinkShimFragment.overrideAccount")))
                    v2 = this.q.getString("DeepLinkShimFragment.overrideAccount");
                else if (this.ai.F != 0) {
                    v0 = com.google.android.finsky.m.a.aE().b(com.google.android.finsky.dfemodel.q.b(this.ai.F.b));
                    if (v0 != 0)
                        v2 = v0.name;
                }
                else
                    v2 = this.bo.c();
                this.bp.a(2, this.ai.F, this.bw, v2);
            }
            else if (this.ai.l.length() > 0) {
                this.a(19, this.ai.G);
                this.bp.a(this.bo.c(), this.ai.F, this.am, 0, 0, this.bw);
            }
            else if (this.ai.m.length() > 0) {
                this.a(28, this.ai.G);
                this.bp.a(this.bo.c(), this.ai.F, this.am, this.bw);
            }
            else if (this.ai.u != 0) {
                this.a(20, this.ai.G);
                this.bp.d(this.bw);
            }
            else if (this.ai.v != 0) {
                this.a(21, this.ai.G);
                this.bp.a(5, this.bw);
            }
            else if (this.ai.w != 0) {
                this.a(23, this.ai.G);
                this.bp.a(this.ai.w);
            }
            else if (!TextUtils.isEmpty(this.ai.A)) {
                this.a(26, this.ai.G);
                this.bp.b(com.google.android.finsky.m.a.dn(), this.ai.A, this.bw);
            }
            else if (!TextUtils.isEmpty(this.ai.z)) {
                this.a(27, this.ai.G);
                this.bp.a(this.ai.z, this.bw);
            }
            else if (this.ai.y != 0)
                this.bp.a(7, this.bw);
            else if (com.google.android.finsky.m.a.dj().a(12622982) && this.ai.t.length() > 0) {
                this.a(22, this.ai.G);
                this.bp.a(this.ai, 0, 0, -1, this.bw);
            }
            else if (this.ai.bn_()) {
                this.a(29, this.ai.G);
                this.bp.a(com.google.android.finsky.m.a.dn(), this.ai.E, 0, this.bw);
            }
            else {
                this.a(0, this.ai.G);
                v0 = new Intent("android.intent.action.VIEW");
                v0.setData(Uri.parse(this.bF));
                v0.addFlags(268435456);
                v0.putExtra("dont_resolve_again", 1);
                com.google.android.finsky.m.a.bn().a(this.h(), v0);
            }
        }
    }

}
