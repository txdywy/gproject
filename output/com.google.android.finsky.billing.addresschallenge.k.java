package com.google.android.finsky.billing.addresschallenge;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewPropertyAnimator;
import android.widget.ProgressBar;

public final class com.google.android.finsky.billing.addresschallenge.k extends AnimatorListenerAdapter
{

    public final AddressFieldsLayoutHoneycomb a;

    k(AddressFieldsLayoutHoneycomb p0) {
        this.a = p0;
        AnimatorListenerAdapter();
    }

    public final void onAnimationEnd(Animator p0) {
        this.a.c.setVisibility(8);
        this.a.c.animate().setListener(0);
    }

}
