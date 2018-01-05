package com.google.android.finsky.activities;

import android.view.View;
import android.view.View$OnClickListener;
import com.google.android.finsky.navigationmanager.a;

public final class com.google.android.finsky.activities.cf implements View$OnClickListener
{

    public final int a;
    public final com.google.android.finsky.activities.bq b;

    cf(com.google.android.finsky.activities.bq p0, int p1) {
        this.b = p0;
        this.a = p1;
    }

    public final void onClick(View p0) {
        this.b.z.a(this.b.C, this.b.D, 1, 0, this.b.L, this.a, this.b.T, this.b.S).onClick(p0);
    }

}
