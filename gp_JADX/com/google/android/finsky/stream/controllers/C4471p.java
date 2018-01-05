package com.google.android.finsky.stream.controllers;

import android.content.Context;
import android.support.v7.widget.ff;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.ba.C1556d;
import com.google.android.finsky.bg.C1611k;
import com.google.android.finsky.bg.af;
import com.google.android.finsky.layout.C3676f;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.p147y.C4808a;
import com.google.android.finsky.playcard.ac;
import com.google.android.finsky.playcard.ao;
import com.google.android.finsky.stream.base.C4254d;
import com.google.android.finsky.stream.base.playcluster.C1164b;
import com.squareup.leakcanary.C7582R;

public final class C4471p extends C4302k {
    public final C1461c f22726t;

    public C4471p(Context context, C3748a c3748a, C4808a c4808a, ff ffVar, C3676f c3676f, ad adVar, C1611k c1611k, C1556d c1556d, C2495w c2495w, af afVar, C1461c c1461c, ao aoVar, C4254d c4254d, boolean z, ac acVar) {
        super(context, c3748a, c4808a, ffVar, c3676f, adVar, c1611k, c1556d, c2495w, afVar, aoVar, c4254d, z, acVar);
        this.f22726t = c1461c;
    }

    public final int mo1509a(int i) {
        return C7582R.layout.flat_card_inline_video_cluster;
    }

    public final int mo4099b() {
        return C7582R.layout.flat_card_inline_video;
    }

    protected final C1164b mo4105c() {
        return new C4479q(this);
    }
}
