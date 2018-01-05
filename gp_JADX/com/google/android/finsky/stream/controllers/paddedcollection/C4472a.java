package com.google.android.finsky.stream.controllers.paddedcollection;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.google.android.finsky.api.C1287h;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.ba.C1556d;
import com.google.android.finsky.bg.C1611k;
import com.google.android.finsky.cv.p177a.bd;
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
import com.google.android.finsky.stream.base.C4254d;
import com.google.android.finsky.stream.base.C4256g;
import com.google.android.finsky.stream.base.view.C4295c;
import com.google.android.finsky.stream.base.view.FlatCardClusterViewHeader;
import com.squareup.leakcanary.C7582R;

public final class C4472a extends C4253a {
    public final C4254d f22727E;
    public C4295c f22728F;

    public C4472a(Context context, C3748a c3748a, C4808a c4808a, ad adVar, C4230c c4230c, C1611k c1611k, C1556d c1556d, C4239i c4239i, C2495w c2495w, C3340g c3340g, C1287h c1287h, C1461c c1461c, ao aoVar, ac acVar, C4254d c4254d) {
        super(context, c3748a, c4808a, adVar, c4230c, c1611k, c1556d, c4239i, c2495w, c3340g, c1287h, c1461c, aoVar, acVar);
        this.f22728F = new C4295c();
        this.D = new C4256g();
        this.f22727E = c4254d;
    }

    public final void mo4050a(C2720j c2720j) {
        super.mo4050a(c2720j);
        this.k = this.d.m9278c(this.e.getResources());
    }

    protected final int mo4094d() {
        return C7582R.layout.flat_card_mini;
    }

    protected final int mo4095l() {
        return this.l;
    }

    protected final int mo4096m() {
        return C7582R.layout.padded_collection_row;
    }

    protected final int mo4151n() {
        if (this.g.f14908a == null || TextUtils.isEmpty(this.g.f14908a.f14885a.f12100g)) {
            return -1;
        }
        return C7582R.layout.flat_card_cluster_header;
    }

    protected final void mo4150b(View view) {
        Document document = this.g.f14908a;
        String a = this.f22727E.m19769a(this.e, document, document.m14638a(), null, false);
        bd bdVar = document.m14660o() ? document.f14885a.f12111r.f12023i : null;
        FlatCardClusterViewHeader flatCardClusterViewHeader = (FlatCardClusterViewHeader) view;
        this.f22728F.f21657a = document.f14885a.f12099f;
        this.f22728F.f21658b = document.f14885a.f12100g;
        this.f22728F.f21659c = document.f14885a.f12101h;
        this.f22728F.f21660d = a;
        this.f22728F.f21661e = bdVar;
        this.f22728F.f21662f = null;
        flatCardClusterViewHeader.setTextShade(0);
        flatCardClusterViewHeader.mo3611a(this.f22728F, null);
    }

    protected final int mo4097o() {
        return 472;
    }
}
