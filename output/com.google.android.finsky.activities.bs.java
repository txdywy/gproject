package com.google.android.finsky.activities;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.finsky.ba.e;
import com.google.android.finsky.installqueue.g;
import com.google.android.finsky.m;
import com.google.android.finsky.z.e;
import com.google.android.finsky.z.h;

public final class com.google.android.finsky.activities.bs implements View$OnClickListener
{

    public final String a;
    public final ViewGroup b;
    public final com.google.android.finsky.activities.bq c;

    bs(com.google.android.finsky.activities.bq p0, String p1, ViewGroup p2) {
        this.c = p0;
        this.a = p1;
        this.b = p2;
    }

    public final void onClick(View p0) {
        this.c.d(2917);
        if (com.google.android.finsky.m.a.dj().a(12643667))
            this.c.e();
        else
            this.c.c.a(this.a).a(com.google.android.finsky.z.h.a);
        this.b.setVisibility(4);
    }

}
