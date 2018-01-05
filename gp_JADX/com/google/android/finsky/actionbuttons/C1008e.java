package com.google.android.finsky.actionbuttons;

import android.graphics.Rect;

final /* synthetic */ class C1008e implements Runnable {
    public final C1006c f6171a;
    public final Rect f6172b;

    C1008e(C1006c c1006c, Rect rect) {
        this.f6171a = c1006c;
        this.f6172b = rect;
    }

    public final void run() {
        C1006c c1006c = this.f6171a;
        c1006c.f6141N.m16051a(this.f6172b);
        c1006c.f6142O = C1010g.SHOW_WITHOUT_ANIMATION;
    }
}
