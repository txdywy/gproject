package com.android.volley;

import android.os.Handler;
import java.util.concurrent.Executor;

public final class com.android.volley.g implements com.android.volley.y
{

    public final Executor a;

    g(Handler p0) {
        this.a = new com.android.volley.h(p0);
    }

    public final void a(com.android.volley.n p0, VolleyError p1) {
        p0.a("post-error");
        this.a.execute(new com.android.volley.i(p0, com.android.volley.v.a(p1), 0));
    }

    public final void a(com.android.volley.n p0, com.android.volley.v p1) {
        this.a(p0, p1, 0);
    }

    public final void a(com.android.volley.n p0, com.android.volley.v p1, Runnable p2) {
        p0.p();
        p0.a("post-response");
        this.a.execute(new com.android.volley.i(p0, p1, p2));
    }

}
