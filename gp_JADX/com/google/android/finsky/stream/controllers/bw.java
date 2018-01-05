package com.google.android.finsky.stream.controllers;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import com.google.android.finsky.api.C1287h;
import com.google.android.finsky.ba.C1556d;
import com.google.android.finsky.bg.C1611k;
import com.google.android.finsky.bg.C1625z;
import com.google.android.finsky.dfemodel.C2720j;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.layout.play.ak;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.p147y.C4808a;
import com.google.android.finsky.playcard.ab;
import com.google.android.finsky.stream.base.C4250b;
import com.google.android.finsky.stream.base.playcluster.C4283e;
import com.google.android.finsky.stream.controllers.view.PlayCardRateAndSuggestClusterView;
import com.google.android.play.layout.d;
import com.squareup.leakcanary.C7582R;

public final class bw extends C4250b implements C1625z, ab {
    public final C4808a f21974a;
    public final C1287h f21975b;
    public final boolean f21976o;
    public final C4283e f21977p;
    public int f21978q;

    public bw(Context context, C3748a c3748a, C4808a c4808a, ad adVar, C4283e c4283e, C1611k c1611k, C1556d c1556d, C2495w c2495w, C1287h c1287h) {
        super(context, c3748a, adVar, c1611k, c1556d, c2495w, false);
        this.f21974a = c4808a;
        this.f21977p = c4283e;
        this.f21975b = c1287h;
        Resources resources = context.getResources();
        this.f21976o = C1611k.m9271m(resources) > resources.getDimensionPixelSize(C7582R.dimen.play_min_height_for_large_templates);
    }

    public final void mo4050a(C2720j c2720j) {
        int i = 1;
        super.mo4050a(c2720j);
        if (this.f21974a.m22587a(this.g.f14908a, true)) {
            i = 0;
        }
        this.f21978q = i;
    }

    public final int mo1508a() {
        return this.f21978q;
    }

    public final int mo1509a(int i) {
        return C7582R.layout.play_card_rate_and_suggest_cluster;
    }

    public final void mo1510a(View view, int i) {
        PlayCardRateAndSuggestClusterView playCardRateAndSuggestClusterView = (PlayCardRateAndSuggestClusterView) view;
        Document document = this.g.f14908a;
        playCardRateAndSuggestClusterView.mo4240a(document).mo4241a(ak.m17589a(document.m14641a(0).f14885a.f12098e, this.l, this.f21976o), this.f21974a, this.f21975b.mo2015a(), this.f, this, this.f21977p, this.h, this.i);
        playCardRateAndSuggestClusterView.m13750a(document, this.k);
    }

    public final void mo1511b(View view, int i) {
        PlayCardRateAndSuggestClusterView playCardRateAndSuggestClusterView = (PlayCardRateAndSuggestClusterView) view;
        playCardRateAndSuggestClusterView.Z_();
        this.f21977p.m19887a(playCardRateAndSuggestClusterView);
    }

    public final void mo4174b() {
        this.C.mo4088b(this, 0, 1);
    }

    public final void mo1448a(Document document, d dVar) {
        this.f21974a.m22589b(document.f14885a.f12096c);
        this.C.mo4087a(this, 0, 1, true);
    }
}
