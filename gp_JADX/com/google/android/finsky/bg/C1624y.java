package com.google.android.finsky.bg;

import android.view.animation.Animation;

final class C1624y extends C1603c {
    public final /* synthetic */ C1623x f8542a;

    C1624y(C1623x c1623x) {
        this.f8542a = c1623x;
    }

    public final void onAnimationEnd(Animation animation) {
        if (this.f8542a.f8541b != null) {
            this.f8542a.f8541b.mo4174b();
        }
    }
}
