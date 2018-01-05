package com.google.android.finsky.uninstall;

import android.view.animation.Animation;
import com.google.android.finsky.bg.C1603c;

final class C4591c extends C1603c {
    public final /* synthetic */ UninstallManagerActivityV2 f23586a;

    C4591c(UninstallManagerActivityV2 uninstallManagerActivityV2) {
        this.f23586a = uninstallManagerActivityV2;
    }

    public final void onAnimationEnd(Animation animation) {
        this.f23586a.f23429P.setVisibility(4);
    }
}
