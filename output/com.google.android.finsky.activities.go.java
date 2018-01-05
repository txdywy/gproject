package com.google.android.finsky.activities;

import android.view.View;
import com.google.android.finsky.layout.o;

public final class com.google.android.finsky.activities.go implements Runnable
{

    public final boolean a;
    public final com.google.android.finsky.activities.gp b;
    public final com.google.android.finsky.activities.gn c;

    go(com.google.android.finsky.activities.gn p0, boolean p1, com.google.android.finsky.activities.gp p2) {
        this.c = p0;
        this.a = p1;
        this.b = p2;
    }

    public final void run() {
        if (this.a != 0) {
            this.b.a(this.c.ax.e);
            if (this.c.ax.g != 0)
                this.c.ax.g.setVisibility(8);
        }
        else {
            this.c.ax.a(this.c.aq, 1);
            this.c.ap();
        }
    }

}
