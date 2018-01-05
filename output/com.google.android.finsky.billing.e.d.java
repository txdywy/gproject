package com.google.android.finsky.billing.e;

import com.android.volley.a.z;
import com.android.volley.q;
import com.android.volley.w;
import com.android.volley.x;
import com.google.android.finsky.q.c;
import java.util.HashMap;
import java.util.Map;

public final class com.google.android.finsky.billing.e.d extends com.android.volley.a.z
{

    public final Map t;

    d(String p0, String p1, String p2, com.android.volley.x p3, com.android.volley.w p4) {
        com.android.volley.a.z(p0, 0, p3, p4);
        this.t = new HashMap();
        com.google.android.finsky.q.c.a(this.t, p1, p2);
    }

    public final Map h() {
        return this.t;
    }

    public final com.android.volley.q n() {
        return com.android.volley.q.c;
    }

}
