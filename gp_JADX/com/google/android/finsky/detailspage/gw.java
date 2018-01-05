package com.google.android.finsky.detailspage;

import android.view.LayoutInflater;
import android.view.View;
import com.google.android.finsky.cv.p177a.lk;
import com.google.android.finsky.dfemodel.C2719i;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.p111d.ad;
import com.google.wireless.android.a.a.a.a.ce;
import com.squareup.leakcanary.C7582R;

public class gw extends ck implements ad {
    public ce f14659d;

    public final int mo2978e() {
        return 1;
    }

    public final int mo2977c(int i) {
        return C7582R.layout.vetted_game_features_module;
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
                lkVarArr = c2719i.f14925a.e.f13023b;
            }
            if (lkVarArr != null && lkVarArr.length != 0) {
                this.b = new gx();
                ((gx) this.b).f14660a = lkVarArr;
            }
        }
    }

    public final void mo2976b(View view, int i) {
        VettedGameFeaturesModuleLayout vettedGameFeaturesModuleLayout = (VettedGameFeaturesModuleLayout) view;
        lk[] lkVarArr = ((gx) this.b).f14660a;
        if (vettedGameFeaturesModuleLayout.f14209a.getChildCount() == 0) {
            for (int i2 = 0; i2 < lkVarArr.length; i2++) {
                int i3 = (int) (lkVarArr[i2].f13020f * 100.0d);
                float f = (float) (lkVarArr[i2].f13020f * 5.0d);
                VettedGameFeatureLayout vettedGameFeatureLayout = (VettedGameFeatureLayout) LayoutInflater.from(vettedGameFeaturesModuleLayout.getContext()).inflate(C7582R.layout.vetted_game_features_item, null);
                CharSequence charSequence = lkVarArr[i2].f13017c;
                vettedGameFeatureLayout.f14206a.setRating(f);
                vettedGameFeatureLayout.f14207b.setProgress(i3);
                vettedGameFeatureLayout.f14208c.setText(charSequence);
                vettedGameFeaturesModuleLayout.f14209a.addView(vettedGameFeatureLayout);
            }
        }
        getParentNode().mo1219a(this);
    }

    public ce getPlayStoreUiElement() {
        if (this.f14659d == null) {
            this.f14659d = C2482j.m13283a(6102);
        }
        return this.f14659d;
    }

    public ad getParentNode() {
        return this.I;
    }

    public final void mo1219a(ad adVar) {
        C2482j.m13291a((ad) this, adVar);
    }
}
