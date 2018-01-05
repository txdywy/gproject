package com.google.android.finsky.billing.lightpurchase.d;

import android.support.v4.app.Fragment;
import android.view.View;
import android.view.animation.AnimationUtils;
import com.google.android.finsky.utils.FinskyLog;

public final class com.google.android.finsky.billing.lightpurchase.d.b implements Runnable
{

    public final com.google.android.finsky.billing.lightpurchase.d.a a;

    b(com.google.android.finsky.billing.lightpurchase.d.a p0) {
        this.a = p0;
    }

    public final void run() {
        if (this.a.ax == 0)
            FinskyLog.c("Current fragment null.", new Object[0]);
        else {
            this.a.b(this.a.aE);
            this.a.aD.setVisibility(0);
            this.a.aD.startAnimation(AnimationUtils.loadAnimation(this.a.h(), 2131034135));
            this.a.b(this.a.ax);
        }
    }

}
