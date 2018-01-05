package com.google.android.finsky.pagesystem;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.support.v4.app.Fragment;
import android.support.v4.app.s;
import android.text.TextUtils;
import android.transition.Transition;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.android.volley.VolleyError;
import com.google.android.finsky.a.c;
import com.google.android.finsky.api.c;
import com.google.android.finsky.api.h;
import com.google.android.finsky.api.m;
import com.google.android.finsky.at.m;
import com.google.android.finsky.at.n;
import com.google.android.finsky.ba.c;
import com.google.android.finsky.ba.e;
import com.google.android.finsky.bg.h;
import com.google.android.finsky.d.a;
import com.google.android.finsky.d.ad;
import com.google.android.finsky.d.j;
import com.google.android.finsky.d.t;
import com.google.android.finsky.d.w;
import com.google.android.finsky.dfemodel.DfeToc;
import com.google.android.finsky.dfemodel.ab;
import com.google.android.finsky.dq.h;
import com.google.android.finsky.layoutswitcher.e;
import com.google.android.finsky.navigationmanager.a;
import com.google.android.finsky.navigationmanager.e;
import com.google.android.finsky.providers.d;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.play.headerlist.PlayHeaderListLayout;
import com.google.android.play.image.w;

public class com.google.android.finsky.pagesystem.b extends Fragment implements com.android.volley.w, com.google.android.finsky.a.d, com.google.android.finsky.at.m, com.google.android.finsky.d.ah, com.google.android.finsky.dfemodel.w, com.google.android.finsky.layoutswitcher.h, com.google.android.finsky.pagesystem.f
{

    public long af;
    public boolean bA;
    public boolean bB;
    public int bC;
    public com.google.android.play.image.w bD;
    public com.google.android.finsky.d.t bE;
    public com.google.android.finsky.pagesystem.e bm;
    public Context bn;
    public com.google.android.finsky.api.c bo;
    public com.google.android.finsky.navigationmanager.a bp;
    public com.google.android.finsky.a.c bq;
    public com.google.android.finsky.pagesystem.g br;
    public com.google.android.finsky.layoutswitcher.e bs;
    public ViewGroup bt;
    public String bu;
    public boolean bv;
    public com.google.android.finsky.d.w bw;
    public boolean bx;
    public Runnable by;
    public boolean bz;
    public com.google.android.finsky.dfemodel.ab f_;
    public Handler i;
    public DfeToc k_;
    public com.google.android.finsky.ba.c n_;
    public com.google.android.finsky.api.h r_;
    public com.google.android.finsky.d.a y_;

    b() {
        Fragment();
        this.af = com.google.android.finsky.d.j.j();
        this.f(new Bundle());
    }

    public void O_() {
        this.bs.a();
    }

    public boolean X() {
        return 0;
    }

    public int Y() {
        return 2130968959;
    }

    public int Y_() {
        return this.bn.getResources().getColor(2131558777);
    }

    public abstract int Z();

    public View a(LayoutInflater p0, ViewGroup p1, Bundle p2) {
        if (this.bz != 0)
            this.b(this.y_.a(this.q.getBundle("finsky.PageFragment.loggingContext")));
        v0 = (ContentFrame)p0.inflate(this.Y(), p1, 0);
        this.bt = v0.a(p0, this.Z(), 2131756030);
        this.by = new com.google.android.finsky.pagesystem.c(this, v0);
        if (!this.ag())
            this.by.run();
        this.bx = 0;
        this.bs = this.a(v0);
        FinskyLog.f("Views inflated", new Object[0]);
        return v0;
    }

    public com.google.android.finsky.layoutswitcher.e a(ContentFrame p0) {
        return new com.google.android.finsky.layoutswitcher.e(p0, 2131756030, 2131755388, this, 2);
    }

    public void a(int p0, Bundle p1) {
        com.google.android.finsky.at.n.a(p0, p1);
        v0 = this.h();
        if (v0 instanceof com.google.android.finsky.at.m)
            ((com.google.android.finsky.at.m)v0).a(p0, p1);
    }

