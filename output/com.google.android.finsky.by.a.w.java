package com.google.android.finsky.by.a;

import android.os.Handler;
import com.android.volley.VolleyError;
import com.google.android.finsky.by.h;
import com.google.android.finsky.utils.FinskyLog;
import com.google.wireless.android.finsky.dfe.nano.cv;
import java.util.HashMap;
import java.util.Map;

public final class com.google.android.finsky.by.a.w implements com.android.volley.w, com.android.volley.x
{

    public final Map a;
    public final com.google.android.finsky.by.a.r b;

    w(com.google.android.finsky.by.a.r p0) {
        this.b = p0;
        this.a = new HashMap();
        v0 = 0;
        while (v0 < com.google.android.finsky.by.h.g.length) {
            this.a.put(com.google.android.finsky.by.h.g[v0], p0.g.f(com.google.android.finsky.by.h.g[v0]));
            v0 = v0 + 1;
        }
    }

    public final void a(VolleyError p0) {
        v1 = new Object[1];
        v1[0] = p0;
        FinskyLog.c("Library replication failed: %s", v1);
        if (this.b.k != 0)
            com.google.android.finsky.by.a.r.a(this.b, 3, p0, 0);
        this.b.e.post(new com.google.android.finsky.by.a.y(this));
    }

    public final void b_(Object p0) {
        this.b.e.post(new com.google.android.finsky.by.a.x(this, (com.google.wireless.android.finsky.dfe.nano.cv)p0));
    }

}
