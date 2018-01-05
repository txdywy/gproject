package com.google.android.finsky.api;

import android.graphics.Bitmap;
import android.net.NetworkInfo;
import android.os.SystemClock;
import com.android.volley.NoConnectionError;
import com.android.volley.VolleyError;
import com.android.volley.a.y;
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
import com.google.android.play.image.m;
import com.google.android.play.utils.f;

public final class com.google.android.finsky.api.u extends com.google.android.finsky.api.q implements com.google.android.finsky.api.b
{

    public final com.google.android.finsky.cg.c A;
    public final NetworkInfo B;
    public final long C;
    public long D;
    public long E;
    public long F;
    public int G;
    public final com.google.android.finsky.d.j z;

    u(com.google.android.finsky.d.j p0, com.google.android.finsky.cg.c p1, com.google.android.play.image.m p2, com.android.volley.x p3, com.android.volley.w p4) {
        com.google.android.finsky.api.q(p2, p3, p4);
        this.D = -1;
        this.E = -1;
        this.z = p0;
        this.A = p1;
        this.B = p1.a();
        this.C = SystemClock.elapsedRealtime();
    }

    private final void a(boolean p0, VolleyError p1, boolean p2) {
        if (com.google.android.finsky.m.a.dc().a(p2, 1)) {
            if (this.m instanceof com.android.volley.f)
                v14 = ((com.android.volley.f)this.m).d;
            else
                v14 = 0;
            v22 = 0;
            if (p1 instanceof NoConnectionError)
                v22 = Boolean.valueOf(com.google.android.play.utils.f.b(com.google.android.finsky.m.a.b));
            v8 = -1;
            if (this.D > 0)
                v8 = com.google.android.finsky.utils.i.b() - this.D;
            this.z.a(this.d(), this.F, 0, v8, this.E, this.m.b() + 1, this.m.a(), v14, p0, p1, this.B, this.A.a(), this.G, p2, 0, v22, 0, 0);
        }
    }

    public final long a() {
        return this.F;
    }

    public final com.android.volley.n a(com.android.volley.r p0) {
        this.D = com.google.android.finsky.utils.i.b();
        return super.a(p0);
    }

    protected final com.android.volley.v a(com.android.volley.m p0) {
        this.F = p0.f;
        this.G = p0.b.length;
        this.E = com.google.android.finsky.utils.i.b() - com.google.android.finsky.utils.i.b();
        return super.a(p0);
    }

    protected final void a(Bitmap p0) {
        super.a(p0);
        if (this.F <= 0)
            v0 = 1;
        else
            v0 = 0;
        this.a(1, 0, v0);
    }

    protected final void a(Object p0) {
        this.a((Bitmap)p0);
    }

    public final long b() {
        return SystemClock.elapsedRealtime() - this.C;
    }

    public final void c(VolleyError p0) {
        super.c(p0);
        this.F = p0.c;
        this.a(0, p0, 0);
    }

}
