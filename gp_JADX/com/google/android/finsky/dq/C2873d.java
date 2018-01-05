package com.google.android.finsky.dq;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;

final class C2873d extends AnimatorListenerAdapter {
    public final /* synthetic */ ViewGroup f15359a;
    public final /* synthetic */ View f15360b;
    public final /* synthetic */ View f15361c;
    public final /* synthetic */ View f15362d;
    public final /* synthetic */ View f15363e;

    C2873d(ViewGroup viewGroup, View view, View view2, View view3, View view4) {
        this.f15359a = viewGroup;
        this.f15360b = view;
        this.f15361c = view2;
        this.f15362d = view3;
        this.f15363e = view4;
    }

    public final void onAnimationCancel(Animator animator) {
        ViewGroupOverlay overlay = this.f15359a.getOverlay();
        overlay.remove(this.f15360b);
        overlay.remove(this.f15361c);
        overlay.remove(this.f15362d);
        overlay.remove(this.f15363e);
    }
}
