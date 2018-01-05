package com.google.android.finsky.detailspage;

import android.view.View;
import android.view.ViewGroup.LayoutParams;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.detailsmodules.p183a.C2600d;
import com.google.android.finsky.dfemodel.C2719i;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.headerlistlayout.FinskyHeaderListLayout;
import com.squareup.leakcanary.C7582R;

public class ct extends ck implements bm {
    public final int mo2978e() {
        return 1;
    }

    public final int mo2977c(int i) {
        return C7582R.layout.header_list_spacer_module;
    }

    public final boolean mo2979f() {
        return this.b != null;
    }

    public final void mo2974a(boolean z, Document document, C2719i c2719i, Document document2, C2719i c2719i2) {
        if (this.b == null) {
            this.b = new cu();
            ((cu) this.b).f14371a = document;
            ((cu) this.b).f14372b = m14068a();
        }
        if (z && !this.z.mo3714q()) {
            ((cu) this.b).f14371a = document;
            int i = ((cu) this.b).f14372b;
            ((cu) this.b).f14372b = m14068a();
            if (i != ((cu) this.b).f14372b) {
                this.u.mo3033a(this, true);
            }
        }
    }

    private final int m14068a() {
        if (this.z.mo3714q()) {
            return FinskyHeaderListLayout.m16068a(this.t, 2, 0);
        }
        return C1473m.f7980a.cm().m13639a(this.t, ((cu) this.b).f14371a, this.E);
    }

    public final void mo2976b(View view, int i) {
        HeaderListSpacerModuleLayout headerListSpacerModuleLayout = (HeaderListSpacerModuleLayout) view;
        int i2 = ((cu) this.b).f14372b;
        LayoutParams layoutParams = headerListSpacerModuleLayout.getLayoutParams();
        if (layoutParams.height != i2) {
            layoutParams.height = i2;
            headerListSpacerModuleLayout.requestLayout();
        }
    }

    public final /* synthetic */ void mo2973a(C2600d c2600d) {
        super.mo2973a((cu) c2600d);
        if (this.b != null) {
            ((cu) this.b).f14372b = m14068a();
        }
    }
}
