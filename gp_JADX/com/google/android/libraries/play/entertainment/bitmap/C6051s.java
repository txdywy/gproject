package com.google.android.libraries.play.entertainment.bitmap;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

final class C6051s extends AnimatorListenerAdapter {
    public final /* synthetic */ PEImageView f30179a;

    C6051s(PEImageView pEImageView) {
        this.f30179a = pEImageView;
    }

    public final void onAnimationEnd(Animator animator) {
        if (animator == this.f30179a.f30130k) {
            this.f30179a.m27922a(null);
        }
    }
}
