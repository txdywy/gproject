package com.google.android.finsky.activities;

import android.support.v4.app.Fragment;
import android.view.View;
import android.view.View$OnClickListener;
import com.google.android.finsky.dfemodel.Document;

public final class com.google.android.finsky.activities.ec implements View$OnClickListener
{

    public final View$OnClickListener a;
    public final Document b;
    public final com.google.android.finsky.activities.dx c;

    ec(com.google.android.finsky.activities.dx p0, View$OnClickListener p1, Document p2) {
        this.c = p0;
        this.a = p1;
        this.b = p2;
    }

    public final void onClick(View p0) {
        v0 = this.c.h();
        if (this.c.ar == 0) {
            this.c.ar = 1;
            v1 = new com.google.android.finsky.activities.ed(this, p0);
            if (v0 instanceof InlineAppDetailsDialog)
                ((InlineAppDetailsDialog)v0).a(0, v1);
            else
                v1.run();
        }
    }

}
