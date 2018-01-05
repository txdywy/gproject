package com.android.ex.photo;

import android.view.animation.Animation;

public final class com.android.ex.photo.p implements Animation$AnimationListener
{

    public final com.android.ex.photo.j a;

    p(com.android.ex.photo.j p0) {
        this.a = p0;
    }

    public final void onAnimationEnd(Animation p0) {
        this.a.c.finish();
        this.a.c.overridePendingTransition(0, 0);
    }

    public final void onAnimationRepeat(Animation p0) {
    }

    public final void onAnimationStart(Animation p0) {
    }

}
