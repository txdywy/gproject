package com.google.android.finsky.application;

import com.android.volley.a.y;
import com.android.volley.n;
import com.google.android.finsky.api.j;
import com.google.android.finsky.ba.e;

public final class com.google.android.finsky.application.ci implements com.android.volley.t
{

    public final int a;
    public final com.google.android.finsky.application.d b;

    ci(com.google.android.finsky.application.d p0, int p1) {
        this.b = p0;
        this.a = p1;
    }

    public final boolean a(com.android.volley.n p0) {
        if (p0 instanceof com.google.android.finsky.api.j) {
            if (((com.google.android.finsky.api.j)p0).a())
                v0 = 0;
            else if (p0.c() < this.a)
                v0 = 1;
            else
                v0 = 0;
        }
        else if (this.b.dj().a(12639221)) {
            if (p0 instanceof com.android.volley.a.y)
                v0 = 0;
            else if (p0.c() < this.a)
                v0 = 1;
            else
                v0 = 0;
        }
        else if (p0.c() < this.a)
            v0 = 1;
        else
            v0 = 0;
        return v0;
    }

}
