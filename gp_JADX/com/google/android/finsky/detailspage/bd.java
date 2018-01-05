package com.google.android.finsky.detailspage;

import android.support.v4.app.cq;
import android.view.View;
import com.google.android.finsky.detailscomponents.HeroGraphicView;
import java.util.List;

final class bd extends cq {
    public final /* synthetic */ aw f14271a;

    bd(aw awVar) {
        this.f14271a = awVar;
    }

    public final void mo3050a(List list, List list2) {
        if (this.f14271a.f746R == null) {
            for (View alpha : list2) {
                alpha.setAlpha(0.0f);
            }
        }
        HeroGraphicView heroGraphicView = this.f14271a.aP;
    }

    public final void mo3049a() {
        HeroGraphicView heroGraphicView = this.f14271a.aP;
    }
}
