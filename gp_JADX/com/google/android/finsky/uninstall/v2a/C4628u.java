package com.google.android.finsky.uninstall.v2a;

import android.view.View;
import android.view.animation.Animation;
import com.google.android.finsky.bg.C1603c;

final class C4628u extends C1603c {
    public final /* synthetic */ View f23831a;

    C4628u(View view) {
        this.f23831a = view;
    }

    public final void onAnimationEnd(Animation animation) {
        this.f23831a.setVisibility(4);
    }
}
