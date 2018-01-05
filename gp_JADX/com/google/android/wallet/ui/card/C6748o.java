package com.google.android.wallet.ui.card;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;

final class C6748o extends AnimatorListenerAdapter {
    public final /* synthetic */ ViewGroup f33283a;

    C6748o(ViewGroup viewGroup) {
        this.f33283a = viewGroup;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f33283a.setTranslationY(0.0f);
    }
}
