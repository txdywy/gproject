package com.google.android.finsky.dq;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

final class C2871b extends AnimatorListenerAdapter {
    public final /* synthetic */ View f15349a;
    public final /* synthetic */ View f15350b;
    public final /* synthetic */ View f15351c;
    public final /* synthetic */ int f15352d;

    C2871b(View view, View view2, View view3, int i) {
        this.f15349a = view;
        this.f15350b = view2;
        this.f15351c = view3;
        this.f15352d = i;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f15349a.setVisibility(4);
        this.f15350b.setVisibility(4);
        this.f15351c.setVisibility(0);
        int y = (int) (this.f15350b.getY() + ((float) (this.f15350b.getHeight() / 2)));
        this.f15351c.setTranslationX((float) (((int) (this.f15350b.getX() + ((float) (this.f15350b.getWidth() / 2)))) - this.f15352d));
        this.f15351c.setTranslationY((float) (y - this.f15352d));
    }
}
