package com.google.android.finsky.dq;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;

final class C2872c extends AnimatorListenerAdapter {
    public final /* synthetic */ View f15353a;
    public final /* synthetic */ View f15354b;
    public final /* synthetic */ View f15355c;
    public final /* synthetic */ ViewGroup f15356d;
    public final /* synthetic */ View f15357e;
    public final /* synthetic */ View f15358f;

    C2872c(View view, View view2, View view3, ViewGroup viewGroup, View view4, View view5) {
        this.f15353a = view;
        this.f15354b = view2;
        this.f15355c = view3;
        this.f15356d = viewGroup;
        this.f15357e = view4;
        this.f15358f = view5;
    }

    public final void onAnimationStart(Animator animator) {
        this.f15353a.setVisibility(4);
        this.f15354b.setAlpha(1.0f);
        this.f15355c.setVisibility(0);
    }

    public final void onAnimationEnd(Animator animator) {
        ViewGroupOverlay overlay = this.f15356d.getOverlay();
        overlay.remove(this.f15357e);
        overlay.remove(this.f15353a);
        overlay.remove(this.f15358f);
        overlay.remove(this.f15355c);
    }
}
