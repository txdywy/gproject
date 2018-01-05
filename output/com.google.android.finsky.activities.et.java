package com.google.android.finsky.activities;

import android.content.DialogInterface;
import com.google.android.finsky.aa.n;
import com.google.android.finsky.billing.common.d;
import com.google.android.finsky.installqueue.f;
import com.google.android.finsky.installqueue.g;
import com.google.android.finsky.m;
import com.google.android.finsky.z.e;

public final class com.google.android.finsky.activities.et implements DialogInterface$OnClickListener
{

    et() {
    }

    public final void onClick(DialogInterface p0, int p1) {
        com.google.android.finsky.billing.common.d.c.c();
        com.google.android.finsky.billing.common.d.b.a(Integer.valueOf(1));
        v0 = com.google.android.finsky.m.a.bw();
        v0.a(new com.google.android.finsky.installqueue.f().a("single_install").a()).a(new com.google.android.finsky.activities.eu(v0));
    }

}
