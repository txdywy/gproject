package com.google.android.finsky.activities;

import com.google.android.finsky.detailscomponents.HeroGraphicView;
import com.google.android.finsky.layout.C3685o;

final class go implements Runnable {
    public final /* synthetic */ boolean f6898a;
    public final /* synthetic */ gp f6899b;
    public final /* synthetic */ gn f6900c;

    go(gn gnVar, boolean z, gp gpVar) {
        this.f6900c = gnVar;
        this.f6898a = z;
        this.f6899b = gpVar;
    }

    public final void run() {
        if (this.f6898a) {
            gp gpVar = this.f6899b;
            HeroGraphicView heroGraphicView = this.f6900c.ax.f18593e;
            int i = this.f6900c.f6894e;
            gpVar.mo1447a(heroGraphicView);
            C3685o c3685o = this.f6900c.ax;
            if (c3685o.f18595g != null) {
                c3685o.f18595g.setVisibility(8);
                return;
            }
            return;
        }
        this.f6900c.ax.m17477a(this.f6900c.aq, true);
        this.f6900c.ap();
    }
}
