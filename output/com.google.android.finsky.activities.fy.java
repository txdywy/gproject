package com.google.android.finsky.activities;

import android.content.DialogInterface;
import android.support.v4.app.Fragment;
import android.support.v4.app.p;

public final class com.google.android.finsky.activities.fy implements DialogInterface$OnClickListener
{

    public final com.google.android.finsky.activities.fw a;

    fy(com.google.android.finsky.activities.fw p0) {
        this.a = p0;
    }

    public final void onClick(DialogInterface p0, int p1) {
        if (this.a.r instanceof com.google.android.finsky.activities.fz)
            v0 = (com.google.android.finsky.activities.fz)this.a.r;
        else {
            v0 = this.a.h();
            if (v0 instanceof com.google.android.finsky.activities.fz)
                v0 = (com.google.android.finsky.activities.fz)v0;
            else
                v0 = 0;
        }
        if (v0 != 0)
            v0.a(this.a.af[0], this.a.af[1]);
        this.a.a(0);
    }

}
