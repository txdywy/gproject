package com.google.android.finsky.bg;

import android.view.animation.Animation;

public final class com.google.android.finsky.bg.y extends com.google.android.finsky.bg.c
{

    public final com.google.android.finsky.bg.x a;

    y(com.google.android.finsky.bg.x p0) {
        this.a = p0;
        com.google.android.finsky.bg.c();
    }

    public final void onAnimationEnd(Animation p0) {
        if (this.a.b != 0)
            this.a.b.b();
    }

}