    public void a(Activity p0) {
        ((com.google.android.finsky.pagesystem.h)com.google.android.finsky.providers.d.a(com.google.android.finsky.pagesystem.h)).a(this);
        this.i = new Handler(p0.getMainLooper());
        super.a(p0);
    }

    public void a(VolleyError p0) {
        if (this.bz == 0 && this.at())
            this.a(com.google.android.finsky.api.m.c(this.bn, p0));
    }

    public void a(com.google.android.finsky.d.ad p0) {
        com.google.android.finsky.d.j.a(this.i, this.af, this, p0, this.bw);
    }

    public void a(com.google.android.finsky.d.w p0) {
        v0 = new Bundle();
        p0.a(v0);
        this.a("finsky.PageFragment.loggingContext", v0);
    }

    public final void a(DfeToc p0) {
        if (p0 == 0 && !this.X())
            FinskyLog.e("Attempted to set a null DfeToc in PageFragment", new Object[0]);
        this.a("finsky.PageFragment.toc", p0);
    }

    public void a(CharSequence p0) {
        if (this.bs == 0) {
            v0 = this.h();
            if (v0 == 0)
                v3 = 1;
            else
                v3 = 0;
            if (v3 == 0) {
                v2 = v0 instanceof com.google.android.finsky.pagesystem.i;
                if (v2 != 0)
                    v0 = ((com.google.android.finsky.pagesystem.i)v0).p();
                else
                    v0 = 0;
            }
            else {
                v0 = 0;
                v2 = 0;
            }
            v6 = new Object[5];
            v6[0] = this.getClass().getSimpleName();
            v6[1] = Boolean.valueOf(this.bx);
            v6[2] = Boolean.valueOf(v3);
            v6[3] = Boolean.valueOf(v2);
            v6[4] = Boolean.valueOf(v0);
            FinskyLog.e("fragmentClass=[%s], mSaveInstanceStateCalled=[%s], activityNull=[%s], isStateSaveMonitor=[%s], isStateSaved=[%s]", v6);
        }
        else {
            this.bs.a(1, p0);
            if (this.bm != 0)
                this.bm.z();
            if (this.bA != 0)
                this.j(1705);
        }
    }

    public final void a(String p0, int p1) {
        this.q.putInt(p0, p1);
    }

    public final void a(String p0, Parcelable p1) {
        this.q.putParcelable(p0, p1);
    }

    public abstract void aa();

    public int ab() {
        return 0;
    }

    public void ac() {
    }

    public int ad() {
        return 0;
    }

    public Transition ae() {
        return new com.google.android.finsky.dq.h(0);
    }

    public int af() {
        return com.google.android.finsky.bg.h.a(this.bn, 0);
    }

    public boolean ag() {
        return 0;
    }

    public int ak() {
        return 1;
    }

    public com.google.android.finsky.d.ad al() {
        return this;
    }

    public boolean am() {
        return 0;
    }

    public boolean an() {
        return this.am();
    }

    public final boolean at() {
        v0 = this.h();
        if (this.bx == 0 && v0 != 0 && ((!(v0 instanceof com.google.android.finsky.pagesystem.i)) || !((com.google.android.finsky.pagesystem.i)v0).p()))
            v0 = 1;
        else
            v0 = 0;
        return v0;
    }

    public final void au() {
        this.bs.a(350);
    }

    public void b(int p0, Bundle p1) {
        com.google.android.finsky.at.n.b(p0, p1);
        v0 = this.h();
        if (v0 instanceof com.google.android.finsky.at.m)
            ((com.google.android.finsky.at.m)v0).b(p0, p1);
    }

    public void b(Bundle p0) {
        super.b(p0);
        if (p0 != 0)
            v0 = 1;
        else
            v0 = 0;
        this.bB = v0;
        this.bu = this.q.getString("finsky.PageFragment.dfeAccount");
        this.k_ = (DfeToc)this.q.getParcelable("finsky.PageFragment.toc");
        this.bo = this.r_.a(this.bu);
        if (p0 != 0)
            this.b(this.y_.a(p0));
        else if (this.bw == 0)
            this.b(this.y_.a(this.q.getBundle("finsky.PageFragment.loggingContext")));
        this.bx = 0;
    }

