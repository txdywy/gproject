package com.google.android.finsky.billing.addresschallenge;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

final class C1739k extends AnimatorListenerAdapter {
    public final /* synthetic */ AddressFieldsLayoutHoneycomb f9040a;

    C1739k(AddressFieldsLayoutHoneycomb addressFieldsLayoutHoneycomb) {
        this.f9040a = addressFieldsLayoutHoneycomb;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f9040a.c.setVisibility(8);
        this.f9040a.c.animate().setListener(null);
    }
}
