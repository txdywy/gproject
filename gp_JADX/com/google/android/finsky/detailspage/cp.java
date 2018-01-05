package com.google.android.finsky.detailspage;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.bg.C1611k;
import com.google.android.finsky.dfemodel.C2719i;
import com.google.android.finsky.dfemodel.Document;
import com.squareup.leakcanary.C7582R;

public class cp extends ck implements bm {
    public final int mo2978e() {
        return 1;
    }

    public final int mo2977c(int i) {
        return C7582R.layout.footer_spacer_module;
    }

    public final boolean mo2979f() {
        return this.b != null && ((cq) this.b).f14368a;
    }

    public final void mo2974a(boolean z, Document document, C2719i c2719i, Document document2, C2719i c2719i2) {
        if (this.b == null) {
            this.b = new cq();
            ((cq) this.b).f14368a = true;
        }
        if (z && ((cq) this.b).f14368a) {
            ((cq) this.b).f14368a = false;
            this.u.mo3032a(this);
        }
    }

    public final void mo2976b(View view, int i) {
        FooterSpacerModuleLayout footerSpacerModuleLayout = (FooterSpacerModuleLayout) view;
        Resources resources = this.t.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(C7582R.dimen.hero_image_height);
        C1473m.f7980a.av();
        int m = C1611k.m9271m(resources) - dimensionPixelSize;
        LayoutParams layoutParams = footerSpacerModuleLayout.getLayoutParams();
        if (layoutParams.height != m) {
            layoutParams.height = m;
            footerSpacerModuleLayout.requestLayout();
        }
    }
}
