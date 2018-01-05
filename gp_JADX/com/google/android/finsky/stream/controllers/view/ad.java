package com.google.android.finsky.stream.controllers.view;

import com.google.android.play.layout.b;

final class ad implements Runnable {
    public final /* synthetic */ PlayCardRateAndSuggestContentScroller f23079a;

    ad(PlayCardRateAndSuggestContentScroller playCardRateAndSuggestContentScroller) {
        this.f23079a = playCardRateAndSuggestContentScroller;
    }

    public final void run() {
        if (this.f23079a.f23027a.getCardChildCount() > 0) {
            b b = this.f23079a.f23027a.m19876b(0);
            this.f23079a.scrollTo(b.getWidth(), 0);
            b.setVisibility(4);
        }
    }
}
