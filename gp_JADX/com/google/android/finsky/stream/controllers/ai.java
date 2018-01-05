package com.google.android.finsky.stream.controllers;

import android.content.Context;
import android.support.v7.widget.ff;
import com.google.android.finsky.ba.C1556d;
import com.google.android.finsky.bg.C1611k;
import com.google.android.finsky.bg.af;
import com.google.android.finsky.cv.p177a.ix;
import com.google.android.finsky.dfemodel.C2720j;
import com.google.android.finsky.layout.C3676f;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.p147y.C4808a;
import com.google.android.finsky.playcard.C3903c;
import com.google.android.finsky.playcard.ac;
import com.google.android.finsky.playcard.ao;
import com.google.android.finsky.stream.base.C4254d;
import com.google.android.finsky.stream.base.playcluster.C1164b;
import com.squareup.leakcanary.C7582R;
import p002a.C0002a;

public final class ai extends C4302k {
    public final C0002a f21698t;

    public ai(Context context, C3748a c3748a, C4808a c4808a, ff ffVar, C3676f c3676f, ad adVar, C1611k c1611k, C1556d c1556d, C2495w c2495w, af afVar, ao aoVar, C4254d c4254d, boolean z, ac acVar, C0002a c0002a) {
        super(context, c3748a, c4808a, ffVar, c3676f, adVar, c1611k, c1556d, c2495w, afVar, aoVar, c4254d, z, acVar);
        this.f21698t = c0002a;
    }

    public final void mo4050a(C2720j c2720j) {
        super.mo4050a(c2720j);
        ix aY = c2720j.f14908a.aY();
        ((C3903c) this.f21698t.mo1a()).m18552a(aY.f12748d, aY.f12746b, aY.f12747c);
    }

    public final int mo1509a(int i) {
        return C7582R.layout.flat_card_screenshot_cluster;
    }

    public final int mo4099b() {
        return C7582R.layout.flat_card_screenshot;
    }

    protected final C1164b mo4105c() {
        return new aj(this);
    }
}
