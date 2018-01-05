package com.google.android.finsky.stream.controllers;

import android.view.View;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.bg.af;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.stream.base.playcluster.C1158a;
import com.google.android.finsky.stream.controllers.view.PlayQuickLinksBannerCircleItemViewLarge;
import com.google.android.play.image.x;
import com.google.android.play.image.y;
import com.squareup.leakcanary.C7582R;

final class C4407g implements C1158a {
    public ad f22361a;
    public final /* synthetic */ C4388f f22362b;

    C4407g(C4388f c4388f) {
        this.f22362b = c4388f;
    }

    public final String mo1480a() {
        return "category_quick_links";
    }

    public final int mo1486c() {
        if (this.f22362b.g == null) {
            return 0;
        }
        return this.f22362b.g.m14698m();
    }

    public final int mo1477a(int i) {
        return C7582R.layout.play_quicklinks_banner_circle_item_large;
    }

    public final float mo1482b(int i) {
        return 1.0f;
    }

    public final boolean mo1484b() {
        return false;
    }

    public final x mo1479a(int i, int i2, int i3, y yVar, int[] iArr) {
        return af.m9222a(this.f22362b.e, ((Document) this.f22362b.g.m14679a(i, true)).aj(), C1473m.f7980a.be(), i2, i3, yVar);
    }

    public final /* synthetic */ int mo1478a(View view) {
        return ((PlayQuickLinksBannerCircleItemViewLarge) view).getIconWidth();
    }

    public final /* synthetic */ int mo1483b(View view) {
        return ((PlayQuickLinksBannerCircleItemViewLarge) view).getIconWidth();
    }

    public final /* bridge */ /* synthetic */ float mo1485c(View view) {
        return 1.0f;
    }

    public final /* synthetic */ void mo1481a(View view, int i) {
        PlayQuickLinksBannerCircleItemViewLarge playQuickLinksBannerCircleItemViewLarge = (PlayQuickLinksBannerCircleItemViewLarge) view;
        if (i < this.f22362b.g.m14698m()) {
            playQuickLinksBannerCircleItemViewLarge.mo4247a((Document) this.f22362b.g.m14679a(i, true), this.f22362b.f, this.f22362b.f22272p.dn(), C1473m.f7980a.be(), this.f22361a, this.f22362b.i);
        }
    }
}
