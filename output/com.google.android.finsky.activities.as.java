package com.google.android.finsky.activities;

import android.content.DialogInterface;
import android.os.Handler;
import android.os.Looper;
import com.google.android.finsky.aa.n;

public final class com.google.android.finsky.activities.as implements DialogInterface$OnClickListener
{

    public final com.google.android.finsky.aa.n a;
    public final com.google.android.finsky.activities.t b;

    as(com.google.android.finsky.activities.t p0, com.google.android.finsky.aa.n p1) {
        this.b = p0;
        this.a = p1;
    }

    public final void onClick(DialogInterface p0, int p1) {
        this.a.c();
        com.google.android.finsky.activities.t.c();
        new Handler(Looper.getMainLooper()).postDelayed(this.b.b, 3000);
    }

}
