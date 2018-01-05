package com.google.android.finsky.api;

import android.net.NetworkInfo;
import com.android.volley.NoConnectionError;
import com.android.volley.VolleyError;
import com.android.volley.f;
import com.android.volley.m;
import com.android.volley.n;
import com.android.volley.r;
import com.android.volley.v;
import com.android.volley.w;
import com.android.volley.x;
import com.android.volley.z;
import com.google.android.finsky.cg.c;
import com.google.android.finsky.d.j;
import com.google.android.finsky.m;
import com.google.android.finsky.utils.i;
import com.google.android.play.image.ao;
import com.google.android.play.image.ap;
import com.google.android.play.utils.f;

public final class com.google.android.finsky.api.s extends com.google.android.play.image.ap
{

    public com.google.android.finsky.d.j q;
    public com.google.android.finsky.cg.c r;
    public long s;
    public NetworkInfo t;
    public int u;
    public long v;
    public long w;

    s(com.google.android.finsky.d.j p0, com.google.android.finsky.cg.c p1, String p2, com.android.volley.x p3, int p4, int p5, int p6, com.android.volley.w p7) {
        com.google.android.play.image.ap(p2, p3, p4, p5, p6, p7);
        this.v = -1;
        this.w = -1;
        this.q = p0;
        this.r = p1;
        this.t = p1.a();
    }

    private final void a(boolean p0, VolleyError p1, boolean p2) {
        if (this.q.a(p2, 1)) {
            if (this.m instanceof com.android.volley.f)
                v14 = ((com.android.volley.f)this.m).d;
            else
                v14 = 0;
            v22 = 0;
            if (p1 instanceof NoConnectionError)
                v22 = Boolean.valueOf(com.google.android.play.utils.f.b(com.google.android.finsky.m.a.b));
            v8 = -1;
            if (this.v > 0)
                v8 = com.google.android.finsky.utils.i.b() - this.v;
            this.q.a(this.d(), this.s, 0, v8, this.w, this.m.b() + 1, this.m.a(), v14, p0, p1, this.t, this.r.a(), this.u, p2, 0, v22, 0, 0);
        }
    }

    public final com.android.volley.n a(com.android.volley.r p0) {
        this.v = com.google.android.finsky.utils.i.b();
        return super.a(p0);
    }

    protected final com.android.volley.v a(com.android.volley.m p0) {
        this.s = p0.f;
        this.u = p0.b.length;
        this.w = com.google.android.finsky.utils.i.b() - com.google.android.finsky.utils.i.b();
        return super.a(p0);
    }

    protected final void a(com.google.android.play.image.ao p0) {
        super.a(p0);
        if (this.s <= 0)
            v0 = 1;
        else
            v0 = 0;
        this.a(1, 0, v0);
    }

    protected final void a(Object p0) {
        this.a((com.google.android.play.image.ao)p0);
    }

    public final void c(VolleyError p0) {
        super.c(p0);
        this.s = p0.c;
        this.a(0, p0, 0);
    }

}
