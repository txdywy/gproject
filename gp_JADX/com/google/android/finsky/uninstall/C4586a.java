package com.google.android.finsky.uninstall;

import android.content.Context;
import android.view.animation.AnimationUtils;
import com.google.android.finsky.utils.FinskyLog;
import com.squareup.leakcanary.C7582R;

final class C4586a implements Runnable {
    public final /* synthetic */ UninstallManagerActivityV2 f23439a;

    C4586a(UninstallManagerActivityV2 uninstallManagerActivityV2) {
        this.f23439a = uninstallManagerActivityV2;
    }

    public final void run() {
        if (this.f23439a.f23424K) {
            this.f23439a.m21252A();
            Context context = this.f23439a;
            context.f23429P.setVisibility(0);
            context.f23429P.startAnimation(AnimationUtils.loadAnimation(context, C7582R.anim.play_fade_in));
            return;
        }
        FinskyLog.m21665c("Current fragment null.", new Object[0]);
    }
}