    public final void b(com.google.android.finsky.d.w p0) {
        if (this.bw != p0) {
            this.bw = p0;
            if (this.bm != 0 && this.n_.dj().a(12644614))
                this.bm.a_(p0);
        }
    }

    public final void b(String p0, String p1) {
        this.q.putString(p0, p1);
    }

    public final void c(String p0) {
        if (!TextUtils.isEmpty(p0))
            this.b("finsky.PageFragment.dfeAccount", p0);
    }

    public abstract void cg_();

    public void d() {
        super.d();
        this.bt = 0;
        this.bs = 0;
        this.by = 0;
        if (this.bq != 0) {
            this.bq.a(0);
            this.bq.k();
        }
        this.bz = 1;
    }

    public void d(Bundle p0) {
        super.d(p0);
        if ((com.google.android.finsky.pagesystem.e)this.h() != this.bm) {
            this.bm = (com.google.android.finsky.pagesystem.e)this.h();
            this.bn = this.h();
            this.bp = this.bm.y_();
            this.bq = this.bm.l();
            this.bm.a_(this.bw);
        }
        if (this.h() instanceof com.google.android.finsky.pagesystem.g)
            this.br = (com.google.android.finsky.pagesystem.g)this.h();
        if (this.bm != 0)
            this.bm.d(0);
        this.bx = 0;
        if (this.bq != 0)
            this.bq.a(this);
        if (com.google.android.finsky.navigationmanager.e.a()) {
            v0 = this.ae();
            if (v0 != 0)
                super.L().i = v0;
        }
        FinskyLog.f("Views bound", new Object[0]);
    }

    public final void d(String p0, boolean p1) {
        this.q.putBoolean(p0, p1);
    }

    public void e(Bundle p0) {
        this.bw.a(p0);
        this.bx = 1;
    }

    public void f_(int p0) {
    }

    public final com.google.android.finsky.d.ad getParentNode() {
        return 0;
    }

    public void h_() {
        if (this.bq != 0)
            this.bq.a(this.bt);
        super.h_();
        if (this.R != 0 && this.R.getParent() != 0)
            ((ViewGroup)this.R.getParent()).clearDisappearingChildren();
    }

    public final void i(int p0) {
        if (this.n_.dj().a(12627947) && this.bB != 0)
            this.bA = 0;
        else if (this.bA == 0) {
            this.bE.a(this.bw, 1703, p0);
            this.bC = p0;
            this.bA = 1;
        }
    }

    public final void j(int p0) {
        this.k(p0);
        this.bA = 0;
    }

    public final void k(int p0) {
        if (this.bA != 0 && this.bC > 0)
            this.bE.a(this.bw, p0, this.bC);
    }

    public void m() {
        com.google.android.finsky.d.j.a(this.i, this.af, this, this.bw);
    }

    public void m_() {
        if (this.k()) {
            this.O_();
            this.cg_();
            FinskyLog.f("Views rebound", new Object[0]);
        }
    }

    public final com.google.android.finsky.d.w n() {
        return this.bw;
    }

    public void n_() {
        this.aa();
    }

    public void o_() {
        this.af = com.google.android.finsky.d.j.j();
    }

    public void p_() {
        if (this.bt instanceof PlayHeaderListLayout) {
            ((PlayHeaderListLayout)this.bt).a(new ColorDrawable(0), 1);
            ((PlayHeaderListLayout)this.bt).setHeaderShadowMode(2);
        }
    }

    public void q_() {
        if (this.bt instanceof PlayHeaderListLayout) {
            ((PlayHeaderListLayout)this.bt).a(new ColorDrawable(this.af()), 1);
            ((PlayHeaderListLayout)this.bt).postDelayed(new com.google.android.finsky.pagesystem.d(this, (PlayHeaderListLayout)this.bt), 200);
        }
    }

    public void u() {
        super.u();
        com.google.android.finsky.d.j.c(this);
        this.bx = 0;
        if (this.bv != 0) {
            this.bv = 0;
            this.m_();
        }
    }

    public void v() {
        this.j(1706);
        super.v();
    }

}
