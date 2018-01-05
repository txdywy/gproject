package com.google.android.finsky.detailspage;

import android.view.View;
import com.google.android.finsky.dfemodel.C2719i;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.frameworkviews.C2639n;
import com.google.android.finsky.layout.C3720s;
import com.google.android.finsky.layout.C3727t;
import com.google.android.finsky.layout.DetailsRefundAndFlagItemsSection;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.wireless.android.a.a.a.a.ce;
import com.squareup.leakcanary.C7582R;

public class dl extends ck implements ad, C2639n {
    public ce f14424d;

    public final boolean mo2979f() {
        return this.b != null;
    }

    public final int mo2978e() {
        return 1;
    }

    public final int mo2977c(int i) {
        return C7582R.layout.details_refund_and_flag_items;
    }

    public final void mo2974a(boolean z, Document document, C2719i c2719i, Document document2, C2719i c2719i2) {
        if (this.b == null && z) {
            this.b = new dm();
            ((dm) this.b).f14425a = document;
        }
    }

    public final void mo2976b(View view, int i) {
        int i2 = 0;
        DetailsRefundAndFlagItemsSection detailsRefundAndFlagItemsSection = (DetailsRefundAndFlagItemsSection) view;
        if (!detailsRefundAndFlagItemsSection.f18123a) {
            Document document = ((dm) this.b).f14425a;
            C3748a c3748a = this.z;
            ad adVar = this.I;
            C2495w c2495w = this.J;
            Document document2 = ((dm) this.b).f14425a;
            int i3 = (document2.f14885a.f12098e == 1 || document2.f14885a.f12099f == 2) ? true : 0;
            detailsRefundAndFlagItemsSection.f18124b.setOnClickListener(new C3720s(c3748a, c2495w, adVar));
            detailsRefundAndFlagItemsSection.f18124b.setContentDescription(detailsRefundAndFlagItemsSection.getResources().getString(C7582R.string.refund_policy_title));
            View view2 = detailsRefundAndFlagItemsSection.f18125d;
            if (i3 == 0) {
                i2 = 8;
            }
            view2.setVisibility(i2);
            if (i3 != 0) {
                detailsRefundAndFlagItemsSection.f18125d.setOnClickListener(new C3727t(c3748a, document, c2495w, adVar));
                detailsRefundAndFlagItemsSection.f18125d.setContentDescription(detailsRefundAndFlagItemsSection.getResources().getString(C7582R.string.flagging_title));
            }
            detailsRefundAndFlagItemsSection.f18123a = true;
            getParentNode().mo1219a(this);
        }
    }

    public final boolean mo3071a() {
        return true;
    }

    public ce getPlayStoreUiElement() {
        if (this.f14424d == null) {
            this.f14424d = C2482j.m13283a(1878);
        }
        return this.f14424d;
    }

    public ad getParentNode() {
        return this.I;
    }

    public final void mo1219a(ad adVar) {
        C2482j.m13291a((ad) this, adVar);
    }
}
