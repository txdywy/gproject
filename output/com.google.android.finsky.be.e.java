package com.google.android.finsky.be;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.p;
import android.text.TextUtils;
import com.android.volley.VolleyError;
import com.google.android.finsky.am.a;
import com.google.android.finsky.am.c;
import com.google.android.finsky.api.DfeServerError;
import com.google.android.finsky.api.c;
import com.google.android.finsky.as.e;
import com.google.android.finsky.at.b;
import com.google.android.finsky.at.k;
import com.google.android.finsky.ba.c;
import com.google.android.finsky.ba.e;
import com.google.android.finsky.billing.common.v;
import com.google.android.finsky.by.c;
import com.google.android.finsky.cv.a.cv;
import com.google.android.finsky.d.j;
import com.google.android.finsky.d.w;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.dfemodel.i;
import com.google.android.finsky.dfemodel.k;
import com.google.android.finsky.layoutswitcher.e;
import com.google.android.finsky.m;
import com.google.android.finsky.navigationmanager.a;
import com.google.android.finsky.o;
import com.google.android.finsky.pagesystem.b;
import com.google.android.finsky.pagesystem.e;
import com.google.android.finsky.pagesystem.j;
import com.google.android.finsky.providers.d;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.ba;
import com.google.wireless.android.a.a.a.a.ce;

public final class com.google.android.finsky.be.e extends com.google.android.finsky.pagesystem.j implements com.google.android.finsky.at.m
{

    public com.google.android.finsky.am.a a;
    public com.google.android.finsky.am.c c;
    public final com.google.wireless.android.a.a.a.a.ce f;
    public com.google.android.finsky.dfemodel.i h;

    e() {
        com.google.android.finsky.pagesystem.j();
        this.f = com.google.android.finsky.d.j.a(0);
    }

    public static com.google.android.finsky.be.e a(String p0, String p1, String p2, String p3, String p4, com.google.android.finsky.d.w p5) {
        v0 = new com.google.android.finsky.be.e();
        v0.c(p2);
        v0.a(com.google.android.finsky.m.a.dn(), p0);
        v0.b("finsky.DetailsFragment.continueUrl", p1);
        v0.b("finsky.DetailsFragment.overrideAccount", p2);
        v0.b("finsky.DetailsShimFragment.originalUrl", p3);
        v0.b("finsky.DetailsShimFragment.docid", p4);
        v0.a(p5);
        return v0;
    }

    protected final int Z() {
        return 0;
    }

    public final void a(int p0, Bundle p1) {
        if (p0 == 1)
            this.bp.a(com.google.android.finsky.utils.ba.a("finsky.sw_home_url"));
    }

    public final void a(Activity p0) {
        ((com.google.android.finsky.o)com.google.android.finsky.providers.d.a(com.google.android.finsky.o)).a(this);
        super.a(p0);
    }

    public final void a(VolleyError p0) {
        super.a(p0);
        if (p0 instanceof DfeServerError && com.google.android.finsky.m.a.O().b() && !TextUtils.isEmpty(com.google.android.finsky.utils.ba.a("finsky.sw_home_url")) && TextUtils.equals(Uri.parse(Uri.decode(this.q.getString("finsky.DetailsShimFragment.originalUrl"))).getAuthority(), "play.google.com")) {
            v0 = new com.google.android.finsky.at.k();
            v0.a(2131951705).d(2131953511).e(2131952618).a(1).a(this, 1, 0);
            v0.a().a(this.B, "DetailsShimFragment.errorDialog");
        }
    }

    protected final void aa() {
        if (this.h != 0) {
            this.h.b(this);
            this.h.b(this);
        }
        com.google.android.finsky.m.a.ab();
        this.h = new com.google.android.finsky.dfemodel.i(this.bo, this.bF, 0, this.q.getString("finsky.DetailsShimFragment.docid"), com.google.android.finsky.billing.common.v.b(com.google.android.finsky.m.a.ah().a(this.bo.b())));
        this.h.a(this);
        this.h.a(this);
        this.bs.a(3, 0);
        this.au();
    }

    public final void b(int p0, Bundle p1) {
    }

    protected final void cg_() {
    }

    public final void d() {
        super.d();
        if (this.h != 0) {
            this.h.b(this);
            this.h.b(this);
        }
    }

    public final void d(Bundle p0) {
        super.d(p0);
        this.aa();
    }

    public final void f_(int p0) {
        if (p0 == 10 && this.h() != 0) {
            if (this.h() instanceof com.google.android.finsky.pagesystem.e)
                ((com.google.android.finsky.pagesystem.e)this.h()).m();
            else
                FinskyLog.e("Dialog not hosted by PageFragmentHost. Cannot navigate back.", new Object[0]);
        }
    }

    public final com.google.wireless.android.a.a.a.a.ce getPlayStoreUiElement() {
        return this.f;
    }

    public final void m_() {
        if (!this.bp.d())
            this.bv = this.n_.dj().a(12631400);
        else if (this.h.b() == 0)
            com.google.android.finsky.at.b.a(this.B, this, 0, this.bn.getString(2131952051), this.bw, 10);
        else {
            if (this.a.a())
                this.c.a(this.h.b().a.d);
            if (this.q.getString("finsky.DetailsShimFragment.originalUrl") != 0)
                v5 = 1;
            else
                v5 = 0;
            this.bp.a(this.h.b(), this.bF, this.q.getString("finsky.DetailsFragment.continueUrl"), this.q.getString("finsky.DetailsFragment.overrideAccount"), v5, this.bw);
        }
    }

}
