package com.google.android.finsky.stream.base.playcluster;

import com.google.android.finsky.playcard.C3906g;
import com.google.android.finsky.utils.bb;
import com.google.android.play.layout.d;

public final class C4283e {
    public final C4285g f21639a = new C4285g();

    public final void m19887a(PlayCardClusterView playCardClusterView) {
        bb.m21791a();
        if (playCardClusterView != null && playCardClusterView.m19868b()) {
            C4281c metadata = playCardClusterView.getMetadata();
            int a = metadata.m19884a();
            for (int i = 0; i < a; i++) {
                d a2 = playCardClusterView.m19866a(i);
                C3906g c3906g = metadata.m19886a(i).f21635a;
                if (a2 != null) {
                    this.f21639a.m19889a(a2, c3906g.f19735a);
                }
            }
            PlayCardClusterViewContent playCardClusterViewContent = playCardClusterView.f21589a;
            int indexOfFirstCard = playCardClusterViewContent.getIndexOfFirstCard();
            if (indexOfFirstCard == 0) {
                playCardClusterViewContent.removeAllViews();
                return;
            }
            while (playCardClusterViewContent.getChildCount() > indexOfFirstCard) {
                playCardClusterViewContent.removeViewAt(indexOfFirstCard);
            }
        }
    }
}
