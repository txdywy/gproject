package com.google.android.finsky.ca;

import com.android.volley.VolleyError;
import com.google.android.finsky.foregroundcoordinator.ForegroundCoordinator;

public final class com.google.android.finsky.ca.g implements com.android.volley.w
{

    public final String a;
    public final Runnable b;
    public final com.google.android.finsky.ca.c c;

    g(com.google.android.finsky.ca.c p0, String p1, Runnable p2) {
        this.c = p0;
        this.a = p1;
        this.b = p2;
    }

    public final void a(VolleyError p0) {
        com.google.android.finsky.ca.c.a(this.c, this.a, 1, p0);
        ForegroundCoordinator.a(this.c.i);
        if (this.b != 0)
            this.b.run();
    }

}
