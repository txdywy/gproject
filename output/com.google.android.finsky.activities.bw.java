package com.google.android.finsky.activities;

import android.view.ViewTreeObserver;
import com.google.android.finsky.actionbuttons.ae;
import com.google.android.finsky.frameworkviews.PlayActionButtonV2;
import com.google.android.finsky.frameworkviews.s;

public final class com.google.android.finsky.activities.bw implements ViewTreeObserver$OnGlobalLayoutListener
{

    public final PlayActionButtonV2 a;
    public final String b;
    public final com.google.android.finsky.activities.bq c;

    bw(com.google.android.finsky.activities.bq p0, PlayActionButtonV2 p1, String p2) {
        this.c = p0;
        this.a = p1;
        this.b = p2;
    }

    public final void onGlobalLayout() {
        this.a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        this.c.n = com.google.android.finsky.actionbuttons.ae.a(this.a, this.b);
        this.c.n.a(new com.google.android.finsky.activities.bx(this));
        this.c.a(this.a);
    }

}
