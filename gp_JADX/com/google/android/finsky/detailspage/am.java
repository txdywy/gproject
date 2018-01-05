package com.google.android.finsky.detailspage;

import android.view.View;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.detailscomponents.C2581g;
import com.google.android.finsky.detailscomponents.HeroGraphicView;
import com.google.android.finsky.dfemodel.C2719i;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.p111d.ad;
import com.google.wireless.android.a.a.a.a.ce;
import com.squareup.leakcanary.C7582R;

public class am extends ck implements ad {
    public ce f14251d;
    public HeroGraphicView f14252e;

    public final int mo2978e() {
        return 1;
    }

    public final int mo2977c(int i) {
        return C7582R.layout.detail_banner_layout;
    }

    public final boolean mo2979f() {
        return this.b != null;
    }

    public final void mo2974a(boolean z, Document document, C2719i c2719i, Document document2, C2719i c2719i2) {
        Object obj = null;
        int i = document.f14885a.f12098e;
        if (!(i == 20 || i == 2 || i == 4 || !this.z.mo3714q())) {
            C1473m.f7980a.cm();
            if (C2581g.m13638c(document, this.E) != null) {
                obj = 1;
            }
        }
        if (obj != null) {
            if (this.b == null) {
                this.b = new an();
            }
            ((an) this.b).f14253a = document;
        }
    }

    public final void mo2976b(View view, int i) {
        this.f14252e = (HeroGraphicView) view;
        this.f14252e.setFullScreenMode(false);
        this.f14252e.m13593a(((an) this.b).f14253a, this.E, (ad) this);
        getParentNode().mo1219a(this);
    }

    public ce getPlayStoreUiElement() {
        if (this.f14251d == null) {
            this.f14251d = C2482j.m13283a(1875);
        }
        return this.f14251d;
    }

    public ad getParentNode() {
        return this.I;
    }

    public final void mo1219a(ad adVar) {
        C2482j.m13291a((ad) this, adVar);
    }
}
