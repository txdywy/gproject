package com.google.android.finsky.playcard;

import android.view.animation.Animation;
import com.google.android.finsky.bg.C1603c;

final class ci extends C1603c {
    public final /* synthetic */ PlayCardViewRate f19722a;

    ci(PlayCardViewRate playCardViewRate) {
        this.f19722a = playCardViewRate;
    }

    public final void onAnimationEnd(Animation animation) {
        this.f19722a.setState(0);
    }
}
