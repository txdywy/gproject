package com.google.android.finsky.stream.controllers;

import android.content.Context;
import com.google.android.finsky.api.C1287h;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.ba.C1556d;
import com.google.android.finsky.bg.C1611k;
import com.google.android.finsky.dfemodel.C2720j;
import com.google.android.finsky.dfemodel.Document;
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
import com.squareup.leakcanary.C7582R;

public final class C4301a extends C4253a {
    public C4301a(Context context, C3748a c3748a, C4808a c4808a, ad adVar, C4230c c4230c, C1611k c1611k, C1556d c1556d, C4239i c4239i, C2495w c2495w, C3340g c3340g, C1287h c1287h, C1461c c1461c, ao aoVar, ac acVar) {
        super(context, c3748a, c4808a, adVar, c4230c, c1611k, c1556d, c4239i, c2495w, c3340g, c1287h, c1461c, aoVar, acVar);
        this.D = new C4256g();
    }

    public final void mo4050a(C2720j c2720j) {
        super.mo4050a(c2720j);
        this.j = this.d.m9275a(this.e.getResources());
        this.k = 0;
        if (this.f21507w) {
            int b = this.x.mo3482b(((Document) c2720j.m14679a(0, true)).cf());
            if (b != 1 && b != 2 && b != 3) {
                this.f21498B = 0;
            }
        }
    }

    protected final int mo4094d() {
        return C7582R.layout.flat_card_apps_mdp;
    }

    protected final int mo4095l() {
        return 1;
    }

    protected final int mo4096m() {
        return C7582R.layout.flat_apps_mdp_row;
    }

    protected final int mo4097o() {
        return 432;
    }
}
