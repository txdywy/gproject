package com.google.android.finsky.stream.controllers.view;

import com.google.android.finsky.playcard.PlayCardViewRate;
import com.google.android.finsky.playcard.ck;

final class ae implements ck {
    public final /* synthetic */ PlayCardViewRate f23080a;
    public final /* synthetic */ PlayCardRateClusterView f23081b;

    ae(PlayCardRateClusterView playCardRateClusterView, PlayCardViewRate playCardViewRate) {
        this.f23081b = playCardRateClusterView;
        this.f23080a = playCardViewRate;
    }

    public final void mo4254a(boolean z) {
        this.f23081b.f23032n = true;
        if (z) {
            this.f23081b.m21048a(this.f23080a);
        }
    }

    public final void mo4253a() {
        this.f23081b.f23032n = false;
    }
}
