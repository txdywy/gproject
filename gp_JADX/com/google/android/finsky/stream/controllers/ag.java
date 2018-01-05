package com.google.android.finsky.stream.controllers;

import android.content.Context;
import android.support.v7.widget.ff;
import com.google.android.finsky.ba.C1556d;
import com.google.android.finsky.bg.C1611k;
import com.google.android.finsky.bg.af;
import com.google.android.finsky.cv.p177a.bd;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.dfemodel.ab;
import com.google.android.finsky.layout.C3676f;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.p147y.C4808a;
import com.google.android.finsky.playcard.ac;
import com.google.android.finsky.playcard.ao;
import com.google.android.finsky.stream.base.C4254d;
import com.google.android.finsky.stream.base.view.FlatCardClusterView;
import com.squareup.leakcanary.C7582R;

public final class ag extends ab {
    public final ab f21694t;

    public ag(Context context, C3748a c3748a, C4808a c4808a, ff ffVar, C3676f c3676f, ad adVar, C1611k c1611k, C1556d c1556d, C2495w c2495w, af afVar, ao aoVar, ab abVar, C4254d c4254d, boolean z, ac acVar) {
        super(context, c3748a, c4808a, ffVar, c3676f, adVar, c1611k, c1556d, c2495w, afVar, aoVar, c4254d, z, acVar);
        this.f21694t = abVar;
    }

    public final int mo1509a(int i) {
        return C7582R.layout.flat_card_partner_cluster;
    }

    protected final bd mo4103a(Document document) {
        return m19943c(4);
    }

    protected final C4440m mo4104a(Document document, FlatCardClusterView flatCardClusterView) {
        return new C4440m(document.bg().aG.f12555c.f12557b, new ah(this, flatCardClusterView, document));
    }

    protected final boolean mo4101d() {
        return this.g.f14908a.bg().aG.f12554b;
    }
}
