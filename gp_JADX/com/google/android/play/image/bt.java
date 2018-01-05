package com.google.android.play.image;

import com.android.volley.ParseError;
import com.android.volley.f;
import com.android.volley.m;
import com.android.volley.n;
import com.android.volley.q;
import com.android.volley.v;
import com.android.volley.w;
import com.android.volley.x;

public class bt extends n {
    public static final f f32072B = new f(1000, 2, 2.0f);
    public final by f32073C;
    public boolean f32074D;
    public x f32075E;
    public C6376o f32076F;
    public q f32077G;
    public bu f32078H;
    public final Object f32079e;
    public final C6375m f32080v;

    public bt(C6375m c6375m, w wVar, C6376o c6376o, q qVar, by byVar, bu buVar) {
        super(0, c6375m.f32113b, wVar);
        this.f32079e = new Object();
        this.m = f32072B;
        this.f32075E = null;
        this.f32076F = c6376o;
        this.f32077G = qVar;
        this.f32080v = c6375m;
        this.f32073C = byVar;
        this.f32078H = buVar;
    }

    public final q m29273n() {
        return q.a;
    }

    public v m29269a(m mVar) {
        Object obj = mVar.b;
        if (obj == null) {
            return v.a(new ParseError());
        }
        synchronized (this.f32079e) {
            if (!this.f32074D) {
                Runnable c6378r = new C6378r(obj, this.f32080v, this.f32077G, this.f32073C);
                if (this.f32078H != null) {
                    this.f32078H.f32083c = c6378r;
                }
                C6376o c6376o = this.f32076F;
                if (c6378r.m29293a(c6376o)) {
                    c6376o.f32120a.execute(c6378r);
                }
            }
        }
        return v.a(obj, com.android.volley.a.n.a(mVar));
    }

    public final void m29272f() {
        super.f();
        synchronized (this.f32079e) {
            this.f32074D = true;
        }
        m29268a();
    }

    public void m29271a(byte[] bArr) {
        synchronized (this.f32079e) {
            x xVar = this.f32075E;
        }
        if (xVar != null) {
            xVar.b_(bArr);
        }
        m29268a();
    }

    private final void m29268a() {
        synchronized (this.f32079e) {
            this.f32075E = null;
            this.f32076F = null;
            this.f32077G = null;
            this.f32078H = null;
        }
    }
}
