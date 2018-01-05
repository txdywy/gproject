package com.google.android.finsky.stream.controllers;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.api.C1287h;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.ba.C1556d;
import com.google.android.finsky.bg.C1607g;
import com.google.android.finsky.bg.C1608h;
import com.google.android.finsky.bg.C1611k;
import com.google.android.finsky.bg.af;
import com.google.android.finsky.cv.p177a.bd;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.dfemodel.ab;
import com.google.android.finsky.frameworkviews.BucketRowLayout;
import com.google.android.finsky.installqueue.C3340g;
import com.google.android.finsky.layout.CategoryRow;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.p147y.C4808a;
import com.google.android.finsky.stream.base.C4230c;
import com.google.android.finsky.stream.base.C4239i;
import com.google.android.finsky.stream.base.C4252f;
import com.google.android.finsky.stream.base.C4256g;
import com.google.android.finsky.stream.base.playcluster.PlayCardClusterViewHeader;
import com.google.android.play.image.a;
import com.squareup.leakcanary.C7582R;

public final class C4375d extends C4252f {
    public final ab f22191a;

    public C4375d(Context context, C3748a c3748a, C4808a c4808a, ad adVar, C4230c c4230c, C1611k c1611k, C1556d c1556d, C4239i c4239i, C2495w c2495w, C3340g c3340g, C1287h c1287h, ab abVar, C1461c c1461c) {
        super(context, c3748a, c4808a, adVar, c4230c, c1611k, c1556d, c4239i, c2495w, c3340g, c1287h, c1461c);
        this.f22191a = abVar;
        this.D = new C4256g();
    }

    protected final int mo4094d() {
        return C7582R.layout.category_item;
    }

    protected final int mo4095l() {
        return this.e.getResources().getBoolean(C7582R.bool.display_categories_in_two_columns) ? 2 : 1;
    }

    protected final int mo4096m() {
        return C7582R.layout.category_links_bucket_row;
    }

    protected final void mo4064a(BucketRowLayout bucketRowLayout, int i) {
    }

    public final void mo1510a(View view, int i) {
        if (m20518c(i)) {
            view.setMinimumHeight(view.getContext().getResources().getDimensionPixelSize(C7582R.dimen.play_cluster_vpadding));
        } else {
            super.mo1510a(view, i);
        }
    }

    protected final void mo4150b(View view) {
        Document document = this.g.f14908a;
        ((PlayCardClusterViewHeader) view).m19878a(document.f14885a.f12099f, document.f14885a.f12100g, this.k);
    }

    public final void mo1511b(View view, int i) {
        if (!m20518c(i)) {
            super.mo1511b(view, i);
        }
    }

    protected final void c_(View view) {
        ((CategoryRow) view).setOnClickListener(null);
    }

    protected final int mo4097o() {
        return 440;
    }

    protected final int mo4151n() {
        if (this.g.f14908a == null || TextUtils.isEmpty(this.g.f14908a.f14885a.f12100g)) {
            return -1;
        }
        return C7582R.layout.play_card_cluster_header;
    }

    protected final void mo4063a(Document document, int i, View view) {
        if (document != null) {
            CategoryRow categoryRow = (CategoryRow) view;
            int i2 = this.g.f14908a.f14885a.f12099f;
            C1473m.f7980a.be();
            categoryRow.f18094a.setText(document.f14885a.f12100g);
            C1473m.f7980a.bR();
            bd a = af.m9220a(document, 0, categoryRow.f18095b.getHeight(), categoryRow.f18098e);
            if (!(a == null || TextUtils.isEmpty(a.f11860f))) {
                String str = a.f11860f;
                categoryRow.f18095b.setBitmapTransformation(a.b(categoryRow.getResources(), C1607g.m9236a(a, C1608h.m9243a(categoryRow.getContext(), i2))));
                C1473m.f7980a.ar().m9288a(categoryRow.f18095b, str, true);
            }
            categoryRow.f18097d = this;
            C2482j.m13285a(categoryRow.f18096c, document.f14885a.f12087D);
            categoryRow.f18097d.mo1219a(categoryRow);
            categoryRow.setOnClickListener(new C4378e(this, document, i2, categoryRow));
        }
    }

    public final int mo1509a(int i) {
        if (m20518c(i)) {
            return C7582R.layout.vertical_spacer;
        }
        return super.mo1509a(i);
    }

    public final int mo1508a() {
        return super.mo1508a() + 1;
    }

    private final boolean m20518c(int i) {
        return i == mo1508a() + -1;
    }
}
