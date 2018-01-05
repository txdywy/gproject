package com.google.android.finsky.stream.controllers.view;

import com.google.android.finsky.playcard.ck;

final class C4521z implements ck {
    public final /* synthetic */ PlayCardRateAndSuggestClusterView f23130a;

    C4521z(PlayCardRateAndSuggestClusterView playCardRateAndSuggestClusterView) {
        this.f23130a = playCardRateAndSuggestClusterView;
    }

    public final void mo4254a(boolean z) {
        if (z) {
            this.f23130a.m21041a(false);
            this.f23130a.m21042b(false);
            return;
        }
        this.f23130a.m21037a(1, false);
    }

    public final void mo4253a() {
        this.f23130a.m21037a(0, false);
    }
}
