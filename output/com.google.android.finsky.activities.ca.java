package com.google.android.finsky.activities;

import android.view.View;
import com.google.android.finsky.f.a;

public final class com.google.android.finsky.activities.ca implements View$OnClickListener
{

    public final String a;
    public final com.google.android.finsky.f.a b;
    public final com.google.android.finsky.activities.bq c;

    ca(com.google.android.finsky.activities.bq p0, String p1, com.google.android.finsky.f.a p2) {
        this.c = p0;
        this.a = p1;
        this.b = p2;
    }

    public final void onClick(View p0) {
        this.c.d(214);
        this.c.a(this.a, this.b.r, 0);
    }

}
