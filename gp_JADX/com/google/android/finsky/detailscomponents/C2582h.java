package com.google.android.finsky.detailscomponents;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

final class C2582h extends AnimatorListenerAdapter {
    public final /* synthetic */ HeroGraphicView f13771a;

    C2582h(HeroGraphicView heroGraphicView) {
        this.f13771a = heroGraphicView;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f13771a.setCorpusFillMode(0);
    }
}
