package com.google.android.finsky.actionbuttons;

import android.graphics.Rect;
import com.google.android.finsky.frameworkviews.s;

public final class com.google.android.finsky.actionbuttons.e implements Runnable
{

    public final com.google.android.finsky.actionbuttons.c a;
    public final Rect b;

    e(com.google.android.finsky.actionbuttons.c p0, Rect p1) {
        this.a = p0;
        this.b = p1;
    }

    public final void run() {
        this.a.N.a(this.b);
        this.a.O = com.google.android.finsky.actionbuttons.g.b;
    }

}
