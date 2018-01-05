package com.google.android.finsky.activities;

import android.content.DialogInterface;

public final class com.google.android.finsky.activities.fx implements DialogInterface$OnMultiChoiceClickListener
{

    public final com.google.android.finsky.activities.fw a;

    fx(com.google.android.finsky.activities.fw p0) {
        this.a = p0;
    }

    public final void onClick(DialogInterface p0, int p1, boolean p2) {
        this.a.af[p1] = p2;
    }

}
