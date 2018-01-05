package com.google.android.finsky.stream.controllers.view;

import com.google.android.finsky.cv.p177a.jf;
import com.google.android.finsky.utils.C4685p;

final class ab implements Runnable {
    public final /* synthetic */ jf f23076a;
    public final /* synthetic */ PlayCardRateAndSuggestClusterView f23077b;

    ab(PlayCardRateAndSuggestClusterView playCardRateAndSuggestClusterView, jf jfVar) {
        this.f23077b = playCardRateAndSuggestClusterView;
        this.f23076a = jfVar;
    }

    public final void run() {
        this.f23077b.f23020r.m21045a();
        this.f23077b.g.m19881a(this.f23076a.f12776c, C4685p.m21831a(this.f23076a.f12777d));
    }
}
