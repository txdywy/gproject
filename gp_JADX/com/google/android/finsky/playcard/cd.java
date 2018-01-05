package com.google.android.finsky.playcard;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.ViewGroup.LayoutParams;

final /* synthetic */ class cd implements AnimatorUpdateListener {
    public final PlayCardViewMyAppsV2 f19718a;

    cd(PlayCardViewMyAppsV2 playCardViewMyAppsV2) {
        this.f19718a = playCardViewMyAppsV2;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        PlayCardViewMyAppsV2 playCardViewMyAppsV2 = this.f19718a;
        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        LayoutParams layoutParams = playCardViewMyAppsV2.f19500i.getLayoutParams();
        layoutParams.height = intValue;
        playCardViewMyAppsV2.f19500i.setLayoutParams(layoutParams);
    }
}
