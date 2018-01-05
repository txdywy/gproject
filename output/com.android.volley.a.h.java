package com.android.volley.a;

import android.os.Handler;
import android.os.Looper;
import com.android.volley.a;
import com.android.volley.m;
import com.android.volley.n;
import com.android.volley.q;
import com.android.volley.v;

public final class com.android.volley.a.h extends com.android.volley.n
{

    public final com.android.volley.a q;
    public final Runnable r;

    h(com.android.volley.a p0, Runnable p1) {
        com.android.volley.n(0, 0, 0);
        this.q = p0;
        this.r = p1;
    }

    protected final com.android.volley.v a(com.android.volley.m p0) {
        return 0;
    }

    protected final void a(Object p0) {
    }

    public final boolean g() {
        this.q.b();
        if (this.r != 0)
            new Handler(Looper.getMainLooper()).postAtFrontOfQueue(this.r);
        return 1;
    }

    public final com.android.volley.q n() {
        return com.android.volley.q.d;
    }

}
