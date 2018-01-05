package com.google.android.finsky.stream.controllers;

import android.content.Context;
import android.view.View;
import com.google.android.finsky.api.C1287h;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.ba.C1556d;
import com.google.android.finsky.bg.C1611k;
import com.google.android.finsky.dfemodel.C2720j;
import com.google.android.finsky.installqueue.C3340g;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.p147y.C4808a;
import com.google.android.finsky.playcard.ac;
import com.google.android.finsky.playcard.ao;
import com.google.android.finsky.stream.base.C4230c;
import com.google.android.finsky.stream.base.C4239i;
import com.google.android.finsky.stream.base.C4253a;
import com.google.android.finsky.stream.base.C4256g;
import com.google.android.finsky.stream.base.playcluster.PlayCardClusterViewHeader;
import com.squareup.leakcanary.C7582R;

public final class C4414i extends C4253a {
    public final int f22404E;

    public C4414i(Context context, C3748a c3748a, C4808a c4808a, ad adVar, C4230c c4230c, C1611k c1611k, C1556d c1556d, C4239i c4239i, C2495w c2495w, C3340g c3340g, C1287h c1287h, C1461c c1461c, ao aoVar, ac acVar) {
        super(context, c3748a, c4808a, adVar, c4230c, c1611k, c1556d, c4239i, c2495w, c3340g, c1287h, c1461c, aoVar, acVar);
        this.D = new C4256g();
        this.f22404E = acVar.m18478a(false);
    }

    public final void mo4050a(C2720j c2720j) {
        super.mo4050a(c2720j);
        this.k = 0;
    }

    public final int mo4096m() {
        return C7582R.layout.collection_with_reason_cluster_row;
    }

    protected final int mo4094d() {
        return this.f22404E;
    }

    protected final int mo4095l() {
        return this.l;
    }

    protected final int mo4097o() {
        return 444;
    }

    protected final int mo4151n() {
        return -1;
    }

    protected final void mo4150b(View view) {
        ((PlayCardClusterViewHeader) view).m19878a(this.g.mo3119b(), this.g.f14908a.f14885a.f12100g, this.k);
    }
}
