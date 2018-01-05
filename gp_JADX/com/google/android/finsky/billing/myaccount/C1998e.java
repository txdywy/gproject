package com.google.android.finsky.billing.myaccount;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.em;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.finsky.headerlistlayout.C3167i;
import com.google.android.finsky.headerlistlayout.FinskyHeaderListLayout;
import com.google.android.finsky.layoutswitcher.C3166e;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.pagesystem.C1045b;
import com.google.android.finsky.pagesystem.ContentFrame;
import com.google.android.finsky.recyclerview.C3984a;
import com.google.wireless.android.a.a.a.a.ce;
import com.squareup.leakcanary.C7582R;

public abstract class C1998e extends C1045b implements ad {
    public final Bundle f10236a = new Bundle();
    public String f10237c;
    public RecyclerView f10238e;
    public em f10239f;
    public final ce x_ = C2482j.m13283a(ao());

    public abstract em ai();

    public abstract int aj();

    public abstract int ao();

    public void mo136b(Bundle bundle) {
        super.mo136b(bundle);
        this.f740L = true;
    }

    public View mo970a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View a = super.mo970a(layoutInflater, viewGroup, bundle);
        FinskyHeaderListLayout finskyHeaderListLayout = (FinskyHeaderListLayout) this.bt;
        finskyHeaderListLayout.a(new C2000f(finskyHeaderListLayout.getContext()));
        this.f10237c = viewGroup.getContext().getString(aj());
        this.f10238e = (RecyclerView) this.bt.findViewById(C7582R.id.recycler_view);
        viewGroup.getContext();
        this.f10238e.setLayoutManager(new LinearLayoutManager());
        this.f10238e.setAdapter(new C3984a());
        return a;
    }

    public final void mo139d(Bundle bundle) {
        super.mo139d(bundle);
        ac();
        if (ah()) {
            cg_();
        } else {
            au();
            aa();
        }
        this.bq.mo1259a();
    }

    protected final C3166e mo1299a(ContentFrame contentFrame) {
        return new C3167i(contentFrame, this);
    }

    protected final int mo1298Z() {
        return C7582R.layout.header_list_container;
    }

    public final void ac() {
        this.bm.mo1241c(this.f10237c);
        this.bm.mo1237a(0, true);
        this.bm.mo1246z();
    }

    public boolean ah() {
        return true;
    }

    public void aa() {
    }

    protected final int ak() {
        return 3;
    }

    public void cg_() {
        if (this.f10239f == null) {
            this.f10239f = ai();
            this.f10238e.setAdapter(this.f10239f);
        }
    }

    public void mo138d() {
        if (this.f10238e != null) {
            this.f10238e = null;
        }
        if (this.f10239f != null) {
            this.f10239f = null;
        }
        super.mo138d();
    }

    public ce getPlayStoreUiElement() {
        return this.x_;
    }
}
