package com.android.ex.photo;

import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;

final class C0578p implements AnimationListener {
    public final /* synthetic */ C0572j f3841a;

    C0578p(C0572j c0572j) {
        this.f3841a = c0572j;
    }

    public final void onAnimationEnd(Animation animation) {
        C0572j c0572j = this.f3841a;
        c0572j.f3812c.finish();
        c0572j.f3812c.overridePendingTransition(0, 0);
    }

    public final void onAnimationRepeat(Animation animation) {
    }

    public final void onAnimationStart(Animation animation) {
    }
}
