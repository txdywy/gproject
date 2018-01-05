package com.google.android.finsky.stream.controllers.view;

import android.os.Handler;
import android.os.Looper;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import com.google.android.finsky.playcard.PlayCardViewRate;

final class ah implements AnimationListener {
    public final /* synthetic */ PlayCardViewRate f23089a;
    public final /* synthetic */ PlayCardRateClusterView f23090b;

    ah(PlayCardRateClusterView playCardRateClusterView, PlayCardViewRate playCardViewRate) {
        this.f23090b = playCardRateClusterView;
        this.f23089a = playCardViewRate;
    }

    public final void onAnimationStart(Animation animation) {
    }

    public final void onAnimationRepeat(Animation animation) {
    }

    public final void onAnimationEnd(Animation animation) {
        new Handler(Looper.myLooper()).postDelayed(new ai(this), 50);
    }
}
