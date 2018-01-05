package com.google.android.finsky.stream.controllers;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.widget.ff;
import android.view.View;
import com.google.android.finsky.ba.C1556d;
import com.google.android.finsky.bg.C1611k;
import com.google.android.finsky.dfemodel.C2720j;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.stream.base.C4250b;
import com.google.android.finsky.stream.controllers.view.JpkrFlatDealsAndPromosClusterView;
import com.squareup.leakcanary.C7582R;

public final class ay extends C4250b {
    public final ff f21879a;
    public int f21880b;
    public int f21881o;
    public int f21882p;
    public int f21883q;
    public float f21884r;
    public int f21885s;
    public ba f21886t;

    public ay(Context context, C3748a c3748a, ff ffVar, ad adVar, C1611k c1611k, C1556d c1556d, C2495w c2495w) {
        super(context, c3748a, adVar, c1611k, c1556d, c2495w, false);
        this.f21879a = ffVar;
    }

    public final void mo4050a(C2720j c2720j) {
        super.mo4050a(c2720j);
        this.f21885s = this.l;
        Resources resources = this.e.getResources();
        this.f21882p = resources.getInteger(C7582R.integer.jpkr_flat_deals_and_promos_banner_per_row_default);
        this.f21884r = ((float) resources.getInteger(C7582R.integer.jpkr_flat_deals_and_promos_peek_percent_default)) / 100.0f;
        this.l = this.f21882p;
        this.f21886t = new ba(this, this.g.f14908a.m14638a());
        this.f21880b = C7582R.layout.jpkr_flat_deals_and_promos_cluster;
        this.f21881o = C7582R.layout.jpkr_flat_deals_and_promos_item;
        this.k = this.d.m9278c(resources);
        this.f21883q = resources.getDimensionPixelSize(C7582R.dimen.jpkr_flat_deals_and_promos_description_margin_top) + ((int) ((((float) resources.getDimensionPixelSize(C7582R.dimen.jpkr_flat_deals_and_promos_description_text_size)) * 2.0f) * 1.2f));
    }

    public final int mo1508a() {
        return 1;
    }

    public final int mo1509a(int i) {
        return this.f21880b;
    }

    public final void mo1510a(View view, int i) {
        JpkrFlatDealsAndPromosClusterView jpkrFlatDealsAndPromosClusterView = (JpkrFlatDealsAndPromosClusterView) view;
        Document document = this.g.f14908a;
        az azVar = new az(this, jpkrFlatDealsAndPromosClusterView, document, this.g, this.f21881o, this.f21885s);
        Bundle bundle = this.D != null ? ((bb) this.D).f21902a : null;
        jpkrFlatDealsAndPromosClusterView.m17483a(document.f14885a.f12087D, this.h);
        jpkrFlatDealsAndPromosClusterView.m17486a(this.g.mo3119b(), document.f14885a.f12100g, null, null, null, null, null, 0, azVar, this.f21886t, this.f21885s, this.k, this.f21879a, bundle, null);
    }

    public final void mo1511b(View view, int i) {
        JpkrFlatDealsAndPromosClusterView jpkrFlatDealsAndPromosClusterView = (JpkrFlatDealsAndPromosClusterView) view;
        if (this.D == null) {
            this.D = new bb();
            ((bb) this.D).f21902a = new Bundle();
        }
        ((bb) this.D).f21902a.clear();
        jpkrFlatDealsAndPromosClusterView.mo3581a(((bb) this.D).f21902a);
        jpkrFlatDealsAndPromosClusterView.Z_();
    }
}
