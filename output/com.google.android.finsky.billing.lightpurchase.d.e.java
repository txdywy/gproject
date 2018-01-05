package com.google.android.finsky.billing.lightpurchase.d;

import android.view.View;
import android.view.animation.Animation;
import com.google.android.finsky.bg.c;

public final class com.google.android.finsky.billing.lightpurchase.d.e extends com.google.android.finsky.bg.c
{

    public final View a;

    e(View p0) {
        this.a = p0;
        com.google.android.finsky.bg.c();
    }

    public final void onAnimationEnd(Animation p0) {
        this.a.setVisibility(4);
    }

}
