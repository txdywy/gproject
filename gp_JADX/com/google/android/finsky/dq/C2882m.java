package com.google.android.finsky.dq;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.annotation.TargetApi;
import android.transition.TransitionValues;
import android.transition.Visibility;
import android.view.View;
import android.view.ViewGroup;

@TargetApi(19)
public final class C2882m extends Visibility {
    public final Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        return null;
    }

    public final Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "translationY", new float[]{0.0f, (float) (-view.getHeight())});
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, "alpha", new float[]{1.0f, 0.6f});
        Animator animatorSet = new AnimatorSet();
        animatorSet.playTogether(new Animator[]{ofFloat2, ofFloat});
        return new C2875f(animatorSet);
    }
}
