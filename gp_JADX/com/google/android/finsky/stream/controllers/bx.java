package com.google.android.finsky.stream.controllers;

import android.content.Context;
import android.view.View;
import com.google.android.finsky.api.C1287h;
import com.google.android.finsky.ba.C1556d;
import com.google.android.finsky.bg.C1611k;
import com.google.android.finsky.bg.C1625z;
import com.google.android.finsky.dfemodel.C2720j;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.layout.play.al;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.p147y.C4808a;
import com.google.android.finsky.playcard.ab;
import com.google.android.finsky.stream.base.C4250b;
import com.google.android.finsky.stream.base.playcluster.C4281c;
import com.google.android.finsky.stream.base.playcluster.C4283e;
import com.google.android.finsky.stream.controllers.view.PlayCardRateClusterView;
import com.google.android.play.layout.d;
import com.squareup.leakcanary.C7582R;

public final class bx extends C4250b implements C1625z, ab {
    public final C4808a f21979a;
    public final C1287h f21980b;
    public final C4283e f21981o;
    public int f21982p;

    public bx(Context context, C3748a c3748a, C4808a c4808a, ad adVar, C4283e c4283e, C1611k c1611k, C1556d c1556d, C2495w c2495w, C1287h c1287h) {
        super(context, c3748a, adVar, c1611k, c1556d, c2495w, false);
        this.f21979a = c4808a;
        this.f21981o = c4283e;
        this.f21980b = c1287h;
    }

    public final void mo4050a(C2720j c2720j) {
        int i = 0;
        super.mo4050a(c2720j);
        if (!this.f21979a.m22587a(this.g.f14908a, false)) {
            i = 1;
        }
        this.f21982p = i;
    }

    public final int mo1508a() {
        return this.f21982p;
    }

    public final int mo1509a(int i) {
        return C7582R.layout.play_card_rate_cluster;
    }

    public final void mo1510a(View view, int i) {
        PlayCardRateClusterView playCardRateClusterView = (PlayCardRateClusterView) view;
        Document document = this.g.f14908a;
        playCardRateClusterView.setClusterFadeOutListener(this);
        playCardRateClusterView.mo4240a(document).mo4241a(al.f18768a[C4281c.m19883a(this.l, false)], this.f21979a, this.f21980b.mo2015a(), this.f, this, this.f21981o, this.h, this.i);
        playCardRateClusterView.m13750a(document, this.k);
        playCardRateClusterView.setCardContentHorizontalPadding(this.k);
    }

    public final void mo1511b(View view, int i) {
        ((PlayCardRateClusterView) view).Z_();
    }

    public final void mo1448a(Document document, d dVar) {
        this.f21979a.m22589b(document.f14885a.f12096c);
        this.C.mo4087a(this, 0, 1, true);
    }

    public final void mo4174b() {
        this.C.mo4088b(this, 0, 1);
    }
}
