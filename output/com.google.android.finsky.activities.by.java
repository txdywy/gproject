package com.google.android.finsky.activities;

import android.view.View;
import com.google.android.finsky.actionbuttons.at;
import com.google.android.finsky.f.a;

public final class com.google.android.finsky.activities.by implements View$OnClickListener
{

    public final String a;
    public final com.google.android.finsky.f.a b;
    public final boolean c;
    public final com.google.android.finsky.activities.bq d;

    by(com.google.android.finsky.activities.bq p0, String p1, com.google.android.finsky.f.a p2, boolean p3) {
        this.d = p0;
        this.a = p1;
        this.b = p2;
        this.c = p3;
    }

    public final void onClick(View p0) {
        this.d.d(215);
        if (this.b.q == 0)
            com.google.android.finsky.actionbuttons.at.a(this.a, this.d.A, this.b.j, this.b.i, this.c);
        else
            this.d.a(this.a, this.b.r, 1);
    }

}
