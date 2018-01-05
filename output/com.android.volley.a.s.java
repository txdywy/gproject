package com.android.volley.a;

import com.android.volley.VolleyError;
import java.util.HashMap;

public final class com.android.volley.a.s implements com.android.volley.w
{

    public final String a;
    public final com.android.volley.a.q b;

    s(com.android.volley.a.q p0, String p1) {
        this.b = p0;
        this.a = p1;
    }

    public final void a(VolleyError p0) {
        v0 = this.b.d.remove(this.a);
        if ((com.android.volley.a.u)v0 != 0) {
            ((com.android.volley.a.u)v0).c = p0;
            this.b.a(this.a, (com.android.volley.a.u)v0);
        }
    }

}
