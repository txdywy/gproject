package com.google.android.finsky.layout.play;

import android.content.Context;
import android.view.animation.Interpolator;
import android.widget.Scroller;

public final class ah extends Scroller {
    public final int f18764a = 300;

    public ah(Context context, Interpolator interpolator) {
        super(context, interpolator);
    }

    public final void startScroll(int i, int i2, int i3, int i4, int i5) {
        super.startScroll(i, i2, i3, i4, this.f18764a);
    }

    public final void startScroll(int i, int i2, int i3, int i4) {
        super.startScroll(i, i2, i3, i4, this.f18764a);
    }
}
