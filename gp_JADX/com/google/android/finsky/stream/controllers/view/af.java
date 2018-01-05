package com.google.android.finsky.stream.controllers.view;

import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Animation;
import com.google.android.finsky.bg.C1603c;
import com.google.android.finsky.playcard.PlayCardViewRate;
import com.google.android.finsky.stream.base.playcluster.PlayCardClusterView;
import com.google.android.finsky.stream.base.playcluster.PlayCardClusterViewContent;

final class af extends C1603c {
    public final /* synthetic */ PlayCardViewRate f23082a;
    public final /* synthetic */ PlayCardRateClusterView f23083b;

    af(PlayCardRateClusterView playCardRateClusterView, PlayCardViewRate playCardViewRate) {
        this.f23083b = playCardRateClusterView;
        this.f23082a = playCardViewRate;
    }

    public final void onAnimationEnd(Animation animation) {
        int indexOfFirstCard;
        int i = 0;
        this.f23082a.setVisibility(4);
        this.f23082a.setState(2);
        PlayCardClusterView playCardClusterView = this.f23083b;
        View view = this.f23082a;
        PlayCardClusterViewContent playCardClusterViewContent = playCardClusterView.a;
        for (int i2 = 0; i2 < playCardClusterViewContent.getChildCount(); i2++) {
            if (playCardClusterViewContent.getChildAt(i2) == view) {
                indexOfFirstCard = i2 - playCardClusterViewContent.getIndexOfFirstCard();
                break;
            }
        }
        indexOfFirstCard = -1;
        int width = view.getWidth();
        int cardChildCount = playCardClusterView.getCardChildCount();
        int[] iArr = new int[cardChildCount];
        while (i < cardChildCount) {
            iArr[i] = playCardClusterView.m19866a(i).getLeft();
            i++;
        }
        Animation agVar = new ag(playCardClusterView, (float) width, width, indexOfFirstCard, cardChildCount, iArr);
        agVar.setDuration(200);
        agVar.setInterpolator(new AccelerateDecelerateInterpolator());
        agVar.setAnimationListener(new ah(playCardClusterView, view));
        playCardClusterView.a.startAnimation(agVar);
    }
}
