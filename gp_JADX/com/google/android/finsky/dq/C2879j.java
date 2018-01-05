package com.google.android.finsky.dq;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.transition.TransitionValues;
import android.view.View;
import android.view.ViewGroup;

final class C2879j extends AnimatorListenerAdapter {
    public final /* synthetic */ View f15373a;
    public final /* synthetic */ TransitionValues f15374b;
    public final /* synthetic */ ViewGroup f15375c;
    public final /* synthetic */ View f15376d;

    C2879j(View view, TransitionValues transitionValues, ViewGroup viewGroup, View view2) {
        this.f15373a = view;
        this.f15374b = transitionValues;
        this.f15375c = viewGroup;
        this.f15376d = view2;
    }

    public final void onAnimationStart(Animator animator) {
        this.f15373a.setTranslationZ((float) ((Integer) this.f15374b.values.get("pageFade:translationZ")).intValue());
    }

    public final void onAnimationEnd(Animator animator) {
        this.f15375c.getOverlay().remove(this.f15376d);
    }

    public final void onAnimationCancel(Animator animator) {
        this.f15375c.getOverlay().remove(this.f15376d);
    }
}
