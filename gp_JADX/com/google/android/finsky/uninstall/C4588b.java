package com.google.android.finsky.uninstall;

import android.view.View;
import android.view.animation.Animation;
import com.google.android.finsky.bg.C1603c;

final class C4588b extends C1603c {
    public final /* synthetic */ View f23527a;

    C4588b(View view) {
        this.f23527a = view;
    }

    public final void onAnimationEnd(Animation animation) {
        this.f23527a.setVisibility(4);
    }
}
