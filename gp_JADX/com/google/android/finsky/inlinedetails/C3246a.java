package com.google.android.finsky.inlinedetails;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.os.Handler;

final class C3246a extends AnimatorListenerAdapter {
    public final /* synthetic */ InlineAppDetailsDialogRootFrameLayout f16748a;

    C3246a(InlineAppDetailsDialogRootFrameLayout inlineAppDetailsDialogRootFrameLayout) {
        this.f16748a = inlineAppDetailsDialogRootFrameLayout;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f16748a.f16745f = false;
        if (this.f16748a.f16747h != null) {
            new Handler().postDelayed(this.f16748a.f16747h, 20);
            this.f16748a.f16747h = null;
        }
        if (this.f16748a.f16746g) {
            this.f16748a.requestLayout();
        }
    }
}
