package com.google.android.finsky.activities;

import android.content.DialogInterface;
import android.support.v4.app.Fragment;
import android.widget.TextView;

public final class com.google.android.finsky.activities.dq implements DialogInterface$OnClickListener
{

    public final TextView a;
    public final com.google.android.finsky.activities.dp b;

    dq(com.google.android.finsky.activities.dp p0, TextView p1) {
        this.b = p0;
        this.a = p1;
    }

    public final void onClick(DialogInterface p0, int p1) {
        if (this.b.r instanceof com.google.android.finsky.activities.ds)
            v0 = (com.google.android.finsky.activities.ds)this.b.r;
        else {
            v0 = this.b.h();
            if (v0 instanceof com.google.android.finsky.activities.ds)
                v0 = (com.google.android.finsky.activities.ds)v0;
            else
                v0 = 0;
        }
        if (v0 != 0)
            v0.a(this.a.getText().toString());
    }

}
