package com.google.android.finsky.dq;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.transition.TransitionValues;
import android.view.View;

final class C2878i extends AnimatorListenerAdapter {
    public final /* synthetic */ View f15371a;
    public final /* synthetic */ TransitionValues f15372b;

    C2878i(View view, TransitionValues transitionValues) {
        this.f15371a = view;
        this.f15372b = transitionValues;
    }

    public final void onAnimationStart(Animator animator) {
        this.f15371a.setTranslationZ((float) ((Integer) this.f15372b.values.get("pageFade:translationZ")).intValue());
    }
}
