package com.google.android.finsky.bc;

import com.android.volley.VolleyError;
import com.google.android.finsky.d.c;
import com.google.android.finsky.d.g;
import com.google.android.finsky.d.j;
import com.google.android.finsky.pagesystem.b;

public final class com.google.android.finsky.bc.j implements com.android.volley.w
{

    public final com.google.android.finsky.bc.g a;

    j(com.google.android.finsky.bc.g p0) {
        this.a = p0;
    }

    public final void a(VolleyError p0) {
        v1 = new com.google.android.finsky.d.c(537);
        v1.b(Integer.valueOf(1));
        if (p0 != 0)
            v1.a(p0);
        this.a.c.dc().a(v1.a, 0);
        this.a.a(p0);
    }

}
