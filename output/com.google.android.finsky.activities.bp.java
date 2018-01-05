package com.google.android.finsky.activities;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.u;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.finsky.api.c;
import com.google.android.finsky.at.b;
import com.google.android.finsky.bg.k;
import com.google.android.finsky.billing.common.v;
import com.google.android.finsky.by.c;
import com.google.android.finsky.ch.a;
import com.google.android.finsky.cu.b;
import com.google.android.finsky.cv.a.cv;
import com.google.android.finsky.d.j;
import com.google.android.finsky.d.o;
import com.google.android.finsky.detailspage.aq;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.dfemodel.i;
import com.google.android.finsky.dfemodel.k;
import com.google.android.finsky.layoutswitcher.e;
import com.google.android.finsky.m;
import com.google.android.finsky.pagesystem.b;
import com.google.android.finsky.pagesystem.e;
import com.google.android.finsky.pagesystem.j;
import com.google.android.finsky.utils.FinskyLog;
import com.google.wireless.android.a.a.a.a.ce;

public class com.google.android.finsky.activities.bp extends com.google.android.finsky.pagesystem.j
{

    public Document a;
    public com.google.android.finsky.dfemodel.i a_;
    public com.google.android.finsky.ch.a b_;
    public Bundle c;
    public long c_;
    public boolean d_;
    public boolean e_;
    public final com.google.android.finsky.by.c f;
    public com.google.wireless.android.a.a.a.a.ce g;
    public com.google.android.finsky.d.o h;

    bp() {
        com.google.android.finsky.pagesystem.j();
        this.c = new Bundle();
        this.g = com.google.android.finsky.d.j.a(this.k_());
        this.h = 0;
        this.d_ = 0;
        this.f = com.google.android.finsky.m.a.ah();
    }

    public View a(LayoutInflater p0, ViewGroup p1, Bundle p2) {
        this.e_ = com.google.android.finsky.m.a.av().k(p1.getResources());
        return super.a(p0, p1, p2);
    }

    public void aa() {
        if (this.a_ != 0) {
            this.a_.b(this);
            this.a_.b(this);
        }
        com.google.android.finsky.m.a.ab();
        if (this.a == 0)
            v4 = 0;
        else
            v4 = this.a.a.c;
        this.a_ = new com.google.android.finsky.dfemodel.i(this.bo, this.bF, 0, v4, com.google.android.finsky.billing.common.v.b(com.google.android.finsky.m.a.ah().a(this.bo.b())));
        this.a_.a(this);
        this.a_.a(this);
    }

    public final int ab() {
        return this.a.a.f;
    }

    public void b(Bundle p0) {
        this.c_ = System.currentTimeMillis();
        this.a = (Document)this.q.getParcelable("finsky.DetailsDataBasedFragment.document");
        super.b(p0);
    }

    protected final void cg_() {
        if (this.a_ != 0)
            com.google.android.finsky.d.j.a(this.g, this.a_.d());
        if (this.a != 0) {
            if (this.h == 0)
                this.h = new com.google.android.finsky.d.o(209, this);
            this.h.a(this.a.a.D);
            if (this.l_() && this.d_ == 0) {
                this.a(this.h);
                this.d_ = 1;
            }
        }
        this.j_();
        v1 = new Object[3];
        v1[0] = this.getClass().getSimpleName();
        v1[1] = Long.valueOf(System.currentTimeMillis() - this.c_);
        v1[2] = Boolean.valueOf(this.l_());
        FinskyLog.a("Page [class=%s] loaded in [%s ms] (hasDetailsDataLoaded? %b)", v1);
    }

    public void d() {
        if (this.a_ != 0) {
            this.a_.b(this);
            this.a_.b(this);
            if (this instanceof com.google.android.finsky.detailspage.aq)
                this.a_ = 0;
        }
        super.d();
    }

    public void d(Bundle p0) {
        super.d(p0);
        if (this.a == 0)
            v0 = 0;
        else
            v0 = this.a.a.x;
        this.b_ = new com.google.android.finsky.ch.a(this, v0);
        if (p0 != 0)
            this.c = p0;
        this.bs.a(3, 0);
        this.ac();
        if (this.a_ == 0)
            this.aa();
        else {
            this.a_.a(this);
            this.a_.a(this);
        }
        this.m_();
    }

    public final void e(Bundle p0) {
        if (this.c != 0)
            p0.putAll(this.c);
        super.e(p0);
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
        return this.g;
    }

    public abstract void j_();

    public abstract int k_();

    public final boolean l_() {
        if (this.a_ != 0 && this.a_.a())
            v0 = 1;
        else
            v0 = 0;
        return v0;
    }

    public final void m_() {
        if (this.k()) {
            if (this.a != 0)
                v0 = 1;
            else
                v0 = 0;
            if (v0 != 0) {
                if (this.l_()) {
                    if (this.a_.b() == 0)
                        com.google.android.finsky.at.b.a(this.B, this, 0, this.bn.getString(2131952051), this.bw, 10);
                    else {
                        this.a = this.a_.b();
                        v0 = -2147483648;
                        if (this.a.a.f == 2)
                            v0 = 3;
                        this.h().setVolumeControlStream(v0);
                    }
                }
                this.b_.c();
                super.m_();
            }
        }
    }

    public void u() {
        super.u();
        this.b_.b();
    }

    public void v() {
        super.v();
        com.google.android.finsky.cu.b.a(this.bp);
        this.b_.a();
    }

}
