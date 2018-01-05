package com.google.android.finsky.activities;

import android.content.DialogInterface;
import android.support.v4.app.Fragment;
import android.support.v4.app.p;
import com.google.android.finsky.utils.ak;

public final class com.google.android.finsky.activities.gc implements DialogInterface$OnClickListener
{

    public final com.google.android.finsky.activities.gb a;

    gc(com.google.android.finsky.activities.gb p0) {
        this.a = p0;
    }

    public final void onClick(DialogInterface p0, int p1) {
        this.a.a(0);
        if (this.a.r instanceof com.google.android.finsky.activities.gd)
            v0 = (com.google.android.finsky.activities.gd)this.a.r;
        else {
            v0 = this.a.h();
            if (v0 instanceof com.google.android.finsky.activities.gd)
                v0 = (com.google.android.finsky.activities.gd)v0;
            else
                v0 = 0;
        }
        v0.b(com.google.android.finsky.utils.ak.a(p1));
    }

}
