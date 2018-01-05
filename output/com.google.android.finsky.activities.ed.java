package com.google.android.finsky.activities;

import android.view.View;
import android.view.View$OnClickListener;
import com.google.android.finsky.ba.e;
import com.google.android.finsky.m;

public final class com.google.android.finsky.activities.ed implements Runnable
{

    public final View a;
    public final com.google.android.finsky.activities.ec b;

    ed(com.google.android.finsky.activities.ec p0, View p1) {
        this.b = p0;
        this.a = p1;
    }

    public final void run() {
        this.b.a.onClick(this.a);
        this.b.c.ar = 0;
        if (com.google.android.finsky.m.a.dj().a(12640245))
            com.google.android.finsky.activities.dx.a(this.b.b);
    }

}
