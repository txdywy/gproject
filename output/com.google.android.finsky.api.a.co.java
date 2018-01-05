package com.google.android.finsky.api.a;

import com.android.volley.n;
import com.android.volley.w;
import com.android.volley.x;
import com.google.android.finsky.api.l;
import com.google.android.finsky.api.p;
import com.google.android.finsky.d.g;
import com.google.android.finsky.do.a;
import com.google.android.finsky.dx.a;
import java.util.HashMap;
import java.util.Map;

public final class com.google.android.finsky.api.a.co extends com.google.android.finsky.api.a.cp
{

    public final Map q;

    co(String p0, com.google.android.finsky.api.a.b p1, com.google.android.finsky.api.a.cz p2, com.android.volley.x p3, com.android.volley.w p4, com.google.android.finsky.do.a p5, com.google.android.finsky.dx.a p6, com.google.android.finsky.api.p p7, com.google.android.finsky.d.g p8, com.google.android.finsky.api.l p9) {
        com.google.android.finsky.api.a.cp(1, p0, p1, p2, p3, p4, p5, p6, p7, p8, p9);
        this.q = new HashMap();
        this.i = 0;
        this.C = 1;
        this.F = 1;
    }

    final void a(String p0, String p1) {
        this.q.put(p0, p1);
    }

    public final Map k() {
        return this.q;
    }

}
