package com.google.android.finsky.actionbuttons;

import android.graphics.Rect;
import android.view.ViewTreeObserver;
import com.google.android.finsky.frameworkviews.PlayActionButtonV2;

public final class com.google.android.finsky.actionbuttons.af implements ViewTreeObserver$OnGlobalLayoutListener
{

    public final PlayActionButtonV2 a;
    public final String b;
    public final com.google.android.finsky.actionbuttons.ae c;

    af(com.google.android.finsky.actionbuttons.ae p0, PlayActionButtonV2 p1, String p2) {
        this.c = p0;
        this.a = p1;
        this.b = p2;
    }

    public final void onGlobalLayout() {
        this.a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        v2 = new int[2];
        this.a.getLocationInWindow(v2);
        v2[1] = v2[1] + 4;
        if (v2[0] > 0 && v2[1] > 0)
            v0 = new Rect(v2[0], v2[1], v2[0] + this.a.getWidth(), this.a.getHeight() + v2[1]);
        else
            v0 = 0;
        if (v0 != 0 && this.c.j != 0)
            this.c.j.a(v0, this.a, this.b);
    }

}
