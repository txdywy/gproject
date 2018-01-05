package com.android.volley.a;

import android.os.Handler;
import android.os.Looper;
import com.android.volley.r;
import java.util.HashMap;

final class com.android.volley.a.q
{

    public final com.android.volley.r a;
    public int b;
    public final com.android.volley.a.v c;
    public final HashMap d;
    public final HashMap e;
    public final Handler f;
    public Runnable g;

    q(com.android.volley.r p0, com.android.volley.a.v p1) {
        this.b = 100;
        this.d = new HashMap();
        this.e = new HashMap();
        this.f = new Handler(Looper.getMainLooper());
        this.a = p0;
        this.c = p1;
    }

    final void a(String p0, com.android.volley.a.u p1) {
        this.e.put(p0, p1);
        if (this.g == 0) {
            this.g = new com.android.volley.a.t(this);
            this.f.postDelayed(this.g, (long)this.b);
        }
    }

}
