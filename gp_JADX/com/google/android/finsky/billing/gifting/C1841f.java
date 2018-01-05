package com.google.android.finsky.billing.gifting;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.android.volley.C0660x;
import com.android.volley.VolleyError;
import com.google.android.finsky.api.C1253j;
import com.google.android.finsky.bg.C1611k;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.headerlistlayout.FinskyHeaderListLayout;
import com.google.android.finsky.p111d.C2474c;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.pagesystem.C1037e;
import com.google.android.finsky.pagesystem.C1045b;
import com.google.android.finsky.playcard.ac;
import com.google.android.finsky.providers.C3947d;
import com.google.android.finsky.recyclerview.C3984a;
import com.google.android.finsky.recyclerview.PlayRecyclerView;
import com.google.wireless.android.a.a.a.a.ce;
import com.google.wireless.android.finsky.dfe.nano.ds;
import com.squareup.leakcanary.C7582R;

public final class C1841f extends C1045b implements C0660x, C1840i {
    public final ce f9464a = C2482j.m13283a(16);
    public PlayRecyclerView ag;
    public ac f9465c;
    public C1253j f9466e;
    public ds f9467f;
    public C1839e f9468g;
    public FinskyHeaderListLayout f9469h;
    public C1611k w_;

    protected final int mo1298Z() {
        return C7582R.layout.header_list_container;
    }

    public final void mo1292a(Activity activity) {
        ((C1353a) C3947d.m18649a(C1353a.class)).mo1739a(this);
        super.mo1292a(activity);
    }

    public final void mo136b(Bundle bundle) {
        super.mo136b(bundle);
        this.f740L = true;
    }

    public final View mo970a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View a = super.mo970a(layoutInflater, viewGroup, bundle);
        this.f9469h = (FinskyHeaderListLayout) this.bt;
        this.f9469h.a(new C1842g(this, this.f9469h.getContext()));
        return a;
    }

    public final void mo139d(Bundle bundle) {
        super.mo139d(bundle);
        this.ag = (PlayRecyclerView) this.f9469h.getCurrentListView();
        this.ag.setLayoutManager(new LinearLayoutManager());
        this.ag.setAdapter(new C3984a());
        if (aj()) {
            cg_();
        } else {
            aa();
            au();
        }
        this.bq.mo1259a();
    }

    protected final void aa() {
        this.f9466e = this.bo.mo1653g(this, this);
        this.bw.m13367a(new C2474c(1200));
    }

    protected final void cg_() {
        ac();
        if (this.f9468g == null) {
            int length = this.f9467f.f.length;
            int a = this.f9465c.m18477a(m605i());
            this.f9468g = new C1839e(m605i(), m614p(), this, this, this.f9467f, a, (length / a) + (length % a == 0 ? 0 : 1), this.bw, this.w_);
        }
        this.ag.setAdapter(this.f9468g);
    }

    public final void mo1062a(VolleyError volleyError) {
        super.mo1062a(volleyError);
        this.bw.m13367a(new C2474c(1201).m13212a(this.f9466e.mo1542b()).m13238a((Throwable) volleyError));
        mo1222m();
    }

    public final void mo2463a(Document document, String str) {
        mo1222m();
        this.bp.mo3632a(this.bo.mo1620b(), document, str, 1);
    }

    protected final int ak() {
        return 2;
    }

    private final boolean aj() {
        return this.f9467f != null;
    }

    public final void ac() {
        String str;
        C1037e c1037e = this.bm;
        if (aj()) {
            str = this.f9467f.b;
        } else {
            str = null;
        }
        c1037e.mo1241c(str);
        this.bm.mo1237a(0, true);
        this.bm.mo1246z();
    }

    public final void mo138d() {
        if (this.f9469h != null) {
            this.f9469h.f();
        }
        this.f9468g = null;
        this.f9469h = null;
        this.ag = null;
        super.mo138d();
    }

    public final ce getPlayStoreUiElement() {
        return this.f9464a;
    }

    public final /* synthetic */ void b_(Object obj) {
        this.f9467f = (ds) obj;
        m_();
        this.bw.m13367a(new C2474c(1201).m13212a(this.f9466e.mo1542b()));
    }
}
