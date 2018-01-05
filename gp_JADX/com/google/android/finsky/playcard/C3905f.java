package com.google.android.finsky.playcard;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

final class C3905f extends AnimatorListenerAdapter {
    public final /* synthetic */ AutoTransitionImageView f19734a;

    C3905f(AutoTransitionImageView autoTransitionImageView) {
        this.f19734a = autoTransitionImageView;
    }

    public final void onAnimationStart(Animator animator) {
        float f = 1.0f;
        this.f19734a.f19327e.setAlpha(1.0f);
        View view = this.f19734a.f19328f;
        if (this.f19734a.f19329g) {
            f = 0.0f;
        }
        view.setAlpha(f);
    }

    public final void onAnimationEnd(Animator animator) {
        if (this.f19734a.f19326d != 0) {
            this.f19734a.f19327e.setAlpha(0.0f);
            this.f19734a.f19328f.setAlpha(1.0f);
            this.f19734a.f19327e = this.f19734a.getChildAt(this.f19734a.f19330h);
            this.f19734a.f19330h = (this.f19734a.f19330h + 1) % this.f19734a.f19326d;
            this.f19734a.f19328f = this.f19734a.getChildAt(this.f19734a.f19330h);
            this.f19734a.f19329g = this.f19734a.f19330h > 0;
        }
    }
}
