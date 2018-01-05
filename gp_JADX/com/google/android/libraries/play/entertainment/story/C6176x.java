package com.google.android.libraries.play.entertainment.story;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

class C6176x extends AnimatorListenerAdapter implements AnimatorUpdateListener {
    public boolean f30690q;

    C6176x() {
    }

    public void onAnimationCancel(Animator animator) {
        this.f30690q = true;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
    }
}
