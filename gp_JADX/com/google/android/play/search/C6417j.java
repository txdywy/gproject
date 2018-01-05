package com.google.android.play.search;

import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;

final class C6417j implements AnimationListener {
    public final /* synthetic */ boolean f32358a;
    public final /* synthetic */ PlaySearch f32359b;

    C6417j(PlaySearch playSearch, boolean z) {
        this.f32359b = playSearch;
        this.f32358a = z;
    }

    public final void onAnimationStart(Animation animation) {
    }

    public final void onAnimationRepeat(Animation animation) {
    }

    public final void onAnimationEnd(Animation animation) {
        if (!this.f32358a) {
            this.f32359b.f32282u.setVisibility(8);
        }
    }
}
