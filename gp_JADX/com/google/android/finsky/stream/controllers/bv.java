package com.google.android.finsky.stream.controllers;

import android.content.Context;
import com.google.android.finsky.api.C1287h;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.ba.C1556d;
import com.google.android.finsky.bg.C1611k;
import com.google.android.finsky.dfemodel.C2721l;
import com.google.android.finsky.dfemodel.ab;
import com.google.android.finsky.frameworkviews.BucketRowLayout;
import com.google.android.finsky.installqueue.C3340g;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.p147y.C4808a;
import com.google.android.finsky.p198f.C3028c;
import com.google.android.finsky.playcard.ac;
import com.google.android.finsky.playcard.ao;
import com.google.android.finsky.stream.base.C4230c;
import com.google.android.finsky.stream.base.C4239i;
import com.google.android.finsky.stream.controllers.view.NonOrderedTopChartsRowLayout;
import com.google.android.finsky.stream.p251b.C4241a;
import com.squareup.leakcanary.C7582R;

public final class bv extends cb {
    public bv(Context context, C3748a c3748a, C4808a c4808a, ad adVar, C4230c c4230c, C1611k c1611k, C1556d c1556d, C4239i c4239i, C2495w c2495w, C1461c c1461c, C4241a c4241a, C2721l c2721l, ab abVar, C3340g c3340g, C1287h c1287h, C3028c c3028c, ao aoVar, ac acVar) {
        super(context, c3748a, c4808a, adVar, c4230c, c1611k, c1556d, c4239i, c2495w, c1461c, c4241a, abVar, c3340g, c1287h, c3028c, aoVar, acVar);
    }

    protected final boolean mo4172t() {
        return false;
    }

    protected final int mo4173u() {
        return 1;
    }

    protected final boolean mo4167b() {
        return false;
    }

    protected final int mo4096m() {
        return C7582R.layout.non_ordered_top_charts_cluster;
    }

    protected final int mo4094d() {
        return this.b.m18478a(false);
    }

    protected final int mo4095l() {
        return this.l;
    }

    protected final int mo4097o() {
        return 452;
    }

    protected final void mo4064a(BucketRowLayout bucketRowLayout, int i) {
        if (bucketRowLayout instanceof NonOrderedTopChartsRowLayout) {
            NonOrderedTopChartsRowLayout nonOrderedTopChartsRowLayout = (NonOrderedTopChartsRowLayout) bucketRowLayout;
            nonOrderedTopChartsRowLayout.setContentHorizontalPadding(nonOrderedTopChartsRowLayout.f23002g);
            nonOrderedTopChartsRowLayout.setHorizontalMargin(nonOrderedTopChartsRowLayout.f23003h);
            nonOrderedTopChartsRowLayout.m19906a(nonOrderedTopChartsRowLayout.f23004i, true);
            nonOrderedTopChartsRowLayout.m19906a(0, false);
            nonOrderedTopChartsRowLayout.setBottomPadding(nonOrderedTopChartsRowLayout.f23005j);
        }
    }
}
