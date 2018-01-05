package com.google.android.finsky.billing.lightpurchase.p118d;

import android.support.v4.app.Fragment;
import android.view.animation.AnimationUtils;
import com.google.android.finsky.utils.FinskyLog;
import com.squareup.leakcanary.C7582R;

final class C1916b implements Runnable {
    public final /* synthetic */ C1086a f9841a;

    C1916b(C1086a c1086a) {
        this.f9841a = c1086a;
    }

    public final void run() {
        if (this.f9841a.ax == null) {
            FinskyLog.m21665c("Current fragment null.", new Object[0]);
            return;
        }
        C1086a c1086a = this.f9841a;
        c1086a.m6742b(c1086a.aE);
        Fragment fragment = this.f9841a;
        fragment.aD.setVisibility(0);
        fragment.aD.startAnimation(AnimationUtils.loadAnimation(fragment.m603h(), C7582R.anim.play_fade_in));
        this.f9841a.m6743b(this.f9841a.ax);
    }
}
