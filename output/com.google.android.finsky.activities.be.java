package com.google.android.finsky.activities;

import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;

public final class com.google.android.finsky.activities.be implements DialogInterface$OnClickListener
{

    public static final DialogInterface$OnClickListener a;

    static {
        com.google.android.finsky.activities.be.a = new com.google.android.finsky.activities.be();
    }

    be() {
    }

    public final void onClick(DialogInterface p0, int p1) {
        p0.dismiss();
    }

}
