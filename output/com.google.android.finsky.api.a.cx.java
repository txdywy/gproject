package com.google.android.finsky.api.a;

import com.android.volley.AuthFailureError;
import com.android.volley.VolleyError;
import com.android.volley.f;
import com.google.android.finsky.api.f;
import com.google.android.play.utils.b.a;

public final class com.google.android.finsky.api.a.cx extends com.android.volley.f
{

    public final com.google.android.finsky.api.a.b e;
    public boolean f;

    cx(int p0, int p1, float p2, com.google.android.finsky.api.a.b p3) {
        com.android.volley.f(p0, p1, p2);
        this.e = p3;
    }

    cx(int p0, com.google.android.finsky.api.a.b p1) {
        com.android.volley.f(p0, ((Integer)com.google.android.finsky.api.f.e.b()).intValue(), ((Float)com.google.android.finsky.api.f.f.b()).floatValue());
        this.e = p1;
    }

    public final void a(VolleyError p0) {
        if (p0 instanceof AuthFailureError) {
            if (this.f != 0)
                throw p0;
            this.f = 1;
            this.e.c();
        }
        super.a(p0);
    }

}
