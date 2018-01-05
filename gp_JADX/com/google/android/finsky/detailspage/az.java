package com.google.android.finsky.detailspage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

final class az extends AnimatorListenerAdapter {
    public final /* synthetic */ ay f14266a;

    az(ay ayVar) {
        this.f14266a = ayVar;
    }

    public final void onAnimationEnd(Animator animator) {
        if (this.f14266a.f14265a.aG != null) {
            this.f14266a.f14265a.aG.setClipChildren(true);
        }
    }
}
