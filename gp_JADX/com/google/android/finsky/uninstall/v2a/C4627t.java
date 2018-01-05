package com.google.android.finsky.uninstall.v2a;

import android.view.animation.AnimationUtils;
import com.google.android.finsky.utils.FinskyLog;
import com.squareup.leakcanary.C7582R;

final class C4627t implements Runnable {
    public final /* synthetic */ C4626s f23830a;

    C4627t(C4626s c4626s) {
        this.f23830a = c4626s;
    }

    public final void run() {
        if (this.f23830a.f23815e.f23833a == -1) {
            FinskyLog.m21665c("Current fragment null.", new Object[0]);
            return;
        }
        this.f23830a.m21572a(this.f23830a.f23814d);
        this.f23830a.f23813c.setVisibility(0);
        this.f23830a.f23813c.startAnimation(AnimationUtils.loadAnimation(this.f23830a.f23811a, C7582R.anim.play_fade_in));
    }
}
