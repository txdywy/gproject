package com.google.android.play.search;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

final class C6416i extends AnimatorListenerAdapter {
    public final /* synthetic */ PlaySearch f32357a;

    C6416i(PlaySearch playSearch) {
        this.f32357a = playSearch;
    }

    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        this.f32357a.setVisibility(4);
        this.f32357a.f32282u.setVisibility(8);
    }
}
