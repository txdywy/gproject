package com.google.android.finsky.p113v;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

public final class C4696c extends AnimatorListenerAdapter {
    public final /* synthetic */ C4695b f24087a;

    public C4696c(C4695b c4695b) {
        this.f24087a = c4695b;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f24087a.m21845a();
    }

    public final void onAnimationCancel(Animator animator) {
        this.f24087a.m21845a();
    }
}
