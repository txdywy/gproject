package com.google.android.finsky.api;

import android.content.Context;
import android.net.NetworkInfo;
import android.os.SystemClock;
import com.android.volley.NoConnectionError;
import com.android.volley.VolleyError;
import com.android.volley.f;
import com.android.volley.m;
import com.android.volley.n;
import com.android.volley.r;
import com.android.volley.v;
import com.android.volley.w;
import com.android.volley.z;
import com.google.android.finsky.ba.c;
import com.google.android.finsky.ba.e;
import com.google.android.finsky.cg.c;
import com.google.android.finsky.d.j;
import com.google.android.finsky.utils.i;
import com.google.android.play.image.bf;
import com.google.android.play.image.bt;
import com.google.android.play.image.bu;
import com.google.android.play.image.by;
import com.google.android.play.image.m;
import com.google.android.play.image.o;
import com.google.android.play.image.q;
import com.google.android.play.utils.f;
import com.google.i.a.a;

public final class com.google.android.finsky.api.t extends com.google.android.play.image.bt implements com.google.android.finsky.api.b
{

    public long A;
    public final Context q;
    public final com.google.android.finsky.d.j r;
    public final com.google.android.finsky.ba.c s;
    public final com.google.android.finsky.cg.c t;
    public final NetworkInfo u;
    public final com.google.android.play.image.m v;
    public final long w;
    public long x;
    public int y;
    public long z;

    t(Context p0, com.google.android.finsky.d.j p1, com.google.android.finsky.ba.c p2, com.google.android.finsky.cg.c p3, com.google.android.play.image.m p4, com.android.volley.w p5, com.google.android.play.image.o p6, com.google.android.play.image.q p7, com.google.android.play.image.by p8, com.google.android.play.image.bu p9) {
        com.google.android.play.image.bt(p4, p5, p6, p7, p8, p9);
        this.z = -1;
        this.A = -1;
        this.q = p0;
        this.r = p1;
        this.s = p2;
        this.t = p3;
        this.v = p4;
        this.u = p3.a();
        this.w = SystemClock.elapsedRealtime();
    }

    private final void a(boolean p0, VolleyError p1, boolean p2) {
        if (this.r.a(p2, 1)) {
            if (this.m instanceof com.android.volley.f)
                v14 = ((com.android.volley.f)this.m).d;
            else
                v14 = 0;
            v22 = 0;
            if (p1 instanceof NoConnectionError)
                v22 = Boolean.valueOf(com.google.android.play.utils.f.b(this.q));
            v8 = -1;
            if (this.z > 0)
                v8 = com.google.android.finsky.utils.i.b() - this.z;
            this.r.a(this.d(), this.x, 0, v8, this.A, this.m.b() + 1, this.m.a(), v14, p0, p1, this.u, this.t.a(), this.y, p2, 0, v22, 0, 0);
        }
    }

    public final long a() {
        return this.x;
    }

    public final com.android.volley.n a(com.android.volley.r p0) {
        this.z = com.google.android.finsky.utils.i.b();
        return super.a(p0);
    }

    protected final com.android.volley.v a(com.android.volley.m p0) {
        this.x = p0.f;
        this.y = p0.b.length;
        this.A = com.google.android.finsky.utils.i.b() - com.google.android.finsky.utils.i.b();
        return super.a(p0);
    }

    protected final void a(Object p0) {
        this.a((byte[])p0);
    }

    protected final void a(byte[] p0) {
        super.a(p0);
        if (this.x <= 0)
            v0 = 1;
        else
            v0 = 0;
        this.a(1, 0, v0);
    }

    public final long b() {
        return SystemClock.elapsedRealtime() - this.w;
    }

    public final void c(VolleyError p0) {
        super.c(p0);
        this.x = p0.c;
        this.a(0, p0, 0);
    }

    public final String e() {
        if ((this.d().equals(this.v.a)) || (!this.s.dj().a(12630075)) || !com.google.i.a.a.a(this.v.a))
            v0 = super.e();
        else
            v0 = com.google.android.play.image.bf.a(this.v.a, this.v.d, this.v.e, -1);
        return v0;
    }

}
