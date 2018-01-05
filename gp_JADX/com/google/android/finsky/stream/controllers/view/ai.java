package com.google.android.finsky.stream.controllers.view;

import android.view.View;

final class ai implements Runnable {
    public final /* synthetic */ ah f23091a;

    ai(ah ahVar) {
        this.f23091a = ahVar;
    }

    public final void run() {
        Object obj = this.f23091a.f23090b;
        View view = this.f23091a.f23089a;
        obj.a.removeView(view);
        obj.a.addView(view);
        PlayCardRateClusterViewContent playCardRateClusterViewContent = (PlayCardRateClusterViewContent) obj.a;
        playCardRateClusterViewContent.m21052b();
        if (playCardRateClusterViewContent.m21054c()) {
            view.setState(0);
            view.au_();
            view.setVisibility(0);
            int cardChildCount = obj.getCardChildCount() - 1;
            int c = playCardRateClusterViewContent.mo4246c(cardChildCount);
            obj.a.m19873a(cardChildCount, c, c, obj);
        } else {
            obj.m21050a(true);
        }
        obj.f23032n = false;
    }
}
