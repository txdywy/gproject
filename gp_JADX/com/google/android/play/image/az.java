package com.google.android.play.image;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

final class az extends AnimatorListenerAdapter {
    public final /* synthetic */ FifeImageView f32039a;

    az(FifeImageView fifeImageView) {
        this.f32039a = fifeImageView;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f32039a.m29188d();
    }
}
