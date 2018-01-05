package com.google.android.wallet.common.p367c.p368a;

import android.os.SystemClock;
import com.android.volley.VolleyError;
import com.android.volley.n;
import com.android.volley.w;
import com.android.volley.x;

public abstract class C6517c extends n {
    public final x f32580q;
    public final long f32581r = SystemClock.elapsedRealtime();
    public long f32582s;

    public C6517c(String str, x xVar, w wVar) {
        super(1, str, wVar);
        this.f32580q = xVar;
    }

    public abstract int mo5463s();

    public abstract int mo5464t();

    public final void m29570a(Object obj) {
        this.f32582s = SystemClock.elapsedRealtime();
        this.f32580q.b_(obj);
    }

    public final void m29572c(VolleyError volleyError) {
        this.f32582s = SystemClock.elapsedRealtime();
        super.c(volleyError);
    }

    public final long m29569a() {
        return this.f32582s - this.f32581r;
    }

    public int mo5462b() {
        return 0;
    }
}
