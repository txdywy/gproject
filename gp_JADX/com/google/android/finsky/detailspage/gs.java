package com.google.android.finsky.detailspage;

import android.support.v7.widget.em;
import android.view.View;
import com.google.android.finsky.cv.p177a.lk;
import com.google.android.finsky.dfemodel.C2719i;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.p111d.ad;
import com.google.wireless.android.a.a.a.a.ce;
import com.squareup.leakcanary.C7582R;

public class gs extends ck implements ad {
    public final ce f14649d = C2482j.m13283a(6100);

    public final int mo2978e() {
        return 1;
    }

    public final int mo2977c(int i) {
        return C7582R.layout.vetted_app_features_module;
    }

    public final boolean mo2979f() {
        return this.b != null;
    }

    public final void mo2974a(boolean z, Document document, C2719i c2719i, Document document2, C2719i c2719i2) {
        if (z && this.b == null) {
            lk[] lkVarArr;
            if (c2719i.f14925a == null || c2719i.f14925a.e == null) {
                lkVarArr = null;
            } else {
                lkVarArr = c2719i.f14925a.e.f13022a;
            }
            if (lkVarArr != null && lkVarArr.length != 0) {
                this.b = new gt();
                ((gt) this.b).f14650a = lkVarArr;
            }
        }
    }

    public final void mo2976b(View view, int i) {
        VettedAppFeaturesModuleLayout vettedAppFeaturesModuleLayout = (VettedAppFeaturesModuleLayout) view;
        lk[] lkVarArr = ((gt) this.b).f14650a;
        int i2 = ((gt) this.b).f14651b;
        if (vettedAppFeaturesModuleLayout.f14203b == null) {
            vettedAppFeaturesModuleLayout.f14203b = new gv(vettedAppFeaturesModuleLayout.getContext());
            vettedAppFeaturesModuleLayout.f14202a.setAdapter(vettedAppFeaturesModuleLayout.f14203b);
        }
        em emVar = vettedAppFeaturesModuleLayout.f14203b;
        emVar.f14657e = lkVarArr;
        emVar.f3433a.m3638b();
        vettedAppFeaturesModuleLayout.f14202a.scrollTo(i2, 0);
        getParentNode().mo1219a(this);
    }

    public final void mo3037c(View view, int i) {
        VettedAppFeaturesModuleLayout vettedAppFeaturesModuleLayout = (VettedAppFeaturesModuleLayout) view;
        if (this.b != null) {
            ((gt) this.b).f14651b = vettedAppFeaturesModuleLayout.getScrollPosition();
        }
    }

    public ce getPlayStoreUiElement() {
        return this.f14649d;
    }

    public ad getParentNode() {
        return this.I;
    }

    public final void mo1219a(ad adVar) {
        C2482j.m13291a((ad) this, adVar);
    }
}
