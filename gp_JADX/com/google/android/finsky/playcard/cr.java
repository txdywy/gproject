package com.google.android.finsky.playcard;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

final class cr extends AnimatorListenerAdapter {
    public final /* synthetic */ Tooltip f19726a;

    cr(Tooltip tooltip) {
        this.f19726a = tooltip;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f19726a.m18471b();
    }
}
