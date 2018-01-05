package com.google.android.finsky.detailspage;

import android.support.v7.widget.fl;

final class au implements Runnable {
    public final /* synthetic */ aq f14262a;

    au(aq aqVar) {
        this.f14262a = aqVar;
    }

    public final void run() {
        this.f14262a.aq();
        this.f14262a.aS = true;
        this.f14262a.aG.setHeaderMode(2);
        fl bgVar = new bg(this.f14262a.bn, this.f14262a.aG.getToolbar().getHeight());
        bgVar.f3396g = this.f14262a.ap();
        this.f14262a.aJ.getLayoutManager().m3014a(bgVar);
    }
}
