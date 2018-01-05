package com.google.android.play.search;

import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;

final class ab implements AnimationListener {
    public final /* synthetic */ PlaySearchSuggestionsList f32334a;

    ab(PlaySearchSuggestionsList playSearchSuggestionsList) {
        this.f32334a = playSearchSuggestionsList;
    }

    public final void onAnimationStart(Animation animation) {
    }

    public final void onAnimationEnd(Animation animation) {
        if (!this.f32334a.f32326j) {
            this.f32334a.setVisibility(8);
            this.f32334a.f32320d.setVisibility(8);
            this.f32334a.f32320d.layout(0, 0, 0, 0);
        }
        this.f32334a.f32324h = null;
    }

    public final void onAnimationRepeat(Animation animation) {
    }
}
