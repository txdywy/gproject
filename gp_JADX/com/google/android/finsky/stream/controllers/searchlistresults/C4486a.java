package com.google.android.finsky.stream.controllers.searchlistresults;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.finsky.api.C1287h;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.ba.C1556d;
import com.google.android.finsky.bg.C1611k;
import com.google.android.finsky.cv.p177a.bd;
import com.google.android.finsky.dfemodel.C2720j;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.frameworkviews.BucketRowLayout;
import com.google.android.finsky.installqueue.C3340g;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.navigationmanager.C3760e;
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
import com.google.android.finsky.stream.base.view.C3687d;
import com.google.android.finsky.stream.base.view.C4295c;
import com.google.android.finsky.stream.base.view.FlatCardClusterViewHeader;
import com.google.android.finsky.stream.controllers.searchlistresults.view.C4487a;
import com.google.android.finsky.stream.controllers.searchlistresults.view.C4488b;
import com.google.android.finsky.stream.controllers.searchlistresults.view.SearchListResultsOutlinedRowLayout;
import com.squareup.leakcanary.C7582R;

public final class C4486a extends C4253a implements OnClickListener, C3687d {
    public final C1461c f22791E;
    public final C4254d f22792F;
    public final boolean f22793G;
    public final boolean f22794H;
    public boolean f22795I;
    public C4295c f22796J = new C4295c();
    public final C4488b f22797K = new C4488b();

    public C4486a(Context context, C3748a c3748a, C4808a c4808a, ad adVar, C4230c c4230c, C1611k c1611k, C1556d c1556d, C4239i c4239i, C2495w c2495w, C3340g c3340g, C1287h c1287h, C1461c c1461c, ao aoVar, ac acVar, C4254d c4254d) {
        super(context, c3748a, c4808a, adVar, c4230c, c1611k, c1556d, c4239i, c2495w, c3340g, c1287h, c1461c, aoVar, acVar);
        this.f22791E = c1461c;
        this.D = new C4256g();
        this.f22792F = c4254d;
        boolean a = this.f22791E.dj().mo2294a(12626169);
        boolean z = this.e.getResources().getBoolean(C7582R.bool.flat_use_grid_in_search_results);
        this.f22794H = this.f22791E.dj().mo2294a(12638742);
        if (this.f22794H || !a) {
            z = false;
        }
        this.f22793G = z;
    }

    public final void mo4050a(C2720j c2720j) {
        super.mo4050a(c2720j);
        this.f22795I = C3760e.m17904a(c2720j.f14908a);
        Resources resources = this.e.getResources();
        this.f22797K.f22804c = this.f22791E.dj().mo2294a(12631771);
        this.f22797K.f22803b = this.f22793G;
        this.f22797K.f22802a = mo4151n() != -1;
        if (this.f22793G) {
            this.k = this.d.m9278c(resources);
        } else if (mo4151n() == -1 || this.f22791E.dj().mo2294a(12631771)) {
            this.k = 0;
        } else {
            this.k = resources.getDimensionPixelSize(C7582R.dimen.flat_search_results_with_title_extra_padding);
        }
    }

    protected final int mo4094d() {
        if (this.f22793G) {
            return this.b.m18478a(false);
        }
        return C7582R.layout.flat_card_listing;
    }

    protected final int mo4095l() {
        if (this.f22794H) {
            return 1;
        }
        if (this.f22793G) {
            return this.l;
        }
        return this.d.m9283h(this.e.getResources());
    }

    protected final int mo4096m() {
        return C7582R.layout.search_list_result_row;
    }

    protected final int mo4151n() {
        if (this.g.f14908a == null || TextUtils.isEmpty(this.g.f14908a.f14885a.f12100g)) {
            return -1;
        }
        return C7582R.layout.flat_card_cluster_header;
    }

    protected final int mo4097o() {
        return 442;
    }

    protected final void mo4150b(View view) {
        C3687d c3687d;
        Document document = this.g.f14908a;
        String a = this.f22792F.m19769a(this.e, document, document.m14638a(), null, false);
        bd bdVar = document.m14660o() ? document.f14885a.f12111r.f12023i : null;
        FlatCardClusterViewHeader flatCardClusterViewHeader = (FlatCardClusterViewHeader) view;
        this.f22796J.f21657a = document.f14885a.f12099f;
        this.f22796J.f21658b = document.f14885a.f12100g;
        this.f22796J.f21659c = document.f14885a.f12101h;
        this.f22796J.f21660d = a;
        this.f22796J.f21661e = bdVar;
        this.f22796J.f21662f = null;
        flatCardClusterViewHeader.setTextShade(0);
        C4295c c4295c = this.f22796J;
        if (!this.f22795I) {
            c3687d = null;
        }
        flatCardClusterViewHeader.mo3611a(c4295c, c3687d);
    }

    protected final void mo4064a(BucketRowLayout bucketRowLayout, int i) {
        super.mo4064a(bucketRowLayout, i);
        if (bucketRowLayout instanceof SearchListResultsOutlinedRowLayout) {
            SearchListResultsOutlinedRowLayout searchListResultsOutlinedRowLayout = (SearchListResultsOutlinedRowLayout) bucketRowLayout;
            C4488b c4488b = this.f22797K;
            C4487a c4487a = new C4487a();
            Resources resources = searchListResultsOutlinedRowLayout.getResources();
            if (c4488b.f22803b) {
                c4487a.f22800b = 0;
                c4487a.f22801c = resources.getDimensionPixelSize(C7582R.dimen.flat_grid_card_to_card_vpadding);
                c4487a.f22799a = searchListResultsOutlinedRowLayout.f22798i.m9278c(resources);
            } else {
                c4487a.f22800b = resources.getDimensionPixelSize(C7582R.dimen.flat_cluster_card_to_card_vpadding);
                c4487a.f22801c = 0;
            }
            if (!c4488b.f22802a || c4488b.f22804c) {
                c4487a.f22799a = 0;
            } else {
                c4487a.f22799a = resources.getDimensionPixelSize(C7582R.dimen.flat_search_results_with_title_extra_padding);
            }
            searchListResultsOutlinedRowLayout.m19906a(c4487a.f22801c, true);
            searchListResultsOutlinedRowLayout.m19906a(0, false);
            searchListResultsOutlinedRowLayout.setBottomPadding(c4487a.f22801c);
            searchListResultsOutlinedRowLayout.setDividerSize(c4487a.f22800b);
            searchListResultsOutlinedRowLayout.setContentHorizontalPadding(c4487a.f22799a);
        }
    }

    public final void onClick(View view) {
        this.f.mo3655a(this.g.f14908a, (ad) this, this.i);
    }

    public final void mo3579a(View view) {
        onClick(view);
    }

    public final void mo3580c(View view) {
        onClick(view);
    }
}
