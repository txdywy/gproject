package com.google.android.finsky.activities;

import android.graphics.Rect;
import com.google.android.finsky.frameworkviews.s;

public final class com.google.android.finsky.activities.br implements Runnable
{

    public final com.google.android.finsky.activities.bq a;
    public final Rect b;

    br(com.google.android.finsky.activities.bq p0, Rect p1) {
        this.a = p0;
        this.b = p1;
    }

    public final void run() {
        this.a.n.a(this.b);
        this.a.o = com.google.android.finsky.activities.cg.b;
    }

}
