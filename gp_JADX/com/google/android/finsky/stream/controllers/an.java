package com.google.android.finsky.stream.controllers;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.widget.ff;
import android.view.View;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.adapters.C1171n;
import com.google.android.finsky.ba.C1556d;
import com.google.android.finsky.bg.C1611k;
import com.google.android.finsky.dfemodel.C2712a;
import com.google.android.finsky.dfemodel.C2720j;
import com.google.android.finsky.layout.play.PlayHighlightsBannerView;
import com.google.android.finsky.layout.play.ai;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.stream.base.C4250b;
import com.squareup.leakcanary.C7582R;

public final class an extends C4250b {
    public ai f21721a;
    public final ff f21722b;

    public an(Context context, C3748a c3748a, ff ffVar, ad adVar, C1611k c1611k, C1556d c1556d, C2495w c2495w) {
        super(context, c3748a, adVar, c1611k, c1556d, c2495w, false);
        this.f21722b = ffVar;
    }

    public final void mo4050a(C2720j c2720j) {
        super.mo4050a(c2720j);
        this.f21721a = new ai();
    }

    public final int mo1508a() {
        return 1;
    }

    public final int mo1509a(int i) {
        return C7582R.layout.play_highlights_banner;
    }

    public final void mo1510a(View view, int i) {
        PlayHighlightsBannerView playHighlightsBannerView = (PlayHighlightsBannerView) view;
        C1171n c1171n = new C1171n(this.e, C1473m.f7980a.be(), this.f, this.g.f14908a, this.g, playHighlightsBannerView, this.i);
        Bundle bundle = this.D != null ? ((ao) this.D).f21723a : null;
        if (this.g != null) {
            C2712a c2712a = this.g;
            C1171n c1171n2 = c1171n;
            playHighlightsBannerView.m13757a(c1171n2, this.f21721a, this.l, this.f21722b, bundle, this.h, c2712a.f14908a.f14885a.f12087D, null);
        }
    }

    public final void mo1511b(View view, int i) {
        PlayHighlightsBannerView playHighlightsBannerView = (PlayHighlightsBannerView) view;
        if (this.D == null) {
            this.D = new ao();
            ((ao) this.D).f21723a = new Bundle();
        }
        ((ao) this.D).f21723a.clear();
        playHighlightsBannerView.mo2995a(((ao) this.D).f21723a);
        playHighlightsBannerView.Z_();
    }
}
