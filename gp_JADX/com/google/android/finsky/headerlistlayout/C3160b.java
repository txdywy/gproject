package com.google.android.finsky.headerlistlayout;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

final class C3160b extends AnimatorListenerAdapter {
    public final /* synthetic */ View f16362a;
    public final /* synthetic */ ControlsContainerBackground f16363b;

    C3160b(ControlsContainerBackground controlsContainerBackground, View view) {
        this.f16363b = controlsContainerBackground;
        this.f16362a = view;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f16363b.removeView(this.f16362a);
    }

    public final void onAnimationCancel(Animator animator) {
        this.f16363b.removeView(this.f16362a);
    }
}
