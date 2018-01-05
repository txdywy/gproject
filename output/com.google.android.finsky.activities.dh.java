package com.google.android.finsky.activities;

import android.support.v4.app.Fragment;
import com.android.volley.VolleyError;
import com.google.android.finsky.api.m;
import com.google.android.finsky.at.b;
import com.google.android.finsky.pagesystem.b;
import com.google.android.finsky.pagesystem.e;

public final class com.google.android.finsky.activities.dh implements com.android.volley.w
{

    public final com.google.android.finsky.activities.de a;

    dh(com.google.android.finsky.activities.de p0) {
        this.a = p0;
    }

    public final void a(VolleyError p0) {
        v3 = com.google.android.finsky.api.m.a(this.a.h(), p0);
        if (v3 != 0)
            com.google.android.finsky.at.b.a(this.a.B, this.a, 0, v3, this.a.bw, 10);
        else
            this.a.bm.m();
    }

}
