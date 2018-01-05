package com.google.android.play.search;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

final class C6415h extends AnimatorListenerAdapter {
    public final /* synthetic */ PlaySearch f32356a;

    C6415h(PlaySearch playSearch) {
        this.f32356a = playSearch;
    }

    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        this.f32356a.m29361b(3);
    }
}
