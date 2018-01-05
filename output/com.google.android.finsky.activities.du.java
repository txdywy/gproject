package com.google.android.finsky.activities;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

public final class com.google.android.finsky.activities.du extends AnimatorListenerAdapter
{

    public final Runnable a;

    du(Runnable p0) {
        this.a = p0;
        AnimatorListenerAdapter();
    }

    public final void onAnimationEnd(Animator p0) {
        this.a.run();
    }

}
