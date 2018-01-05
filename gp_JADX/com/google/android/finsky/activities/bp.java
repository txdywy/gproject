package com.google.android.finsky.activities;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.android.volley.C0657w;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.at.C1507b;
import com.google.android.finsky.billing.common.C1804v;
import com.google.android.finsky.by.C2206c;
import com.google.android.finsky.ch.C2280a;
import com.google.android.finsky.cu.C2415b;
import com.google.android.finsky.detailspage.aq;
import com.google.android.finsky.dfemodel.C1031w;
import com.google.android.finsky.dfemodel.C2719i;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.p111d.C2473o;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.pagesystem.C1037e;
import com.google.android.finsky.pagesystem.C1052j;
import com.google.android.finsky.utils.FinskyLog;
import com.google.wireless.android.a.a.a.a.ce;
import com.squareup.leakcanary.C7582R;
import java.util.Collection;

public abstract class bp extends C1052j {
    public Document f6511a;
    public C2719i a_;
    public C2280a b_;
    public Bundle f6512c = new Bundle();
    public long c_;
    public boolean d_ = false;
    public boolean e_;
    public final C2206c f6513f = C1473m.f7980a.ah();
    public ce f6514g = C2482j.m13283a(k_());
    public C2473o f6515h = null;

    public abstract void j_();

    public abstract int k_();

    protected final void cg_() {
        if (this.a_ != null) {
            C2482j.m13285a(this.f6514g, this.a_.m14724d());
        }
        if (this.f6511a != null) {
            if (this.f6515h == null) {
                this.f6515h = new C2473o(209, this);
            }
            this.f6515h.m13203a(this.f6511a.f14885a.f12087D);
            if (l_() && !this.d_) {
                mo1219a(this.f6515h);
                this.d_ = true;
            }
        }
        j_();
        FinskyLog.m21659a("Page [class=%s] loaded in [%s ms] (hasDetailsDataLoaded? %b)", getClass().getSimpleName(), Long.valueOf(System.currentTimeMillis() - this.c_), Boolean.valueOf(l_()));
    }

    public final boolean l_() {
        return this.a_ != null && this.a_.mo2861a();
    }

    public void mo136b(Bundle bundle) {
        this.c_ = System.currentTimeMillis();
        this.f6511a = (Document) this.f760q.getParcelable("finsky.DetailsDataBasedFragment.document");
        super.mo136b(bundle);
    }

    public View mo970a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View a = super.mo970a(layoutInflater, viewGroup, bundle);
        this.e_ = C1473m.f7980a.av().m9286k(viewGroup.getResources());
        return a;
    }

    public void mo139d(Bundle bundle) {
        String str;
        super.mo139d(bundle);
        if (this.f6511a == null) {
            str = null;
        } else {
            str = this.f6511a.f14885a.f12117x;
        }
        this.b_ = new C2280a(this, str);
        if (bundle != null) {
            this.f6512c = bundle;
        }
        this.bs.m16127a(3, null);
        ac();
        if (this.a_ == null) {
            aa();
        } else {
            this.a_.m11918a((C1031w) this);
            this.a_.m11917a((C0657w) this);
        }
        m_();
    }

    public void mo980v() {
        super.mo980v();
        C2415b.m12124a(this.bp);
        this.b_.m11751a();
    }

    public void mo979u() {
        super.mo979u();
        this.b_.m11752b();
    }

    public final void mo140e(Bundle bundle) {
        if (this.f6512c != null) {
            bundle.putAll(this.f6512c);
        }
        super.mo140e(bundle);
    }

    public void aa() {
        String str;
        if (this.a_ != null) {
            this.a_.m11922b((C1031w) this);
            this.a_.m11921b((C0657w) this);
        }
        C1473m.f7980a.ab();
        Collection b = C1804v.m9805b(C1473m.f7980a.ah().mo2811a(this.bo.mo1620b()));
        if (this.f6511a == null) {
            str = null;
        } else {
            str = this.f6511a.f14885a.f12096c;
        }
        this.a_ = new C2719i(this.bo, this.bF, false, str, b);
        this.a_.m11918a((C1031w) this);
        this.a_.m11917a((C0657w) this);
    }

    public final void m_() {
        if (m610k()) {
            if ((this.f6511a != null ? 1 : null) != null) {
                if (l_()) {
                    if (this.a_.m14722b() == null) {
                        C1507b.m8844a(this.f730B, this, null, this.bn.getString(C7582R.string.details_page_error), this.bw, 10);
                    } else {
                        this.f6511a = this.a_.m14722b();
                        int i = Integer.MIN_VALUE;
                        if (this.f6511a.f14885a.f12099f == 2) {
                            i = 3;
                        }
                        m603h().setVolumeControlStream(i);
                    }
                }
                this.b_.m11753c();
                super.m_();
            }
        }
    }

    public final int ab() {
        return this.f6511a.f14885a.f12099f;
    }

    public void mo138d() {
        if (this.a_ != null) {
            this.a_.m11922b((C1031w) this);
            this.a_.m11921b((C0657w) this);
            if (this instanceof aq) {
                this.a_ = null;
            }
        }
        super.mo138d();
    }

    public final ce getPlayStoreUiElement() {
        return this.f6514g;
    }

    public final void f_(int i) {
        if (i == 10 && m603h() != null) {
            if (m603h() instanceof C1037e) {
                ((C1037e) m603h()).mo1244m();
            } else {
                FinskyLog.m21669e("Dialog not hosted by PageFragmentHost. Cannot navigate back.", new Object[0]);
            }
        }
    }
}
