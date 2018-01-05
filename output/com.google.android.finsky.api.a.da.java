package com.google.android.finsky.api.a;

import com.android.volley.AuthFailureError;
import com.android.volley.VolleyError;
import com.google.android.finsky.api.f;
import com.google.android.play.utils.b.a;

public final class com.google.android.finsky.api.a.da implements com.android.volley.z
{

    public final com.google.android.finsky.api.a.b a;
    public final int b;
    public boolean c;

    da(int p0, com.google.android.finsky.api.a.b p1) {
        this.b = p0;
        this.a = p1;
    }

    public final int a() {
        if (this.c != 0)
            v0 = ((Integer)com.google.android.finsky.api.f.l.b()).intValue();
        else
            v0 = this.b;
        return v0;
    }

    public final void a(VolleyError p0) {
        if (this.c != 0)
            throw p0;
        if (p0 instanceof AuthFailureError)
            this.a.c();
        this.c = 1;
    }

    public final int b() {
        if (this.c != 0)
            v0 = 1;
        else
            v0 = 0;
        return v0;
    }

}
